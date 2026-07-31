package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* JADX INFO: renamed from: lٌؙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8867l implements InterfaceC13593l {
    private static final InterfaceC18035l descriptor;
    public static final C8867l yandex;

    static {
        C8867l c8867l = new C8867l();
        yandex = c8867l;
        C13637l c13637l = new C13637l("ua.itaysonlab.vkapi2.objects.music.AudioTrack", c8867l, 29);
        c13637l.smaato("artist", true);
        c13637l.smaato("id", true);
        c13637l.smaato("owner_id", true);
        c13637l.smaato("title", true);
        c13637l.smaato("duration", true);
        c13637l.smaato("access_key", true);
        c13637l.smaato("is_explicit", true);
        c13637l.smaato("is_licensed", true);
        c13637l.smaato("track_code", true);
        c13637l.smaato("url", true);
        c13637l.smaato("date", true);
        c13637l.smaato("genre_id", true);
        c13637l.smaato("content_restricted", true);
        c13637l.smaato("album", true);
        c13637l.smaato("lyrics_id", true);
        c13637l.smaato("main_artists", true);
        c13637l.smaato("featured_artists", true);
        c13637l.smaato("subtitle", true);
        c13637l.smaato("track_genre_id", true);
        c13637l.smaato("album_part_number", true);
        c13637l.smaato("is_hq", true);
        c13637l.smaato("is_focus_track", true);
        c13637l.smaato("has_lyrics", true);
        c13637l.smaato("dislike", true);
        c13637l.smaato("podcast_info", true);
        c13637l.smaato("audio_chart_info", true);
        c13637l.smaato("stream_duration", true);
        c13637l.smaato("release_audio_id", true);
        c13637l.smaato("like", true);
        descriptor = c13637l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        InterfaceC1220l[] interfaceC1220lArr = AudioTrack.f36603extends;
        C0194l c0194l = C0194l.yandex;
        C1313l c1313l = C1313l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics = AbstractC7303l.crashlytics(c0194l);
        C2796l c2796l = C2796l.yandex;
        InterfaceC16588l interfaceC16588lCrashlytics2 = AbstractC7303l.crashlytics(c1313l);
        InterfaceC16588l interfaceC16588lCrashlytics3 = AbstractC7303l.crashlytics(C7896l.yandex);
        InterfaceC16588l interfaceC16588lCrashlytics4 = AbstractC7303l.crashlytics(c1313l);
        InterfaceC16588l interfaceC16588lCrashlytics5 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[15].getValue());
        InterfaceC16588l interfaceC16588lCrashlytics6 = AbstractC7303l.crashlytics((InterfaceC16588l) interfaceC1220lArr[16].getValue());
        InterfaceC16588l interfaceC16588lCrashlytics7 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics8 = AbstractC7303l.crashlytics(c1313l);
        InterfaceC16588l interfaceC16588lCrashlytics9 = AbstractC7303l.crashlytics(c1313l);
        InterfaceC16588l interfaceC16588lCrashlytics10 = AbstractC7303l.crashlytics(C0482l.yandex);
        InterfaceC16588l interfaceC16588lCrashlytics11 = AbstractC7303l.crashlytics(C7764l.yandex);
        InterfaceC16588l interfaceC16588lCrashlytics12 = AbstractC7303l.crashlytics(c0194l);
        InterfaceC16588l interfaceC16588lCrashlytics13 = AbstractC7303l.crashlytics(c2796l);
        C2010l c2010l = C2010l.yandex;
        return new InterfaceC16588l[]{c0194l, c1313l, c2010l, c0194l, c1313l, interfaceC16588lCrashlytics, c2796l, c2796l, c0194l, c0194l, c2010l, interfaceC16588lCrashlytics2, c1313l, interfaceC16588lCrashlytics3, interfaceC16588lCrashlytics4, interfaceC16588lCrashlytics5, interfaceC16588lCrashlytics6, interfaceC16588lCrashlytics7, interfaceC16588lCrashlytics8, interfaceC16588lCrashlytics9, c2796l, c2796l, c2796l, c2796l, interfaceC16588lCrashlytics10, interfaceC16588lCrashlytics11, c1313l, interfaceC16588lCrashlytics12, interfaceC16588lCrashlytics13};
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0242  */
    /* JADX WARN: Code duplicated, block: B:140:0x0254  */
    /* JADX WARN: Code duplicated, block: B:145:0x0266  */
    /* JADX WARN: Code duplicated, block: B:150:0x0279  */
    /* JADX WARN: Code duplicated, block: B:156:0x028d  */
    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = (AudioTrack) obj;
        String str = audioTrack2.premium;
        int i = audioTrack2.signatures;
        AudioChartInfo audioChartInfo = audioTrack2.isVip;
        PodcastInfo podcastInfo = audioTrack2.advert;
        boolean z = audioTrack2.pro;
        boolean z2 = audioTrack2.license;
        boolean z3 = audioTrack2.Signature;
        Integer num = audioTrack2.tapsense;
        Integer num2 = audioTrack2.subscription;
        String str2 = audioTrack2.ads;
        List list = audioTrack2.adcel;
        List list2 = audioTrack2.startapp;
        Integer num3 = audioTrack2.metrica;
        AudioAlbum audioAlbum = audioTrack2.vip;
        int i2 = audioTrack2.remoteconfig;
        Integer num4 = audioTrack2.smaato;
        long j = audioTrack2.firebase;
        String str3 = audioTrack2.isPro;
        String str4 = audioTrack2.subs;
        boolean z4 = audioTrack2.admob;
        boolean z5 = audioTrack2.mopub;
        String str5 = audioTrack2.billing;
        int i3 = audioTrack2.purchase;
        String str6 = audioTrack2.amazon;
        long j2 = audioTrack2.crashlytics;
        int i4 = audioTrack2.loadAd;
        String str7 = audioTrack2.yandex;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = AudioTrack.f36603extends;
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str7, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 0, str7);
        }
        if (interfaceC0039lCrashlytics.ads() || i4 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(1, i4, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || j2 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).premium(interfaceC18035l, 2, j2);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str6, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 3, str6);
        }
        if (interfaceC0039lCrashlytics.ads() || i3 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(4, i3, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || str5 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 5, C0194l.yandex, str5);
        }
        if (interfaceC0039lCrashlytics.ads() || z5) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).ad(interfaceC18035l, 6, z5);
        }
        if (interfaceC0039lCrashlytics.ads() || z4) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).ad(interfaceC18035l, 7, z4);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str4, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 8, str4);
        }
        if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(str3, "")) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).appmetrica(interfaceC18035l, 9, str3);
        }
        if (interfaceC0039lCrashlytics.ads() || j != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).premium(interfaceC18035l, 10, j);
        }
        if (interfaceC0039lCrashlytics.ads() || num4 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 11, C1313l.yandex, num4);
        }
        if (interfaceC0039lCrashlytics.ads() || i2 != 0) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(12, i2, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads() || audioAlbum != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 13, C7896l.yandex, audioAlbum);
        }
        if (interfaceC0039lCrashlytics.ads() || num3 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 14, C1313l.yandex, num3);
        }
        if (interfaceC0039lCrashlytics.ads() || list2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 15, (InterfaceC16588l) interfaceC1220lArr[15].getValue(), list2);
        }
        if (interfaceC0039lCrashlytics.ads() || list != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 16, (InterfaceC16588l) interfaceC1220lArr[16].getValue(), list);
        }
        if (interfaceC0039lCrashlytics.ads() || str2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 17, C0194l.yandex, str2);
        }
        if (interfaceC0039lCrashlytics.ads() || num2 != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 18, C1313l.yandex, num2);
        }
        if (interfaceC0039lCrashlytics.ads() || num != null) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 19, C1313l.yandex, num);
        }
        if (interfaceC0039lCrashlytics.ads() || z3) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).ad(interfaceC18035l, 20, z3);
        }
        if (interfaceC0039lCrashlytics.ads() || z2) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).ad(interfaceC18035l, 21, z2);
        }
        if (interfaceC0039lCrashlytics.ads() || z) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).ad(interfaceC18035l, 22, z);
        }
        if (!interfaceC0039lCrashlytics.ads()) {
            audioTrack = audioTrack2;
            if (audioTrack.ad) {
            }
            if (interfaceC0039lCrashlytics.ads() || podcastInfo != null) {
                interfaceC0039lCrashlytics.startapp(interfaceC18035l, 24, C0482l.yandex, podcastInfo);
            }
            if (interfaceC0039lCrashlytics.ads() || audioChartInfo != null) {
                interfaceC0039lCrashlytics.startapp(interfaceC18035l, 25, C7764l.yandex, audioChartInfo);
            }
            if (interfaceC0039lCrashlytics.ads() || i != 0) {
                ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(26, i, interfaceC18035l);
            }
            if (interfaceC0039lCrashlytics.ads() || str != null) {
                interfaceC0039lCrashlytics.startapp(interfaceC18035l, 27, C0194l.yandex, str);
            }
            if (interfaceC0039lCrashlytics.ads() || audioTrack.applovin != null) {
                interfaceC0039lCrashlytics.startapp(interfaceC18035l, 28, C2796l.yandex, audioTrack.applovin);
            }
            interfaceC0039lCrashlytics.yandex(interfaceC18035l);
        }
        audioTrack = audioTrack2;
        ((AbstractC4072l) interfaceC0039lCrashlytics).ad(interfaceC18035l, 23, audioTrack.ad);
        if (interfaceC0039lCrashlytics.ads()) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 24, C0482l.yandex, podcastInfo);
        } else {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 24, C0482l.yandex, podcastInfo);
        }
        if (interfaceC0039lCrashlytics.ads()) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 25, C7764l.yandex, audioChartInfo);
        } else {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 25, C7764l.yandex, audioChartInfo);
        }
        if (interfaceC0039lCrashlytics.ads()) {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(26, i, interfaceC18035l);
        } else {
            ((AbstractC4072l) interfaceC0039lCrashlytics).signatures(26, i, interfaceC18035l);
        }
        if (interfaceC0039lCrashlytics.ads()) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 27, C0194l.yandex, str);
        } else {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 27, C0194l.yandex, str);
        }
        if (interfaceC0039lCrashlytics.ads()) {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 28, C2796l.yandex, audioTrack.applovin);
        } else {
            interfaceC0039lCrashlytics.startapp(interfaceC18035l, 28, C2796l.yandex, audioTrack.applovin);
        }
        interfaceC0039lCrashlytics.yandex(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        int i;
        InterfaceC18035l interfaceC18035l = descriptor;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
        InterfaceC1220l[] interfaceC1220lArr = AudioTrack.f36603extends;
        long j = 0;
        long j2 = 0;
        List list = null;
        List list2 = null;
        Integer num = null;
        AudioAlbum audioAlbum = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        int i2 = 0;
        Integer num3 = null;
        Integer num4 = null;
        PodcastInfo podcastInfo = null;
        AudioChartInfo audioChartInfo = null;
        String str3 = null;
        Boolean bool = null;
        boolean zIsVip = false;
        boolean zIsVip2 = false;
        String strRemoteconfig = null;
        String strRemoteconfig2 = null;
        int iSubscription = 0;
        boolean z = true;
        String str4 = null;
        int i3 = 0;
        String str5 = null;
        int i4 = 0;
        boolean zIsVip3 = false;
        boolean zIsVip4 = false;
        boolean zIsVip5 = false;
        boolean zIsVip6 = false;
        int iSubscription2 = 0;
        while (z) {
            int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
            switch (iAdmob) {
                case -1:
                    Unit unit = Unit.INSTANCE;
                    str2 = str2;
                    z = false;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 0:
                    String strRemoteconfig3 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 0);
                    i2 |= 1;
                    Unit unit2 = Unit.INSTANCE;
                    str2 = str2;
                    str4 = strRemoteconfig3;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 1:
                    num2 = num2;
                    int iSubscription3 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                    i2 |= 2;
                    Unit unit3 = Unit.INSTANCE;
                    str2 = str2;
                    i3 = iSubscription3;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 2:
                    list = list;
                    String str6 = str2;
                    num2 = num2;
                    long jInmobi = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 2);
                    i2 |= 4;
                    Unit unit4 = Unit.INSTANCE;
                    str2 = str6;
                    j2 = jInmobi;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 3:
                    list = list;
                    String str7 = str2;
                    num2 = num2;
                    String strRemoteconfig4 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 3);
                    i2 |= 8;
                    Unit unit5 = Unit.INSTANCE;
                    str2 = str7;
                    str5 = strRemoteconfig4;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 4:
                    list = list;
                    String str8 = str2;
                    num2 = num2;
                    int iSubscription4 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 4);
                    i2 |= 16;
                    Unit unit6 = Unit.INSTANCE;
                    str2 = str8;
                    i4 = iSubscription4;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 5:
                    list = list;
                    num2 = num2;
                    String str9 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 5, C0194l.yandex, str2);
                    i2 |= 32;
                    Unit unit7 = Unit.INSTANCE;
                    str2 = str9;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 6:
                    zIsVip = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 6);
                    i2 |= 64;
                    Unit unit8 = Unit.INSTANCE;
                    num2 = num2;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 7:
                    zIsVip2 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 7);
                    i2 |= 128;
                    Unit unit9 = Unit.INSTANCE;
                    num2 = num2;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 8:
                    strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 8);
                    i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit10 = Unit.INSTANCE;
                    num2 = num2;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 9:
                    strRemoteconfig2 = interfaceC14988lCrashlytics.remoteconfig(interfaceC18035l, 9);
                    i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit11 = Unit.INSTANCE;
                    num2 = num2;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 10:
                    list = list;
                    str2 = str2;
                    long jInmobi2 = interfaceC14988lCrashlytics.inmobi(interfaceC18035l, 10);
                    i2 |= 1024;
                    Unit unit12 = Unit.INSTANCE;
                    num2 = num2;
                    j = jInmobi2;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 11:
                    str2 = str2;
                    list = list;
                    Integer num5 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 11, C1313l.yandex, num2);
                    i2 |= 2048;
                    Unit unit13 = Unit.INSTANCE;
                    num2 = num5;
                    list = list;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 12:
                    str2 = str2;
                    num2 = num2;
                    iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 12);
                    i2 |= 4096;
                    Unit unit14 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 13:
                    str2 = str2;
                    num2 = num2;
                    audioAlbum = (AudioAlbum) interfaceC14988lCrashlytics.ad(interfaceC18035l, 13, C7896l.yandex, audioAlbum);
                    i2 |= 8192;
                    Unit unit15 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 14:
                    str2 = str2;
                    num2 = num2;
                    num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 14, C1313l.yandex, num);
                    i2 |= 16384;
                    Unit unit16 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 15:
                    list2 = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 15, (InterfaceC16588l) interfaceC1220lArr[15].getValue(), list2);
                    i = 32768;
                    i2 |= i;
                    Unit unit17 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 16:
                    list = (List) interfaceC14988lCrashlytics.ad(interfaceC18035l, 16, (InterfaceC16588l) interfaceC1220lArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    Unit unit18 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    str = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 17, C0194l.yandex, str);
                    i = 131072;
                    i2 |= i;
                    Unit unit19 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    num3 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 18, C1313l.yandex, num3);
                    i = 262144;
                    i2 |= i;
                    Unit unit110 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    num4 = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 19, C1313l.yandex, num4);
                    i = 524288;
                    i2 |= i;
                    Unit unit111 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 20:
                    zIsVip3 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 20);
                    i = 1048576;
                    i2 |= i;
                    Unit unit112 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 21:
                    zIsVip4 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 21);
                    i = 2097152;
                    i2 |= i;
                    Unit unit113 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 22:
                    zIsVip5 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 22);
                    i = 4194304;
                    i2 |= i;
                    Unit unit114 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case 23:
                    zIsVip6 = interfaceC14988lCrashlytics.isVip(interfaceC18035l, 23);
                    i = 8388608;
                    i2 |= i;
                    Unit unit115 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    podcastInfo = (PodcastInfo) interfaceC14988lCrashlytics.ad(interfaceC18035l, 24, C0482l.yandex, podcastInfo);
                    i = 16777216;
                    i2 |= i;
                    Unit unit116 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    audioChartInfo = (AudioChartInfo) interfaceC14988lCrashlytics.ad(interfaceC18035l, 25, C7764l.yandex, audioChartInfo);
                    i = 33554432;
                    i2 |= i;
                    Unit unit117 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    iSubscription2 = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 26);
                    i = 67108864;
                    i2 |= i;
                    Unit unit118 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    str3 = (String) interfaceC14988lCrashlytics.ad(interfaceC18035l, 27, C0194l.yandex, str3);
                    i = 134217728;
                    i2 |= i;
                    Unit unit119 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    bool = (Boolean) interfaceC14988lCrashlytics.ad(interfaceC18035l, 28, C2796l.yandex, bool);
                    i = 268435456;
                    i2 |= i;
                    Unit unit1110 = Unit.INSTANCE;
                    str2 = str2;
                    num2 = num2;
                    break;
                default:
                    C8936l.mopub(iAdmob);
                    return null;
            }
        }
        List list3 = list;
        interfaceC14988lCrashlytics.yandex(interfaceC18035l);
        Boolean bool2 = bool;
        String str10 = str3;
        return new AudioTrack(i2, str4, i3, j2, str5, i4, str2, zIsVip, zIsVip2, strRemoteconfig, strRemoteconfig2, j, num2, iSubscription, audioAlbum, num, list2, list3, str, num3, num4, zIsVip3, zIsVip4, zIsVip5, zIsVip6, podcastInfo, audioChartInfo, iSubscription2, str10, bool2);
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
