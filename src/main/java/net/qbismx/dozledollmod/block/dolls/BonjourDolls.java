package net.qbismx.dozledollmod.block.dolls;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.qbismx.dozledollmod.block.ModBlocks;
import net.qbismx.dozledollmod.block.custom.DollMainBlock;

public class BonjourDolls {

    public static final DeferredBlock<DollMainBlock> BONJOUR_NORMAL_BLOCK = ModBlocks.registerBlock("bonjour_normal",
            ()-> new DollMainBlock(ModBlocks.PROPERTIES));
}
