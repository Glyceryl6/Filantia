package com.filania.data.provider;

import com.filania.Filania;
import com.filania.registry.ModBlocks;
import com.filania.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Filania.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.basicItem(ModItems.NITER.get());
        this.basicItem(ModItems.NITER_POWDER.get());
        this.basicItem(ModItems.SHIITAKE.get());
        this.basicItem(ModItems.COOKED_SHIITAKE.get());
        this.basicItem(ModItems.ROOT_FOSSIL.get());
        this.basicItem(ModItems.RAW_SILVER.get());
        this.basicItem(ModItems.RAW_ABYSS_STEEL.get());
        this.basicItem(ModItems.ABYSS_STEEL_INGOT.get());
        this.basicItem(ModItems.RAW_LOVERIUM.get());
        this.basicItem(ModItems.LOVERIUM_INGOT.get());
        this.basicItem(ModItems.FILA_STICK.get());
        this.basicItem(ModItems.FILA_STRING.get());
        this.basicItem(ModItems.FILA_CHARCOAL.get());
        this.basicItem(ModItems.FABRIC_HAT.get());
        this.basicItem(ModItems.FABRIC_COAT.get());
        this.basicItem(ModItems.FABRIC_PANTS.get());
        this.basicItem(ModItems.FABRIC_BOOTS.get());
        this.basicItem(ModItems.SILVER_HAT.get());
        this.basicItem(ModItems.SILVER_COAT.get());
        this.basicItem(ModItems.SILVER_PANTS.get());
        this.basicItem(ModItems.SILVER_BOOTS.get());
        this.basicItem(ModItems.ABYSS_STEEL_HELMET.get());
        this.basicItem(ModItems.ABYSS_STEEL_CHESTPLATE.get());
        this.basicItem(ModItems.ABYSS_STEEL_LEGGINGS.get());
        this.basicItem(ModItems.ABYSS_STEEL_BOOTS.get());
        this.basicItem(ModItems.LOVERIUM_HELMET.get());
        this.basicItem(ModItems.LOVERIUM_CHESTPLATE.get());
        this.basicItem(ModItems.LOVERIUM_LEGGINGS.get());
        this.basicItem(ModItems.LOVERIUM_BOOTS.get());
        this.basicItem(ModItems.FINE_SILVER_INGOT.get());
        this.basicItem(ModItems.FINE_SILVER_STRING.get());
        this.basicItem(ModItems.FINE_SILVER_CUTTER.get());
        this.basicItem(ModBlocks.FILA_WOOD_DOOR.get().asItem());
        this.basicItem(ModBlocks.EBONY_DOOR.get().asItem());
        this.simpleBlockItem(ModBlocks.FILA_LOG.get());
        this.simpleBlockItem(ModBlocks.FILA_DIRT.get());
        this.simpleBlockItem(ModBlocks.FILA_WOOD.get());
        this.simpleBlockItem(ModBlocks.FILA_STONE.get());
        this.simpleBlockItem(ModBlocks.FILA_LEAVES.get());
        this.simpleBlockItem(ModBlocks.FILA_PLANKS.get());
        this.simpleBlockItem(ModBlocks.FILA_BEDROCK.get());
        this.simpleBlockItem(ModBlocks.FILA_PILLAR.get());
        this.simpleBlockItem(ModBlocks.FILA_STONE_BRICKS.get());
        this.simpleBlockItem(ModBlocks.CHISELED_FILA_STONE_BRICKS.get());
        this.simpleBlockItem(ModBlocks.EBONY_LOG.get());
        this.simpleBlockItem(ModBlocks.EBONY_WOOD.get());
        this.simpleBlockItem(ModBlocks.EBONY_LEAVES.get());
        this.simpleBlockItem(ModBlocks.EBONY_PLANKS.get());
        this.simpleBlockItem(ModBlocks.FABRIC_BLOCK.get());
        this.simpleBlockItem(ModBlocks.SILVER_BLOCK.get());
        this.simpleBlockItem(ModBlocks.ABYSS_STEEL_BLOCK.get());
        this.simpleBlockItem(ModBlocks.LOVERIUM_BLOCK.get());
        this.simpleBlockItem(ModBlocks.SILVER_ORE.get());
        this.simpleBlockItem(ModBlocks.ROOT_FOSSIL_ORE.get());
        this.simpleBlockItem(ModBlocks.ABYSS_STEEL_ORE.get());
        this.simpleBlockItem(ModBlocks.LOVERIUM_ORE.get());
        this.simpleBlockItem(ModBlocks.NITER_ORE.get());
        this.simpleBlockItem(ModBlocks.GRASSY_FILA_DIRT.get());
        this.simpleBlockItem(ModBlocks.CHARCOAL_TORCH.get());
    }

    private void simpleBlockItem(Block block) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
        this.withExistingParent(path, this.modLoc("block/" + path));
    }

}