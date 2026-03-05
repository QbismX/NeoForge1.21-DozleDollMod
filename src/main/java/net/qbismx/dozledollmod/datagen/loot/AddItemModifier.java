package net.qbismx.dozledollmod.datagen.loot;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

public class AddItemModifier extends LootModifier {

    private final Item item;

    // ゲームにloot modifierの存在を伝えるには、そのためのCodecを定義し登録する必要がある
    public static final MapCodec<AddItemModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
            LootModifier.codecStart(inst).and(//inst.group(
                   // Codec.STRING.fieldOf("field1").forGetter(e -> e.field1),
                   // Codec.INT.fieldOf("field2").forGetter(e -> e.field2),
                    BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(e -> e.item)
                    //)
            ).apply(inst, AddItemModifier::new)
    );

    public AddItemModifier(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> objectArrayList, LootContext lootContext) {
        for(LootItemCondition condition: this.conditions) {
            if (!condition.test(lootContext)) {
                return objectArrayList;
            }
        }

        objectArrayList.add(new ItemStack(this.item));

        return objectArrayList;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return ModLootModifiers.ADD_ITEM_MODIFIER.get();
    }
}
