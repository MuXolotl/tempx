package defpackage;

/* JADX INFO: renamed from: lٕٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15735l {
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public C15735l(long j, long j2, long j3) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15735l) {
            C15735l c15735l = (C15735l) obj;
            if (this.yandex == c15735l.yandex && this.loadAd == c15735l.loadAd && this.crashlytics == c15735l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.crashlytics;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.yandex);
        sb.append(", elapsedRealtime=");
        sb.append(this.loadAd);
        sb.append(", uptimeMillis=");
        return AbstractC15560l.ads(this.crashlytics, "}", sb);
    }
}
