package defpackage;

/* JADX INFO: renamed from: lًؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4750l implements InterfaceC16975l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3852l f9773l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9774l;

    public /* synthetic */ C4750l(C3852l c3852l, int i) {
        this.f9774l = i;
        this.f9773l = c3852l;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        ((C18602l) obj).mo2812transient(this.f9773l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f9774l;
        C3852l c3852l = this.f9773l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.mo2739package(c3852l);
                break;
            default:
                interfaceC13521l.mo2743synchronized(c3852l);
                break;
        }
    }
}
