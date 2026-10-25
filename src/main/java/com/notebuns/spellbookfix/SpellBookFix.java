package com.notebuns.spellbookfix;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

@Mod(SpellBookFix.MOD_ID)
public final class SpellBookFix {
    public static final String MOD_ID = "notebuns_spellbookfix";

    public SpellBookFix(IEventBus modBus) {
        if (ModList.get().isLoaded("spell_power")) {
            LogUtils.getLogger().info("Spell Power book merge fix loaded");
        } else {
            LogUtils.getLogger().warn("Spell Power book merge fix loaded, but spell_power is not installed: nothing to fix");
        }
    }
}
