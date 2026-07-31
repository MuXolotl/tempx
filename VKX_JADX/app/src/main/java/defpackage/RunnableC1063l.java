package defpackage;

/* JADX INFO: renamed from: lؚٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1063l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f2940l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10559l f2941l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2942l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C11675l f2943l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2944l;

    public /* synthetic */ RunnableC1063l(C11675l c11675l, C10559l c10559l, long j, boolean z, int i) {
        this.f2942l = i;
        this.f2941l = c10559l;
        this.f2940l = j;
        this.f2944l = z;
        this.f2943l = c11675l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2942l;
        long j = this.f2940l;
        boolean z = this.f2944l;
        C10559l c10559l = this.f2941l;
        C11675l c11675l = this.f2943l;
        switch (i) {
            case 0:
                c11675l.m3202l(c10559l);
                c11675l.m3207l(c10559l, j, z);
                break;
            default:
                c11675l.m3202l(c10559l);
                c11675l.m3207l(c10559l, j, z);
                break;
        }
    }
}
