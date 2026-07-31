package defpackage;

/* JADX INFO: renamed from: lٌٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8783l extends C9558l implements InterfaceC4469l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final InterfaceC1220l f18083l;

    public C8783l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f18083l = AbstractC9968l.crashlytics(2, new C7646l(12, this));
    }

    @Override // defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC3754l amazon() {
        return (C4960l) this.f18083l.getValue();
    }

    @Override // defpackage.C9558l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C9558l mo822throw(C4233l c4233l) {
        return new C8783l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.C9558l, defpackage.AbstractC1112l
    /* JADX INFO: renamed from: throw */
    public final AbstractC1112l mo822throw(C4233l c4233l) {
        return new C8783l(this.f5867l, mo818extends(), c4233l);
    }
}
