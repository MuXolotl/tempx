package defpackage;

import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCoverSize;

/* JADX INFO: renamed from: lٖؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16107l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C16107l yandex;

    static {
        C16107l c16107l = new C16107l();
        yandex = c16107l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkapi2.objects.podcasts.PodcastCoverSize", c16107l, 5);
        c13637l.smaato("height", true);
        c13637l.smaato("type", true);
        c13637l.smaato("src", true);
        c13637l.smaato("url", true);
        c13637l.smaato("width", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C1313l c1313l = C1313l.yandex;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c1313l, c0194l, c0194l, c0194l, c1313l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        PodcastCoverSize podcastCoverSize = (PodcastCoverSize) obj;
        int i = podcastCoverSize.purchase;
        String str = podcastCoverSize.amazon;
        String str2 = podcastCoverSize.crashlytics;
        String str3 = podcastCoverSize.loadAd;
        int i2 = podcastCoverSize.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || i2 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(0, i2, interfaceC18035l);
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
        if (interfaceC0039lCrashlytics.ads() || i != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(4, i, interfaceC18035l);
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
        int iSubscription2 = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
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
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 4);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new PodcastCoverSize(i, iSubscription, strRemoteconfig, strRemoteconfig2, strRemoteconfig3, iSubscription2);
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
