package defpackage;

/* JADX INFO: renamed from: lؓۜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2135l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public EnumC14176l f4774l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f4775l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f4776l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C18128l f4777l;

    public static C2135l admob() {
        C2135l c2135l = new C2135l();
        c2135l.f4774l = EnumC14176l.INV;
        c2135l.f4777l = C18128l.f35421l;
        return c2135l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C16093l c16093l = null;
        try {
            try {
                C16093l.f31532l.getClass();
                subs(new C16093l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c16093l != null) {
                    subs(c16093l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C16093l c16093l2 = (C16093l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c16093l = c16093l2;
                if (c16093l != null) {
                    subs(c16093l);
                }
                throw th;
            }
        }
    }

    public final C16093l billing() {
        C16093l c16093l = new C16093l(this);
        int i = this.f4775l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c16093l.f31533l = this.f4774l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c16093l.f31538l = this.f4777l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c16093l.f31537l = this.f4776l;
        c16093l.f31535l = i2;
        return c16093l;
    }

    public final Object clone() {
        C2135l c2135lAdmob = admob();
        c2135lAdmob.subs(billing());
        return c2135lAdmob;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C16093l c16093lBilling = billing();
        if (c16093lBilling.yandex()) {
            return c16093lBilling;
        }
        throw new C6451l();
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        subs((C16093l) abstractC4730l);
        return this;
    }

    public final void subs(C16093l c16093l) {
        C18128l c18128l;
        if (c16093l == C16093l.f31531l) {
            return;
        }
        if ((c16093l.f31535l & 1) == 1) {
            EnumC14176l enumC14176l = c16093l.f31533l;
            enumC14176l.getClass();
            this.f4775l = 1 | this.f4775l;
            this.f4774l = enumC14176l;
        }
        if ((c16093l.f31535l & 2) == 2) {
            C18128l c18128l2 = c16093l.f31538l;
            if ((this.f4775l & 2) != 2 || (c18128l = this.f4777l) == C18128l.f35421l) {
                this.f4777l = c18128l2;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l);
                c7699lAds.isPro(c18128l2);
                this.f4777l = c7699lAds.admob();
            }
            this.f4775l |= 2;
        }
        if ((c16093l.f31535l & 4) == 4) {
            int i = c16093l.f31537l;
            this.f4775l = 4 | this.f4775l;
            this.f4776l = i;
        }
        this.f5168l = this.f5168l.billing(c16093l.f31536l);
    }
}
