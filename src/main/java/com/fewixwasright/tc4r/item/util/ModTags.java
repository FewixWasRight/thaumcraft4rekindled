package com.fewixwasright.tc4r.item.util;

import com.fewixwasright.tc4r.ThaumCraft4Rekindled;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_THAUMIUM_TOOL = createTag("needs_thaumium_tool");
        public static final TagKey<Block> INCORRECT_FOR_THAUMIUM_TOOL = createTag("incorrect_for_thaumium_tool");
    }
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ThaumCraft4Rekindled.MODID, name));





    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ThaumCraft4Rekindled.MODID, name));
        }
    }
}
