package defpackage;

/* JADX INFO: renamed from: lّؗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5048l {
    public final int amazon;
    public final float billing;
    public final int crashlytics;
    public final int loadAd;
    public final float mopub;
    public final int purchase;
    public final C7546l yandex;

    public C5048l(C7546l c7546l, int i, int i2, int i3, int i4, float f, float f2) {
        this.yandex = c7546l;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = f;
        this.mopub = f2;
    }

    public final int amazon(int i) {
        int i2 = this.crashlytics;
        int i3 = this.loadAd;
        return AbstractC8576l.purchase(i, i3, i2) - i3;
    }

    public final C8896l crashlytics(C8896l c8896l) {
        float f = -this.billing;
        return c8896l.vip((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5048l) {
            C5048l c5048l = (C5048l) obj;
            if (this.yandex == c5048l.yandex && this.loadAd == c5048l.loadAd && this.crashlytics == c5048l.crashlytics && this.amazon == c5048l.amazon && this.purchase == c5048l.purchase && Float.compare(this.billing, c5048l.billing) == 0 && Float.compare(this.mopub, c5048l.mopub) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.mopub) + AbstractC9029l.mopub(((((((((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon) * 31) + this.purchase) * 31, this.billing, 31);
    }

    public final long loadAd(long j, boolean z) {
        if (z) {
            long j2 = C12814l.loadAd;
            if (C12814l.crashlytics(j, j2)) {
                return j2;
            }
        }
        int i = C12814l.crashlytics;
        int i2 = this.loadAd;
        return AbstractC2296l.loadAd(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.yandex);
        sb.append(", startIndex=");
        sb.append(this.loadAd);
        sb.append(", endIndex=");
        AbstractC12900l.tapsense(sb, this.crashlytics, ", startLineIndex=", this.amazon, ", endLineIndex=");
        sb.append(this.purchase);
        sb.append(", top=");
        sb.append(this.billing);
        sb.append(", bottom=");
        sb.append(this.mopub);
        sb.append(")");
        return sb.toString();
    }

    public final C8896l yandex(C8896l c8896l) {
        return c8896l.vip((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.billing)) & 4294967295L));
    }
}
