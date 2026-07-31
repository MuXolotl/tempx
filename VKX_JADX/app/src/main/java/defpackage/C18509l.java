package defpackage;

/* JADX INFO: renamed from: lۗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18509l {
    public final long crashlytics;
    public final float loadAd;
    public final float yandex;

    public C18509l(float f, float f2, long j) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18509l)) {
            return false;
        }
        C18509l c18509l = (C18509l) obj;
        return Float.compare(this.yandex, c18509l.yandex) == 0 && Float.compare(this.loadAd, c18509l.loadAd) == 0 && this.crashlytics == c18509l.crashlytics;
    }

    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31);
        long j = this.crashlytics;
        return iMopub + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return AbstractC15560l.ads(this.crashlytics, ")", AbstractC14814l.tapsense("FlingInfo(initialVelocity=", this.yandex, ", distance=", this.loadAd, ", duration="));
    }
}
