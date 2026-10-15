// java, SamuraiSunsetMod.java, fabric client mod, minecraft 26.1.2
package com.samuraisunset;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reine Asset-Overlay-Mod: ersetzt vanilla-Texturen/Texte unter assets/minecraft/...
 * (Panorama, Ladebildschirm-Hintergrund, Splash-Texte) durch die im Jar mitgelieferten
 * Varianten. Fabrics Resource-Reloader merged mod-interne assets/minecraft/-Pfade direkt
 * in den Spielressourcen-Stack - kein separates Resource Pack, keine Aktivierung nötig.
 */
public final class SamuraiSunsetMod implements ClientModInitializer {
    public static final String MOD_ID = "samurai_sunset";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Samurai Sunset geladen - Titelbildschirm, Ladebildschirm und Splash-Texte ueberschrieben.");
    }
}
