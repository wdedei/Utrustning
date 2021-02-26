package io.wdedei.utrustning.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class rstone extends Item {
    public rstone(Settings settings) {
        super(settings);
    }
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
