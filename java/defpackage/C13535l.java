package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٝٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13535l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C13535l yandex;

    static {
        C13535l c13535l = new C13535l();
        yandex = c13535l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.auth.AuthProcessAuthCodeResponseDto", c13535l, 4);
        c13637l.smaato("status", true);
        c13637l.smaato("auth_info", true);
        c13637l.smaato("errors", true);
        c13637l.smaato("profile", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C1313l.yandex, AbstractC7303l.crashlytics(C1997l.yandex), C14580l.purchase[2].getValue(), AbstractC7303l.crashlytics(C5804l.yandex)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C14580l c14580l = (C14580l) obj;
        C12219l c12219l = c14580l.amazon;
        List list = c14580l.crashlytics;
        C9806l c9806l = c14580l.loadAd;
        int i = c14580l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C14580l.purchase;
        if (interfaceC0039lCrashlytics.ads() || i != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(0, i, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || c9806l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C1997l.yandex, c9806l);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, C2580l.f5619l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || c12219l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, C5804l.yandex, c12219l);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C14580l.purchase;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        C9806l c9806l = null;
        List list = null;
        C12219l c12219l = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                c9806l = (C9806l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C1997l.yandex, c9806l);
                i |= 2;
            } else if (iAdmob == 2) {
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iAdmob != 3) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                c12219l = (C12219l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C5804l.yandex, c12219l);
                i |= 8;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C14580l(i, iSubscription, c9806l, list, c12219l);
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
