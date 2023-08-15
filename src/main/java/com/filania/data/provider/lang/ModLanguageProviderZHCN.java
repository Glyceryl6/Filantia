package com.filania.data.provider.lang;

import com.filania.Filania;
import com.filania.registry.ModBlocks;
import com.filania.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProviderZHCN extends LanguageProvider {

    public ModLanguageProviderZHCN(PackOutput output) {
        super(output, Filania.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.add(ModItems.ROOT_FOSSIL.get(), "化石根");
        this.add(ModItems.RAW_SILVER.get(), "粗银");
        this.add(ModItems.FILA_STICK.get(), "缠丝木棍");
        this.add(ModItems.FILA_STRING.get(), "缠丝线");
        this.add(ModItems.FILA_CHARCOAL.get(), "木炭棒");
        this.add(ModItems.FABRIC_HAT.get(), "丝织帽");
        this.add(ModItems.FABRIC_COAT.get(), "丝织外套");
        this.add(ModItems.FABRIC_PANTS.get(), "丝织裤");
        this.add(ModItems.FABRIC_BOOTS.get(), "丝织靴");
        this.add(ModItems.SILVER_HAT.get(), "银丝帽");
        this.add(ModItems.SILVER_COAT.get(), "银丝外套");
        this.add(ModItems.SILVER_PANTS.get(), "银丝裤");
        this.add(ModItems.SILVER_BOOTS.get(), "银丝靴");
        this.add(ModItems.ABYSS_STEEL_HELMET.get(), "渊钢头盔");
        this.add(ModItems.ABYSS_STEEL_CHESTPLATE.get(), "渊钢胸甲");
        this.add(ModItems.ABYSS_STEEL_LEGGINGS.get(), "渊钢护腿");
        this.add(ModItems.ABYSS_STEEL_BOOTS.get(), "渊钢战靴");
        this.add(ModItems.LOVERIUM_HELMET.get(), "螺纹锂头盔");
        this.add(ModItems.LOVERIUM_CHESTPLATE.get(), "螺纹锂胸甲");
        this.add(ModItems.LOVERIUM_LEGGINGS.get(), "螺纹锂护腿");
        this.add(ModItems.LOVERIUM_BOOTS.get(), "螺纹锂战靴");
        this.add(ModItems.FINE_SILVER_INGOT.get(), "细丝纹银锭");
        this.add(ModItems.FINE_SILVER_STRING.get(), "银线");
        this.add(ModItems.SHIITAKE.get(), "香菇");
        this.add(ModItems.COOKED_SHIITAKE.get(), "烤香菇");
        this.add(ModItems.FINE_SILVER_CUTTER.get(), "银剪刀");
        this.add(ModItems.RAW_ABYSS_STEEL.get(), "粗渊钢矿");
        this.add(ModItems.ABYSS_STEEL_INGOT.get(), "渊钢锭");
        this.add(ModItems.RAW_LOVERIUM.get(), "粗螺纹锂结晶");
        this.add(ModItems.LOVERIUM_INGOT.get(), "螺纹锂锭");
        this.add(ModItems.NITER.get(), "硝石");
        this.add(ModItems.NITER_POWDER.get(), "硝石粉");
        this.add(ModBlocks.FILA_LEAVES.get(), "缠丝树叶");
        this.add(ModBlocks.FILA_LOG.get(), "缠丝树原木");
        this.add(ModBlocks.FILA_PLANKS.get(), "缠丝木板");
        this.add(ModBlocks.FILA_WOOD.get(), "缠丝木头");
        this.add(ModBlocks.FILA_DIRT.get(), "缠丝泥土");
        this.add(ModBlocks.FILA_STONE.get(), "缠丝石");
        this.add(ModBlocks.FILA_BEDROCK.get(), "结网基石");
        this.add(ModBlocks.FILA_PILLAR.get(), "缠丝石柱");
        this.add(ModBlocks.FILA_STONE_BRICKS.get(), "缠丝石砖");
        this.add(ModBlocks.FILA_WOOD_DOOR.get(), "缠丝木门");
        this.add(ModBlocks.FILA_WOOD_TRAPDOOR.get(), "缠丝木活板门");
        this.add(ModBlocks.CHISELED_FILA_STONE_BRICKS.get(), "錾制缠丝石砖");
        this.add(ModBlocks.EBONY_LEAVES.get(), "黑檀树叶");
        this.add(ModBlocks.EBONY_LOG.get(), "黑檀树原木");
        this.add(ModBlocks.EBONY_PLANKS.get(), "黑檀木板");
        this.add(ModBlocks.EBONY_WOOD.get(), "黑檀木头");
        this.add(ModBlocks.EBONY_DOOR.get(), "黑檀木门");
        this.add(ModBlocks.EBONY_TRAPDOOR.get(), "黑檀木活板门");
        this.add(ModBlocks.FABRIC_BLOCK.get(), "丝织块");
        this.add(ModBlocks.SILVER_BLOCK.get(), "银块");
        this.add(ModBlocks.ABYSS_STEEL_BLOCK.get(), "渊钢块");
        this.add(ModBlocks.LOVERIUM_BLOCK.get(), "螺纹锂块");
        this.add(ModBlocks.SILVER_ORE.get(), "银矿石");
        this.add(ModBlocks.ROOT_FOSSIL_ORE.get(), "根系化石");
        this.add(ModBlocks.ABYSS_STEEL_ORE.get(), "渊钢矿石");
        this.add(ModBlocks.LOVERIUM_ORE.get(), "螺纹锂矿石");
        this.add(ModBlocks.NITER_ORE.get(), "硝石矿石");
        this.add(ModBlocks.GRASSY_FILA_DIRT.get(), "长草的缠丝泥土");
        this.add("itemGroup." + Filania.MOD_ID, "缠丝秘境");
    }

}