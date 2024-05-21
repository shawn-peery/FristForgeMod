package com.shawn.firstforgemod.listener;

import com.mrcrayfish.controllable.client.input.Controller;
import com.mrcrayfish.controllable.event.ControllerEvents;
import com.shawn.firstforgemod.FirstForgeMod;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = FirstForgeMod.MODID)
public class ControllableListener implements ControllerEvents.Button {

    private static boolean interatingLocked = false;

    private static Float previousRValue = null;

    @Override
    public boolean handle(Controller controller) {


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        float rTriggerValue = controller.getRTriggerValue();


        System.out.printf("rTriggerValue: %f%n", rTriggerValue);

        System.out.printf("previousRValue: %f%n", previousRValue);
        if (previousRValue == null) {

            System.out.print("previousRValue is null. setting it to previous r value and returning.");
            previousRValue = rTriggerValue;
            return false;
        }

        System.out.printf("previousRValue is not null!");

        if (previousRValue >= rTriggerValue) {

            System.out.print("previousRValue is greaterthan or equal to rTriggerValue. Returning");
            return false;
        }

        interatingLocked = !interatingLocked;

        System.out.print("Toggling Mining. New value:" + interatingLocked);

        KeyMapping.click(Minecraft.getInstance().options.keyAttack.getKey());
        Minecraft.getInstance().options.keyAttack.setDown(interatingLocked);
        return false;

    }
}
