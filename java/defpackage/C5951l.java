package defpackage;

/* JADX INFO: renamed from: lؘُۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5951l extends AbstractC2249l {
    public float crashlytics;
    public float loadAd;
    public float yandex;

    public C5951l(float f, float f2, float f3) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
    }

    @Override // defpackage.AbstractC2249l
    public final void amazon() {
        this.yandex = 0.0f;
        this.loadAd = 0.0f;
        this.crashlytics = 0.0f;
    }

    @Override // defpackage.AbstractC2249l
    public final AbstractC2249l crashlytics() {
        return new C5951l(0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5951l)) {
            return false;
        }
        C5951l c5951l = (C5951l) obj;
        return c5951l.yandex == this.yandex && c5951l.loadAd == this.loadAd && c5951l.crashlytics == this.crashlytics;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics) + AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31);
    }

    @Override // defpackage.AbstractC2249l
    public final int loadAd() {
        return 3;
    }

    @Override // defpackage.AbstractC2249l
    public final void purchase(int i, float f) {
        if (i == 0) {
            this.yandex = f;
        } else if (i == 1) {
            this.loadAd = f;
        } else {
            if (i != 2) {
                return;
            }
            this.crashlytics = f;
        }
    }

    public final String toString() {
        float f = this.yandex;
        float f2 = this.loadAd;
        float f3 = this.crashlytics;
        StringBuilder sbTapsense = AbstractC14814l.tapsense("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbTapsense.append(f3);
        return sbTapsense.toString();
    }

    @Override // defpackage.AbstractC2249l
    public final float yandex(int i) {
        if (i == 0) {
            return this.yandex;
        }
        if (i == 1) {
            return this.loadAd;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.crashlytics;
    }
}
