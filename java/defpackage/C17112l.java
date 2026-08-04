package defpackage;

/* JADX INFO: renamed from: lٗٓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17112l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f33273l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33274l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f33275l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f33276l;

    public /* synthetic */ C17112l(int i) {
        this.f33274l = i;
    }

    public C6431l admob() {
        C6431l c6431l = new C6431l(this);
        int i = this.f33273l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c6431l.f13452l = this.f33276l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c6431l.f13456l = this.f33275l;
        c6431l.f13453l = i2;
        return c6431l;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C6431l c6431l = null;
        C17113l c17113l = null;
        try {
            try {
                switch (this.f33274l) {
                    case 0:
                        try {
                            C17113l.f33278l.getClass();
                            subs(new C17113l(c1718l));
                            return this;
                        } catch (C12383l e) {
                            C17113l c17113l2 = (C17113l) e.f24472l;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                c17113l = c17113l2;
                                if (c17113l != null) {
                                    subs(c17113l);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            C6431l.f13451l.getClass();
                            isPro(new C6431l(c1718l));
                            return this;
                        } catch (C12383l e2) {
                            C6431l c6431l2 = (C6431l) e2.f24472l;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                c6431l = c6431l2;
                                if (c6431l != null) {
                                    isPro(c6431l);
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

    public C17113l billing() {
        C17113l c17113l = new C17113l(this);
        int i = this.f33273l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c17113l.f33279l = this.f33276l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c17113l.f33283l = this.f33275l;
        c17113l.f33280l = i2;
        return c17113l;
    }

    public final Object clone() {
        switch (this.f33274l) {
            case 0:
                C17112l c17112l = new C17112l(0);
                c17112l.subs(billing());
                return c17112l;
            default:
                C17112l c17112l2 = new C17112l(1);
                c17112l2.isPro(admob());
                return c17112l2;
        }
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        switch (this.f33274l) {
            case 0:
                C17113l c17113lBilling = billing();
                c17113lBilling.yandex();
                return c17113lBilling;
            default:
                C6431l c6431lAdmob = admob();
                c6431lAdmob.yandex();
                return c6431lAdmob;
        }
    }

    public void isPro(C6431l c6431l) {
        if (c6431l == C6431l.f13450l) {
            return;
        }
        int i = c6431l.f13453l;
        if ((i & 1) == 1) {
            int i2 = c6431l.f13452l;
            this.f33273l = 1 | this.f33273l;
            this.f33276l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c6431l.f13456l;
            this.f33273l = 2 | this.f33273l;
            this.f33275l = i3;
        }
        this.f5168l = this.f5168l.billing(c6431l.f13454l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        switch (this.f33274l) {
            case 0:
                subs((C17113l) abstractC4730l);
                break;
            default:
                isPro((C6431l) abstractC4730l);
                break;
        }
        return this;
    }

    public void subs(C17113l c17113l) {
        if (c17113l == C17113l.f33277l) {
            return;
        }
        int i = c17113l.f33280l;
        if ((i & 1) == 1) {
            int i2 = c17113l.f33279l;
            this.f33273l = 1 | this.f33273l;
            this.f33276l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c17113l.f33283l;
            this.f33273l = 2 | this.f33273l;
            this.f33275l = i3;
        }
        this.f5168l = this.f5168l.billing(c17113l.f33281l);
    }
}
