package com.pybt58.mysticalmorecrops.lib;

import com.blakebr0.mysticalagriculture.api.registry.IMobSoulTypeRegistry;
import com.blakebr0.mysticalagriculture.api.soul.MobSoulType;
import com.google.common.collect.Sets;
import com.pybt58.mysticalmorecrops.MysticalMoreCrops;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModList;

import java.util.*;

public final class ModMobSoulTypes {
    // 新しいMobSoulTypeの定義と登録
    // mobのResourceLocationのセット 共通のソウルタイプを得られるmobを複数設定する場合に必要
    // ロードするmodに合わせて、空の新しいソウルタイプを定義することも可能
    // 以下は "examplemod:ex1-1"と"examplemod:ex1-2"をResourceLocationとするモブのMobSoulTypeを定義する例
    //
    // mobのSetsを定義
    //private static final Set<ResourceLocation> EXAMPLEMOB_IDS = Sets.newHashSet(new ResourceLocation("examplemod:ex1-1"), new ResourceLocation("examplemod:ex1-2"));

    // ソウルタイプ”魚”の定義
    // public static final MobSoulType FISH = new MobSoulType(MysticalMoreCrops.resource("fish"), FISH_IDS, "fish", 6, 12691306);
    private static final Set<ResourceLocation> ALLAY_IDS = Sets.newHashSet(new ResourceLocation("minecraft:allay"), new ResourceLocation("minecraft:vex"));
    private static final Set<ResourceLocation> AMPHIBIAN_IDS = Sets.newHashSet(new ResourceLocation("minecraft:axolotl"), new ResourceLocation("minecraft:frog"), new ResourceLocation("minecraft:tadpole"));
    private static final Set<ResourceLocation> BAT_IDS = Sets.newHashSet(new ResourceLocation("minecraft:bat"));
    private static final Set<ResourceLocation> BEAR_IDS = Sets.newHashSet(new ResourceLocation("minecraft:panda"), new ResourceLocation("minecraft:polar_bear"));
    private static final Set<ResourceLocation> CAT_IDS = Sets.newHashSet(new ResourceLocation("minecraft:cat"), new ResourceLocation("minecraft:ocelot"));
    private static final Set<ResourceLocation> DOLPHIN_IDS = Sets.newHashSet(new ResourceLocation("minecraft:dolphin"));
    private static final Set<ResourceLocation> FOX_IDS = Sets.newHashSet(new ResourceLocation("minecraft:fox"));
    private static final Set<ResourceLocation> GOLEM_IDS = Sets.newHashSet(new ResourceLocation("minecraft:iron_golem"), new ResourceLocation("minecraft:snow_golem"), new ResourceLocation("minecraft:warden"));
    private static final Set<ResourceLocation> HORSE_IDS = Sets.newHashSet(new ResourceLocation("minecraft:horse"), new ResourceLocation("minecraft:donkey"), new ResourceLocation("minecraft:mule"), new ResourceLocation("minecraft:skeleton_horse"));
    private static final Set<ResourceLocation> HUMAN_IDS = Sets.newHashSet(new ResourceLocation("minecraft:pillager"), new ResourceLocation("minecraft:vindicator"), new ResourceLocation("minecraft:witch"), new ResourceLocation("minecraft:evoker"), new ResourceLocation("minecraft:piglin"), new ResourceLocation("minecraft:piglin_brute"));
    private static final Set<ResourceLocation> LLAMA_IDS = Sets.newHashSet(new ResourceLocation("minecraft:camel"), new ResourceLocation("minecraft:llama"), new ResourceLocation("minecraft:trader_llama"));
    private static final Set<ResourceLocation> MITE_IDS = Sets.newHashSet(new ResourceLocation("minecraft:endermite"), new ResourceLocation("minecraft:silverfish"));
    private static final Set<ResourceLocation> SHULKER_IDS = Sets.newHashSet(new ResourceLocation("minecraft:shulker"));
    private static final Set<ResourceLocation> SNIFFER_IDS = Sets.newHashSet(new ResourceLocation("minecraft:sniffer"));
    private static final Set<ResourceLocation> STRIDER_IDS = Sets.newHashSet(new ResourceLocation("minecraft:strider"));
    private static final Set<ResourceLocation> WOLF_IDS = Sets.newHashSet(new ResourceLocation("minecraft:wolf"));
    private static final Set<ResourceLocation> EVIL_IDS = Sets.newHashSet();// 村人を倒してもHUMANは手に入らないし、普通のイリジャー系を倒してもEVILは手に入らない

