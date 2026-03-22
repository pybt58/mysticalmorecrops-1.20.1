package com.pybt58.mysticalmorecrops.datagen.generator;

import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import com.blakebr0.mysticalagriculture.data.recipe.CraftingRecipeBuilder;
import com.blakebr0.mysticalagriculture.data.recipe.InfusionRecipeBuilder;
import com.blakebr0.mysticalagriculture.data.recipe.ReprocessorRecipeBuilder;
import com.blakebr0.mysticalagriculture.registry.CropRegistry;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import com.pybt58.mysticalmorecrops.lib.ModCrops;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class RecipeJsonGenerator extends RecipeProvider {
    public RecipeJsonGenerator(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        for (var crop : CropRegistry.getInstance().getCrops()) {
            if (crop.getModId().equals(MysticalMoreCrops.MOD_ID)) {
                if (crop != ModCrops.SUPREMIUM && crop != ModCrops.PROSPERITY) {
                    var craftingId = "seed/crafting/" + crop.getName();
                    CraftingRecipeBuilder.newSeedRecipe(crop).build(consumer, new ResourceLocation(MysticalAgriculture.MOD_ID, craftingId));

                    var infusionId = "seed/infusion/" + crop.getName();
                    InfusionRecipeBuilder.newSeedRecipe(crop).build(consumer, new ResourceLocation(MysticalAgriculture.MOD_ID, infusionId));
                }
                var reprocessorId = "seed/reprocessor/" + crop.getName();
                ReprocessorRecipeBuilder.newSeedReprocessingRecipe(crop).build(consumer, new ResourceLocation(MysticalAgriculture.MOD_ID, reprocessorId));
            }
        }
    }
}
