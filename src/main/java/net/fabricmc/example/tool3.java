package net.fabricmc.example;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class tool3 implements ToolMaterial {

    public static final tool3 INSTANCE = new tool3();
    @Override
    public int getDurability() {
        return 6480;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 100.0F;
    }
    @Override
    public float getAttackDamage() {
        return 6.0F;
    }
    @Override
    public int getMiningLevel() {
        return 7;
    }
    @Override
    public int getEnchantability() {
        return 70;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ExampleMod.BBDCLOCK);
    }
}