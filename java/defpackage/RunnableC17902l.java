package defpackage;

/* JADX INFO: renamed from: l٘ٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17902l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC10687l f34851l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9492l f34852l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34853l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5899l f34854l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f34855l;

    public /* synthetic */ RunnableC17902l(InterfaceC9492l interfaceC9492l, InterfaceC10687l interfaceC10687l, long j, InterfaceC5899l interfaceC5899l, int i) {
        this.f34853l = i;
        this.f34852l = interfaceC9492l;
        this.f34851l = interfaceC10687l;
        this.f34855l = j;
        this.f34854l = interfaceC5899l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34853l;
        InterfaceC5899l interfaceC5899l = this.f34854l;
        long j = this.f34855l;
        InterfaceC10687l interfaceC10687l = this.f34851l;
        InterfaceC9492l interfaceC9492l = this.f34852l;
        switch (i) {
            case 0:
                interfaceC9492l.mo1759private(interfaceC10687l, j, (InterfaceC9595l) interfaceC5899l);
                break;
            default:
                interfaceC9492l.mo1761synchronized(interfaceC10687l, j, (C15331l) interfaceC5899l);
                break;
        }
    }
}
