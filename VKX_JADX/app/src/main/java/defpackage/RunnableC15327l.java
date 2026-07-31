package defpackage;

/* JADX INFO: renamed from: lؙٔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC15327l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f29953l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f29954l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29955l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29956l;

    public /* synthetic */ RunnableC15327l(int i, Object obj, boolean z, boolean z2) {
        this.f29955l = i;
        this.f29956l = obj;
        this.f29954l = z;
        this.f29953l = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f29955l;
        boolean z = this.f29953l;
        boolean z2 = this.f29954l;
        C4619l c4619l = (C4619l) this.f29956l;
        switch (i) {
            case 0:
                C13645l.startapp((C13645l) c4619l.f9373l, z2, z);
                break;
            default:
                ((C13568l) c4619l.f9373l).advert(z2, z);
                break;
        }
    }
}
