package defpackage;

/* JADX INFO: renamed from: lۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18701l extends AbstractC1392l {
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final float purchase;

    public C18701l(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof C18701l)) {
            return false;
        }
        C18701l c18701l = (C18701l) obj;
        return Float.compare(this.crashlytics, c18701l.crashlytics) == 0 && Float.compare(this.amazon, c18701l.amazon) == 0 && Float.compare(this.purchase, c18701l.purchase) == 0 && Float.compare(this.billing, c18701l.billing) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.billing) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.crashlytics) * 31, this.amazon, 31), this.purchase, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("QuadTo(x1=", this.crashlytics, ", y1=", this.amazon, ", x2=");
        sbTapsense.append(this.purchase);
        sbTapsense.append(", y2=");
        sbTapsense.append(this.billing);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
