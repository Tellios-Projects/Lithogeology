package net.leafenzo.lithogeology.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leafenzo.lithogeology.ModInit;
import net.leafenzo.lithogeology.Super;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//    /** Debug Owo */
//    public static final Item CAT_FOOD = registerItem(
//            "cat_food",
//            new Item(new Item.Settings()),
//            ItemGroups.lithogeology
//    );

    /** .name must not contain uppercase letters or special characters */
    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(Super.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ModInit.LOGGER.debug("Registering mod items for " + Super.MOD_ID);
    }
}
