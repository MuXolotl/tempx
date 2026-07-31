package defpackage;

/* JADX INFO: renamed from: lْؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5262l extends C2000l implements InterfaceC5465l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final InterfaceC1220l f11346l;

    public C5262l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f11346l = AbstractC9968l.crashlytics(2, new C7646l(9, this));
    }

    @Override // defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC3754l amazon() {
        return (C17083l) this.f11346l.getValue();
    }

    @Override // defpackage.C2000l
    /* JADX INFO: renamed from: switch */
    public final C2000l mo822throw(C4233l c4233l) {
        return new C5262l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.C2000l, defpackage.AbstractC1112l
    /* JADX INFO: renamed from: throw */
    public final AbstractC1112l mo822throw(C4233l c4233l) {
        return new C5262l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.InterfaceC5465l, defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC16345l amazon() {
        return (C17083l) this.f11346l.getValue();
    }

    public C5262l(AbstractC0601l abstractC0601l, String str, String str2, Object obj) {
        super(abstractC0601l, str, str2, obj);
        this.f11346l = AbstractC9968l.crashlytics(2, new C7646l(9, this));
    }
}
