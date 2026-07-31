package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؖ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4197l {
    public static boolean crashlytics = false;
    public static boolean loadAd = false;
    public static final /* synthetic */ int purchase = 0;
    public static final AtomicBoolean yandex = new AtomicBoolean();
    public static final AtomicBoolean amazon = new AtomicBoolean();

    public static boolean yandex(Context context) {
        try {
            if (!crashlytics) {
                PackageInfo packageInfoLoadAd = C16797l.yandex(context).loadAd(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                C12585l.yandex(context);
                if (packageInfoLoadAd == null || C12585l.crashlytics(packageInfoLoadAd, false) || !C12585l.crashlytics(packageInfoLoadAd, true)) {
                    loadAd = false;
                } else {
                    loadAd = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            crashlytics = true;
        }
        return loadAd || !"user".equals(Build.TYPE);
    }
}
