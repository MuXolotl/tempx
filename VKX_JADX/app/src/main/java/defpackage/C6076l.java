package defpackage;

/* JADX INFO: renamed from: lؘۣۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6076l implements InterfaceC18528l {
    public static final C6076l yandex = new C6076l();
    public static final C3537l loadAd = new C3537l("durationMs", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(1))));
    public static final C3537l crashlytics = new C3537l("imageSource", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(2))));
    public static final C3537l amazon = new C3537l("imageFormat", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(3))));
    public static final C3537l purchase = new C3537l("imageByteSize", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(4))));
    public static final C3537l billing = new C3537l("imageWidth", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(5))));
    public static final C3537l mopub = new C3537l("imageHeight", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(6))));
    public static final C3537l admob = new C3537l("rotationDegrees", AbstractC12900l.startapp(AbstractC9029l.startapp(InterfaceC16996l.class, new C7601l(7))));

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        C4536l c4536l = (C4536l) obj;
        InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
        interfaceC14185l.yandex(loadAd, c4536l.yandex);
        interfaceC14185l.yandex(crashlytics, c4536l.loadAd);
        interfaceC14185l.yandex(amazon, c4536l.crashlytics);
        interfaceC14185l.yandex(purchase, c4536l.amazon);
        interfaceC14185l.yandex(billing, c4536l.purchase);
        interfaceC14185l.yandex(mopub, c4536l.billing);
        interfaceC14185l.yandex(admob, c4536l.mopub);
    }
}
