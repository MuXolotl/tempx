package defpackage;

/* JADX INFO: renamed from: lٍؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2289l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3716l f4981l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4982l;

    public /* synthetic */ RunnableC2289l(C3716l c3716l, int i) {
        this.f4982l = i;
        this.f4981l = c3716l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4982l;
        C3716l c3716l = this.f4981l;
        switch (i) {
            case 0:
                AbstractC12272l.admob().execute(new RunnableC2289l(c3716l, 1));
                break;
            default:
                if (!c3716l.vip) {
                    c3716l.purchase();
                }
                break;
        }
    }
}
