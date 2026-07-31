package defpackage;

/* JADX INFO: renamed from: lؔؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2322l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C2322l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2322l)) {
            return false;
        }
        C2322l c2322l = (C2322l) obj;
        if (C14467l.loadAd(this.yandex, c2322l.yandex) && C14467l.loadAd(this.loadAd, c2322l.loadAd) && C14467l.loadAd(this.crashlytics, c2322l.crashlytics)) {
            return C14467l.loadAd(this.amazon, c2322l.amazon);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }
}
