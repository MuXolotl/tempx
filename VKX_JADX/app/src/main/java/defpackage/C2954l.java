package defpackage;

/* JADX INFO: renamed from: lؔ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2954l {
    public final Integer loadAd;
    public final int yandex;

    public C2954l(int i, Integer num) {
        this.yandex = i;
        this.loadAd = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2954l)) {
            return false;
        }
        C2954l c2954l = (C2954l) obj;
        return this.yandex == c2954l.yandex && AbstractC8576l.yandex(this.loadAd, c2954l.loadAd);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        Integer num = this.loadAd;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.yandex + ", dataOffset=" + this.loadAd + ")";
    }
}
