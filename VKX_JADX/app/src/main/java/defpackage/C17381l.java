package defpackage;

/* JADX INFO: renamed from: lٗۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17381l implements InterfaceC18528l {
    public static final C17381l yandex = new C17381l();
    public static final C3537l loadAd = C3537l.crashlytics("pid");
    public static final C3537l crashlytics = C3537l.crashlytics("processName");
    public static final C3537l amazon = C3537l.crashlytics("reasonCode");
    public static final C3537l purchase = C3537l.crashlytics("importance");
    public static final C3537l billing = C3537l.crashlytics("pss");
    public static final C3537l mopub = C3537l.crashlytics("rss");
    public static final C3537l admob = C3537l.crashlytics("timestamp");
    public static final C3537l subs = C3537l.crashlytics("traceFile");
    public static final C3537l isPro = C3537l.crashlytics("buildIdMappingForArch");

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        AbstractC5235l abstractC5235l = (AbstractC5235l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.purchase(loadAd, ((C1379l) abstractC5235l).yandex);
        C1379l c1379l = (C1379l) abstractC5235l;
        interfaceC14185l.yandex(crashlytics, c1379l.loadAd);
        interfaceC14185l.purchase(amazon, c1379l.crashlytics);
        interfaceC14185l.purchase(purchase, c1379l.amazon);
        interfaceC14185l.mopub(billing, c1379l.purchase);
        interfaceC14185l.mopub(mopub, c1379l.billing);
        interfaceC14185l.mopub(admob, c1379l.mopub);
        interfaceC14185l.yandex(subs, c1379l.admob);
        interfaceC14185l.yandex(isPro, c1379l.subs);
    }
}
