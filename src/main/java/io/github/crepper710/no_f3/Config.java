package io.github.crepper710.no_f3;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class Config {
    private static final ForgeConfigSpec SPEC;
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue enabled;

    static {
        enabled = BUILDER.comment("should the chenges by this mod be enabled (hide f3 information)").define("enabled", true);
        SPEC = BUILDER.build();
    }

    public static void setup() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, SPEC);
    }

    public static boolean isEnabled() {
        return enabled.get();
    }

    public static void setEnabled(boolean value) {
        enabled.set(value);
    }
}
