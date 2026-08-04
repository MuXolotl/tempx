package defpackage;

/* JADX INFO: renamed from: lِٟؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12022l extends C15060l implements InterfaceC2463l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final InterfaceC1220l f23956l;

    public C12022l(AbstractC0601l abstractC0601l, String str, String str2, Object obj) {
        super(abstractC0601l, str, str2, obj);
        this.f23956l = AbstractC9968l.crashlytics(2, new C7646l(10, this));
    }

    @Override // defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC3754l amazon() {
        return (C11369l) this.f23956l.getValue();
    }

    @Override // defpackage.InterfaceC2463l
    public final void appmetrica(Object obj, Object obj2) {
        ((C11369l) this.f23956l.getValue()).pro(obj, obj2);
    }

    @Override // defpackage.C15060l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C15060l mo822throw(C4233l c4233l) {
        return new C12022l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.C15060l, defpackage.AbstractC1112l
    /* JADX INFO: renamed from: throw */
    public final AbstractC1112l mo822throw(C4233l c4233l) {
        return new C12022l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.InterfaceC2463l
    public final InterfaceC0109l amazon() {
        return (C11369l) this.f23956l.getValue();
    }

    public C12022l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f23956l = AbstractC9968l.crashlytics(2, new C7646l(10, this));
    }
}
