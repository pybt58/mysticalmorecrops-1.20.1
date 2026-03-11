package com.pybt58.mysticalmorecrops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {
    public static final ForgeConfigSpec COMMON;
    static {
        final var common = new ForgeConfigSpec.Builder();
        common.comment("General configuration options.").push("General");
        //...
        common.pop();

        COMMON = common.build();
    }
}
