package defpackage;

/* JADX INFO: renamed from: lؘٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15502l implements InterfaceC16975l, InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f30295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30296l;

    public /* synthetic */ C15502l(C13208l c13208l, boolean z, int i) {
        this.f30296l = i;
        this.f30295l = c13208l;
        this.f30294l = z;
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f30296l;
        boolean z = this.f30294l;
        C13208l c13208l = this.f30295l;
        switch (i2) {
            case 1:
                interfaceC4725l.mo447l(c13208l.crashlytics, i, z);
                break;
            case 2:
                interfaceC4725l.mo452l(c13208l.crashlytics, i, z);
                break;
            default:
                interfaceC4725l.mo450l(c13208l.crashlytics, i, z);
                break;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f30296l;
        boolean z = this.f30294l;
        C13208l c13208l = this.f30295l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.inmobi(c13208l.adcel.tapsense, z);
                break;
            default:
                interfaceC13521l.inmobi(c13208l.adcel.tapsense, z);
                break;
        }
    }
}
