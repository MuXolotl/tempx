package defpackage;

/* JADX INFO: renamed from: lٌّٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16275l {
    public final C8195l loadAd;
    public final int yandex;

    public C16275l(int i, C8195l c8195l) {
        this.yandex = i;
        this.loadAd = c8195l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16275l)) {
            return false;
        }
        C16275l c16275l = (C16275l) obj;
        return this.yandex == c16275l.yandex && this.loadAd.equals(c16275l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        return "StorageCardPathModel(pathProvider=" + this.yandex + ", selectedStorage=" + ((Object) ("StorageSize(src=" + this.loadAd + ')')) + ')';
    }
}
