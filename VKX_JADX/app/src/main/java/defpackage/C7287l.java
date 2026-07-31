package defpackage;

/* JADX INFO: renamed from: lًؚٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7287l extends AbstractC3376l implements InterfaceC2708l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC18041l f15135l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC15211l f15136l;

    public C7287l(AbstractC15211l abstractC15211l, AbstractC18041l abstractC18041l) {
        this.f15136l = abstractC15211l;
        this.f15135l = abstractC18041l;
    }

    @Override // defpackage.InterfaceC2708l
    public final AbstractC14318l appmetrica() {
        return this.f15136l;
    }

    @Override // defpackage.AbstractC3376l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: default */
    public final AbstractC14318l mo1else(C14945l c14945l) {
        return new C7287l(this.f15136l, this.f15135l);
    }

    @Override // defpackage.AbstractC3376l, defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        return new C7287l(this.f15136l, this.f15135l);
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        return (AbstractC15211l) AbstractC5170l.purchase(this.f15136l.mo8static(z), this.f15135l.mo3847class().mo8static(z));
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final AbstractC15211l mo3l() {
        return this.f15136l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return (AbstractC15211l) AbstractC5170l.purchase(this.f15136l.mo686abstract(c16017l), this.f15135l);
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final AbstractC15211l mo0default(C14945l c14945l) {
        return new C7287l(this.f15136l, this.f15135l);
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final AbstractC3376l mo7l(AbstractC15211l abstractC15211l) {
        return new C7287l(abstractC15211l, this.f15135l);
    }

    @Override // defpackage.InterfaceC2708l
    public final AbstractC18041l mopub() {
        return this.f15135l;
    }

    @Override // defpackage.AbstractC15211l
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f15135l + ")] " + this.f15136l;
    }
}
