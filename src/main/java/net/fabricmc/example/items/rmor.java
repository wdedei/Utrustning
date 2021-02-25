package net.fabricmc.example.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class rmor extends ArmorItem {
    public rmor(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        for(ItemStack item:entity.getArmorItems()){
            if(item.getItem().equals(this)){
                ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,100,0));
            }
        }
    }
    private boolean entity(LivingEntity entity) {
        return false;
    }
}
