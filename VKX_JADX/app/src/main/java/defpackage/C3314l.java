package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: renamed from: lُؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3314l {
    public static final C14965l loadAd;
    public static final C3314l yandex = new C3314l();

    static {
        C9309l c9309l = new C9309l();
        c9309l.subs(C5743l.class, C1147l.yandex);
        c9309l.subs(C11867l.class, C8846l.yandex);
        c9309l.subs(C8512l.class, C14491l.yandex);
        c9309l.subs(C6579l.class, C5186l.yandex);
        c9309l.subs(C2778l.class, C18491l.yandex);
        c9309l.subs(C1410l.class, C4762l.yandex);
        c9309l.f19122l = true;
        loadAd = new C14965l(c9309l);
    }

    public static C6579l yandex(C14184l c14184l) throws PackageManager.NameNotFoundException {
        c14184l.yandex();
        Context context = c14184l.yandex;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        c14184l.yandex();
        String str = c14184l.crashlytics.loadAd;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = strValueOf;
        }
        String str5 = Build.MANUFACTURER;
        c14184l.yandex();
        C1410l c1410lSmaato = AbstractC2847l.smaato(context);
        c14184l.yandex();
        return new C6579l(str, new C2778l(packageName, str4, strValueOf, c1410lSmaato, AbstractC2847l.billing(context)));
    }
}
