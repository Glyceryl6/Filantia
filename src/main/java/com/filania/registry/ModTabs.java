package com.filania.registry;

import com.filania.Filania;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Filania.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab
            .builder().title(Component.translatable("itemGroup." + Filania.MOD_ID))
            .icon(() -> new ItemStack(ModItems.FILA_STRING.get()))
            .displayItems((params, output) -> ModItems.ITEMS.getEntries()
                    .forEach(item -> output.accept(item.get()))).build());

}