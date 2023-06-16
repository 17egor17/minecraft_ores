package net.egorplaytv.minecraft_ores.util;

import net.egorplaytv.minecraft_ores.MinecraftOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public final TagKey<Item> tag;

    public final boolean alwaysDatazen;

    public ModTags(TagKey<Item> tag, boolean alwaysDatazen) {
        this.tag = tag;
        this.alwaysDatazen = alwaysDatazen;
    }

    public static class Blocks {
        public static final TagKey<Block> ALMOND_LOGS = tag("almond_logs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MinecraftOres.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> MEET = tag("meet");
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MinecraftOres.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
