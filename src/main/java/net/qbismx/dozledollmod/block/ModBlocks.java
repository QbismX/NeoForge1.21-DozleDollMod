package net.qbismx.dozledollmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.qbismx.dozledollmod.DozleDollMod;
import net.qbismx.dozledollmod.block.custom.DollMainBlock;
import net.qbismx.dozledollmod.block.custom.DollUpperBlock;
import net.qbismx.dozledollmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    // ゲームに認知させたいModのブロック全体用の登録箱
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DozleDollMod.MODID);

    public static final BlockBehaviour.Properties PROPERTIES =
            BlockBehaviour.Properties.of() // ブロックの性質を設定
                    .strength(0.2f, 3600000.0f)    // ブロックを壊すときの硬さ
                    .sound(SoundType.METAL) // 音の設定：金属
                    .pushReaction(PushReaction.BLOCK) // ピストンでは押せない
                    .lightLevel(x -> 15)
                    .noOcclusion();

    // 共通の上半身部分をここで登録する。
    public static final DeferredBlock<DollUpperBlock> DOLL_UPPER_BLOCK = registerBlock("doll_upper",
            ()-> new DollUpperBlock(PROPERTIES));


    // ドズルさん (Dooozle)--------------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> DOZLE_NORMAL_BLOCK = ModBlocks.registerBlock("dozle_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_COLD_BLOCK = ModBlocks.registerBlock("dozle_cold",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_GIRL_BLOCK = ModBlocks.registerBlock("dozle_girl",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_GORILLA_BLOCK = ModBlocks.registerBlock("dozle_gorilla",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_KAMI_BLOCK = ModBlocks.registerBlock("dozle_kami",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_MUSCLE_BLOCK = ModBlocks.registerBlock("dozle_muscle",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_STUDENT_BLOCK = ModBlocks.registerBlock("dozle_student",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_SUIT_BLOCK = ModBlocks.registerBlock("dozle_suit",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_WILD_BLOCK = ModBlocks.registerBlock("dozle_wild",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> DOZLE_JAPAN_BLOCK = ModBlocks.registerBlock("dozle_japan",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));

    //　ぼんじゅうるさん (bonj55)-------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> BONJOUR_NORMAL_BLOCK = ModBlocks.registerBlock("bonjour_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_HOIKU_BLOCK = ModBlocks.registerBlock("bonjour_hoiku",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_JAPAN_BLOCK = ModBlocks.registerBlock("bonjour_japan",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_MOMOTARO_BLOCK = ModBlocks.registerBlock("bonjour_momotaro",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_RPG_BLOCK = ModBlocks.registerBlock("bonjour_rpg",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_STUDENT_BLOCK = ModBlocks.registerBlock("bonjour_student",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_SUIT_BLOCK = ModBlocks.registerBlock("bonjour_suit",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_TANTEI_BLOCK = ModBlocks.registerBlock("bonjour_tantei",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_HALLOWEEN_BLOCK = ModBlocks.registerBlock("bonjour_halloween",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> BONJOUR_OJOSAMA_BLOCK = ModBlocks.registerBlock("bonjour_ojosama",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));


    //　おんりーさん (Qnly_qdm) -------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> QNLY_NORMAL_BLOCK = ModBlocks.registerBlock("qnly_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_BONJOUR_BLOCK = ModBlocks.registerBlock("qnly_bonjour",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_GUARD_BLOCK = ModBlocks.registerBlock("qnly_guard",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_JAPAN_BLOCK = ModBlocks.registerBlock("qnly_japan",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_OJOSAMA_BLOCK = ModBlocks.registerBlock("qnly_ojosama",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_PREVIOUS_BLOCK = ModBlocks.registerBlock("qnly_previous",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_RPG_BLOCK = ModBlocks.registerBlock("qnly_rpg",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_SANTA_BLOCK = ModBlocks.registerBlock("qnly_santa",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_STUDENT_BLOCK = ModBlocks.registerBlock("qnly_student",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> QNLY_SUIT_BLOCK = ModBlocks.registerBlock("qnly_suit",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));

    //　おらふくん (Oramainecraf) -------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> ORAFKUN_NORMAL_BLOCK = ModBlocks.registerBlock("orafkun_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_JAPAN_BLOCK = ModBlocks.registerBlock("orafkun_japan",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_OJOSAMA_BLOCK = ModBlocks.registerBlock("orafkun_ojosama",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_ORAKOCHAN_BLOCK = ModBlocks.registerBlock("orafkun_orakochan",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_ORAKOHIME_BLOCK = ModBlocks.registerBlock("orafkun_orakohime",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_ORALISH_BLOCK = ModBlocks.registerBlock("orafkun_oralish",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_SAMURAI_BLOCK = ModBlocks.registerBlock("orafkun_samurai",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_STUDENT_BLOCK = ModBlocks.registerBlock("orafkun_student",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_SUIT_BLOCK = ModBlocks.registerBlock("orafkun_suit",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> ORAFKUN_TOY_BLOCK = ModBlocks.registerBlock("orafkun_toy",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));


    //　おおはらMENさん (ooharaMEN) -------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_NORMAL_BLOCK = ModBlocks.registerBlock("ooharamen_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_DEKA_BLOCK = ModBlocks.registerBlock("ooharamen_deka",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_OJOSAMA_BLOCK = ModBlocks.registerBlock("ooharamen_ojosama",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_OLD_BLOCK = ModBlocks.registerBlock("ooharamen_old",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_PIGLIN_BLOCK = ModBlocks.registerBlock("ooharamen_piglin",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_PREVIOUS_BLOCK = ModBlocks.registerBlock("ooharamen_previous",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_STUDENT_BLOCK = ModBlocks.registerBlock("ooharamen_student",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_TNT_BLOCK = ModBlocks.registerBlock("ooharamen_tnt",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_ZURU_BLOCK = ModBlocks.registerBlock("ooharamen_zuru",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> OOHARAMEN_GIRL_BLOCK = ModBlocks.registerBlock("ooharamen_girl",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));

    //　ねこおじさん(Neko_Oji) -------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> NEKOOJI_NORMAL_BLOCK = ModBlocks.registerBlock("nekooji_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_DEKA_BLOCK = ModBlocks.registerBlock("nekooji_deka",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_DOCTOR_BLOCK = ModBlocks.registerBlock("nekooji_doctor",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_OLD_BLOCK = ModBlocks.registerBlock("nekooji_old",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_RICH_BLOCK = ModBlocks.registerBlock("nekooji_rich",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_SUIT_BLOCK = ModBlocks.registerBlock("nekooji_suit",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_TONO_BLOCK = ModBlocks.registerBlock("nekooji_tono",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_BUG_BLOCK = ModBlocks.registerBlock("nekooji_bug",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_KINTARO_BLOCK = ModBlocks.registerBlock("nekooji_kintaro",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
    public static final DeferredBlock<DollMainBlock> NEKOOJI_WORKS_BLOCK = ModBlocks.registerBlock("nekooji_works",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));




    //　ブロック登録用のメソッド ===========================================================================================
    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // ブロックアイテムの登録用メソッド
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // 登録用メソッド
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
