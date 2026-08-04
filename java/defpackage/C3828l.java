package defpackage;

/* JADX INFO: renamed from: lؖؐٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3828l extends AbstractC1392l {
    public final float amazon;
    public final float crashlytics;

    public C3828l(float f, float f2) {
        super(3);
        this.crashlytics = f;
        this.amazon = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3828l)) {
            return false;
        }
        C3828l c3828l = (C3828l) obj;
        return Float.compare(this.crashlytics, c3828l.crashlytics) == 0 && Float.compare(this.amazon, c3828l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + (Float.floatToIntBits(this.crashlytics) * 31);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.crashlytics + ", dy=" + this.amazon + ")";
    }
}
