package defpackage;

import android.os.Looper;

/* JADX INFO: renamed from: lؑۖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0508l extends AbstractC17742l {
    public static volatile C0508l amazon;
    public static final ExecutorC11374l purchase = new ExecutorC11374l(0);
    public final C5300l crashlytics = new C5300l();

    public static C0508l purchase() {
        if (amazon != null) {
            return amazon;
        }
        synchronized (C0508l.class) {
            try {
                if (amazon == null) {
                    amazon = new C0508l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return amazon;
    }

    public final void billing(Runnable runnable) {
        C5300l c5300l = this.crashlytics;
        if (c5300l.purchase == null) {
            synchronized (c5300l.crashlytics) {
                try {
                    if (c5300l.purchase == null) {
                        c5300l.purchase = C5300l.purchase(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c5300l.purchase.post(runnable);
    }
}
