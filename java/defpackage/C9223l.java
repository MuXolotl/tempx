package defpackage;

/* JADX INFO: renamed from: lٌَۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9223l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C9223l yandex;

    static {
        C9223l c9223l = new C9223l();
        yandex = c9223l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.photos.PhotosPhotoSizesDto", c9223l, 5);
        c13637l.smaato("height", false);
        c13637l.smaato("type", false);
        c13637l.smaato("width", false);
        c13637l.smaato("url", true);
        c13637l.smaato("src", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C15250l.billing;
        C1313l c1313l = C1313l.yandex;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c1313l, interfaceC1220lArr[1].getValue(), c1313l, AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C15250l c15250l = (C15250l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C15250l.billing;
        int i = c15250l.yandex;
        String str = c15250l.purchase;
        String str2 = c15250l.amazon;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), c15250l.loadAd);
        abstractC4072l.signatures(2, c15250l.crashlytics, interfaceC18035l);
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C15250l.billing;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        EnumC16632l enumC16632l = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                enumC16632l = (EnumC16632l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC16632l);
                i |= 2;
            } else if (iAdmob == 2) {
                iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str2);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C15250l(i, iSubscription, enumC16632l, iSubscription2, str, str2);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
