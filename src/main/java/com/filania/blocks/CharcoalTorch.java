package com.filania.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

@SuppressWarnings("deprecation")
public class CharcoalTorch extends TorchBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_15;

    public CharcoalTorch() {
        super(Properties.copy(Blocks.TORCH), ParticleTypes.FLAME);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.TRUE).setValue(AGE, 0));
    }

    @Override
    public void tick(BlockState state, ServerLevel serverLevel, BlockPos pos, RandomSource random) {
        if (serverLevel.getGameRules().getBoolean(GameRules.RULE_DOFIRETICK) && state.canSurvive(serverLevel, pos)) {
            boolean flag = random.nextFloat() < 0.2F + (float)state.getValue(AGE) * 0.03F;
            if (serverLevel.isRaining() && serverLevel.isRainingAt(pos) && flag) {
                serverLevel.setBlockAndUpdate(pos, state.setValue(LIT, false));
            } else {
                int j = Math.min(15, state.getValue(AGE) + random.nextInt(3) / 2);
                if (state.getValue(AGE) != j) {
                    serverLevel.setBlock(pos, state.setValue(AGE, j), 4);
                } else if (state.getValue(AGE) == 15) {
                    serverLevel.setBlock(pos, state.setValue(AGE, 0), 4);
                }
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT, AGE);
    }

}