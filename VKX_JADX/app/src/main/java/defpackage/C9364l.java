package defpackage;

/* JADX INFO: renamed from: lٍؘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9364l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C9364l yandex;

    static {
        C9364l c9364l = new C9364l();
        yandex = c9364l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder.VkxSavedState", c9364l, 2);
        c13637l.smaato("source", false);
        c13637l.smaato("lastTrack", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C0767l.crashlytics[0].getValue(), C4223l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C0767l c0767l = (C0767l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, (InterfaceC16588l) C0767l.crashlytics[0].getValue(), c0767l.yandex);
        abstractC4072l.applovin(interfaceC18035l, 1, C4223l.yandex, c0767l.loadAd);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C0767l.crashlytics;
        boolean z = true;
        int i = 0;
        InterfaceC3136l interfaceC3136l = null;
        C11168l c11168l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                interfaceC3136l = (InterfaceC3136l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), interfaceC3136l);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                c11168l = (C11168l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, C4223l.yandex, c11168l);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C0767l(i, interfaceC3136l, c11168l);
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
