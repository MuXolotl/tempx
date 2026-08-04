package defpackage;

/* JADX INFO: renamed from: lِ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC11914l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f23755l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23756l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23757l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f23758l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f23759l;

    public /* synthetic */ RunnableC11914l(Object obj, int i, long j, long j2, int i2) {
        this.f23757l = i2;
        this.f23758l = obj;
        this.f23756l = i;
        this.f23755l = j;
        this.f23759l = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23757l;
        Object obj = this.f23758l;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) ((C18595l) obj).f36316l;
                String str = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                final C5597l c5597lM4397goto = c17505l.m4397goto();
                final int i2 = this.f23756l;
                final long j = this.f23755l;
                final long j2 = this.f23759l;
                c17505l.m4401super(c5597lM4397goto, 1011, new InterfaceC16975l() { // from class: lَٛۛ
                    @Override // defpackage.InterfaceC16975l
                    public final void invoke(Object obj2) {
                        ((InterfaceC5252l) obj2).mo1748strictfp(c5597lM4397goto, i2, j, j2);
                    }
                });
                break;
            default:
                C17505l c17505l2 = ((C1766l) obj).loadAd;
                C1424l c1424l = c17505l2.f34108l;
                C5597l c5597lM4395default = c17505l2.m4395default(((AbstractC1186l) c1424l.f3602l).isEmpty() ? null : (C5019l) AbstractC11356l.purchase((AbstractC1186l) c1424l.f3602l));
                c17505l2.m4401super(c5597lM4395default, 1006, new C10213l(c5597lM4395default, this.f23756l, this.f23755l, this.f23759l));
                break;
        }
    }
}
