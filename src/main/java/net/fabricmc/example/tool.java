package net.fabricmc.example;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class tool implements ToolMaterial {

    public static final tool INSTANCE = new tool();
    @Override
    public int getDurability() {
        return 2100;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 50.0F;
    }
    @Override
    public float getAttackDamage() {
        return 3.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 25;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ExampleMod.BSTONE);
    }
}