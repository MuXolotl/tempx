package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lٕۣؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15367l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C15367l yandex;

    static {
        C15367l c15367l = new C15367l();
        yandex = c15367l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist", c15367l, 5);
        c13637l.smaato("id", false);
        c13637l.smaato("domain", true);
        c13637l.smaato("name", false);
        c13637l.smaato("photo", true);
        c13637l.smaato("is_cached", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = MainArtist.billing;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), c0194l, AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[3].getValue()), C2796l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        MainArtist mainArtist = (MainArtist) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = MainArtist.billing;
        C0194l c0194l = C0194l.yandex;
        String str = mainArtist.yandex;
        boolean z = mainArtist.purchase;
        List list = mainArtist.amazon;
        String str2 = mainArtist.loadAd;
        interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, c0194l, str);
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, c0194l, str2);
        }
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 2, mainArtist.crashlytics);
        if (interfaceC0039lCrashlytics.ads() || list != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 4, z);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = MainArtist.billing;
        boolean z = true;
        int i = 0;
        boolean zIsVip = false;
        String str = null;
        String str2 = null;
        String strRemoteconfig = null;
        List list = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C0194l.yandex, str);
                i |= 1;
            } else if (iAdmob == 1) {
                str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str2);
                i |= 2;
            } else if (iAdmob == 2) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            } else if (iAdmob == 3) {
                list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, (InterfaceC16588l) interfaceC1220lArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iAdmob != 4) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 4);
                i |= 16;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new MainArtist(i, str, str2, strRemoteconfig, list, zIsVip);
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
