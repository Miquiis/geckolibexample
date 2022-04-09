package me.miquiis.geckolibexample.common.model;

import me.miquiis.geckolibexample.GeckolibExample;
import me.miquiis.geckolibexample.common.entities.BlastoiseEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlastoiseModel extends AnimatedGeoModel<BlastoiseEntity> {
    @Override
    public ResourceLocation getModelLocation(BlastoiseEntity object) {
        return new ResourceLocation(GeckolibExample.MOD_ID, "geo/blastoise.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BlastoiseEntity object) {
        return new ResourceLocation(GeckolibExample.MOD_ID, "textures/entity/blastoise.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BlastoiseEntity animatable) {
        return new ResourceLocation(GeckolibExample.MOD_ID, "animations/blastoise.animation.json");
    }
}
