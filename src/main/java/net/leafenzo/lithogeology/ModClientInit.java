package net.leafenzo.lithogeology;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.lithogeology.block.ModRenderLayers;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderLayers.registerBlockCutouts();
    }
}
