package defpackage;

/* JADX INFO: renamed from: lّٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12377l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C12377l yandex;

    static {
        C12377l c12377l = new C12377l();
        yandex = c12377l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25Title", c12377l, 5);
        c13637l.smaato("title", true);
        c13637l.smaato("value", true);
        c13637l.smaato("caption", true);
        c13637l.smaato("resource", true);
        c13637l.smaato("content", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(C8368l.yandex);
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, c0194l, c0194l, interfaceC16588lCrashlytics};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C18023l c18023l = (C18023l) obj;
        C0415l c0415l = c18023l.purchase;
        String str = c18023l.amazon;
        String str2 = c18023l.crashlytics;
        String str3 = c18023l.loadAd;
        String str4 = c18023l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str4, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 0, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str3, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 1, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str2, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 2, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 3, str);
        }
        if (interfaceC0039lCrashlytics.ads() || c0415l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C8368l.yandex, c0415l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        String strRemoteconfig4 = null;
        C0415l c0415l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            } else if (iAdmob == 2) {
                strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                strRemoteconfig4 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                c0415l = (C0415l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C8368l.yandex, c0415l);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C18023l(i, strRemoteconfig, strRemoteconfig2, strRemoteconfig3, strRemoteconfig4, c0415l);
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
