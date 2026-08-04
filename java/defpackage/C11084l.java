package defpackage;

/* JADX INFO: renamed from: lُٖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11084l {
    public final C7190l crashlytics;
    public final C7819l loadAd;
    public final C13177l yandex;

    public C11084l(C13177l c13177l, C7819l c7819l, C7190l c7190l) {
        this.yandex = c13177l;
        this.loadAd = c7819l;
        this.crashlytics = c7190l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11084l)) {
            return false;
        }
        C11084l c11084l = (C11084l) obj;
        if (!AbstractC8576l.yandex(this.yandex, c11084l.yandex)) {
            return false;
        }
        C7190l c7190l = c11084l.crashlytics;
        C7190l c7190l2 = this.crashlytics;
        return AbstractC8576l.yandex(c7190l2, c7190l) && c7190l2.yandex(this.loadAd, c11084l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C7190l c7190l = this.crashlytics;
        return c7190l.loadAd(this.loadAd) + ((c7190l.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.yandex + ", request=" + this.loadAd + ", modelEqualityDelegate=" + this.crashlytics + ")";
    }
}
