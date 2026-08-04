package defpackage;

/* JADX INFO: renamed from: lؘؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5507l {
    public final C6952l amazon;
    public final Object billing;
    public final long crashlytics;
    public final long loadAd;
    public final C3640l purchase;
    public final int yandex;

    public C5507l(int i, long j, long j2, C6952l c6952l, C3640l c3640l, Object obj) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = j2;
        this.amazon = c6952l;
        this.purchase = c3640l;
        this.billing = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5507l)) {
            return false;
        }
        C5507l c5507l = (C5507l) obj;
        return this.yandex == c5507l.yandex && this.loadAd == c5507l.loadAd && this.crashlytics == c5507l.crashlytics && AbstractC8576l.yandex(this.amazon, c5507l.amazon) && AbstractC8576l.yandex(this.purchase, c5507l.purchase) && AbstractC8576l.yandex(this.billing, c5507l.billing);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.crashlytics;
        int iHashCode = (this.amazon.yandex.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        C3640l c3640l = this.purchase;
        int iHashCode2 = (iHashCode + (c3640l == null ? 0 : c3640l.f7619l.hashCode())) * 31;
        Object obj = this.billing;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.yandex + ", requestMillis=" + this.loadAd + ", responseMillis=" + this.crashlytics + ", headers=" + this.amazon + ", body=" + this.purchase + ", delegate=" + this.billing + ")";
    }
}
