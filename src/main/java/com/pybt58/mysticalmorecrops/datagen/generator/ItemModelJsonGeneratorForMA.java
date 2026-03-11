package com.pybt58.mysticalmorecrops.datagen.generator;

import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import com.blakebr0.mysticalagriculture.registry.CropRegistry;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelJsonGeneratorForMA extends ItemModelProvider {
    public ItemModelJsonGeneratorForMA(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MysticalAgriculture.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        var generatedModel = new ModelFile.UncheckedModelFile("item/generated");

        for (var crop : CropRegistry.getInstance().getCrops()) {
            if (crop.getModId().equals(MysticalMoreCrops.MOD_ID)) {
                if (crop.shouldRegisterEssenceItem()) {
                    this.getBuilder(crop.getNameWithSuffix("essence"))
                            .parent(generatedModel)
                            .texture("layer0", crop.getTextures().getEssenceTexture());
                }

                if (crop.shouldRegisterSeedsItem()) {
                    this.getBuilder(crop.getNameWithSuffix("seeds"))
                            .parent(generatedModel)
                            .texture("layer0", crop.getTextures().getSeedTexture());
                }

            }
        }
    }
    @Override
    public String getName() {
        return MysticalMoreCrops.NAME + " item model generator in mysticalagriculture folder";
    }
}
