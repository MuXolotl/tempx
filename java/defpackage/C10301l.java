package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10301l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C10301l yandex;

    static {
        C10301l c10301l = new C10301l();
        yandex = c10301l;
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistDto", c10301l, 43);
        c13637l.smaato("id", false);
        c13637l.smaato("owner_id", false);
        c13637l.smaato("type", false);
        c13637l.smaato("title", false);
        c13637l.smaato("description", false);
        c13637l.smaato("count", false);
        c13637l.smaato("followers", false);
        c13637l.smaato("plays", false);
        c13637l.smaato("create_time", false);
        c13637l.smaato("update_time", false);
        c13637l.smaato("playlist_id", true);
        c13637l.smaato("genres", true);
        c13637l.smaato("is_following", true);
        c13637l.smaato("no_discover", true);
        c13637l.smaato("audios", true);
        c13637l.smaato("is_curator", true);
        c13637l.smaato("year", true);
        c13637l.smaato("original", true);
        c13637l.smaato("followed", true);
        c13637l.smaato("photo", true);
        c13637l.smaato("permissions", true);
        c13637l.smaato("subtitle_badge", true);
        c13637l.smaato("play_button", true);
        c13637l.smaato("thumbs", true);
        c13637l.smaato("access_key", true);
        c13637l.smaato("uma_album_id", true);
        c13637l.smaato("subtitle", true);
        c13637l.smaato("original_year", true);
        c13637l.smaato("is_explicit", true);
        c13637l.smaato("artists", true);
        c13637l.smaato("main_artists", true);
        c13637l.smaato("main_artist", true);
        c13637l.smaato("featured_artists", true);
        c13637l.smaato("album_type", true);
        c13637l.smaato("meta", true);
        c13637l.smaato("restriction", true);
        c13637l.smaato("track_code", true);
        c13637l.smaato("audio_chart_info", true);
        c13637l.smaato("match_score", true);
        c13637l.smaato("actions", true);
        c13637l.smaato("audios_total_file_size", true);
        c13637l.smaato("exclusive", true);
        c13637l.smaato("icon", true);
        descriptor = c13637l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = C3346l.f7127case;
        C1313l c1313l = C1313l.yandex;
        C0194l c0194l = C0194l.yandex;
        C2796l c2796l = C2796l.yandex;
        C12738l c12738l = C12738l.yandex;
        C0654l c0654l = C0654l.yandex;
        return new InterfaceC16588l[]{c1313l, C11363l.yandex, interfaceC1220lArr[2].getValue(), c0194l, c0194l, c1313l, c1313l, c1313l, c1313l, c1313l, AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[11].getValue()), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[14].getValue()), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c12738l), AbstractC7303l.crashlytics(c12738l), AbstractC7303l.crashlytics(C13631l.yandex), AbstractC7303l.crashlytics(C16619l.yandex), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[23].getValue()), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(c1313l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[29].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[30].getValue()), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[32].getValue()), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[33].getValue()), AbstractC7303l.crashlytics(C9854l.yandex), AbstractC7303l.crashlytics(C7879l.yandex), AbstractC7303l.crashlytics(c0194l), AbstractC7303l.crashlytics(C16719l.yandex), AbstractC7303l.crashlytics(c0654l), AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[39].getValue()), AbstractC7303l.crashlytics(c0654l), AbstractC7303l.crashlytics(c2796l), AbstractC7303l.crashlytics(c0194l)};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C3346l c3346l = (C3346l) obj;
        String str = c3346l.f7129else;
        Boolean bool = c3346l.f7128catch;
        Float f = c3346l.f7137throw;
        List list = c3346l.f7131for;
        Float f2 = c3346l.f7130extends;
        C18191l c18191l = c3346l.f7134private;
        String str2 = c3346l.f7132native;
        C17830l c17830l = c3346l.f7139volatile;
        C0296l c0296l = c3346l.f7135strictfp;
        EnumC3262l enumC3262l = c3346l.f7136synchronized;
        List list2 = c3346l.f7133package;
        String str3 = c3346l.f7138throws;
        List list3 = c3346l.inmobi;
        List list4 = c3346l.appmetrica;
        Boolean bool2 = c3346l.applovin;
        Integer num = c3346l.premium;
        String str4 = c3346l.signatures;
        Integer num2 = c3346l.isVip;
        String str5 = c3346l.advert;
        List list5 = c3346l.ad;
        Boolean bool3 = c3346l.pro;
        Boolean bool4 = c3346l.license;
        C5606l c5606l = c3346l.Signature;
        C8206l c8206l = c3346l.tapsense;
        C2839l c2839l = c3346l.subscription;
        C2839l c2839l2 = c3346l.ads;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C3346l.f7127case;
        int i = c3346l.yandex;
        Integer num3 = c3346l.adcel;
        Boolean bool5 = c3346l.startapp;
        List list6 = c3346l.metrica;
        Boolean bool6 = c3346l.vip;
        Boolean bool7 = c3346l.remoteconfig;
        List list7 = c3346l.smaato;
        Integer num4 = c3346l.firebase;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, i, interfaceC18035l);
        abstractC4072l.applovin(interfaceC18035l, 1, C11363l.yandex, new C10877l(c3346l.loadAd));
        abstractC4072l.applovin(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), c3346l.crashlytics);
        abstractC4072l.appmetrica(interfaceC18035l, 3, c3346l.amazon);
        abstractC4072l.appmetrica(interfaceC18035l, 4, c3346l.purchase);
        abstractC4072l.signatures(5, c3346l.billing, interfaceC18035l);
        abstractC4072l.signatures(6, c3346l.mopub, interfaceC18035l);
        abstractC4072l.signatures(7, c3346l.admob, interfaceC18035l);
        abstractC4072l.signatures(8, c3346l.subs, interfaceC18035l);
        abstractC4072l.signatures(9, c3346l.isPro, interfaceC18035l);
        if (abstractC4072l.ads() || num4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 10, C1313l.yandex, num4);
        }
        if (abstractC4072l.ads() || list7 != null) {
            abstractC4072l.startapp(interfaceC18035l, 11, (InterfaceC16588l) interfaceC1220lArr[11].getValue(), list7);
        }
        if (abstractC4072l.ads() || bool7 != null) {
            abstractC4072l.startapp(interfaceC18035l, 12, C2796l.yandex, bool7);
        }
        if (abstractC4072l.ads() || bool6 != null) {
            abstractC4072l.startapp(interfaceC18035l, 13, C2796l.yandex, bool6);
        }
        if (abstractC4072l.ads() || list6 != null) {
            abstractC4072l.startapp(interfaceC18035l, 14, (InterfaceC16588l) interfaceC1220lArr[14].getValue(), list6);
        }
        if (abstractC4072l.ads() || bool5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 15, C2796l.yandex, bool5);
        }
        if (abstractC4072l.ads() || num3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 16, C1313l.yandex, num3);
        }
        if (abstractC4072l.ads() || c2839l2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 17, C12738l.yandex, c2839l2);
        }
        if (abstractC4072l.ads() || c2839l != null) {
            abstractC4072l.startapp(interfaceC18035l, 18, C12738l.yandex, c2839l);
        }
        if (abstractC4072l.ads() || c8206l != null) {
            abstractC4072l.startapp(interfaceC18035l, 19, C13631l.yandex, c8206l);
        }
        if (abstractC4072l.ads() || c5606l != null) {
            abstractC4072l.startapp(interfaceC18035l, 20, C16619l.yandex, c5606l);
        }
        if (abstractC4072l.ads() || bool4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 21, C2796l.yandex, bool4);
        }
        if (abstractC4072l.ads() || bool3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 22, C2796l.yandex, bool3);
        }
        if (abstractC4072l.ads() || list5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 23, (InterfaceC16588l) interfaceC1220lArr[23].getValue(), list5);
        }
        if (abstractC4072l.ads() || str5 != null) {
            abstractC4072l.startapp(interfaceC18035l, 24, C0194l.yandex, str5);
        }
        if (abstractC4072l.ads() || num2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 25, C1313l.yandex, num2);
        }
        if (abstractC4072l.ads() || str4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 26, C0194l.yandex, str4);
        }
        if (abstractC4072l.ads() || num != null) {
            abstractC4072l.startapp(interfaceC18035l, 27, C1313l.yandex, num);
        }
        if (abstractC4072l.ads() || bool2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 28, C2796l.yandex, bool2);
        }
        if (abstractC4072l.ads() || list4 != null) {
            abstractC4072l.startapp(interfaceC18035l, 29, (InterfaceC16588l) interfaceC1220lArr[29].getValue(), list4);
        }
        if (abstractC4072l.ads() || list3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 30, (InterfaceC16588l) interfaceC1220lArr[30].getValue(), list3);
        }
        if (abstractC4072l.ads() || str3 != null) {
            abstractC4072l.startapp(interfaceC18035l, 31, C0194l.yandex, str3);
        }
        if (abstractC4072l.ads() || list2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 32, (InterfaceC16588l) interfaceC1220lArr[32].getValue(), list2);
        }
        if (abstractC4072l.ads() || enumC3262l != null) {
            abstractC4072l.startapp(interfaceC18035l, 33, (InterfaceC16588l) interfaceC1220lArr[33].getValue(), enumC3262l);
        }
        if (abstractC4072l.ads() || c0296l != null) {
            abstractC4072l.startapp(interfaceC18035l, 34, C9854l.yandex, c0296l);
        }
        if (abstractC4072l.ads() || c17830l != null) {
            abstractC4072l.startapp(interfaceC18035l, 35, C7879l.yandex, c17830l);
        }
        if (abstractC4072l.ads() || str2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 36, C0194l.yandex, str2);
        }
        if (abstractC4072l.ads() || c18191l != null) {
            abstractC4072l.startapp(interfaceC18035l, 37, C16719l.yandex, c18191l);
        }
        if (abstractC4072l.ads() || f2 != null) {
            abstractC4072l.startapp(interfaceC18035l, 38, C0654l.yandex, f2);
        }
        if (abstractC4072l.ads() || list != null) {
            abstractC4072l.startapp(interfaceC18035l, 39, (InterfaceC16588l) interfaceC1220lArr[39].getValue(), list);
        }
        if (abstractC4072l.ads() || f != null) {
            abstractC4072l.startapp(interfaceC18035l, 40, C0654l.yandex, f);
        }
        if (abstractC4072l.ads() || bool != null) {
            abstractC4072l.startapp(interfaceC18035l, 41, C2796l.yandex, bool);
        }
        if (abstractC4072l.ads() || str != null) {
            abstractC4072l.startapp(interfaceC18035l, 42, C0194l.yandex, str);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        int i;
        int i2;
        List list;
        int i3;
        int i4;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = C3346l.f7127case;
        Float f = null;
        Float f2 = null;
        C18191l c18191l = null;
        String str = null;
        Boolean bool = null;
        C17830l c17830l = null;
        List list2 = null;
        int i5 = 0;
        String str2 = null;
        EnumC3262l enumC3262l = null;
        C0296l c0296l = null;
        List list3 = null;
        String str3 = null;
        List list4 = null;
        int iSubscription = 0;
        int iSubscription2 = 0;
        int iSubscription3 = 0;
        int iSubscription4 = 0;
        boolean z = true;
        int iSubscription5 = 0;
        String str4 = null;
        String str5 = null;
        int i6 = 0;
        C10877l c10877l = null;
        EnumC11706l enumC11706l = null;
        Integer num = null;
        List list5 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        int i7 = 0;
        List list6 = null;
        Boolean bool4 = null;
        Integer num2 = null;
        C2839l c2839l = null;
        C2839l c2839l2 = null;
        C8206l c8206l = null;
        C5606l c5606l = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        List list7 = null;
        String str6 = null;
        Integer num3 = null;
        String str7 = null;
        Integer num4 = null;
        Boolean bool7 = null;
        List list8 = null;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    i = i7;
                    Unit unit = Unit.INSTANCE;
                    z = false;
                    list6 = list6;
                    str3 = str3;
                    i7 = i;
                    list3 = list3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 0:
                    C10877l c10877l2 = c10877l;
                    iSubscription5 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 0);
                    i = i7 | 1;
                    Unit unit2 = Unit.INSTANCE;
                    c10877l = c10877l2;
                    list6 = list6;
                    str3 = str3;
                    i7 = i;
                    list3 = list3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 1:
                    f = f;
                    list3 = list3;
                    String str8 = str3;
                    int i8 = i7;
                    List list9 = list6;
                    f2 = f2;
                    C10877l c10877l3 = (C10877l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, C11363l.yandex, c10877l);
                    i = i8 | 2;
                    Unit unit3 = Unit.INSTANCE;
                    c10877l = c10877l3;
                    enumC11706l = enumC11706l;
                    list6 = list9;
                    str3 = str8;
                    i7 = i;
                    list3 = list3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 2:
                    EnumC11706l enumC11706l2 = (EnumC11706l) interfaceC14988lCrashlytics.ads(interfaceC18035l, 2, (InterfaceC16588l) interfaceC1220lArr[2].getValue(), enumC11706l);
                    i2 = i7 | 4;
                    Unit unit4 = Unit.INSTANCE;
                    enumC11706l = enumC11706l2;
                    list6 = list6;
                    list3 = list3;
                    str3 = str3;
                    i7 = i2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 3:
                    String strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i = i7 | 8;
                    Unit unit5 = Unit.INSTANCE;
                    str4 = strRemoteconfig;
                    list6 = list6;
                    str3 = str3;
                    i7 = i;
                    list3 = list3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 4:
                    int i9 = i7;
                    list = list6;
                    String strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 4);
                    i3 = i9 | 16;
                    Unit unit6 = Unit.INSTANCE;
                    str5 = strRemoteconfig2;
                    list6 = list;
                    str3 = str3;
                    i7 = i3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 5:
                    int iSubscription6 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 5);
                    i = i7 | 32;
                    Unit unit7 = Unit.INSTANCE;
                    i6 = iSubscription6;
                    list6 = list6;
                    str3 = str3;
                    i7 = i;
                    list3 = list3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 6:
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 6);
                    i3 = i7 | 64;
                    Unit unit8 = Unit.INSTANCE;
                    list6 = list6;
                    i7 = i3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 7:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 7);
                    i3 = i7 | 128;
                    Unit unit9 = Unit.INSTANCE;
                    list6 = list6;
                    i7 = i3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 8:
                    iSubscription3 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 8);
                    i3 = i7 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit10 = Unit.INSTANCE;
                    list6 = list6;
                    i7 = i3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 9:
                    iSubscription4 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 9);
                    i3 = i7 | AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit11 = Unit.INSTANCE;
                    list6 = list6;
                    i7 = i3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 10:
                    Integer num5 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 10, C1313l.yandex, num);
                    i2 = i7 | 1024;
                    Unit unit12 = Unit.INSTANCE;
                    num = num5;
                    list6 = list6;
                    list3 = list3;
                    str3 = str3;
                    i7 = i2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 11:
                    List list10 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 11, (InterfaceC16588l) interfaceC1220lArr[11].getValue(), list5);
                    i2 = i7 | 2048;
                    Unit unit13 = Unit.INSTANCE;
                    list5 = list10;
                    list6 = list6;
                    list3 = list3;
                    str3 = str3;
                    i7 = i2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 12:
                    Boolean bool8 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 12, C2796l.yandex, bool2);
                    i2 = i7 | 4096;
                    Unit unit14 = Unit.INSTANCE;
                    bool2 = bool8;
                    list6 = list6;
                    list3 = list3;
                    str3 = str3;
                    i7 = i2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 13:
                    int i10 = i7;
                    list = list6;
                    Boolean bool9 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 13, C2796l.yandex, bool3);
                    i3 = i10 | 8192;
                    Unit unit15 = Unit.INSTANCE;
                    bool3 = bool9;
                    list6 = list;
                    str3 = str3;
                    i7 = i3;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 14:
                    f = f;
                    String str9 = str3;
                    List list11 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 14, (InterfaceC16588l) interfaceC1220lArr[14].getValue(), list6);
                    Unit unit16 = Unit.INSTANCE;
                    list6 = list11;
                    f2 = f2;
                    i7 |= 16384;
                    list3 = list3;
                    str3 = str9;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 15:
                    list3 = list3;
                    Boolean bool10 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 15, C2796l.yandex, bool4);
                    i4 = i7 | 32768;
                    Unit unit17 = Unit.INSTANCE;
                    bool4 = bool10;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 16:
                    list3 = list3;
                    Integer num6 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 16, C1313l.yandex, num2);
                    i4 = i7 | 65536;
                    Unit unit18 = Unit.INSTANCE;
                    num2 = num6;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    C2839l c2839l3 = (C2839l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 17, C12738l.yandex, c2839l);
                    Unit unit19 = Unit.INSTANCE;
                    i7 |= 131072;
                    c2839l = c2839l3;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    C2839l c2839l4 = (C2839l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 18, C12738l.yandex, c2839l2);
                    Unit unit20 = Unit.INSTANCE;
                    i7 |= 262144;
                    c2839l2 = c2839l4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    list3 = list3;
                    C8206l c8206l2 = (C8206l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 19, C13631l.yandex, c8206l);
                    i4 = i7 | 524288;
                    Unit unit21 = Unit.INSTANCE;
                    c8206l = c8206l2;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 20:
                    list3 = list3;
                    C5606l c5606l2 = (C5606l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 20, C16619l.yandex, c5606l);
                    i4 = i7 | 1048576;
                    Unit unit22 = Unit.INSTANCE;
                    c5606l = c5606l2;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 21:
                    list3 = list3;
                    Boolean bool11 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 21, C2796l.yandex, bool5);
                    i4 = i7 | 2097152;
                    Unit unit23 = Unit.INSTANCE;
                    bool5 = bool11;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 22:
                    list3 = list3;
                    Boolean bool12 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 22, C2796l.yandex, bool6);
                    i4 = i7 | 4194304;
                    Unit unit24 = Unit.INSTANCE;
                    bool6 = bool12;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 23:
                    list3 = list3;
                    List list12 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 23, (InterfaceC16588l) interfaceC1220lArr[23].getValue(), list7);
                    i4 = i7 | 8388608;
                    Unit unit25 = Unit.INSTANCE;
                    list7 = list12;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    list3 = list3;
                    String str10 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 24, C0194l.yandex, str6);
                    i4 = i7 | 16777216;
                    Unit unit26 = Unit.INSTANCE;
                    str6 = str10;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    list3 = list3;
                    Integer num7 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 25, C1313l.yandex, num3);
                    i4 = i7 | 33554432;
                    Unit unit27 = Unit.INSTANCE;
                    num3 = num7;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    list3 = list3;
                    String str11 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 26, C0194l.yandex, str7);
                    i4 = i7 | 67108864;
                    Unit unit28 = Unit.INSTANCE;
                    str7 = str11;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    list3 = list3;
                    Integer num8 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 27, C1313l.yandex, num4);
                    i4 = i7 | 134217728;
                    Unit unit29 = Unit.INSTANCE;
                    num4 = num8;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    list3 = list3;
                    Boolean bool13 = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 28, C2796l.yandex, bool7);
                    i4 = i7 | 268435456;
                    Unit unit30 = Unit.INSTANCE;
                    bool7 = bool13;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    list3 = list3;
                    List list13 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 29, (InterfaceC16588l) interfaceC1220lArr[29].getValue(), list8);
                    i4 = i7 | 536870912;
                    Unit unit31 = Unit.INSTANCE;
                    list8 = list13;
                    i7 = i4;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 30:
                    f = f;
                    str3 = str3;
                    list3 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 30, (InterfaceC16588l) interfaceC1220lArr[30].getValue(), list3);
                    Unit unit32 = Unit.INSTANCE;
                    i7 |= 1073741824;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 31:
                    List list14 = list3;
                    f = f;
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 31, C0194l.yandex, str3);
                    int i11 = i7 | RecyclerView.UNDEFINED_DURATION;
                    Unit unit33 = Unit.INSTANCE;
                    i7 = i11;
                    list6 = list6;
                    list3 = list14;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case 32:
                    list4 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 32, (InterfaceC16588l) interfaceC1220lArr[32].getValue(), list4);
                    i5 |= 1;
                    Unit unit34 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    enumC3262l = (EnumC3262l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 33, (InterfaceC16588l) interfaceC1220lArr[33].getValue(), enumC3262l);
                    i5 |= 2;
                    Unit unit35 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    c0296l = (C0296l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 34, C9854l.yandex, c0296l);
                    i5 |= 4;
                    Unit unit36 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    c17830l = (C17830l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 35, C7879l.yandex, c17830l);
                    i5 |= 8;
                    Unit unit37 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 36, C0194l.yandex, str);
                    i5 |= 16;
                    Unit unit38 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    c18191l = (C18191l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 37, C16719l.yandex, c18191l);
                    i5 |= 32;
                    Unit unit39 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    f2 = (Float) interfaceC14988lCrashlytics.ad(interfaceC18035l, 38, C0654l.yandex, f2);
                    i5 |= 64;
                    Unit unit310 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    list2 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 39, (InterfaceC16588l) interfaceC1220lArr[39].getValue(), list2);
                    i5 |= 128;
                    Unit unit311 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    f = (Float) interfaceC14988lCrashlytics.ad(interfaceC18035l, 40, C0654l.yandex, f);
                    i5 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit312 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 41, C2796l.yandex, bool);
                    i5 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit313 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    str2 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 42, C0194l.yandex, str2);
                    i5 |= 1024;
                    Unit unit314 = Unit.INSTANCE;
                    f = f;
                    list3 = list3;
                    str3 = str3;
                    f2 = f2;
                    f2 = f2;
                    f = f;
                    list6 = list6;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        Float f3 = f;
        List list15 = list3;
        String str12 = str3;
        int i12 = i7;
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        String str13 = str2;
        return new C3346l(i12, i5, iSubscription5, c10877l, enumC11706l, str4, str5, i6, iSubscription, iSubscription2, iSubscription3, iSubscription4, num, list5, bool2, bool3, list6, bool4, num2, c2839l, c2839l2, c8206l, c5606l, bool5, bool6, list7, str6, num3, str7, num4, bool7, list8, list15, str12, list4, enumC3262l, c0296l, c17830l, str, c18191l, f2, list2, f3, bool, str13);
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
