package defpackage;

import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓۗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14344l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C14344l yandex;

    static {
        C14344l c14344l = new C14344l();
        yandex = c14344l;
        C13637l c13637l = new C13637l("io.ktor.http.Cookie", c14344l, 10);
        c13637l.smaato("name", false);
        c13637l.smaato("value", false);
        c13637l.smaato("encoding", true);
        c13637l.smaato("maxAge", true);
        c13637l.smaato("expires", true);
        c13637l.smaato("domain", true);
        c13637l.smaato("path", true);
        c13637l.smaato("secure", true);
        c13637l.smaato("httpOnly", true);
        c13637l.smaato("extensions", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C13325l.f26140l;
        C0194l c0194l = C0194l.yandex;
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{c0194l, c0194l, interfaceC1220lArr[2].getValue(), AbstractC7303l.crashlytics(C1313l.yandex), AbstractC7303l.crashlytics(C13212l.yandex), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c0194l), c2796l, c2796l, interfaceC1220lArr[9].getValue()};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C13325l c13325l = (C13325l) obj;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C13325l.f26140l;
        String str = c13325l.f26145l;
        Map map = c13325l.f26146l;
        boolean z = c13325l.f26149l;
        boolean z2 = c13325l.f26143l;
        String str2 = c13325l.f26142l;
        String str3 = c13325l.f26150l;
        C8485l c8485l = c13325l.f26147l;
        Integer num = c13325l.f26148l;
        EnumC3116l enumC3116l = c13325l.f26141l;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str);
        abstractC4072l.appmetrica(interfaceC18035l, 1, c13325l.f26144l);
        if (abstractC4072l.ads() || enumC3116l != EnumC3116l.f6658l) {
            abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC3116l);
        }
        if (abstractC4072l.ads() || num != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C1313l.yandex, num);
        }
        if (abstractC4072l.ads() || c8485l != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, C13212l.yandex, c8485l);
        }
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || z2) {
            abstractC4072l.ad(interfaceC18035l, 7, z2);
        }
        if (abstractC4072l.ads() || z) {
            abstractC4072l.ad(interfaceC18035l, 8, z);
        }
        if (abstractC4072l.ads() || !AbstractC8576l.yandex(map, C14054l.f27396l)) {
            abstractC4072l.applovin(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), map);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C13325l.f26140l;
        Object obj = null;
        boolean z = true;
        Map map = null;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        EnumC3116l enumC3116l = null;
        Integer num = null;
        C8485l c8485l = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean zIsVip = false;
        boolean zIsVip2 = false;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i |= 1;
                    break;
                case 1:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 1);
                    i |= 2;
                    break;
                case 2:
                    enumC3116l = (EnumC3116l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC3116l);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C1313l.yandex, num);
                    i |= 8;
                    break;
                case 4:
                    c8485l = (C8485l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C13212l.yandex, c8485l);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C0194l.yandex, str2);
                    i |= 64;
                    break;
                case 7:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 7);
                    i |= 128;
                    break;
                case 8:
                    zIsVip2 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    map = (Map) interfaceC14988lCrashlytics.ads(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), map);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return obj;
            }
            obj = null;
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C13325l(i, strRemoteconfig, strRemoteconfig2, enumC3116l, num, c8485l, str, str2, zIsVip, zIsVip2, map);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC13593l
    public final /* bridge */ InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
