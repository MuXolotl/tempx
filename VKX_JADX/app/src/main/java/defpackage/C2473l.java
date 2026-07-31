package defpackage;

/* JADX INFO: renamed from: lؚؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2473l {
    public final int loadAd;
    public final AbstractC1514l yandex;

    public C2473l(AbstractC1514l abstractC1514l, int i) {
        this.yandex = abstractC1514l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2473l)) {
            return false;
        }
        C2473l c2473l = (C2473l) obj;
        return this.yandex.equals(c2473l.yandex) && this.loadAd == c2473l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.yandex);
        sb.append(", arity=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
