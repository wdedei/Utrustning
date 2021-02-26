package io.wdedei.utrustning;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class rarrow extends Item {
    public rarrow(Settings settings) {
        super(settings);
    }
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        rarrowe wd = new rarrowe(world, shooter);
        wd.initFromStack(stack);
        return wd;
    }
}
