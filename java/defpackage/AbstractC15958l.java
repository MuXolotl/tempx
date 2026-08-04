package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lٕ۟ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15958l {
    public static final boolean crashlytics;
    public static Method loadAd;
    public static boolean yandex;

    static {
        crashlytics = Build.VERSION.SDK_INT >= 27;
    }
}
