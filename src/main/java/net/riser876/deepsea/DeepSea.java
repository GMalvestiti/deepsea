package net.riser876.deepsea;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static net.riser876.deepsea.config.ConfigManager.CONFIG;

public class DeepSea implements ModInitializer {

    public static final String MOD_ID = "deepsea";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        if (Objects.nonNull(CONFIG) && CONFIG.ENABLED) {
            DeepSea.LOGGER.info("[DeepSea] Mod loaded.");
        } else {
            DeepSea.LOGGER.info("[DeepSea] Mod disabled.");
        }
    }
}
