package net.fabricmc.example.items;

import net.fabricmc.example.materials.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class r {

    public static final ArmorMaterial ar = new ar();
    public static final Item B_HELMET = new ArmorItem(ar, EquipmentSlot.HEAD, new Item.Settings().fireproof());
    public static final Item B_CHESTPLATE = new ArmorItem(ar, EquipmentSlot.CHEST, new Item.Settings().fireproof());
    public static final Item B_LEGGINGS = new ArmorItem(ar, EquipmentSlot.LEGS, new Item.Settings().fireproof());
    public static final Item B_BOOTS = new ArmorItem(ar, EquipmentSlot.FEET, new Item.Settings().fireproof());

    public static final ArmorMaterial ar1 = new ar1();
    public static final Item BB_HELMET = new mor(ar1, EquipmentSlot.HEAD, new Item.Settings().fireproof());
    public static final Item BB_CHESTPLATE = new mor(ar1, EquipmentSlot.CHEST, new Item.Settings().fireproof());
    public static final Item BB_LEGGINGS = new mor(ar1, EquipmentSlot.LEGS, new Item.Settings().fireproof());
    public static final Item BB_BOOTS = new mor(ar1, EquipmentSlot.FEET, new Item.Settings().fireproof());

    public static final ArmorMaterial ar2 = new ar2();
    public static final Item BBC_HELMET = new mor1(ar2, EquipmentSlot.HEAD, new Item.Settings().fireproof());
    public static final Item BBC_CHESTPLATE = new mor1(ar2, EquipmentSlot.CHEST, new Item.Settings().fireproof());
    public static final Item BBC_LEGGINGS = new mor1(ar2, EquipmentSlot.LEGS, new Item.Settings().fireproof());
    public static final Item BBC_BOOTS = new mor1(ar2, EquipmentSlot.FEET, new Item.Settings().fireproof());

    public static final ArmorMaterial ar3 = new ar3();
    public static final Item BBDC_HELMET = new mor2(ar3, EquipmentSlot.HEAD, new Item.Settings().fireproof());
    public static final Item BBDC_CHESTPLATE = new mor2(ar3, EquipmentSlot.CHEST, new Item.Settings().fireproof());
    public static final Item BBDC_LEGGINGS = new mor2(ar3, EquipmentSlot.LEGS, new Item.Settings().fireproof());
    public static final Item BBDC_BOOTS = new mor2(ar3, EquipmentSlot.FEET, new Item.Settings().fireproof());

    public static final ArmorMaterial rar = new rar();
    public static final Item R_HELMET = new rmor(rar, EquipmentSlot.HEAD, new Item.Settings().fireproof());
    public static final Item R_CHESTPLATE = new rmor(rar, EquipmentSlot.CHEST, new Item.Settings().fireproof());
    public static final Item R_LEGGINGS = new rmor(rar, EquipmentSlot.LEGS, new Item.Settings().fireproof());
    public static final Item R_BOOTS = new rmor(rar, EquipmentSlot.FEET, new Item.Settings().fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("p", "b_helmet"), B_HELMET);
        Registry.register(Registry.ITEM, new Identifier("p", "b_chestplate"), B_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("p", "b_leggings"), B_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("p", "b_boots"), B_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("p", "bb_helmet"), BB_HELMET);
        Registry.register(Registry.ITEM, new Identifier("p", "bb_chestplate"), BB_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("p", "bb_leggings"), BB_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("p", "bb_boots"), BB_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("p", "bbc_helmet"), BBC_HELMET);
        Registry.register(Registry.ITEM, new Identifier("p", "bbc_chestplate"), BBC_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("p", "bbc_leggings"), BBC_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("p", "bbc_boots"), BBC_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("p", "bbdc_helmet"), BBDC_HELMET);
        Registry.register(Registry.ITEM, new Identifier("p", "bbdc_chestplate"), BBDC_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("p", "bbdc_leggings"), BBDC_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("p", "bbdc_boots"), BBDC_BOOTS);

        Registry.register(Registry.ITEM, new Identifier("p", "r_helmet"), R_HELMET);
        Registry.register(Registry.ITEM, new Identifier("p", "r_chestplate"), R_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("p", "r_leggings"), R_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("p", "r_boots"), R_BOOTS);
    }
}
