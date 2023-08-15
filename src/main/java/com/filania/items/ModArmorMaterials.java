package com.filania.items;

import com.filania.registry.ModItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@SuppressWarnings("deprecation")
public enum ModArmorMaterials implements StringRepresentable, ArmorMaterial {

    FABRIC("fabric", new int[] {98, 113, 121, 83}, new int[] {1, 2, 3, 1},
            15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.5F, 0.0F,
            () -> Ingredient.of(ModItems.FILA_STRING.get())),

    SILVER("silver", new int[] {196, 226, 241, 166}, new int[] {2, 5, 6, 2},
            20, SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 0.0F,
            () -> Ingredient.of(ModItems.FINE_SILVER_INGOT.get())),

    ABYSS("abyss", new int[] {343, 396, 422, 290}, new int[] {3, 6, 8, 3},
            10, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, 0.0F,
            () -> Ingredient.of(ModItems.ABYSS_STEEL_INGOT.get())),

    LOVERIUM("loverium", new int[] {644, 743, 792, 545}, new int[] {4, 8, 9, 4},
            15, SoundEvents.ARMOR_EQUIP_GENERIC, 3.0F, 0.0F,
            () -> Ingredient.of(ModItems.LOVERIUM_INGOT.get()));

    private final String name;
    private final int[] slotDurability;
    private final int[] protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int[] slotDurability, int[] protectionFunctionForType, int enchantmentValue,
            SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> ingredientSupplier) {
        this.name = name;
        this.slotDurability = slotDurability;
        this.protectionFunctionForType = protectionFunctionForType;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(ingredientSupplier);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return this.slotDurability[type.getSlot().getIndex()];
    }

    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionFunctionForType[type.getSlot().getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }

}