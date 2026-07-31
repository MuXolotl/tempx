package defpackage;

/* JADX INFO: renamed from: lٌٔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8786l extends AbstractC12055l implements InterfaceC2901l {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC1220l f18088l;

    public C8786l(AbstractC0601l abstractC0601l, String str, Object obj, C6084l c6084l) {
        super(abstractC0601l, str, obj, c6084l);
        this.f18088l = AbstractC9968l.crashlytics(2, new C7335l(this, 0));
        AbstractC9968l.crashlytics(2, new C7335l(this, 1));
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC14626l crashlytics() {
        return (C9264l) this.f18088l.getValue();
    }

    @Override // defpackage.AbstractC12055l
    /* JADX INFO: renamed from: extends */
    public final AbstractC1952l mo1343extends() {
        return (C9264l) this.f18088l.getValue();
    }

    @Override // defpackage.InterfaceC2901l
    public final Object get() {
        return ((C9264l) this.f18088l.getValue()).pro(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC1367l crashlytics() {
        return (C9264l) this.f18088l.getValue();
    }
}
