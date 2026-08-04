package defpackage;

/* JADX INFO: renamed from: lٖۨۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16810l {
    public static final C16810l crashlytics = new C16810l(1.0f, 0.0f);
    public final float loadAd;
    public final float yandex;

    public C16810l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16810l)) {
            return false;
        }
        C16810l c16810l = (C16810l) obj;
        return this.yandex == c16810l.yandex && this.loadAd == c16810l.loadAd;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.yandex + ", skewX=" + this.loadAd + ")";
    }
}
