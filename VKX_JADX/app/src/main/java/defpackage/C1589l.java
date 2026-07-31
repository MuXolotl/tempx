package defpackage;

/* JADX INFO: renamed from: lٟؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1589l implements InterfaceC2810l {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0435l yandex;

    public C1589l(DialogInterfaceOnCancelListenerC0435l dialogInterfaceOnCancelListenerC0435l) {
        this.yandex = dialogInterfaceOnCancelListenerC0435l;
    }

    @Override // defpackage.InterfaceC2810l
    public final void yandex(Object obj) {
        if (((InterfaceC3177l) obj) != null) {
            DialogInterfaceOnCancelListenerC0435l dialogInterfaceOnCancelListenerC0435l = this.yandex;
            if (dialogInterfaceOnCancelListenerC0435l.f1599l) {
                throw new IllegalStateException("Fragment " + dialogInterfaceOnCancelListenerC0435l + " did not return a View from onCreateView() or this was called before onCreateView().");
            }
        }
    }
}
