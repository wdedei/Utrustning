package io.wdedei.utrustning.linkage;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(EnvType.CLIENT)
public interface UtrustningLinkageClient {
    void initClient();
}
