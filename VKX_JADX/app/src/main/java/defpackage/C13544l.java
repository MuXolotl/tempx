package defpackage;

/* JADX INFO: renamed from: lؙْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13544l implements InterfaceC18528l {
    public static final C13544l yandex = new C13544l();
    public static final C3537l loadAd = C3537l.crashlytics("rolloutId");
    public static final C3537l crashlytics = C3537l.crashlytics("parameterKey");
    public static final C3537l amazon = C3537l.crashlytics("parameterValue");
    public static final C3537l purchase = C3537l.crashlytics("variantId");
    public static final C3537l billing = C3537l.crashlytics("templateVersion");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC1211l abstractC1211l = (AbstractC1211l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, ((C3996l) abstractC1211l).loadAd);
        C3996l c3996l = (C3996l) abstractC1211l;
        interfaceC14185l.yandex(crashlytics, c3996l.crashlytics);
        interfaceC14185l.yandex(amazon, c3996l.amazon);
        interfaceC14185l.yandex(purchase, c3996l.purchase);
        interfaceC14185l.mopub(billing, c3996l.billing);
    }
}
