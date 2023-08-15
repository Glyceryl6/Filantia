package com.filania.data.provider;

import com.filania.Filania;
import com.filania.data.tags.ModBlockTags;
import com.filania.registry.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Filania.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModBlockTags.FILA_LOGS).add(ModBlocks.FILA_LOG.get()).add(ModBlocks.FILA_WOOD.get());
        this.tag(ModBlockTags.EBONY_LOGS).add(ModBlocks.EBONY_LOG.get()).add(ModBlocks.EBONY_WOOD.get());
        this.tag(BlockTags.PLANKS).add(ModBlocks.FILA_PLANKS.get()).add(ModBlocks.EBONY_PLANKS.get());
        this.tag(BlockTags.LEAVES).add(ModBlocks.FILA_LEAVES.get()).add(ModBlocks.EBONY_LEAVES.get());
        this.tag(BlockTags.DOORS).add(ModBlocks.FILA_WOOD_DOOR.get()).add(ModBlocks.EBONY_DOOR.get());
        this.tag(BlockTags.TRAPDOORS).add(ModBlocks.FILA_WOOD_TRAPDOOR.get()).add(ModBlocks.EBONY_TRAPDOOR.get());
        this.tag(BlockTags.WOOL).add(ModBlocks.FABRIC_BLOCK.get());
        this.tag(BlockTags.FIRE).add(ModBlocks.NITER_FIRE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.FILA_STONE.get())
                .add(ModBlocks.SILVER_ORE.get()).add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.ABYSS_STEEL_BLOCK.get()).add(ModBlocks.LOVERIUM_BLOCK.get())
                .add(ModBlocks.FILA_PILLAR.get()).add(ModBlocks.FILA_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_FILA_STONE_BRICKS.get());
        this.tag(BlockTags.LOGS).addTag(ModBlockTags.FILA_LOGS).addTag(ModBlockTags.EBONY_LOGS);
    }

}