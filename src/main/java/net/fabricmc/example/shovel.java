package net.fabricmc.example;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class shovel extends ShovelItem {
    public shovel(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        for(ItemStack i:entity.getItemsHand()){
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,1,0));
        }}
}
