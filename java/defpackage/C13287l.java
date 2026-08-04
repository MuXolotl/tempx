package defpackage;

/* JADX INFO: renamed from: lُُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13287l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13287l yandex;

    static {
        C13287l c13287l = new C13287l();
        yandex = c13287l;
        C13637l c13637l = new C13637l("vk_audiobook", c13287l, 3);
        c13637l.smaato("audioBook", false);
        c13637l.smaato("id", true);
        c13637l.smaato("displayName", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{C15861l.yandex, c0194l, c0194l};
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C1407l c1407l = (C1407l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        C15861l c15861l = C15861l.yandex;
        C2391l c2391l = c1407l.yandex;
        String str = c1407l.crashlytics;
        String str2 = c1407l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, c15861l, c2391l);
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str2, String.valueOf(c2391l.firebase))) {
            abstractC4072l.appmetrica(interfaceC18035l, 1, str2);
        }
        if (abstractC4072l.ads()) {
            abstractC4072l.appmetrica(interfaceC18035l, 2, str);
        } else {
            String str3 = c2391l.tapsense;
            if (str3 == null) {
                str3 = "";
            }
            if (!AbstractC8576l.yandex(str, str3)) {
                abstractC4072l.appmetrica(interfaceC18035l, 2, str);
            }
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        C2391l c2391l = null;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                c2391l = (C2391l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C15861l.yandex, c2391l);
                i |= 1;
            } else if (iAdmob == 1) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C1407l(i, c2391l, strRemoteconfig, strRemoteconfig2);
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
