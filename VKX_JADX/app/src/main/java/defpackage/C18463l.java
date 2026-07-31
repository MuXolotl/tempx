package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18463l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f36057l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Serializable f36058l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Serializable f36059l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f36060l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f36061l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Serializable f36062l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC4730l f36063l;

    public /* synthetic */ C18463l(int i) {
        this.f36060l = i;
    }

    public static C18463l isPro() {
        C18463l c18463l = new C18463l(1);
        c18463l.f36062l = EnumC6955l.RETURNS_CONSTANT;
        c18463l.f36061l = Collections.EMPTY_LIST;
        c18463l.f36063l = C18092l.f35377l;
        c18463l.f36058l = EnumC8359l.AT_MOST_ONCE;
        c18463l.f36059l = EnumC11623l.CONCLUSION_CONDITION;
        return c18463l;
    }

    public static C18463l subs() {
        C18463l c18463l = new C18463l(0);
        c18463l.f36062l = C17113l.f33277l;
        C6431l c6431l = C6431l.f13450l;
        c18463l.f36061l = c6431l;
        c18463l.f36063l = c6431l;
        c18463l.f36058l = c6431l;
        c18463l.f36059l = c6431l;
        return c18463l;
    }

    public C9781l admob() {
        C9781l c9781l = new C9781l(this);
        int i = this.f36057l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c9781l.f19940l = (EnumC6955l) this.f36062l;
        if ((i & 2) == 2) {
            this.f36061l = DesugarCollections.unmodifiableList((List) this.f36061l);
            this.f36057l &= -3;
        }
        c9781l.f19946l = (List) this.f36061l;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c9781l.f19945l = (C18092l) this.f36063l;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c9781l.f19948l = (EnumC8359l) this.f36058l;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        c9781l.f19941l = (EnumC11623l) this.f36059l;
        c9781l.f19943l = i2;
        return c9781l;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C9781l c9781l = null;
        C10459l c10459l = null;
        try {
            try {
                switch (this.f36060l) {
                    case 0:
                        try {
                            C10459l.f21275l.getClass();
                            firebase(new C10459l(c1718l, c3429l));
                            return this;
                        } catch (C12383l e) {
                            C10459l c10459l2 = (C10459l) e.f24472l;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                c10459l = c10459l2;
                                if (c10459l != null) {
                                    firebase(c10459l);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            C9781l.f19939l.getClass();
                            smaato(new C9781l(c1718l, c3429l));
                            return this;
                        } catch (C12383l e2) {
                            C9781l c9781l2 = (C9781l) e2.f24472l;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                c9781l = c9781l2;
                                if (c9781l != null) {
                                    smaato(c9781l);
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

    public C10459l billing() {
        C10459l c10459l = new C10459l(this);
        int i = this.f36057l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c10459l.f21276l = (C17113l) this.f36062l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c10459l.f21282l = (C6431l) this.f36061l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c10459l.f21281l = (C6431l) this.f36063l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c10459l.f21284l = (C6431l) this.f36058l;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c10459l.f21277l = (C6431l) this.f36059l;
        c10459l.f21279l = i2;
        return c10459l;
    }

    public final Object clone() {
        switch (this.f36060l) {
            case 0:
                C18463l c18463lSubs = subs();
                c18463lSubs.firebase(billing());
                return c18463lSubs;
            default:
                C18463l c18463lIsPro = isPro();
                c18463lIsPro.smaato(admob());
                return c18463lIsPro;
        }
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        switch (this.f36060l) {
            case 0:
                C10459l c10459lBilling = billing();
                c10459lBilling.yandex();
                return c10459lBilling;
            default:
                C9781l c9781lAdmob = admob();
                if (c9781lAdmob.yandex()) {
                    return c9781lAdmob;
                }
                throw new C6451l();
        }
    }

    public void firebase(C10459l c10459l) {
        C6431l c6431l;
        C6431l c6431l2;
        C6431l c6431l3;
        C6431l c6431l4;
        C17113l c17113l;
        if (c10459l == C10459l.f21274l) {
            return;
        }
        if ((c10459l.f21279l & 1) == 1) {
            C17113l c17113l2 = c10459l.f21276l;
            if ((this.f36057l & 1) != 1 || (c17113l = (C17113l) this.f36062l) == C17113l.f33277l) {
                this.f36062l = c17113l2;
            } else {
                C17112l c17112l = new C17112l(0);
                c17112l.subs(c17113l);
                c17112l.subs(c17113l2);
                this.f36062l = c17112l.billing();
            }
            this.f36057l |= 1;
        }
        if ((c10459l.f21279l & 2) == 2) {
            C6431l c6431l5 = c10459l.f21282l;
            if ((this.f36057l & 2) != 2 || (c6431l4 = (C6431l) this.f36061l) == C6431l.f13450l) {
                this.f36061l = c6431l5;
            } else {
                C17112l c17112lSubs = C6431l.subs(c6431l4);
                c17112lSubs.isPro(c6431l5);
                this.f36061l = c17112lSubs.admob();
            }
            this.f36057l |= 2;
        }
        if (c10459l.subs()) {
            C6431l c6431l6 = c10459l.f21281l;
            if ((this.f36057l & 4) != 4 || (c6431l3 = (C6431l) this.f36063l) == C6431l.f13450l) {
                this.f36063l = c6431l6;
            } else {
                C17112l c17112lSubs2 = C6431l.subs(c6431l3);
                c17112lSubs2.isPro(c6431l6);
                this.f36063l = c17112lSubs2.admob();
            }
            this.f36057l |= 4;
        }
        if ((c10459l.f21279l & 8) == 8) {
            C6431l c6431l7 = c10459l.f21284l;
            if ((this.f36057l & 8) != 8 || (c6431l2 = (C6431l) this.f36058l) == C6431l.f13450l) {
                this.f36058l = c6431l7;
            } else {
                C17112l c17112lSubs3 = C6431l.subs(c6431l2);
                c17112lSubs3.isPro(c6431l7);
                this.f36058l = c17112lSubs3.admob();
            }
            this.f36057l |= 8;
        }
        if ((c10459l.f21279l & 16) == 16) {
            C6431l c6431l8 = c10459l.f21277l;
            if ((this.f36057l & 16) != 16 || (c6431l = (C6431l) this.f36059l) == C6431l.f13450l) {
                this.f36059l = c6431l8;
            } else {
                C17112l c17112lSubs4 = C6431l.subs(c6431l);
                c17112lSubs4.isPro(c6431l8);
                this.f36059l = c17112lSubs4.admob();
            }
            this.f36057l |= 16;
        }
        this.f5168l = this.f5168l.billing(c10459l.f21280l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        switch (this.f36060l) {
            case 0:
                firebase((C10459l) abstractC4730l);
                break;
            default:
                smaato((C9781l) abstractC4730l);
                break;
        }
        return this;
    }

    public void smaato(C9781l c9781l) {
        C18092l c18092l;
        if (c9781l == C9781l.f19938l) {
            return;
        }
        if ((c9781l.f19943l & 1) == 1) {
            EnumC6955l enumC6955l = c9781l.f19940l;
            enumC6955l.getClass();
            this.f36057l = 1 | this.f36057l;
            this.f36062l = enumC6955l;
        }
        if (!c9781l.f19946l.isEmpty()) {
            if (((List) this.f36061l).isEmpty()) {
                this.f36061l = c9781l.f19946l;
                this.f36057l &= -3;
            } else {
                if ((this.f36057l & 2) != 2) {
                    this.f36061l = new ArrayList((List) this.f36061l);
                    this.f36057l |= 2;
                }
                ((List) this.f36061l).addAll(c9781l.f19946l);
            }
        }
        if ((c9781l.f19943l & 2) == 2) {
            C18092l c18092l2 = c9781l.f19945l;
            if ((this.f36057l & 4) != 4 || (c18092l = (C18092l) this.f36063l) == C18092l.f35377l) {
                this.f36063l = c18092l2;
            } else {
                C12063l c12063lAdmob = C12063l.admob();
                c12063lAdmob.subs(c18092l);
                c12063lAdmob.subs(c18092l2);
                this.f36063l = c12063lAdmob.billing();
            }
            this.f36057l |= 4;
        }
        if ((c9781l.f19943l & 4) == 4) {
            EnumC8359l enumC8359l = c9781l.f19948l;
            enumC8359l.getClass();
            this.f36057l |= 8;
            this.f36058l = enumC8359l;
        }
        if ((c9781l.f19943l & 8) == 8) {
            EnumC11623l enumC11623l = c9781l.f19941l;
            enumC11623l.getClass();
            this.f36057l |= 16;
            this.f36059l = enumC11623l;
        }
        this.f5168l = this.f5168l.billing(c9781l.f19944l);
    }
}
