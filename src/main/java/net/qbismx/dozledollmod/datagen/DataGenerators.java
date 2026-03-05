package net.qbismx.dozledollmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.qbismx.dozledollmod.DozleDollMod;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = DozleDollMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeClient()){
            generator.addProvider(true, new DollBlockStateProvider(packOutput, DozleDollMod.MODID, existingFileHelper));
            generator.addProvider(true, new DollItemModelProvider(packOutput, DozleDollMod.MODID, existingFileHelper));
        }

        if (event.includeServer()) {
           generator.addProvider(true, new ModGlobalLootModifiersProvider(packOutput, lookupProvider));
           generator.addProvider(true, new ModLootTableProvider(packOutput, lookupProvider));
        }

    }
}
