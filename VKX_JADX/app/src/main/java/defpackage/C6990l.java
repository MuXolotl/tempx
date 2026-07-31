package defpackage;

/* JADX INFO: renamed from: lؚٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6990l extends AbstractC5579l {
    public final long crashlytics;
    public final String loadAd;
    public final String yandex;

    public C6990l(long j, String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5579l) {
            C6990l c6990l = (C6990l) ((AbstractC5579l) obj);
            if (this.yandex.equals(c6990l.yandex) && this.loadAd.equals(c6990l.loadAd) && this.crashlytics == c6990l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003;
        long j = this.crashlytics;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.yandex);
        sb.append(", code=");
        sb.append(this.loadAd);
        sb.append(", address=");
        return AbstractC15560l.ads(this.crashlytics, "}", sb);
    }
}
