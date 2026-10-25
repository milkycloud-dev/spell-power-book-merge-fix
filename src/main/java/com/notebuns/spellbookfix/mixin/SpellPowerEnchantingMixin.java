package com.notebuns.spellbookfix.mixin;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets = "net.spell_power.SpellPowerEnchanting", remap = false)
public abstract class SpellPowerEnchantingMixin {
    @Inject(method = "isAllowed(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/ItemStack;)Z",
            at = @At("HEAD"), cancellable = true, require = 0)
    private static void spellbookfix$allowEnchantedBooks(Holder<Enchantment> enchantment, ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.is(Items.ENCHANTED_BOOK)) {
            cir.setReturnValue(true);
        }
    }
}
