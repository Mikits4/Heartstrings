package net.mikits.heartstrings.sound;

import net.mikits.heartstrings.Heartstrings;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent SONG_NAME = registerSoundEvent("song_name");

    public static final RegistryKey<JukeboxSong> SONG_NAME_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Heartstrings.MOD_ID, "song_name"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Heartstrings.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Heartstrings.LOGGER.info("Registering Mod Sounds for " + Heartstrings.MOD_ID);
    }
}
