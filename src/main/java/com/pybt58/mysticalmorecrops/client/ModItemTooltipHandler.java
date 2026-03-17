package com.pybt58.mysticalmorecrops.client;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItemTooltipHandler {
    private static final Item ANTIMATTER_SEEDS =
            ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation("mysticalagriculture","antimatter_seeds")
            );
    private static final Item ENCHANTED_GOLDEN_APPLE_SEEDS =
            ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation("mysticalagriculture","enchanted_golden_apple_seeds")
            );

    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        if(stack.is(ANTIMATTER_SEEDS)) {
            event.getToolTip().add(Component.translatable("tooltip.mysticalmorecrops.antimatter_seeds"));
        } else if (stack.is(ENCHANTED_GOLDEN_APPLE_SEEDS)) {
            event.getToolTip().add(Component.translatable("tooltip.mysticalmorecrops.enchanted_golden_apple_seeds"));
        }
    }
}
