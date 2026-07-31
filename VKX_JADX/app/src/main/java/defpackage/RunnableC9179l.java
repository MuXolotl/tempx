package defpackage;

/* JADX INFO: renamed from: lٌۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC9179l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15691l f18882l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18883l;

    public /* synthetic */ RunnableC9179l(C15691l c15691l, int i) {
        this.f18883l = i;
        this.f18882l = c15691l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18883l;
        C15691l c15691l = this.f18882l;
        switch (i) {
            case 0:
                c15691l.crashlytics();
                break;
            default:
                c15691l.admob.cancel(true);
                break;
        }
    }
}
