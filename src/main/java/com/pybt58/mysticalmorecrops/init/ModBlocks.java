package com.pybt58.mysticalmorecrops.init;

import com.blakebr0.cucumber.block.BaseBlock;
import com.blakebr0.cucumber.item.BaseBlockItem;
import com.blakebr0.mysticalagriculture.block.InferiumCropBlock;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import com.pybt58.mysticalmorecrops.lib.ModCrops;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public final class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MysticalMoreCrops.MOD_ID);
    public static final Map<String, Supplier<BlockItem>> BLOCK_ITEMS = new LinkedHashMap<>();

    public static final RegistryObject<Block> ENCHANTED_GOLDEN_APPLE_CRUX = register("enchanted_golden_apple_crux", () -> new BaseBlock(SoundType.STONE, 5.0F, 10.0F));
    public static final RegistryObject<Block> PROSPERITY_CRUX = register("prosperity_crux", () -> new BaseBlock(SoundType.STONE, 5.0F, 10.0F));
    public static final RegistryObject<Block> SUPREMIUM_CRUX = register("supremium_crux", () -> new BaseBlock(SoundType.STONE, 5.0F, 10.0F));

    public static final RegistryObject<Block> SUPREMIUM_CROP = registerNoItem("supremium_crop", () -> new InferiumCropBlock(ModCrops.SUPREMIUM));

    private static RegistryObject<Block> register(String name, Supplier<Block> block) {
        return register(name, block, b -> () -> new BaseBlockItem(b.get()));
    }

    private static RegistryObject<Block> register(String name, Supplier<Block> block, Function<RegistryObject<Block>, Supplier<? extends BlockItem>> item) {
        var reg = REGISTRY.register(name, block);
        BLOCK_ITEMS.put(name, () -> item.apply(reg).get());
        return reg;
    }

    private static RegistryObject<Block> registerNoItem(String name, Supplier<Block> block) {
        return REGISTRY.register(name, block);
    }
}
