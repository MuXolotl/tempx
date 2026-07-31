package defpackage;

/* JADX INFO: renamed from: lٍؚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9811l {
    public final Object loadAd;
    public final Object yandex;

    public C9811l(Object obj, Object obj2) {
        this.yandex = obj;
        this.loadAd = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9811l)) {
            return false;
        }
        C9811l c9811l = (C9811l) obj;
        return AbstractC8576l.yandex(this.yandex, c9811l.yandex) && AbstractC8576l.yandex(this.loadAd, c9811l.loadAd);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.loadAd;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.yandex + ", upper=" + this.loadAd + ')';
    }
}
