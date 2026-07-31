package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lۣؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3730l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f7794l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7795l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f7796l;

    public /* synthetic */ C3730l(int i) {
        this.f7795l = i;
    }

    public C0012l admob() {
        C0012l c0012l = new C0012l(this);
        if ((this.f7794l & 1) == 1) {
            this.f7796l = DesugarCollections.unmodifiableList(this.f7796l);
            this.f7794l &= -2;
        }
        c0012l.f865l = this.f7796l;
        return c0012l;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007a  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C8107l c8107l = null;
        C15743l c15743l = null;
        C0012l c0012l = null;
        C1339l c1339l = null;
        try {
            try {
                try {
                    switch (this.f7795l) {
                        case 0:
                            try {
                                try {
                                    C15743l.f30920l.getClass();
                                    firebase(new C15743l(c1718l, c3429l));
                                    return this;
                                } catch (Throwable th) {
                                    th = th;
                                    if (c15743l != null) {
                                        firebase(c15743l);
                                    }
                                    throw th;
                                }
                            } catch (C12383l e) {
                                C15743l c15743l2 = (C15743l) e.f24472l;
                                try {
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c15743l = c15743l2;
                                    if (c15743l != null) {
                                        firebase(c15743l);
                                    }
                                    throw th;
                                }
                            }
                        case 1:
                            try {
                                C0012l.f863l.getClass();
                                smaato(new C0012l(c1718l, c3429l));
                                return this;
                            } catch (C12383l e2) {
                                C0012l c0012l2 = (C0012l) e2.f24472l;
                                try {
                                    throw e2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0012l = c0012l2;
                                    if (c0012l != null) {
                                        smaato(c0012l);
                                    }
                                    throw th;
                                }
                            }
                        case 2:
                            try {
                                C1339l.f3430l.getClass();
                                vip(new C1339l(c1718l, c3429l));
                                return this;
                            } catch (C12383l e3) {
                                C1339l c1339l2 = (C1339l) e3.f24472l;
                                try {
                                    throw e3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    c1339l = c1339l2;
                                    if (c1339l != null) {
                                        vip(c1339l);
                                    }
                                    throw th;
                                }
                            }
                        default:
                            try {
                                C8107l.f16893l.getClass();
                                remoteconfig(new C8107l(c1718l));
                                return this;
                            } catch (C12383l e4) {
                                C8107l c8107l2 = (C8107l) e4.f24472l;
                                try {
                                    throw e4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c8107l = c8107l2;
                                    if (c8107l != null) {
                                        remoteconfig(c8107l);
                                    }
                                    throw th;
                                }
                            }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public C15743l billing() {
        C15743l c15743l = new C15743l(this);
        if ((this.f7794l & 1) == 1) {
            this.f7796l = DesugarCollections.unmodifiableList(this.f7796l);
            this.f7794l &= -2;
        }
        c15743l.f30922l = this.f7796l;
        return c15743l;
    }

    public final Object clone() {
        switch (this.f7795l) {
            case 0:
                C3730l c3730l = new C3730l(0);
                c3730l.f7796l = Collections.EMPTY_LIST;
                c3730l.firebase(billing());
                return c3730l;
            case 1:
                C3730l c3730l2 = new C3730l(1);
                c3730l2.f7796l = Collections.EMPTY_LIST;
                c3730l2.smaato(admob());
                return c3730l2;
            case 2:
                C3730l c3730l3 = new C3730l(2);
                c3730l3.f7796l = Collections.EMPTY_LIST;
                c3730l3.vip(isPro());
                return c3730l3;
            default:
                C3730l c3730l4 = new C3730l(3);
                c3730l4.f7796l = C7088l.f14852l;
                c3730l4.remoteconfig(subs());
                return c3730l4;
        }
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        switch (this.f7795l) {
            case 0:
                C15743l c15743lBilling = billing();
                if (c15743lBilling.yandex()) {
                    return c15743lBilling;
                }
                throw new C6451l();
            case 1:
                C0012l c0012lAdmob = admob();
                if (c0012lAdmob.yandex()) {
                    return c0012lAdmob;
                }
                throw new C6451l();
            case 2:
                C1339l c1339lIsPro = isPro();
                c1339lIsPro.yandex();
                return c1339lIsPro;
            default:
                C8107l c8107lSubs = subs();
                c8107lSubs.yandex();
                return c8107lSubs;
        }
    }

    public void firebase(C15743l c15743l) {
        if (c15743l == C15743l.f30919l) {
            return;
        }
        if (!c15743l.f30922l.isEmpty()) {
            if (this.f7796l.isEmpty()) {
                this.f7796l = c15743l.f30922l;
                this.f7794l &= -2;
            } else {
                if ((this.f7794l & 1) != 1) {
                    this.f7796l = new ArrayList(this.f7796l);
                    this.f7794l |= 1;
                }
                this.f7796l.addAll(c15743l.f30922l);
            }
        }
        this.f5168l = this.f5168l.billing(c15743l.f30923l);
    }

    public C1339l isPro() {
        C1339l c1339l = new C1339l(this);
        if ((this.f7794l & 1) == 1) {
            this.f7796l = DesugarCollections.unmodifiableList(this.f7796l);
            this.f7794l &= -2;
        }
        c1339l.f3432l = this.f7796l;
        return c1339l;
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        switch (this.f7795l) {
            case 0:
                firebase((C15743l) abstractC4730l);
                break;
            case 1:
                smaato((C0012l) abstractC4730l);
                break;
            case 2:
                vip((C1339l) abstractC4730l);
                break;
            default:
                remoteconfig((C8107l) abstractC4730l);
                break;
        }
        return this;
    }

    public void remoteconfig(C8107l c8107l) {
        if (c8107l == C8107l.f16892l) {
            return;
        }
        if (!c8107l.f16895l.isEmpty()) {
            if (((InterfaceC5258l) this.f7796l).isEmpty()) {
                this.f7796l = c8107l.f16895l;
                this.f7794l &= -2;
            } else {
                if ((this.f7794l & 1) != 1) {
                    this.f7796l = new C7088l((InterfaceC5258l) this.f7796l);
                    this.f7794l |= 1;
                }
                ((InterfaceC5258l) this.f7796l).addAll(c8107l.f16895l);
            }
        }
        this.f5168l = this.f5168l.billing(c8107l.f16896l);
    }

    public void smaato(C0012l c0012l) {
        if (c0012l == C0012l.f862l) {
            return;
        }
        if (!c0012l.f865l.isEmpty()) {
            if (this.f7796l.isEmpty()) {
                this.f7796l = c0012l.f865l;
                this.f7794l &= -2;
            } else {
                if ((this.f7794l & 1) != 1) {
                    this.f7796l = new ArrayList(this.f7796l);
                    this.f7794l |= 1;
                }
                this.f7796l.addAll(c0012l.f865l);
            }
        }
        this.f5168l = this.f5168l.billing(c0012l.f866l);
    }

    public C8107l subs() {
        C8107l c8107l = new C8107l(this);
        if ((this.f7794l & 1) == 1) {
            this.f7796l = ((InterfaceC5258l) this.f7796l).adcel();
            this.f7794l &= -2;
        }
        c8107l.f16895l = (InterfaceC5258l) this.f7796l;
        return c8107l;
    }

    public void vip(C1339l c1339l) {
        if (c1339l == C1339l.f3429l) {
            return;
        }
        if (!c1339l.f3432l.isEmpty()) {
            if (this.f7796l.isEmpty()) {
                this.f7796l = c1339l.f3432l;
                this.f7794l &= -2;
            } else {
                if ((this.f7794l & 1) != 1) {
                    this.f7796l = new ArrayList(this.f7796l);
                    this.f7794l |= 1;
                }
                this.f7796l.addAll(c1339l.f3432l);
            }
        }
        this.f5168l = this.f5168l.billing(c1339l.f3433l);
    }
}
