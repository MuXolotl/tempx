package defpackage;

/* JADX INFO: renamed from: lؗۖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5082l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C5082l yandex;

    static {
        C5082l c5082l = new C5082l();
        yandex = c5082l;
        C13637l c13637l = new C13637l("com.google.firebase.sessions.settings.SessionConfigs", c5082l, 5);
        c13637l.smaato("sessionsEnabled", false);
        c13637l.smaato("sessionSamplingRate", false);
        c13637l.smaato("sessionTimeoutSeconds", false);
        c13637l.smaato("cacheDurationSeconds", false);
        c13637l.smaato("cacheUpdatedTimeSeconds", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(C2796l.yandex);
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(C7872l.yandex);
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(C2010l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C15067l c15067l = (C15067l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C2796l.yandex, c15067l.yandex);
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C7872l.yandex, c15067l.loadAd);
        C1313l c1313l = C1313l.yandex;
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, c1313l, c15067l.crashlytics);
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, c1313l, c15067l.amazon);
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C2010l.yandex, c15067l.purchase);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C2796l.yandex, bool);
                i |= 1;
            } else if (iAdmob == 1) {
                d = (Double) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C7872l.yandex, d);
                i |= 2;
            } else if (iAdmob == 2) {
                num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C1313l.yandex, num);
                i |= 4;
            } else if (iAdmob == 3) {
                num2 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C1313l.yandex, num2);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                l = (Long) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C2010l.yandex, l);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C15067l(i, bool, d, num, num2, l);
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
