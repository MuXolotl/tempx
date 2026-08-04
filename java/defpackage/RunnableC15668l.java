package defpackage;

/* JADX INFO: renamed from: lٕٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC15668l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Exception f30631l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18595l f30632l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30633l;

    public /* synthetic */ RunnableC15668l(C18595l c18595l, Exception exc, int i) {
        this.f30633l = i;
        this.f30632l = c18595l;
        this.f30631l = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f30633l;
        Exception exc = this.f30631l;
        C18595l c18595l = this.f30632l;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                String str = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                C5597l c5597lM4397goto = c17505l.m4397goto();
                c17505l.m4401super(c5597lM4397goto, 1029, new C18725l(c5597lM4397goto, exc, 16));
                break;
            default:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2 = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                String str2 = AbstractC15323l.yandex;
                C17505l c17505l2 = surfaceHolderCallbackC18330l2.yandex.f34701l;
                C5597l c5597lM4397goto2 = c17505l2.m4397goto();
                c17505l2.m4401super(c5597lM4397goto2, 1014, new C18725l(c5597lM4397goto2, exc, 24));
                break;
        }
    }
}
