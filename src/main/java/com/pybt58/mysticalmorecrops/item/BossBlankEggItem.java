package com.pybt58.mysticalmorecrops.item;

import com.blakebr0.cucumber.item.BaseItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class BossBlankEggItem extends BaseItem {
    public BossBlankEggItem() {
        super(p -> p.rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
