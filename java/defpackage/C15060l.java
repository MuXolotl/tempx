package defpackage;

/* JADX INFO: renamed from: lٔٞۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C15060l extends AbstractC2711l implements InterfaceC1835l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final InterfaceC1220l f29590l;

    public C15060l(AbstractC0601l abstractC0601l, String str, String str2, Object obj) {
        super(abstractC0601l, str, str2, obj);
        this.f29590l = AbstractC9968l.crashlytics(2, new C11368l(this, 0));
        AbstractC9968l.crashlytics(2, new C11368l(this, 1));
    }

    @Override // defpackage.AbstractC2711l
    /* JADX INFO: renamed from: case */
    public final AbstractC3258l mo1104case() {
        return (C16317l) this.f29590l.getValue();
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC14626l crashlytics() {
        return (C16317l) this.f29590l.getValue();
    }

    @Override // defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return ((C16317l) this.f29590l.getValue()).pro(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: switch, reason: merged with bridge method [inline-methods] */
    public C15060l mo822throw(C4233l c4233l) {
        return new C15060l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC11259l crashlytics() {
        return (C16317l) this.f29590l.getValue();
    }

    public C15060l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f29590l = AbstractC9968l.crashlytics(2, new C11368l(this, 0));
        AbstractC9968l.crashlytics(2, new C11368l(this, 1));
    }
}
