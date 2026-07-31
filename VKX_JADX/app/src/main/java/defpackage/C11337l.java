package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lُۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11337l {
    public static final C11337l loadAd;
    public static volatile C11337l yandex;

    static {
        C11337l c11337l = new C11337l();
        Map map = Collections.EMPTY_MAP;
        loadAd = c11337l;
    }

    public static C11337l yandex() {
        C11337l c11337l = yandex;
        if (c11337l != null) {
            return c11337l;
        }
        synchronized (C11337l.class) {
            try {
                C11337l c11337l2 = yandex;
                if (c11337l2 != null) {
                    return c11337l2;
                }
                int i = AbstractC5004l.yandex;
                C11337l c11337lMopub = AbstractC12446l.mopub();
                yandex = c11337lMopub;
                return c11337lMopub;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
