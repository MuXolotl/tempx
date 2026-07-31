package defpackage;

/* JADX INFO: renamed from: lٜؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4252l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f8725l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8726l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f8727l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f8728l;

    public /* synthetic */ C4252l(int i) {
        this.f8726l = i;
    }

    public C4987l admob() {
        C4987l c4987l = new C4987l(this);
        int i = this.f8725l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c4987l.f10219l = this.f8728l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c4987l.f10223l = (C7362l) this.f8727l;
        c4987l.f10220l = i2;
        return c4987l;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C4987l c4987l = null;
        C14780l c14780l = null;
        try {
            try {
                switch (this.f8726l) {
                    case 0:
                        try {
                            C14780l.f28898l.getClass();
                            subs(new C14780l(c1718l, c3429l));
                            return this;
                        } catch (C12383l e) {
                            C14780l c14780l2 = (C14780l) e.f24472l;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                c14780l = c14780l2;
                                if (c14780l != null) {
                                    subs(c14780l);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            C4987l.f10218l.getClass();
                            isPro(new C4987l(c1718l));
                            return this;
                        } catch (C12383l e2) {
                            C4987l c4987l2 = (C4987l) e2.f24472l;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                c4987l = c4987l2;
                                if (c4987l != null) {
                                    isPro(c4987l);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public C14780l billing() {
        C14780l c14780l = new C14780l(this);
        int i = this.f8725l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c14780l.f28899l = this.f8728l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c14780l.f28903l = (C4207l) this.f8727l;
        c14780l.f28900l = i2;
        return c14780l;
    }

    public final Object clone() {
        switch (this.f8726l) {
            case 0:
                C4252l c4252l = new C4252l(0);
                c4252l.f8727l = C4207l.f8622l;
                c4252l.subs(billing());
                return c4252l;
            default:
                C4252l c4252l2 = new C4252l(1);
                c4252l2.f8727l = AbstractC7735l.f16231l;
                c4252l2.isPro(admob());
                return c4252l2;
        }
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        switch (this.f8726l) {
            case 0:
                C14780l c14780lBilling = billing();
                if (c14780lBilling.yandex()) {
                    return c14780lBilling;
                }
                throw new C6451l();
            default:
                C4987l c4987lAdmob = admob();
                if (c4987lAdmob.yandex()) {
                    return c4987lAdmob;
                }
                throw new C6451l();
        }
    }

    public void isPro(C4987l c4987l) {
        if (c4987l == C4987l.f10217l) {
            return;
        }
        int i = c4987l.f10220l;
        if ((i & 1) == 1) {
            int i2 = c4987l.f10219l;
            this.f8725l = 1 | this.f8725l;
            this.f8728l = i2;
        }
        if ((i & 2) == 2) {
            C7362l c7362l = c4987l.f10223l;
            c7362l.getClass();
            this.f8725l = 2 | this.f8725l;
            this.f8727l = c7362l;
        }
        this.f5168l = this.f5168l.billing(c4987l.f10221l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        switch (this.f8726l) {
            case 0:
                subs((C14780l) abstractC4730l);
                break;
            default:
                isPro((C4987l) abstractC4730l);
                break;
        }
        return this;
    }

    public void subs(C14780l c14780l) {
        C4207l c4207l;
        if (c14780l == C14780l.f28897l) {
            return;
        }
        int i = c14780l.f28900l;
        if ((i & 1) == 1) {
            int i2 = c14780l.f28899l;
            this.f8725l = 1 | this.f8725l;
            this.f8728l = i2;
        }
        if ((i & 2) == 2) {
            C4207l c4207l2 = c14780l.f28903l;
            if ((this.f8725l & 2) != 2 || (c4207l = (C4207l) this.f8727l) == C4207l.f8622l) {
                this.f8727l = c4207l2;
            } else {
                C13836l c13836lIsPro = C4207l.isPro(c4207l);
                c13836lIsPro.subs(c4207l2);
                this.f8727l = c13836lIsPro.billing();
            }
            this.f8725l |= 2;
        }
        this.f5168l = this.f5168l.billing(c14780l.f28901l);
    }
}
