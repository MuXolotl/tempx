package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10250l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10250l yandex;

    static {
        C10250l c10250l = new C10250l();
        yandex = c10250l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonDto", c10250l, 12);
        c13637l.smaato("action", true);
        c13637l.smaato("title", true);
        c13637l.smaato("block_id", true);
        c13637l.smaato("section_id", true);
        c13637l.smaato("artist_id", true);
        c13637l.smaato("curator_id", true);
        c13637l.smaato("album_id", true);
        c13637l.smaato("owner_id", true);
        c13637l.smaato("icon", true);
        c13637l.smaato("style", true);
        c13637l.smaato("audio_id", true);
        c13637l.smaato("hashtag", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C13748l.remoteconfig;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(C4114l.yandex);
        C0194l c0194l = C0194l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics3 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics4 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics5 = AbstractC7303l.crashlytics(c0194l);
        C1313l c1313l = C1313l.yandex;
        return new InterfaceC16588l[]{interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, interfaceC16588lCrashlytics3, interfaceC16588lCrashlytics4, interfaceC16588lCrashlytics5, AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(C11363l.yandex), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[9].getValue()), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C13748l c13748l = (C13748l) obj;
        String str = c13748l.smaato;
        Integer num = c13748l.firebase;
        EnumC9380l enumC9380l = c13748l.isPro;
        String str2 = c13748l.subs;
        C10877l c10877l = c13748l.admob;
        Integer num2 = c13748l.mopub;
        Integer num3 = c13748l.billing;
        String str3 = c13748l.purchase;
        String str4 = c13748l.amazon;
        String str5 = c13748l.crashlytics;
        String str6 = c13748l.loadAd;
        C17346l c17346l = c13748l.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C13748l.remoteconfig;
        if (interfaceC0039lCrashlytics.ads() || c17346l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C4114l.yandex, c17346l);
        }
        if (interfaceC0039lCrashlytics.ads() || str6 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C0194l.yandex, str6);
        }
        if (interfaceC0039lCrashlytics.ads() || str5 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 2, C0194l.yandex, str5);
        }
        if (interfaceC0039lCrashlytics.ads() || str4 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 3, C0194l.yandex, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || str3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 4, C0194l.yandex, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || num3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, C1313l.yandex, num3);
        }
        if (interfaceC0039lCrashlytics.ads() || num2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 6, C1313l.yandex, num2);
        }
        if (interfaceC0039lCrashlytics.ads() || c10877l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 7, C11363l.yandex, c10877l);
        }
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 8, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || enumC9380l != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), enumC9380l);
        }
        if (interfaceC0039lCrashlytics.ads() || num != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 10, C1313l.yandex, num);
        }
        if (interfaceC0039lCrashlytics.ads() || str != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 11, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C13748l.remoteconfig;
        String str = null;
        Integer num = null;
        EnumC9380l enumC9380l = null;
        String str2 = null;
        boolean z = true;
        C10877l c10877l = null;
        int i = 0;
        C17346l c17346l = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    str = str;
                    break;
                case 0:
                    c17346l = (C17346l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C4114l.yandex, c17346l);
                    i |= 1;
                    z = z;
                    str = str;
                    break;
                case 1:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str3);
                    i |= 2;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 2:
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str4);
                    i |= 4;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 3:
                    str5 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C0194l.yandex, str5);
                    i |= 8;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 4:
                    str6 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, C0194l.yandex, str6);
                    i |= 16;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 5:
                    num2 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C1313l.yandex, num2);
                    i |= 32;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 6:
                    num3 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C1313l.yandex, num3);
                    i |= 64;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 7:
                    c10877l = (C10877l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C11363l.yandex, c10877l);
                    i |= 128;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 8:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C0194l.yandex, str2);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 9:
                    enumC9380l = (EnumC9380l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), enumC9380l);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 10:
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 10, C1313l.yandex, num);
                    i |= 1024;
                    z = z;
                    c17346l = c17346l;
                    break;
                case 11:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 11, C0194l.yandex, str);
                    i |= 2048;
                    z = z;
                    c17346l = c17346l;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C13748l(i, c17346l, str3, str4, str5, str6, num2, num3, c10877l, str2, enumC9380l, num, str);
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
