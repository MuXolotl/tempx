package defpackage;

/* JADX INFO: renamed from: lَٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10520l implements InterfaceC18528l {
    public static final C10520l yandex = new C10520l();
    public static final C3537l loadAd = C3537l.crashlytics("eventTimeMs");
    public static final C3537l crashlytics = C3537l.crashlytics("eventCode");
    public static final C3537l amazon = C3537l.crashlytics("complianceData");
    public static final C3537l purchase = C3537l.crashlytics("eventUptimeMs");
    public static final C3537l billing = C3537l.crashlytics("sourceExtension");
    public static final C3537l mopub = C3537l.crashlytics("sourceExtensionJsonProto3");
    public static final C3537l admob = C3537l.crashlytics("timezoneOffsetSeconds");
    public static final C3537l subs = C3537l.crashlytics("networkConnectionInfo");
    public static final C3537l isPro = C3537l.crashlytics("experimentIds");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC11339l abstractC11339l = (AbstractC11339l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.mopub(loadAd, ((C12628l) abstractC11339l).yandex);
        C12628l c12628l = (C12628l) abstractC11339l;
        interfaceC14185l.yandex(crashlytics, c12628l.loadAd);
        interfaceC14185l.yandex(amazon, c12628l.crashlytics);
        interfaceC14185l.mopub(purchase, c12628l.amazon);
        interfaceC14185l.yandex(billing, c12628l.purchase);
        interfaceC14185l.yandex(mopub, c12628l.billing);
        interfaceC14185l.mopub(admob, c12628l.mopub);
        interfaceC14185l.yandex(subs, c12628l.admob);
        interfaceC14185l.yandex(isPro, c12628l.subs);
    }
}
