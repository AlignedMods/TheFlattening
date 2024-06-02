package net.aligned.flattening.util;

import net.aligned.flattening.block.ModBlocks;
import net.aligned.flattening.item.ModItems;
import net.aligned.flattening.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ENDER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.OAK_LOG.asItem(), 16),
                            new ItemStack(Items.COBBLESTONE, 2),
                            6, 12, 0.075f));
                });

    }
}
