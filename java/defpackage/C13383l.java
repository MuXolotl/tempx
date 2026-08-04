package defpackage;

/* JADX INFO: renamed from: lْٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13383l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13383l yandex;

    static {
        C13383l c13383l = new C13383l();
        yandex = c13383l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthBirthdayDto", c13383l, 3);
        c13637l.smaato("year", true);
        c13637l.smaato("month", true);
        c13637l.smaato("day", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C11555l c11555l = (C11555l) obj;
        Integer num = c11555l.crashlytics;
        Integer num2 = c11555l.loadAd;
        Integer num3 = c11555l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || num3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C1313l.yandex, num3);
        }
        if (interfaceC0039lCrashlytics.ads() || num2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C1313l.yandex, num2);
        }
        if (interfaceC0039lCrashlytics.ads() || num != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C1313l.yandex, num);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C1313l.yandex, num);
                i |= 1;
            } else if (iAdmob == 1) {
                num2 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C1313l.yandex, num2);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                num3 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C1313l.yandex, num3);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C11555l(i, num, num2, num3);
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
