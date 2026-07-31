package defpackage;

/* JADX INFO: renamed from: lؓؐۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1542l implements InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f3828l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f3829l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3830l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f3831l;

    public /* synthetic */ C1542l(C13208l c13208l, int i, int i2, int i3) {
        this.f3830l = i3;
        this.f3829l = c13208l;
        this.f3828l = i;
        this.f3831l = i2;
    }

    @Override // defpackage.InterfaceC11724l
    public final void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f3830l;
        int i3 = this.f3831l;
        int i4 = this.f3828l;
        C13208l c13208l = this.f3829l;
        switch (i2) {
            case 0:
                interfaceC4725l.mo424abstract(c13208l.crashlytics, i, i4, i3);
                break;
            case 1:
                interfaceC4725l.mo467strictfp(c13208l.crashlytics, i, i4, i3);
                break;
            default:
                interfaceC4725l.mo438l(c13208l.crashlytics, i, i4, i3);
                break;
        }
    }
}
