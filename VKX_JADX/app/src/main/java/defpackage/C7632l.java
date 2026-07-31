package defpackage;

/* JADX INFO: renamed from: lؚۤۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7632l implements InterfaceC13593l {
    public static final /* synthetic */ C13637l loadAd;
    public static final C7632l yandex;

    static {
        C7632l c7632l = new C7632l();
        yandex = c7632l;
        C13637l c13637l = new C13637l("org.mongodb.kbson.serialization.BsonRegularExpressionSerializer.BsonValueData", c7632l, 2);
        c13637l.smaato("pattern", false);
        c13637l.smaato("options", false);
        loadAd = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C13740l c13740l = (C13740l) obj;
        C13637l c13637l = loadAd;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(c13637l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(c13637l, 0, c13740l.yandex);
        abstractC4072l.appmetrica(c13637l, 1, c13740l.loadAd);
        interfaceC0039lCrashlytics.yandex(c13637l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C13637l c13637l = loadAd;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(c13637l);
        boolean z = true;
        int i = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
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
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(c13637l, 1);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(c13637l);
        return new C13740l(strRemoteconfig, i, strRemoteconfig2);
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
