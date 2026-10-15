SAMURAI SUNSET - FABRIC MOD (Minecraft 26.1.2)
================================================

Kein Resource Pack. Das hier ist ein echtes Mod-Jar, kommt direkt in den mods-Ordner,
keine Aktivierung über Resource Packs nötig - Fabric merged die mitgelieferten
Texturen/Texte unter assets/minecraft/... automatisch in den Spielressourcen-Stack.

Was es ersetzt:
- Titelbildschirm-Panorama (die 6 rotierenden Hintergrundbilder) -> Fuji-Silhouette,
  Samurai, rotes Grasfeld, Glutpartikel
- Ladebildschirm-Hintergrund (loading_overlay.png)
- Splash-Texte (der gelbe Text neben dem Logo)

Bauen über GitHub:
1. Dieses Projekt als neues Repo hochladen (Ordnerinhalt 1:1, inkl. .github-Ordner).
2. Unter "Actions" läuft der Workflow "build" automatisch bei jedem Push an,
   oder manuell über "Run workflow" (workflow_dispatch) starten.
3. Nach grünem Lauf: im Workflow-Run unten bei "Artifacts" -> "samurai-sunset-jar"
   herunterladen. Darin liegt samurai-sunset-1.0.0.jar.

Installation (Client):
1. Fabric Loader >=0.19.3 für Minecraft 26.1.2 installieren (falls noch nicht geschehen).
2. Fabric API für 26.1.2 in den mods-Ordner legen (Pflichtabhängigkeit, Download auf
   modrinth.com/mod/fabric-api, passende Version 0.155.2+26.1.2 oder neuer wählen).
3. samurai-sunset-1.0.0.jar ebenfalls in %appdata%\.minecraft\mods legen.
4. Minecraft mit dem Fabric-26.1.2-Profil starten.

Wichtig für 26.1.2: Minecraft braucht ab dieser Version Java 25 - falls der Launcher
noch auf einer älteren Java-Version steht, in den Profileinstellungen umstellen.

Die Panorama-Grafiken sind prozedural erzeugt, gleicher Vibe wie dein Referenzbild,
keine 1:1-Kopie.
