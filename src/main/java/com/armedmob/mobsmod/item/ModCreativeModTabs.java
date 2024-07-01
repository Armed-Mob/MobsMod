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
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
