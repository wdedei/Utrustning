package io.wdedei.utrustning.materials;


import io.wdedei.utrustning.Utrustning;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ar implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {15, 17, 18, 13};
    private static final int[] PROTECTION_VALUES = new int[] {4, 7, 9, 4};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 40;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Utrustning.BSTONE);
    }

    @Override
    public String getName() {
        return "bstone";
    }

    @Override
    public float getToughness() {
        return 5.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }
}