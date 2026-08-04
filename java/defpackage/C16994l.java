package defpackage;

/* JADX INFO: renamed from: lٌؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16994l extends C15041l implements InterfaceC4469l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final InterfaceC1220l f33127l;

    public C16994l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f33127l = AbstractC9968l.crashlytics(2, new C7646l(11, this));
    }

    @Override // defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC3754l amazon() {
        return (C3949l) this.f33127l.getValue();
    }

    @Override // defpackage.C15041l
    /* JADX INFO: renamed from: switch */
    public final C15041l mo822throw(C4233l c4233l) {
        return new C16994l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.C15041l, defpackage.AbstractC1112l
    /* JADX INFO: renamed from: throw */
    public final AbstractC1112l mo822throw(C4233l c4233l) {
        return new C16994l(this.f5867l, mo818extends(), c4233l);
    }
}
