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

    private static boolean evenHit = false;


    @Override
    public boolean handle(Controller controller) {

        if (!evenHit) {
            evenHit = true;
            return false;
        }

        evenHit = false;


        interatingLocked = !interatingLocked;

        System.out.print("Toggling Mining. New value:" + interatingLocked);

        KeyMapping.click(Minecraft.getInstance().options.keyAttack.getKey());
        Minecraft.getInstance().options.keyAttack.setDown(interatingLocked);
        return false;

    }
}
