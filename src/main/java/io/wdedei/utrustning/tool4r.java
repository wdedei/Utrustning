package io.wdedei.utrustning;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class tool4r implements ToolMaterial {
    public static final tool4r INSTANCE = new tool4r();
    @Override
    public int getDurability() {
        return 1234;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0F;
    }
    @Override
    public float getAttackDamage() {
        return 1.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 35;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Utrustning.RSTONE);
    }
}