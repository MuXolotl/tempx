package defpackage;

/* JADX INFO: renamed from: lؙ۟ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6788l implements InterfaceC8671l, InterfaceC14342l, InterfaceC16975l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17804l f14221l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14222l;

    public /* synthetic */ C6788l(C17804l c17804l, int i) {
        this.f14222l = i;
        this.f14221l = c17804l;
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f14222l;
        C17804l c17804l = this.f14221l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 3:
                interfaceC13521l.mo2743synchronized(c17804l.f34704l);
                break;
            default:
                interfaceC13521l.mo2734else(c17804l.f34697l);
                break;
        }
    }

    @Override // defpackage.InterfaceC8671l
    public void smaato(Object obj, C4094l c4094l) {
        ((InterfaceC13521l) obj).applovin(this.f14221l.f34729l, new C3895l(c4094l));
    }

    @Override // defpackage.InterfaceC14342l
    public void yandex(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        int iIntValue = num.intValue();
        C17804l c17804l = this.f14221l;
        c17804l.m4415l();
        c17804l.m4417l(1, 10, num);
        c17804l.m4417l(2, 10, num);
        c17804l.f34677l.mopub(21, new C10503l(iIntValue, 1));
    }
}
