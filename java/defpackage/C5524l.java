package defpackage;

/* JADX INFO: renamed from: lؘؚٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5524l implements InterfaceC16975l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2040l f11794l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5597l f11795l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11796l;

    public /* synthetic */ C5524l(C5597l c5597l, C2040l c2040l, int i) {
        this.f11796l = i;
        this.f11795l = c5597l;
        this.f11794l = c2040l;
    }

    @Override // defpackage.InterfaceC16975l
    public final void invoke(Object obj) {
        int i = this.f11796l;
        C2040l c2040l = this.f11794l;
        C5597l c5597l = this.f11795l;
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        switch (i) {
            case 0:
                interfaceC5252l.metrica(c5597l, c2040l);
                break;
            default:
                interfaceC5252l.mo1747private(c5597l, c2040l);
                break;
        }
    }
}
