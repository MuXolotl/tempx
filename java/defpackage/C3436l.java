package defpackage;

/* JADX INFO: renamed from: lؙؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C3436l extends AbstractC12055l implements InterfaceC1835l {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC1220l f7310l;

    public C3436l(AbstractC0601l abstractC0601l, String str, Object obj, C6084l c6084l) {
        super(abstractC0601l, str, obj, c6084l);
        this.f7310l = AbstractC9968l.crashlytics(2, new C1532l(this, 0));
        AbstractC9968l.crashlytics(2, new C1532l(this, 1));
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC14626l crashlytics() {
        return (C17490l) this.f7310l.getValue();
    }

    @Override // defpackage.AbstractC12055l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final AbstractC1952l mo1343extends() {
        return (C17490l) this.f7310l.getValue();
    }

    @Override // defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        return ((C17490l) this.f7310l.getValue()).pro(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC11259l crashlytics() {
        return (C17490l) this.f7310l.getValue();
    }
}
