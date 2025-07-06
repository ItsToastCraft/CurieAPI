package net.timeworndevs.quantum.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import net.timeworndevs.quantum.Quantum;
import net.timeworndevs.quantum.util.IEntityDataSaver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class ModEntityDataSaverMixin implements IEntityDataSaver {
    private NbtCompound persistentData;

    @Override
    public NbtCompound getPersistentData() {
        if (this.persistentData==null) {
            this.persistentData = new NbtCompound();
        }
        return persistentData;
    }

    //GENUINELY IDFK WHAT THAT IS :sob:

    /*@Inject(method="writeNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable info) {
        if (persistentData!=null) {
            nbt.put(Quantum.MOD_ID + ".fok_data", persistentData);
        }
    }

    @Inject(method="readNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info) {
        if (nbt.contains(Quantum.MOD_ID+".fok_data", 10)) {
            persistentData = nbt.getCompound(Quantum.MOD_ID + ".fok_data");
        }
    }*/
}
