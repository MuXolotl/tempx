package defpackage;

/* JADX INFO: renamed from: lۥؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18688l extends AbstractC1392l {
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final float purchase;

    public C18688l(float f, float f2, float f3, float f4) {
        super(2);
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = f3;
        this.billing = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18688l)) {
            return false;
        }
        C18688l c18688l = (C18688l) obj;
        return Float.compare(this.crashlytics, c18688l.crashlytics) == 0 && Float.compare(this.amazon, c18688l.amazon) == 0 && Float.compare(this.purchase, c18688l.purchase) == 0 && Float.compare(this.billing, c18688l.billing) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.billing) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.crashlytics) * 31, this.amazon, 31), this.purchase, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("RelativeReflectiveCurveTo(dx1=", this.crashlytics, ", dy1=", this.amazon, ", dx2=");
        sbTapsense.append(this.purchase);
        sbTapsense.append(", dy2=");
        sbTapsense.append(this.billing);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
