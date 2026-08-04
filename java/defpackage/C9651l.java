package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍٚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9651l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C9651l yandex;

    static {
        C9651l c9651l = new C9651l();
        yandex = c9651l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAddResponseDto", c9651l, 3);
        c13637l.smaato("items_count", true);
        c13637l.smaato("errors_count", true);
        c13637l.smaato("items", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C18117l.amazon;
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{c1313l, c1313l, interfaceC1220lArr[2].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C18117l c18117l = (C18117l) obj;
        List list = c18117l.crashlytics;
        int i = c18117l.loadAd;
        int i2 = c18117l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C18117l.amazon;
        if (interfaceC0039lCrashlytics.ads() || i2 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(0, i2, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || i != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(1, i, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, C2580l.f5619l)) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C18117l.amazon;
        boolean z = true;
        int i = 0;
        int iSubscription = 0;
        int iSubscription2 = 0;
        List list = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                i |= 1;
            } else if (iAdmob == 1) {
                iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), list);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C18117l(i, iSubscription, iSubscription2, list);
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
