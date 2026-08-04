package defpackage;

/* JADX INFO: renamed from: lُْۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11023l {
    public final long crashlytics;
    public final int loadAd;
    public final String yandex;

    public C11023l(long j, int i, String str) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11023l)) {
            return false;
        }
        C11023l c11023l = (C11023l) obj;
        return AbstractC8576l.yandex(this.yandex, c11023l.yandex) && this.loadAd == c11023l.loadAd && this.crashlytics == c11023l.crashlytics;
    }

    public final int hashCode() {
        int iHashCode = ((this.yandex.hashCode() * 31) + this.loadAd) * 31;
        long j = this.crashlytics;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpServerSettings(host=");
        sb.append(this.yandex);
        sb.append(", port=");
        sb.append(this.loadAd);
        sb.append(", connectionIdleTimeoutSeconds=");
        return AbstractC15560l.ads(this.crashlytics, ", reuseAddress=false)", sb);
    }
}
