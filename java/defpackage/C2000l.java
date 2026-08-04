package defpackage;

/* JADX INFO: renamed from: lؓٞٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2000l extends AbstractC2711l implements InterfaceC2901l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final InterfaceC1220l f4520l;

    public C2000l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f4520l = AbstractC9968l.crashlytics(2, new C4110l(this, 0));
        AbstractC9968l.crashlytics(2, new C4110l(this, 1));
    }

    @Override // defpackage.AbstractC2711l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final AbstractC3258l mo1104case() {
        return (C1547l) this.f4520l.getValue();
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC14626l crashlytics() {
        return (C1547l) this.f4520l.getValue();
    }

    @Override // defpackage.InterfaceC2901l
    public final Object get() {
        return ((C1547l) this.f4520l.getValue()).pro(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: switch, reason: not valid java name and merged with bridge method [inline-methods] */
    public C2000l mo822throw(C4233l c4233l) {
        return new C2000l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC1367l crashlytics() {
        return (C1547l) this.f4520l.getValue();
    }

    public C2000l(AbstractC0601l abstractC0601l, String str, String str2, Object obj) {
        super(abstractC0601l, str, str2, obj);
        this.f4520l = AbstractC9968l.crashlytics(2, new C4110l(this, 0));
        AbstractC9968l.crashlytics(2, new C4110l(this, 1));
    }
}
