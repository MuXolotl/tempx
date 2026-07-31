package defpackage;

/* JADX INFO: renamed from: lٌٌۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8670l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C16811l f17854l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6845l f17855l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17856l;

    public /* synthetic */ RunnableC8670l(C6845l c6845l, C16811l c16811l, int i) {
        this.f17856l = i;
        this.f17855l = c6845l;
        this.f17854l = c16811l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17856l) {
            case 0:
                C6845l c6845l = this.f17855l;
                C16811l c16811l = this.f17854l;
                c6845l.f14308l = c16811l;
                if (c6845l.f14307l) {
                    c6845l.smaato(c16811l);
                }
                c6845l.yandex(new RunnableC8670l(c6845l, c16811l, 1), new ExecutorC12010l(2, c6845l));
                break;
            default:
                C6845l c6845l2 = this.f17855l;
                C16811l c16811l2 = this.f17854l;
                if (c6845l2.f5919l instanceof C17783l) {
                    c16811l2.release();
                }
                break;
        }
    }
}
