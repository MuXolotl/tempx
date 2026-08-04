package defpackage;

/* JADX INFO: renamed from: lٔٝۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C15041l extends AbstractC2711l implements InterfaceC7547l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final InterfaceC1220l f29562l;

    public C15041l(AbstractC0601l abstractC0601l, String str, String str2) {
        super(abstractC0601l, str, str2, C11128l.f22339l);
        this.f29562l = AbstractC9968l.crashlytics(2, new C18053l(this, 0));
        AbstractC9968l.crashlytics(2, new C18053l(this, 1));
    }

    @Override // defpackage.AbstractC2711l
    /* JADX INFO: renamed from: case */
    public final AbstractC3258l mo1104case() {
        return (C0859l) this.f29562l.getValue();
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final C0859l crashlytics() {
        return (C0859l) this.f29562l.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0859l) this.f29562l.getValue()).pro(obj, obj2);
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: switch, reason: not valid java name and merged with bridge method [inline-methods] */
    public C15041l mo822throw(C4233l c4233l) {
        return new C15041l(this.f5867l, mo818extends(), c4233l);
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC14626l crashlytics() {
        return (C0859l) this.f29562l.getValue();
    }

    public C15041l(AbstractC0601l abstractC0601l, InterfaceC10696l interfaceC10696l, C4233l c4233l) {
        super(abstractC0601l, interfaceC10696l, c4233l);
        this.f29562l = AbstractC9968l.crashlytics(2, new C18053l(this, 0));
        AbstractC9968l.crashlytics(2, new C18053l(this, 1));
    }
}
