package defpackage;

/* JADX INFO: renamed from: lٍٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C9558l extends AbstractC2711l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final InterfaceC1220l f19474l;

    public C9558l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f19474l = AbstractC9968l.crashlytics(2, new C7646l(13, this));
    }

    @Override // defpackage.AbstractC2711l
    /* JADX INFO: renamed from: case */
    public final AbstractC3258l mo1104case() {
        return (C4801l) this.f19474l.getValue();
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC14626l crashlytics() {
        return (C4801l) this.f19474l.getValue();
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: switch, reason: merged with bridge method [inline-methods] */
    public C9558l mo822throw(C4233l c4233l) {
        return new C9558l(this.f5867l, mo818extends(), c4233l);
    }
}
