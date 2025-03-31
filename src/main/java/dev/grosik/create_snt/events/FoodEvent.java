package dev.grosik.create_snt.events;

import dev.grosik.create_snt.CreateSNT;
import dev.grosik.create_snt.init.Items;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateSNT.MODID) //replace your_mod_id
public class FoodEvent {

    @SubscribeEvent
    public static void onFoodEaten(LivingEntityUseItemEvent.Finish event) {
        LivingEntity entity = event.getEntity();
        ItemStack item = event.getItem();

        if (entity instanceof Player player) {
            if (item.getItem() == Items.GUNPOWDER_CAKE.get()) {
                createPlayerExplosion(player, 3);
            } else if (item.getItem() == Items.CINDER_ROLL.get()) {
                player.setSecondsOnFire(2);
            }
        }
    }

    public static void createPlayerExplosion(Player player, float strength) {
        Level level = player.level();
        BlockPos playerPos = player.blockPosition();

        level.explode(player, playerPos.getX(), playerPos.getY(), playerPos.getZ(), strength, Level.ExplosionInteraction.TNT);
    }
}