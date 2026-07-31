package defpackage;

/* JADX INFO: renamed from: lٍٍٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9675l {
    public final Integer admob;
    public final Integer amazon;
    public final CharSequence billing;
    public final Integer crashlytics;
    public final Integer firebase;
    public final Integer isPro;
    public final Integer loadAd;
    public final Integer mopub;
    public boolean purchase;
    public final Integer remoteconfig;
    public final Integer smaato;
    public final Integer subs;
    public final Integer vip;
    public final Integer yandex;

    public C9675l(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i) {
        num = (i & 1) != 0 ? null : num;
        Integer num13 = (i & 2) != 0 ? null : num2;
        Integer num14 = (i & 4) != 0 ? null : num3;
        Integer num15 = (i & 8) != 0 ? null : num4;
        String str2 = (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? "" : str;
        Integer num16 = (i & 1024) != 0 ? null : num5;
        Integer num17 = (i & 2048) != 0 ? null : num6;
        Integer num18 = (i & 4096) != 0 ? null : num7;
        Integer num19 = (i & 8192) != 0 ? null : num8;
        Integer num20 = (32768 & i) != 0 ? null : num10;
        Integer num21 = (65536 & i) != 0 ? null : num11;
        Integer num22 = (i & 131072) == 0 ? num12 : null;
        this.yandex = num;
        this.loadAd = num13;
        this.crashlytics = num14;
        this.amazon = num15;
        this.purchase = false;
        this.billing = str2;
        this.mopub = num16;
        this.admob = num17;
        this.subs = num18;
        this.isPro = num19;
        this.firebase = num9;
        this.smaato = num20;
        this.remoteconfig = num21;
        this.vip = num22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9675l)) {
            return false;
        }
        C9675l c9675l = (C9675l) obj;
        return AbstractC8576l.yandex(this.yandex, c9675l.yandex) && AbstractC8576l.yandex(this.loadAd, c9675l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c9675l.crashlytics) && AbstractC8576l.yandex(this.amazon, c9675l.amazon) && this.purchase == c9675l.purchase && this.billing.equals(c9675l.billing) && AbstractC8576l.yandex(this.mopub, c9675l.mopub) && AbstractC8576l.yandex(this.admob, c9675l.admob) && AbstractC8576l.yandex(this.subs, c9675l.subs) && AbstractC8576l.yandex(this.isPro, c9675l.isPro) && AbstractC8576l.yandex(this.firebase, c9675l.firebase) && AbstractC8576l.yandex(this.smaato, c9675l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c9675l.remoteconfig) && AbstractC8576l.yandex(this.vip, c9675l.vip);
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.loadAd;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.amazon;
        int iHashCode4 = (this.billing.hashCode() + ((((iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 28629151) + (this.purchase ? 1231 : 1237)) * 31)) * 31;
        Integer num5 = this.mopub;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.admob;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.subs;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.isPro;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.firebase;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.smaato;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.remoteconfig;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.vip;
        return iHashCode11 + (num12 != null ? num12.hashCode() : 0);
    }

    public final String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.yandex + ", drawableEndRes=" + this.loadAd + ", drawableBottomRes=" + this.crashlytics + ", drawableTopRes=" + this.amazon + ", drawableStart=null, drawableEnd=null, drawableBottom=null, drawableTop=null, isRtlLayout=" + this.purchase + ", contentDescription=" + ((Object) this.billing) + ", compoundDrawablePadding=" + this.mopub + ", iconWidth=" + this.admob + ", iconHeight=" + this.subs + ", compoundDrawablePaddingRes=" + this.isPro + ", tintColor=" + this.firebase + ", widthRes=" + this.smaato + ", heightRes=" + this.remoteconfig + ", squareSizeRes=" + this.vip + ")";
    }
}
