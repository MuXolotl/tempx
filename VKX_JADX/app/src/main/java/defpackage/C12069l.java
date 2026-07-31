package defpackage;

/* JADX INFO: renamed from: lِۘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12069l extends AbstractC9375l {
    public final long amazon;
    public final String crashlytics;
    public final String loadAd;
    public final AbstractC13583l yandex;

    public C12069l(C9895l c9895l, String str, String str2, long j) {
        this.yandex = c9895l;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9375l) {
            C12069l c12069l = (C12069l) ((AbstractC9375l) obj);
            if (this.yandex.equals(c12069l.yandex) && this.loadAd.equals(c12069l.loadAd) && this.crashlytics.equals(c12069l.crashlytics) && this.amazon == c12069l.amazon) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003;
        long j = this.amazon;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.yandex);
        sb.append(", parameterKey=");
        sb.append(this.loadAd);
        sb.append(", parameterValue=");
        sb.append(this.crashlytics);
        sb.append(", templateVersion=");
        return AbstractC15560l.ads(this.amazon, "}", sb);
    }
}
