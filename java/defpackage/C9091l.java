package defpackage;

/* JADX INFO: renamed from: lٌ۠ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9091l {
    public final int loadAd;
    public final C14660l yandex;

    public C9091l(C14660l c14660l, int i) {
        this.yandex = c14660l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9091l)) {
            return false;
        }
        C9091l c9091l = (C9091l) obj;
        return this.yandex.equals(c9091l.yandex) && this.loadAd == c9091l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        return "DivisionResult(quotient=" + this.yandex + ", remainder=" + ((Object) String.valueOf(((long) this.loadAd) & 4294967295L)) + ')';
    }
}
