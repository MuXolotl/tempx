package defpackage;

/* JADX INFO: renamed from: lِ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11907l {
    public final int loadAd;
    public final int yandex;

    public C11907l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11907l)) {
            return false;
        }
        C11907l c11907l = (C11907l) obj;
        return this.yandex == c11907l.yandex && this.loadAd == c11907l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return AbstractC12589l.applovin(this.yandex, this.loadAd, "CollectionInfo(rowCount=", ", columnCount=", ")");
    }
}
