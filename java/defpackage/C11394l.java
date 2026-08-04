package defpackage;

/* JADX INFO: renamed from: lُؙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11394l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C11394l yandex;

    static {
        C11394l c11394l = new C11394l();
        yandex = c11394l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.spark.objects.updates.SparkAppUpdate", c11394l, 7);
        c13637l.smaato("version_code", false);
        c13637l.smaato("version_name", false);
        c13637l.smaato("is_beta", true);
        c13637l.smaato("changelog", false);
        c13637l.smaato("download_source", false);
        c13637l.smaato("release_date", false);
        c13637l.smaato("is_forced", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C16511l.admob;
        C0194l c0194l = C0194l.yandex;
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{C1313l.yandex, c0194l, c2796l, c0194l, interfaceC1220lArr[4].getValue(), C8458l.yandex, c2796l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C16511l c16511l = (C16511l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C16511l.admob;
        int i = c16511l.yandex;
        boolean z = c16511l.mopub;
        boolean z2 = c16511l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c16511l.loadAd);
        if (abstractC4072l.ads() || z2) {
            abstractC4072l.ad(interfaceC18035l, 2, z2);
        }
        abstractC4072l.appmetrica(interfaceC18035l, 3, c16511l.amazon);
        abstractC4072l.applovin(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), c16511l.purchase);
        abstractC4072l.applovin(interfaceC18035l, 5, C8458l.yandex, c16511l.billing);
        if (abstractC4072l.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 6, z);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C16511l.admob;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        boolean zIsVip = false;
        boolean zIsVip2 = false;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        InterfaceC2779l interfaceC2779l = null;
        C2106l c2106l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    interfaceC2779l = (InterfaceC2779l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), interfaceC2779l);
                    i |= 16;
                    break;
                case 5:
                    c2106l = (C2106l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 5, C8458l.yandex, c2106l);
                    i |= 32;
                    break;
                case 6:
                    zIsVip2 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 6);
                    i |= 64;
                    continue;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C16511l(i, iSubscription, strRemoteconfig, zIsVip, strRemoteconfig2, interfaceC2779l, c2106l, zIsVip2);
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
