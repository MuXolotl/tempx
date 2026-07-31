package defpackage;

/* JADX INFO: renamed from: lّٝۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12738l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C12738l yandex;

    static {
        C12738l c12738l = new C12738l();
        yandex = c12738l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistOriginalFollowedDto", c12738l, 3);
        c13637l.smaato("playlist_id", false);
        c13637l.smaato("owner_id", false);
        c13637l.smaato("access_key", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C1313l.yandex, C11363l.yandex, AbstractC7303l.crashlytics(C0194l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C2839l c2839l = (C2839l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        int i = c2839l.yandex;
        String str = c2839l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 1, C11363l.yandex, new C10877l(c2839l.loadAd));
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0194l.yandex, str);
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
        C10877l c10877l = null;
        String str = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                c10877l = (C10877l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, C11363l.yandex, c10877l);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C2839l(i, iSubscription, c10877l, str);
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
