package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؙٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6905l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C6905l yandex;

    static {
        C6905l c6905l = new C6905l();
        yandex = c6905l;
        C13637l c13637l = new C13637l("com.arkivanov.essenty.statekeeper.DefaultStateKeeperDispatcher.SavedState", c6905l, 1);
        c13637l.smaato("map", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C6343l.loadAd[0]};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 0, C6343l.loadAd[0], ((C6343l) obj).yandex);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC16588l[] interfaceC16588lArr = C6343l.loadAd;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else {
                if (iAdmob != 0) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                map = (Map) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, interfaceC16588lArr[0], map);
                i = 1;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C6343l(i, map);
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
