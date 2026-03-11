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

        // =====================================================================

        // 鉄の原石ブロックからぼんじゅうる(ノーマル)をドロップさせる
        add("bonjour_normal_from_raw_iron_block", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.RAW_IRON_BLOCK).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.BONJOUR_NORMAL_BLOCK.asItem()));

        // 乾燥した昆布ブロックからぼんじゅうる(保育士)をドロップさせる
        add("bonjour_hoiku_from_dried_kelp_block", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.DRIED_KELP_BLOCK).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.BONJOUR_HOIKU_BLOCK.asItem()));


        // ==============================================================

        // アイアンゴーレムからおんりー(ノーマル)をドロップさせる
        add("qnly_normal_from_iron_golem", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/iron_golem")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_NORMAL_BLOCK.asItem()));

        // ゾンビ
        add("qnly_bonjour_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_BONJOUR_BLOCK.asItem()));

        // クモ
        add("qnly_from_spider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/spider")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_GUARD_BLOCK.asItem()));

        // エンダーマン
        add("qnly_from_enderman", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/enderman")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_SUIT_BLOCK.asItem()));

        // ネザー要塞
        add("qnly_from_nether_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(
                        ResourceLocation.parse("minecraft:chests/nether_bridge")
                ).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_RPG_BLOCK.asItem()));

        // ブレイズ
        add("qnly_from_blaze", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/blaze")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_OJOSAMA_BLOCK.asItem()));

        // ウィザースケルトン
        add("qnly_from_wither_skeleton", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/wither_skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_JAPAN_BLOCK.asItem()));

        // シルバーフィッシュ
        add("qnly_from_silverfish", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/silverfish")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_STUDENT_BLOCK.asItem()));

        // ホグリン
        add("qnly_from_hoglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/hoglin")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_SANTA_BLOCK.asItem()));

        // エンダードラゴン
        add("qnly_from_ender_dragon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ender_dragon")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.QNLY_PREVIOUS_BLOCK.asItem()));

        // ==================================================================================

        // スノーゴーレムからおらふくん(ノーマル)をドロップさせる
        add("orafkun_normal_from_snow_golem", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/snow_golem")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.ORAFKUN_NORMAL_BLOCK.asItem()));

        // ==============================================================================

        // ブタからおおはらMEN(ノーマル)をドロップさせる
        add("ooharamen_normal_from_pig", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/pig")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_NORMAL_BLOCK.asItem()));

        // ピグリンからおおはらMEN(ピグリン)をドロップさせる
        add("ooharamen_piglin_from_piglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/piglin")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_PIGLIN_BLOCK.asItem()));

        // ピグリンブルートからおおはらMEN(旧式)をドロップさせる
        add("ooharamen_previous_from_piglin_brute", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/piglin_brute")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_PREVIOUS_BLOCK.asItem()));

        //　クリーパーからおおはらMEN(TNT)をドロップさせる
        add("ooharamen_student_from_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_STUDENT_BLOCK.asItem()));

        // TNT
        add("ooharamen_tnt_from_tnt", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TNT).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_TNT_BLOCK.asItem()));

        // 廃要塞
        add("ooharamen_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(
                        ResourceLocation.parse("minecraft:chests/bastion_treasure")
                ).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_OLD_BLOCK.asItem()));

        add("ooharamen_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(
                        ResourceLocation.parse("minecraft:chests/bastion_hoglin_stable")
                ).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_DEKA_BLOCK.asItem()));

        add("ooharamen_from_bastion_other", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(
                        ResourceLocation.parse("minecraft:chests/bastion_other")
                ).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_ZURU_BLOCK.asItem()));

        add("ooharamen_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(
                        ResourceLocation.parse("minecraft:chests/bastion_treasure")
                ).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_GIRL_BLOCK.asItem()));

        // ゾンビピグリン
        add("ooharamen_ojosama_from_zombified_piglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombified_piglin")).build(),
                LootItemRandomChanceCondition.randomChance(1.0f).build()
        }, ModBlocks.OOHARAMEN_OJOSAMA_BLOCK.asItem()));


        // ===================================================================================

        // 村のチェストからねこおじ(ノーマル)をドロップさせる
        add("nekooji_from_village_chests", new AddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(1.0f).build(),
                LootTableIdCondition.builder(ResourceLocation.parse("minecraft:chests/village/village_plains_house")).build()
        }, ModBlocks.NEKOOJI_NORMAL_BLOCK.get().asItem()));

        // ねこおじ(探検隊)
        add("nekooji_from_village_desert", new AddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(1.0f).build(),
                LootTableIdCondition.builder(ResourceLocation.parse("minecraft:chests/village/village_desert_house")).build()
        }, ModBlocks.NEKOOJI_DEKA_BLOCK.get().asItem()));

        // ねこおじ博士
        add("nekooji_from_village_savanna", new AddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(1.0f).build(),
                LootTableIdCondition.builder(ResourceLocation.parse("minecraft:chests/village/village_savanna_house")).build()
        }, ModBlocks.NEKOOJI_DOCTOR_BLOCK.get().asItem()));

        // ねこおじ(ワークス)
        add("nekooji_from_village_snowy", new AddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(1.0f).build(),
                LootTableIdCondition.builder(ResourceLocation.parse("minecraft:chests/village/village_snowy_house")).build()
        }, ModBlocks.NEKOOJI_WORKS_BLOCK.get().asItem()));

        // ねこおじいちゃん
        add("nekooji_from_village_taiga", new AddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(1.0f).build(),
                LootTableIdCondition.builder(ResourceLocation.parse("minecraft:chests/village/village_taiga_house")).build()
        }, ModBlocks.NEKOOJI_OLD_BLOCK.get().asItem()));

    }

}
