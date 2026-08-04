package defpackage;

/* JADX INFO: renamed from: lْٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13352l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C13352l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13352l)) {
            return false;
        }
        C13352l c13352l = (C13352l) obj;
        return Float.compare(this.yandex, c13352l.yandex) == 0 && Float.compare(this.loadAd, c13352l.loadAd) == 0 && Float.compare(this.crashlytics, c13352l.crashlytics) == 0 && Float.compare(this.amazon, c13352l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final String toString() {
        return "AbsolutePixelPadding(start=" + this.yandex + ", end=" + this.loadAd + ", top=" + this.crashlytics + ", bottom=" + this.amazon + ')';
    }
}
