package com.shawn.firstforgemod.item;

import com.shawn.firstforgemod.FirstForgeMod;
import com.shawn.firstforgemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstForgeMod.MODID);

    public static final RegistryObject<CreativeModeTab> FIRST_FORGE_MOD_TAB = CREATIVE_MODE_TABS.register("first_forge_mod_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
            .title(Component.translatable("creativetab.first_forge_mod_tab"))
            .displayItems((itemDisplayParameters, output) ->{
                output.accept(ModItems.SAPPHIRE.get());
                output.accept(ModItems.RAW_SAPPHIRE.get());
                output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
            } )
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
