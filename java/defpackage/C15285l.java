package defpackage;

import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٖٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15285l {
    public static final C15285l yandex = new C15285l();

    public static void loadAd(String str, String str2, String str3) {
        AppActivity appActivity = C8183l.loadAd;
        if (appActivity != null) {
            appActivity.license(new C17398l(Integer.parseInt(str2), Long.parseLong(str), str3, true));
        }
    }

    public static void yandex(String str, String str2, String str3) {
        AppActivity appActivity = C8183l.loadAd;
        if (appActivity != null) {
            appActivity.license(new C17398l(Integer.parseInt(str2), 8, Long.parseLong(str), str3));
        }
    }
}
