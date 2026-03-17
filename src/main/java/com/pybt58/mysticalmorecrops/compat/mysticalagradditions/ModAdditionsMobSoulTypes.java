package com.pybt58.mysticalmorecrops.compat.mysticalagradditions;

import com.blakebr0.mysticalagriculture.api.registry.IMobSoulTypeRegistry;
import com.blakebr0.mysticalagriculture.api.soul.MobSoulType;
import net.minecraftforge.fml.ModList;

import java.util.*;

// 絶対にこのクラスを不用意に参照しないこと！mysticalagradditionsがあることが確定している処理内でのみ参照すること
public final class ModAdditionsMobSoulTypes {
    // new crop ids
    // new crop define
    // modify crop ids

    public static void onRegisterMobSoulTypes(IMobSoulTypeRegistry registry) {
        // registry.register(...);
    }

    private static MobSoulType withRequiredMods(MobSoulType type, String... mods) {
        return type.setEnabled(Arrays.stream(mods).anyMatch(ModList.get()::isLoaded));
    }
}
