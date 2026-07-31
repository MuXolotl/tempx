package defpackage;

/* JADX INFO: renamed from: lٌٚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8896l {
    public static final C8896l purchase = new C8896l(0.0f, 0.0f, 0.0f, 0.0f);
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C8896l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public static C8896l loadAd(C8896l c8896l, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = c8896l.yandex;
        }
        float f4 = (i & 2) != 0 ? c8896l.loadAd : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = c8896l.crashlytics;
        }
        if ((i & 8) != 0) {
            f3 = c8896l.amazon;
        }
        return new C8896l(f, f4, f2, f3);
    }

    public final long admob() {
        return (((long) Float.floatToRawIntBits(this.yandex)) << 32) | (((long) Float.floatToRawIntBits(this.loadAd)) & 4294967295L);
    }

    public final long amazon() {
        return (((long) Float.floatToRawIntBits(this.yandex)) << 32) | (((long) Float.floatToRawIntBits(this.amazon)) & 4294967295L);
    }

    public final long billing() {
        float f = this.crashlytics;
        float f2 = this.yandex;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.amazon;
        float f5 = this.loadAd;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long crashlytics() {
        float f = this.crashlytics;
        float f2 = this.yandex;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.amazon)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8896l)) {
            return false;
        }
        C8896l c8896l = (C8896l) obj;
        return Float.compare(this.yandex, c8896l.yandex) == 0 && Float.compare(this.loadAd, c8896l.loadAd) == 0 && Float.compare(this.crashlytics, c8896l.crashlytics) == 0 && Float.compare(this.amazon, c8896l.amazon) == 0;
    }

    public final boolean firebase() {
        return (this.yandex >= this.crashlytics) | (this.loadAd >= this.amazon);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final C8896l isPro(C8896l c8896l) {
        return new C8896l(Math.max(this.yandex, c8896l.yandex), Math.max(this.loadAd, c8896l.loadAd), Math.min(this.crashlytics, c8896l.crashlytics), Math.min(this.amazon, c8896l.amazon));
    }

    public final long mopub() {
        float f = this.crashlytics - this.yandex;
        return (((long) Float.floatToRawIntBits(this.amazon - this.loadAd)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long purchase() {
        return (((long) Float.floatToRawIntBits(this.crashlytics)) << 32) | (((long) Float.floatToRawIntBits(this.amazon)) & 4294967295L);
    }

    public final C8896l remoteconfig(float f, float f2) {
        return new C8896l(this.yandex + f, this.loadAd + f2, this.crashlytics + f, this.amazon + f2);
    }

    public final boolean smaato(C8896l c8896l) {
        return (this.yandex < c8896l.crashlytics) & (c8896l.yandex < this.crashlytics) & (this.loadAd < c8896l.amazon) & (c8896l.loadAd < this.amazon);
    }

    public final long subs() {
        return (((long) Float.floatToRawIntBits(this.crashlytics)) << 32) | (((long) Float.floatToRawIntBits(this.loadAd)) & 4294967295L);
    }

    public final String toString() {
        String strCrashlytics = AbstractC4447l.crashlytics(this.yandex);
        String strCrashlytics2 = AbstractC4447l.crashlytics(this.loadAd);
        return AbstractC9361l.advert(AbstractC14814l.license("Rect.fromLTRB(", strCrashlytics, ", ", strCrashlytics2, ", "), AbstractC4447l.crashlytics(this.crashlytics), ", ", AbstractC4447l.crashlytics(this.amazon), ")");
    }

    public final C8896l vip(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C8896l(Float.intBitsToFloat(i) + this.yandex, Float.intBitsToFloat(i2) + this.loadAd, Float.intBitsToFloat(i) + this.crashlytics, Float.intBitsToFloat(i2) + this.amazon);
    }

    public final boolean yandex(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.yandex) & (fIntBitsToFloat < this.crashlytics) & (fIntBitsToFloat2 >= this.loadAd) & (fIntBitsToFloat2 < this.amazon);
    }
}
