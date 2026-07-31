package defpackage;

/* JADX INFO: renamed from: lؖٓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4109l implements InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f8460l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f8461l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8462l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C2427l f8463l;

    public /* synthetic */ C4109l(C13208l c13208l, int i, C2427l c2427l, int i2) {
        this.f8462l = i2;
        this.f8461l = c13208l;
        this.f8460l = i;
        this.f8463l = c2427l;
    }

    @Override // defpackage.InterfaceC11724l
    public final void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f8462l;
        C2427l c2427l = this.f8463l;
        int i3 = this.f8460l;
        C13208l c13208l = this.f8461l;
        switch (i2) {
            case 0:
                int iM3611l = c13208l.m3611l();
                BinderC11857l binderC11857l = c13208l.crashlytics;
                if (iM3611l < 2) {
                    interfaceC4725l.mo433interface(binderC11857l, i, i3 + 1, c2427l.crashlytics(c13208l.m3611l(), true));
                    interfaceC4725l.mo432instanceof(binderC11857l, i, i3);
                } else {
                    interfaceC4725l.mo445l(binderC11857l, i, i3, c2427l.crashlytics(c13208l.m3611l(), true));
                }
                break;
            default:
                interfaceC4725l.mo433interface(c13208l.crashlytics, i, i3, c2427l.crashlytics(c13208l.m3611l(), true));
                break;
        }
    }
}
