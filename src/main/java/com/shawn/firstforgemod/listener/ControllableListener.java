package com.shawn.firstforgemod.listener;

import com.mrcrayfish.controllable.client.input.Controller;
import com.mrcrayfish.controllable.event.ControllerEvents;
import com.shawn.firstforgemod.FirstForgeMod;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = FirstForgeMod.MODID)
public class ControllableListener implements ControllerEvents.Button {

    @Override
    public boolean handle(Controller controller) {

        System.out.println("Right Trigger Value:");
        System.out.println(controller.getRTriggerValue());

        System.out.println("Name: controller.getName()");
        System.out.println(controller.getName());

        KeyMapping.click(Minecraft.getInstance().options.keyAttack.getKey());
        Minecraft.getInstance().options.keyAttack.setDown(true);
        return false;
    }
}
