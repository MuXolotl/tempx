package defpackage;

/* JADX INFO: renamed from: lَ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10369l extends AbstractC2249l {
    public float amazon;
    public float crashlytics;
    public float loadAd;
    public float yandex;

    public C10369l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    @Override // defpackage.AbstractC2249l
    public final void amazon() {
        this.yandex = 0.0f;
        this.loadAd = 0.0f;
        this.crashlytics = 0.0f;
        this.amazon = 0.0f;
    }

    @Override // defpackage.AbstractC2249l
    public final AbstractC2249l crashlytics() {
        return new C10369l(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10369l)) {
            return false;
        }
        C10369l c10369l = (C10369l) obj;
        return c10369l.yandex == this.yandex && c10369l.loadAd == this.loadAd && c10369l.crashlytics == this.crashlytics && c10369l.amazon == this.amazon;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    @Override // defpackage.AbstractC2249l
    public final int loadAd() {
        return 4;
    }

    @Override // defpackage.AbstractC2249l
    public final void purchase(int i, float f) {
        if (i == 0) {
            this.yandex = f;
            return;
        }
        if (i == 1) {
            this.loadAd = f;
        } else if (i == 2) {
            this.crashlytics = f;
        } else {
            if (i != 3) {
                return;
            }
            this.amazon = f;
        }
    }

    public final String toString() {
        float f = this.yandex;
        float f2 = this.loadAd;
        float f3 = this.crashlytics;
        float f4 = this.amazon;
        StringBuilder sbTapsense = AbstractC14814l.tapsense("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbTapsense.append(f3);
        sbTapsense.append(", v4 = ");
        sbTapsense.append(f4);
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
        if (i == 2) {
            return this.crashlytics;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.amazon;
    }
}
