package com.pybt58.mysticalmorecrops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {
    public static final ForgeConfigSpec COMMON;

    public static final ForgeConfigSpec.BooleanValue ENABLE_SUPREMIUM_CROP;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PROSPERITY_CROP;

    public static final ForgeConfigSpec.BooleanValue ENABLE_ANTIMATTER_CROP;
    public static final ForgeConfigSpec.BooleanValue ENABLE_ENRICHED_THERMONUCLEAR_CROP;

    static {
        final var common = new ForgeConfigSpec.Builder();
        common.comment("General configuration options.").push("General");
        ENABLE_SUPREMIUM_CROP = common
                .comment("Should the crop \" supremium \" be enabled?")
                .define("spuremiumCropEnabled",true);
        ENABLE_PROSPERITY_CROP = common
                .comment("Should the crop \" prosperity \" be enabled?")
                .define("prosperityCropEnabled",true);

        ENABLE_ANTIMATTER_CROP = common
                .comment("Should the crop \"anti matter\" be enabled? (If there is Not \"Mekanism\" mod, this crop is disabled.)")
                .define("antiMatterCropEnabled",true);
        ENABLE_ENRICHED_THERMONUCLEAR_CROP = common
                .comment("Should the crop \"enriched thermonuclear\" be enabled? (If there is Not \"Mekanism Extras\" mod, this crop is disabled.)")
                .define("enrichedThermonuclearCropEnabled",true);
        //...
        common.pop();

        COMMON = common.build();
    }
}
