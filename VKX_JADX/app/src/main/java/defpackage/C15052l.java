package defpackage;

/* JADX INFO: renamed from: lٔٞٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15052l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C15052l yandex;

    static {
        C15052l c15052l = new C15052l();
        yandex = c15052l;
        C13637l c13637l = new C13637l("com.google.firebase.sessions.Time", c15052l, 3);
        c13637l.smaato("ms", false);
        c13637l.smaato("us", true);
        c13637l.smaato("seconds", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C2010l c2010l = C2010l.yandex;
        return new InterfaceC16588l[]{c2010l, c2010l, c2010l};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C14801l c14801l = (C14801l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        long j = c14801l.yandex;
        long j2 = c14801l.crashlytics;
        long j3 = c14801l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.premium(interfaceC18035l, 0, j);
        if (abstractC4072l.ads() || j3 != j * 1000) {
            abstractC4072l.premium(interfaceC18035l, 1, j3);
        }
        if (abstractC4072l.ads() || j2 != j / 1000) {
            abstractC4072l.premium(interfaceC18035l, 2, j2);
        }
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
        return new C14801l(i, jInmobi, jInmobi2, jInmobi3);
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