    // ここで、併用するmodに応じてSetsは変更できる。 下の例では、"examplemod2"をmodidとするmodがロードされるなら、"examplemod2:ex2-1"を追加するようにしている
    //
    //static{
    //      if(ModList.get().isLoaded("examplemod2")) {
    //              EXAMPLEMOB_IDS.add( new ResourceLocation("examplemod2:ex2-1"));
    //      }
    //}
    //
    // 複数追加する場合は、メゾットを addAll() に変更し、引数を Sets 型にする。"examplemod:ex1-3"をさらに追加する場合
    //
    //static{
    //      if(ModList.get().isLoaded("examplemod2")) {
    //              EXAMPLEMOB_IDS.addAll( Sets.newHashSet(new ResourceLocation("examplemod2:ex2-1"), new ResourceLocation("examplemod:ex1-3")));
    //      }
    //
    // もちろんSetsから要素を削除することもできる。肝心なのは、この段階でMobSoulTypeに対応するMobの集合の情報を確定させること。例の場合は EXAMPLE_IDS に対応する全てのMobのResourceLocationを過不足なく格納させること

    public static final MobSoulType ALLAY = new MobSoulType(MysticalMoreCrops.resource("allay"), ALLAY_IDS, "allay", 8 , 0x3DE0F7);
    public static final MobSoulType AMPHIBIAN = new MobSoulType(MysticalMoreCrops.resource("amphibian"), AMPHIBIAN_IDS, "amphibian", 6, 0x8690F5);
    public static final MobSoulType BAT = new MobSoulType(MysticalMoreCrops.resource("bat"), BAT_IDS, "bat", 4, 0x26211F);
    public static final MobSoulType BEAR = new MobSoulType(MysticalMoreCrops.resource("bear"), BEAR_IDS, "bear", 6, 0xD5D6CD);
    public static final MobSoulType CAT = new MobSoulType(MysticalMoreCrops.resource("cat"), CAT_IDS, "cat", 6, 0x161524);
    public static final MobSoulType DOLPHIN = new MobSoulType(MysticalMoreCrops.resource("dolphin"), DOLPHIN_IDS, "dolphin", 6, 0x88A3BE);
    public static final MobSoulType FOX = new MobSoulType(MysticalMoreCrops.resource("fox"), FOX_IDS, "fox", 6, 0xE27C21);
    public static final MobSoulType GOLEM = new MobSoulType(MysticalMoreCrops.resource("golem"), GOLEM_IDS, "golem", 12, 0xDBCDC2);
    public static final MobSoulType HORSE = new MobSoulType(MysticalMoreCrops.resource("horse"), HORSE_IDS, "horse", 8, 0x3F1B08);
    public static final MobSoulType HUMAN = new MobSoulType(MysticalMoreCrops.resource("human"), HUMAN_IDS, "human", 16, 0xBE886C);
    public static final MobSoulType LLAMA = new MobSoulType(MysticalMoreCrops.resource("llama"), LLAMA_IDS, "llama", 8, 0xFCEBC6);
    public static final MobSoulType MITE = new MobSoulType(MysticalMoreCrops.resource("mite"), MITE_IDS, "mite", 4, 0x5C5C64);
    public static final MobSoulType SHULKER = new MobSoulType(MysticalMoreCrops.resource("shulker"), SHULKER_IDS, "shulker", 10, 0x976997);
    public static final MobSoulType SNIFFER = new MobSoulType(MysticalMoreCrops.resource("sniffer"), SNIFFER_IDS, "sniffer", 6, 0x134733);
    public static final MobSoulType STRIDER = new MobSoulType(MysticalMoreCrops.resource("strider"), STRIDER_IDS, "strider", 6, 0x9C3436);
    public static final MobSoulType WOLF = new MobSoulType(MysticalMoreCrops.resource("wolf"), WOLF_IDS, "wolf", 8, 0xDDDADB);
    public static final MobSoulType EVIL = new MobSoulType(MysticalMoreCrops.resource("evil"), EVIL_IDS, "evil", 6, 0x2A4455);

    // ここで新しいMobSoulTypeを定義する。パラメータはMobSoulTypeのResourceLocationのpath, 先に定義したMobのResourceLocationのSets, (多分SoulJarのtooltip用の)翻訳キー, SoulJarを満タンにするのに必要なSoulの量、SoulJar内のSoulの色
    // 特に理由がない場合はpathと翻訳キーは同じでよい
    // 以下は MobSoulType.EXAMPLEMOB_CROP を定義する例である。SoulJar満タンに必要なSoulの量を6.00,色はRGBで(127, 127, 127)
    //
    //public static final MobSoulType EXAMPLEMOB_CROP = new MobSoulType(MysticalMoreCrops.resource("example"), EXAMPLEMOB_IDS, "example", 6, 0x7F8081);

