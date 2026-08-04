package defpackage;

/* JADX INFO: renamed from: lٓۙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14389l implements InterfaceC16975l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f28132l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5597l f28133l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28134l;

    public /* synthetic */ C14389l(C5597l c5597l, C2427l c2427l, int i) {
        this.f28134l = 8;
        this.f28133l = c5597l;
        this.f28132l = i;
    }

    @Override // defpackage.InterfaceC16975l
    public final void invoke(Object obj) {
        int i = this.f28134l;
        int i2 = this.f28132l;
        C5597l c5597l = this.f28133l;
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        switch (i) {
            case 0:
                interfaceC5252l.mo1749switch(c5597l, i2);
                break;
            case 1:
                interfaceC5252l.ad(c5597l, i2);
                break;
            case 2:
                interfaceC5252l.subs(c5597l, i2);
                break;
            case 3:
                interfaceC5252l.inmobi(c5597l, i2);
                break;
            case 4:
                interfaceC5252l.adcel(c5597l, i2);
                break;
            case 5:
                interfaceC5252l.smaato(c5597l, i2);
                break;
            case 6:
                interfaceC5252l.getClass();
                interfaceC5252l.appmetrica(c5597l, i2);
                break;
            case 7:
                interfaceC5252l.license(c5597l, i2);
                break;
            default:
                interfaceC5252l.advert(c5597l, i2);
                break;
        }
    }

    public /* synthetic */ C14389l(C5597l c5597l, int i, int i2) {
        this.f28134l = i2;
        this.f28133l = c5597l;
        this.f28132l = i;
    }

    public /* synthetic */ C14389l(int i, long j, C5597l c5597l) {
        this.f28134l = 5;
        this.f28133l = c5597l;
        this.f28132l = i;
    }
}
