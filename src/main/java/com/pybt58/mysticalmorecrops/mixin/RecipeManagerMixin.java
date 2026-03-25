package com.pybt58.mysticalmorecrops.mixin;

import com.blakebr0.mysticalagriculture.api.crop.Crop;
import com.blakebr0.mysticalagriculture.registry.CropRegistry;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.fml.ModList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {
    @Inject(
            method = "apply(Ljava/util/Map;Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/util/profiling/ProfilerFiller;)V",
            at = @At("TAIL")
    )
    private void avoidDuplicationIndustrialAgriculture(Map<ResourceLocation, JsonElement> p_44037_, ResourceManager p_44038_, ProfilerFiller p_44039_, CallbackInfo ci) {
        MysticalMoreCrops.LOGGER.info("Mixin by Mystical More Crops");
        RecipeManager manager = (RecipeManager)(Object)this;

        Map<RecipeType<?>, Map<ResourceLocation, Recipe<?>>> immutableRecipes = manager.recipes;

        RecipeType<?> type = BuiltInRegistries.RECIPE_TYPE
                .get(new ResourceLocation("botanypots", "crop"));

        if (type == null || !(immutableRecipes.containsKey(type))) return;

        Map<ResourceLocation, Recipe<?>> immutableRecipeMap = immutableRecipes.get(type);

        MysticalMoreCrops.LOGGER.info("Checking recipe duplication (MysticalMoreCrops, BotanyPots)");
        boolean existIA = ModList.get().isLoaded("industrialagriculture");

        // mutableなMapとしてコピー
        Map<RecipeType<?>, Map<ResourceLocation, Recipe<?>>> mutableRecipes = new HashMap<>(immutableRecipes);
        Map<ResourceLocation, Recipe<?>> mutableRecipeMap = new HashMap<>(immutableRecipeMap);
        Map<ResourceLocation, Recipe<?>> mutableByName = new HashMap<>(manager.byName);

        // Mapを編集
        for (Crop crop : CropRegistry.getInstance().getCrops()) {
            MysticalMoreCrops.LOGGER.info("Checking: {}", crop.getName());

            ResourceLocation thisModRecipeId =
                    new ResourceLocation("botanypots", "mysticalmorecrops/crop/" + crop.getName());

            ResourceLocation industrialAgricultureRecipeId =
                    new ResourceLocation("botanypots", "industrialagriculture/crop/" + crop.getName());

            if (mutableRecipeMap.containsKey(thisModRecipeId) && mutableRecipeMap.containsKey(industrialAgricultureRecipeId)) {
                if (existIA) {
                    mutableRecipeMap.remove(thisModRecipeId);
                    mutableByName.remove(thisModRecipeId);
                    MysticalMoreCrops.LOGGER.info("Removed duplicate recipe: {}", thisModRecipeId);
                } else {
                    mutableRecipeMap.remove(industrialAgricultureRecipeId);
                    mutableByName.remove(industrialAgricultureRecipeId);
                    MysticalMoreCrops.LOGGER.info("Removed duplicate recipe: {}", industrialAgricultureRecipeId);
                }
            }
        }

        // 作成したmutableMapからimmutableMapを作成
        Map<ResourceLocation, Recipe<?>> newMap = ImmutableMap.copyOf(mutableRecipeMap);
        Map<ResourceLocation, Recipe<?>> newByName = ImmutableMap.copyOf(mutableByName);
        mutableRecipes.put(type, newMap);
        Map<RecipeType<?>, Map<ResourceLocation, Recipe<?>>> newImmutableRecipes = ImmutableMap.copyOf(mutableRecipes);

        // 差し替え
        manager.byName = newByName;
        manager.recipes = newImmutableRecipes;

        MysticalMoreCrops.LOGGER.info("Finished checking duplication.");
    }
}
