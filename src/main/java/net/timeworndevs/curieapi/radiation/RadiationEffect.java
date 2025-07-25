package net.timeworndevs.curieapi.radiation;

import net.minecraft.server.network.ServerPlayerEntity;

public interface RadiationEffect {
    // Applies the effect determined by the class.
    void applyEffect(ServerPlayerEntity player, RadiationEntry types);
}
