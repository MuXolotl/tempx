package defpackage;

/* JADX INFO: renamed from: lٔؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14654l {
    public final int crashlytics;
    public final long loadAd;
    public final int yandex;

    public C14654l(int i, long j, int i2) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14654l)) {
            return false;
        }
        C14654l c14654l = (C14654l) obj;
        return this.yandex == c14654l.yandex && this.loadAd == c14654l.loadAd && this.crashlytics == c14654l.crashlytics;
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuplicateOccurrence(id=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append(this.loadAd);
        sb.append(", date=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
