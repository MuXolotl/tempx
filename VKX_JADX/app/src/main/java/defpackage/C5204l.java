package defpackage;

/* JADX INFO: renamed from: lؗ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5204l {
    public final long crashlytics;
    public final long loadAd;
    public final String yandex;

    public C5204l(String str, long j, long j2) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5204l) {
            C5204l c5204l = (C5204l) obj;
            if (this.yandex.equals(c5204l.yandex) && this.loadAd == c5204l.loadAd && this.crashlytics == c5204l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() ^ 1000003) * 1000003;
        long j = this.loadAd;
        long j2 = this.crashlytics;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.yandex);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.loadAd);
        sb.append(", tokenCreationTimestamp=");
        return AbstractC15560l.ads(this.crashlytics, "}", sb);
    }
}
