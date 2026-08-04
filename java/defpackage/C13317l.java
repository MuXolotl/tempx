package defpackage;

/* JADX INFO: renamed from: lّْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13317l {
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C13317l(Double d, Double d2) {
        Double dValueOf = Double.valueOf(1.0d);
        float fFloatValue = d.floatValue();
        float fFloatValue2 = d2.floatValue();
        float fFloatValue3 = dValueOf.floatValue();
        this.yandex = fFloatValue;
        this.loadAd = fFloatValue2;
        this.crashlytics = fFloatValue3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13317l)) {
            return false;
        }
        C13317l c13317l = (C13317l) obj;
        return Float.compare(this.yandex, c13317l.yandex) == 0 && Float.compare(this.loadAd, c13317l.loadAd) == 0 && Float.compare(this.crashlytics, c13317l.crashlytics) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics) + AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31);
    }

    public final String toString() {
        return "xyY(x=" + this.yandex + ", y=" + this.loadAd + ", Y=" + this.crashlytics + ')';
    }

    public final float yandex() {
        float f = 1.0f - this.yandex;
        float f2 = this.loadAd;
        return ((f - f2) * this.crashlytics) / f2;
    }
}
