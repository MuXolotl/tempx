package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lٟٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18491l implements InterfaceC18528l {
    public static final C18491l yandex = new C18491l();
    public static final C3537l loadAd = C3537l.crashlytics("packageName");
    public static final C3537l crashlytics = C3537l.crashlytics("versionName");
    public static final C3537l amazon = C3537l.crashlytics("appBuildVersion");
    public static final C3537l purchase = C3537l.crashlytics("deviceManufacturer");
    public static final C3537l billing = C3537l.crashlytics("currentProcessDetails");
    public static final C3537l mopub = C3537l.crashlytics("appProcessDetails");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C2778l c2778l = (C2778l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c2778l.yandex);
        interfaceC14185l.yandex(crashlytics, c2778l.loadAd);
        interfaceC14185l.yandex(amazon, c2778l.crashlytics);
        interfaceC14185l.yandex(purchase, Build.MANUFACTURER);
        interfaceC14185l.yandex(billing, c2778l.amazon);
        interfaceC14185l.yandex(mopub, c2778l.purchase);
    }
}
