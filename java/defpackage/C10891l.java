package defpackage;

/* JADX INFO: renamed from: lُؙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10891l {
    public final C4361l loadAd;
    public final C1354l yandex;

    public C10891l() {
        this(null, new C4361l());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10891l)) {
            return false;
        }
        C10891l c10891l = (C10891l) obj;
        return AbstractC8576l.yandex(this.loadAd, c10891l.loadAd) && AbstractC8576l.yandex(this.yandex, c10891l.yandex);
    }

    public final int hashCode() {
        C1354l c1354l = this.yandex;
        int iHashCode = (c1354l != null ? c1354l.hashCode() : 0) * 31;
        C4361l c4361l = this.loadAd;
        return iHashCode + (c4361l != null ? c4361l.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.yandex + ", paragraphSyle=" + this.loadAd + ")";
    }

    public C10891l(C1354l c1354l, C4361l c4361l) {
        this.yandex = c1354l;
        this.loadAd = c4361l;
    }
}
