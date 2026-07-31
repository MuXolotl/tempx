package org.chromium.net;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class UrlResponseInfo {

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static abstract class HeaderBlock {
        public abstract List<Map.Entry<String, String>> getAsList();

        public abstract Map<String, List<String>> getAsMap();
    }

    public abstract Map<String, List<String>> getAllHeaders();

    public abstract List<Map.Entry<String, String>> getAllHeadersAsList();

    public abstract int getHttpStatusCode();

    public abstract String getHttpStatusText();

    public abstract String getNegotiatedProtocol();

    public abstract String getProxyServer();

    public abstract long getReceivedByteCount();

    public abstract String getUrl();

    public abstract List<String> getUrlChain();

    public abstract boolean wasCached();
}
