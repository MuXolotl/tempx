package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18592l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C18592l yandex;

    static {
        C18592l c18592l = new C18592l();
        yandex = c18592l;
        C13637l c13637l = new C13637l("vps_track_ids", c18592l, 3);
        c13637l.smaato("ids", false);
        c13637l.smaato("displayName", true);
        c13637l.smaato("id", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{C14004l.amazon[0].getValue(), c0194l, c0194l};
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C14004l c14004l = (C14004l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) C14004l.amazon[0].getValue();
        List list = c14004l.yandex;
        String str = c14004l.crashlytics;
        String str2 = c14004l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.applovin(interfaceC18035l, 0, interfaceC16588l, list);
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(str2, "")) {
            abstractC4072l.appmetrica(interfaceC18035l, 1, str2);
        }
        if (abstractC4072l.ads()) {
            abstractC4072l.appmetrica(interfaceC18035l, 2, str);
        } else {
            if (!AbstractC8576l.yandex(str, "vk_" + list.hashCode())) {
                abstractC4072l.appmetrica(interfaceC18035l, 2, str);
            }
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C14004l.amazon;
        boolean z = true;
        int i = 0;
        List list = null;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            if (iAdmob == -1) {
                z = false;
            } else if (iAdmob == 0) {
                list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, (InterfaceC16588l) interfaceC1220lArr[0].getValue(), list);
                i |= 1;
            } else if (iAdmob == 1) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                i |= 2;
            } else {
                if (iAdmob != 2) {
                    C8936l.mopub(iAdmob);
                    return null;
                }
                strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 2);
                i |= 4;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C14004l(i, strRemoteconfig, strRemoteconfig2, list);
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
