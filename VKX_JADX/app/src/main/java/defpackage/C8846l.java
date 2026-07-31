package defpackage;

/* JADX INFO: renamed from: lٌٗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8846l implements InterfaceC18528l {
    public static final C8846l yandex = new C8846l();
    public static final C3537l loadAd = C3537l.crashlytics("sessionId");
    public static final C3537l crashlytics = C3537l.crashlytics("firstSessionId");
    public static final C3537l amazon = C3537l.crashlytics("sessionIndex");
    public static final C3537l purchase = C3537l.crashlytics("eventTimestampUs");
    public static final C3537l billing = C3537l.crashlytics("dataCollectionStatus");
    public static final C3537l mopub = C3537l.crashlytics("firebaseInstallationId");
    public static final C3537l admob = C3537l.crashlytics("firebaseAuthenticationToken");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C11867l c11867l = (C11867l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c11867l.yandex);
        interfaceC14185l.yandex(crashlytics, c11867l.loadAd);
        interfaceC14185l.purchase(amazon, c11867l.crashlytics);
        interfaceC14185l.mopub(purchase, c11867l.amazon);
        interfaceC14185l.yandex(billing, c11867l.purchase);
        interfaceC14185l.yandex(mopub, c11867l.billing);
        interfaceC14185l.yandex(admob, c11867l.mopub);
    }
}
