package com.pybt58.mysticalmorecrops.lib;

import com.blakebr0.mysticalagriculture.api.crop.Crop;
import com.blakebr0.mysticalagriculture.api.crop.CropTier;
import com.blakebr0.mysticalagriculture.api.crop.CropType;
import com.blakebr0.mysticalagriculture.api.lib.LazyIngredient;
import com.blakebr0.mysticalagriculture.api.registry.ICropRegistry;
import com.blakebr0.mysticalagriculture.api.util.MobSoulUtils;
import com.blakebr0.mysticalagriculture.init.ModItems;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import com.pybt58.mysticalmorecrops.init.ModBlocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraftforge.fml.ModList;

import java.util.Arrays;

public final class ModCrops {
    // 新しいCropの登録
    public static final Crop SUPREMIUM = new Crop(MysticalMoreCrops.resource("supremium"), CropTier.FIVE, CropType.RESOURCE, LazyIngredient.item("mysticalagriculture:supremium_essence"));
    public static final Crop PROSPERITY = new Crop(MysticalMoreCrops.resource("prosperity"), CropTier.FIVE, CropType.RESOURCE, LazyIngredient.item("mysticalagriculture:prosperity_ore"));
    public static final Crop SOULSTONE = new Crop(MysticalMoreCrops.resource("soulstone"), CropTier.THREE, CropType.RESOURCE, LazyIngredient.item("mysticalagriculture:soulstone"));
    public static final Crop SCULK = new Crop(MysticalMoreCrops.resource("sculk"), CropTier.FIVE, CropType.RESOURCE, LazyIngredient.item("minecraft:sculk_catalyst"));
    public static final Crop SPONGE = new Crop(MysticalMoreCrops.resource("sponge"), CropTier.FOUR, CropType.RESOURCE, LazyIngredient.item("minecraft:sponge"));
    public static final Crop ALLAY = new Crop(MysticalMoreCrops.resource("allay"), CropTier.FOUR, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.ALLAY)));
    public static final Crop AMPHIBIAN = new Crop(MysticalMoreCrops.resource("amphibian"), CropTier.THREE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.AMPHIBIAN)));
    public static final Crop BAT = new Crop(MysticalMoreCrops.resource("bat"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.BAT)));
    public static final Crop BEAR = new Crop(MysticalMoreCrops.resource("bear"), CropTier.THREE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.BEAR)));
    public static final Crop CAT = new Crop(MysticalMoreCrops.resource("cat"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.CAT)));
    public static final Crop DOLPHIN = new Crop(MysticalMoreCrops.resource("dolphin"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.DOLPHIN)));
    public static final Crop FOX = new Crop(MysticalMoreCrops.resource("fox"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.FOX)));
    public static final Crop GOLEM = new Crop(MysticalMoreCrops.resource("golem"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.GOLEM)));
    public static final Crop HORSE = new Crop(MysticalMoreCrops.resource("horse"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.HORSE)));
    public static final Crop HUMAN = new Crop(MysticalMoreCrops.resource("human"), CropTier.FIVE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.HUMAN)));
    public static final Crop LLAMA = new Crop(MysticalMoreCrops.resource("llama"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.LLAMA)));
    public static final Crop MITE = new Crop(MysticalMoreCrops.resource("mite"), CropTier.THREE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.MITE)));
    public static final Crop SHULKER = new Crop(MysticalMoreCrops.resource("shulker"), CropTier.FIVE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.SHULKER)));
    public static final Crop SNIFFER = new Crop(MysticalMoreCrops.resource("sniffer"), CropTier.FIVE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.SNIFFER)));
    public static final Crop STRIDER = new Crop(MysticalMoreCrops.resource("strider"), CropTier.THREE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.STRIDER)));
    public static final Crop WOLF = new Crop(MysticalMoreCrops.resource("wolf"), CropTier.TWO, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.WOLF)));
    public static final Crop EVIL = new Crop(MysticalMoreCrops.resource("evil"), CropTier.THREE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.EVIL)));
    //public static final Crop GRIMOIRE = new Crop(MysticalMoreCrops.resource("grimoire"), CropTier.THREE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.GRIMOIRE)));
    //...

    public static void onRegisterCrops(ICropRegistry registry) {
        SUPREMIUM.getTextures().setEssenceTexture(MysticalMoreCrops.maResource("item/supremium_essence"));
        SUPREMIUM.getRecipeConfig().setSeedCraftingRecipeEnabled(false).setSeedInfusionRecipeEnabled(false);
        SUPREMIUM.setCropBlock(() -> (CropBlock) ModBlocks.SUPREMIUM_CROP.get()).setEssenceItem(ModItems.SUPREMIUM_ESSENCE);

        //PROSPERITY.getRecipeConfig().setSeedCraftingRecipeEnabled(false).setSeedInfusionRecipeEnabled(false);//todo 対応するレシピを手動で追加する

        registry.register(SUPREMIUM);
        registry.register(PROSPERITY);

        registry.register(SOULSTONE);
        registry.register(SCULK);
        registry.register(SPONGE);
        registry.register(ALLAY);
        registry.register(AMPHIBIAN);
        registry.register(BAT);
        registry.register(BEAR);
        registry.register(CAT);
        registry.register(DOLPHIN);
        registry.register(FOX);
        registry.register(GOLEM);
        registry.register(HORSE);
        registry.register(HUMAN);
        registry.register(LLAMA);
        registry.register(MITE);
        registry.register(SHULKER);
        registry.register(SNIFFER);
        registry.register(STRIDER);
        registry.register(WOLF);
        registry.register(EVIL);
        //registry.register(withRequiredMods(GRIMOIRE, ...));
        //...
    }

    public static void onPostRegisterCrops(ICropRegistry registry) {
        SUPREMIUM.setCruxBlock(com.blakebr0.mysticalagriculture.init.ModBlocks.AWAKENED_SUPREMIUM_GEMSTONE_BLOCK);
    }

    private static Crop withRequiredMods(Crop crop, String... mods) {
        boolean enabled = Arrays.stream(mods).anyMatch(ModList.get()::isLoaded);
        return crop.setEnabled(enabled);
    }


}
