package com.filania.data.provider;

import com.filania.Filania;
import com.filania.data.tags.ModBlockTags;
import com.filania.data.tags.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, p_275322_, Filania.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.copy(ModBlockTags.FILA_LOGS, ModItemTags.FILA_LOGS);
        this.copy(ModBlockTags.EBONY_LOGS, ModItemTags.EBONY_LOGS);
    }

}