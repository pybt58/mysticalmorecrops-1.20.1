package com.pybt58.mysticalmorecrops.init;

import com.blakebr0.cucumber.item.BaseItem;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class ModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MysticalMoreCrops.MOD_ID);
    static {
        ModBlocks.BLOCK_ITEMS.forEach(REGISTRY::register);
    }
    public static final RegistryObject<Item> EVIL_INTENTION = register("evil_intention");
    public static final RegistryObject<Item> BLANK_EGG = register("blank_egg");

    private static RegistryObject<Item> register(String name) {
        return register(name, BaseItem::new);
    }

    private static RegistryObject<Item> register(String name, Supplier<Item> item) {
        return REGISTRY.register(name, item);
    }
}
