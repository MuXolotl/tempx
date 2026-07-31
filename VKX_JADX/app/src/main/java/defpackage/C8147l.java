package defpackage;

/* JADX INFO: renamed from: lًِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8147l {
    public final boolean amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long mopub;
    public final int purchase;
    public final C8195l yandex;

    public C8147l(C8195l c8195l, long j, long j2, boolean z, int i) {
        this.yandex = c8195l;
        this.loadAd = j;
        this.crashlytics = j2;
        this.amazon = z;
        this.purchase = i;
        this.billing = j + j2;
        this.mopub = ((Number) c8195l.f17097l).longValue() - ((Number) c8195l.f17098l).longValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8147l)) {
            return false;
        }
        C8147l c8147l = (C8147l) obj;
        return this.yandex.equals(c8147l.yandex) && this.loadAd == c8147l.loadAd && this.crashlytics == c8147l.crashlytics && this.amazon == c8147l.amazon && this.purchase == c8147l.purchase;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.crashlytics;
        return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.amazon ? 1231 : 1237)) * 31) + this.purchase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageCardModel(selectedStorage=");
        sb.append((Object) ("StorageSize(src=" + this.yandex + ')'));
        sb.append(", takenAppCache=");
        sb.append(this.loadAd);
        sb.append(", takenTrackCache=");
        sb.append(this.crashlytics);
        sb.append(", hasSeveralProviders=");
        sb.append(this.amazon);
        sb.append(", oppositeProviderName=");
        return AbstractC0653l.adcel(sb, this.purchase, ')');
    }
}
