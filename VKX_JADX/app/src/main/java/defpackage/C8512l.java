package defpackage;

/* JADX INFO: renamed from: lٌؘؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8512l {
    public final double crashlytics;
    public final EnumC3912l loadAd;
    public final EnumC3912l yandex;

    public C8512l(EnumC3912l enumC3912l, EnumC3912l enumC3912l2, double d) {
        this.yandex = enumC3912l;
        this.loadAd = enumC3912l2;
        this.crashlytics = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8512l)) {
            return false;
        }
        C8512l c8512l = (C8512l) obj;
        return this.yandex == c8512l.yandex && this.loadAd == c8512l.loadAd && Double.compare(this.crashlytics, c8512l.crashlytics) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.crashlytics);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.yandex + ", crashlytics=" + this.loadAd + ", sessionSamplingRate=" + this.crashlytics + ')';
    }
}
