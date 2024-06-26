package net.aligned.flattening.block;

import net.aligned.flattening.TheFlattening;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block INITIALIZER = registerBlock("initializer",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheFlattening.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(TheFlattening.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void  registerModBlocks()
    {
        TheFlattening.LOGGER.info("registering modblocks for " + TheFlattening.MOD_ID);
    }

}
