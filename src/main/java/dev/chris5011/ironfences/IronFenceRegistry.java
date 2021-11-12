package dev.chris5011.ironfences;

import dev.chris5011.ironfences.modules.IronFenceGate_Block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IronFenceRegistry {

    public static final Block IRON_FENCE_GATE_BLOCK = new IronFenceGate_Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0F, 6.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());

    public static final Block IRON_FENCE_BLOCK = new FenceBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0F, 6.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());

    public static void registerAll(){

        Registry.register(Registry.BLOCK, new Identifier("ironfences", "iron_fence"), IRON_FENCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "iron_fence"), new BlockItem(IRON_FENCE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.BLOCK, new Identifier("ironfences", "iron_fence_gate"), IRON_FENCE_GATE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironfences", "iron_fence_gate"), new BlockItem(IRON_FENCE_GATE_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE)));

    }

}
