package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘٛۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5816l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C5816l yandex;

    static {
        C5816l c5816l = new C5816l();
        yandex = c5816l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioArtistDto", c5816l, 15);
        c13637l.smaato("name", false);
        c13637l.smaato("domain", true);
        c13637l.smaato("id", true);
        c13637l.smaato("is_album_cover", true);
        c13637l.smaato("photo", true);
        c13637l.smaato("photos", true);
        c13637l.smaato("is_followed", true);
        c13637l.smaato("can_follow", true);
        c13637l.smaato("can_play", true);
        c13637l.smaato("genres", true);
        c13637l.smaato("bio", true);
        c13637l.smaato("pages", true);
        c13637l.smaato("profiles", true);
        c13637l.smaato("groups", true);
        c13637l.smaato("track_code", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C6388l.startapp;
        C0194l c0194l = C0194l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(c0194l);
        C2796l c2796l = C2796l.yandex;
        return new InterfaceC16588l[]{c0194l, interfaceC16588lCrashlytics, interfaceC16588lCrashlytics2, AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[4].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[5].getValue()), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[9].getValue()), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[11].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[12].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[13].getValue()), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C6388l c6388l = (C6388l) obj;
        String str = c6388l.metrica;
        List list = c6388l.vip;
        List list2 = c6388l.remoteconfig;
        List list3 = c6388l.smaato;
        String str2 = c6388l.firebase;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6388l.startapp;
        String str3 = c6388l.yandex;
        List list4 = c6388l.isPro;
        Boolean bool = c6388l.subs;
        Boolean bool2 = c6388l.admob;
        Boolean bool3 = c6388l.mopub;
        List list5 = c6388l.billing;
        List list6 = c6388l.purchase;
        Boolean bool4 = c6388l.amazon;
        String str4 = c6388l.crashlytics;
        String str5 = c6388l.loadAd;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.appmetrica(interfaceC18035l, 0, str3);
        if (abstractC4072l.ads() || str5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 1, C0194l.yandex, str5);
        }
        if (abstractC4072l.ads() || str4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 2, C0194l.yandex, str4);
        }
        if (abstractC4072l.ads() || bool4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 3, C2796l.yandex, bool4);
        }
        if (abstractC4072l.ads() || list6 != null) {
            abstractC4072l.startapp(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list6);
        }
        if (abstractC4072l.ads() || list5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), list5);
        }
        if (abstractC4072l.ads() || bool3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 6, C2796l.yandex, bool3);
        }
        if (abstractC4072l.ads() || bool2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 7, C2796l.yandex, bool2);
        }
        if (abstractC4072l.ads() || bool != null) {
            abstractC4072l.startapp(interfaceC18035l, 8, C2796l.yandex, bool);
        }
        if (abstractC4072l.ads() || list4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), list4);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 10, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || list3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 11, (InterfaceC16588l) interfaceC1220lArr[11].getValue(), list3);
        }
        if (abstractC4072l.ads() || list2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 12, (InterfaceC16588l) interfaceC1220lArr[12].getValue(), list2);
        }
        if (abstractC4072l.ads() || list != null) {
            abstractC4072l.startapp(interfaceC18035l, 13, (InterfaceC16588l) interfaceC1220lArr[13].getValue(), list);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 14, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        String str;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C6388l.startapp;
        List list = null;
        String str2 = null;
        List list2 = null;
        Boolean bool = null;
        List list3 = null;
        Boolean bool2 = null;
        int i = 0;
        List list4 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool3 = null;
        List list5 = null;
        List list6 = null;
        Boolean bool4 = null;
        boolean z = true;
        String strRemoteconfig = null;
        String str5 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    z = false;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 0:
                    str = str4;
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i |= 1;
                    str4 = str;
                    bool3 = bool3;
                    list = list;
                    break;
                case 1:
                    str = str4;
                    str5 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C0194l.yandex, str5);
                    i |= 2;
                    str4 = str;
                    bool3 = bool3;
                    list = list;
                    break;
                case 2:
                    list = list;
                    bool3 = bool3;
                    str4 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 2, C0194l.yandex, str4);
                    i |= 4;
                    bool3 = bool3;
                    list = list;
                    break;
                case 3:
                    list = list;
                    bool3 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 3, C2796l.yandex, bool3);
                    i |= 8;
                    str4 = str4;
                    list = list;
                    break;
                case 4:
                    list5 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 4, (InterfaceC16588l) interfaceC1220lArr[4].getValue(), list5);
                    i |= 16;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 5:
                    list6 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, (InterfaceC16588l) interfaceC1220lArr[5].getValue(), list6);
                    i |= 32;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 6:
                    bool4 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 6, C2796l.yandex, bool4);
                    i |= 64;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 7:
                    bool2 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 7, C2796l.yandex, bool2);
                    i |= 128;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 8:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 8, C2796l.yandex, bool);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 9:
                    list2 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 9, (InterfaceC16588l) interfaceC1220lArr[9].getValue(), list2);
                    i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 10:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 10, C0194l.yandex, str2);
                    i |= 1024;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 11:
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 11, (InterfaceC16588l) interfaceC1220lArr[11].getValue(), list);
                    i |= 2048;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 12:
                    list3 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 12, (InterfaceC16588l) interfaceC1220lArr[12].getValue(), list3);
                    i |= 4096;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 13:
                    list4 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 13, (InterfaceC16588l) interfaceC1220lArr[13].getValue(), list4);
                    i |= 8192;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                case 14:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 14, C0194l.yandex, str3);
                    i |= 16384;
                    str4 = str4;
                    bool3 = bool3;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        Boolean bool5 = bool3;
        String str6 = str5;
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        return new C6388l(i, strRemoteconfig, str6, str4, bool5, list5, list6, bool4, bool2, bool, list2, str2, list, list3, list4, str3);
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
