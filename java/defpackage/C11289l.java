package defpackage;

/* JADX INFO: renamed from: lُۙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11289l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C11289l yandex;

    static {
        C11289l c11289l = new C11289l();
        yandex = c11289l;
        C13637l c13637l = new C13637l("fail_storage", c11289l, 3);
        c13637l.smaato("total", false);
        c13637l.smaato("free", false);
        c13637l.smaato("required", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C2010l c2010l = C2010l.yandex;
        return new InterfaceC16588l[]{c2010l, c2010l, c2010l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C0679l c0679l = (C0679l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.premium(interfaceC18035l, 0, c0679l.yandex);
        abstractC4072l.premium(interfaceC18035l, 1, c0679l.loadAd);
        abstractC4072l.premium(interfaceC18035l, 2, c0679l.crashlytics);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        long jInmobi = 0;
        long jInmobi2 = 0;
        long jInmobi3 = 0;
        boolean z = true;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                jInmobi2 = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                jInmobi3 = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C0679l(i, jInmobi, jInmobi2, jInmobi3);
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
