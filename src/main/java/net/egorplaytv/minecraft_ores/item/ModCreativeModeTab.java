package net.egorplaytv.minecraft_ores.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab MINECRAFT_ORES = new CreativeModeTab("minecraft_ores") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.COAL_ORE);
        }
    };
}
