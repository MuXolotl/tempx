package defpackage;

/* JADX INFO: renamed from: lٍۚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9803l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C9803l yandex;

    static {
        C9803l c9803l = new C9803l();
        yandex = c9803l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.base.BaseImageDto", c9803l, 5);
        c13637l.smaato("url", false);
        c13637l.smaato("width", false);
        c13637l.smaato("height", false);
        c13637l.smaato("id", true);
        c13637l.smaato("theme", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C3779l.billing;
        C0194l c0194l = C0194l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[4].getValue());
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c0194l, c1313l, c1313l, interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C3779l c3779l = (C3779l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C3779l.billing;
        String str = c3779l.yandex;
        EnumC10566l enumC10566l = c3779l.purchase;
        String str2 = c3779l.amazon;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        abstractC4072l.signatures(1, c3779l.loadAd, interfaceC18035l);
        abstractC4072l.signatures(2, c3779l.crashlytics, interfaceC18035l);
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || enumC10566l != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), enumC10566l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C3779l.billing;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        String strRemoteconfig = null;
        String str = null;
        EnumC10566l enumC10566l = null;
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
            } else if (iAdmob == 2) {
                iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                enumC10566l = (EnumC10566l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), enumC10566l);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C3779l(i, strRemoteconfig, iSubscription, iSubscription2, str, enumC10566l);
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
