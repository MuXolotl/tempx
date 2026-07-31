package org.conscrypt;

import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ApplicationProtocolSelector {
    public abstract String selectApplicationProtocol(SSLEngine sSLEngine, List<String> list);

    public abstract String selectApplicationProtocol(SSLSocket sSLSocket, List<String> list);
}
