package com.armedmob.mobsmod.datagen.loot;

import com.armedmob.mobsmod.block.ModBlocks;
import com.armedmob.mobsmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());

        this.add(ModBlocks.SAPPHIRE_ORE_BLOCK.get(),
                block -> createMobsModOreDrops(ModBlocks.SAPPHIRE_ORE_BLOCK.get(), ModItems.RAW_SAPPHIRE.get())
        );
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(),
                block -> createMobsModOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(), ModItems.RAW_SAPPHIRE.get())
        );
        this.add(ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get(),
                block -> createMobsModOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get(), ModItems.RAW_SAPPHIRE.get())
        );
        this.add(ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK.get(),
                block -> createMobsModOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK.get(), ModItems.RAW_SAPPHIRE.get())
        );
    }

    protected LootTable.Builder createMobsModOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))
        );
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}