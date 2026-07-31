package defpackage;

/* JADX INFO: renamed from: lؚۧۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7667l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C16583l f16083l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18595l f16084l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16085l;

    public /* synthetic */ RunnableC7667l(C18595l c18595l, C16583l c16583l, int i) {
        this.f16085l = i;
        this.f16084l = c18595l;
        this.f16083l = c16583l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16085l;
        final C16583l c16583l = this.f16083l;
        C18595l c18595l = this.f16084l;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                String str = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                final C5597l c5597lM4397goto = c17505l.m4397goto();
                final int i2 = 1;
                c17505l.m4401super(c5597lM4397goto, 1032, new InterfaceC16975l() { // from class: lْۗ۟
                    @Override // defpackage.InterfaceC16975l
                    public final void invoke(Object obj) {
                        int i3 = i2;
                        C16583l c16583l2 = c16583l;
                        C5597l c5597l = c5597lM4397goto;
                        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
                        switch (i3) {
                            case 0:
                                interfaceC5252l.subscription(c5597l, c16583l2);
                                break;
                            default:
                                interfaceC5252l.signatures(c5597l, c16583l2);
                                break;
                        }
                    }
                });
                break;
            default:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2 = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                String str2 = AbstractC15323l.yandex;
                C17505l c17505l2 = surfaceHolderCallbackC18330l2.yandex.f34701l;
                final C5597l c5597lM4397goto2 = c17505l2.m4397goto();
                final int i3 = 0;
                c17505l2.m4401super(c5597lM4397goto2, 1031, new InterfaceC16975l() { // from class: lْۗ۟
                    @Override // defpackage.InterfaceC16975l
                    public final void invoke(Object obj) {
                        int i4 = i3;
                        C16583l c16583l2 = c16583l;
                        C5597l c5597l = c5597lM4397goto2;
                        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
                        switch (i4) {
                            case 0:
                                interfaceC5252l.subscription(c5597l, c16583l2);
                                break;
                            default:
                                interfaceC5252l.signatures(c5597l, c16583l2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
