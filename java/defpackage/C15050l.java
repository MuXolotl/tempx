package defpackage;

/* JADX INFO: renamed from: lٌٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15050l {
    public final String crashlytics;
    public final String loadAd;
    public final long yandex;

    public C15050l(long j, String str, String str2) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15050l)) {
            return false;
        }
        C15050l c15050l = (C15050l) obj;
        return this.yandex == c15050l.yandex && AbstractC8576l.yandex(this.loadAd, c15050l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c15050l.crashlytics);
    }

    public final int hashCode() {
        long j = this.yandex;
        return this.crashlytics.hashCode() + AbstractC12589l.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preview(id=");
        sb.append(this.yandex);
        sb.append(", displayName=");
        sb.append(this.loadAd);
        sb.append(", avatar=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
