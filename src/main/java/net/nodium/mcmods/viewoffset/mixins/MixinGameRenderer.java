package net.nodium.mcmods.viewoffset.mixins;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.nodium.mcmods.viewoffset.ViewOffsetMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class MixinGameRenderer {
    @Inject(method = "renderWorld", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;update(Lnet/minecraft/world/BlockView;Lnet/minecraft/entity/Entity;ZZF)V", shift = At.Shift.AFTER))
    private void cameraOffset(float tickDelta, long limitTime, MatrixStack matrix, CallbackInfo ci) {
        if (ViewOffsetMod.offsetEnabled) {
            matrix.translate(0.0, 0.0, -0.1);
        }
    }
}