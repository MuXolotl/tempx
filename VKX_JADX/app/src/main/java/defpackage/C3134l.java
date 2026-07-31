package defpackage;

/* JADX INFO: renamed from: lؕؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3134l {
    public final int amazon;
    public final int billing;
    public final double crashlytics;
    public final C4608l loadAd;
    public final boolean purchase;
    public final C4608l yandex;

    public C3134l(C4608l c4608l, C4608l c4608l2, double d, int i, boolean z, int i2, int i3) {
        z = (i3 & 16) != 0 ? true : z;
        i2 = (i3 & 32) != 0 ? 1 : i2;
        this.yandex = c4608l;
        this.loadAd = c4608l2;
        this.crashlytics = d;
        this.amazon = i;
        this.purchase = z;
        this.billing = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3134l)) {
            return false;
        }
        C3134l c3134l = (C3134l) obj;
        return AbstractC8576l.yandex(this.yandex, c3134l.yandex) && AbstractC8576l.yandex(this.loadAd, c3134l.loadAd) && Double.compare(this.crashlytics, c3134l.crashlytics) == 0 && this.amazon == c3134l.amazon && this.purchase == c3134l.purchase && this.billing == c3134l.billing;
    }

    public final int hashCode() {
        int iHashCode = (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.crashlytics);
        return AbstractC5020l.inmobi(this.billing) + ((AbstractC0653l.firebase(this.amazon, (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31) + (this.purchase ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ToneDeltaPair(roleA=");
        sb.append(this.yandex);
        sb.append(", roleB=");
        sb.append(this.loadAd);
        sb.append(", delta=");
        sb.append(this.crashlytics);
        sb.append(", polarity=");
        String str2 = "NEARER";
        switch (this.amazon) {
            case 1:
                str = "DARKER";
                break;
            case 2:
                str = "LIGHTER";
                break;
            case 3:
                str = "RELATIVE_DARKER";
                break;
            case 4:
                str = "RELATIVE_LIGHTER";
                break;
            case 5:
                str = "NEARER";
                break;
            case 6:
                str = "FARTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", stayTogether=");
        sb.append(this.purchase);
        sb.append(", deltaConstraint=");
        int i = this.billing;
        if (i == 1) {
            str2 = "EXACT";
        } else if (i != 2) {
            str2 = i != 3 ? "null" : "FARTHER";
        }
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
