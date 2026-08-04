package defpackage;

/* JADX INFO: renamed from: lؙْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0890l implements InterfaceC16975l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5978l f2546l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5597l f2547l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2548l;

    public /* synthetic */ C0890l(C5597l c5597l, C5978l c5978l, C7977l c7977l, int i) {
        this.f2548l = i;
        this.f2547l = c5597l;
        this.f2546l = c5978l;
    }

    @Override // defpackage.InterfaceC16975l
    public final void invoke(Object obj) {
        int i = this.f2548l;
        C5978l c5978l = this.f2546l;
        C5597l c5597l = this.f2547l;
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        switch (i) {
            case 0:
                interfaceC5252l.pro(c5597l, c5978l);
                break;
            default:
                interfaceC5252l.vip(c5597l, c5978l);
                break;
        }
    }
}
