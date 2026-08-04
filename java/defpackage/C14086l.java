package defpackage;

/* JADX INFO: renamed from: lَِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14086l implements InterfaceC16975l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f27442l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5597l f27443l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27444l;

    public /* synthetic */ C14086l(C5597l c5597l, String str, int i) {
        this.f27444l = i;
        this.f27443l = c5597l;
        this.f27442l = str;
    }

    @Override // defpackage.InterfaceC16975l
    public final void invoke(Object obj) {
        int i = this.f27444l;
        String str = this.f27442l;
        C5597l c5597l = this.f27443l;
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        switch (i) {
            case 0:
                interfaceC5252l.getClass();
                interfaceC5252l.mopub(c5597l, str);
                break;
            case 1:
                interfaceC5252l.isVip(c5597l, str);
                break;
            case 2:
                interfaceC5252l.getClass();
                interfaceC5252l.mo1743for(c5597l, str);
                break;
            default:
                interfaceC5252l.amazon(c5597l, str);
                break;
        }
    }

    public /* synthetic */ C14086l(C5597l c5597l, String str, long j, long j2, int i) {
        this.f27444l = i;
        this.f27443l = c5597l;
        this.f27442l = str;
    }
}
