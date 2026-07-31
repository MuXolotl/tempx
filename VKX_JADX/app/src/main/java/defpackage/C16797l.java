package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lٖۧۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16797l {
    public static final C16797l loadAd;
    public C3865l yandex;

    static {
        C16797l c16797l = new C16797l();
        c16797l.yandex = null;
        loadAd = c16797l;
    }

    public static C3865l yandex(Context context) {
        C3865l c3865l;
        C16797l c16797l = loadAd;
        synchronized (c16797l) {
            try {
                if (c16797l.yandex == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c16797l.yandex = new C3865l(context);
                }
                c3865l = c16797l.yandex;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3865l;
    }
}
