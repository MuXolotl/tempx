package defpackage;

/* JADX INFO: renamed from: lًؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1284l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C1284l yandex;

    static {
        C1284l c1284l = new C1284l();
        yandex = c1284l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetStreamMixSettingsResponseDto", c1284l, 1);
        c13637l.smaato("settings", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C2280l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 0, C2280l.yandex, ((C3757l) obj).yandex);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        C15407l c15407l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else {
                if (iAdmob != 0) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                c15407l = (C15407l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C2280l.yandex, c15407l);
                i = 1;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C3757l(i, c15407l);
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
