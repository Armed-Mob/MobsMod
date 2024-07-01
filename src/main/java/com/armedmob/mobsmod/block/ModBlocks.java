package com.armedmob.mobsmod.block;

import com.armedmob.mobsmod.MobsMod;
import com.armedmob.mobsmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MobsMod.MOD_ID);


    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> SAPPHIRE_ORE_BLOCK = registerBlock("sapphire_ore_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE_BLOCK = registerBlock("deepslate_sapphire_ore_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3.0F, 5.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE_BLOCK = registerBlock("nether_sapphire_ore_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(3.0F, 5.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> END_STONE_SAPPHIRE_ORE_BLOCK = registerBlock("end_stone_sapphire_ore_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(3.0F, 6.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
