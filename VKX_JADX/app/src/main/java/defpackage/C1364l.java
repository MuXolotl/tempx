package defpackage;

/* JADX INFO: renamed from: lٖؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1364l {
    public final long loadAd;
    public final long yandex;

    public C1364l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1364l.class.equals(obj.getClass())) {
            C1364l c1364l = (C1364l) obj;
            if (c1364l.yandex == this.yandex && c1364l.loadAd == this.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.loadAd;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb.append(this.yandex);
        sb.append(", flexIntervalMillis=");
        return AbstractC12900l.smaato(sb, this.loadAd, '}');
    }
}
