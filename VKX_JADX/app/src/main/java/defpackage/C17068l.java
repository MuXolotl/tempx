package defpackage;

/* JADX INFO: renamed from: lِْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17068l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C17068l yandex;

    static {
        C17068l c17068l = new C17068l();
        yandex = c17068l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAddResponseNewIdDto", c17068l, 3);
        c13637l.smaato("audio_raw_id", true);
        c13637l.smaato("new_audio_id", true);
        c13637l.smaato("new_owner_id", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C0194l.yandex, C1313l.yandex, C2010l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C14239l c14239l = (C14239l) obj;
        long j = c14239l.crashlytics;
        int i = c14239l.loadAd;
        String str = c14239l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 0, str);
        }
        if (interfaceC0039lCrashlytics.ads() || i != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(1, i, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || j != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).premium(interfaceC18035l, 2, j);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        int iSubscription = 0;
        String strRemoteconfig = null;
        long jInmobi = 0;
        boolean z = true;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C14239l(i, iSubscription, jInmobi, strRemoteconfig);
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
