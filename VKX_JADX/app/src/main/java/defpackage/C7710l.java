package defpackage;

/* JADX INFO: renamed from: lًْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7710l implements InterfaceC14029l, InterfaceC1840l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC12932l f16184l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1854l f16185l;

    public C7710l(C1854l c1854l, InterfaceC12932l interfaceC12932l) {
        this.f16185l = c1854l;
        this.f16184l = interfaceC12932l;
    }

    @Override // defpackage.InterfaceC1840l
    public final InterfaceC1840l admob() {
        return this.f16185l;
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return this.f16184l;
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        this.f16185l.subs(obj);
    }
}
