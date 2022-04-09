package me.miquiis.geckolibexample.common.entities.renderer;

import me.miquiis.geckolibexample.common.entities.BlastoiseEntity;
import me.miquiis.geckolibexample.common.model.BlastoiseModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlastoiseRenderer extends GeoEntityRenderer<BlastoiseEntity> {
    public BlastoiseRenderer(EntityRendererManager renderManager) {
        super(renderManager, new BlastoiseModel());
    }
}
