package defpackage;

/* JADX INFO: renamed from: l٘ؐ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17598l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC10687l f34256l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9492l f34257l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34258l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C9992l f34259l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f34260l;

    public /* synthetic */ RunnableC17598l(InterfaceC9492l interfaceC9492l, InterfaceC10687l interfaceC10687l, long j, C9992l c9992l, int i) {
        this.f34258l = i;
        this.f34257l = interfaceC9492l;
        this.f34256l = interfaceC10687l;
        this.f34260l = j;
        this.f34259l = c9992l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34258l;
        C9992l c9992l = this.f34259l;
        long j = this.f34260l;
        InterfaceC10687l interfaceC10687l = this.f34256l;
        InterfaceC9492l interfaceC9492l = this.f34257l;
        switch (i) {
            case 0:
                interfaceC9492l.mo1762throw(interfaceC10687l, j, c9992l);
                break;
            default:
                interfaceC9492l.inmobi(interfaceC10687l, j, c9992l);
                break;
        }
    }
}
