package io.wdedei.utrustning.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class mor2 extends ArmorItem {
    public mor2(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        for(ItemStack item:entity.getArmorItems()){
            if(item.getItem().equals(this)){
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,3));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,4));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,3));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,2));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,2));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,2));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,600,2));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600,3));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,600,2));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,300,0));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,600,1));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,600,8));

            }
        }
    }
    private boolean entity(LivingEntity entity) {
        return false;
    }
}
