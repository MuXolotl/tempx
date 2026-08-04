package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: renamed from: lًَٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8109l {
    public static final C3797l yandex = new C3797l("CommonUtils", "");

    public static String yandex(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            C3797l c3797l = yandex;
            if (!Log.isLoggable((String) c3797l.f7903l, 6)) {
                return "";
            }
            Log.e("CommonUtils", c3797l.m1424extends(strConcat));
            return "";
        }
    }
}
