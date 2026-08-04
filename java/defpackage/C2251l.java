package defpackage;

/* JADX INFO: renamed from: lؓۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2251l extends AbstractC1392l {
    public final float amazon;
    public final float crashlytics;

    public C2251l(float f, float f2) {
        super(1);
        this.crashlytics = f;
        this.amazon = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2251l)) {
            return false;
        }
        C2251l c2251l = (C2251l) obj;
        return Float.compare(this.crashlytics, c2251l.crashlytics) == 0 && Float.compare(this.amazon, c2251l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + (Float.floatToIntBits(this.crashlytics) * 31);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.crashlytics + ", dy=" + this.amazon + ")";
    }
}
