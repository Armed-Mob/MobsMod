package com.armedmob.mobsmod.datagen;

import com.armedmob.mobsmod.MobsMod;
import com.armedmob.mobsmod.item.ModItems;
import com.armedmob.mobsmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MobsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ModTags.Items.Mobs_Mod_Gems)
                .add(ModItems.SAPPHIRE.get()
                ).addTag(Tags.Items.GEMS);

        this.tag(ModTags.Items.Mobs_Mod_Ingots);

        this.tag(ModTags.Items.Mobs_Mod_Raw_Ores)
                .add(ModItems.RAW_SAPPHIRE.get()
                ).addTag(Tags.Items.RAW_MATERIALS);
    }
}
