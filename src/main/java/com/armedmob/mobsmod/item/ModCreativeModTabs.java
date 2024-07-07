package com.armedmob.mobsmod.item;

import com.armedmob.mobsmod.MobsMod;
import com.armedmob.mobsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MobsMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MOBSMOD_TAB = CREATIVE_MODE_TABS.register("mobsmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.mobsmod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());

                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get());
                        output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
