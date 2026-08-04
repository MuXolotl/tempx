package defpackage;

/* JADX INFO: renamed from: lؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2152l {
    public final int loadAd;
    public final int yandex;

    public C2152l(int i, int i2) {
        AbstractC12442l.admob(i <= i2);
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2152l.class != obj.getClass()) {
            return false;
        }
        C2152l c2152l = (C2152l) obj;
        return this.yandex == c2152l.yandex && this.loadAd == c2152l.loadAd;
    }

    public final int hashCode() {
        return ((527 + this.yandex) * 31) + this.loadAd;
    }

    public final String toString() {
        C18449l c18449lBilling = AbstractC11999l.billing(this);
        c18449lBilling.subscription(this.yandex, "lowerBounds");
        c18449lBilling.subscription(this.loadAd, "upperBounds");
        return c18449lBilling.toString();
    }

    public final boolean yandex(int i) {
        return this.yandex <= i && i <= this.loadAd;
    }
}
