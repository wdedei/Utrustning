package io.wdedei.utrustning.materials;


import io.wdedei.utrustning.Utrustning;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ar2 implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {20, 22, 23, 17};
    private static final int[] PROTECTION_VALUES = new int[] {7, 10, 12, 7};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 45;
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
        return Ingredient.ofItems(Utrustning.BBCLOCK);
    }

    @Override
    public String getName() {
        return "bc_block";
    }

    @Override
    public float getToughness() {
        return 10.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.4F;
    }
}