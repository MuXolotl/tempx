package defpackage;

/* JADX INFO: renamed from: lْٖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC16789l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f32805l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1080l f32806l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32807l;

    public /* synthetic */ RunnableC16789l(C1080l c1080l, int i, Object obj) {
        this.f32807l = i;
        this.f32806l = c1080l;
        this.f32805l = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f32807l;
        Object obj = this.f32805l;
        C1080l c1080l = this.f32806l;
        switch (i) {
            case 0:
                if (c1080l.f2972l == 0) {
                    c1080l.m789continue(obj);
                }
                break;
            default:
                int i2 = c1080l.f2972l - 1;
                c1080l.f2972l = i2;
                if (i2 == 0) {
                    c1080l.m789continue(obj);
                }
                break;
        }
    }
}
