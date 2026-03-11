package com.pybt58.mysticalmorecrops.datagen;

import com.pybt58.mysticalmorecrops.datagen.generator.BlockModelJsonGeneratorForMA;
import com.pybt58.mysticalmorecrops.datagen.generator.ItemModelJsonGeneratorForMA;
import com.pybt58.mysticalmorecrops.datagen.generator.RecipeJsonGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public final class ModDataGenerators {
    @SubscribeEvent
    public void onGatherData(GatherDataEvent event) {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        //var lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new BlockModelJsonGeneratorForMA(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModelJsonGeneratorForMA(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new RecipeJsonGenerator(packOutput));
    }
}
