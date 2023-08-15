package com.filania.data.provider;

import com.filania.data.tags.ModItemTags;
import com.filania.registry.ModBlocks;
import com.filania.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;
import java.util.function.Consumer;

@ParametersAreNonnullByDefault
public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        planksFromLogs(consumer, ModBlocks.FILA_PLANKS.get(), ModItemTags.FILA_LOGS, 4);
        planksFromLogs(consumer, ModBlocks.EBONY_PLANKS.get(), ModItemTags.EBONY_LOGS, 4);
        woodFromLogs(consumer, ModBlocks.FILA_WOOD.get(), ModBlocks.FILA_LOG.get());
        woodFromLogs(consumer, ModBlocks.EBONY_WOOD.get(), ModBlocks.EBONY_LOG.get());
        doorBuilder(ModBlocks.FILA_WOOD_DOOR.get(), Ingredient.of(ModBlocks.FILA_PLANKS.get()));
        doorBuilder(ModBlocks.EBONY_DOOR.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get()));
        trapdoorBuilder(ModBlocks.FILA_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.FILA_PLANKS.get()));
        trapdoorBuilder(ModBlocks.EBONY_TRAPDOOR.get(), Ingredient.of(ModBlocks.FILA_PLANKS.get()));
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, ModItems.FINE_SILVER_INGOT.get(),
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FINE_SILVER_STRING.get())
                .define('#', ModItems.FINE_SILVER_INGOT.get())
                .pattern("#").pattern("#")
                .unlockedBy(this.name(ModItems.FINE_SILVER_INGOT.get()),
                        has(ModItems.FINE_SILVER_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FINE_SILVER_CUTTER.get())
                .define('#', ModItems.FINE_SILVER_INGOT.get())
                .pattern("# ").pattern(" #")
                .unlockedBy(this.name(ModItems.FINE_SILVER_INGOT.get()),
                        has(ModItems.FINE_SILVER_INGOT.get())).save(consumer);
        //Fabric Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FABRIC_HAT.get())
                .define('X', ModItems.FILA_STRING.get())
                .define('Y', ModBlocks.FABRIC_BLOCK.get())
                .pattern("XYX").pattern("Y Y")
                .unlockedBy(this.name(ModItems.FILA_STRING.get()), 
                        has(ModItems.FILA_STRING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FABRIC_COAT.get())
                .define('X', ModItems.FILA_STRING.get())
                .define('Y', ModBlocks.FABRIC_BLOCK.get())
                .pattern("Y Y").pattern("XYX").pattern("XYX")
                .unlockedBy(this.name(ModItems.FILA_STRING.get()), 
                        has(ModItems.FILA_STRING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FABRIC_PANTS.get())
                .define('X', ModItems.FILA_STRING.get())
                .define('Y', ModBlocks.FABRIC_BLOCK.get())
                .pattern("XYX").pattern("Y Y").pattern("X X")
                .unlockedBy(this.name(ModItems.FILA_STRING.get()), 
                        has(ModItems.FILA_STRING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FABRIC_BOOTS.get())
                .define('X', ModItems.FILA_STRING.get())
                .define('Y', ModBlocks.FABRIC_BLOCK.get())
                .pattern("X X").pattern("Y Y")
                .unlockedBy(this.name(ModItems.FILA_STRING.get()), 
                        has(ModItems.FILA_STRING.get())).save(consumer);
        //Silver Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_HAT.get())
                .define('X', ModItems.FINE_SILVER_STRING.get())
                .define('Y', ModItems.FABRIC_HAT.get())
                .pattern("XXX").pattern("Y Y")
                .unlockedBy(this.name(ModItems.FINE_SILVER_INGOT.get()), 
                        has(ModItems.FINE_SILVER_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_COAT.get())
                .define('X', ModItems.FINE_SILVER_STRING.get())
                .define('Y', ModItems.FABRIC_HAT.get())
                .pattern("XYX").pattern("XXX").pattern("XXX")
                .unlockedBy(this.name(ModItems.FINE_SILVER_INGOT.get()), 
                        has(ModItems.FINE_SILVER_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_PANTS.get())
                .define('X', ModItems.FINE_SILVER_STRING.get())
                .define('Y', ModItems.FABRIC_HAT.get())
                .pattern("XXX").pattern("XYX").pattern("X X")
                .unlockedBy(this.name(ModItems.FINE_SILVER_INGOT.get()), 
                        has(ModItems.FINE_SILVER_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_BOOTS.get())
                .define('X', ModItems.FINE_SILVER_STRING.get())
                .define('Y', ModItems.FABRIC_HAT.get())
                .pattern("XYX").pattern("X X")
                .unlockedBy(this.name(ModItems.FINE_SILVER_INGOT.get()), 
                        has(ModItems.FINE_SILVER_INGOT.get())).save(consumer);
        //Abyss Steel Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ABYSS_STEEL_HELMET.get())
                .define('X', ModItems.ABYSS_STEEL_INGOT.get())
                .pattern("XXX").pattern("X X")
                .unlockedBy(this.name(ModItems.ABYSS_STEEL_INGOT.get()),
                        has(ModItems.ABYSS_STEEL_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ABYSS_STEEL_CHESTPLATE.get())
                .define('X', ModItems.ABYSS_STEEL_INGOT.get())
                .pattern("X X").pattern("XXX").pattern("XXX")
                .unlockedBy(this.name(ModItems.ABYSS_STEEL_INGOT.get()),
                        has(ModItems.ABYSS_STEEL_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ABYSS_STEEL_LEGGINGS.get())
                .define('X', ModItems.ABYSS_STEEL_INGOT.get())
                .pattern("XXX").pattern("X X").pattern("X X")
                .unlockedBy(this.name(ModItems.ABYSS_STEEL_INGOT.get()),
                        has(ModItems.ABYSS_STEEL_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ABYSS_STEEL_BOOTS.get())
                .define('X', ModItems.ABYSS_STEEL_INGOT.get())
                .pattern("X X").pattern("X X")
                .unlockedBy(this.name(ModItems.ABYSS_STEEL_INGOT.get()),
                        has(ModItems.ABYSS_STEEL_INGOT.get())).save(consumer);
        //Loverium Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LOVERIUM_HELMET.get())
                .define('X', ModItems.LOVERIUM_INGOT.get())
                .define('Y', ModBlocks.FILA_STONE.get())
                .pattern("YXY").pattern("X X")
                .unlockedBy(this.name(ModItems.LOVERIUM_INGOT.get()),
                        has(ModItems.LOVERIUM_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LOVERIUM_CHESTPLATE.get())
                .define('X', ModItems.LOVERIUM_INGOT.get())
                .define('Y', ModBlocks.FILA_STONE.get())
                .pattern("X X").pattern("YXY").pattern("YXY")
                .unlockedBy(this.name(ModItems.LOVERIUM_INGOT.get()),
                        has(ModItems.LOVERIUM_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LOVERIUM_LEGGINGS.get())
                .define('X', ModItems.LOVERIUM_INGOT.get())
                .define('Y', ModBlocks.FILA_STONE.get())
                .pattern("YXY").pattern("X X").pattern("Y Y")
                .unlockedBy(this.name(ModItems.LOVERIUM_INGOT.get()),
                        has(ModItems.LOVERIUM_INGOT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LOVERIUM_BOOTS.get())
                .define('X', ModItems.LOVERIUM_INGOT.get())
                .define('Y', ModBlocks.FILA_STONE.get())
                .pattern("Y Y").pattern("X X")
                .unlockedBy(this.name(ModItems.LOVERIUM_INGOT.get()),
                        has(ModItems.LOVERIUM_INGOT.get())).save(consumer);
    }
    
    private String name(ItemLike item) {
        return "has_" + Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.asItem())).getPath();
    }

}