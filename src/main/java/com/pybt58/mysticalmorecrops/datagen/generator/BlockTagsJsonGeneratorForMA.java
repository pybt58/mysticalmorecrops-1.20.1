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
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class BlockTagsJsonGeneratorForMA extends TagsProvider<Block> {
    private final PackOutput output;

    public BlockTagsJsonGeneratorForMA(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, ExistingFileHelper existingFileHelper) {
        super(output, Registries.BLOCK, lookup, MysticalAgriculture.MOD_ID, existingFileHelper);
        this.output = output;
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (var crop : CropRegistry.getInstance().getCrops()) {
            if(crop.getModId().equals(MysticalMoreCrops.MOD_ID)) {
                var id = BuiltInRegistries.BLOCK.getResourceKey(crop.getCropBlock());
                this.tag(MysticalAgricultureAPI.CROPS_TAG).add(id.get());
            }
        }
    }

    @Override
    protected Path getPath(ResourceLocation id) {
        return this.output.getOutputFolder().resolve("data/" + id.getNamespace() + "/tags/blocks/" + id.getPath() + ".json");
    }

    @Override
    public String getName() {
        return MysticalMoreCrops.NAME + " block tags generator in mysticalagriculture folder";
    }
}
