package defpackage;

/* JADX INFO: renamed from: lؙؚۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7603l implements InterfaceC16975l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f15647l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15648l;

    public /* synthetic */ C7603l(boolean z, int i) {
        this.f15648l = i;
        this.f15647l = z;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        int i = this.f15648l;
        boolean z = this.f15647l;
        C18602l c18602l = (C18602l) obj;
        switch (i) {
            case 4:
                c18602l.mo2753continue(z);
                break;
            case 5:
                c18602l.mo2803return(z);
                break;
            default:
                c18602l.ads(z);
                break;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f15648l;
        boolean z = this.f15647l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.mo2740private(z);
                break;
            case 1:
                interfaceC13521l.pro(z);
                break;
            case 2:
                interfaceC13521l.mo2740private(z);
                break;
            default:
                interfaceC13521l.pro(z);
                break;
        }
    }
}
