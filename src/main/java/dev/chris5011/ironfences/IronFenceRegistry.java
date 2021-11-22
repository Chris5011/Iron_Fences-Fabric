package dev.chris5011.ironfences;

import dev.chris5011.ironfences.modules.copperfences.CopperFenceBlock;
import dev.chris5011.ironfences.modules.copperfences.CopperFenceGate_Block;
import dev.chris5011.ironfences.modules.copperfences.CopperWallBlock;
import dev.chris5011.ironfences.modules.copperfences.ICopperFenceGate_BlockBase;
import dev.chris5011.ironfences.modules.ironfences.IronFenceGate_Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class IronFenceRegistry {

    // Iron Fences:
    public static final Block IRON_FENCE_BLOCK = new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).requiresTool());
    public static final Block IRON_FENCE_GATE_BLOCK = new IronFenceGate_Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).requiresTool());

    //Copper Nugget:
    public static final Item COPPER_NUGGET_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));


    //Copper Fences:
    public static final Block COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WEATHERED_COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block EXPOSED_COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block OXIDIZED_COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());

    //Waxed Copper Fences:
    public static final Block WAXED_COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_WEATHERED_COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_EXPOSED_COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_OXIDIZED_COPPER_FENCE_BLOCK = new CopperFenceBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());


    //Copper Fence Gates:
    public static final Block COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WEATHERED_COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER));
    public static final Block OXIDIZED_COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER));

    //Waxed Copper Fence Gates:
    public static final Block WAXED_COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_WEATHERED_COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_FENCE_GATE_BLOCK = new CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER));


    //Gold Fence:
    public static final Block GOLD_FENCE_BLOCK = new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).requiresTool().solidBlock((p_61036_, p_61037_, p_61038_) -> true));

    //Gold Fence Gate:
    public static final Block GOLD_FENCE_GATE_BLOCK = new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).requiresTool().solidBlock((p_61036_, p_61037_, p_61038_) -> true));

//Walls:

    //Iron Wall:
    public static final Block IRON_WALL_BLOCK = new WallBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK));

    //Copper Wall:
    public static final Block COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block EXPOSED_COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WEATHERED_COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block OXIDIZED_COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_EXPOSED_COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_WEATHERED_COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());
    public static final Block WAXED_OXIDIZED_COPPER_WALL_BLOCK = new CopperWallBlock(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).requiresTool());


    //Gold Wall:
    public static final Block GOLD_WALL_BLOCK = new WallBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK));


    public static void registerAll() {
        //COPPER NUGGET:
        Registry.register(Registry.ITEM, new Identifier("ironfences", "copper_nugget"), COPPER_NUGGET_ITEM);

        //IRON FENCES AND FENCE GATES:
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "iron_fence"), IRON_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "iron_fence"), new BlockItem(IRON_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "iron_fence_gate"), IRON_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "iron_fence_gate"), new BlockItem(IRON_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));

        //IRON WALL:
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "iron_wall"), IRON_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "iron_wall"), new BlockItem(IRON_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));

        //GOLD FENCES AND FENCE GATES:
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "gold_fence"), GOLD_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "gold_fence"), new BlockItem(GOLD_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "gold_fence_gate"), GOLD_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "gold_fence_gate"), new BlockItem(GOLD_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));

        //GOLD WALL:
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "gold_wall"), GOLD_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "gold_wall"), new BlockItem(GOLD_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));


        //UNWAXED COPPER STUFF:
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "copper_fence"), COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "copper_fence"), new BlockItem(COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "copper_fence_gate"), COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "copper_fence_gate"), new BlockItem(COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "exposed_copper_fence"), EXPOSED_COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "exposed_copper_fence"), new BlockItem(EXPOSED_COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "exposed_copper_fence_gate"), EXPOSED_COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "exposed_copper_fence_gate"), new BlockItem(EXPOSED_COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "weathered_copper_fence"), WEATHERED_COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "weathered_copper_fence"), new BlockItem(WEATHERED_COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "weathered_copper_fence_gate"), WEATHERED_COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "weathered_copper_fence_gate"), new BlockItem(WEATHERED_COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "oxidized_copper_fence"), OXIDIZED_COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "oxidized_copper_fence"), new BlockItem(OXIDIZED_COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "oxidized_copper_fence_gate"), OXIDIZED_COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "oxidized_copper_fence_gate"), new BlockItem(OXIDIZED_COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("ironfences", "copper_wall"), COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "copper_wall"), new BlockItem(COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "exposed_copper_wall"), EXPOSED_COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "exposed_copper_wall"), new BlockItem(EXPOSED_COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "weathered_copper_wall"), WEATHERED_COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "weathered_copper_wall"), new BlockItem(WEATHERED_COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "oxidized_copper_wall"), OXIDIZED_COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "oxidized_copper_wall"), new BlockItem(OXIDIZED_COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));


        //WAXED COPPER STUFF:
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_copper_fence"), WAXED_COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_copper_fence"), new BlockItem(WAXED_COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_copper_fence_gate"), WAXED_COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_copper_fence_gate"), new BlockItem(WAXED_COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_exposed_copper_fence"), WAXED_EXPOSED_COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_exposed_copper_fence"), new BlockItem(WAXED_EXPOSED_COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_exposed_copper_fence_gate"), WAXED_EXPOSED_COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_exposed_copper_fence_gate"), new BlockItem(WAXED_EXPOSED_COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_weathered_copper_fence"), WAXED_WEATHERED_COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_weathered_copper_fence"), new BlockItem(WAXED_WEATHERED_COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_weathered_copper_fence_gate"), WAXED_WEATHERED_COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_weathered_copper_fence_gate"), new BlockItem(WAXED_WEATHERED_COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_oxidized_copper_fence"), WAXED_OXIDIZED_COPPER_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_oxidized_copper_fence"), new BlockItem(WAXED_OXIDIZED_COPPER_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_oxidized_copper_fence_gate"), WAXED_OXIDIZED_COPPER_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_oxidized_copper_fence_gate"), new BlockItem(WAXED_OXIDIZED_COPPER_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_copper_wall"), WAXED_COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_copper_wall"), new BlockItem(WAXED_COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_exposed_copper_wall"), WAXED_EXPOSED_COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_exposed_copper_wall"), new BlockItem(WAXED_EXPOSED_COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_weathered_copper_wall"), WAXED_WEATHERED_COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_weathered_copper_wall"), new BlockItem(WAXED_WEATHERED_COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("ironfences", "waxed_oxidized_copper_wall"), WAXED_OXIDIZED_COPPER_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "waxed_oxidized_copper_wall"), new BlockItem(WAXED_OXIDIZED_COPPER_WALL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }

}
