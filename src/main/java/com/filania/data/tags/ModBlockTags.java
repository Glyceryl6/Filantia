package com.filania.data.tags;

import com.filania.Filania;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {

    public static final TagKey<Block> FILA_LOGS = create("fila_logs");
    public static final TagKey<Block> EBONY_LOGS = create("ebony_logs");

    private static TagKey<Block> create(String name) {
        return BlockTags.create(Filania.prefix(name));
    }

}