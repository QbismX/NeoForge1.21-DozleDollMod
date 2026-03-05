package net.qbismx.dozledollmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.qbismx.dozledollmod.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    protected ModBlockLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
    }

    @Override
    protected void generate() {

        this.add(ModBlocks.DOLL_UPPER_BLOCK.get(), block -> LootTable.lootTable());

        for (DeferredHolder<Block, ? extends Block> block : ModBlocks.BLOCKS.getEntries()) {
            Block b = block.get();

            if (b == ModBlocks.DOLL_UPPER_BLOCK.get()) {
                // 上半身ブロックは何もドロップしない
                add(b, noDrop());
            } else {
                // それ以外は自分自身をドロップ
                dropSelf(b);
            }
        }

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream()
                .map(e -> (Block) e.value())
                .toList();
    }


}
