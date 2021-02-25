package net.fabricmc.example;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class paxe extends PickaxeItem {
    protected paxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
