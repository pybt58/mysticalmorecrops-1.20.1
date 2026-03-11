package com.pybt58.mysticalmorecrops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {
    public static final ForgeConfigSpec COMMON;

    public static final ForgeConfigSpec.BooleanValue ENABLE_SUPREMIUM_CROP;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PROSPERITY_CROP;

    static {
        final var common = new ForgeConfigSpec.Builder();
        common.comment("General configuration options.").push("General");
        ENABLE_SUPREMIUM_CROP = common
                .comment("Should the crop \" supremium \" be enabled?")
                .define("spuremiumCropEnabled",true);
        ENABLE_PROSPERITY_CROP = common
                .comment("Should the crop \" prosperity \" be enabled?")
                .define("prosperityCropEnabled",true);
        //...
        common.pop();

        COMMON = common.build();
    }
}
