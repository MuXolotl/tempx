package defpackage;

/* JADX INFO: renamed from: lِؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4054l {
    public final C14099l amazon;
    public final int crashlytics;
    public final long loadAd;
    public final int yandex;

    public C4054l(int i, long j, int i2, C14099l c14099l) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = i2;
        this.amazon = c14099l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4054l)) {
            return false;
        }
        C4054l c4054l = (C4054l) obj;
        return this.yandex == c4054l.yandex && this.loadAd == c4054l.loadAd && this.crashlytics == c4054l.crashlytics && AbstractC8576l.yandex(this.amazon, c4054l.amazon);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        int iFirebase = AbstractC0653l.firebase(this.crashlytics, (i + ((int) (j ^ (j >>> 32)))) * 31, 31);
        C14099l c14099l = this.amazon;
        return iFirebase + (c14099l == null ? 0 : c14099l.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.yandex);
        sb.append(", timestamp=");
        sb.append(this.loadAd);
        sb.append(", type=");
        int i = this.crashlytics;
        if (i != 1) {
            str = i != 2 ? "null" : "VIEW_DISAPPEAR";
        } else {
            str = "VIEW_APPEAR";
        }
        sb.append(str);
        sb.append(", structureCompat=");
        sb.append(this.amazon);
        sb.append(")");
        return sb.toString();
    }
}
