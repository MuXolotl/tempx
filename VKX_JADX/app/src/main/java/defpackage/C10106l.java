package defpackage;

/* JADX INFO: renamed from: lَؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10106l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10106l yandex;

    static {
        C10106l c10106l = new C10106l();
        yandex = c10106l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.RequestTokenResponse.ClientError", c10106l, 3);
        c13637l.smaato("error", true);
        c13637l.smaato("error_description", true);
        c13637l.smaato("error_type", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, c0194l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C12419l c12419l = (C12419l) obj;
        String str = c12419l.crashlytics;
        String str2 = c12419l.loadAd;
        String str3 = c12419l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str3, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 0, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str2, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 1, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 2, str);
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
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C12419l(i, strRemoteconfig, strRemoteconfig2, strRemoteconfig3);
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
