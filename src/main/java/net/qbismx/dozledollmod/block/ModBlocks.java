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
                    .strength(4f, 3600000.0f)    // ブロックを壊すときの硬さ
                    .sound(SoundType.METAL) // 音の設定：金属
                    .pushReaction(PushReaction.BLOCK) // ピストンでは押せない
                    .lightLevel(x -> 15)
                    .noOcclusion();

    // 共通の上半身部分をここで登録する。
    public static final DeferredBlock<DollUpperBlock> DOLL_UPPER_BLOCK = registerBlock("doll_upper",
            ()-> new DollUpperBlock(PROPERTIES));


    // ドズルさん --------------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> DOZLE_NORMAL_BLOCK = ModBlocks.registerBlock("dozle_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));


    //　ぼんじゅうるさん -------------------------------------------------------------------------------------------------
    public static final DeferredBlock<DollMainBlock> BONJOUR_NORMAL_BLOCK = ModBlocks.registerBlock("bonjour_normal",
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
