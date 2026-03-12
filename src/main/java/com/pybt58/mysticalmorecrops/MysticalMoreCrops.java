package com.pybt58.mysticalmorecrops;

import com.blakebr0.cucumber.helper.ConfigHelper;
import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import com.mojang.logging.LogUtils;
import com.pybt58.mysticalmorecrops.config.ModConfigs;
import com.pybt58.mysticalmorecrops.datagen.ModDataGenerators;
import com.pybt58.mysticalmorecrops.handler.MobDropHandler;
import com.pybt58.mysticalmorecrops.init.ModBlocks;
import com.pybt58.mysticalmorecrops.init.ModCreativeModeTabs;
import com.pybt58.mysticalmorecrops.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MysticalMoreCrops.MOD_ID)
public class MysticalMoreCrops
{
    public static final String MOD_ID = "mysticalmorecrops";
    public static final String NAME = "Mystical More Crops";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MysticalMoreCrops(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModBlocks.REGISTRY.register(modEventBus);
        ModItems.REGISTRY.register(modEventBus);
        modEventBus.register(new ModDataGenerators());

        ModCreativeModeTabs.REGISTRY.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        ConfigHelper.load(ModConfigs.COMMON, "mysticalmorecrops-common.toml");
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    }

    public static ResourceLocation resource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static ResourceLocation maResource(String path) {
        return new ResourceLocation(MysticalAgriculture.MOD_ID, path);
    }
}