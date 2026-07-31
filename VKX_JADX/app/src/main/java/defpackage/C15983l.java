package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٕ۠ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15983l {
    public static final Map loadAd;
    public final String yandex;

    static {
        HashMap map = new HashMap();
        map.put(yandex(32, 67, "SHA-256"), new C15983l(16777217, "WOTSP_SHA2-256_W16"));
        map.put(yandex(64, 131, "SHA-512"), new C15983l(33554434, "WOTSP_SHA2-512_W16"));
        map.put(yandex(32, 67, "SHAKE128"), new C15983l(50331651, "WOTSP_SHAKE128_W16"));
        map.put(yandex(64, 131, "SHAKE256"), new C15983l(67108868, "WOTSP_SHAKE256_W16"));
        loadAd = DesugarCollections.unmodifiableMap(map);
    }

    public C15983l(int i, String str) {
        this.yandex = str;
    }

    public static String yandex(int i, int i2, String str) {
        return str + "-" + i + "-16-" + i2;
    }

    public final String toString() {
        return this.yandex;
    }
}
