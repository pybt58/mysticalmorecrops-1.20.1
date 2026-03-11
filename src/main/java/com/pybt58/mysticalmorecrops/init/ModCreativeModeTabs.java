package com.pybt58.mysticalmorecrops.init;


import com.blakebr0.cucumber.util.FeatureFlagDisplayItemGenerator;
import com.blakebr0.mysticalagriculture.api.util.MobSoulUtils;
import com.blakebr0.mysticalagriculture.item.EssenceItem;
import com.blakebr0.mysticalagriculture.registry.CropRegistry;
import com.blakebr0.mysticalagriculture.registry.MobSoulTypeRegistry;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticalMoreCrops.MOD_ID);
    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = REGISTRY.register("creative_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup:mysticalmorecrops"))
            .icon(() -> new ItemStack(ModBlocks.SUPREMIUM_CROP.get())) //todo アイテムに差し替え
            .displayItems(FeatureFlagDisplayItemGenerator.create((parameters, output) -> {

                // このmodで追加されたModBlock
                // このmodで追加されたModItem
                output.accept(ModItems.EVIL_INTENTION.get());
                output.accept(ModItems.BLANK_EGG.get());

                for (var type : MobSoulTypeRegistry.getInstance().getMobSoulTypes()) {
                    if (type.isEnabled() && type.getModId().equals(MysticalMoreCrops.MOD_ID)) {
                        output.accept(MobSoulUtils.getFilledSoulJar(type, com.blakebr0.mysticalagriculture.init.ModItems.SOUL_JAR.get()));
                    } // このmodで追加されたModSoulJar
                }

                for (var crop : CropRegistry.getInstance().getCrops()) {
                    if (crop.isEnabled() && crop.getModId().equals(MysticalMoreCrops.MOD_ID) && !(crop.getEssenceItem() instanceof EssenceItem)) {
                        output.accept(crop.getEssenceItem());
                    } // このmodで追加されたCropのエッセンスアイテム
                }

                for (var crop : CropRegistry.getInstance().getCrops()) {
                    if (crop.isEnabled() && crop.getModId().equals(MysticalMoreCrops.MOD_ID)) {
                        output.accept(crop.getSeedsItem());
                    } // このmodで追加されたCropの種
                }
            }))
            .build()
    );
}
