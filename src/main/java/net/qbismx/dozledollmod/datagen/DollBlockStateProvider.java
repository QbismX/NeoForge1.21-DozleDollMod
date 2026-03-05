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
        ModelFile dozle_cold = models().withExistingParent("dozle_cold", basis).texture("skin", modLoc("block/dozle/dozle_cold"));
        ModelFile dozle_girl = models().withExistingParent("dozle_girl", basis).texture("skin", modLoc("block/dozle/dozle_girl"));
        ModelFile dozle_gorilla = models().withExistingParent("dozle_gorilla", basis).texture("skin", modLoc("block/dozle/dozle_gorilla"));
        ModelFile dozle_kami = models().withExistingParent("dozle_kami", basis).texture("skin", modLoc("block/dozle/dozle_kami"));
        ModelFile dozle_muscle = models().withExistingParent("dozle_muscle", basis).texture("skin", modLoc("block/dozle/dozle_muscle"));
        ModelFile dozle_student = models().withExistingParent("dozle_student", basis).texture("skin", modLoc("block/dozle/dozle_student"));
        ModelFile dozle_suit = models().withExistingParent("dozle_suit", basis).texture("skin", modLoc("block/dozle/dozle_suit"));
        ModelFile dozle_wild = models().withExistingParent("dozle_wild", basis).texture("skin", modLoc("block/dozle/dozle_wild"));
        ModelFile dozle_japan = models().withExistingParent("dozle_japan", basis).texture("skin", modLoc("block/dozle/dozle_japan"));

        // ぼんじゅうるさん -------------------------------------------------------------------------------------
        ModelFile bonjour_normal = models().withExistingParent("bonjour_normal", basis).texture("skin", modLoc("block/bonjour/bonjour"));
        ModelFile bonjour_hoiku = models().withExistingParent("bonjour_hoiku", basis).texture("skin", modLoc("block/bonjour/bonjour_hoiku"));
        ModelFile bonjour_japan = models().withExistingParent("bonjour_japan", basis).texture("skin", modLoc("block/bonjour/bonjour_japan"));
        ModelFile bonjour_momotaro = models().withExistingParent("bonjour_momotaro", basis).texture("skin", modLoc("block/bonjour/bonjour_momotaro"));
        ModelFile bonjour_rpg = models().withExistingParent("bonjour_rpg", basis).texture("skin", modLoc("block/bonjour/bonjour_rpg"));
        ModelFile bonjour_student = models().withExistingParent("bonjour_student", basis).texture("skin", modLoc("block/bonjour/bonjour_student"));
        ModelFile bonjour_suit = models().withExistingParent("bonjour_suit", basis).texture("skin", modLoc("block/bonjour/bonjour_suit"));
        ModelFile bonjour_tantei = models().withExistingParent("bonjour_tantei", basis).texture("skin", modLoc("block/bonjour/bonjour_tantei"));

        // おんりーさん -------------------------------------------------------------------------------------
        ModelFile qnly_normal = models().withExistingParent("qnly_normal", basis)
                .texture("skin", modLoc("block/qnly/qnly"));

        // おらふくん -------------------------------------------------------------------------------------
        ModelFile orafkun_normal = models().withExistingParent("orafkun_normal", basis)
                .texture("skin", modLoc("block/orafkun/orafkun"));

        // おおはらMENさん -------------------------------------------------------------------------------------
        ModelFile ooharamen_normal = models().withExistingParent("ooharamen_normal", basis)
                .texture("skin", modLoc("block/ooharamen/ooharamen"));

        // ねこおじさん -------------------------------------------------------------------------------------
        ModelFile nekooji_normal = models().withExistingParent("nekooji_normal", basis)
                .texture("skin", modLoc("block/nekooji/nekooji"));


        // ここから先はBlockstates生成 ===========================================================================
        // ドズルさん
        generateBlockstate(ModBlocks.DOZLE_NORMAL_BLOCK.get(), dozle_normal);
        generateBlockstate(ModBlocks.DOZLE_COLD_BLOCK.get(), dozle_cold);
        generateBlockstate(ModBlocks.DOZLE_GIRL_BLOCK.get(), dozle_girl);
        generateBlockstate(ModBlocks.DOZLE_GORILLA_BLOCK.get(), dozle_gorilla);
        generateBlockstate(ModBlocks.DOZLE_KAMI_BLOCK.get(), dozle_kami);
        generateBlockstate(ModBlocks.DOZLE_MUSCLE_BLOCK.get(), dozle_muscle);
        generateBlockstate(ModBlocks.DOZLE_STUDENT_BLOCK.get(), dozle_student);
        generateBlockstate(ModBlocks.DOZLE_SUIT_BLOCK.get(), dozle_suit);
        generateBlockstate(ModBlocks.DOZLE_WILD_BLOCK.get(), dozle_wild);
        generateBlockstate(ModBlocks.DOZLE_JAPAN_BLOCK.get(), dozle_japan);


        //ぼんじゅうるさん ---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.BONJOUR_NORMAL_BLOCK.get(), bonjour_normal);
        generateBlockstate(ModBlocks.BONJOUR_HOIKU_BLOCK.get(), bonjour_hoiku);
        generateBlockstate(ModBlocks.BONJOUR_JAPAN_BLOCK.get(), bonjour_japan);
        generateBlockstate(ModBlocks.BONJOUR_MOMOTARO_BLOCK.get(), bonjour_momotaro);
        generateBlockstate(ModBlocks.BONJOUR_RPG_BLOCK.get(), bonjour_rpg);
        generateBlockstate(ModBlocks.BONJOUR_STUDENT_BLOCK.get(), bonjour_student);
        generateBlockstate(ModBlocks.BONJOUR_SUIT_BLOCK.get(), bonjour_suit);
        generateBlockstate(ModBlocks.BONJOUR_TANTEI_BLOCK.get(), bonjour_tantei);

        // おんりーさん　---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.QNLY_NORMAL_BLOCK.get(), qnly_normal);

        // おらふくん ---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.ORAFKUN_NORMAL_BLOCK.get(), orafkun_normal);

        // おおはらMENさん　---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.OOHARAMEN_NORMAL_BLOCK.get(), ooharamen_normal);

        // ねこおじさん ---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.NEKOOJI_NORMAL_BLOCK.get(), nekooji_normal);

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
