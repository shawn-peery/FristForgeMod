package com.shawn.firstforgemod.listener;

import com.shawn.firstforgemod.FirstForgeMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstForgeMod.MODID)
public class ControllableListener {

    @SubscribeEvent
    public static void pickupItem(LivingHurtEvent event) {
        System.out.println("Item picked up!");
        if (event.getEntity() != null && event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            player.sendSystemMessage(Component.literal("You picked up something!"));
        }
    }

}
