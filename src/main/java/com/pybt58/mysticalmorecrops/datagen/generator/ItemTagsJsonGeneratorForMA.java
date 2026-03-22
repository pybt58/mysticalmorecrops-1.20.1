package com.pybt58.mysticalmorecrops.datagen.generator;

import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import com.blakebr0.mysticalagriculture.api.MysticalAgricultureAPI;
import com.blakebr0.mysticalagriculture.registry.CropRegistry;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ItemTagsJsonGeneratorForMA extends TagsProvider<Item> {
    private final PackOutput output;

    public ItemTagsJsonGeneratorForMA(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, ExistingFileHelper existingFileHelper) {
        super(output, Registries.ITEM, lookup, MysticalAgriculture.MOD_ID, existingFileHelper);
        this.output = output;
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (var crop : CropRegistry.getInstance().getCrops()) {
            if(crop.getModId().equals(MysticalMoreCrops.MOD_ID)) {
                var essenceId = BuiltInRegistries.ITEM.getResourceKey(crop.getEssenceItem());
                this.tag(MysticalAgricultureAPI.ESSENCES_TAG).add(essenceId.get());
                var seedsId = BuiltInRegistries.ITEM.getResourceKey(crop.getSeedsItem());
                this.tag(MysticalAgricultureAPI.SEEDS_TAG).add(seedsId.get());
            }
        }
    }

    @Override
    protected Path getPath(ResourceLocation id) {
        return this.output.getOutputFolder().resolve("data/" + id.getNamespace() + "/tags/items/" + id.getPath() + ".json");
    }

    @Override
    public String getName() {
        return MysticalMoreCrops.NAME + " item tags generator in mysticalagriculture folder";
    }
}
