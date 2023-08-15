package com.filania.data.provider.lang;

import com.filania.Filania;
import com.filania.registry.ModBlocks;
import com.filania.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProviderENUS extends LanguageProvider {

    public ModLanguageProviderENUS(PackOutput output) {
        super(output, Filania.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(ModItems.ROOT_FOSSIL.get(), "Root Fossil");
        this.add(ModItems.RAW_SILVER.get(), "Raw Silver");
        this.add(ModItems.FILA_STICK.get(), "Fila Stick");
        this.add(ModItems.FILA_STRING.get(), "Fila String");
        this.add(ModItems.FILA_CHARCOAL.get(), "Fila Charcoal");
        this.add(ModItems.FABRIC_HAT.get(), "Fabric Hat");
        this.add(ModItems.FABRIC_COAT.get(), "Fabric Coat");
        this.add(ModItems.FABRIC_PANTS.get(), "Fabric Pants");
        this.add(ModItems.FABRIC_BOOTS.get(), "Fabric Boots");
        this.add(ModItems.SILVER_HAT.get(), "Silver Hat");
        this.add(ModItems.SILVER_COAT.get(), "Silver Coat");
        this.add(ModItems.SILVER_PANTS.get(), "Silver Pants");
        this.add(ModItems.SILVER_BOOTS.get(), "Silver Boots");
        this.add(ModItems.ABYSS_STEEL_HELMET.get(), "Abysteel Helmet");
        this.add(ModItems.ABYSS_STEEL_CHESTPLATE.get(), "Abysteel Chestplate");
        this.add(ModItems.ABYSS_STEEL_LEGGINGS.get(), "Abysteel Leggings");
        this.add(ModItems.ABYSS_STEEL_BOOTS.get(), "Abysteel Boots");
        this.add(ModItems.LOVERIUM_HELMET.get(), "Loverium Helmet");
        this.add(ModItems.LOVERIUM_CHESTPLATE.get(), "Loverium Chestplate");
        this.add(ModItems.LOVERIUM_LEGGINGS.get(), "Loverium Leggings");
        this.add(ModItems.LOVERIUM_BOOTS.get(), "Loverium Boots");
        this.add(ModItems.FINE_SILVER_INGOT.get(), "Fine Silver Ingot");
        this.add(ModItems.FINE_SILVER_STRING.get(), "Silver String");
        this.add(ModItems.SHIITAKE.get(), "Shiitake");
        this.add(ModItems.COOKED_SHIITAKE.get(), "Cooked Shiitake");
        this.add(ModItems.FINE_SILVER_CUTTER.get(), "Silver Shears");
        this.add(ModItems.RAW_ABYSS_STEEL.get(), "Raw Abysteel");
        this.add(ModItems.ABYSS_STEEL_INGOT.get(), "Abysteel Ingot");
        this.add(ModItems.RAW_LOVERIUM.get(), "Raw Loverium Crystal");
        this.add(ModItems.LOVERIUM_INGOT.get(), "Loverium Ingot");
        this.add(ModItems.NITER.get(), "Niter");
        this.add(ModItems.NITER_POWDER.get(), "Niter Powder");
        this.add(ModBlocks.FILA_LEAVES.get(), "Fila Leaves");
        this.add(ModBlocks.FILA_LOG.get(), "Fila Log");
        this.add(ModBlocks.FILA_PLANKS.get(), "Fila Planks");
        this.add(ModBlocks.FILA_WOOD.get(), "Fila Wood");
        this.add(ModBlocks.FILA_DIRT.get(), "Fila Dirt");
        this.add(ModBlocks.FILA_STONE.get(), "Fila Stone");
        this.add(ModBlocks.FILA_BEDROCK.get(), "Fila Bedrock");
        this.add(ModBlocks.FILA_PILLAR.get(), "Fila Pillar");
        this.add(ModBlocks.FILA_STONE_BRICKS.get(), "Fila Stone Bricks");
        this.add(ModBlocks.FILA_WOOD_DOOR.get(), "Fila Wood Door");
        this.add(ModBlocks.FILA_WOOD_TRAPDOOR.get(), "Fila Wood Trapdoor");
        this.add(ModBlocks.CHISELED_FILA_STONE_BRICKS.get(), "Chiseled Fila Stone Bricks");
        this.add(ModBlocks.EBONY_LEAVES.get(), "Ebony Leaves");
        this.add(ModBlocks.EBONY_LOG.get(), "Ebony Log");
        this.add(ModBlocks.EBONY_PLANKS.get(), "Ebony Planks");
        this.add(ModBlocks.EBONY_WOOD.get(), "Ebony Wood");
        this.add(ModBlocks.EBONY_DOOR.get(), "Ebony Door");
        this.add(ModBlocks.EBONY_TRAPDOOR.get(), "Ebony Trapdoor");
        this.add(ModBlocks.FABRIC_BLOCK.get(), "Fabric Block");
        this.add(ModBlocks.SILVER_BLOCK.get(), "Silver Block");
        this.add(ModBlocks.ABYSS_STEEL_BLOCK.get(), "Abysteel Block");
        this.add(ModBlocks.LOVERIUM_BLOCK.get(), "Loverium Block");
        this.add(ModBlocks.SILVER_ORE.get(), "Silver Ore");
        this.add(ModBlocks.ROOT_FOSSIL_ORE.get(), "Root Fossil Ore");
        this.add(ModBlocks.ABYSS_STEEL_ORE.get(), "Abysteel Ore");
        this.add(ModBlocks.LOVERIUM_ORE.get(), "Loverium Ore");
        this.add(ModBlocks.NITER_ORE.get(), "Niter Ore");
        this.add(ModBlocks.GRASSY_FILA_DIRT.get(), "Grassy Fila Dirt");
        this.add("itemGroup." + Filania.MOD_ID, "Filania");
    }

}