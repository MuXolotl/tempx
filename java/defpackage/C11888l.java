package defpackage;

/* JADX INFO: renamed from: lِٖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11888l {
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C11888l(float f, float f2, float f3) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11888l)) {
            return false;
        }
        C11888l c11888l = (C11888l) obj;
        return Float.compare(this.yandex, c11888l.yandex) == 0 && Float.compare(this.loadAd, c11888l.loadAd) == 0 && Float.compare(this.crashlytics, c11888l.crashlytics) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics) + AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31);
    }

    public final String toString() {
        return "ZoomValue(zoomRatio=" + this.yandex + ", minZoomRatio=" + this.loadAd + ", maxZoomRatio=" + this.crashlytics + ')';
    }

    public final float yandex() {
        return this.yandex;
    }
}
