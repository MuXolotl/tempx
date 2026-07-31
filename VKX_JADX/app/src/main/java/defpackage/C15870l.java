package defpackage;

/* JADX INFO: renamed from: lٕۗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15870l implements InterfaceC13593l {
    public static final /* synthetic */ C13637l loadAd;
    public static final C15870l yandex;

    static {
        C15870l c15870l = new C15870l();
        yandex = c15870l;
        C13637l c13637l = new C13637l("org.mongodb.kbson.serialization.BsonDBPointerSerializer.BsonValueData", c15870l, 2);
        c13637l.smaato("$ref", false);
        c13637l.smaato("$id", false);
        loadAd = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C0194l.yandex, C16003l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C17462l c17462l = (C17462l) obj;
        C13637l c13637l = loadAd;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(c13637l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(c13637l, 0, c17462l.yandex);
        abstractC4072l.applovin(c13637l, 1, C16003l.yandex, c17462l.loadAd);
        interfaceC0039lCrashlytics.yandex(c13637l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C13637l c13637l = loadAd;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(c13637l);
        boolean z = true;
        int i = 0;
        String strRemoteconfig = null;
        Object objAds = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(c13637l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(c13637l, 0);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                objAds = interfaceC14988lCrashlytics.ads(c13637l, 1, C16003l.yandex, objAds);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(c13637l);
        return new C17462l(i, strRemoteconfig, (C17918l) objAds);
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
