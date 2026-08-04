package defpackage;

/* JADX INFO: renamed from: lؙّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC13019l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f25497l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13645l f25498l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25499l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f25500l;

    public /* synthetic */ RunnableC13019l(C13645l c13645l, int i, long j) {
        this.f25498l = c13645l;
        this.f25500l = i;
        this.f25497l = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25499l;
        int i2 = this.f25500l;
        long j = this.f25497l;
        C13645l c13645l = this.f25498l;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c13645l.f26670l;
                String str = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                C5597l c5597lM4395default = c17505l.m4395default((C5019l) c17505l.f34108l.f3604l);
                c17505l.m4401super(c5597lM4395default, 1018, new C14389l(i2, j, c5597lM4395default));
                break;
            default:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2 = (SurfaceHolderCallbackC18330l) c13645l.f26670l;
                String str2 = AbstractC15323l.yandex;
                C17505l c17505l2 = surfaceHolderCallbackC18330l2.yandex.f34701l;
                C5597l c5597lM4395default2 = c17505l2.m4395default((C5019l) c17505l2.f34108l.f3604l);
                c17505l2.m4401super(c5597lM4395default2, 1021, new C18725l(i2, j, c5597lM4395default2));
                break;
        }
    }

    public /* synthetic */ RunnableC13019l(C13645l c13645l, long j, int i) {
        this.f25498l = c13645l;
        this.f25497l = j;
        this.f25500l = i;
    }
}
