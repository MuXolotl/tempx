package defpackage;

/* JADX INFO: renamed from: lِۘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12061l implements InterfaceC18528l {
    public static final C12061l yandex = new C12061l();
    public static final C3537l loadAd = new C3537l("projectNumber", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(1))));
    public static final C3537l crashlytics = new C3537l("messageId", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(2))));
    public static final C3537l amazon = new C3537l("instanceId", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(3))));
    public static final C3537l purchase = new C3537l("messageType", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(4))));
    public static final C3537l billing = new C3537l("sdkPlatform", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(5))));
    public static final C3537l mopub = new C3537l("packageName", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(6))));
    public static final C3537l admob = new C3537l("collapseKey", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(7))));
    public static final C3537l subs = new C3537l("priority", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(8))));
    public static final C3537l isPro = new C3537l("ttl", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(9))));
    public static final C3537l firebase = new C3537l("topic", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(10))));
    public static final C3537l smaato = new C3537l("bulkId", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(11))));
    public static final C3537l remoteconfig = new C3537l("event", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(12))));
    public static final C3537l vip = new C3537l("analyticsLabel", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(13))));
    public static final C3537l metrica = new C3537l("campaignId", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(14))));
    public static final C3537l startapp = new C3537l("composerLabel", AbstractC12900l.startapp(AbstractC12900l.metrica(InterfaceC6924l.class, new C15317l(15))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C2265l c2265l = (C2265l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.mopub(loadAd, c2265l.yandex);
        interfaceC14185l.yandex(crashlytics, c2265l.loadAd);
        interfaceC14185l.yandex(amazon, c2265l.crashlytics);
        interfaceC14185l.yandex(purchase, c2265l.amazon);
        interfaceC14185l.yandex(billing, EnumC15382l.ANDROID);
        interfaceC14185l.yandex(mopub, c2265l.purchase);
        interfaceC14185l.yandex(admob, c2265l.billing);
        interfaceC14185l.purchase(subs, c2265l.mopub);
        interfaceC14185l.purchase(isPro, c2265l.admob);
        interfaceC14185l.yandex(firebase, c2265l.subs);
        interfaceC14185l.mopub(smaato, 0L);
        interfaceC14185l.yandex(remoteconfig, EnumC15473l.MESSAGE_DELIVERED);
        interfaceC14185l.yandex(vip, c2265l.isPro);
        interfaceC14185l.mopub(metrica, 0L);
        interfaceC14185l.yandex(startapp, c2265l.firebase);
    }
}
