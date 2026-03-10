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
        dollItem("bonjour_halloween");
        dollItem("bonjour_ojosama");

        dollItem("qnly_normal");
        dollItem("qnly_bonjour");
        dollItem("qnly_guard");
        dollItem("qnly_japan");
        dollItem("qnly_ojosama");
        dollItem("qnly_previous");
        dollItem("qnly_rpg");
        dollItem("qnly_santa");
        dollItem("qnly_student");
        dollItem("qnly_suit");

        dollItem("orafkun_normal");
        dollItem("orafkun_japan");
        dollItem("orafkun_ojosama");
        dollItem("orafkun_orakochan");
        dollItem("orafkun_orakohime");
        dollItem("orafkun_oralish");
        dollItem("orafkun_samurai");
        dollItem("orafkun_student");
        dollItem("orafkun_suit");
        dollItem("orafkun_toy");

        dollItem("ooharamen_normal");
        dollItem("ooharamen_deka");
        dollItem("ooharamen_ojosama");
        dollItem("ooharamen_old");
        dollItem("ooharamen_piglin");
        dollItem("ooharamen_previous");
        dollItem("ooharamen_student");
        dollItem("ooharamen_tnt");
        dollItem("ooharamen_zuru");
        dollItem("ooharamen_girl");

        dollItem("nekooji_normal");
        dollItem("nekooji_deka");
        dollItem("nekooji_doctor");
        dollItem("nekooji_old");
        dollItem("nekooji_rich");
        dollItem("nekooji_suit");
        dollItem("nekooji_tono");
        dollItem("nekooji_bug");
        dollItem("nekooji_kintaro");
        dollItem("nekooji_works");

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
