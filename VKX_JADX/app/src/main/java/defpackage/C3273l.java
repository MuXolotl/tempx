package defpackage;

/* JADX INFO: renamed from: lٌؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3273l extends AbstractC16682l implements InterfaceC0805l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3372l f7001l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7002l = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3273l(AbstractC3372l abstractC3372l) {
        C13772l c13772l = C13772l.f26879l;
        this.f7001l = abstractC3372l;
        super(c13772l);
    }

    @Override // defpackage.InterfaceC0805l
    /* JADX INFO: renamed from: continue */
    public final void mo685continue(InterfaceC12932l interfaceC12932l, Throwable th) {
        int i = this.f7002l;
        AbstractC3372l abstractC3372l = this.f7001l;
        switch (i) {
            case 0:
                ((AbstractC9694l) abstractC3372l).mo2721import(th);
                break;
            default:
                abstractC3372l.mo2721import(th);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3273l(AbstractC9694l abstractC9694l) {
        C13772l c13772l = C13772l.f26879l;
        this.f7001l = abstractC9694l;
        super(c13772l);
    }
}
