package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْؗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13153l {
    public final AbstractC9544l admob;
    public final long amazon;
    public final List billing;
    public final float crashlytics;
    public final int isPro;
    public final float loadAd;
    public final float mopub;
    public final long purchase;
    public final C10417l subs;
    public final float yandex;

    public C13153l(float f, float f2, float f3, long j, long j2, List list, float f4, AbstractC9544l abstractC9544l, C10417l c10417l, int i) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = j;
        this.purchase = j2;
        this.billing = list;
        this.mopub = f4;
        this.admob = abstractC9544l;
        this.subs = c10417l;
        this.isPro = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13153l)) {
            return false;
        }
        C13153l c13153l = (C13153l) obj;
        return C14467l.loadAd(this.yandex, c13153l.yandex) && Float.compare(this.loadAd, c13153l.loadAd) == 0 && Float.compare(this.crashlytics, c13153l.crashlytics) == 0 && C14174l.loadAd(this.amazon, c13153l.amazon) && C1187l.loadAd(this.purchase, c13153l.purchase) && this.billing.equals(c13153l.billing) && Float.compare(this.mopub, c13153l.mopub) == 0 && AbstractC8576l.yandex(this.admob, c13153l.admob) && AbstractC8576l.yandex(this.subs, c13153l.subs) && this.isPro == c13153l.isPro;
    }

    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
        long j = this.amazon;
        int iMopub2 = AbstractC9029l.mopub(AbstractC14814l.admob((C1187l.mopub(this.purchase) + ((((int) (j ^ (j >>> 32))) + iMopub) * 31)) * 31, 31, this.billing), this.mopub, 31);
        AbstractC9544l abstractC9544l = this.admob;
        int iHashCode = (iMopub2 + (abstractC9544l == null ? 0 : abstractC9544l.hashCode())) * 31;
        C10417l c10417l = this.subs;
        return ((iHashCode + (c10417l != null ? c10417l.hashCode() : 0)) * 31) + this.isPro;
    }

    public final String toString() {
        return "RenderEffectParams(blurRadius=" + C14467l.crashlytics(this.yandex) + ", noiseFactor=" + this.loadAd + ", scale=" + this.crashlytics + ", contentSize=" + C14174l.subs(this.amazon) + ", contentOffset=" + C1187l.firebase(this.purchase) + ", tints=" + this.billing + ", tintAlphaModulate=" + this.mopub + ", mask=" + this.admob + ", progressive=" + this.subs + ", blurTileMode=" + AbstractC14770l.metrica(this.isPro) + ")";
    }
}
