package defpackage;

/* JADX INFO: renamed from: lؘۖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5873l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f12368l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f12369l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC9653l f12370l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f12371l;

    public static C5873l admob() {
        C5873l c5873l = new C5873l();
        c5873l.f12368l = -1;
        c5873l.f12370l = EnumC9653l.PACKAGE;
        return c5873l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C8400l c8400l = null;
        try {
            try {
                C8400l.f17362l.getClass();
                subs(new C8400l(c1718l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c8400l != null) {
                    subs(c8400l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C8400l c8400l2 = (C8400l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c8400l = c8400l2;
                if (c8400l != null) {
                    subs(c8400l);
                }
                throw th;
            }
        }
    }

    public final C8400l billing() {
        C8400l c8400l = new C8400l(this);
        int i = this.f12369l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c8400l.f17363l = this.f12368l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c8400l.f17368l = this.f12371l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c8400l.f17367l = this.f12370l;
        c8400l.f17365l = i2;
        return c8400l;
    }

    public final Object clone() {
        C5873l c5873lAdmob = admob();
        c5873lAdmob.subs(billing());
        return c5873lAdmob;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C8400l c8400lBilling = billing();
        if (c8400lBilling.yandex()) {
            return c8400lBilling;
        }
        throw new C6451l();
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        subs((C8400l) abstractC4730l);
        return this;
    }

    public final void subs(C8400l c8400l) {
        if (c8400l == C8400l.f17361l) {
            return;
        }
        int i = c8400l.f17365l;
        if ((i & 1) == 1) {
            int i2 = c8400l.f17363l;
            this.f12369l = 1 | this.f12369l;
            this.f12368l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c8400l.f17368l;
            this.f12369l = 2 | this.f12369l;
            this.f12371l = i3;
        }
        if ((i & 4) == 4) {
            EnumC9653l enumC9653l = c8400l.f17367l;
            enumC9653l.getClass();
            this.f12369l = 4 | this.f12369l;
            this.f12370l = enumC9653l;
        }
        this.f5168l = this.f5168l.billing(c8400l.f17366l);
    }
}
