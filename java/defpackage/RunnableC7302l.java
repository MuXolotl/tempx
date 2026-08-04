package defpackage;

/* JADX INFO: renamed from: lؚٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7302l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9294l f15147l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18595l f15148l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15149l;

    public /* synthetic */ RunnableC7302l(C18595l c18595l, C9294l c9294l, int i) {
        this.f15149l = i;
        this.f15148l = c18595l;
        this.f15147l = c9294l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15149l) {
            case 0:
                C18595l c18595l = this.f15148l;
                C9294l c9294l = this.f15147l;
                synchronized (c9294l) {
                }
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                String str = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                C5597l c5597lM4395default = c17505l.m4395default((C5019l) c17505l.f34108l.f3604l);
                c17505l.m4401super(c5597lM4395default, 1013, new C11111l(c5597lM4395default, c9294l, 1));
                break;
            default:
                C18595l c18595l2 = this.f15148l;
                C9294l c9294l2 = this.f15147l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2 = (SurfaceHolderCallbackC18330l) c18595l2.f36316l;
                String str2 = AbstractC15323l.yandex;
                C17505l c17505l2 = surfaceHolderCallbackC18330l2.yandex.f34701l;
                C5597l c5597lM4397goto = c17505l2.m4397goto();
                c17505l2.m4401super(c5597lM4397goto, 1007, new C11111l(c5597lM4397goto, c9294l2, 0));
                break;
        }
    }
}
