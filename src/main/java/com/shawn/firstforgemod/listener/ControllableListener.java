package com.shawn.firstforgemod.listener;

import com.mrcrayfish.controllable.client.input.Controller;
import com.mrcrayfish.controllable.event.ControllerEvents;
import com.shawn.firstforgemod.FirstForgeMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
//import com.mrcrayfish.controllable.event.RenderPlayerPreviewEvent;


import com.mrcrayfish.controllable.event.ControllerEvents;
import com.shawn.firstforgemod.FirstForgeMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstForgeMod.MODID)
public class ControllableListener implements ControllerEvents.Button {

    //
    //@SubscribeEvent
    //public static void handleGettingHurt(LivingHurtEvent event) {
    //    System.out.println("Something got hurt.");
    //    if (event.getEntity() != null && event.getEntity() instanceof Player) {
    //        Player player = (Player) event.getEntity();
    //        player.sendSystemMessage(Component.literal("You got hurt!"));
    //    }
   // }



   // @SubscribeEvent
  //  public static void handleInput(ControllerEvents.Button event) {
 //       System.out.println("Item picked up!");
//
    //}

    @Override
    public boolean handle(Controller controller) {

        System.out.println("Button PRessed!!");
        return false;
    }
}
