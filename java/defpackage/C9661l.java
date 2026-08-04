package defpackage;

/* JADX INFO: renamed from: lٍٟٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9661l implements InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2427l f19742l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f19743l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19744l;

    public /* synthetic */ C9661l(C13208l c13208l, C2427l c2427l, int i) {
        this.f19744l = i;
        this.f19743l = c13208l;
        this.f19742l = c2427l;
    }

    @Override // defpackage.InterfaceC11724l
    public final void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f19744l;
        C2427l c2427l = this.f19742l;
        C13208l c13208l = this.f19743l;
        switch (i2) {
            case 0:
                interfaceC4725l.mo440l(c13208l.crashlytics, i, c2427l.crashlytics(c13208l.m3611l(), true), true);
                break;
            default:
                interfaceC4725l.mo449l(c13208l.crashlytics, i, c2427l.crashlytics(c13208l.m3611l(), true));
                break;
        }
    }
}
