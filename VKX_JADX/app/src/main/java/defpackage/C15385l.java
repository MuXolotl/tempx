package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٕؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15385l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C15385l yandex;

    static {
        C15385l c15385l = new C15385l();
        yandex = c15385l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.internal.account.VkAccount", c15385l, 11);
        c13637l.smaato("id", false);
        c13637l.smaato("access_token", false);
        c13637l.smaato("access_token_expire", false);
        c13637l.smaato("trusted_hash", false);
        c13637l.smaato("exchange_token", false);
        c13637l.smaato("metadata_expire", false);
        c13637l.smaato("username", false);
        c13637l.smaato("first_name", false);
        c13637l.smaato("last_name", false);
        c13637l.smaato("avatar", false);
        c13637l.smaato("uses_latest_api", false);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        C0194l c0194l = C0194l.yandex;
        C8458l c8458l = C8458l.yandex;
        return new InterfaceC16588l[]{C2010l.yandex, c0194l, c8458l, c0194l, c0194l, c8458l, c0194l, c0194l, c0194l, c0194l, C2796l.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C4645l c4645l = (C4645l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.premium(interfaceC18035l, 0, c4645l.yandex);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c4645l.loadAd);
        C8458l c8458l = C8458l.yandex;
        abstractC4072l.applovin(interfaceC18035l, 2, c8458l, c4645l.crashlytics);
        abstractC4072l.appmetrica(interfaceC18035l, 3, c4645l.amazon);
        abstractC4072l.appmetrica(interfaceC18035l, 4, c4645l.purchase);
        abstractC4072l.applovin(interfaceC18035l, 5, c8458l, c4645l.billing);
        abstractC4072l.appmetrica(interfaceC18035l, 6, c4645l.mopub);
        abstractC4072l.appmetrica(interfaceC18035l, 7, c4645l.admob);
        abstractC4072l.appmetrica(interfaceC18035l, 8, c4645l.subs);
        abstractC4072l.appmetrica(interfaceC18035l, 9, c4645l.isPro);
        abstractC4072l.ad(interfaceC18035l, 10, c4645l.firebase);
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        int i = 0;
        boolean zIsVip = false;
        long jInmobi = 0;
        String strRemoteconfig = null;
        C2106l c2106l = null;
        String strRemoteconfig2 = null;
        String strRemoteconfig3 = null;
        C2106l c2106l2 = null;
        String strRemoteconfig4 = null;
        String strRemoteconfig5 = null;
        String strRemoteconfig6 = null;
        String strRemoteconfig7 = null;
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
                    c2106l = (C2106l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, C8458l.yandex, c2106l);
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
                    c2106l2 = (C2106l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 5, C8458l.yandex, c2106l2);
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
                    strRemoteconfig6 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    strRemoteconfig7 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 9);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                case 10:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 10);
                    i |= 1024;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C4645l(i, jInmobi, strRemoteconfig, c2106l, strRemoteconfig2, strRemoteconfig3, c2106l2, strRemoteconfig4, strRemoteconfig5, strRemoteconfig6, strRemoteconfig7, zIsVip);
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
