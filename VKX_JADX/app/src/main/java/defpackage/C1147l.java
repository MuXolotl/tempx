package defpackage;

/* JADX INFO: renamed from: lؒٚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1147l implements InterfaceC18528l {
    public static final C1147l yandex = new C1147l();
    public static final C3537l loadAd = C3537l.crashlytics("eventType");
    public static final C3537l crashlytics = C3537l.crashlytics("sessionData");
    public static final C3537l amazon = C3537l.crashlytics("applicationInfo");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C5743l c5743l = (C5743l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        c5743l.getClass();
        interfaceC14185l.yandex(loadAd, EnumC11503l.SESSION_START);
        interfaceC14185l.yandex(crashlytics, c5743l.yandex);
        interfaceC14185l.yandex(amazon, c5743l.loadAd);
    }
}
