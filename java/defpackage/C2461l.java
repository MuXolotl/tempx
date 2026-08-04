package defpackage;

/* JADX INFO: renamed from: lؘؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2461l implements InterfaceC13593l {
    public static final /* synthetic */ C13637l loadAd;
    public static final C2461l yandex;

    static {
        C2461l c2461l = new C2461l();
        yandex = c2461l;
        C13637l c13637l = new C13637l("org.mongodb.kbson.serialization.BsonTimestampSerializer.BsonValueData", c2461l, 2);
        c13637l.smaato("t", false);
        c13637l.smaato("i", false);
        loadAd = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C12975l c12975l = C12975l.yandex;
        return new InterfaceC16588l[]{c12975l, c12975l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C1582l c1582l = (C1582l) obj;
        C13637l c13637l = loadAd;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(c13637l);
        C12975l c12975l = C12975l.yandex;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(c13637l, 0, c12975l, new C12524l(c1582l.yandex));
        abstractC4072l.applovin(c13637l, 1, c12975l, new C12524l(c1582l.loadAd));
        interfaceC0039lCrashlytics.yandex(c13637l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C13637l c13637l = loadAd;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(c13637l);
        boolean z = true;
        int i = 0;
        Object objAds = null;
        Object objAds2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(c13637l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                objAds = interfaceC14988lCrashlytics.ads(c13637l, 0, C12975l.yandex, objAds);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                objAds2 = interfaceC14988lCrashlytics.ads(c13637l, 1, C12975l.yandex, objAds2);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(c13637l);
        return new C1582l(i, (C12524l) objAds, (C12524l) objAds2);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
