package defpackage;

/* JADX INFO: renamed from: lُؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10886l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10886l yandex;

    static {
        C10886l c10886l = new C10886l();
        yandex = c10886l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistActionDto", c10886l, 2);
        c13637l.smaato("type", false);
        c13637l.smaato("location", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C14488l.crashlytics;
        return new InterfaceC16588l[]{interfaceC1220lArr[0].getValue(), interfaceC1220lArr[1].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C14488l c14488l = (C14488l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C14488l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), c14488l.yandex);
        abstractC4072l.applovin(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), c14488l.loadAd);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C14488l.crashlytics;
        boolean z = true;
        int i = 0;
        EnumC2709l enumC2709l = null;
        EnumC11773l enumC11773l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                enumC2709l = (EnumC2709l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC2709l);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                enumC11773l = (EnumC11773l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, (InterfaceC16588l) interfaceC1220lArr[1].getValue(), enumC11773l);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C14488l(i, enumC2709l, enumC11773l);
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
