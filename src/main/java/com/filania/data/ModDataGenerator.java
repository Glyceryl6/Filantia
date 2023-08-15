package com.filania.data;

import com.filania.Filania;
import com.filania.data.provider.*;
import com.filania.data.provider.lang.ModLanguageProviderENUS;
import com.filania.data.provider.lang.ModLanguageProviderZHCN;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Filania.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(output, provider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(
                output, provider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModLanguageProviderENUS(output));
        generator.addProvider(event.includeClient(), new ModLanguageProviderZHCN(output));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(output));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(output));
    }

}