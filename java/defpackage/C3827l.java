package defpackage;

/* JADX INFO: renamed from: lؖؐٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3827l extends AbstractC3124l {
    public final String crashlytics;
    public final String loadAd;

    public C3827l(String str, String str2) {
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3827l)) {
            return false;
        }
        C3827l c3827l = (C3827l) obj;
        return AbstractC8576l.yandex(this.loadAd, c3827l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c3827l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (this.loadAd.hashCode() * 31);
    }

    public final String toString() {
        return this.loadAd + ':' + this.crashlytics;
    }
}
