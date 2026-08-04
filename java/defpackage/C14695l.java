package defpackage;

/* JADX INFO: renamed from: lٖٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14695l extends AbstractC1392l {
    public final float admob;
    public final float amazon;
    public final boolean billing;
    public final float crashlytics;
    public final boolean mopub;
    public final float purchase;
    public final float subs;

    public C14695l(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = f3;
        this.billing = z;
        this.mopub = z2;
        this.admob = f4;
        this.subs = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14695l)) {
            return false;
        }
        C14695l c14695l = (C14695l) obj;
        return Float.compare(this.crashlytics, c14695l.crashlytics) == 0 && Float.compare(this.amazon, c14695l.amazon) == 0 && Float.compare(this.purchase, c14695l.purchase) == 0 && this.billing == c14695l.billing && this.mopub == c14695l.mopub && Float.compare(this.admob, c14695l.admob) == 0 && Float.compare(this.subs, c14695l.subs) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.subs) + AbstractC9029l.mopub((((AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.crashlytics) * 31, this.amazon, 31), this.purchase, 31) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31, this.admob, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("ArcTo(horizontalEllipseRadius=", this.crashlytics, ", verticalEllipseRadius=", this.amazon, ", theta=");
        sbTapsense.append(this.purchase);
        sbTapsense.append(", isMoreThanHalf=");
        sbTapsense.append(this.billing);
        sbTapsense.append(", isPositiveArc=");
        sbTapsense.append(this.mopub);
        sbTapsense.append(", arcStartX=");
        sbTapsense.append(this.admob);
        sbTapsense.append(", arcStartY=");
        sbTapsense.append(this.subs);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
