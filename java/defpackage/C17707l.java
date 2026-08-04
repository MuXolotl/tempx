package defpackage;

/* JADX INFO: renamed from: lٕ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17707l implements Comparable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34504l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f34505l;

    public C17707l(int i, int i2) {
        this.f34505l = i;
        this.f34504l = i2;
        if (i2 >= 0) {
            return;
        }
        C10754l.metrica(AbstractC0653l.vip(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17707l c17707l = (C17707l) obj;
        int iMax = Math.max(this.f34504l, c17707l.f34504l);
        return AbstractC8576l.subs(yandex(iMax), c17707l.yandex(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17707l)) {
            return false;
        }
        C17707l c17707l = (C17707l) obj;
        int iMax = Math.max(this.f34504l, c17707l.f34504l);
        return AbstractC8576l.subs(yandex(iMax), c17707l.yandex(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC9843l.yandex[this.f34504l];
        int i2 = this.f34505l;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(AbstractC12024l.m3334new(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }

    public final int yandex(int i) {
        int i2 = this.f34505l;
        int i3 = this.f34504l;
        if (i == i3) {
            return i2;
        }
        int[] iArr = AbstractC9843l.yandex;
        return i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }
}
