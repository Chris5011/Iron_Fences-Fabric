package dev.chris5011.ironfences.modules.copperfences;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import dev.chris5011.ironfences.IronFenceRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class CopperFenceGate_Block extends FenceGateBlock implements ICopperFenceGate_BlockBase {
    private final ICopperFenceGate_BlockBase.CopperFenceGateWeatherState weatherState;

    public static final Supplier<BiMap<Block, Block>> WAXABLES = Suppliers.memoize(() -> ImmutableBiMap.<Block, Block>builder()
            .put(IronFenceRegistry.COPPER_FENCE_GATE_BLOCK, IronFenceRegistry.WAXED_COPPER_FENCE_GATE_BLOCK)
            .put(IronFenceRegistry.EXPOSED_COPPER_FENCE_GATE_BLOCK, IronFenceRegistry.WAXED_EXPOSED_COPPER_FENCE_GATE_BLOCK)
            .put(IronFenceRegistry.WEATHERED_COPPER_FENCE_GATE_BLOCK, IronFenceRegistry.WAXED_WEATHERED_COPPER_FENCE_GATE_BLOCK)
            .put(IronFenceRegistry.OXIDIZED_COPPER_FENCE_GATE_BLOCK, IronFenceRegistry.WAXED_OXIDIZED_COPPER_FENCE_GATE_BLOCK)
            .build());
    public static final Supplier<BiMap<Block, Block>> WAX_OFF_BY_BLOCK = Suppliers.memoize(() -> WAXABLES.get().inverse());


    public CopperFenceGate_Block(ICopperFenceGate_BlockBase.CopperFenceGateWeatherState weatherState, FabricBlockSettings properties) {
        super(properties);
        this.weatherState = weatherState;
    }


    //Suppress redstone activation
    @Override
    public void neighborUpdate(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {

    }

    //Use Honeycombs and Axes on the Fencegate:
    //ToDo: Tweak the Action-Results
    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult blockHitResult) {
        if (!world.isClient() && player instanceof ServerPlayerEntity) {
            System.out.println("Side: " + world.isClient());
            Item handheldItem = player.getInventory().getMainHandStack().getItem();
            if (Items.HONEYCOMB.equals(handheldItem)) {
                if (!isWaxed(blockState)) {
                    return wax(blockState).map((newBlockState) -> {
                        if (!player.isCreative()) {
                            player.getActiveItem().decrement(1);
                        }
                        world.setBlockState(blockPos, newBlockState, 11);
                        world.playSound(null, blockPos, SoundEvents.ITEM_HONEYCOMB_WAX_ON, SoundCategory.BLOCKS, 1.0F, 1.0F);
                        world.syncWorldEvent(player, 3003, blockPos, 0);
                        return ActionResult.FAIL;
                    }).orElse(ActionResult.FAIL);
                } else {
                    return ActionResult.FAIL;
                }
            } else if (handheldItem instanceof AxeItem) {
                //Block is waxed --> Remove wax
                if (isWaxed(blockState)) {
                    Optional<Block> unwaxedBlock = getUnwaxedBlock(blockState);
                    if (unwaxedBlock.isPresent()) {
                        world.setBlockState(blockPos, unwaxedBlock.get().getStateWithProperties(blockState));
                        world.playSound(null, blockPos, SoundEvents.ITEM_AXE_WAX_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
                        world.syncWorldEvent(player, 3005, blockPos, 0);
                        if (!player.isCreative()) {
                            player.getActiveItem().damage(1, player, (event) -> {
                                event.sendToolBreakStatus(hand);
                            });
                        }
                    }
                    return ActionResult.FAIL;
                    //Block is not waxed --> Clean it
                } else {
                    ICopperFenceGate_BlockBase.getPrevious(blockState).ifPresent((optBlockState) -> {
                        world.playSound(null, blockPos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                        world.setBlockState(blockPos, optBlockState);
                    });
                    world.syncWorldEvent(player, 3005, blockPos, 0);
                    return ActionResult.FAIL;
                }
            } else {
                if (blockState.get(OPEN)) {
                    world.playSound(null, blockPos, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                } else {
                    world.playSound(null, blockPos, SoundEvents.BLOCK_FENCE_GATE_OPEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                return super.onUse(blockState, world, blockPos, player, hand, blockHitResult);
            }
        }
        return ActionResult.SUCCESS;
    }


    public static Optional<BlockState> wax(BlockState blockState) {
        return Optional.ofNullable(WAXABLES.get().get(blockState.getBlock())).map((newBlockState) -> newBlockState.getStateWithProperties(blockState));
    }

    public static boolean isWaxed(BlockState blockState) {
        return WAXABLES.get().containsValue(blockState.getBlock());
    }

    public static Optional<Block> getUnwaxedBlock(BlockState blockState) {
        for (Map.Entry<Block, Block> mapEntry : WAXABLES.get().entrySet()) {
            if (mapEntry.getValue().equals(blockState.getBlock())) {
                return Optional.of(mapEntry.getKey());
            }
        }
        return Optional.empty();
    }

    public void randomTick(BlockState state, ServerWorld serverWorld, BlockPos pos, Random rd) {
        if (!isWaxed(state)) {
            this.tickDegradation(state, serverWorld, pos, rd);
        }
    }

    public boolean hasRandomTicks(BlockState blockState) {
        return ICopperFenceGate_BlockBase.getNext(blockState.getBlock()).isPresent();
    }

    @Override
    public CopperFenceGateWeatherState getDegradationLevel() {
        return this.weatherState;
    }


}
