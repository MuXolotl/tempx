package defpackage;

/* JADX INFO: renamed from: lِٞٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12015l {
    public final float loadAd;
    public final float yandex;

    public C12015l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean crashlytics(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12015l)) {
            return false;
        }
        if (loadAd() && ((C12015l) obj).loadAd()) {
            return true;
        }
        C12015l c12015l = (C12015l) obj;
        return this.yandex == c12015l.yandex && this.loadAd == c12015l.loadAd;
    }

    public final int hashCode() {
        if (loadAd()) {
            return -1;
        }
        return Float.floatToIntBits(this.loadAd) + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final boolean loadAd() {
        return this.yandex > this.loadAd;
    }

    public final String toString() {
        return this.yandex + ".." + this.loadAd;
    }

    public final Comparable yandex() {
        return Float.valueOf(this.yandex);
    }
}
