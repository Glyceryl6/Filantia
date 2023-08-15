package com.filania.registry;

import com.filania.Filania;
import com.filania.items.ModArmorMaterials;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.filania.utils.ModItemRegUtils.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Filania.MOD_ID);
    public static final RegistryObject<Item> ROOT_FOSSIL = normal("root_fossil");
    public static final RegistryObject<Item> RAW_SILVER = normal("raw_silver");
    public static final RegistryObject<Item> FILA_STICK = normal("fila_stick");
    public static final RegistryObject<Item> FILA_STRING = normal("fila_string");
    public static final RegistryObject<Item> FILA_CHARCOAL = normal("fila_charcoal");
    public static final RegistryObject<Item> FINE_SILVER_INGOT = normal("fine_silver_ingot");
    public static final RegistryObject<Item> FINE_SILVER_STRING = normal("fine_silver_string");
    public static final RegistryObject<Item> RAW_ABYSS_STEEL = normal("raw_abyss_steel");
    public static final RegistryObject<Item> ABYSS_STEEL_INGOT = normal("abyss_steel_ingot");
    public static final RegistryObject<Item> RAW_LOVERIUM = normal("raw_loverium");
    public static final RegistryObject<Item> LOVERIUM_INGOT = normal("loverium_ingot");
    public static final RegistryObject<Item> NITER = normal("niter");
    public static final RegistryObject<Item> NITER_POWDER = normal("niter_powder");
    //Armor
    public static final RegistryObject<Item> FABRIC_HAT = ITEMS.register("fabric_hat",
            () -> new ArmorItem(ModArmorMaterials.FABRIC, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FABRIC_COAT = ITEMS.register("fabric_coat",
            () -> new ArmorItem(ModArmorMaterials.FABRIC, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FABRIC_PANTS = ITEMS.register("fabric_pants",
            () -> new ArmorItem(ModArmorMaterials.FABRIC, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FABRIC_BOOTS = ITEMS.register("fabric_boots",
            () -> new ArmorItem(ModArmorMaterials.FABRIC, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HAT = ITEMS.register("silver_hat",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_COAT = ITEMS.register("silver_coat",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PANTS = ITEMS.register("silver_pants",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> ABYSS_STEEL_HELMET = ITEMS.register("abyss_steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.ABYSS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ABYSS_STEEL_CHESTPLATE = ITEMS.register("abyss_steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ABYSS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ABYSS_STEEL_LEGGINGS = ITEMS.register("abyss_steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.ABYSS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ABYSS_STEEL_BOOTS = ITEMS.register("abyss_steel_boots",
            () -> new ArmorItem(ModArmorMaterials.ABYSS, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> LOVERIUM_HELMET = ITEMS.register("loverium_helmet",
            () -> new ArmorItem(ModArmorMaterials.LOVERIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> LOVERIUM_CHESTPLATE = ITEMS.register("loverium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LOVERIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> LOVERIUM_LEGGINGS = ITEMS.register("loverium_leggings",
            () -> new ArmorItem(ModArmorMaterials.LOVERIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> LOVERIUM_BOOTS = ITEMS.register("loverium_boots",
            () -> new ArmorItem(ModArmorMaterials.LOVERIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    //Weapon and Tools
    public static final RegistryObject<Item> FINE_SILVER_CUTTER = ITEMS.register("fine_silver_cutter",
            () -> new ShearsItem(new Item.Properties().durability(239)));
    //Foods
    public static final RegistryObject<Item> SHIITAKE = ITEMS.register("shiitake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(1.8F).fast().build())));
    public static final RegistryObject<Item> COOKED_SHIITAKE = ITEMS.register("cooked_shiitake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(7.2F).fast().build())));

}