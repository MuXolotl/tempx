package defpackage;

/* JADX INFO: renamed from: lؘۤ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6074l {
    public float amazon;
    public float crashlytics;
    public final float loadAd;
    public boolean purchase = false;
    public final float yandex;

    public C6074l(float f, float f2, float f3, float f4) {
        this.crashlytics = 0.0f;
        this.amazon = 0.0f;
        this.yandex = f;
        this.loadAd = f2;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.crashlytics = (float) (((double) f3) / dSqrt);
            this.amazon = (float) (((double) f4) / dSqrt);
        }
    }

    public final void loadAd(C6074l c6074l) {
        float f = c6074l.crashlytics;
        float f2 = this.crashlytics;
        if (f == (-f2)) {
            float f3 = c6074l.amazon;
            if (f3 == (-this.amazon)) {
                this.purchase = true;
                this.crashlytics = -f3;
                this.amazon = c6074l.crashlytics;
                return;
            }
        }
        this.crashlytics = f2 + f;
        this.amazon += c6074l.amazon;
    }

    public final String toString() {
        return "(" + this.yandex + "," + this.loadAd + " " + this.crashlytics + "," + this.amazon + ")";
    }

    public final void yandex(float f, float f2) {
        float f3 = f - this.yandex;
        float f4 = f2 - this.loadAd;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            f3 = (float) (((double) f3) / dSqrt);
            f4 = (float) (((double) f4) / dSqrt);
        }
        float f5 = this.crashlytics;
        if (f3 != (-f5) || f4 != (-this.amazon)) {
            this.crashlytics = f5 + f3;
            this.amazon += f4;
        } else {
            this.purchase = true;
            this.crashlytics = -f4;
            this.amazon = f3;
        }
    }
}
