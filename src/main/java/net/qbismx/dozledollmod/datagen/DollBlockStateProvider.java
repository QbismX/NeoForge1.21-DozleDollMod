package net.qbismx.dozledollmod.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
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
        ModelFile bonjour_halloween = models().withExistingParent("bonjour_halloween", basis).texture("skin", modLoc("block/bonjour/bonjour_halloween"));
        ModelFile bonjour_ojosama = models().withExistingParent("bonjour_ojosama", basis).texture("skin", modLoc("block/bonjour/bonjour_ojosama"));

        // おんりーさん -------------------------------------------------------------------------------------
        ModelFile qnly_normal = models().withExistingParent("qnly_normal", basis).texture("skin", modLoc("block/qnly/qnly"));
        ModelFile qnly_bonjour = models().withExistingParent("qnly_bonjour", basis).texture("skin", modLoc("block/qnly/qnly_bonjour"));
        ModelFile qnly_guard = models().withExistingParent("qnly_guard", basis).texture("skin", modLoc("block/qnly/qnly_guard"));
        ModelFile qnly_japan = models().withExistingParent("qnly_japan", basis).texture("skin", modLoc("block/qnly/qnly_japan"));
        ModelFile qnly_ojosama = models().withExistingParent("qnly_ojosama", basis).texture("skin", modLoc("block/qnly/qnly_ojosama"));
        ModelFile qnly_previous = models().withExistingParent("qnly_previous", basis).texture("skin", modLoc("block/qnly/qnly_previous"));
        ModelFile qnly_rpg = models().withExistingParent("qnly_rpg", basis).texture("skin", modLoc("block/qnly/qnly_rpg"));
        ModelFile qnly_santa = models().withExistingParent("qnly_santa", basis).texture("skin", modLoc("block/qnly/qnly_santa"));
        ModelFile qnly_student = models().withExistingParent("qnly_student", basis).texture("skin", modLoc("block/qnly/qnly_student"));
        ModelFile qnly_suit = models().withExistingParent("qnly_suit", basis).texture("skin", modLoc("block/qnly/qnly_suit"));

        // おらふくん -------------------------------------------------------------------------------------
        ModelFile orafkun_normal = models().withExistingParent("orafkun_normal", basis).texture("skin", modLoc("block/orafkun/orafkun"));
        ModelFile orafkun_japan = models().withExistingParent("orafkun_japan", basis).texture("skin", modLoc("block/orafkun/orafkun_japan"));
        ModelFile orafkun_ojosama = models().withExistingParent("orafkun_ojosama", basis).texture("skin", modLoc("block/orafkun/orafkun_ojosama"));
        ModelFile orafkun_orakochan = models().withExistingParent("orafkun_orakochan", basis).texture("skin", modLoc("block/orafkun/orafkun_orakochan"));
        ModelFile orafkun_orakohime = models().withExistingParent("orafkun_orakohime", basis).texture("skin", modLoc("block/orafkun/orafkun_orakohime"));
        ModelFile orafkun_oralish = models().withExistingParent("orafkun_oralish", basis).texture("skin", modLoc("block/orafkun/orafkun_oralish"));
        ModelFile orafkun_samurai = models().withExistingParent("orafkun_samurai", basis).texture("skin", modLoc("block/orafkun/orafkun_samurai"));
        ModelFile orafkun_student = models().withExistingParent("orafkun_student", basis).texture("skin", modLoc("block/orafkun/orafkun_student"));
        ModelFile orafkun_suit = models().withExistingParent("orafkun_suit", basis).texture("skin", modLoc("block/orafkun/orafkun_suit"));
        ModelFile orafkun_toy = models().withExistingParent("orafkun_toy", basis).texture("skin", modLoc("block/orafkun/orafkun_toy"));

        // おおはらMENさん -------------------------------------------------------------------------------------
        ModelFile ooharamen_normal = models().withExistingParent("ooharamen_normal", basis).texture("skin", modLoc("block/ooharamen/ooharamen"));
        ModelFile ooharamen_deka = models().withExistingParent("ooharamen_deka", basis).texture("skin", modLoc("block/ooharamen/ooharamen_deka"));
        ModelFile ooharamen_ojosama = models().withExistingParent("ooharamen_ojosama", basis).texture("skin", modLoc("block/ooharamen/ooharamen_ojosama"));
        ModelFile ooharamen_old = models().withExistingParent("ooharamen_old", basis).texture("skin", modLoc("block/ooharamen/ooharamen_old"));
        ModelFile ooharamen_piglin = models().withExistingParent("ooharamen_piglin", basis).texture("skin", modLoc("block/ooharamen/ooharamen_piglin"));
        ModelFile ooharamen_previous = models().withExistingParent("ooharamen_previous", basis).texture("skin", modLoc("block/ooharamen/ooharamen_previous"));
        ModelFile ooharamen_student = models().withExistingParent("ooharamen_student", basis).texture("skin", modLoc("block/ooharamen/ooharamen_student"));
        ModelFile ooharamen_tnt = models().withExistingParent("ooharamen_tnt", basis).texture("skin", modLoc("block/ooharamen/ooharamen_tnt"));
        ModelFile ooharamen_zuru = models().withExistingParent("ooharamen_zuru", basis).texture("skin", modLoc("block/ooharamen/ooharamen_zuru"));
        ModelFile ooharamen_girl = models().withExistingParent("ooharamen_girl", basis).texture("skin", modLoc("block/ooharamen/ooharamen_girl"));

        // ねこおじさん -------------------------------------------------------------------------------------
        ModelFile nekooji_normal = models().withExistingParent("nekooji_normal", basis).texture("skin", modLoc("block/nekooji/nekooji"));
        ModelFile nekooji_deka = models().withExistingParent("nekooji_deka", basis).texture("skin", modLoc("block/nekooji/nekooji_deka"));
        ModelFile nekooji_doctor = models().withExistingParent("nekooji_doctor", basis).texture("skin", modLoc("block/nekooji/nekooji_doctor"));
        ModelFile nekooji_old = models().withExistingParent("nekooji_old", basis).texture("skin", modLoc("block/nekooji/nekooji_old"));
        ModelFile nekooji_rich = models().withExistingParent("nekooji_rich", basis).texture("skin", modLoc("block/nekooji/nekooji_rich"));
        ModelFile nekooji_suit = models().withExistingParent("nekooji_suit", basis).texture("skin", modLoc("block/nekooji/nekooji_suit"));
        ModelFile nekooji_tono = models().withExistingParent("nekooji_tono", basis).texture("skin", modLoc("block/nekooji/nekooji_tono"));


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
        generateBlockstate(ModBlocks.BONJOUR_HALLOWEEN_BLOCK.get(), bonjour_halloween);
        generateBlockstate(ModBlocks.BONJOUR_OJOSAMA_BLOCK.get(), bonjour_ojosama);

        // おんりーさん　---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.QNLY_NORMAL_BLOCK.get(), qnly_normal);
        generateBlockstate(ModBlocks.QNLY_BONJOUR_BLOCK.get(),qnly_bonjour);
        generateBlockstate(ModBlocks.QNLY_GUARD_BLOCK.get(),qnly_guard);
        generateBlockstate(ModBlocks.QNLY_JAPAN_BLOCK.get(),qnly_japan);
        generateBlockstate(ModBlocks.QNLY_OJOSAMA_BLOCK.get(),qnly_ojosama);
        generateBlockstate(ModBlocks.QNLY_RPG_BLOCK.get(),qnly_rpg);
        generateBlockstate(ModBlocks.QNLY_PREVIOUS_BLOCK.get(),qnly_previous);
        generateBlockstate(ModBlocks.QNLY_SANTA_BLOCK.get(), qnly_santa);
        generateBlockstate(ModBlocks.QNLY_SUIT_BLOCK.get(),qnly_suit);
        generateBlockstate(ModBlocks.QNLY_STUDENT_BLOCK.get(),qnly_student);

        // おらふくん ---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.ORAFKUN_NORMAL_BLOCK.get(), orafkun_normal);
        generateBlockstate(ModBlocks.ORAFKUN_JAPAN_BLOCK.get(), orafkun_japan);
        generateBlockstate(ModBlocks.ORAFKUN_OJOSAMA_BLOCK.get(), orafkun_ojosama);
        generateBlockstate(ModBlocks.ORAFKUN_ORAKOCHAN_BLOCK.get(), orafkun_orakochan);
        generateBlockstate(ModBlocks.ORAFKUN_ORAKOHIME_BLOCK.get(), orafkun_orakohime);
        generateBlockstate(ModBlocks.ORAFKUN_ORALISH_BLOCK.get(), orafkun_oralish);
        generateBlockstate(ModBlocks.ORAFKUN_SAMURAI_BLOCK.get(), orafkun_samurai);
        generateBlockstate(ModBlocks.ORAFKUN_STUDENT_BLOCK.get(), orafkun_student);
        generateBlockstate(ModBlocks.ORAFKUN_TOY_BLOCK.get(), orafkun_toy);
        generateBlockstate(ModBlocks.ORAFKUN_SUIT_BLOCK.get(), orafkun_suit);

        // おおはらMENさん　---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.OOHARAMEN_NORMAL_BLOCK.get(), ooharamen_normal);
        generateBlockstate(ModBlocks.OOHARAMEN_DEKA_BLOCK.get(), ooharamen_deka);
        generateBlockstate(ModBlocks.OOHARAMEN_GIRL_BLOCK.get(), ooharamen_girl);
        generateBlockstate(ModBlocks.OOHARAMEN_OJOSAMA_BLOCK.get(), ooharamen_ojosama);
        generateBlockstate(ModBlocks.OOHARAMEN_PIGLIN_BLOCK.get(), ooharamen_piglin);
        generateBlockstate(ModBlocks.OOHARAMEN_OLD_BLOCK.get(), ooharamen_old);
        generateBlockstate(ModBlocks.OOHARAMEN_PREVIOUS_BLOCK.get(), ooharamen_previous);
        generateBlockstate(ModBlocks.OOHARAMEN_STUDENT_BLOCK.get(), ooharamen_student);
        generateBlockstate(ModBlocks.OOHARAMEN_TNT_BLOCK.get(), ooharamen_tnt);
        generateBlockstate(ModBlocks.OOHARAMEN_ZURU_BLOCK.get(), ooharamen_zuru);

        // ねこおじさん ---------------------------------------------------------------------------------------
        generateBlockstate(ModBlocks.NEKOOJI_NORMAL_BLOCK.get(), nekooji_normal);
        generateBlockstate(ModBlocks.NEKOOJI_DEKA_BLOCK.get(), nekooji_deka);
        generateBlockstate(ModBlocks.NEKOOJI_DOCTOR_BLOCK.get(), nekooji_doctor);
        generateBlockstate(ModBlocks.NEKOOJI_OLD_BLOCK.get(), nekooji_old);
        generateBlockstate(ModBlocks.NEKOOJI_RICH_BLOCK.get(), nekooji_rich);
        generateBlockstate(ModBlocks.NEKOOJI_SUIT_BLOCK.get(), nekooji_suit);
        generateBlockstate(ModBlocks.NEKOOJI_TONO_BLOCK.get(), nekooji_tono);

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
