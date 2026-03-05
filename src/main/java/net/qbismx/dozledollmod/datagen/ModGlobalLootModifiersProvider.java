package net.qbismx.dozledollmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.qbismx.dozledollmod.DozleDollMod;
import net.qbismx.dozledollmod.block.ModBlocks;
import net.qbismx.dozledollmod.datagen.loot.AddItemModifier;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, DozleDollMod.MODID);
    }

    @Override
    protected void start() {

        // 自動作業台からドズル(ノーマル)をドロップさせる
        add("dozle_normal_from_crafter", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CRAFTER).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.DOZLE_NORMAL_BLOCK.asItem()));

        // 乾燥した昆布ブロックからぼんじゅうる(ノーマル)をドロップさせる
        add("bonjour_normal_from_crafter", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.DRIED_KELP_BLOCK).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.BONJOUR_NORMAL_BLOCK.asItem()));


        // アイアンゴーレムからおんりー(ノーマル)をドロップさせる
        add("qnly_normal_from_iron_golem", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/iron_golem")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_NORMAL_BLOCK.asItem()));

        // スノーゴーレムからおらふくん(ノーマル)をドロップさせる
        add("orafkun_normal_from_snow_golem", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/snow_golem")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.ORAFKUN_NORMAL_BLOCK.asItem()));

        // ブタからおおはらMEN(ノーマル)をドロップさせる
        add("ooharamen_normal_from_pig", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/pig")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_NORMAL_BLOCK.asItem()));

        // 村のチェストからねこおじ(ノーマル)をドロップさせる
        add("nekooji_normal_from_village_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village_house")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.NEKOOJI_NORMAL_BLOCK.asItem()));

    }

}
