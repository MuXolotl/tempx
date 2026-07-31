package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍُۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9919l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C9919l yandex;

    static {
        C9919l c9919l = new C9919l();
        yandex = c9919l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.internal.account.LegacyVkAccount", c9919l, 9);
        c13637l.smaato("id", true);
        c13637l.smaato("accessToken", true);
        c13637l.smaato("accessTokenExpiresAt", true);
        c13637l.smaato("trustedHash", true);
        c13637l.smaato("exchangeToken", true);
        c13637l.smaato("metadataExpiresAt", true);
        c13637l.smaato("username", true);
        c13637l.smaato("avatar", true);
        c13637l.smaato("canUseModernVkApi", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C2010l c2010l = C2010l.yandex;
        C0194l c0194l = C0194l.yandex;
        return new InterfaceC16588l[]{c2010l, c0194l, c2010l, c0194l, c0194l, c2010l, c0194l, c0194l, C2796l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C17526l c17526l = (C17526l) obj;
        boolean z = c17526l.subs;
        String str = c17526l.admob;
        String str2 = c17526l.mopub;
        long j = c17526l.billing;
        String str3 = c17526l.purchase;
        String str4 = c17526l.amazon;
        long j2 = c17526l.crashlytics;
        String str5 = c17526l.loadAd;
        long j3 = c17526l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        if (interfaceC0039lCrashlytics.ads() || j3 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).premium(interfaceC18035l, 0, j3);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str5, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 1, str5);
        }
        if (interfaceC0039lCrashlytics.ads() || j2 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).premium(interfaceC18035l, 2, j2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str4, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 3, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str3, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 4, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || j != r15) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).premium(interfaceC18035l, 5, j);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str2, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 6, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 7, str);
        }
        if (interfaceC0039lCrashlytics.ads() || z) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).ad(interfaceC18035l, 8, z);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        boolean zIsVip = false;
        long jInmobi = 0;
        long jInmobi2 = 0;
        long jInmobi3 = 0;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        String strRemoteconfig4 = null;
        String strRemoteconfig5 = null;
        boolean z = true;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    jInmobi2 = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 2);
                    i |= 4;
                    break;
                case 3:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i |= 8;
                    break;
                case 4:
                    strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 4);
                    i |= 16;
                    break;
                case 5:
                    jInmobi3 = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 5);
                    i |= 32;
                    break;
                case 6:
                    strRemoteconfig4 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 6);
                    i |= 64;
                    break;
                case 7:
                    strRemoteconfig5 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 7);
                    i |= 128;
                    break;
                case 8:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C17526l(i, jInmobi, strRemoteconfig, jInmobi2, strRemoteconfig2, strRemoteconfig3, jInmobi3, strRemoteconfig4, strRemoteconfig5, zIsVip);
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
