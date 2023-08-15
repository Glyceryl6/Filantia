package com.filania.data.loot;

import com.filania.registry.ModBlocks;
import com.filania.registry.ModItems;
import com.filania.utils.ModCommonUtils;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;

@ParametersAreNonnullByDefault
public class ModBlockLoot extends VanillaBlockLoot {

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.FILA_LOG.get());
        this.dropSelf(ModBlocks.FILA_DIRT.get());
        this.dropSelf(ModBlocks.FILA_WOOD.get());
        this.dropSelf(ModBlocks.FILA_STONE.get());
        this.dropSelf(ModBlocks.FILA_PLANKS.get());
        this.dropSelf(ModBlocks.FILA_PILLAR.get());
        this.dropSelf(ModBlocks.FILA_WOOD_DOOR.get());
        this.dropSelf(ModBlocks.FILA_WOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.FILA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_FILA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_WOOD.get());
        this.dropSelf(ModBlocks.EBONY_PLANKS.get());
        this.dropSelf(ModBlocks.EBONY_DOOR.get());
        this.dropSelf(ModBlocks.EBONY_TRAPDOOR.get());
        this.dropSelf(ModBlocks.FABRIC_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.ABYSS_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.LOVERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CHARCOAL_TORCH.get());
        this.dropWhenSilkTouch(ModBlocks.FILA_LEAVES.get());
        this.dropWhenSilkTouch(ModBlocks.EBONY_LEAVES.get());
        this.add(ModBlocks.SILVER_ORE.get(), block -> this.createOreDrop(block, ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.ROOT_FOSSIL_ORE.get(), block -> this.createOreDrop(block, ModItems.ROOT_FOSSIL.get()));
        this.add(ModBlocks.ABYSS_STEEL_ORE.get(), block -> this.createSingleItemTable(ModItems.RAW_ABYSS_STEEL.get()));
        this.add(ModBlocks.LOVERIUM_ORE.get(), block -> this.createSingleItemTable(ModItems.RAW_LOVERIUM.get()));
        this.add(ModBlocks.NITER_ORE.get(), block -> this.createSingleItemTable(ModItems.NITER.get(), UniformGenerator.between(1.0F, 2.0F)));
        this.add(ModBlocks.GRASSY_FILA_DIRT.get(), block -> this.createSingleItemTableWithSilkTouch(block, ModBlocks.FILA_DIRT.get()));
    }

    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> biConsumer) {
        this.generate();
        Set<ResourceLocation> set = new HashSet<>();
        for (Block block : ModCommonUtils.getKnownBlocks()) {
            if (block.isEnabled(this.enabledFeatures)) {
                ResourceLocation resourcelocation = block.getLootTable();
                if (resourcelocation != BuiltInLootTables.EMPTY && set.add(resourcelocation)) {
                    LootTable.Builder lootTable$builder = this.map.remove(resourcelocation);
                    if (lootTable$builder != null) {
                        biConsumer.accept(resourcelocation, lootTable$builder);
                    }
                }
            }
        }

        if (!this.map.isEmpty()) {
            throw new IllegalStateException("Created block loot tables for non-blocks: " + this.map.keySet());
        }
    }

}