package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lؒۥَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1466l {
    public static final C1466l loadAd;
    public static volatile C1466l yandex;

    static {
        C1466l c1466l = new C1466l();
        Map map = Collections.EMPTY_MAP;
        loadAd = c1466l;
    }

    public static C1466l yandex() {
        C1466l c1466l;
        C10738l c10738l = C10738l.crashlytics;
        C1466l c1466l2 = yandex;
        if (c1466l2 != null) {
            return c1466l2;
        }
        synchronized (C1466l.class) {
            try {
                c1466l = yandex;
                if (c1466l == null) {
                    Class cls = AbstractC6572l.yandex;
                    C1466l c1466l3 = null;
                    if (cls != null) {
                        try {
                            c1466l3 = (C1466l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1466l = c1466l3 != null ? c1466l3 : loadAd;
                    yandex = c1466l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1466l;
    }
}
