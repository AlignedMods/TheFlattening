package net.aligned.flattening.item;

import net.aligned.flattening.TheFlattening;
import net.aligned.flattening.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup THE_FLATTENING_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheFlattening.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);

                        entries.add(ModBlocks.INITIALIZER);
                    }).build());

    public static void registerItemGroups()
    {
        TheFlattening.LOGGER.info("registering item groups for " + TheFlattening.MOD_ID);
    }

}
