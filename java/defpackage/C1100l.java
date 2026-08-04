package defpackage;

/* JADX INFO: renamed from: lِؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1100l {
    public final float amazon;
    public final long crashlytics;
    public final long loadAd;
    public final float purchase;
    public final long yandex;

    public C1100l(long j, long j2, long j3) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = ((Number) AbstractC8576l.admob(Float.valueOf(j2 / (j < 1 ? 1L : j)), new C12015l(0.0f, 1.0f))).floatValue();
        this.purchase = ((Number) AbstractC8576l.admob(Float.valueOf(j3 / (j < 1 ? 1L : j)), new C12015l(0.0f, 1.0f))).floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1100l)) {
            return false;
        }
        C1100l c1100l = (C1100l) obj;
        return this.yandex == c1100l.yandex && this.loadAd == c1100l.loadAd && this.crashlytics == c1100l.crashlytics;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.crashlytics;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackProgressState(duration=");
        sb.append(this.yandex);
        sb.append(", buffered=");
        sb.append(this.loadAd);
        sb.append(", position=");
        return AbstractC12900l.smaato(sb, this.crashlytics, ')');
    }
}
