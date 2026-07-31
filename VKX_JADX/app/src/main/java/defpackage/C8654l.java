package defpackage;

/* JADX INFO: renamed from: lًٌ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8654l extends AbstractC7444l {
    public final double admob;
    public final C2759l subs;

    public C8654l(double d, C2759l c2759l) {
        this.admob = d;
        this.subs = c2759l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8654l)) {
            return false;
        }
        C8654l c8654l = (C8654l) obj;
        return Double.compare(this.admob, c8654l.admob) == 0 && this.subs.equals(c8654l.subs);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.admob);
        return (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + this.subs.f5987l;
    }

    public final String toString() {
        return "Failure(quality=" + this.admob + ", failureStatusCode=" + this.subs + ')';
    }
}
