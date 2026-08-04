package defpackage;

/* JADX INFO: renamed from: lً۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8304l implements InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f17200l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f17201l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17202l;

    public /* synthetic */ C8304l(C13208l c13208l, float f, int i) {
        this.f17202l = i;
        this.f17201l = c13208l;
        this.f17200l = f;
    }

    @Override // defpackage.InterfaceC11724l
    public final void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f17202l;
        float f = this.f17200l;
        C13208l c13208l = this.f17201l;
        switch (i2) {
            case 0:
                interfaceC4725l.mo465private(c13208l.crashlytics, i, f);
                break;
            case 1:
                interfaceC4725l.mo427extends(c13208l.crashlytics, i, f);
                break;
            default:
                int iM3611l = c13208l.m3611l();
                BinderC11857l binderC11857l = c13208l.crashlytics;
                if (iM3611l < 6) {
                    interfaceC4725l.mo427extends(binderC11857l, i, f);
                } else {
                    interfaceC4725l.advert(binderC11857l, i);
                }
                break;
        }
    }
}
