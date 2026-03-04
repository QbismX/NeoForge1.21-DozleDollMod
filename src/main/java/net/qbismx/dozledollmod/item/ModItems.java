package net.qbismx.dozledollmod.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.qbismx.dozledollmod.DozleDollMod;

public class ModItems {
    // ゲームに認知させたいModのアイテム全体の登録箱
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DozleDollMod.MODID);

    // アイテム登録用メソッド
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
