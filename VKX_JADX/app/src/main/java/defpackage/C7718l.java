package defpackage;

import androidx.work.OverwritingInputMerger;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7718l {
    public static final C10754l isVip;
    public final long Signature;
    public String ad;
    public boolean adcel;
    public final long admob;
    public final int ads;
    public final Boolean advert;
    public final String amazon;
    public final C4279l billing;
    public final String crashlytics;
    public final int firebase;
    public C13152l isPro;
    public final int license;
    public EnumC9176l loadAd;
    public final long metrica;
    public long mopub;
    public final int pro;
    public C4279l purchase;
    public final long remoteconfig;
    public final int smaato;
    public final long startapp;
    public final long subs;
    public final int subscription;
    public final int tapsense;
    public long vip;
    public final String yandex;

    static {
        C14513l.applovin("WorkSpec");
        isVip = new C10754l(16);
    }

    public /* synthetic */ C7718l(String str, EnumC9176l enumC9176l, String str2, String str3, C4279l c4279l, C4279l c4279l2, long j, long j2, long j3, C13152l c13152l, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool, int i7) {
        this(str, (i7 & 2) != 0 ? EnumC9176l.f18878l : enumC9176l, str2, (i7 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i7 & 16) != 0 ? C4279l.loadAd : c4279l, (i7 & 32) != 0 ? C4279l.loadAd : c4279l2, (i7 & 64) != 0 ? 0L : j, (i7 & 128) != 0 ? 0L : j2, (i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0L : j3, (i7 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? C13152l.isPro : c13152l, (i7 & 1024) != 0 ? 0 : i, (i7 & 2048) != 0 ? 1 : i2, (i7 & 4096) != 0 ? 30000L : j4, (i7 & 8192) != 0 ? -1L : j5, (i7 & 16384) != 0 ? 0L : j6, (32768 & i7) != 0 ? -1L : j7, (65536 & i7) != 0 ? false : z, (131072 & i7) != 0 ? 1 : i3, (262144 & i7) != 0 ? 0 : i4, 0, (1048576 & i7) != 0 ? Long.MAX_VALUE : j8, (2097152 & i7) != 0 ? 0 : i5, (4194304 & i7) != 0 ? -256 : i6, (8388608 & i7) != 0 ? null : str4, (i7 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static C7718l loadAd(C7718l c7718l, String str, C4279l c4279l) {
        String str2 = c7718l.yandex;
        EnumC9176l enumC9176l = c7718l.loadAd;
        String str3 = c7718l.amazon;
        C4279l c4279l2 = c7718l.billing;
        long j = c7718l.mopub;
        long j2 = c7718l.admob;
        long j3 = c7718l.subs;
        C13152l c13152l = c7718l.isPro;
        int i = c7718l.firebase;
        int i2 = c7718l.smaato;
        long j4 = c7718l.remoteconfig;
        long j5 = c7718l.vip;
        long j6 = c7718l.metrica;
        long j7 = c7718l.startapp;
        boolean z = c7718l.adcel;
        int i3 = c7718l.ads;
        int i4 = c7718l.subscription;
        int i5 = c7718l.tapsense;
        long j8 = c7718l.Signature;
        int i6 = c7718l.license;
        int i7 = c7718l.pro;
        String str4 = c7718l.ad;
        Boolean bool = c7718l.advert;
        c7718l.getClass();
        return new C7718l(str2, enumC9176l, str, str3, c4279l, c4279l2, j, j2, j3, c13152l, i, i2, j4, j5, j6, j7, z, i3, i4, i5, j8, i6, i7, str4, bool);
    }

    public final boolean crashlytics() {
        return this.admob != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7718l)) {
            return false;
        }
        C7718l c7718l = (C7718l) obj;
        return AbstractC8576l.yandex(this.yandex, c7718l.yandex) && this.loadAd == c7718l.loadAd && AbstractC8576l.yandex(this.crashlytics, c7718l.crashlytics) && AbstractC8576l.yandex(this.amazon, c7718l.amazon) && AbstractC8576l.yandex(this.purchase, c7718l.purchase) && AbstractC8576l.yandex(this.billing, c7718l.billing) && this.mopub == c7718l.mopub && this.admob == c7718l.admob && this.subs == c7718l.subs && AbstractC8576l.yandex(this.isPro, c7718l.isPro) && this.firebase == c7718l.firebase && this.smaato == c7718l.smaato && this.remoteconfig == c7718l.remoteconfig && this.vip == c7718l.vip && this.metrica == c7718l.metrica && this.startapp == c7718l.startapp && this.adcel == c7718l.adcel && this.ads == c7718l.ads && this.subscription == c7718l.subscription && this.tapsense == c7718l.tapsense && this.Signature == c7718l.Signature && this.license == c7718l.license && this.pro == c7718l.pro && AbstractC8576l.yandex(this.ad, c7718l.ad) && AbstractC8576l.yandex(this.advert, c7718l.advert);
    }

    public final int hashCode() {
        int iHashCode = (this.billing.hashCode() + ((this.purchase.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31, 31, this.crashlytics), 31, this.amazon)) * 31)) * 31;
        long j = this.mopub;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.admob;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.subs;
        int iFirebase = AbstractC0653l.firebase(this.smaato, (((this.isPro.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.firebase) * 31, 31);
        long j4 = this.remoteconfig;
        int i3 = (iFirebase + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.vip;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.metrica;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.startapp;
        int iFirebase2 = (((AbstractC0653l.firebase(this.ads, (((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.adcel ? 1231 : 1237)) * 31, 31) + this.subscription) * 31) + this.tapsense) * 31;
        long j8 = this.Signature;
        int i6 = (((((iFirebase2 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.license) * 31) + this.pro) * 31;
        String str = this.ad;
        int iHashCode2 = (i6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.advert;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("{WorkSpec: "), this.yandex, '}');
    }

    public final long yandex() {
        return AbstractC15096l.loadAd(this.loadAd == EnumC9176l.f18878l && this.firebase > 0, this.firebase, this.smaato, this.remoteconfig, this.vip, this.subscription, crashlytics(), this.mopub, this.subs, this.admob, this.Signature);
    }

    public C7718l(String str, EnumC9176l enumC9176l, String str2, String str3, C4279l c4279l, C4279l c4279l2, long j, long j2, long j3, C13152l c13152l, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, int i5, long j8, int i6, int i7, String str4, Boolean bool) {
        this.yandex = str;
        this.loadAd = enumC9176l;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = c4279l;
        this.billing = c4279l2;
        this.mopub = j;
        this.admob = j2;
        this.subs = j3;
        this.isPro = c13152l;
        this.firebase = i;
        this.smaato = i2;
        this.remoteconfig = j4;
        this.vip = j5;
        this.metrica = j6;
        this.startapp = j7;
        this.adcel = z;
        this.ads = i3;
        this.subscription = i4;
        this.tapsense = i5;
        this.Signature = j8;
        this.license = i6;
        this.pro = i7;
        this.ad = str4;
        this.advert = bool;
    }
}
