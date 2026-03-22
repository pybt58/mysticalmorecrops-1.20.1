package com.pybt58.mysticalmorecrops.datagen;

import com.pybt58.mysticalmorecrops.datagen.generator.*;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public final class ModDataGenerators {
    @SubscribeEvent
    public void onGatherData(GatherDataEvent event) {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new BlockModelJsonGeneratorForMA(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModelJsonGeneratorForMA(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new RecipeJsonGenerator(packOutput));
        generator.addProvider(event.includeServer(), new BlockTagsJsonGeneratorForMA(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ItemTagsJsonGeneratorForMA(packOutput, lookupProvider, existingFileHelper));
    }
}
