package com.pybt58.mysticalmorecrops.compat.jei;

import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import com.pybt58.mysticalmorecrops.init.ModItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public final class JeiCompat implements IModPlugin {
    public static final ResourceLocation UID = MysticalMoreCrops.resource("jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(
                new ItemStack(ModItems.EVIL_INTENTION.get()),
                VanillaTypes.ITEM_STACK,
                Component.translatable("jei.desc.mysticalmorecrops.evil_intention")
        );
    }
}
