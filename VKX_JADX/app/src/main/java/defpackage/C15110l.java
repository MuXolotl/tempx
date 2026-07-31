package defpackage;

/* JADX INFO: renamed from: lٔۘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15110l extends AbstractC3376l implements InterfaceC12563l, InterfaceC14361l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f29643l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC15211l f29644l;

    public C15110l(AbstractC15211l abstractC15211l, boolean z) {
        this.f29644l = abstractC15211l;
        this.f29643l = z;
    }

    @Override // defpackage.InterfaceC12563l
    public final boolean advert() {
        AbstractC15211l abstractC15211l = this.f29644l;
        abstractC15211l.mo1339native();
        return abstractC15211l.mo1339native().pro() instanceof InterfaceC16902l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        return z ? this.f29644l.mo8static(z) : this;
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final AbstractC15211l mo3l() {
        return this.f29644l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return new C15110l(this.f29644l.mo686abstract(c16017l), this.f29643l);
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final AbstractC3376l mo7l(AbstractC15211l abstractC15211l) {
        return new C15110l(abstractC15211l, this.f29643l);
    }

    @Override // defpackage.InterfaceC12563l
    public final AbstractC14318l pro(AbstractC18041l abstractC18041l) {
        return AbstractC14506l.billing(abstractC18041l.mo3847class(), this.f29643l);
    }

    @Override // defpackage.AbstractC3376l, defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        return false;
    }

    @Override // defpackage.AbstractC15211l
    public final String toString() {
        return this.f29644l + " & Any";
    }
}
