package defpackage;

import android.os.SystemClock;

/* JADX INFO: renamed from: lَۛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10569l {
    public static final AbstractC11156l yandex;

    static {
        C17388l c17388l;
        try {
            SystemClock.elapsedRealtimeNanos();
            c17388l = new C17388l(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c17388l = new C17388l(1);
        }
        yandex = c17388l;
    }
}
