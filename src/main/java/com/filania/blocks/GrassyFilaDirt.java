package com.filania.blocks;

import com.filania.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

@SuppressWarnings("deprecation")
public class GrassyFilaDirt extends Block {

    public GrassyFilaDirt() {
        super(Properties.copy(Blocks.GRASS_BLOCK));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel serverLevel, BlockPos pos, RandomSource random) {
        if (serverLevel.isAreaLoaded(pos, 1) && serverLevel.getMaxLocalRawBrightness(pos.above()) > 9) {
            for (int i = 0; i < 4; ++i) {
                int x = random.nextInt(3) - 1;
                int y = random.nextInt(5) - 3;
                int z = random.nextInt(3) - 1;
                BlockPos blockPos = new BlockPos(x, y, z);
                if (serverLevel.getBlockState(blockPos).is(ModBlocks.FILA_DIRT.get())) {
                    serverLevel.setBlockAndUpdate(blockPos, this.defaultBlockState());
                }
            }
        }
    }

}