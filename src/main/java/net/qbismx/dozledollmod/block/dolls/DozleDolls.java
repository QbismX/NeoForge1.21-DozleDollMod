package net.qbismx.dozledollmod.block.dolls;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.qbismx.dozledollmod.block.ModBlocks;
import net.qbismx.dozledollmod.block.custom.DollMainBlock;

public class DozleDolls {

    public static final DeferredBlock<DollMainBlock> DOZLE_NORMAL_BLOCK = ModBlocks.registerBlock("dozle_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));

}

