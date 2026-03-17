package com.pybt58.mysticalmorecrops.compat.mysticalagradditions;

import com.blakebr0.mysticalagradditions.init.ModCropTiers;
import com.blakebr0.mysticalagriculture.api.crop.Crop;
import com.blakebr0.mysticalagriculture.api.crop.CropType;
import com.blakebr0.mysticalagriculture.api.lib.LazyIngredient;
import com.blakebr0.mysticalagriculture.api.registry.ICropRegistry;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import com.pybt58.mysticalmorecrops.config.ModConfigs;
import com.pybt58.mysticalmorecrops.init.ModBlocks;
import com.pybt58.mysticalmorecrops.lib.ModCrops;

// 絶対にこのクラスを不用意に参照しないこと！mysticalagradditionsがあることが確定している処理内でのみ参照すること
public final class ModAdditionsCrops {
    public static Crop ENCHANTED_GOLDEN_APPLE;

    // mekanism
    public static Crop ANTIMATTER;
    public static Crop DT_FUEL;

    // mekanism extras
    public static Crop NAQUADAH;
    public static Crop NAQUADAH_URANIUM_FUEL;
    public static Crop ENRICHED_THERMONUCLEAR;

    public static void onRegisterCrops(ICropRegistry registry) {
        ENCHANTED_GOLDEN_APPLE = new Crop(MysticalMoreCrops.resource("enchanted_golden_apple"), ModCropTiers.SIX, CropType.RESOURCE, LazyIngredient.item("minecraft:enchanted_golden_apple"));
        registry.register(ENCHANTED_GOLDEN_APPLE.setHasEffect(true));

        ANTIMATTER = new Crop(MysticalMoreCrops.resource("antimatter"), ModCropTiers.SIX, CropType.RESOURCE, LazyIngredient.item("mysticalmorecrops:super_enriched_pellet_antimatter")); // need config true
        registry.register(ModCrops.withRequiredAllMods(ANTIMATTER, "mekanism").setEnabled(ModConfigs.ENABLE_ANTIMATTER_CROP.get()).setHasEffect(true));
        DT_FUEL = new Crop(MysticalMoreCrops.resource("dt_fuel"), ModCropTiers.SIX, CropType.RESOURCE, LazyIngredient.item("mysticalmorecrops:dt_occluded_ingot_uranium"));
        registry.register(ModCrops.withRequiredAllMods(DT_FUEL, "mekanismgenerators"));

        NAQUADAH = new Crop(MysticalMoreCrops.resource("naquadah"), ModCropTiers.SIX, CropType.RESOURCE, LazyIngredient.item("mekanism_extras:ingot_naquadah"));
        registry.register(ModCrops.withRequiredAllMods(NAQUADAH, "mekanism_extras"));
        NAQUADAH_URANIUM_FUEL = new Crop(MysticalMoreCrops.resource("naquadah_uranium_fuel"), ModCropTiers.SIX, CropType.RESOURCE, LazyIngredient.item("mysticalmorecrops:super_enriched_nuf_agglomeration"));
        registry.register(ModCrops.withRequiredAllMods(NAQUADAH_URANIUM_FUEL, "mekanism_extras"));
        ENRICHED_THERMONUCLEAR = new Crop(MysticalMoreCrops.resource("enriched_thermonuclear"), ModCropTiers.SIX, CropType.RESOURCE, LazyIngredient.item("mekanism_extras:enriched_thermonuclear")); // need config true
        registry.register(ModCrops.withRequiredAllMods(ENRICHED_THERMONUCLEAR, "mekanism_extras").setEnabled(ModConfigs.ENABLE_ENRICHED_THERMONUCLEAR_CROP.get()));
    }

    public static void onPostRegisterCrops(ICropRegistry registry) {
        ENCHANTED_GOLDEN_APPLE.setCruxBlock(ModBlocks.ENCHANTED_GOLDEN_APPLE_CRUX);
    }
}
