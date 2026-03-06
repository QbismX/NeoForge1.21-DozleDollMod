package net.qbismx.dozledollmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
                        output.accept(ModBlocks.DOZLE_COLD_BLOCK);
                        output.accept(ModBlocks.DOZLE_GIRL_BLOCK);
                        output.accept(ModBlocks.DOZLE_GORILLA_BLOCK);
                        output.accept(ModBlocks.DOZLE_KAMI_BLOCK);
                        output.accept(ModBlocks.DOZLE_MUSCLE_BLOCK);
                        output.accept(ModBlocks.DOZLE_STUDENT_BLOCK);
                        output.accept(ModBlocks.DOZLE_SUIT_BLOCK);
                        output.accept(ModBlocks.DOZLE_WILD_BLOCK);
                        output.accept(ModBlocks.DOZLE_JAPAN_BLOCK);
                    })
                    .build());

    // ぼんじゅうるさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> BONJOUR_DOLLS_TAB = CREATIVE_MODE_TAB.register("bonjour_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BONJOUR_NORMAL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "dozle_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.bonjour_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.BONJOUR_NORMAL_BLOCK);
                        output.accept(ModBlocks.BONJOUR_HOIKU_BLOCK);
                        output.accept(ModBlocks.BONJOUR_JAPAN_BLOCK);
                        output.accept(ModBlocks.BONJOUR_MOMOTARO_BLOCK);
                        output.accept(ModBlocks.BONJOUR_RPG_BLOCK);
                        output.accept(ModBlocks.BONJOUR_STUDENT_BLOCK);
                        output.accept(ModBlocks.BONJOUR_SUIT_BLOCK);
                        output.accept(ModBlocks.BONJOUR_TANTEI_BLOCK);
                        output.accept(ModBlocks.BONJOUR_HALLOWEEN_BLOCK);
                        output.accept(ModBlocks.BONJOUR_OJOSAMA_BLOCK);
                    })
                    .build());

    // おんりーさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> QNLY_DOLLS_TAB = CREATIVE_MODE_TAB.register("qnly_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.QNLY_NORMAL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "bonjour_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.qnly_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.QNLY_NORMAL_BLOCK);
                        output.accept(ModBlocks.QNLY_BONJOUR_BLOCK);
                        output.accept(ModBlocks.QNLY_GUARD_BLOCK);
                        output.accept(ModBlocks.QNLY_JAPAN_BLOCK);
                        output.accept(ModBlocks.QNLY_OJOSAMA_BLOCK);
                        output.accept(ModBlocks.QNLY_RPG_BLOCK);
                        output.accept(ModBlocks.QNLY_PREVIOUS_BLOCK);
                        output.accept(ModBlocks.QNLY_SANTA_BLOCK);
                        output.accept(ModBlocks.QNLY_SUIT_BLOCK);
                        output.accept(ModBlocks.QNLY_STUDENT_BLOCK);
                    })
                    .build());



    // おらふくんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> ORAFKUN_DOLLS_TAB = CREATIVE_MODE_TAB.register("orafkun_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ORAFKUN_NORMAL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "qnly_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.orafkun_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.ORAFKUN_NORMAL_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_JAPAN_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_OJOSAMA_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_ORAKOCHAN_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_ORAKOHIME_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_ORALISH_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_SAMURAI_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_STUDENT_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_TOY_BLOCK);
                        output.accept(ModBlocks.ORAFKUN_SUIT_BLOCK);
                    })
                    .build());

    // おおはらMENさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> OOHARAMEN_DOLLS_TAB = CREATIVE_MODE_TAB.register("ooharamen_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OOHARAMEN_NORMAL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "orafkun_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.ooharamen_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.OOHARAMEN_NORMAL_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_DEKA_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_GIRL_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_OJOSAMA_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_PIGLIN_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_OLD_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_PREVIOUS_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_STUDENT_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_TNT_BLOCK);
                        output.accept(ModBlocks.OOHARAMEN_ZURU_BLOCK);
                    })
                    .build());

    // ねこおじさんのフィギュアのクリエイティブモードタブ
    public static final Supplier<CreativeModeTab> NEKOOJI_DOLLS_TAB = CREATIVE_MODE_TAB.register("nekooji_dolls_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.NEKOOJI_NORMAL_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DozleDollMod.MODID, "ooharamen_dolls_tab"))
                    .title(Component.translatable("creativemodetab.dozledollmod.nekooji_dolls"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.NEKOOJI_NORMAL_BLOCK);
                        output.accept(ModBlocks.NEKOOJI_DEKA_BLOCK);
                        output.accept(ModBlocks.NEKOOJI_DOCTOR_BLOCK);
                        output.accept(ModBlocks.NEKOOJI_OLD_BLOCK);
                        output.accept(ModBlocks.NEKOOJI_RICH_BLOCK);
                        output.accept(ModBlocks.NEKOOJI_SUIT_BLOCK);
                        output.accept(ModBlocks.NEKOOJI_TONO_BLOCK);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
