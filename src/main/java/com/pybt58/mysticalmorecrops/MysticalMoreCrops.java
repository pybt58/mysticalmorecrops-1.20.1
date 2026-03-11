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
//import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        ConfigHelper.load(ModConfigs.COMMON, "mysticalmorecrops-common.toml");
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        //LOGGER.info("HELLO FROM COMMON SETUP");
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        //LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            //LOGGER.info("HELLO FROM CLIENT SETUP");
            //LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }

    public static ResourceLocation resource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static ResourceLocation maResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, path);
    }
}// todo mobsoulの量の調整　soulextracterの量の調整 日本語ファイル evil_intentionドロップの仕様修正、jeiインフォ
//todo goat_hone クラフトで全種利用可能か確認