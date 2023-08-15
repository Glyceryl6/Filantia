package com.filania.data.provider;

import com.filania.Filania;
import com.filania.blocks.CharcoalTorch;
import com.filania.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {

    private static final ResourceLocation CUTOUT = new ResourceLocation("cutout");
    private static final ResourceLocation CUTOUT_MIPPED = new ResourceLocation("cutout_mipped");
    private static final ResourceLocation TRANSLUCENT = new ResourceLocation("translucent");

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Filania.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.fire(ModBlocks.NITER_FIRE.get());
        this.simpleBlock(ModBlocks.FILA_DIRT.get());
        this.simpleBlock(ModBlocks.FILA_STONE.get());
        this.simpleBlock(ModBlocks.FILA_PLANKS.get());
        this.simpleBlock(ModBlocks.FILA_BEDROCK.get());
        this.simpleBlock(ModBlocks.FILA_STONE_BRICKS.get());
        this.simpleBlock(ModBlocks.EBONY_PLANKS.get());
        this.simpleBlock(ModBlocks.FABRIC_BLOCK.get());
        this.simpleBlock(ModBlocks.SILVER_BLOCK.get());
        this.simpleBlock(ModBlocks.ABYSS_STEEL_BLOCK.get());
        this.simpleBlock(ModBlocks.LOVERIUM_BLOCK.get());
        this.simpleBlock(ModBlocks.SILVER_ORE.get());
        this.simpleBlock(ModBlocks.ROOT_FOSSIL_ORE.get());
        this.simpleBlock(ModBlocks.ABYSS_STEEL_ORE.get());
        this.simpleBlock(ModBlocks.LOVERIUM_ORE.get());
        this.simpleBlock(ModBlocks.NITER_ORE.get());
        this.simpleBlock(ModBlocks.CHISELED_FILA_STONE_BRICKS.get());
        this.simpleBlock(ModBlocks.FILA_PILLAR.get(), this.models()
                .cubeColumn(ModBlocks.FILA_PILLAR.getId().getPath(),
                        this.modLoc("block/fila_stone_pillar_side"),
                        this.modLoc("block/fila_stone_pillar_top")));
        this.getVariantBuilder(ModBlocks.CHARCOAL_TORCH.get())
                .partialState().with(CharcoalTorch.LIT, true)
                .addModels(new ConfiguredModel(this.models().torch("charcoal_torch",
                        this.modLoc("block/charcoal_torch")).renderType(CUTOUT)))
                .partialState().with(CharcoalTorch.LIT, false)
                .addModels(new ConfiguredModel(this.models().torch("charcoal_torch_off",
                        this.modLoc("block/charcoal_torch_off")).renderType(CUTOUT)));
        this.simpleBlock(ModBlocks.GRASSY_FILA_DIRT.get(), this.models()
                .cubeBottomTop(ModBlocks.GRASSY_FILA_DIRT.getId().getPath(),
                        this.modLoc("block/fila_grass_dirt_side"),
                        this.modLoc("block/fila_dirt"),
                        this.modLoc("block/fila_grass_dirt_top")));
        this.simpleBlockWithRenderType(ModBlocks.FILA_LEAVES.get(), CUTOUT);
        this.simpleBlockWithRenderType(ModBlocks.EBONY_LEAVES.get(), CUTOUT);
        this.logBlock((RotatedPillarBlock) ModBlocks.FILA_LOG.get());
        this.logBlock((RotatedPillarBlock) ModBlocks.EBONY_LOG.get());
        this.axisBlock((RotatedPillarBlock) ModBlocks.FILA_WOOD.get(),
                this.modLoc("block/fila_log"), this.modLoc("block/fila_log"));
        this.axisBlock((RotatedPillarBlock) ModBlocks.EBONY_WOOD.get(),
                this.modLoc("block/ebony_log"), this.modLoc("block/ebony_log"));
        this.doorBlockWithRenderType((DoorBlock) ModBlocks.FILA_WOOD_DOOR.get(),
                this.modLoc("block/fila_wood_door_bottom"),
                this.modLoc("block/fila_wood_door_top"), CUTOUT);
        this.doorBlockWithRenderType((DoorBlock) ModBlocks.EBONY_DOOR.get(),
                this.modLoc("block/ebony_door_bottom"),
                this.modLoc("block/ebony_door_top"), CUTOUT);
        this.trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.FILA_WOOD_TRAPDOOR.get(),
                this.blockTexture(ModBlocks.FILA_WOOD_TRAPDOOR.get()), true, CUTOUT);
        this.trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.EBONY_TRAPDOOR.get(),
                this.blockTexture(ModBlocks.EBONY_PLANKS.get()), true, CUTOUT);
        this.simpleBlockItem(ModBlocks.FILA_WOOD_TRAPDOOR.get(), this.models()
                .trapdoorBottom(ModBlocks.FILA_WOOD_TRAPDOOR.getId().getPath(),
                this.blockTexture(ModBlocks.FILA_WOOD_TRAPDOOR.get())));
        this.simpleBlockItem(ModBlocks.EBONY_TRAPDOOR.get(), this.models()
                .trapdoorBottom(ModBlocks.EBONY_TRAPDOOR.getId().getPath(),
                        this.blockTexture(ModBlocks.EBONY_TRAPDOOR.get())));
    }

    private String name(Block block) {
        return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
    }

    public void simpleBlockWithRenderType(Block block, ResourceLocation type) {
        simpleBlock(block, models().cubeAll(this.name(block), this.blockTexture(block)).renderType(type));
    }

    private void fire(Block block) {
        String name = this.name(block);
        ResourceLocation floor = this.mcLoc("template_fire_floor");
        ResourceLocation side = this.mcLoc("template_fire_side");
        ResourceLocation sideAlt = this.mcLoc("template_fire_side_alt");
        ResourceLocation texture0 = this.modLoc("block/" + name + "_0");
        ResourceLocation texture1 = this.modLoc("block/" + name + "_1");
        String floor0 = name + "_floor0", floor1 = name + "_floor1";
        String side0 = name + "_side0", side1 = name + "_side1";
        String sideAlt0 = name + "_side_alt0", sideAlt1 = name + "_side_alt1";
        MultiPartBlockStateBuilder builder = this.getMultipartBuilder(block).part()
                .modelFile(this.models().singleTexture(floor0, floor, texture0).renderType(CUTOUT)).nextModel()
                .modelFile(this.models().singleTexture(floor1, floor, texture1).renderType(CUTOUT)).addModel().end();
        for (int i = 0; i < 4; i++) {
            builder.part().modelFile(this.models().singleTexture(side0, side, texture0).renderType(CUTOUT)).rotationY(i * 90).nextModel()
                    .modelFile(this.models().singleTexture(side1, side, texture1).renderType(CUTOUT)).rotationY(i * 90).nextModel()
                    .modelFile(this.models().singleTexture(sideAlt0, sideAlt, texture0).renderType(CUTOUT)).rotationY(i * 90).nextModel()
                    .modelFile(this.models().singleTexture(sideAlt1, sideAlt, texture1).renderType(CUTOUT)).rotationY(i * 90).addModel().end();
        }
    }

}