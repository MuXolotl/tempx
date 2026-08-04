package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؓۧٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2274l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public List f4962l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f4963l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f4964l;

    public final void admob(C3186l c3186l) {
        if (c3186l == C3186l.f6843l) {
            return;
        }
        if (!c3186l.f6846l.isEmpty()) {
            if (this.f4962l.isEmpty()) {
                this.f4962l = c3186l.f6846l;
                this.f4963l &= -2;
            } else {
                if ((this.f4963l & 1) != 1) {
                    this.f4962l = new ArrayList(this.f4962l);
                    this.f4963l |= 1;
                }
                this.f4962l.addAll(c3186l.f6846l);
            }
        }
        if (!c3186l.f6845l.isEmpty()) {
            if (this.f4964l.isEmpty()) {
                this.f4964l = c3186l.f6845l;
                this.f4963l &= -3;
            } else {
                if ((this.f4963l & 2) != 2) {
                    this.f4964l = new ArrayList(this.f4964l);
                    this.f4963l |= 2;
                }
                this.f4964l.addAll(c3186l.f6845l);
            }
        }
        this.f5168l = this.f5168l.billing(c3186l.f6847l);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C3186l c3186l = null;
        try {
            try {
                C3186l.f6844l.getClass();
                admob(new C3186l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c3186l != null) {
                    admob(c3186l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C3186l c3186l2 = (C3186l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c3186l = c3186l2;
                if (c3186l != null) {
                    admob(c3186l);
                }
                throw th;
            }
        }
    }

    public final C3186l billing() {
        C3186l c3186l = new C3186l(this);
        if ((this.f4963l & 1) == 1) {
            this.f4962l = DesugarCollections.unmodifiableList(this.f4962l);
            this.f4963l &= -2;
        }
        c3186l.f6846l = this.f4962l;
        if ((this.f4963l & 2) == 2) {
            this.f4964l = DesugarCollections.unmodifiableList(this.f4964l);
            this.f4963l &= -3;
        }
        c3186l.f6845l = this.f4964l;
        return c3186l;
    }

    public final Object clone() {
        C2274l c2274l = new C2274l();
        List list = Collections.EMPTY_LIST;
        c2274l.f4962l = list;
        c2274l.f4964l = list;
        c2274l.admob(billing());
        return c2274l;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C3186l c3186lBilling = billing();
        c3186lBilling.yandex();
        return c3186lBilling;
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        admob((C3186l) abstractC4730l);
        return this;
    }
}
