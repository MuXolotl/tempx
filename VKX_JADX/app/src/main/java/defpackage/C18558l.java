package defpackage;

/* JADX INFO: renamed from: lًۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18558l {
    public final float loadAd;
    public final float yandex;

    public C18558l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18558l)) {
            return false;
        }
        C18558l c18558l = (C18558l) obj;
        return Float.compare(this.yandex, c18558l.yandex) == 0 && Float.compare(this.loadAd, c18558l.loadAd) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.yandex + ", y=" + this.loadAd + ")";
    }

    public final float[] yandex() {
        float f = this.yandex;
        float f2 = this.loadAd;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }
}
