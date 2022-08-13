package net.chaseyy.advancedelectronics;

import net.chaseyy.advancedelectronics.block.ModBlocks;
import net.chaseyy.advancedelectronics.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedElectronics implements ModInitializer {

	public static final String MODID = "advancedelectronics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
