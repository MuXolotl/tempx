package defpackage;

/* JADX INFO: renamed from: lٗٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17108l extends AbstractC1392l {
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final float purchase;

    public C17108l(float f, float f2, float f3, float f4) {
        super(1);
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = f3;
        this.billing = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17108l)) {
            return false;
        }
        C17108l c17108l = (C17108l) obj;
        return Float.compare(this.crashlytics, c17108l.crashlytics) == 0 && Float.compare(this.amazon, c17108l.amazon) == 0 && Float.compare(this.purchase, c17108l.purchase) == 0 && Float.compare(this.billing, c17108l.billing) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.billing) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.crashlytics) * 31, this.amazon, 31), this.purchase, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("RelativeQuadTo(dx1=", this.crashlytics, ", dy1=", this.amazon, ", dx2=");
        sbTapsense.append(this.purchase);
        sbTapsense.append(", dy2=");
        sbTapsense.append(this.billing);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
