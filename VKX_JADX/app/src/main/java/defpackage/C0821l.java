package defpackage;

/* JADX INFO: renamed from: lٌؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0821l extends AbstractC4317l implements InterfaceC12563l {
    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final AbstractC14318l mo686abstract(C16017l c16017l) {
        return AbstractC3605l.subs(this.f8857l.mo686abstract(c16017l), this.f8856l.mo686abstract(c16017l));
    }

    @Override // defpackage.InterfaceC12563l
    public final boolean advert() {
        AbstractC15211l abstractC15211l = this.f8857l;
        return (abstractC15211l.mo1339native().pro() instanceof InterfaceC16902l) && AbstractC8576l.yandex(abstractC15211l.mo1339native(), this.f8856l.mo1339native());
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: default */
    public final AbstractC14318l mo1else(C14945l c14945l) {
        return new C0821l(this.f8857l, this.f8856l);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        return new C0821l(this.f8857l, this.f8856l);
    }

    @Override // defpackage.AbstractC4317l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final AbstractC15211l mo687implements() {
        return this.f8857l;
    }

    @Override // defpackage.AbstractC4317l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final String mo688l(C10822l c10822l, C10822l c10822l2) {
        boolean zVip = c10822l2.yandex.vip();
        AbstractC15211l abstractC15211l = this.f8856l;
        AbstractC15211l abstractC15211l2 = this.f8857l;
        if (!zVip) {
            return c10822l.inmobi(c10822l.m2996interface(abstractC15211l2), c10822l.m2996interface(abstractC15211l), AbstractC12300l.billing(this));
        }
        return "(" + c10822l.m2996interface(abstractC15211l2) + ".." + c10822l.m2996interface(abstractC15211l) + ')';
    }

    @Override // defpackage.InterfaceC12563l
    public final AbstractC14318l pro(AbstractC18041l abstractC18041l) {
        AbstractC14318l abstractC14318lSubs;
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            abstractC14318lSubs = abstractC14318lMo3847class;
        } else {
            if (!(abstractC14318lMo3847class instanceof AbstractC15211l)) {
                C18725l.billing();
                return null;
            }
            AbstractC15211l abstractC15211l = (AbstractC15211l) abstractC14318lMo3847class;
            abstractC14318lSubs = AbstractC3605l.subs(abstractC15211l, abstractC15211l.mo8static(true));
        }
        return AbstractC5170l.purchase(abstractC14318lSubs, AbstractC5170l.amazon(abstractC14318lMo3847class));
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: static */
    public final AbstractC14318l mo8static(boolean z) {
        return AbstractC3605l.subs(this.f8857l.mo8static(z), this.f8856l.mo8static(z));
    }

    @Override // defpackage.AbstractC4317l
    public final String toString() {
        return "(" + this.f8857l + ".." + this.f8856l + ')';
    }
}
