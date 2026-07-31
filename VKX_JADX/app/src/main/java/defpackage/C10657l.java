package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lَۢۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10657l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f21622l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21623l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f21624l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f21625l;

    public /* synthetic */ C10657l(int i) {
        this.f21623l = i;
    }

    public static C10657l subs() {
        C10657l c10657l = new C10657l(1);
        c10657l.f21625l = Collections.EMPTY_LIST;
        c10657l.f21624l = -1;
        return c10657l;
    }

    public C3647l admob() {
        C3647l c3647l = new C3647l(this);
        int i = this.f21622l;
        if ((i & 1) == 1) {
            this.f21625l = DesugarCollections.unmodifiableList(this.f21625l);
            this.f21622l &= -2;
        }
        c3647l.f7627l = this.f21625l;
        int i2 = (i & 2) != 2 ? 0 : 1;
        c3647l.f7631l = this.f21624l;
        c3647l.f7628l = i2;
        return c3647l;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C3647l c3647l = null;
        C7899l c7899l = null;
        try {
            try {
                switch (this.f21623l) {
                    case 0:
                        try {
                            isPro((C7899l) C7899l.f16471l.crashlytics(c1718l, c3429l));
                            return this;
                        } catch (C12383l e) {
                            C7899l c7899l2 = (C7899l) e.f24472l;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                c7899l = c7899l2;
                                if (c7899l != null) {
                                    isPro(c7899l);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            C3647l.f7626l.getClass();
                            firebase(new C3647l(c1718l, c3429l));
                            return this;
                        } catch (C12383l e2) {
                            C3647l c3647l2 = (C3647l) e2.f24472l;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                c3647l = c3647l2;
                                if (c3647l != null) {
                                    firebase(c3647l);
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

    public C7899l billing() {
        C7899l c7899l = new C7899l(this);
        int i = this.f21622l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c7899l.f16472l = this.f21624l;
        if ((i & 2) == 2) {
            this.f21625l = DesugarCollections.unmodifiableList(this.f21625l);
            this.f21622l &= -3;
        }
        c7899l.f16476l = this.f21625l;
        c7899l.f16473l = i2;
        return c7899l;
    }

    public final Object clone() {
        switch (this.f21623l) {
            case 0:
                C10657l c10657l = new C10657l(0);
                c10657l.f21625l = Collections.EMPTY_LIST;
                c10657l.isPro(billing());
                return c10657l;
            default:
                C10657l c10657lSubs = subs();
                c10657lSubs.firebase(admob());
                return c10657lSubs;
        }
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        switch (this.f21623l) {
            case 0:
                C7899l c7899lBilling = billing();
                if (c7899lBilling.yandex()) {
                    return c7899lBilling;
                }
                throw new C6451l();
            default:
                C3647l c3647lAdmob = admob();
                if (c3647lAdmob.yandex()) {
                    return c3647lAdmob;
                }
                throw new C6451l();
        }
    }

    public void firebase(C3647l c3647l) {
        if (c3647l == C3647l.f7625l) {
            return;
        }
        if (!c3647l.f7627l.isEmpty()) {
            if (this.f21625l.isEmpty()) {
                this.f21625l = c3647l.f7627l;
                this.f21622l &= -2;
            } else {
                if ((this.f21622l & 1) != 1) {
                    this.f21625l = new ArrayList(this.f21625l);
                    this.f21622l |= 1;
                }
                this.f21625l.addAll(c3647l.f7627l);
            }
        }
        if ((c3647l.f7628l & 1) == 1) {
            int i = c3647l.f7631l;
            this.f21622l |= 2;
            this.f21624l = i;
        }
        this.f5168l = this.f5168l.billing(c3647l.f7629l);
    }

    public void isPro(C7899l c7899l) {
        if (c7899l == C7899l.f16470l) {
            return;
        }
        if ((c7899l.f16473l & 1) == 1) {
            int i = c7899l.f16472l;
            this.f21622l = 1 | this.f21622l;
            this.f21624l = i;
        }
        if (!c7899l.f16476l.isEmpty()) {
            if (this.f21625l.isEmpty()) {
                this.f21625l = c7899l.f16476l;
                this.f21622l &= -3;
            } else {
                if ((this.f21622l & 2) != 2) {
                    this.f21625l = new ArrayList(this.f21625l);
                    this.f21622l |= 2;
                }
                this.f21625l.addAll(c7899l.f16476l);
            }
        }
        this.f5168l = this.f5168l.billing(c7899l.f16474l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        switch (this.f21623l) {
            case 0:
                isPro((C7899l) abstractC4730l);
                break;
            default:
                firebase((C3647l) abstractC4730l);
                break;
        }
        return this;
    }
}
