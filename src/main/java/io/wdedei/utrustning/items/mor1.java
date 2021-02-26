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

public class mor1 extends ArmorItem {
    public mor1(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        for(ItemStack item:entity.getArmorItems()){
            if(item.getItem().equals(this)){
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,100,1));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,1));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,100,2));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,0));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,100,0));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,100,0));
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,100,1));

            }
        }
    }
    private boolean entity(LivingEntity entity) {
        return false;
    }
}
