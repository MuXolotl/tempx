package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lّؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12318l {
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap(9);
        yandex = map;
        map.put("xx-small", new C12671l(7, 0.694f));
        map.put("x-small", new C12671l(7, 0.833f));
        map.put("small", new C12671l(7, 10.0f));
        map.put("medium", new C12671l(7, 12.0f));
        map.put("large", new C12671l(7, 14.4f));
        map.put("x-large", new C12671l(7, 17.3f));
        map.put("xx-large", new C12671l(7, 20.7f));
        map.put("smaller", new C12671l(9, 83.33f));
        map.put("larger", new C12671l(9, 120.0f));
    }
}
