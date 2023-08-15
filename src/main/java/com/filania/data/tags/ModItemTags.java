package com.filania.data.tags;

import com.filania.Filania;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> FILA_LOGS = create("fila_logs");
    public static final TagKey<Item> EBONY_LOGS = create("ebony_logs");

    private static TagKey<Item> create(String name) {
        return ItemTags.create(Filania.prefix(name));
    }

}