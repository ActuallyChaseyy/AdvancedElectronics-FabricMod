package net.chaseyy.advancedelectronics.item;

import net.chaseyy.advancedelectronics.AdvancedElectronics;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BATTERY = registerItems("battery",
            new Item(new FabricItemSettings().group(ItemGroup.REDSTONE)));


    private static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdvancedElectronics.MODID, name), item);
    }

    public static void registerModItems() {
        AdvancedElectronics.LOGGER.info("Registering Mod Items for " + AdvancedElectronics.MODID);
    }

}
