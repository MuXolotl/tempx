package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lؚۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7597l {
    public static final C7597l loadAd;
    public static volatile C7597l yandex;

    static {
        C7597l c7597l = new C7597l();
        Map map = Collections.EMPTY_MAP;
        loadAd = c7597l;
    }

    public static C7597l yandex() {
        C7597l c7597l;
        C17073l c17073l = C17073l.crashlytics;
        C7597l c7597l2 = yandex;
        if (c7597l2 != null) {
            return c7597l2;
        }
        synchronized (C7597l.class) {
            try {
                c7597l = yandex;
                if (c7597l == null) {
                    Class cls = AbstractC15959l.yandex;
                    C7597l c7597l3 = null;
                    if (cls != null) {
                        try {
                            c7597l3 = (C7597l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c7597l = c7597l3 != null ? c7597l3 : loadAd;
                    yandex = c7597l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7597l;
    }
}
