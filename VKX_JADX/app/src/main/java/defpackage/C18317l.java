package defpackage;

/* JADX INFO: renamed from: l٘ۤٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18317l implements InterfaceC0945l, InterfaceC3266l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1186l f35821l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35822l;

    public /* synthetic */ C18317l(AbstractC1186l abstractC1186l, int i) {
        this.f35822l = i;
        this.f35821l = abstractC1186l;
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        return c3726l.ads(c6499l, this.f35821l);
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        int i2 = this.f35822l;
        AbstractC1186l abstractC1186l = this.f35821l;
        switch (i2) {
            case 0:
                interfaceC3270l.isPro(i, abstractC1186l);
                break;
            default:
                interfaceC3270l.isPro(i, abstractC1186l);
                break;
        }
    }
}
