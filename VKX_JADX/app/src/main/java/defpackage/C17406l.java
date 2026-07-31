package defpackage;

/* JADX INFO: renamed from: lٕٗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17406l implements InterfaceC0945l, InterfaceC3266l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C17425l f33909l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f33910l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33911l;

    public /* synthetic */ C17406l(int i, C17425l c17425l, String str) {
        this.f33911l = i;
        this.f33910l = str;
        this.f33909l = c17425l;
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        int i2 = this.f33911l;
        C17425l c17425l = this.f33909l;
        String str = this.f33910l;
        switch (i2) {
            case 1:
                return c3726l.m1420throws(c6499l, str, c17425l);
            default:
                return c3726l.applovin(c6499l, str, c17425l);
        }
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        interfaceC3270l.subs(i, this.f33909l, this.f33910l);
    }
}
