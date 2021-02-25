package net.fabricmc.example;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.function.Consumer;

import static net.fabricmc.example.ExampleMod.*;

public class rbow extends BowItem {
    public rbow(Settings settings) {
        super(settings.maxDamage(521));
    }
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (user instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)user;
            boolean bl = playerEntity.abilities.creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack itemStack = playerEntity.getArrowType(stack);
            if (!itemStack.isEmpty() || bl) {
                if (itemStack.isEmpty()) {
                    itemStack = new ItemStack(RARROW);
                }

                int i = this.getMaxUseTime(stack) - remainingUseTicks;
                float f = getPullProgress(i);
                if ((double)f >= 0.2D) {
                    boolean bl2 = bl && itemStack.getItem() == RARROW;
                    if (!world.isClient) {
                        rarrow dw = (rarrow) ((rarrow)(itemStack.getItem() instanceof rarrow ? itemStack.getItem() : RARROW));
                        PersistentProjectileEntity persistentProjectileEntity = dw.createArrow(world, itemStack, playerEntity);
                        persistentProjectileEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 1.0F, f * 3.0F, 5);
                        if (f == 2.0F) {
                            persistentProjectileEntity.setCritical(true);
                        }
                        stack.damage(1, (LivingEntity)playerEntity, (Consumer)((p) -> {
                        }));
                        if (bl2 || playerEntity.abilities.creativeMode && (itemStack.getItem() == RARROW || itemStack.getItem() == RARROW)) {
                            persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                        }

                        world.spawnEntity(persistentProjectileEntity);
                    }

                    world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 2.0F, 2.0F / (RANDOM.nextFloat() * 1.4F + 2.2F) + f * 1.5F);
                    if (!bl2 && !playerEntity.abilities.creativeMode) {
                        itemStack.decrement(1);
                        if (itemStack.isEmpty()) {
                            playerEntity.inventory.removeOne(itemStack);
                        }
                    }

                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
        if (user instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)user;
            boolean bl = playerEntity.abilities.creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack itemStack = playerEntity.getArrowType(stack);
            if (!itemStack.isEmpty() || bl) {
                if (itemStack.isEmpty()) {
                    itemStack = new ItemStack(RARROW);
                }

                int i = this.getMaxUseTime(stack) - remainingUseTicks;
                float f = getPullProgress(i);
                if ((double)f >= 0.2D) {
                    boolean bl2 = bl && itemStack.getItem() == RARROW;
                    if (!world.isClient) {
                        rarrow dw = (rarrow) ((rarrow)(itemStack.getItem() instanceof rarrow ? itemStack.getItem() : RARROW));
                        PersistentProjectileEntity persistentProjectileEntity = dw.createArrow(world, itemStack, playerEntity);
                        persistentProjectileEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 1.0F, f * 3.0F, 5);
                        if (f == 2.0F) {
                            persistentProjectileEntity.setCritical(true);
                        }
                        stack.damage(1, (LivingEntity)playerEntity, (Consumer)((p) -> {
                        }));
                        if (bl2 || playerEntity.abilities.creativeMode && (itemStack.getItem() == RARROW || itemStack.getItem() == RARROW)) {
                            persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                        }

                        world.spawnEntity(persistentProjectileEntity);
                    }

                    world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 2.0F, 2.0F / (RANDOM.nextFloat() * 1.4F + 2.2F) + f * 1.5F);
                    if (!bl2 && !playerEntity.abilities.creativeMode) {
                        itemStack.decrement(1);
                        if (itemStack.isEmpty()) {
                            playerEntity.inventory.removeOne(itemStack);
                        }
                    }

                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
        if (user instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)user;
            boolean bl = playerEntity.abilities.creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack itemStack = playerEntity.getArrowType(stack);
            if (!itemStack.isEmpty() || bl) {
                if (itemStack.isEmpty()) {
                    itemStack = new ItemStack(RARROW);
                }

                int i = this.getMaxUseTime(stack) - remainingUseTicks;
                float f = getPullProgress(i);
                if ((double)f >= 0.2D) {
                    boolean bl2 = bl && itemStack.getItem() == RARROW;
                    if (!world.isClient) {
                        rarrow dw = (rarrow) ((rarrow)(itemStack.getItem() instanceof rarrow ? itemStack.getItem() : RARROW));
                        PersistentProjectileEntity persistentProjectileEntity = dw.createArrow(world, itemStack, playerEntity);
                        persistentProjectileEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 1.0F, f * 3.0F, 5);
                        if (f == 2.0F) {
                            persistentProjectileEntity.setCritical(true);
                        }
                        stack.damage(1, (LivingEntity)playerEntity, (Consumer)((p) -> {
                        }));
                        if (bl2 || playerEntity.abilities.creativeMode && (itemStack.getItem() == RARROW || itemStack.getItem() == RARROW)) {
                            persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                        }

                        world.spawnEntity(persistentProjectileEntity);
                    }

                    world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 2.0F, 2.0F / (RANDOM.nextFloat() * 1.4F + 2.2F) + f * 1.5F);
                    if (!bl2 && !playerEntity.abilities.creativeMode) {
                        itemStack.decrement(1);
                        if (itemStack.isEmpty()) {
                            playerEntity.inventory.removeOne(itemStack);
                        }
                    }

                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
        if (user instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)user;
            boolean bl = playerEntity.abilities.creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack itemStack = playerEntity.getArrowType(stack);
            if (!itemStack.isEmpty() || bl) {
                if (itemStack.isEmpty()) {
                    itemStack = new ItemStack(RARROW);
                }

                int i = this.getMaxUseTime(stack) - remainingUseTicks;
                float f = getPullProgress(i);
                if ((double)f >= 0.2D) {
                    boolean bl2 = bl && itemStack.getItem() == RARROW;
                    if (!world.isClient) {
                        rarrow dw = (rarrow) ((rarrow)(itemStack.getItem() instanceof rarrow ? itemStack.getItem() : RARROW));
                        PersistentProjectileEntity persistentProjectileEntity = dw.createArrow(world, itemStack, playerEntity);
                        persistentProjectileEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 1.0F, f * 3.0F, 5);
                        if (f == 2.0F) {
                            persistentProjectileEntity.setCritical(true);
                        }
                        stack.damage(1, (LivingEntity)playerEntity, (Consumer)((p) -> {
                        }));
                        if (bl2 || playerEntity.abilities.creativeMode && (itemStack.getItem() == RARROW || itemStack.getItem() == RARROW)) {
                            persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                        }

                        world.spawnEntity(persistentProjectileEntity);
                    }

                    world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 2.0F, 2.0F / (RANDOM.nextFloat() * 1.4F + 2.2F) + f * 1.5F);
                    if (!bl2 && !playerEntity.abilities.creativeMode) {
                        itemStack.decrement(1);
                        if (itemStack.isEmpty()) {
                            playerEntity.inventory.removeOne(itemStack);
                        }
                    }

                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
        if (user instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)user;
            boolean bl = playerEntity.abilities.creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack itemStack = playerEntity.getArrowType(stack);
            if (!itemStack.isEmpty() || bl) {
                if (itemStack.isEmpty()) {
                    itemStack = new ItemStack(RARROW);
                }

                int i = this.getMaxUseTime(stack) - remainingUseTicks;
                float f = getPullProgress(i);
                if ((double)f >= 0.2D) {
                    boolean bl2 = bl && itemStack.getItem() == RARROW;
                    if (!world.isClient) {
                        rarrow dw = (rarrow) ((rarrow)(itemStack.getItem() instanceof rarrow ? itemStack.getItem() : RARROW));
                        PersistentProjectileEntity persistentProjectileEntity = dw.createArrow(world, itemStack, playerEntity);
                        persistentProjectileEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 1.0F, f * 3.0F, 5);
                        if (f == 2.0F) {
                            persistentProjectileEntity.setCritical(true);
                        }
                        stack.damage(1, (LivingEntity)playerEntity, (Consumer)((p) -> {
                        }));
                        if (bl2 || playerEntity.abilities.creativeMode && (itemStack.getItem() == RARROW || itemStack.getItem() == RARROW)) {
                            persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                        }

                        world.spawnEntity(persistentProjectileEntity);
                    }

                    world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 2.0F, 2.0F / (RANDOM.nextFloat() * 1.4F + 2.2F) + f * 1.5F);
                    if (!bl2 && !playerEntity.abilities.creativeMode) {
                        itemStack.decrement(1);
                        if (itemStack.isEmpty()) {
                            playerEntity.inventory.removeOne(itemStack);
                        }
                    }

                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
    }

    public static float getPullProgress(int useTicks) {
        float f = (float)useTicks / 11.0F;
        f = (f * f + f * 3.0F) / 4.0F;
        if (f > 2.0F) {
            f = 2.0F;
        }

        return f;
    }

    public int getMaxUseTime(ItemStack stack) {
        return 72000;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        boolean bl = !user.getArrowType(itemStack).isEmpty();
        if (!user.abilities.creativeMode && !bl) {
            return TypedActionResult.fail(itemStack);
        } else {
            user.setCurrentHand(hand);
            return TypedActionResult.consume(itemStack);
        }
    }

    public int getRange() {
        return 50;
    }
}
