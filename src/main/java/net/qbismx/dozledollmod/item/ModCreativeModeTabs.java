package net.qbismx.dozledollmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.qbismx.dozledollmod.DozleDollMod;
import net.qbismx.dozledollmod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DozleDollMod.MODID);

    // ドズルさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> DOZELE_DOLLS_TAB = CREATIVE_MODE_TAB.register("dozle_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DOZLE_NORMAL_BLOCK))
                    .title(Component.translatable("creativemodetab.dozledollmod.dozle_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.DOZLE_NORMAL_BLOCK);
                    })
                    .build());

    // ぼんじゅうるさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> BONJOUR_DOLLS_TAB = CREATIVE_MODE_TAB.register("bonjour_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BONJOUR_NORMAL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "dozle_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.bonjour_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.BONJOUR_NORMAL_BLOCK);
                    })
                    .build());

    // おんりーさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> QNLY_DOLLS_TAB = CREATIVE_MODE_TAB.register("qnly_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.REDSTONE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "bonjour_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.qnly_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(Items.REDSTONE_BLOCK);
                    })
                    .build());



    // おらふくんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> ORAFKUN_DOLLS_TAB = CREATIVE_MODE_TAB.register("orafkun_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.REDSTONE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "qnly_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.orafkun_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(Items.REDSTONE_BLOCK);
                    })
                    .build());

    // おおはらMENさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> OOHARAMEN_DOLLS_TAB = CREATIVE_MODE_TAB.register("ooharamen_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.REDSTONE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "orafkun_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.ooharamen_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(Items.REDSTONE_BLOCK);
                    })
                    .build());

    // ねこおじさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> NEKOOJI_DOLLS_TAB = CREATIVE_MODE_TAB.register("nekooji_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.REDSTONE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "ooharamen_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.nekooji_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(Items.REDSTONE_BLOCK);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
