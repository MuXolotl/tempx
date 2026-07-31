package defpackage;

/* JADX INFO: renamed from: lؚٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C14274l extends AbstractC13762l implements InterfaceC1840l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14029l f27949l;

    public C14274l(InterfaceC14029l interfaceC14029l, InterfaceC12932l interfaceC12932l) {
        super(interfaceC12932l, true);
        this.f27949l = interfaceC14029l;
    }

    @Override // defpackage.InterfaceC1840l
    public final InterfaceC1840l admob() {
        InterfaceC14029l interfaceC14029l = this.f27949l;
        if (interfaceC14029l instanceof InterfaceC1840l) {
            return (InterfaceC1840l) interfaceC14029l;
        }
        return null;
    }

    @Override // defpackage.C14750l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final boolean mo3846final() {
        return true;
    }

    @Override // defpackage.C14750l
    public void isPro(Object obj) {
        this.f27949l.subs(AbstractC13573l.loadAd(obj));
    }

    @Override // defpackage.C14750l
    public void purchase(Object obj) {
        AbstractC9853l.yandex(AbstractC17082l.billing(this.f27949l), AbstractC13573l.loadAd(obj));
    }

    /* JADX INFO: renamed from: lؔٙؕ */
    public void mo3795l() {
    }
}
