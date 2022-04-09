package me.miquiis.geckolibexample.common.registers;

import me.miquiis.geckolibexample.GeckolibExample;
import me.miquiis.geckolibexample.common.entities.BlastoiseEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = GeckolibExample.MOD_ID)
public class EntityRegister {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, GeckolibExample.MOD_ID);

    public static final RegistryObject<EntityType<BlastoiseEntity>> BLASTOISE = ENTITIES.register("blastoise", () ->
            EntityType.Builder.<BlastoiseEntity>of(BlastoiseEntity::new, EntityClassification.CREATURE)
                    .sized(2f, 2f)
                    .build(new ResourceLocation(GeckolibExample.MOD_ID, "blastoise").toString())
    );

    public static void register(IEventBus bus)
    {
        ENTITIES.register(bus);
    }

    @SubscribeEvent
    public static void onEntityRegister(EntityAttributeCreationEvent event)
    {
        event.put(BLASTOISE.get(), BlastoiseEntity.createMobAttributes().build());
    }

}
