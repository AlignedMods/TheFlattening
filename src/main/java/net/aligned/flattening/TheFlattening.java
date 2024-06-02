package net.aligned.flattening;

import net.aligned.flattening.block.ModBlocks;
import net.aligned.flattening.item.ModItemGroups;
import net.aligned.flattening.item.ModItems;
import net.aligned.flattening.util.ModCustomTrades;
import net.aligned.flattening.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheFlattening implements ModInitializer {
	public static final String MOD_ID = "flattening";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();


		LOGGER.info("Hello Fabric world!");
	}
}