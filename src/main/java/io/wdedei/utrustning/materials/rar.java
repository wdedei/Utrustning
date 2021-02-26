package io.wdedei.utrustning.materials;


import io.wdedei.utrustning.Utrustning;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class rar implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {14, 16, 17, 12};
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
        return 35;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Utrustning.RSTONE);
    }

    @Override
    public String getName() {
        return "rstone";
    }

    @Override
    public float getToughness() {
        return 15.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}