package com.filania.event;

import com.filania.Filania;
import com.filania.items.ModArmorMaterials;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Filania.MOD_ID)
public class EntitySubscriber {

    @SubscribeEvent
    @SuppressWarnings("resource")
    public static void onLivingHurt(LivingHurtEvent event) {
        LivingEntity livingEntity = event.getEntity();
        Entity entity = event.getSource().getEntity();
        if (livingEntity instanceof Player player && entity instanceof LivingEntity) {
            for (EquipmentSlot equipmentSlot : EquipmentSlot.values()) {
                if (equipmentSlot.isArmor()) {
                    float amount = event.getAmount();
                    ItemStack stack = player.getItemBySlot(equipmentSlot);
                    if (stack.getItem() instanceof ArmorItem armorItem) {
                        ArmorMaterial material = armorItem.getMaterial();
                        if (material == ModArmorMaterials.LOVERIUM) {
                            player.heal(amount * 0.05F);
                        } else if (material == ModArmorMaterials.ABYSS && !player.level().isClientSide) {
                            int light = player.level().getLightEmission(player.getOnPos());
                            event.setAmount(light <= 5 ? amount * 0.025F : amount);
                        }
                    }
                }
            }
        }
    }

}