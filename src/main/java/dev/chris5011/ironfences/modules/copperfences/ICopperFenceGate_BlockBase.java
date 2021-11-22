package dev.chris5011.ironfences.modules.copperfences;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import dev.chris5011.ironfences.IronFenceRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;

import java.util.Optional;
import java.util.function.Supplier;

public interface ICopperFenceGate_BlockBase extends Degradable<ICopperFenceGate_BlockBase.CopperFenceGateWeatherState> {

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> ImmutableBiMap.<Block, Block>builder()
            .put(IronFenceRegistry.COPPER_FENCE_GATE_BLOCK, IronFenceRegistry.EXPOSED_COPPER_FENCE_GATE_BLOCK)
            .put(IronFenceRegistry.EXPOSED_COPPER_FENCE_GATE_BLOCK, IronFenceRegistry.WEATHERED_COPPER_FENCE_GATE_BLOCK)
            .put(IronFenceRegistry.WEATHERED_COPPER_FENCE_GATE_BLOCK, IronFenceRegistry.OXIDIZED_COPPER_FENCE_GATE_BLOCK)
            .put(IronFenceRegistry.COPPER_FENCE_BLOCK, IronFenceRegistry.EXPOSED_COPPER_FENCE_BLOCK)
            .put(IronFenceRegistry.EXPOSED_COPPER_FENCE_BLOCK, IronFenceRegistry.WEATHERED_COPPER_FENCE_BLOCK)
            .put(IronFenceRegistry.WEATHERED_COPPER_FENCE_BLOCK, IronFenceRegistry.OXIDIZED_COPPER_FENCE_BLOCK)
            .put(IronFenceRegistry.COPPER_WALL_BLOCK, IronFenceRegistry.EXPOSED_COPPER_WALL_BLOCK)
            .put(IronFenceRegistry.EXPOSED_COPPER_WALL_BLOCK, IronFenceRegistry.WEATHERED_COPPER_WALL_BLOCK)
            .put(IronFenceRegistry.WEATHERED_COPPER_WALL_BLOCK, IronFenceRegistry.OXIDIZED_COPPER_WALL_BLOCK)
            .build());
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> NEXT_BY_BLOCK.get().inverse());

    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(block));
    }

    static Block getFirst(Block initialBlock) {
        Block block = initialBlock;

        for (Block block1 = PREVIOUS_BY_BLOCK.get().get(initialBlock); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }

        return block;
    }

    static Optional<BlockState> getPrevious(BlockState blockState) {
        return getPrevious(blockState.getBlock()).map((block) -> block.getStateWithProperties(blockState));
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    static BlockState getFirst(BlockState blockState) {
        return getFirst(blockState.getBlock()).getStateWithProperties(blockState);
    }

    default Optional<BlockState> getDegradationResult(BlockState blockState) {
        return getNext(blockState.getBlock()).map((p_154896_) -> p_154896_.getStateWithProperties(blockState));
    }

    default float getDegradationChanceMultiplier() {
        return this.getDegradationLevel() == ICopperFenceGate_BlockBase.CopperFenceGateWeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }


    public static enum CopperFenceGateWeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}
