package com.armedmob.mobsmod.datagen;

import com.armedmob.mobsmod.MobsMod;
import com.armedmob.mobsmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MobsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.SAPPHIRE_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK);
        blockWithItem(ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}