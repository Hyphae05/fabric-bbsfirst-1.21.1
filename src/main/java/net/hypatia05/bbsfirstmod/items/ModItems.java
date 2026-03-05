package net.hypatia05.bbsfirstmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hypatia05.bbsfirstmod.BBsFirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BLAHAJ_SWORD = registerItem("blahaj_sword", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BBsFirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BBsFirstMod.LOGGER.info("Registering mod items for " + BBsFirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLAHAJ_SWORD);
        });
    }
}
