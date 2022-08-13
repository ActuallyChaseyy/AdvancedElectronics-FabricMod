package net.chaseyy.advancedelectronics.block;

import net.chaseyy.advancedelectronics.AdvancedElectronics;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("ALL")
public class ModBlocks {

    public static final Block BATTERY_BLOCK = registerBlock("battery_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()
                    .jumpVelocityMultiplier(5)
                    .luminance(5)
            ), ItemGroup.REDSTONE);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK, new Identifier(AdvancedElectronics.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AdvancedElectronics.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.REDSTONE)));
    }

    public static void registerModBlocks() {
        AdvancedElectronics.LOGGER.info("Registering Mod Blocks for " + AdvancedElectronics.MODID);
    }

}
