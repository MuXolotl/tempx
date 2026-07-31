package defpackage;

/* JADX INFO: renamed from: lُّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10992l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10992l yandex;

    static {
        C10992l c10992l = new C10992l();
        yandex = c10992l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.delegates.SaveAudioPlaylistCoverResponse", c10992l, 2);
        c13637l.smaato("photo", false);
        c13637l.smaato("hash", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C14283l.yandex, C0194l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C7660l c7660l = (C7660l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, C14283l.yandex, c7660l.yandex);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c7660l.loadAd);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        C18010l c18010l = null;
        String strRemoteconfig = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                c18010l = (C18010l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C14283l.yandex, c18010l);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C7660l(i, c18010l, strRemoteconfig);
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
