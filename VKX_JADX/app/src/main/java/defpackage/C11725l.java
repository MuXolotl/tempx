package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٍُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11725l {
    public static final Map crashlytics;
    public final String loadAd;
    public final int yandex;

    static {
        HashMap map = new HashMap();
        map.put(yandex("SHA-256", 32, 16, 67, 10), new C11725l(1, "XMSS_SHA2_10_256"));
        map.put(yandex("SHA-256", 32, 16, 67, 16), new C11725l(2, "XMSS_SHA2_16_256"));
        map.put(yandex("SHA-256", 32, 16, 67, 20), new C11725l(3, "XMSS_SHA2_20_256"));
        map.put(yandex("SHA-512", 64, 16, 131, 10), new C11725l(4, "XMSS_SHA2_10_512"));
        map.put(yandex("SHA-512", 64, 16, 131, 16), new C11725l(5, "XMSS_SHA2_16_512"));
        map.put(yandex("SHA-512", 64, 16, 131, 20), new C11725l(6, "XMSS_SHA2_20_512"));
        map.put(yandex("SHAKE128", 32, 16, 67, 10), new C11725l(7, "XMSS_SHAKE_10_256"));
        map.put(yandex("SHAKE128", 32, 16, 67, 16), new C11725l(8, "XMSS_SHAKE_16_256"));
        map.put(yandex("SHAKE128", 32, 16, 67, 20), new C11725l(9, "XMSS_SHAKE_20_256"));
        map.put(yandex("SHAKE256", 64, 16, 131, 10), new C11725l(10, "XMSS_SHAKE_10_512"));
        map.put(yandex("SHAKE256", 64, 16, 131, 16), new C11725l(11, "XMSS_SHAKE_16_512"));
        map.put(yandex("SHAKE256", 64, 16, 131, 20), new C11725l(12, "XMSS_SHAKE_20_512"));
        crashlytics = DesugarCollections.unmodifiableMap(map);
    }

    public C11725l(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
    }

    public static String yandex(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.loadAd;
    }
}
