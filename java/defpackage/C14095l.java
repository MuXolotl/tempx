package defpackage;

/* JADX INFO: renamed from: lّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14095l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C14095l yandex;

    static {
        C14095l c14095l = new C14095l();
        yandex = c14095l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkxtv.components.playlist.TvPlaylistComponent.PlaylistScreenArgs", c14095l, 6);
        c13637l.smaato("id", false);
        c13637l.smaato("ownerId", false);
        c13637l.smaato("accessKey", true);
        c13637l.smaato("artworkUrl", true);
        c13637l.smaato("title", true);
        c13637l.smaato("colorInt", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c0194l);
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c1313l, C2010l.yandex, interfaceC16588lCrashlytics, c0194l, c0194l, c1313l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C0523l c0523l = (C0523l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        int i = c0523l.yandex;
        int i2 = c0523l.billing;
        String str = c0523l.purchase;
        String str2 = c0523l.amazon;
        String str3 = c0523l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.premium(interfaceC18035l, 1, c0523l.loadAd);
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str2, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 3, str2);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 4, str);
        }
        if (abstractC4072l.ads() || i2 != 0) {
            abstractC4072l.signatures(5, i2, interfaceC18035l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        long jInmobi = 0;
        String str = null;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        boolean z = true;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 5);
                    i |= 32;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C0523l(i, iSubscription, jInmobi, str, strRemoteconfig, strRemoteconfig2, iSubscription2);
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
