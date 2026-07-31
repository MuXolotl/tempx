package defpackage;

/* JADX INFO: renamed from: lُؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1773l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f4190l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f4191l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4192l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f4193l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4194l;

    public /* synthetic */ RunnableC1773l(Object obj, Object obj2, long j, long j2, int i) {
        this.f4192l = i;
        this.f4194l = obj;
        this.f4193l = obj2;
        this.f4191l = j;
        this.f4190l = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4192l;
        Object obj = this.f4193l;
        Object obj2 = this.f4194l;
        switch (i) {
            case 0:
                String str = (String) obj;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) ((C18595l) obj2).f36316l;
                String str2 = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                C5597l c5597lM4397goto = c17505l.m4397goto();
                c17505l.m4401super(c5597lM4397goto, 1008, new C14086l(c5597lM4397goto, str, this.f4190l, this.f4191l, 0));
                break;
            case 1:
                ((InterfaceC9492l) obj2).isVip((InterfaceC10687l) obj, this.f4191l, this.f4190l);
                break;
            default:
                String str3 = (String) obj;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2 = (SurfaceHolderCallbackC18330l) ((C13645l) obj2).f26670l;
                String str4 = AbstractC15323l.yandex;
                C17505l c17505l2 = surfaceHolderCallbackC18330l2.yandex.f34701l;
                C5597l c5597lM4397goto2 = c17505l2.m4397goto();
                c17505l2.m4401super(c5597lM4397goto2, 1016, new C14086l(c5597lM4397goto2, str3, this.f4190l, this.f4191l, 2));
                break;
        }
    }
}
