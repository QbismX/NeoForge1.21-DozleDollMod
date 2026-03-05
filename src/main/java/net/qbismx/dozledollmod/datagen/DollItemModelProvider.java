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
        dollItem("dozle_cold");
        dollItem("dozle_girl");
        dollItem("dozle_gorilla");
        dollItem("dozle_kami");
        dollItem("dozle_muscle");
        dollItem("dozle_student");
        dollItem("dozle_suit");
        dollItem("dozle_wild");
        dollItem("dozle_japan");

        dollItem("bonjour_normal");
        dollItem("bonjour_hoiku");
        dollItem("bonjour_japan");
        dollItem("bonjour_momotaro");
        dollItem("bonjour_rpg");
        dollItem("bonjour_student");
        dollItem("bonjour_suit");
        dollItem("bonjour_tantei");

        dollItem("qnly_normal");
        dollItem("orafkun_normal");
        dollItem("ooharamen_normal");
        dollItem("nekooji_normal");

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
