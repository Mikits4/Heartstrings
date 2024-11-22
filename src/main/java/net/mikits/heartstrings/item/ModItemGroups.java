package net.mikits.heartstrings.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mikits.heartstrings.Heartstrings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HEARTSRINGS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Heartstrings.MOD_ID, "heartstrings_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.SONG_NAME_MUSIC_DISC)) //group icon
                    .displayName(Text.translatable("itemGroup.heartstrings.heartstrings_items"))
                    .entries((displayContext, entries) -> { //group entries into this group, yoinks it from ModBlocks
                        entries.add(ModItems.SONG_NAME_MUSIC_DISC);
                    }).build());

    public static void registerItemGroups() {
        Heartstrings.LOGGER.info("Registering Item Groups for " + Heartstrings.MOD_ID);
    }
}
