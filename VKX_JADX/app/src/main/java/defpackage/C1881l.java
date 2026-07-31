package defpackage;

/* JADX INFO: renamed from: lؓٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1881l extends AbstractC1392l {
    public final float admob;
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final float mopub;
    public final float purchase;

    public C1881l(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = f3;
        this.billing = f4;
        this.mopub = f5;
        this.admob = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1881l)) {
            return false;
        }
        C1881l c1881l = (C1881l) obj;
        return Float.compare(this.crashlytics, c1881l.crashlytics) == 0 && Float.compare(this.amazon, c1881l.amazon) == 0 && Float.compare(this.purchase, c1881l.purchase) == 0 && Float.compare(this.billing, c1881l.billing) == 0 && Float.compare(this.mopub, c1881l.mopub) == 0 && Float.compare(this.admob, c1881l.admob) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.admob) + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.crashlytics) * 31, this.amazon, 31), this.purchase, 31), this.billing, 31), this.mopub, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("CurveTo(x1=", this.crashlytics, ", y1=", this.amazon, ", x2=");
        sbTapsense.append(this.purchase);
        sbTapsense.append(", y2=");
        sbTapsense.append(this.billing);
        sbTapsense.append(", x3=");
        sbTapsense.append(this.mopub);
        sbTapsense.append(", y3=");
        sbTapsense.append(this.admob);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
