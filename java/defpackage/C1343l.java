package defpackage;

/* JADX INFO: renamed from: lؒۜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1343l {
    public final int loadAd;
    public final C1257l yandex;

    public C1343l(C1257l c1257l, int i) {
        this.yandex = c1257l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1343l)) {
            return false;
        }
        C1343l c1343l = (C1343l) obj;
        return this.loadAd == c1343l.loadAd && this.yandex.equals(c1343l.yandex);
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }
}
