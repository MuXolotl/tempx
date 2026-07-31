package defpackage;

/* JADX INFO: renamed from: lٌؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6346l {
    public final C15331l loadAd;
    public final int yandex;

    public C6346l(int i, C15331l c15331l) {
        this.yandex = i;
        this.loadAd = c15331l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6346l)) {
            return false;
        }
        C6346l c6346l = (C6346l) obj;
        return this.yandex == c6346l.yandex && AbstractC8576l.yandex(this.loadAd, c6346l.loadAd);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        C15331l c15331l = this.loadAd;
        return i + (c15331l == null ? 0 : c15331l.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.yandex + ')')) + ", frameMetadata=" + this.loadAd + ')';
    }
}
