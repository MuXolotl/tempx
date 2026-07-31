package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lًٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8018l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C8018l yandex;

    static {
        C8018l c8018l = new C8018l();
        yandex = c8018l;
        C13637l c13637l = new C13637l("com.google.firebase.sessions.SessionData", c8018l, 3);
        c13637l.smaato("sessionDetails", false);
        c13637l.smaato("backgroundTime", true);
        c13637l.smaato("processDataMap", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C0083l.yandex, AbstractC7303l.crashlytics(C15052l.yandex), AbstractC7303l.crashlytics(C6539l.amazon[2])};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C6539l c6539l = (C6539l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC16588l[] interfaceC16588lArr = C6539l.amazon;
        C0083l c0083l = C0083l.yandex;
        C18067l c18067l = c6539l.yandex;
        Map map = c6539l.crashlytics;
        C14801l c14801l = c6539l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, c0083l, c18067l);
        if (abstractC4072l.ads() || c14801l != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, C15052l.yandex, c14801l);
        }
        if (abstractC4072l.ads() || map != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, interfaceC16588lArr[2], map);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC16588l[] interfaceC16588lArr = C6539l.amazon;
        boolean z = true;
        int i = 0;
        C18067l c18067l = null;
        C14801l c14801l = null;
        Map map = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                c18067l = (C18067l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, C0083l.yandex, c18067l);
                i |= 1;
            } else if (iAdmob == 1) {
                c14801l = (C14801l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C15052l.yandex, c14801l);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                map = (Map) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, interfaceC16588lArr[2], map);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C6539l(i, c18067l, c14801l, map);
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
