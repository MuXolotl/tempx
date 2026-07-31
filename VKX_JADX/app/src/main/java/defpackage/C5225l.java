package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lؘؗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5225l {
    public static final C5225l loadAd;
    public static volatile C5225l yandex;

    static {
        C5225l c5225l = new C5225l();
        Map map = Collections.EMPTY_MAP;
        loadAd = c5225l;
    }

    public static C5225l yandex() {
        C5225l c5225l;
        Class cls = AbstractC16910l.yandex;
        C5225l c5225l2 = yandex;
        if (c5225l2 != null) {
            return c5225l2;
        }
        synchronized (C5225l.class) {
            try {
                c5225l = yandex;
                if (c5225l == null) {
                    Class cls2 = AbstractC18737l.yandex;
                    C5225l c5225l3 = null;
                    if (cls2 != null) {
                        try {
                            c5225l3 = (C5225l) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c5225l = c5225l3 != null ? c5225l3 : loadAd;
                    yandex = c5225l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5225l;
    }
}
