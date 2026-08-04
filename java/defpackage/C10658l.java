package defpackage;

/* JADX INFO: renamed from: lَۢۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10658l implements InterfaceC18528l {
    public static final C10658l yandex = new C10658l();
    public static final C3537l loadAd = C3537l.crashlytics("name");
    public static final C3537l crashlytics = C3537l.crashlytics("code");
    public static final C3537l amazon = C3537l.crashlytics("address");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC5579l abstractC5579l = (AbstractC5579l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C6990l) abstractC5579l).yandex);
        C6990l c6990l = (C6990l) abstractC5579l;
        interfaceC14185l.yandex(crashlytics, c6990l.loadAd);
        interfaceC14185l.mopub(amazon, c6990l.crashlytics);
    }
}
