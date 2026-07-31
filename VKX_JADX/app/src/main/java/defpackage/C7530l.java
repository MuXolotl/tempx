package defpackage;

/* JADX INFO: renamed from: lؚٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7530l extends AbstractC3376l implements InterfaceC12563l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC15211l f15533l;

    public C7530l(AbstractC15211l abstractC15211l) {
        this.f15533l = abstractC15211l;
    }

    @Override // defpackage.AbstractC15211l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: abstract */
    public final AbstractC14318l mo686abstract(C16017l c16017l) {
        return new C7530l(this.f15533l.mo686abstract(c16017l));
    }

    @Override // defpackage.InterfaceC12563l
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        return z ? this.f15533l.mo8static(true) : this;
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final AbstractC15211l mo3l() {
        return this.f15533l;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return new C7530l(this.f15533l.mo686abstract(c16017l));
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final AbstractC3376l mo7l(AbstractC15211l abstractC15211l) {
        return new C7530l(abstractC15211l);
    }

    @Override // defpackage.InterfaceC12563l
    public final AbstractC14318l pro(AbstractC18041l abstractC18041l) {
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (!AbstractC12008l.billing(abstractC14318lMo3847class) && !AbstractC12008l.purchase(abstractC14318lMo3847class)) {
            return abstractC14318lMo3847class;
        }
        if (abstractC14318lMo3847class instanceof AbstractC15211l) {
            AbstractC15211l abstractC15211l = (AbstractC15211l) abstractC14318lMo3847class;
            AbstractC15211l abstractC15211lMo8static = abstractC15211l.mo8static(false);
            return !AbstractC12008l.billing(abstractC15211l) ? abstractC15211lMo8static : new C7530l(abstractC15211lMo8static);
        }
        if (!(abstractC14318lMo3847class instanceof AbstractC4317l)) {
            C18725l.billing();
            return null;
        }
        AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC14318lMo3847class;
        AbstractC15211l abstractC15211l2 = abstractC4317l.f8857l;
        AbstractC15211l abstractC15211lMo8static2 = abstractC15211l2.mo8static(false);
        if (AbstractC12008l.billing(abstractC15211l2)) {
            abstractC15211lMo8static2 = new C7530l(abstractC15211lMo8static2);
        }
        AbstractC15211l abstractC15211l3 = abstractC4317l.f8856l;
        AbstractC15211l abstractC15211lMo8static3 = abstractC15211l3.mo8static(false);
        if (AbstractC12008l.billing(abstractC15211l3)) {
            abstractC15211lMo8static3 = new C7530l(abstractC15211lMo8static3);
        }
        return AbstractC5170l.purchase(AbstractC3605l.subs(abstractC15211lMo8static2, abstractC15211lMo8static3), AbstractC5170l.amazon(abstractC14318lMo3847class));
    }

    @Override // defpackage.AbstractC3376l, defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        return false;
    }
}
