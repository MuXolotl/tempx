package defpackage;

/* JADX INFO: renamed from: lَٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10296l extends AbstractC13948l {
    public final int amazon;
    public final /* synthetic */ int crashlytics = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10296l(int i) {
        StringBuilder sbSignature = AbstractC2812l.Signature("must have at least ", i, " value parameter");
        sbSignature.append(i > 1 ? "s" : "");
        super(sbSignature.toString(), 1);
        this.amazon = i;
    }

    @Override // defpackage.InterfaceC4121l
    public final boolean loadAd(C12113l c12113l) {
        int i = this.crashlytics;
        int i2 = this.amazon;
        switch (i) {
            case 0:
                return c12113l.mo1007finally().size() >= i2;
            default:
                return c12113l.mo1007finally().size() == i2;
        }
    }

    public C10296l() {
        super("must have exactly 2 value parameters", 1);
        this.amazon = 2;
    }
}
