package io.wdedei.utrustning.materials;


import io.wdedei.utrustning.Utrustning;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ar3 implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {23, 25, 26, 20};
    private static final int[] PROTECTION_VALUES = new int[] {10, 13, 15, 10};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 55;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 45;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Utrustning.BBDCLOCK);
    }

    @Override
    public String getName() {
        return "bdc_block";
    }

    @Override
    public float getToughness() {
        return 13.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.7F;
    }
}