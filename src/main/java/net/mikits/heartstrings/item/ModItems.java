package net.mikits.heartstrings.item;

import net.mikits.heartstrings.Heartstrings;
import net.mikits.heartstrings.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SONG_NAME_MUSIC_DISC = registerItem("song_name_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.SONG_NAME_KEY).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Heartstrings.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Heartstrings.LOGGER.info("Registering Mod Items for " + Heartstrings.MOD_ID);
    }
}