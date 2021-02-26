package io.wdedei.utrustning;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class hoe extends HoeItem {
    protected hoe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
