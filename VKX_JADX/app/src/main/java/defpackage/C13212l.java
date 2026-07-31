package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚْۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13212l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13212l yandex;

    static {
        C13212l c13212l = new C13212l();
        yandex = c13212l;
        C13637l c13637l = new C13637l("io.ktor.util.date.GMTDate", c13212l, 9);
        c13637l.smaato("seconds", false);
        c13637l.smaato("minutes", false);
        c13637l.smaato("hours", false);
        c13637l.smaato("dayOfWeek", false);
        c13637l.smaato("dayOfMonth", false);
        c13637l.smaato("dayOfYear", false);
        c13637l.smaato("month", false);
        c13637l.smaato("year", false);
        c13637l.smaato("timestamp", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C8485l.f17532l;
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c1313l, c1313l, c1313l, interfaceC1220lArr[3].getValue(), c1313l, c1313l, interfaceC1220lArr[6].getValue(), c1313l, C2010l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C8485l c8485l = (C8485l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C8485l.f17532l;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, c8485l.f17537l, interfaceC18035l);
        abstractC4072l.signatures(1, c8485l.f17536l, interfaceC18035l);
        abstractC4072l.signatures(2, c8485l.f17533l, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), c8485l.f17539l);
        abstractC4072l.signatures(4, c8485l.f17538l, interfaceC18035l);
        abstractC4072l.signatures(5, c8485l.f17541l, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), c8485l.f17534l);
        abstractC4072l.signatures(7, c8485l.f17535l, interfaceC18035l);
        abstractC4072l.premium(interfaceC18035l, 8, c8485l.f17540l);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C8485l.f17532l;
        Object obj = null;
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        int iSubscription3 = 0;
        int iSubscription4 = 0;
        int iSubscription5 = 0;
        int iSubscription6 = 0;
        EnumC14872l enumC14872l = null;
        long jInmobi = 0;
        boolean z = true;
        EnumC7557l enumC7557l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    iSubscription3 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    enumC14872l = (EnumC14872l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), enumC14872l);
                    i |= 8;
                    break;
                case 4:
                    iSubscription4 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    iSubscription5 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 5);
                    i |= 32;
                    break;
                case 6:
                    enumC7557l = (EnumC7557l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 6, (InterfaceC16588l) interfaceC1220lArr[6].getValue(), enumC7557l);
                    i |= 64;
                    break;
                case 7:
                    iSubscription6 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 7);
                    i |= 128;
                    continue;
                case 8:
                    jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    continue;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C8485l(i, iSubscription, iSubscription2, iSubscription3, enumC14872l, iSubscription4, iSubscription5, enumC7557l, iSubscription6, jInmobi);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC13593l
    public final /* bridge */ InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
