package com.filania.event;

import com.filania.Filania;
import com.filania.items.ModArmorMaterials;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;
import java.util.function.Function;

@Mod.EventBusSubscriber(modid = Filania.MOD_ID)
public class ItemSubscriber {

    private static final Function<Float, AttributeModifier> ABYSS_KNOCKBACK_ATTRIBUTE = (addition) ->
            new AttributeModifier(UUID.fromString("0C8A12B2-5D6A-4FBF-8394-F9D7E5B80A75"),
                    "abyss_knockback", addition, AttributeModifier.Operation.ADDITION);

    @SubscribeEvent
    public static void onAttributeGet(ItemAttributeModifierEvent event) {
        if (event.getSlotType().isArmor()) {
            Item item = event.getItemStack().getItem();
            if (item instanceof ArmorItem armorItem && armorItem.getMaterial() == ModArmorMaterials.ABYSS) {
                CompoundTag tag = armorItem.getDefaultInstance().getOrCreateTag();
                if (tag.contains("filania.abyss_knockback")) {
                    float knockback = tag.getFloat("filania.abyss_knockback");
                    event.addModifier(Attributes.KNOCKBACK_RESISTANCE, ABYSS_KNOCKBACK_ATTRIBUTE.apply(knockback));
                }
            }
        }
    }

}
