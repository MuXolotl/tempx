package defpackage;

/* JADX INFO: renamed from: lؔؐۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2317l extends AbstractC2533l {
    public final AbstractC2533l amazon;
    public final int purchase;

    public C2317l(AbstractC2533l abstractC2533l, int i) {
        this.amazon = abstractC2533l;
        this.purchase = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2317l)) {
            return false;
        }
        C2317l c2317l = (C2317l) obj;
        return c2317l.amazon.equals(this.amazon) && c2317l.purchase == this.purchase;
    }

    public final int hashCode() {
        return this.amazon.hashCode() + (this.purchase * 31);
    }
}
