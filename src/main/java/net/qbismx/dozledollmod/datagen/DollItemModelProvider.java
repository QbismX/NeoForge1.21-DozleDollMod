package net.qbismx.dozledollmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.ItemDisplayContext;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DollItemModelProvider extends ItemModelProvider {

    public DollItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        dollItem("dozle_normal");
        dollItem("bonjour_normal");

    }

    private void dollItem(String name) {
        withExistingParent(name, modLoc("block/" + name))
                .transforms()
                .transform(ItemDisplayContext.FIXED)
                .rotation(-90, 0, 0)
                .translation(0, 0, -8)
                .scale(1, 1, 1)
                .end()
                .end();
    }

}
