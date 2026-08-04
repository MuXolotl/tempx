package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٔ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15205l {
    public static final Map crashlytics;
    public final String loadAd;
    public final int yandex;

    static {
        HashMap map = new HashMap();
        AbstractC9361l.premium(1, "XMSSMT_SHA2_20/2_256", map, yandex(32, 16, 67, 20, 2, "SHA-256"));
        AbstractC9361l.premium(2, "XMSSMT_SHA2_20/4_256", map, yandex(32, 16, 67, 20, 4, "SHA-256"));
        AbstractC9361l.premium(3, "XMSSMT_SHA2_40/2_256", map, yandex(32, 16, 67, 40, 2, "SHA-256"));
        AbstractC9361l.premium(4, "XMSSMT_SHA2_40/4_256", map, yandex(32, 16, 67, 40, 4, "SHA-256"));
        AbstractC9361l.premium(5, "XMSSMT_SHA2_40/8_256", map, yandex(32, 16, 67, 40, 8, "SHA-256"));
        AbstractC9361l.premium(6, "XMSSMT_SHA2_60/3_256", map, yandex(32, 16, 67, 60, 3, "SHA-256"));
        AbstractC9361l.premium(7, "XMSSMT_SHA2_60/6_256", map, yandex(32, 16, 67, 60, 6, "SHA-256"));
        AbstractC9361l.premium(8, "XMSSMT_SHA2_60/12_256", map, yandex(32, 16, 67, 60, 12, "SHA-256"));
        AbstractC9361l.premium(9, "XMSSMT_SHA2_20/2_512", map, yandex(64, 16, 131, 20, 2, "SHA-512"));
        AbstractC9361l.premium(10, "XMSSMT_SHA2_20/4_512", map, yandex(64, 16, 131, 20, 4, "SHA-512"));
        AbstractC9361l.premium(11, "XMSSMT_SHA2_40/2_512", map, yandex(64, 16, 131, 40, 2, "SHA-512"));
        AbstractC9361l.premium(12, "XMSSMT_SHA2_40/4_512", map, yandex(64, 16, 131, 40, 4, "SHA-512"));
        AbstractC9361l.premium(13, "XMSSMT_SHA2_40/8_512", map, yandex(64, 16, 131, 40, 8, "SHA-512"));
        AbstractC9361l.premium(14, "XMSSMT_SHA2_60/3_512", map, yandex(64, 16, 131, 60, 3, "SHA-512"));
        AbstractC9361l.premium(15, "XMSSMT_SHA2_60/6_512", map, yandex(64, 16, 131, 60, 6, "SHA-512"));
        AbstractC9361l.premium(16, "XMSSMT_SHA2_60/12_512", map, yandex(64, 16, 131, 60, 12, "SHA-512"));
        AbstractC9361l.premium(17, "XMSSMT_SHAKE_20/2_256", map, yandex(32, 16, 67, 20, 2, "SHAKE128"));
        AbstractC9361l.premium(18, "XMSSMT_SHAKE_20/4_256", map, yandex(32, 16, 67, 20, 4, "SHAKE128"));
        AbstractC9361l.premium(19, "XMSSMT_SHAKE_40/2_256", map, yandex(32, 16, 67, 40, 2, "SHAKE128"));
        AbstractC9361l.premium(20, "XMSSMT_SHAKE_40/4_256", map, yandex(32, 16, 67, 40, 4, "SHAKE128"));
        AbstractC9361l.premium(21, "XMSSMT_SHAKE_40/8_256", map, yandex(32, 16, 67, 40, 8, "SHAKE128"));
        AbstractC9361l.premium(22, "XMSSMT_SHAKE_60/3_256", map, yandex(32, 16, 67, 60, 3, "SHAKE128"));
        AbstractC9361l.premium(23, "XMSSMT_SHAKE_60/6_256", map, yandex(32, 16, 67, 60, 6, "SHAKE128"));
        AbstractC9361l.premium(24, "XMSSMT_SHAKE_60/12_256", map, yandex(32, 16, 67, 60, 12, "SHAKE128"));
        AbstractC9361l.premium(25, "XMSSMT_SHAKE_20/2_512", map, yandex(64, 16, 131, 20, 2, "SHAKE256"));
        AbstractC9361l.premium(26, "XMSSMT_SHAKE_20/4_512", map, yandex(64, 16, 131, 20, 4, "SHAKE256"));
        AbstractC9361l.premium(27, "XMSSMT_SHAKE_40/2_512", map, yandex(64, 16, 131, 40, 2, "SHAKE256"));
        AbstractC9361l.premium(28, "XMSSMT_SHAKE_40/4_512", map, yandex(64, 16, 131, 40, 4, "SHAKE256"));
        AbstractC9361l.premium(29, "XMSSMT_SHAKE_40/8_512", map, yandex(64, 16, 131, 40, 8, "SHAKE256"));
        AbstractC9361l.premium(30, "XMSSMT_SHAKE_60/3_512", map, yandex(64, 16, 131, 60, 3, "SHAKE256"));
        AbstractC9361l.premium(31, "XMSSMT_SHAKE_60/6_512", map, yandex(64, 16, 131, 60, 6, "SHAKE256"));
        map.put(yandex(64, 16, 131, 60, 12, "SHAKE256"), new C15205l(32, "XMSSMT_SHAKE_60/12_512"));
        crashlytics = DesugarCollections.unmodifiableMap(map);
    }

    public C15205l(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
    }

    public static String yandex(int i, int i2, int i3, int i4, int i5, String str) {
        if (str == null) {
            C6541l.subs("algorithmName == null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        sb.append("-");
        sb.append(i3);
        sb.append("-");
        sb.append(i4);
        return AbstractC9361l.Signature(i5, "-", sb);
    }

    public final String toString() {
        return this.loadAd;
    }
}
