package net.mikits.heartstrings;

import net.fabricmc.api.ModInitializer;
import net.mikits.heartstrings.item.ModItemGroups;
import net.mikits.heartstrings.item.ModItems;
import net.mikits.heartstrings.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Heartstrings implements ModInitializer {
	public static final String MOD_ID = "heartstrings";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModItemGroups.registerItemGroups();

		ModSounds.registerSounds();
	}
}