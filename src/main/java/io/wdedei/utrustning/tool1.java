package io.wdedei.utrustning;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class tool1 implements ToolMaterial {

    public static final tool1 INSTANCE = new tool1();
    @Override
    public int getDurability() {
        return 3840;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 68.0F;
    }
    @Override
    public float getAttackDamage() {
        return 4.0F;
    }
    @Override
    public int getMiningLevel() {
        return 5;
    }
    @Override
    public int getEnchantability() {
        return 38;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Utrustning.BBLOCK);
    }
}