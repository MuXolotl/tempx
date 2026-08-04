package defpackage;

/* JADX INFO: renamed from: lًٜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8113l extends AbstractC1872l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C8113l f16906l = new C8113l();

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        C5650l c5650l = (C5650l) interfaceC12932l.mo245l(C5650l.f12000l);
        if (c5650l != null) {
            c5650l.f12001l = true;
        } else {
            C10754l.ads("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: while */
    public final AbstractC1872l mo1066while(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
