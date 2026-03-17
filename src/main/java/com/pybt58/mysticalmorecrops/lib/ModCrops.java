package com.pybt58.mysticalmorecrops.lib;

import com.blakebr0.mysticalagriculture.api.crop.Crop;
import com.blakebr0.mysticalagriculture.api.crop.CropTier;
import com.blakebr0.mysticalagriculture.api.crop.CropType;
import com.blakebr0.mysticalagriculture.api.lib.LazyIngredient;
import com.blakebr0.mysticalagriculture.api.registry.ICropRegistry;
import com.blakebr0.mysticalagriculture.api.util.MobSoulUtils;
import com.blakebr0.mysticalagriculture.init.ModItems;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import com.pybt58.mysticalmorecrops.config.ModConfigs;
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

    // 以下は EXAMPLE Crop　(パラメータ　Tier3, ResourceLocation "mysticalmorecrops:example", CropType MOB, 種の作成に必要な材料に MobSoulTypes.EXAMPLE_SOUL が入った SoulJar）を登録する例
    // EXAMPLE_SOULのパラメータは　ModMobSoulTypes.java　で設定する
    //
    //public static final Crop EXAMPLE = new Crop(MysticalMoreCrops.resource("example"), CropTier.THREE, CropType.MOB, LazyIngredient.item("mysticalagriculture:soul_jar", MobSoulUtils.makeTag(ModMobSoulTypes.EXAMPLE_SOUL)));
    //
    // Mystical AgricultureのCropではTierが設定されている。Tier1から5まで存在し、数字が大きいほど希少なリソースを栽培できる。たとえば木や土はTier1で、ダイヤモンドやエメラルドはTier5である。今回の例ではTier3にした。
    // CropTypeは作物ブロックの茎の見た目を決定する。CropType.RESOURCE, CropType.MOB の二種類のみである。見た目以外の挙動については、特に違いはない。既存のCropに倣うなら、Soulに関係ないものについてはRESOURCEを、関係あるものはMOBを指定することになる。
    // LazyIngredient.item() ではそのCropの種を作成するのに必要なアイテムのResourceLocationを指定する。Soulに関連するCropの場合、第一引数に "mysticalagriculture:soul_jar" ,第二引数に MobSoulUtils.makeTag(ModMobSoulTypes.???) と指定する。

    public static void onRegisterCrops(ICropRegistry registry) {
        SUPREMIUM.getTextures().setEssenceTexture(MysticalMoreCrops.maResource("item/supremium_essence"));
        SUPREMIUM.getRecipeConfig().setSeedCraftingRecipeEnabled(false).setSeedInfusionRecipeEnabled(false);
        SUPREMIUM.setCropBlock(() -> (CropBlock) ModBlocks.SUPREMIUM_CROP.get()).setEssenceItem(ModItems.SUPREMIUM_ESSENCE);

        PROSPERITY.getRecipeConfig().setSeedCraftingRecipeEnabled(false).setSeedInfusionRecipeEnabled(false);

        registry.register(SUPREMIUM.setEnabled(ModConfigs.ENABLE_SUPREMIUM_CROP.get()));
        registry.register(PROSPERITY.setEnabled(ModConfigs.ENABLE_PROSPERITY_CROP.get()));

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

        // 上で定義したCropをここで登録させる。もし特定のModを併用している環境下のみで有効にしたい場合は、withRequiredModsメゾットを利用する
        // 以下は、EXAMPLE Crop を、modidが”examplemod”のmodを併用している環境下のみで有効にしたい場合の例である
        //
        //registry.register(withRequiredMods(EXAMPLE, "examplemod"));
        //
        // なお、withRequiredModsメゾットの引数のmodidは複数指定できる。複数のmodが全て入っている場合にのみ有効にしたい場合に。
    }

    public static void onPostRegisterCrops(ICropRegistry registry) {
        SUPREMIUM.setCruxBlock(com.blakebr0.mysticalagriculture.init.ModBlocks.AWAKENED_SUPREMIUM_GEMSTONE_BLOCK);
        PROSPERITY.setCruxBlock(com.blakebr0.mysticalagriculture.init.ModBlocks.AWAKENED_SUPREMIUM_INGOT_BLOCK);

        // ここではCropを登録した後で行う処理を書く。Mystical Agriculture ではTierとCropTypeの登録を行っているが、このmodでは専らCropのCruxの設定に使う
        // 以下は、EXAMPLE Crop の核に、ダイヤモンドブロックを指定する場合の例である
        //
        //EXAMPLE.setCruxBlock(() -> net.minecraft.world.level.block.Blocks.DIAMOND_BLOCK);
        //
        // この場合、EXAMPLEのCropを栽培するには、植えられた耕地ブロックの直下にダイヤモンドブロックがなければならなくなり、その情報をJEIで確認できるようになる
        // setCrux() メゾットの引数は　Supplier<Block> である。modで定義された、RegistryObject<Block>型変数ならばそのままでよい。
        // しかし、バニラのBlocksクラス内で定義された変数を利用したい場合は、変数の型がBlockなので、Supplierの形式にする必要がある

        // MobSoulTypeの定義が終わっている、または必要ないなら、これでコードの追加は完了。あとはレシピjsonファイルとアセットの追加である。
        // レシピjsonファイルの追加先は、resource/data/mysticalmorecrops/recipes フォルダ内ならどこでも構わないが、混乱を避けるために適切な場所(例えばスポーンエッグ作成レシピならspawneggフォルダ内)に置くほうが良い
        // 注意:soulのResourceLocationのnamespaceはmysticalmorecropsだが、エッセンス、種のnamespaceは"mysticalagriculture"である
    }

    public static Crop withRequiredAnyMods(Crop crop, String... mods) {
        boolean enabled = Arrays.stream(mods).anyMatch(ModList.get()::isLoaded);
        return crop.setEnabled(enabled);
    }
    public static Crop withRequiredAllMods(Crop crop, String... mods) {
        boolean enabled = Arrays.stream(mods).allMatch(ModList.get()::isLoaded);
        return crop.setEnabled(enabled);
    }


}
