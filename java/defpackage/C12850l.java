package defpackage;

/* JADX INFO: renamed from: lٌّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12850l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C12850l yandex;

    static {
        C12850l c12850l = new C12850l();
        yandex = c12850l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25Background", c12850l, 4);
        c13637l.smaato("desktop", false);
        c13637l.smaato("mobile", false);
        c13637l.smaato("story", false);
        c13637l.smaato("post", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C8368l c8368l = C8368l.yandex;
        return new InterfaceC16588l[]{c8368l, c8368l, c8368l, c8368l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C5576l c5576l = (C5576l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        C8368l c8368l = C8368l.yandex;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, c8368l, c5576l.yandex);
        abstractC4072l.applovin(interfaceC18035l, 1, c8368l, c5576l.loadAd);
        abstractC4072l.applovin(interfaceC18035l, 2, c8368l, c5576l.crashlytics);
        abstractC4072l.applovin(interfaceC18035l, 3, c8368l, c5576l.amazon);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        C0415l c0415l = null;
        C0415l c0415l2 = null;
        C0415l c0415l3 = null;
        C0415l c0415l4 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                c0415l = (C0415l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C8368l.yandex, c0415l);
                i |= 1;
            } else if (iAdmob == 1) {
                c0415l2 = (C0415l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, C8368l.yandex, c0415l2);
                i |= 2;
            } else if (iAdmob == 2) {
                c0415l3 = (C0415l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, C8368l.yandex, c0415l3);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                c0415l4 = (C0415l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, C8368l.yandex, c0415l4);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C5576l(i, c0415l, c0415l2, c0415l3, c0415l4);
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
