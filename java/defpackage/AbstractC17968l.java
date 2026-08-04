package defpackage;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: renamed from: lٖۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17968l {
    public static final C6396l yandex = new C6396l();

    public static void crashlytics(String str, Throwable th) {
        yandex.getClass();
        HashSet hashSet = C6396l.yandex;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }

    public static void loadAd(String str) {
        yandex.getClass();
        HashSet hashSet = C6396l.yandex;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void yandex() {
        yandex.getClass();
    }
}
