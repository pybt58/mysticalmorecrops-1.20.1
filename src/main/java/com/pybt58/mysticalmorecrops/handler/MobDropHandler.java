package com.pybt58.mysticalmorecrops.handler;

import com.blakebr0.mysticalagriculture.api.tinkering.ITinkerable;
import com.blakebr0.mysticalagriculture.init.ModEnchantments;
import com.pybt58.mysticalmorecrops.init.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.PatrollingMonster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public final class MobDropHandler {
    @SubscribeEvent
    public void onLivingDrops(LivingDropsEvent event) { //todo 実際にドロップするか確認
        LivingEntity entity = event.getEntity();
        Level level = entity.level();

        if (!level.getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT))
            return;

        var drops = event.getDrops();
        var attacker = event.getSource().getEntity();

        if (entity instanceof PatrollingMonster) {
            if (attacker instanceof Player player) {
                var held = player.getMainHandItem();
                var item = held.getItem();
                if (item instanceof ITinkerable) {
                    var enlightenmentLevel = EnchantmentHelper.getTagEnchantmentLevel(ModEnchantments.MYSTICAL_ENLIGHTENMENT.get(), held);
                    if (enlightenmentLevel > 0) {
                        var additionalDrop = new ItemStack(ModItems.EVIL_INTENTION.get(), enlightenmentLevel + 3);
                        drops.add(new ItemEntity(level, entity.getX(), entity.getY(), entity.getZ(), additionalDrop));
                    }
                }
            }
        }
    }
}
