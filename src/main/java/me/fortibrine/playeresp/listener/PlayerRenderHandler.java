package me.fortibrine.playeresp.listener;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class PlayerRenderHandler {

    @SubscribeEvent
    public static void onRenderPlayerEvent(RenderPlayerEvent.Post event) {
        EntityPlayer player = event.getEntityPlayer();
        player.setGlowing(true);
    }

}
