package defpackage;

/* JADX INFO: renamed from: lِؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11630l implements InterfaceC18565l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C11630l f23348l = new C11630l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final double f23347l = (AbstractC16358l.billing(0.018d, 0.45d) * 1.099d) - 0.099d;

    @Override // defpackage.InterfaceC18565l
    public final float mopub(float f) {
        double d = f;
        return (d < f23347l ? Float.valueOf(f / 4.5f) : Double.valueOf(AbstractC16358l.billing((d + 0.099d) / 1.099d, 2.2222222222222223d))).floatValue();
    }

    @Override // defpackage.InterfaceC18565l
    public final float vip(float f) {
        double d = f;
        return (float) (d < 0.018d ? d * 4.5d : (AbstractC16358l.billing(d, 0.45d) * 1.099d) - 0.099d);
    }
}
