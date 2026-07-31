package org.chromium.net;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class ApiVersion {
    private static final int API_LEVEL = 24;
    private static final String CRONET_VERSION = "113.0.5672.61";
    private static final String LAST_CHANGE = "565e0525ff2f7bc0e5e29d04579ded84718ab14f-refs/branch-heads/5672@{#909}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "113.0.5672.61@565e0525";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 24;
    }
}
