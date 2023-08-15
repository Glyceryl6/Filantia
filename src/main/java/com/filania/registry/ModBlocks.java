package com.filania.registry;

import com.filania.Filania;
import com.filania.blocks.CharcoalTorch;
import com.filania.blocks.GrassyFilaDirt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.filania.utils.ModBlockRegUtils.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Filania.MOD_ID);
    public static final RegistryObject<Block> NITER_FIRE = BLOCKS.register("niter_fire", () -> new FireBlock(copy(Blocks.FIRE)));
    public static final RegistryObject<Block> FILA_LEAVES = register("fila_leaves", () -> Blocks.leaves(SoundType.GRASS));
    public static final RegistryObject<Block> FILA_LOG = register("fila_log", () -> Blocks.log(MapColor.WOOD, MapColor.PODZOL));
    public static final RegistryObject<Block> FILA_PLANKS = normal("fila_planks", copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> FILA_WOOD = wood("fila_wood", MapColor.WOOD, 2.0F);
    public static final RegistryObject<Block> FILA_DIRT = normal("fila_dirt", copy(Blocks.DIRT));
    public static final RegistryObject<Block> FILA_STONE = normal("fila_stone", copy(Blocks.STONE));
    public static final RegistryObject<Block> FILA_BEDROCK = normal("fila_bedrock", copy(Blocks.BEDROCK));
    public static final RegistryObject<Block> FILA_STONE_BRICKS = normal("fila_stone_bricks", copy(Blocks.STONE_BRICKS));
    public static final RegistryObject<Block> FILA_PILLAR = register("fila_pillar", () -> new RotatedPillarBlock(copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<Block> FILA_WOOD_DOOR  = door("fila_wood_door", copy(Blocks.OAK_DOOR), ModBlockSetType.FILA);
    public static final RegistryObject<Block> FILA_WOOD_TRAPDOOR = trapdoor("fila_wood_trapdoor", copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.FILA);
    public static final RegistryObject<Block> CHISELED_FILA_STONE_BRICKS = normal("chiseled_fila_stone_bricks", copy(Blocks.CHISELED_STONE_BRICKS));
    public static final RegistryObject<Block> EBONY_LEAVES = register("ebony_leaves", () -> Blocks.leaves(SoundType.GRASS));
    public static final RegistryObject<Block> EBONY_LOG = register("ebony_log", () -> Blocks.log(MapColor.WOOD, MapColor.COLOR_BLACK));
    public static final RegistryObject<Block> EBONY_PLANKS = normal("ebony_planks", copy(Blocks.OAK_PLANKS).strength(4.0F));
    public static final RegistryObject<Block> EBONY_WOOD = wood("ebony_wood", MapColor.COLOR_BLACK, 4.0F);
    public static final RegistryObject<Block> EBONY_DOOR = door("ebony_door", copy(Blocks.OAK_DOOR), ModBlockSetType.EBONY);
    public static final RegistryObject<Block> EBONY_TRAPDOOR = trapdoor("ebony_trapdoor", copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.EBONY);
    public static final RegistryObject<Block> FABRIC_BLOCK = normal("fabric_block", copy(Blocks.WHITE_WOOL));
    public static final RegistryObject<Block> SILVER_BLOCK = normal("silver_block", copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> ABYSS_STEEL_BLOCK = normal("abyss_steel_block", copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> LOVERIUM_BLOCK = normal("loverium_block", copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> SILVER_ORE = ore("silver_ore", copy(Blocks.IRON_ORE));
    public static final RegistryObject<Block> ROOT_FOSSIL_ORE = ore("root_fossil_ore", copy(Blocks.IRON_ORE));
    public static final RegistryObject<Block> ABYSS_STEEL_ORE = ore("abyss_steel_ore", copy(Blocks.IRON_ORE).lightLevel(s -> 5));
    public static final RegistryObject<Block> LOVERIUM_ORE = ore("loverium_ore", copy(Blocks.IRON_ORE));
    public static final RegistryObject<Block> NITER_ORE = ore("niter_ore", copy(Blocks.IRON_ORE));
    public static final RegistryObject<Block> GRASSY_FILA_DIRT = register("grassy_fila_dirt", GrassyFilaDirt::new);
    public static final RegistryObject<Block> CHARCOAL_TORCH = register("charcoal_torch", CharcoalTorch::new);
    public static final RegistryObject<Block> burned_dirt = register("burned_dirt", );

}