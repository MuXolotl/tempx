package defpackage;

/* JADX INFO: renamed from: lٕٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15677l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C15677l yandex;

    static {
        C15677l c15677l = new C15677l();
        yandex = c15677l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioAlbumDto", c15677l, 5);
        c13637l.smaato("id", false);
        c13637l.smaato("title", false);
        c13637l.smaato("owner_id", false);
        c13637l.smaato("access_key", false);
        c13637l.smaato("thumb", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(C13631l.yandex);
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{C1313l.yandex, c0194l, C11363l.yandex, c0194l, interfaceC16588lCrashlytics};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C12787l c12787l = (C12787l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        int i = c12787l.yandex;
        C8206l c8206l = c12787l.purchase;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c12787l.loadAd);
        abstractC4072l.applovin(interfaceC18035l, 2, C11363l.yandex, new C10877l(c12787l.crashlytics));
        abstractC4072l.appmetrica(interfaceC18035l, 3, c12787l.amazon);
        if (abstractC4072l.ads() || c8206l != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C13631l.yandex, c8206l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        String strRemoteconfig = null;
        C10877l c10877l = null;
        String strRemoteconfig2 = null;
        C8206l c8206l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            } else if (iAdmob == 2) {
                c10877l = (C10877l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, C11363l.yandex, c10877l);
                i |= 4;
            } else if (iAdmob == 3) {
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                c8206l = (C8206l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C13631l.yandex, c8206l);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C12787l(i, iSubscription, strRemoteconfig, c10877l, strRemoteconfig2, c8206l);
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