    // ↑ここまで新たなmobSoulTypeの作成 ↓ここから既存のmobSoulTypeの改変
    // MobSoulTypeの改変用Map MobSoulTypeのResourceLocation:そのソウルタイプの対象に追加するモブのResourceLocationのリスト
    private static final Set<ResourceLocation> AD_BLAZE_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_CHICKEN_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:parrot")));
    private static final Set<ResourceLocation> AD_COW_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:mooshroom"), new ResourceLocation("minecraft:ravager")));
    private static final Set<ResourceLocation> AD_CREEPER_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_ENDERMAN_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_FISH_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:guardian"), new ResourceLocation("minecraft:elder_guardian")));
    private static final Set<ResourceLocation> AD_GHAST_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_PIG_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:hoglin")));
    private static final Set<ResourceLocation> AD_RABBIT_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_SHEEP_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:goat")));
    private static final Set<ResourceLocation> AD_SKELETON_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_SLIME_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:magma_cube")));
    private static final Set<ResourceLocation> AD_SPIDER_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_SQUID_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:glow_squid")));
    private static final Set<ResourceLocation> AD_TURTLE_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_WITHER_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_ZOMBIE_IDS = new HashSet<>(Set.of(new ResourceLocation("minecraft:zombified_piglin"), new ResourceLocation("minecraft:zoglin")));

    public static final Map<ResourceLocation, Set<ResourceLocation>> MODIFY_ENTITY_ADDITIONS_MAP = new HashMap<>();
    static{
        // 他modのmobを、mystical agriculture modが元から実装しているMobSoulTypeに組み込む場合、ここで AD_ValueName_IDS に追加
        /*
        if (ModList.get().isLoaded("grimoireofgaia")) {
            AD_SPIDER_IDS.addAll(Set.of(new ResourceLocation("grimoireoffaia:arachne"),・・・));
            AD_ENDERMAN_IDS.addAll(Set.of(new ResourceLocation("grimoireofgaia:behender"),・・・));
            AD_SKELETON_IDS.addAll(Set.of(new ResourceLocation("grimoireofgaia:bone_knight"),・・・));
        }
        */

        // MODIFY_ENTITY_ADDITIONS_MAP に改変するMobSoulTypeのResourceLocationと追加するmobのResourceLocationのリスト
        initModify();
    }

    // このmodおよび他のmodのMobSoulTypeの対象Mobを追加する、mixinでの使用も可能
    public static void addMobsToSoulType(ResourceLocation soulType, Set<ResourceLocation> mobIds) {
        MODIFY_ENTITY_ADDITIONS_MAP.computeIfAbsent(soulType, s -> new HashSet<>()).addAll(mobIds);
    }

    private static void initModify() {
        addMobsToSoulType(MysticalMoreCrops.maResource("blaze"), AD_BLAZE_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("chicken"), AD_CHICKEN_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("cow"), AD_COW_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("creeper"), AD_CREEPER_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("enderman"), AD_ENDERMAN_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("fish"), AD_FISH_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("ghast"), AD_GHAST_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("pig"), AD_PIG_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("rabbit"), AD_RABBIT_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("sheep"), AD_SHEEP_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("skeleton"), AD_SKELETON_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("slime"), AD_SLIME_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("spider"), AD_SPIDER_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("squid"), AD_SQUID_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("turtle"), AD_TURTLE_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("wither_skeleton"), AD_WITHER_IDS);
        addMobsToSoulType(MysticalMoreCrops.maResource("zombie"), AD_ZOMBIE_IDS);
        // mixin target ここでaddMobsToSoulType()使用
    }

    // このmodで追加する新たなMobSoulTypeを登録する。ModCorePlugin内で実行
    public static void onRegisterMobSoulTypes(IMobSoulTypeRegistry registry) {
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
        // 特定のmodがある場合にのみ登録する場合の例
        //registry.register(withRequiredMods(GRIMOIRE, "grimoireofgaia"));
        //...
    }
    // 特定のmodのいずれかが存在する場合にのみMobSoulTypeを登録
    private static MobSoulType withRequiredMods(MobSoulType type, String... mods) {
        return type.setEnabled(Arrays.stream(mods).anyMatch(ModList.get()::isLoaded));
    }

    public static void onPostRegisterMobSoulTypes(IMobSoulTypeRegistry registry) {
        MODIFY_ENTITY_ADDITIONS_MAP.forEach((rlMst, entities) -> {
            MobSoulType type = registry.getMobSoulTypeById(rlMst);
            if(!entities.isEmpty() && type != null){
                for (var entity : entities) {
                    var success = registry.addEntityTo(type, entity);
                    if (!success) {
                        MysticalMoreCrops.LOGGER.info("Modifying {}: Could not add entity {}.",rlMst, entity);
                    }
                }
            } else {
                MysticalMoreCrops.LOGGER.info("Modifying {}: This modify entity list is empty so skipped.", rlMst);
            }
        });
    }
}
