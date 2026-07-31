package defpackage;

/* JADX INFO: renamed from: lٍۦؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9947l extends AbstractC3394l {
    public final int amazon;
    public final long billing;
    public final boolean crashlytics;
    public final int loadAd;
    public final long purchase;
    public final Double yandex;

    public C9947l(Double d, int i, boolean z, int i2, long j, long j2) {
        this.yandex = d;
        this.loadAd = i;
        this.crashlytics = z;
        this.amazon = i2;
        this.purchase = j;
        this.billing = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3394l) {
            AbstractC3394l abstractC3394l = (AbstractC3394l) obj;
            Double d = this.yandex;
            if (d != null ? d.equals(((C9947l) abstractC3394l).yandex) : ((C9947l) abstractC3394l).yandex == null) {
                C9947l c9947l = (C9947l) abstractC3394l;
                if (this.loadAd == c9947l.loadAd && this.crashlytics == c9947l.crashlytics && this.amazon == c9947l.amazon && this.purchase == c9947l.purchase && this.billing == c9947l.billing) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.yandex;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ (this.crashlytics ? 1231 : 1237)) * 1000003) ^ this.amazon) * 1000003;
        long j = this.purchase;
        long j2 = this.billing;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.yandex);
        sb.append(", batteryVelocity=");
        sb.append(this.loadAd);
        sb.append(", proximityOn=");
        sb.append(this.crashlytics);
        sb.append(", orientation=");
        sb.append(this.amazon);
        sb.append(", ramUsed=");
        sb.append(this.purchase);
        sb.append(", diskUsed=");
        return AbstractC15560l.ads(this.billing, "}", sb);
    }
}
