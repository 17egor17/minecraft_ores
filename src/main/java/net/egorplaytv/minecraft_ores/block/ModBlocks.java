package net.egorplaytv.minecraft_ores.block;

import net.egorplaytv.minecraft_ores.MinecraftOres;
import net.egorplaytv.minecraft_ores.item.ModCreativeModeTab;
import net.egorplaytv.minecraft_ores.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftOres.MOD_ID);

    public static final RegistryObject<Block> ANDESITE_COAL_ORE = registerBlock("andesite_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);
    public static final RegistryObject<Block> CALCITE_COAL_ORE = registerBlock("calcite_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);
    public static final RegistryObject<Block> DIORITE_COAL_ORE = registerBlock("diorite_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);
    public static final RegistryObject<Block> DIRT_COAL_ORE = registerBlock("dirt_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);
    public static final RegistryObject<Block> DRIPSTONE_COAL_ORE = registerBlock("dripstone_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);
    public static final RegistryObject<Block> GRANITE_COAL_ORE = registerBlock("granite_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);
    public static final RegistryObject<Block> GRAVEL_COAL_ORE = registerBlock("gravel_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);
    public static final RegistryObject<Block> TUFF_COAL_ORE = registerBlock("tuff_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AIR).strength(3.0F, 3.0F).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MINECRAFT_ORES);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                        CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
