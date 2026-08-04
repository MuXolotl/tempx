package defpackage;

/* JADX INFO: renamed from: lؙٟٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6644l {
    public final int loadAd;
    public final int yandex;

    public C6644l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6644l)) {
            return false;
        }
        C6644l c6644l = (C6644l) obj;
        return this.yandex == c6644l.yandex && this.loadAd == c6644l.loadAd;
    }

    public final int hashCode() {
        return AbstractC5020l.inmobi(this.loadAd) + (AbstractC5020l.inmobi(this.yandex) * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + AbstractC9029l.appmetrica(this.yandex) + ", endAffinity=" + AbstractC9029l.appmetrica(this.loadAd) + ")";
    }
}
