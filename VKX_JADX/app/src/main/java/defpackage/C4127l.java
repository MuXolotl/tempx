package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؖٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4127l {
    public final C10023l admob;
    public final String amazon;
    public final String billing;
    public final ArrayList crashlytics;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String yandex;

    public C4127l(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, C10023l c10023l) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = arrayList;
        this.amazon = str3;
        this.purchase = str4;
        this.billing = str5;
        this.mopub = str6;
        this.admob = c10023l;
    }

    public static C4127l yandex(Context context, C9667l c9667l, String str, String str2, ArrayList arrayList, C10023l c10023l) {
        String packageName = context.getPackageName();
        String strAmazon = c9667l.amazon();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C4127l(str, str2, arrayList, strAmazon, packageName, string, str3, c10023l);
    }
}
