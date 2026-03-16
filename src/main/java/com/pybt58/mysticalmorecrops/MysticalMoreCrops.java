package com.pybt58.mysticalmorecrops;

import com.blakebr0.cucumber.helper.ConfigHelper;
import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import com.mojang.logging.LogUtils;
import com.pybt58.mysticalmorecrops.client.ModItemTooltipHandler;
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

    public MysticalMoreCrops() throws NoSuchFieldException, IllegalAccessException {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.REGISTRY.register(modEventBus);
        ModItems.REGISTRY.register(modEventBus);
        modEventBus.register(new ModDataGenerators());

        ModCreativeModeTabs.REGISTRY.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        ConfigHelper.load(ModConfigs.COMMON, "mysticalmorecrops-common.toml");
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    }

    private void clientSetup(FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new ModItemTooltipHandler());
    }

    public static ResourceLocation resource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static ResourceLocation maResource(String path) {
        return new ResourceLocation(MysticalAgriculture.MOD_ID, path);
    }
}

// CAUTION
// runData タスク実行時におそらくcucumberの不備?によるinvokeエラーが発生するため、
// 最新版の他のmodとの連携をrunClientタスクで確かめたい場合、バージョンを切り替えること

// 1.21.1バージョン作成時に、液体バケツを指すingredientを E:{ "tag": "c:buckets/lava" } のようにする
// phantom のレシピは1.21.1で変更　phantomのCropが新設されているため