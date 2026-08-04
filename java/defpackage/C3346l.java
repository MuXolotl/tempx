package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lِؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C3346l {
    public static final C16790l Companion = new C16790l();

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static final InterfaceC1220l[] f7127case = {null, null, AbstractC9968l.crashlytics(2, new C14499l(19)), null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C14499l(20)), null, null, AbstractC9968l.crashlytics(2, new C14499l(21)), null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C14499l(22)), null, null, null, null, null, AbstractC9968l.crashlytics(2, new C14499l(23)), AbstractC9968l.crashlytics(2, new C14499l(24)), null, AbstractC9968l.crashlytics(2, new C14499l(25)), AbstractC9968l.crashlytics(2, new C14499l(26)), null, null, null, null, null, AbstractC9968l.crashlytics(2, new C14499l(27)), null, null, null};
    public final C5606l Signature;
    public final List ad;
    public final Integer adcel;
    public final int admob;
    public final C2839l ads;
    public final String advert;
    public final String amazon;
    public final Boolean applovin;
    public final List appmetrica;
    public final int billing;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final Boolean f7128catch;
    public final EnumC11706l crashlytics;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final String f7129else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final Float f7130extends;
    public final Integer firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final List f7131for;
    public final List inmobi;
    public final int isPro;
    public final Integer isVip;
    public final Boolean license;
    public final long loadAd;
    public final List metrica;
    public final int mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f7132native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final List f7133package;
    public final Integer premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C18191l f7134private;
    public final Boolean pro;
    public final String purchase;
    public final Boolean remoteconfig;
    public final String signatures;
    public final List smaato;
    public final Boolean startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C0296l f7135strictfp;
    public final int subs;
    public final C2839l subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final EnumC3262l f7136synchronized;
    public final C8206l tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final Float f7137throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final String f7138throws;
    public final Boolean vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final C17830l f7139volatile;
    public final int yandex;

    public /* synthetic */ C3346l(int i, int i2, int i3, C10877l c10877l, EnumC11706l enumC11706l, String str, String str2, int i4, int i5, int i6, int i7, int i8, Integer num, List list, Boolean bool, Boolean bool2, List list2, Boolean bool3, Integer num2, C2839l c2839l, C2839l c2839l2, C8206l c8206l, C5606l c5606l, Boolean bool4, Boolean bool5, List list3, String str3, Integer num3, String str4, Integer num4, Boolean bool6, List list4, List list5, String str5, List list6, EnumC3262l enumC3262l, C0296l c0296l, C17830l c17830l, String str6, C18191l c18191l, Float f, List list7, Float f2, Boolean bool7, String str7) {
        if (1023 != (i & 1023)) {
            AbstractC11036l.subs(new int[]{i, i2}, new int[]{1023, 0}, C10301l.yandex.purchase());
            throw null;
        }
        this.yandex = i3;
        this.loadAd = c10877l.yandex;
        this.crashlytics = enumC11706l;
        this.amazon = str;
        this.purchase = str2;
        this.billing = i4;
        this.mopub = i5;
        this.admob = i6;
        this.subs = i7;
        this.isPro = i8;
        if ((i & 1024) == 0) {
            this.firebase = null;
        } else {
            this.firebase = num;
        }
        if ((i & 2048) == 0) {
            this.smaato = null;
        } else {
            this.smaato = list;
        }
        if ((i & 4096) == 0) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = bool;
        }
        if ((i & 8192) == 0) {
            this.vip = null;
        } else {
            this.vip = bool2;
        }
        if ((i & 16384) == 0) {
            this.metrica = null;
        } else {
            this.metrica = list2;
        }
        if ((32768 & i) == 0) {
            this.startapp = null;
        } else {
            this.startapp = bool3;
        }
        if ((65536 & i) == 0) {
            this.adcel = null;
        } else {
            this.adcel = num2;
        }
        if ((131072 & i) == 0) {
            this.ads = null;
        } else {
            this.ads = c2839l;
        }
        if ((262144 & i) == 0) {
            this.subscription = null;
        } else {
            this.subscription = c2839l2;
        }
        if ((524288 & i) == 0) {
            this.tapsense = null;
        } else {
            this.tapsense = c8206l;
        }
        if ((1048576 & i) == 0) {
            this.Signature = null;
        } else {
            this.Signature = c5606l;
        }
        if ((2097152 & i) == 0) {
            this.license = null;
        } else {
            this.license = bool4;
        }
        if ((4194304 & i) == 0) {
            this.pro = null;
        } else {
            this.pro = bool5;
        }
        if ((8388608 & i) == 0) {
            this.ad = null;
        } else {
            this.ad = list3;
        }
        if ((16777216 & i) == 0) {
            this.advert = null;
        } else {
            this.advert = str3;
        }
        if ((33554432 & i) == 0) {
            this.isVip = null;
        } else {
            this.isVip = num3;
        }
        if ((67108864 & i) == 0) {
            this.signatures = null;
        } else {
            this.signatures = str4;
        }
        if ((134217728 & i) == 0) {
            this.premium = null;
        } else {
            this.premium = num4;
        }
        if ((268435456 & i) == 0) {
            this.applovin = null;
        } else {
            this.applovin = bool6;
        }
        if ((536870912 & i) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = list4;
        }
        if ((1073741824 & i) == 0) {
            this.inmobi = null;
        } else {
            this.inmobi = list5;
        }
        if ((i & RecyclerView.UNDEFINED_DURATION) == 0) {
            this.f7138throws = null;
        } else {
            this.f7138throws = str5;
        }
        if ((i2 & 1) == 0) {
            this.f7133package = null;
        } else {
            this.f7133package = list6;
        }
        if ((i2 & 2) == 0) {
            this.f7136synchronized = null;
        } else {
            this.f7136synchronized = enumC3262l;
        }
        if ((i2 & 4) == 0) {
            this.f7135strictfp = null;
        } else {
            this.f7135strictfp = c0296l;
        }
        if ((i2 & 8) == 0) {
            this.f7139volatile = null;
        } else {
            this.f7139volatile = c17830l;
        }
        if ((i2 & 16) == 0) {
            this.f7132native = null;
        } else {
            this.f7132native = str6;
        }
        if ((i2 & 32) == 0) {
            this.f7134private = null;
        } else {
            this.f7134private = c18191l;
        }
        if ((i2 & 64) == 0) {
            this.f7130extends = null;
        } else {
            this.f7130extends = f;
        }
        if ((i2 & 128) == 0) {
            this.f7131for = null;
        } else {
            this.f7131for = list7;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f7137throw = null;
        } else {
            this.f7137throw = f2;
        }
        if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.f7128catch = null;
        } else {
            this.f7128catch = bool7;
        }
        if ((i2 & 1024) == 0) {
            this.f7129else = null;
        } else {
            this.f7129else = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3346l)) {
            return false;
        }
        C3346l c3346l = (C3346l) obj;
        return this.yandex == c3346l.yandex && C10877l.yandex(this.loadAd, c3346l.loadAd) && this.crashlytics == c3346l.crashlytics && AbstractC8576l.yandex(this.amazon, c3346l.amazon) && AbstractC8576l.yandex(this.purchase, c3346l.purchase) && this.billing == c3346l.billing && this.mopub == c3346l.mopub && this.admob == c3346l.admob && this.subs == c3346l.subs && this.isPro == c3346l.isPro && AbstractC8576l.yandex(this.firebase, c3346l.firebase) && AbstractC8576l.yandex(this.smaato, c3346l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c3346l.remoteconfig) && AbstractC8576l.yandex(this.vip, c3346l.vip) && AbstractC8576l.yandex(this.metrica, c3346l.metrica) && AbstractC8576l.yandex(this.startapp, c3346l.startapp) && AbstractC8576l.yandex(this.adcel, c3346l.adcel) && AbstractC8576l.yandex(this.ads, c3346l.ads) && AbstractC8576l.yandex(this.subscription, c3346l.subscription) && AbstractC8576l.yandex(this.tapsense, c3346l.tapsense) && AbstractC8576l.yandex(this.Signature, c3346l.Signature) && AbstractC8576l.yandex(this.license, c3346l.license) && AbstractC8576l.yandex(this.pro, c3346l.pro) && AbstractC8576l.yandex(this.ad, c3346l.ad) && AbstractC8576l.yandex(this.advert, c3346l.advert) && AbstractC8576l.yandex(this.isVip, c3346l.isVip) && AbstractC8576l.yandex(this.signatures, c3346l.signatures) && AbstractC8576l.yandex(this.premium, c3346l.premium) && AbstractC8576l.yandex(this.applovin, c3346l.applovin) && AbstractC8576l.yandex(this.appmetrica, c3346l.appmetrica) && AbstractC8576l.yandex(this.inmobi, c3346l.inmobi) && AbstractC8576l.yandex(this.f7138throws, c3346l.f7138throws) && AbstractC8576l.yandex(this.f7133package, c3346l.f7133package) && this.f7136synchronized == c3346l.f7136synchronized && AbstractC8576l.yandex(this.f7135strictfp, c3346l.f7135strictfp) && AbstractC8576l.yandex(this.f7139volatile, c3346l.f7139volatile) && AbstractC8576l.yandex(this.f7132native, c3346l.f7132native) && AbstractC8576l.yandex(this.f7134private, c3346l.f7134private) && AbstractC8576l.yandex(this.f7130extends, c3346l.f7130extends) && AbstractC8576l.yandex(this.f7131for, c3346l.f7131for) && AbstractC8576l.yandex(this.f7137throw, c3346l.f7137throw) && AbstractC8576l.yandex(this.f7128catch, c3346l.f7128catch) && AbstractC8576l.yandex(this.f7129else, c3346l.f7129else);
    }

    public final int hashCode() {
        int iAdvert = (((((((((AbstractC12589l.advert(AbstractC12589l.advert((this.crashlytics.hashCode() + ((C10877l.loadAd(this.loadAd) + (this.yandex * 31)) * 31)) * 31, 31, this.amazon), 31, this.purchase) + this.billing) * 31) + this.mopub) * 31) + this.admob) * 31) + this.subs) * 31) + this.isPro) * 31;
        Integer num = this.firebase;
        int iHashCode = (iAdvert + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.smaato;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.remoteconfig;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.vip;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list2 = this.metrica;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.startapp;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.adcel;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C2839l c2839l = this.ads;
        int iHashCode8 = (iHashCode7 + (c2839l == null ? 0 : c2839l.hashCode())) * 31;
        C2839l c2839l2 = this.subscription;
        int iHashCode9 = (iHashCode8 + (c2839l2 == null ? 0 : c2839l2.hashCode())) * 31;
        C8206l c8206l = this.tapsense;
        int iHashCode10 = (iHashCode9 + (c8206l == null ? 0 : c8206l.hashCode())) * 31;
        C5606l c5606l = this.Signature;
        int iHashCode11 = (iHashCode10 + (c5606l == null ? 0 : c5606l.hashCode())) * 31;
        Boolean bool4 = this.license;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.pro;
        int iHashCode13 = (iHashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List list3 = this.ad;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.advert;
        int iHashCode15 = (iHashCode14 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.isVip;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.signatures;
        int iHashCode17 = (iHashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.premium;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool6 = this.applovin;
        int iHashCode19 = (iHashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List list4 = this.appmetrica;
        int iHashCode20 = (iHashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.inmobi;
        int iHashCode21 = (iHashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str3 = this.f7138throws;
        int iHashCode22 = (iHashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list6 = this.f7133package;
        int iHashCode23 = (iHashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        EnumC3262l enumC3262l = this.f7136synchronized;
        int iHashCode24 = (iHashCode23 + (enumC3262l == null ? 0 : enumC3262l.hashCode())) * 31;
        C0296l c0296l = this.f7135strictfp;
        int iHashCode25 = (iHashCode24 + (c0296l == null ? 0 : c0296l.hashCode())) * 31;
        C17830l c17830l = this.f7139volatile;
        int iHashCode26 = (iHashCode25 + (c17830l == null ? 0 : c17830l.hashCode())) * 31;
        String str4 = this.f7132native;
        int iHashCode27 = (iHashCode26 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C18191l c18191l = this.f7134private;
        int iHashCode28 = (iHashCode27 + (c18191l == null ? 0 : c18191l.hashCode())) * 31;
        Float f = this.f7130extends;
        int iHashCode29 = (iHashCode28 + (f == null ? 0 : f.hashCode())) * 31;
        List list7 = this.f7131for;
        int iHashCode30 = (iHashCode29 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Float f2 = this.f7137throw;
        int iHashCode31 = (iHashCode30 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool7 = this.f7128catch;
        int iHashCode32 = (iHashCode31 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str5 = this.f7129else;
        return iHashCode32 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylistDto(id=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append((Object) String.valueOf(this.loadAd));
        sb.append(", type=");
        sb.append(this.crashlytics);
        sb.append(", title=");
        sb.append(this.amazon);
        sb.append(", description=");
        sb.append(this.purchase);
        sb.append(", count=");
        sb.append(this.billing);
        sb.append(", followers=");
        sb.append(this.mopub);
        sb.append(", plays=");
        sb.append(this.admob);
        sb.append(", createTime=");
        sb.append(this.subs);
        sb.append(", updateTime=");
        sb.append(this.isPro);
        sb.append(", playlistId=");
        sb.append(this.firebase);
        sb.append(", genres=");
        sb.append(this.smaato);
        sb.append(", isFollowing=");
        sb.append(this.remoteconfig);
        sb.append(", noDiscover=");
        sb.append(this.vip);
        sb.append(", audios=");
        sb.append(this.metrica);
        sb.append(", isCurator=");
        sb.append(this.startapp);
        sb.append(", year=");
        sb.append(this.adcel);
        sb.append(", original=");
        sb.append(this.ads);
        sb.append(", followed=");
        sb.append(this.subscription);
        sb.append(", photo=");
        sb.append(this.tapsense);
        sb.append(", permissions=");
        sb.append(this.Signature);
        sb.append(", subtitleBadge=");
        sb.append(this.license);
        sb.append(", playButton=");
        sb.append(this.pro);
        sb.append(", thumbs=");
        sb.append(this.ad);
        sb.append(", accessKey=");
        sb.append(this.advert);
        sb.append(", umaAlbumId=");
        sb.append(this.isVip);
        sb.append(", subtitle=");
        sb.append(this.signatures);
        sb.append(", originalYear=");
        sb.append(this.premium);
        sb.append(", isExplicit=");
        sb.append(this.applovin);
        sb.append(", artists=");
        sb.append(this.appmetrica);
        sb.append(", mainArtists=");
        sb.append(this.inmobi);
        sb.append(", mainArtist=");
        sb.append(this.f7138throws);
        sb.append(", featuredArtists=");
        sb.append(this.f7133package);
        sb.append(", albumType=");
        sb.append(this.f7136synchronized);
        sb.append(", meta=");
        sb.append(this.f7135strictfp);
        sb.append(", restriction=");
        sb.append(this.f7139volatile);
        sb.append(", trackCode=");
        sb.append(this.f7132native);
        sb.append(", audioChartInfo=");
        sb.append(this.f7134private);
        sb.append(", matchScore=");
        sb.append(this.f7130extends);
        sb.append(", actions=");
        sb.append(this.f7131for);
        sb.append(", audiosTotalFileSize=");
        sb.append(this.f7137throw);
        sb.append(", exclusive=");
        sb.append(this.f7128catch);
        sb.append(", icon=");
        return AbstractC2812l.tapsense(sb, this.f7129else, ')');
    }
}
