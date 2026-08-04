package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C2757l {
    public static final C18443l Companion = new C18443l();

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final InterfaceC1220l[] f5965for;
    public final EnumC0836l Signature;
    public final List ad;
    public final C12787l adcel;
    public final Boolean admob;
    public final Integer ads;
    public final String advert;
    public final String amazon;
    public final C18191l applovin;
    public final String appmetrica;
    public final String billing;
    public final long crashlytics;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final String f5966extends;
    public final String firebase;
    public final Boolean inmobi;
    public final String isPro;
    public final Integer isVip;
    public final EnumC16114l license;
    public final int loadAd;
    public final EnumC13459l metrica;
    public final Boolean mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final List f5967native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Boolean f5968package;
    public final C14913l premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Boolean f5969private;
    public final List pro;
    public final int purchase;
    public final Integer remoteconfig;
    public final String signatures;
    public final Integer smaato;
    public final EnumC17046l startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final Boolean f5970strictfp;
    public final Boolean subs;
    public final Integer subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final Boolean f5971synchronized;
    public final EnumC2939l tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Boolean f5972throws;
    public final Boolean vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Boolean f5973volatile;
    public final String yandex;

    static {
        int i = 1;
        f5965for = new InterfaceC1220l[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C1011l(i)), AbstractC9968l.crashlytics(2, new C0063l(0)), null, null, null, AbstractC9968l.crashlytics(2, new C0063l(i)), AbstractC9968l.crashlytics(2, new C0063l(2)), AbstractC9968l.crashlytics(2, new C0063l(3)), AbstractC9968l.crashlytics(2, new C0063l(4)), AbstractC9968l.crashlytics(2, new C0063l(5)), null, null, null, null, null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C0063l(6)), null, null};
    }

    public /* synthetic */ C2757l(int i, int i2, String str, int i3, C10877l c10877l, String str2, int i4, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Integer num, Integer num2, Boolean bool4, EnumC13459l enumC13459l, EnumC17046l enumC17046l, C12787l c12787l, Integer num3, Integer num4, EnumC2939l enumC2939l, EnumC0836l enumC0836l, EnumC16114l enumC16114l, List list, List list2, String str6, Integer num5, String str7, C14913l c14913l, C18191l c18191l, String str8, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, List list3, Boolean bool11, String str9) {
        if (31 != (i & 31)) {
            AbstractC11036l.subs(new int[]{i, i2}, new int[]{31, 0}, C13612l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i3;
        this.crashlytics = c10877l.yandex;
        this.amazon = str2;
        this.purchase = i4;
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str3;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = bool;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = bool2;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = bool3;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = null;
        } else {
            this.isPro = str4;
        }
        if ((i & 1024) == 0) {
            this.firebase = null;
        } else {
            this.firebase = str5;
        }
        if ((i & 2048) == 0) {
            this.smaato = null;
        } else {
            this.smaato = num;
        }
        if ((i & 4096) == 0) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = num2;
        }
        if ((i & 8192) == 0) {
            this.vip = null;
        } else {
            this.vip = bool4;
        }
        if ((i & 16384) == 0) {
            this.metrica = null;
        } else {
            this.metrica = enumC13459l;
        }
        if ((32768 & i) == 0) {
            this.startapp = null;
        } else {
            this.startapp = enumC17046l;
        }
        if ((65536 & i) == 0) {
            this.adcel = null;
        } else {
            this.adcel = c12787l;
        }
        if ((131072 & i) == 0) {
            this.ads = null;
        } else {
            this.ads = num3;
        }
        if ((262144 & i) == 0) {
            this.subscription = null;
        } else {
            this.subscription = num4;
        }
        if ((524288 & i) == 0) {
            this.tapsense = null;
        } else {
            this.tapsense = enumC2939l;
        }
        if ((1048576 & i) == 0) {
            this.Signature = null;
        } else {
            this.Signature = enumC0836l;
        }
        if ((2097152 & i) == 0) {
            this.license = null;
        } else {
            this.license = enumC16114l;
        }
        if ((4194304 & i) == 0) {
            this.pro = null;
        } else {
            this.pro = list;
        }
        if ((8388608 & i) == 0) {
            this.ad = null;
        } else {
            this.ad = list2;
        }
        if ((16777216 & i) == 0) {
            this.advert = null;
        } else {
            this.advert = str6;
        }
        if ((33554432 & i) == 0) {
            this.isVip = null;
        } else {
            this.isVip = num5;
        }
        if ((67108864 & i) == 0) {
            this.signatures = null;
        } else {
            this.signatures = str7;
        }
        if ((134217728 & i) == 0) {
            this.premium = null;
        } else {
            this.premium = c14913l;
        }
        if ((268435456 & i) == 0) {
            this.applovin = null;
        } else {
            this.applovin = c18191l;
        }
        if ((536870912 & i) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str8;
        }
        if ((1073741824 & i) == 0) {
            this.inmobi = null;
        } else {
            this.inmobi = bool5;
        }
        if ((i & RecyclerView.UNDEFINED_DURATION) == 0) {
            this.f5972throws = null;
        } else {
            this.f5972throws = bool6;
        }
        if ((i2 & 1) == 0) {
            this.f5968package = null;
        } else {
            this.f5968package = bool7;
        }
        if ((i2 & 2) == 0) {
            this.f5971synchronized = null;
        } else {
            this.f5971synchronized = bool8;
        }
        if ((i2 & 4) == 0) {
            this.f5970strictfp = null;
        } else {
            this.f5970strictfp = bool9;
        }
        if ((i2 & 8) == 0) {
            this.f5973volatile = null;
        } else {
            this.f5973volatile = bool10;
        }
        if ((i2 & 16) == 0) {
            this.f5967native = null;
        } else {
            this.f5967native = list3;
        }
        if ((i2 & 32) == 0) {
            this.f5969private = null;
        } else {
            this.f5969private = bool11;
        }
        if ((i2 & 64) == 0) {
            this.f5966extends = null;
        } else {
            this.f5966extends = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2757l)) {
            return false;
        }
        C2757l c2757l = (C2757l) obj;
        return AbstractC8576l.yandex(this.yandex, c2757l.yandex) && this.loadAd == c2757l.loadAd && C10877l.yandex(this.crashlytics, c2757l.crashlytics) && AbstractC8576l.yandex(this.amazon, c2757l.amazon) && this.purchase == c2757l.purchase && AbstractC8576l.yandex(this.billing, c2757l.billing) && AbstractC8576l.yandex(this.mopub, c2757l.mopub) && AbstractC8576l.yandex(this.admob, c2757l.admob) && AbstractC8576l.yandex(this.subs, c2757l.subs) && AbstractC8576l.yandex(this.isPro, c2757l.isPro) && AbstractC8576l.yandex(this.firebase, c2757l.firebase) && AbstractC8576l.yandex(this.smaato, c2757l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c2757l.remoteconfig) && AbstractC8576l.yandex(this.vip, c2757l.vip) && this.metrica == c2757l.metrica && this.startapp == c2757l.startapp && AbstractC8576l.yandex(this.adcel, c2757l.adcel) && AbstractC8576l.yandex(this.ads, c2757l.ads) && AbstractC8576l.yandex(this.subscription, c2757l.subscription) && this.tapsense == c2757l.tapsense && this.Signature == c2757l.Signature && this.license == c2757l.license && AbstractC8576l.yandex(this.pro, c2757l.pro) && AbstractC8576l.yandex(this.ad, c2757l.ad) && AbstractC8576l.yandex(this.advert, c2757l.advert) && AbstractC8576l.yandex(this.isVip, c2757l.isVip) && AbstractC8576l.yandex(this.signatures, c2757l.signatures) && AbstractC8576l.yandex(this.premium, c2757l.premium) && AbstractC8576l.yandex(this.applovin, c2757l.applovin) && AbstractC8576l.yandex(this.appmetrica, c2757l.appmetrica) && AbstractC8576l.yandex(this.inmobi, c2757l.inmobi) && AbstractC8576l.yandex(this.f5972throws, c2757l.f5972throws) && AbstractC8576l.yandex(this.f5968package, c2757l.f5968package) && AbstractC8576l.yandex(this.f5971synchronized, c2757l.f5971synchronized) && AbstractC8576l.yandex(this.f5970strictfp, c2757l.f5970strictfp) && AbstractC8576l.yandex(this.f5973volatile, c2757l.f5973volatile) && AbstractC8576l.yandex(this.f5967native, c2757l.f5967native) && AbstractC8576l.yandex(this.f5969private, c2757l.f5969private) && AbstractC8576l.yandex(this.f5966extends, c2757l.f5966extends);
    }

    public final int hashCode() {
        int iAdvert = (AbstractC12589l.advert((C10877l.loadAd(this.crashlytics) + (((this.yandex.hashCode() * 31) + this.loadAd) * 31)) * 31, 31, this.amazon) + this.purchase) * 31;
        String str = this.billing;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.mopub;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.admob;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.subs;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.isPro;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firebase;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.smaato;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.remoteconfig;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.vip;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        EnumC13459l enumC13459l = this.metrica;
        int iHashCode10 = (iHashCode9 + (enumC13459l == null ? 0 : enumC13459l.hashCode())) * 31;
        EnumC17046l enumC17046l = this.startapp;
        int iHashCode11 = (iHashCode10 + (enumC17046l == null ? 0 : enumC17046l.hashCode())) * 31;
        C12787l c12787l = this.adcel;
        int iHashCode12 = (iHashCode11 + (c12787l == null ? 0 : c12787l.hashCode())) * 31;
        Integer num3 = this.ads;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.subscription;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        EnumC2939l enumC2939l = this.tapsense;
        int iHashCode15 = (iHashCode14 + (enumC2939l == null ? 0 : enumC2939l.hashCode())) * 31;
        EnumC0836l enumC0836l = this.Signature;
        int iHashCode16 = (iHashCode15 + (enumC0836l == null ? 0 : enumC0836l.hashCode())) * 31;
        EnumC16114l enumC16114l = this.license;
        int iHashCode17 = (iHashCode16 + (enumC16114l == null ? 0 : enumC16114l.hashCode())) * 31;
        List list = this.pro;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.ad;
        int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.advert;
        int iHashCode20 = (iHashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.isVip;
        int iHashCode21 = (iHashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str5 = this.signatures;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C14913l c14913l = this.premium;
        int iHashCode23 = (iHashCode22 + (c14913l == null ? 0 : c14913l.hashCode())) * 31;
        C18191l c18191l = this.applovin;
        int iHashCode24 = (iHashCode23 + (c18191l == null ? 0 : c18191l.hashCode())) * 31;
        String str6 = this.appmetrica;
        int iHashCode25 = (iHashCode24 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool5 = this.inmobi;
        int iHashCode26 = (iHashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f5972throws;
        int iHashCode27 = (iHashCode26 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f5968package;
        int iHashCode28 = (iHashCode27 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f5971synchronized;
        int iHashCode29 = (iHashCode28 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f5970strictfp;
        int iHashCode30 = (iHashCode29 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.f5973volatile;
        int iHashCode31 = (iHashCode30 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        List list3 = this.f5967native;
        int iHashCode32 = (iHashCode31 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool11 = this.f5969private;
        int iHashCode33 = (iHashCode32 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str7 = this.f5966extends;
        return iHashCode33 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAudioDto(artist=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", ownerId=");
        sb.append((Object) String.valueOf(this.crashlytics));
        sb.append(", title=");
        sb.append(this.amazon);
        sb.append(", duration=");
        sb.append(this.purchase);
        sb.append(", accessKey=");
        sb.append(this.billing);
        sb.append(", isExplicit=");
        sb.append(this.mopub);
        sb.append(", isFocusTrack=");
        sb.append(this.admob);
        sb.append(", isLicensed=");
        sb.append(this.subs);
        sb.append(", trackCode=");
        sb.append(this.isPro);
        sb.append(", url=");
        sb.append(this.firebase);
        sb.append(", date=");
        sb.append(this.smaato);
        sb.append(", albumId=");
        sb.append(this.remoteconfig);
        sb.append(", hasLyrics=");
        sb.append(this.vip);
        sb.append(", genreId=");
        sb.append(this.metrica);
        sb.append(", noSearch=");
        sb.append(this.startapp);
        sb.append(", album=");
        sb.append(this.adcel);
        sb.append(", releaseId=");
        sb.append(this.ads);
        sb.append(", trackId=");
        sb.append(this.subscription);
        sb.append(", mstcpType=");
        sb.append(this.tapsense);
        sb.append(", trackGenreId=");
        sb.append(this.Signature);
        sb.append(", contentRestricted=");
        sb.append(this.license);
        sb.append(", mainArtists=");
        sb.append(this.pro);
        sb.append(", featuredArtists=");
        sb.append(this.ad);
        sb.append(", subtitle=");
        sb.append(this.advert);
        sb.append(", albumPartNumber=");
        sb.append(this.isVip);
        sb.append(", performer=");
        sb.append(this.signatures);
        sb.append(", podcastInfo=");
        sb.append(this.premium);
        sb.append(", audioChartInfo=");
        sb.append(this.applovin);
        sb.append(", originalSoundVideoId=");
        sb.append(this.appmetrica);
        sb.append(", shortVideosAllowed=");
        sb.append(this.inmobi);
        sb.append(", storiesAllowed=");
        sb.append(this.f5972throws);
        sb.append(", storiesCoverAllowed=");
        sb.append(this.f5968package);
        sb.append(", inClipsFavoriteAllowed=");
        sb.append(this.f5971synchronized);
        sb.append(", inClipsFavorite=");
        sb.append(this.f5970strictfp);
        sb.append(", dmcaBlocked=");
        sb.append(this.f5973volatile);
        sb.append(", kwsSkip=");
        sb.append(this.f5967native);
        sb.append(", isOfficial=");
        sb.append(this.f5969private);
        sb.append(", releaseAudioId=");
        return AbstractC2812l.tapsense(sb, this.f5966extends, ')');
    }

    public C2757l(String str, int i, long j, String str2, C12787l c12787l) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = j;
        this.amazon = str2;
        this.purchase = 0;
        this.billing = null;
        this.mopub = null;
        this.admob = null;
        this.subs = null;
        this.isPro = null;
        this.firebase = null;
        this.smaato = null;
        this.remoteconfig = null;
        this.vip = null;
        this.metrica = null;
        this.startapp = null;
        this.adcel = c12787l;
        this.ads = null;
        this.subscription = null;
        this.tapsense = null;
        this.Signature = null;
        this.license = null;
        this.pro = null;
        this.ad = null;
        this.advert = null;
        this.isVip = null;
        this.signatures = null;
        this.premium = null;
        this.applovin = null;
        this.appmetrica = null;
        this.inmobi = null;
        this.f5972throws = null;
        this.f5968package = null;
        this.f5971synchronized = null;
        this.f5970strictfp = null;
        this.f5973volatile = null;
        this.f5967native = null;
        this.f5969private = null;
        this.f5966extends = null;
    }
}
