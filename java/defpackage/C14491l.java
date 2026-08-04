package defpackage;

/* JADX INFO: renamed from: lٖٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14491l implements InterfaceC18528l {
    public static final C14491l yandex = new C14491l();
    public static final C3537l loadAd = C3537l.crashlytics("performance");
    public static final C3537l crashlytics = C3537l.crashlytics("crashlytics");
    public static final C3537l amazon = C3537l.crashlytics("sessionSamplingRate");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C8512l c8512l = (C8512l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c8512l.yandex);
        interfaceC14185l.yandex(crashlytics, c8512l.loadAd);
        interfaceC14185l.billing(amazon, c8512l.crashlytics);
    }
}
