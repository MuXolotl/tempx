package defpackage;

/* JADX INFO: renamed from: lؔؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2369l {
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;
    public static final C2369l amazon = new C2369l("HTTP", 3, 0);
    public static final C2369l purchase = new C2369l("HTTP", 2, 0);
    public static final C2369l billing = new C2369l("HTTP", 1, 1);
    public static final C2369l mopub = new C2369l("HTTP", 1, 0);
    public static final C2369l admob = new C2369l("SPDY", 3, 0);
    public static final C2369l subs = new C2369l("QUIC", 1, 0);

    public C2369l(String str, int i, int i2) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2369l)) {
            return false;
        }
        C2369l c2369l = (C2369l) obj;
        return this.yandex.equals(c2369l.yandex) && this.loadAd == c2369l.loadAd && this.crashlytics == c2369l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        return this.yandex + '/' + this.loadAd + '.' + this.crashlytics;
    }
}
