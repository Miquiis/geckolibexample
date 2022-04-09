package me.miquiis.geckolibexample.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class BlastoiseEntity extends MobEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public BlastoiseEntity(EntityType<? extends MobEntity> p_i48576_1_, World p_i48576_2_) {
        super(p_i48576_1_, p_i48576_2_);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 10, this::predicate));
    }

    private PlayState predicate(AnimationEvent animationEvent) {
        if (animationEvent.isMoving())
        {
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("Blastoise_walk"));
        } else
        {
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("Blastoise_idle"));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
