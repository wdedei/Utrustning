package io.wdedei.utrustning;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class axe2 extends AxeItem {

    protected axe2(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        for(ItemStack i:entity.getItemsHand()){
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,100,1));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,1));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,100,2));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,0));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,100,1));
        }}
}
