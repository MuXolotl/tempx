package defpackage;

/* JADX INFO: renamed from: lٍٓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14132l implements InterfaceC16975l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27626l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5597l f27627l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27628l;

    public /* synthetic */ C14132l(C5597l c5597l, boolean z, int i) {
        this.f27628l = i;
        this.f27627l = c5597l;
        this.f27626l = z;
    }

    @Override // defpackage.InterfaceC16975l
    public final void invoke(Object obj) {
        int i = this.f27628l;
        boolean z = this.f27626l;
        C5597l c5597l = this.f27627l;
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        switch (i) {
            case 0:
                interfaceC5252l.purchase(c5597l, z);
                break;
            case 1:
                interfaceC5252l.crashlytics(c5597l, z);
                break;
            case 2:
                interfaceC5252l.yandex(c5597l, z);
                break;
            default:
                interfaceC5252l.getClass();
                interfaceC5252l.mo1751throw(c5597l, z);
                break;
        }
    }
}
