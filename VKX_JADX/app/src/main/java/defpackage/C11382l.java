package defpackage;

/* JADX INFO: renamed from: lُٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11382l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f22954l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f22955l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public EnumC7053l f22956l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f22957l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC11471l f22958l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f22959l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22960l;

    public static C11382l admob() {
        C11382l c11382l = new C11382l();
        c11382l.f22958l = EnumC11471l.ERROR;
        c11382l.f22956l = EnumC7053l.LANGUAGE_VERSION;
        return c11382l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C3617l c3617l = null;
        try {
            try {
                C3617l.f7539l.getClass();
                subs(new C3617l(c1718l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c3617l != null) {
                    subs(c3617l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C3617l c3617l2 = (C3617l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c3617l = c3617l2;
                if (c3617l != null) {
                    subs(c3617l);
                }
                throw th;
            }
        }
    }

    public final C3617l billing() {
        C3617l c3617l = new C3617l(this);
        int i = this.f22957l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c3617l.f7541l = this.f22954l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c3617l.f7548l = this.f22959l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c3617l.f7547l = this.f22958l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c3617l.f7550l = this.f22960l;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c3617l.f7542l = this.f22955l;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        c3617l.f7543l = this.f22956l;
        c3617l.f7544l = i2;
        return c3617l;
    }

    public final Object clone() {
        C11382l c11382lAdmob = admob();
        c11382lAdmob.subs(billing());
        return c11382lAdmob;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C3617l c3617lBilling = billing();
        c3617lBilling.yandex();
        return c3617lBilling;
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        subs((C3617l) abstractC4730l);
        return this;
    }

    public final void subs(C3617l c3617l) {
        if (c3617l == C3617l.f7540l) {
            return;
        }
        int i = c3617l.f7544l;
        if ((i & 1) == 1) {
            int i2 = c3617l.f7541l;
            this.f22957l = 1 | this.f22957l;
            this.f22954l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c3617l.f7548l;
            this.f22957l = 2 | this.f22957l;
            this.f22959l = i3;
        }
        if ((i & 4) == 4) {
            EnumC11471l enumC11471l = c3617l.f7547l;
            enumC11471l.getClass();
            this.f22957l = 4 | this.f22957l;
            this.f22958l = enumC11471l;
        }
        int i4 = c3617l.f7544l;
        if ((i4 & 8) == 8) {
            int i5 = c3617l.f7550l;
            this.f22957l = 8 | this.f22957l;
            this.f22960l = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = c3617l.f7542l;
            this.f22957l = 16 | this.f22957l;
            this.f22955l = i6;
        }
        if ((i4 & 32) == 32) {
            EnumC7053l enumC7053l = c3617l.f7543l;
            enumC7053l.getClass();
            this.f22957l = 32 | this.f22957l;
            this.f22956l = enumC7053l;
        }
        this.f5168l = this.f5168l.billing(c3617l.f7545l);
    }
}
