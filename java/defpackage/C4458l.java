package defpackage;

/* JADX INFO: renamed from: lؖۢؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4458l extends C3436l implements InterfaceC2463l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final InterfaceC1220l f9081l;

    public C4458l(AbstractC0601l abstractC0601l, String str, Object obj, C6084l c6084l) {
        super(abstractC0601l, str, obj, c6084l);
        this.f9081l = AbstractC9968l.crashlytics(2, new C7646l(29, this));
    }

    @Override // defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC3754l amazon() {
        return (C7382l) this.f9081l.getValue();
    }

    @Override // defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        ((C7382l) this.f9081l.getValue()).pro(obj, obj2);
    }

    @Override // defpackage.InterfaceC2463l
    public final InterfaceC0109l amazon() {
        return (C7382l) this.f9081l.getValue();
    }
}
