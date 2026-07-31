package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؒٝؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1199l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C1199l yandex;

    static {
        C1199l c1199l = new C1199l();
        yandex = c1199l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetRelatedArtistsResponseDto", c1199l, 1);
        c13637l.smaato("artists", false);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{C1273l.loadAd[0].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 0, (InterfaceC16588l) C1273l.loadAd[0].getValue(), ((C1273l) obj).yandex);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C1273l.loadAd;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else {
                if (iAdmob != 0) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list);
                i = 1;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C1273l(i, list);
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
