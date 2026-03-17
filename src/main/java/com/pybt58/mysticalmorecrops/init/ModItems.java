package com.pybt58.mysticalmorecrops.init;

import com.blakebr0.cucumber.item.BaseItem;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import com.pybt58.mysticalmorecrops.item.BossBlankEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
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
    public static final RegistryObject<Item> BOSS_BLANK_EGG = register("boss_blank_egg", BossBlankEggItem::new);

    // Mekanism
    public static final RegistryObject<Item> ENRICHED_PELLET_ANTIMATTER = register("enriched_pellet_antimatter", () -> new BaseItem(p -> p.rarity(Rarity.RARE)));//濃縮室で 32->1　粉砕機で一つ下に戻る
    public static final RegistryObject<Item> SUPER_ENRICHED_PELLET_ANTIMATTER = register("super_enriched_pellet_antimatter", () -> new BaseItem(p -> p.rarity(Rarity.EPIC)));//32768

    // Mekanism Generators
    public static final RegistryObject<Item> DT_OCCLUDED_INGOT_URANIUM = register("dt_occluded_ingot_uranium", () -> new BaseItem(p -> p.rarity(Rarity.UNCOMMON)));

    // Mekanism Extras
    public static final RegistryObject<Item> NUF_AGGLOMERATION = register("nuf_agglomeration", () -> new BaseItem(p -> p.rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ENRICHED_NUF_AGGLOMERATION = register("enriched_nuf_agglomeration", () -> new BaseItem(p -> p.rarity(Rarity.RARE)));// 濃縮室で 64->1
    public static final RegistryObject<Item> SUPER_ENRICHED_NUF_AGGLOMERATION = register("super_enriched_nuf_agglomeration", () -> new BaseItem(p -> p.rarity(Rarity.EPIC)));//4096

    private static RegistryObject<Item> register(String name) {
        return register(name, BaseItem::new);
    }

    private static RegistryObject<Item> register(String name, Supplier<Item> item) {
        return REGISTRY.register(name, item);
    }
}
