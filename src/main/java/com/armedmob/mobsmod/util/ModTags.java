package com.armedmob.mobsmod.util;

import com.armedmob.mobsmod.MobsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> Mobs_Mod_Ores = tag("mobs_ores");
        public static final TagKey<Block> Mobs_Mod_Blocks = tag("mobs_blocks");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MobsMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> Mobs_Mod_Gems = tag("mobs_gems");
        public static final TagKey<Item> Mobs_Mod_Raw_Ores = tag("mobs_raw_ores");
        public static final TagKey<Item> Mobs_Mod_Ingots = tag("mobs_ingots");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MobsMod.MOD_ID, name));
        }
    }
}
