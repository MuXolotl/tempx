package defpackage;

/* JADX INFO: renamed from: lؚٟؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7422l extends AbstractC15403l {
    public final long amazon;
    public final String crashlytics;
    public final String loadAd;
    public final int purchase;
    public final long yandex;

    public C7422l(long j, String str, String str2, long j2, int i) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = j2;
        this.purchase = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC15403l) {
            C7422l c7422l = (C7422l) ((AbstractC15403l) obj);
            if (this.yandex == c7422l.yandex && this.loadAd.equals(c7422l.loadAd)) {
                String str = c7422l.crashlytics;
                String str2 = this.crashlytics;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.amazon == c7422l.amazon && this.purchase == c7422l.purchase) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003;
        String str = this.crashlytics;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.amazon;
        return this.purchase ^ ((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.yandex);
        sb.append(", symbol=");
        sb.append(this.loadAd);
        sb.append(", file=");
        sb.append(this.crashlytics);
        sb.append(", offset=");
        sb.append(this.amazon);
        sb.append(", importance=");
        return AbstractC14814l.remoteconfig(this.purchase, "}", sb);
    }
}
