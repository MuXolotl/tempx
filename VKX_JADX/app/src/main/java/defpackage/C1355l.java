package defpackage;

/* JADX INFO: renamed from: lؒۜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1355l extends AbstractC14069l {
    public final int purchase;

    public C1355l(int i) {
        super(AbstractC12080l.loadAd, i == 2 ? 2 : 1, i == 3 ? 2 : null);
        this.purchase = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1355l) {
            return this.purchase == ((C1355l) obj).purchase;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC5020l.inmobi(this.purchase);
    }
}
