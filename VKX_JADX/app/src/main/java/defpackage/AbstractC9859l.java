package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: lٍؘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9859l {
    public static final Handler yandex = new Handler(Looper.getMainLooper());

    public static void loadAd(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            yandex.post(runnable);
        }
    }

    public static void yandex() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        C8339l.smaato("Not running on main thread when it is required to");
    }
}
