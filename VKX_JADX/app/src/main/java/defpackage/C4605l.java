package defpackage;

/* JADX INFO: renamed from: lؗؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4605l implements InterfaceC16975l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f9345l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9346l;

    public /* synthetic */ C4605l(int i, float f) {
        this.f9346l = i;
        this.f9345l = f;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        int i = this.f9346l;
        float f = this.f9345l;
        C18602l c18602l = (C18602l) obj;
        switch (i) {
            case 3:
                c18602l.crashlytics(f);
                break;
            default:
                c18602l.mo2755else(f);
                break;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f9346l;
        float f = this.f9345l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.adcel(f);
                break;
            case 1:
                interfaceC13521l.adcel(f);
                break;
            default:
                interfaceC13521l.adcel(f);
                break;
        }
    }
}
