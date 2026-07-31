package defpackage;

/* JADX INFO: renamed from: lٍ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9854l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C9854l yandex;

    static {
        C9854l c9854l = new C9854l();
        yandex = c9854l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistMetaDto", c9854l, 1);
        c13637l.smaato("view", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics((InterfaceC16588l) C0296l.loadAd[0].getValue())};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        EnumC17988l enumC17988l = ((C0296l) obj).yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C0296l.loadAd;
        if (interfaceC0039lCrashlytics.ads() || enumC17988l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC17988l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C0296l.loadAd;
        boolean z = true;
        int i = 0;
        EnumC17988l enumC17988l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else {
                if (iAdmob != 0) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                enumC17988l = (EnumC17988l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), enumC17988l);
                i = 1;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C0296l(i, enumC17988l);
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
