package defpackage;

/* JADX INFO: renamed from: lۦٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18703l {
    public float loadAd;
    public long yandex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18703l)) {
            return false;
        }
        C18703l c18703l = (C18703l) obj;
        return this.yandex == c18703l.yandex && Float.compare(this.loadAd, c18703l.loadAd) == 0;
    }

    public final int hashCode() {
        long j = this.yandex;
        return Float.floatToIntBits(this.loadAd) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.yandex + ", dataPoint=" + this.loadAd + ")";
    }
}
