package io.wdedei.utrustning;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class axe3 extends AxeItem {

    protected axe3(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        for(ItemStack i:entity.getItemsHand()){
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,3));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,4));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,3));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,2));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,2));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,2));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,600,2));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600,3));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,600,2));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,300,0));
            if(i.getItem().equals(this))((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,600,4));
        }}
}
