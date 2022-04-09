package me.miquiis.geckolibexample.client.events;

import me.miquiis.geckolibexample.GeckolibExample;
import me.miquiis.geckolibexample.common.entities.renderer.BlastoiseRenderer;
import me.miquiis.geckolibexample.common.registers.EntityRegister;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = GeckolibExample.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.BLASTOISE.get(), BlastoiseRenderer::new);
    }

}
