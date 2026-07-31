package defpackage;

/* JADX INFO: renamed from: l٘ؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17617l implements InterfaceC16975l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14723l f34283l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34284l;

    public /* synthetic */ C17617l(int i, C14723l c14723l) {
        this.f34284l = i;
        this.f34283l = c14723l;
    }

    @Override // defpackage.InterfaceC16975l
    public final void invoke(Object obj) {
        int i = this.f34284l;
        C14723l c14723l = this.f34283l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.appmetrica(c14723l);
                break;
            case 1:
                interfaceC13521l.signatures(c14723l);
                break;
            case 2:
                interfaceC13521l.appmetrica(c14723l);
                break;
            default:
                interfaceC13521l.signatures(c14723l);
                break;
        }
    }
}
