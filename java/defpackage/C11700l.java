package defpackage;

/* JADX INFO: renamed from: lًؘِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11700l {
    public final InterfaceC17807l crashlytics;
    public final long loadAd;
    public final float yandex;

    public C11700l(float f, long j, InterfaceC17807l interfaceC17807l) {
        this.yandex = f;
        this.loadAd = j;
        this.crashlytics = interfaceC17807l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11700l)) {
            return false;
        }
        C11700l c11700l = (C11700l) obj;
        return Float.compare(this.yandex, c11700l.yandex) == 0 && C1723l.yandex(this.loadAd, c11700l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11700l.crashlytics);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.yandex) * 31;
        int i = C1723l.crashlytics;
        long j = this.loadAd;
        return this.crashlytics.hashCode() + ((((int) (j ^ (j >>> 32))) + iFloatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.yandex + ", transformOrigin=" + C1723l.loadAd(this.loadAd) + ", animationSpec=" + this.crashlytics + ")";
    }
}
