package defpackage;

/* JADX INFO: renamed from: lَٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10294l {
    public long loadAd;
    public final C5616l yandex;

    public C10294l(C5616l c5616l, long j) {
        this.yandex = c5616l;
        this.loadAd = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10294l) {
            C10294l c10294l = (C10294l) obj;
            if (this.yandex == c10294l.yandex && C4999l.loadAd(this.loadAd, c10294l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "AnimData(anim=" + this.yandex + ", startSize=" + C4999l.crashlytics(this.loadAd) + ")";
    }
}
