package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lؗ۟ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5186l implements InterfaceC18528l {
    public static final C5186l yandex = new C5186l();
    public static final C3537l loadAd = C3537l.crashlytics("appId");
    public static final C3537l crashlytics = C3537l.crashlytics("deviceModel");
    public static final C3537l amazon = C3537l.crashlytics("sessionSdkVersion");
    public static final C3537l purchase = C3537l.crashlytics("osVersion");
    public static final C3537l billing = C3537l.crashlytics("logEnvironment");
    public static final C3537l mopub = C3537l.crashlytics("androidAppInfo");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C6579l c6579l = (C6579l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c6579l.yandex);
        interfaceC14185l.yandex(crashlytics, Build.MODEL);
        interfaceC14185l.yandex(amazon, "3.0.4");
        interfaceC14185l.yandex(purchase, Build.VERSION.RELEASE);
        interfaceC14185l.yandex(billing, EnumC1615l.LOG_ENVIRONMENT_PROD);
        interfaceC14185l.yandex(mopub, c6579l.loadAd);
    }
}
