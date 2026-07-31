package defpackage;

/* JADX INFO: renamed from: lَّٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10477l implements InterfaceC18565l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final double f21339l;

    public C10477l(double d) {
        this.f21339l = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10477l) && Double.compare(this.f21339l, ((C10477l) obj).f21339l) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f21339l);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // defpackage.InterfaceC18565l
    public final float mopub(float f) {
        return (float) AbstractC16358l.billing(f, this.f21339l);
    }

    public final String toString() {
        return "GammaTransferFunctions(gamma=" + this.f21339l + ')';
    }

    @Override // defpackage.InterfaceC18565l
    public final float vip(float f) {
        return (float) AbstractC16358l.billing(f, 1.0d / this.f21339l);
    }
}
