package defpackage;

/* JADX INFO: renamed from: lٗٗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17180l {
    public final C2428l loadAd;
    public final long yandex;

    public C17180l(long j, C2428l c2428l) {
        this.yandex = j;
        this.loadAd = c2428l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17180l)) {
            return false;
        }
        C17180l c17180l = (C17180l) obj;
        return C1187l.loadAd(this.yandex, c17180l.yandex) && AbstractC8576l.yandex(this.loadAd, c17180l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (C1187l.mopub(this.yandex) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + C1187l.firebase(this.yandex) + ", r=" + this.loadAd + ")";
    }
}
