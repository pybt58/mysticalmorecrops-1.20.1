package com.pybt58.mysticalmorecrops.lib;

import com.blakebr0.mysticalagriculture.api.IMysticalAgriculturePlugin;
import com.blakebr0.mysticalagriculture.api.MysticalAgriculturePlugin;
import com.blakebr0.mysticalagriculture.api.lib.PluginConfig;
import com.blakebr0.mysticalagriculture.api.registry.ICropRegistry;
import com.blakebr0.mysticalagriculture.api.registry.IMobSoulTypeRegistry;

import static com.pybt58.mysticalmorecrops.MysticalMoreCrops.MOD_ID;

@MysticalAgriculturePlugin
public final class ModCorePlugin implements IMysticalAgriculturePlugin {
    @Override
    public void configure(PluginConfig config) {
        config.setModId(MOD_ID);
        config.disableDynamicSeedCraftingRecipes();
        config.disableDynamicSeedInfusionRecipes();
        config.disableDynamicSeedReprocessingRecipes();
    }
    @Override
    public void onRegisterCrops(ICropRegistry registry) {
        ModCrops.onRegisterCrops(registry);
    }

    @Override
    public void onPostRegisterCrops(ICropRegistry registry) {
        ModCrops.onPostRegisterCrops(registry);
    }

    @Override
    public void onRegisterMobSoulTypes(IMobSoulTypeRegistry registry) {
        ModMobSoulTypes.onRegisterMobSoulTypes(registry);
    }

    @Override
    public void onPostRegisterMobSoulTypes(IMobSoulTypeRegistry registry) {
        ModMobSoulTypes.onPostRegisterMobSoulTypes(registry);
    }
}
