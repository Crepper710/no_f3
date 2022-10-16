package io.github.crepper710.no_f3.mixin;

import io.github.crepper710.no_f3.Config;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class MixinPlayer {
    @Inject(method = "isReducedDebugInfo", at = @At("RETURN"), cancellable = true)
    public void isReducedDebugInfo(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(cir.getReturnValue() || Config.isEnabled());
    }
}
