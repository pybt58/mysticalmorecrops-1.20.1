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
    // 以下はsoulType魚の例
    // mobのセットを定義
    // private static final Set<ResourceLocation> FISH_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:cod"), ResourceLocation.parse("minecraft:salmon"), ResourceLocation.parse("minecraft:tropical_fish"), ResourceLocation.parse("minecraft:pufferfish"));
    // 条件に応じてセット変更 下の例では、"modname"モッドがロードされるなら、modFishをFISH_IDSセットに追加している
    // static{ if(ModList.get().isLoaded("modname")) { add(FISH_IDS, "modname:modFish") }}
    // ソウルタイプ”魚”の定義
    // public static final MobSoulType FISH = new MobSoulType(MysticalMoreCrops.resource("fish"), FISH_IDS, "fish", 6, 12691306);
    private static final Set<ResourceLocation> ALLAY_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:allay"), ResourceLocation.parse("minecraft:vex"));
    private static final Set<ResourceLocation> AMPHIBIAN_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:axolotl"), ResourceLocation.parse("minecraft:frog"), ResourceLocation.parse("minecraft:tadpole"));
    private static final Set<ResourceLocation> BAT_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:bat"));
    private static final Set<ResourceLocation> BEAR_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:panda"), ResourceLocation.parse("minecraft:polar_bear"));
    private static final Set<ResourceLocation> CAT_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:cat"), ResourceLocation.parse("minecraft:ocelot"));
    private static final Set<ResourceLocation> DOLPHIN_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:dolphin"));
    private static final Set<ResourceLocation> FOX_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:fox"));
    private static final Set<ResourceLocation> GOLEM_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:iron_golem"), ResourceLocation.parse("minecraft:snow_golem"), ResourceLocation.parse("minecraft:warden"));
    private static final Set<ResourceLocation> HORSE_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:horse"), ResourceLocation.parse("minecraft:donkey"), ResourceLocation.parse("minecraft:mule"), ResourceLocation.parse("minecraft:skeleton_horse"));
    private static final Set<ResourceLocation> HUMAN_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:pillager"), ResourceLocation.parse("minecraft:vindicator"), ResourceLocation.parse("minecraft:witch"), ResourceLocation.parse("minecraft:evoker"), ResourceLocation.parse("minecraft:piglin"), ResourceLocation.parse("minecraft:piglin_brute"));
    private static final Set<ResourceLocation> LLAMA_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:camel"), ResourceLocation.parse("minecraft:llama"), ResourceLocation.parse("minecraft:trader_llama"));
    private static final Set<ResourceLocation> MITE_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:endermite"), ResourceLocation.parse("minecraft:silverfish"));
    private static final Set<ResourceLocation> SHULKER_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:shulker"));
    private static final Set<ResourceLocation> SNIFFER_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:sniffer"));
    private static final Set<ResourceLocation> STRIDER_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:strider"));
    private static final Set<ResourceLocation> WOLF_IDS = Sets.newHashSet(ResourceLocation.parse("minecraft:wolf"));
    private static final Set<ResourceLocation> EVIL_IDS = Sets.newHashSet();// 村人を倒してもHUMANは手に入らないし、イリジャー系を倒してもEVILは手に入らない
    //private static final Set<ResourceLocation> GRIMOIRE_IDS = Sets.newHashSet();
    /*
    static {
        if (ModList.get().isLoaded("grimoireofgaia")) {
            CAT_IDS.addAll(Set.of(ResourceLocation.parse("grimoireofgaia:werecat"), ・・・));
            WOLF_IDS.addAll(Set.of(ResourceLocation.parse("grimoireofgaia:kobold"), ResourceLocation.parse("grimoireofgaia:anubis")));
            ...
        }
    }
    */

    public static final MobSoulType ALLAY = new MobSoulType(MysticalMoreCrops.resource("allay"), ALLAY_IDS, "allay", 6, 0x3DE0F7);
    public static final MobSoulType AMPHIBIAN = new MobSoulType(MysticalMoreCrops.resource("amphibian"), AMPHIBIAN_IDS, "amphibian", 6, 0x8690F5);
    public static final MobSoulType BAT = new MobSoulType(MysticalMoreCrops.resource("bat"), BAT_IDS, "bat", 6, 0x26211F);
    public static final MobSoulType BEAR = new MobSoulType(MysticalMoreCrops.resource("bear"), BEAR_IDS, "bear", 6, 0xD5D6CD);
    public static final MobSoulType CAT = new MobSoulType(MysticalMoreCrops.resource("cat"), CAT_IDS, "cat", 6, 0x161524);
    public static final MobSoulType DOLPHIN = new MobSoulType(MysticalMoreCrops.resource("dolphin"), DOLPHIN_IDS, "dolphin", 6, 0x88A3BE);
    public static final MobSoulType FOX = new MobSoulType(MysticalMoreCrops.resource("fox"), FOX_IDS, "fox", 6, 0xE27C21);
    public static final MobSoulType GOLEM = new MobSoulType(MysticalMoreCrops.resource("golem"), GOLEM_IDS, "golem", 6, 0xDBCDC2);
    public static final MobSoulType HORSE = new MobSoulType(MysticalMoreCrops.resource("horse"), HORSE_IDS, "horse", 6, 0x3F1B08);
    public static final MobSoulType HUMAN = new MobSoulType(MysticalMoreCrops.resource("human"), HUMAN_IDS, "human", 6, 0xBE886C);
    public static final MobSoulType LLAMA = new MobSoulType(MysticalMoreCrops.resource("llama"), LLAMA_IDS, "llama", 6, 0xFCEBC6);
    public static final MobSoulType MITE = new MobSoulType(MysticalMoreCrops.resource("mite"), MITE_IDS, "mite", 6, 0x5C5C64);
    public static final MobSoulType SHULKER = new MobSoulType(MysticalMoreCrops.resource("shulker"), SHULKER_IDS, "shulker", 6, 0x976997);
    public static final MobSoulType SNIFFER = new MobSoulType(MysticalMoreCrops.resource("sniffer"), SNIFFER_IDS, "sniffer", 6, 0x134733);
    public static final MobSoulType STRIDER = new MobSoulType(MysticalMoreCrops.resource("strider"), STRIDER_IDS, "strider", 6, 0x9C3436);
    public static final MobSoulType WOLF = new MobSoulType(MysticalMoreCrops.resource("wolf"), WOLF_IDS, "wolf", 6, 0xDDDADB);
    public static final MobSoulType EVIL = new MobSoulType(MysticalMoreCrops.resource("evil"), EVIL_IDS, "evil", 6, 0x2A4455);
    //public static final MobSoulType GRIMOIRE = new MobSoulType(MysticalMoreCrops.resource("grimoire"), GRIMOIRE_IDS, "grimoire", 6, -1);
    //...

    // ↑ここまで新たなmobSoulTypeの作成 ↓ここから既存のmobSoulTypeの改変
    // MobSoulTypeの改変用Map MobSoulTypeのResourceLocation:そのソウルタイプの対象に追加するモブのResourceLocationのリスト
    private static final Set<ResourceLocation> AD_BLAZE_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_CHICKEN_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:parrot")));
    private static final Set<ResourceLocation> AD_COW_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:mooshroom"), ResourceLocation.parse("minecraft:ravager")));
    private static final Set<ResourceLocation> AD_CREEPER_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_ENDERMAN_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_FISH_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:guardian"), ResourceLocation.parse("minecraft:elder_guardian")));
    private static final Set<ResourceLocation> AD_GHAST_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_PIG_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:hoglin")));
    private static final Set<ResourceLocation> AD_RABBIT_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_SHEEP_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:goat")));
    private static final Set<ResourceLocation> AD_SKELETON_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_SLIME_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:magma_cube")));
    private static final Set<ResourceLocation> AD_SPIDER_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_SQUID_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:glow_squid")));
    private static final Set<ResourceLocation> AD_TURTLE_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_WITHER_IDS = new HashSet<>();
    private static final Set<ResourceLocation> AD_ZOMBIE_IDS = new HashSet<>(Set.of(ResourceLocation.parse("minecraft:zombified_piglin"), ResourceLocation.parse("minecraft:zoglin")));

    public static final Map<ResourceLocation, Set<ResourceLocation>> MODIFY_ENTITY_ADDITIONS_MAP = new HashMap<>();
    static{
        // 他modのmobを、mystical agriculture modが元から実装しているMobSoulTypeに組み込む場合、ここで AD_ValueName_IDS に追加
        /*
        if (ModList.get().isLoaded("grimoireofgaia")) {
            AD_SPIDER_IDS.addAll(Set.of(ResourceLocation.parse("grimoireoffaia:arachne"),・・・));
            AD_ENDERMAN_IDS.addAll(Set.of(ResourceLocation.parse("grimoireofgaia:behender"),・・・));
            AD_SKELETON_IDS.addAll(Set.of(ResourceLocation.parse("grimoireofgaia:bone_knight"),・・・));
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
