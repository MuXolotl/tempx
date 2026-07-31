package defpackage;

/* JADX INFO: renamed from: lؖٚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4223l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C4223l yandex;

    static {
        C4223l c4223l = new C4223l();
        yandex = c4223l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder.VkxSavedState.LastTrackInformation", c4223l, 5);
        c13637l.smaato("id", false);
        c13637l.smaato("title", false);
        c13637l.smaato("artist", false);
        c13637l.smaato("progressCurrent", false);
        c13637l.smaato("progressTotal", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        C2010l c2010l = C2010l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, c0194l, c2010l, c2010l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C11168l c11168l = (C11168l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, c11168l.yandex);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c11168l.loadAd);
        abstractC4072l.appmetrica(interfaceC18035l, 2, c11168l.crashlytics);
        abstractC4072l.premium(interfaceC18035l, 3, c11168l.amazon);
        abstractC4072l.premium(interfaceC18035l, 4, c11168l.purchase);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        long jInmobi = 0;
        long jInmobi2 = 0;
        boolean z = true;
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
                jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 3);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                jInmobi2 = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 4);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C11168l(i, strRemoteconfig, strRemoteconfig2, strRemoteconfig3, jInmobi, jInmobi2);
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
