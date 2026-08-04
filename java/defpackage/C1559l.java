package defpackage;

/* JADX INFO: renamed from: lؓؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1559l extends AbstractC3124l {
    public final String crashlytics;
    public final String loadAd;

    public C1559l(String str, String str2) {
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559l)) {
            return false;
        }
        C1559l c1559l = (C1559l) obj;
        return AbstractC8576l.yandex(this.loadAd, c1559l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c1559l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (this.loadAd.hashCode() * 31);
    }

    public final String toString() {
        return this.loadAd + this.crashlytics;
    }
}
