package defpackage;

/* JADX INFO: renamed from: lؕۨۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3818l extends AbstractC13831l {
    public final InterfaceC6947l loadAd;

    public C3818l(C15089l c15089l) {
        this.loadAd = c15089l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3818l) && AbstractC8576l.yandex(this.loadAd, ((C3818l) obj).loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode();
    }

    @Override // defpackage.AbstractC13831l
    public final int loadAd(int i, int i2, EnumC9931l enumC9931l) {
        return this.loadAd.yandex(i2, i, enumC9931l);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.loadAd + ")";
    }
}
