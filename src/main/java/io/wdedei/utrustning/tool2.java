package io.wdedei.utrustning;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class tool2 implements ToolMaterial {

    public static final tool2 INSTANCE = new tool2();
    @Override
    public int getDurability() {
        return 5120;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 86.0F;
    }
    @Override
    public float getAttackDamage() {
        return 5.0F;
    }
    @Override
    public int getMiningLevel() {
        return 6;
    }
    @Override
    public int getEnchantability() {
        return 45;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Utrustning.BBCLOCK);
    }
}