package defpackage;

/* JADX INFO: renamed from: lًّۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC12464l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9159l f24594l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24595l;

    public /* synthetic */ RunnableC12464l(C9159l c9159l, int i) {
        this.f24595l = i;
        this.f24594l = c9159l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24595l;
        C9159l c9159l = this.f24594l;
        switch (i) {
            case 0:
                c9159l.f18826l = true;
                break;
            case 1:
                c9159l.signatures();
                break;
            default:
                if (!c9159l.f18844l) {
                    InterfaceC2417l interfaceC2417l = c9159l.f18834l;
                    interfaceC2417l.getClass();
                    interfaceC2417l.mo614throws(c9159l);
                }
                break;
        }
    }
}
