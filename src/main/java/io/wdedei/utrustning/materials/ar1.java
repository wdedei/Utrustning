package io.wdedei.utrustning.materials;


import io.wdedei.utrustning.Utrustning;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ar1 implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {17, 19, 20, 15};
    private static final int[] PROTECTION_VALUES = new int[] {5, 8, 10, 5};

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
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Utrustning.BBLOCK);
    }

    @Override
    public String getName() {
        return "b_block";
    }

    @Override
    public float getToughness() {
        return 7.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.2F;
    }
}