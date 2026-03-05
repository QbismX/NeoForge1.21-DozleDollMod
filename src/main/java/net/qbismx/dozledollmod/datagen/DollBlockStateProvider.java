package net.qbismx.dozledollmod.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.qbismx.dozledollmod.block.ModBlocks;
import net.qbismx.dozledollmod.block.custom.DollMainBlock;

public class DollBlockStateProvider extends BlockStateProvider {

    public DollBlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // モデル生成 ==========================================================================================
        ResourceLocation basis = modLoc("block/doll"); // このjsonファイルはdatagenで自動生成せずに書いた。

        // ドズルさん ------------------------------------------------------------------------------------------
        ModelFile dozle_normal = models().withExistingParent("dozle_normal", basis);

        // ぼんじゅうるさん -------------------------------------------------------------------------------------
        ModelFile bonjour_normal = models().withExistingParent("bonjour_normal", basis)
                .texture("skin", modLoc("block/bonjour/bonjour"))
                .texture("particle", modLoc("block/bonjour/bonjour"));

        // ここから先はBlockstates生成 ===========================================================================
        // ドズルさん
        generateBlockstate(ModBlocks.DOZLE_NORMAL_BLOCK.get(), dozle_normal);

        //ぼんじゅうるさん ---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.BONJOUR_NORMAL_BLOCK.get(), bonjour_normal);

    }

    private void generateBlockstate(Block block, ModelFile model) {

        getVariantBuilder(block)
                .forAllStates(state -> {

                    Direction direction = state.getValue(DollMainBlock.FACING);

                    int yRot = switch (direction) {
                        case SOUTH -> 0;
                        case WEST  -> 90;
                        case EAST  -> 270;
                        default    -> 180;
                    };

                    return ConfiguredModel.builder()
                            .modelFile(model)
                            .rotationY(yRot)
                            .build();
                });
    }

}
