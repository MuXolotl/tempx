package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؗۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5164l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C5164l yandex;

    static {
        C5164l c5164l = new C5164l();
        yandex = c5164l;
        C13637l c13637l = new C13637l("com.arkivanov.decompose.router.children.SavedState", c5164l, 2);
        c13637l.smaato("navState", false);
        c13637l.smaato("childState", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C6000l.yandex, C8091l.crashlytics[1]};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C8091l c8091l = (C8091l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC16588l[] interfaceC16588lArr = C8091l.crashlytics;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, C6000l.yandex, c8091l.yandex);
        abstractC4072l.applovin(interfaceC18035l, 1, interfaceC16588lArr[1], c8091l.loadAd);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC16588l[] interfaceC16588lArr = C8091l.crashlytics;
        boolean z = true;
        int i = 0;
        C7695l c7695l = null;
        List list = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                c7695l = (C7695l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C6000l.yandex, c7695l);
                i |= 1;
            } else {
                if (iAdmob != 1) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, interfaceC16588lArr[1], list);
                i |= 2;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C8091l(i, c7695l, list);
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
