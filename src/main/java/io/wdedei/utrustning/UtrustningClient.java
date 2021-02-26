package io.wdedei.utrustning;

import io.wdedei.utrustning.linkage.UtrustningLinkageClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

@Environment(EnvType.CLIENT)
public class UtrustningClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // See Pigeonia Linkage Standard.
        FabricLoader.getInstance().getEntrypoints("utrustning.client", UtrustningLinkageClient.class).forEach(UtrustningLinkageClient::initClient);
    }
}
