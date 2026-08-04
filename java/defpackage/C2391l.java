package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٟؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C2391l {
    public static final C8793l Companion = new C8793l();
    public static final InterfaceC1220l[] ad = {AbstractC9968l.crashlytics(2, new C0063l(10)), null, AbstractC9968l.crashlytics(2, new C0063l(11)), AbstractC9968l.crashlytics(2, new C0063l(12)), null, null, AbstractC9968l.crashlytics(2, new C0063l(13)), null, null, AbstractC9968l.crashlytics(2, new C0063l(14)), null, null, null, null, null, AbstractC9968l.crashlytics(2, new C0063l(15)), null, null, null, null, null, AbstractC9968l.crashlytics(2, new C0063l(16)), null};
    public final String Signature;
    public final int adcel;
    public final int admob;
    public final C6612l ads;
    public final List amazon;
    public final String billing;
    public final List crashlytics;
    public final int firebase;
    public final List isPro;
    public final List license;
    public final String loadAd;
    public final Integer metrica;
    public final List mopub;
    public final int pro;
    public final String purchase;
    public final boolean remoteconfig;
    public final boolean smaato;
    public final List startapp;
    public final long subs;
    public final int subscription;
    public final String tapsense;
    public final C0249l vip;
    public final EnumC7595l yandex;

    public /* synthetic */ C2391l(int i, EnumC7595l enumC7595l, String str, List list, List list2, String str2, String str3, List list3, int i2, long j, List list4, int i3, boolean z, boolean z2, C0249l c0249l, Integer num, List list5, int i4, C6612l c6612l, int i5, String str4, String str5, List list6, int i6) {
        if (132481 != (i & 132481)) {
            AbstractC11036l.isPro(i, 132481, C15861l.yandex.purchase());
            throw null;
        }
        this.yandex = enumC7595l;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str;
        }
        int i7 = i & 4;
        C2580l c2580l = C2580l.f5619l;
        if (i7 == 0) {
            this.crashlytics = c2580l;
        } else {
            this.crashlytics = list;
        }
        if ((i & 8) == 0) {
            this.amazon = c2580l;
        } else {
            this.amazon = list2;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str2;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str3;
        }
        if ((i & 64) == 0) {
            this.mopub = c2580l;
        } else {
            this.mopub = list3;
        }
        this.admob = i2;
        this.subs = j;
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = c2580l;
        } else {
            this.isPro = list4;
        }
        this.firebase = i3;
        if ((i & 2048) == 0) {
            this.smaato = false;
        } else {
            this.smaato = z;
        }
        if ((i & 4096) == 0) {
            this.remoteconfig = false;
        } else {
            this.remoteconfig = z2;
        }
        if ((i & 8192) == 0) {
            this.vip = null;
        } else {
            this.vip = c0249l;
        }
        if ((i & 16384) == 0) {
            this.metrica = null;
        } else {
            this.metrica = num;
        }
        if ((32768 & i) == 0) {
            this.startapp = c2580l;
        } else {
            this.startapp = list5;
        }
        if ((65536 & i) == 0) {
            this.adcel = 0;
        } else {
            this.adcel = i4;
        }
        this.ads = c6612l;
        if ((262144 & i) == 0) {
            this.subscription = 0;
        } else {
            this.subscription = i5;
        }
        if ((524288 & i) == 0) {
            this.tapsense = null;
        } else {
            this.tapsense = str4;
        }
        if ((1048576 & i) == 0) {
            this.Signature = null;
        } else {
            this.Signature = str5;
        }
        if ((2097152 & i) == 0) {
            this.license = c2580l;
        } else {
            this.license = list6;
        }
        if ((i & 4194304) == 0) {
            this.pro = 0;
        } else {
            this.pro = i6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2391l)) {
            return false;
        }
        C2391l c2391l = (C2391l) obj;
        return this.yandex == c2391l.yandex && AbstractC8576l.yandex(this.loadAd, c2391l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c2391l.crashlytics) && AbstractC8576l.yandex(this.amazon, c2391l.amazon) && AbstractC8576l.yandex(this.purchase, c2391l.purchase) && AbstractC8576l.yandex(this.billing, c2391l.billing) && AbstractC8576l.yandex(this.mopub, c2391l.mopub) && this.admob == c2391l.admob && this.subs == c2391l.subs && AbstractC8576l.yandex(this.isPro, c2391l.isPro) && this.firebase == c2391l.firebase && this.smaato == c2391l.smaato && this.remoteconfig == c2391l.remoteconfig && AbstractC8576l.yandex(this.vip, c2391l.vip) && AbstractC8576l.yandex(this.metrica, c2391l.metrica) && AbstractC8576l.yandex(this.startapp, c2391l.startapp) && this.adcel == c2391l.adcel && AbstractC8576l.yandex(this.ads, c2391l.ads) && this.subscription == c2391l.subscription && AbstractC8576l.yandex(this.tapsense, c2391l.tapsense) && AbstractC8576l.yandex(this.Signature, c2391l.Signature) && AbstractC8576l.yandex(this.license, c2391l.license) && this.pro == c2391l.pro;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iAdmob = AbstractC14814l.admob(AbstractC14814l.admob((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.crashlytics), 31, this.amazon);
        String str2 = this.purchase;
        int iHashCode2 = (iAdmob + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billing;
        int iAdmob2 = (AbstractC14814l.admob((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.mopub) + this.admob) * 31;
        long j = this.subs;
        int iAdmob3 = (((((AbstractC14814l.admob((iAdmob2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.isPro) + this.firebase) * 31) + (this.smaato ? 1231 : 1237)) * 31) + (this.remoteconfig ? 1231 : 1237)) * 31;
        C0249l c0249l = this.vip;
        int iHashCode3 = (iAdmob3 + (c0249l == null ? 0 : c0249l.hashCode())) * 31;
        Integer num = this.metrica;
        int iHashCode4 = (((this.ads.hashCode() + ((AbstractC14814l.admob((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.startapp) + this.adcel) * 31)) * 31) + this.subscription) * 31;
        String str4 = this.tapsense;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.Signature;
        return AbstractC14814l.admob((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.license) + this.pro;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookDto(accessStatus=");
        sb.append(this.yandex);
        sb.append(", annotation=");
        sb.append(this.loadAd);
        sb.append(", authors=");
        sb.append(this.crashlytics);
        sb.append(", chapters=");
        sb.append(this.amazon);
        sb.append(", code=");
        sb.append(this.purchase);
        sb.append(", copyright=");
        sb.append(this.billing);
        sb.append(", cover=");
        sb.append(this.mopub);
        sb.append(", duration=");
        sb.append(this.admob);
        sb.append(", fileSize=");
        sb.append(this.subs);
        sb.append(", genres=");
        sb.append(this.isPro);
        sb.append(", id=");
        sb.append(this.firebase);
        sb.append(", inFavorites=");
        sb.append(this.smaato);
        sb.append(", isExplicit=");
        sb.append(this.remoteconfig);
        sb.append(", mainGenre=");
        sb.append(this.vip);
        sb.append(", minimumAge=");
        sb.append(this.metrica);
        sb.append(", narrators=");
        sb.append(this.startapp);
        sb.append(", progressPercentage=");
        sb.append(this.adcel);
        sb.append(", publisher=");
        sb.append(this.ads);
        sb.append(", releaseDate=");
        sb.append(this.subscription);
        sb.append(", title=");
        sb.append(this.tapsense);
        sb.append(", trackCode=");
        sb.append(this.Signature);
        sb.append(", translators=");
        sb.append(this.license);
        sb.append(", updatedAt=");
        return AbstractC0653l.adcel(sb, this.pro, ')');
    }
}
