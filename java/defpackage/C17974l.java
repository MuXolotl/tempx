package defpackage;

/* JADX INFO: renamed from: lؙ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17974l extends AbstractC13831l {
    public final C0086l loadAd;

    public C17974l(C0086l c0086l) {
        this.loadAd = c0086l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17974l) && AbstractC8576l.yandex(this.loadAd, ((C17974l) obj).loadAd);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd.yandex);
    }

    @Override // defpackage.AbstractC13831l
    public final int loadAd(int i, int i2, EnumC9931l enumC9931l) {
        return this.loadAd.yandex(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.loadAd + ")";
    }
}
