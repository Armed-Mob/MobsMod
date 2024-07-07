package com.armedmob.mobsmod.datagen;

import com.armedmob.mobsmod.MobsMod;
import com.armedmob.mobsmod.block.ModBlocks;
import com.armedmob.mobsmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MobsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(ModTags.Blocks.Mobs_Mod_Ores)
                .add(ModBlocks.SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK.get()
                ).addTag(Tags.Blocks.ORES);

        this.tag(ModTags.Blocks.Mobs_Mod_Blocks)
                .add(ModBlocks.SAPPHIRE_BLOCK.get()
                );


        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK.get()
                );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE_BLOCK.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(BlockTags.MINEABLE_WITH_HOE);

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL);
    }
}
