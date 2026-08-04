package defpackage;

/* JADX INFO: renamed from: lٍِۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11736l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C11736l yandex;

    static {
        C11736l c11736l = new C11736l();
        yandex = c11736l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkx.decompose.components.pick_audios.VkxPickAudiosSheetComponent.Config.Playlist", c11736l, 3);
        c13637l.smaato("id", false);
        c13637l.smaato("owner", false);
        c13637l.smaato("name", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C1313l.yandex, C2010l.yandex, C0194l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C7671l c7671l = (C7671l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, c7671l.yandex, interfaceC18035l);
        abstractC4072l.premium(interfaceC18035l, 1, c7671l.loadAd);
        abstractC4072l.appmetrica(interfaceC18035l, 2, c7671l.crashlytics);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        int iSubscription = 0;
        long jInmobi = 0;
        String strRemoteconfig = null;
        boolean z = true;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C7671l(i, iSubscription, jInmobi, strRemoteconfig);
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
