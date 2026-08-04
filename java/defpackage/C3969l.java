package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؚؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3969l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f8151l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f8152l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f8153l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f8154l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f8155l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f8156l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public EnumC8965l f8157l;

    public static C3969l admob() {
        C3969l c3969l = new C3969l();
        c3969l.f8151l = 1;
        c3969l.f8155l = "";
        c3969l.f8157l = EnumC8965l.NONE;
        List list = Collections.EMPTY_LIST;
        c3969l.f8152l = list;
        c3969l.f8153l = list;
        return c3969l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C8732l c8732l = null;
        try {
            try {
                C8732l.f17965l.getClass();
                subs(new C8732l(c1718l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c8732l != null) {
                    subs(c8732l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C8732l c8732l2 = (C8732l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c8732l = c8732l2;
                if (c8732l != null) {
                    subs(c8732l);
                }
                throw th;
            }
        }
    }

    public final C8732l billing() {
        C8732l c8732l = new C8732l(this);
        int i = this.f8154l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c8732l.f17966l = this.f8151l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c8732l.f17973l = this.f8156l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c8732l.f17972l = this.f8155l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c8732l.f17976l = this.f8157l;
        if ((i & 16) == 16) {
            this.f8152l = DesugarCollections.unmodifiableList(this.f8152l);
            this.f8154l &= -17;
        }
        c8732l.f17967l = this.f8152l;
        if ((this.f8154l & 32) == 32) {
            this.f8153l = DesugarCollections.unmodifiableList(this.f8153l);
            this.f8154l &= -33;
        }
        c8732l.f17975l = this.f8153l;
        c8732l.f17969l = i2;
        return c8732l;
    }

    public final Object clone() {
        C3969l c3969lAdmob = admob();
        c3969lAdmob.subs(billing());
        return c3969lAdmob;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C8732l c8732lBilling = billing();
        c8732lBilling.yandex();
        return c8732lBilling;
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        subs((C8732l) abstractC4730l);
        return this;
    }

    public final void subs(C8732l c8732l) {
        if (c8732l == C8732l.f17964l) {
            return;
        }
        int i = c8732l.f17969l;
        if ((i & 1) == 1) {
            int i2 = c8732l.f17966l;
            this.f8154l = 1 | this.f8154l;
            this.f8151l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c8732l.f17973l;
            this.f8154l = 2 | this.f8154l;
            this.f8156l = i3;
        }
        if ((i & 4) == 4) {
            this.f8154l |= 4;
            this.f8155l = c8732l.f17972l;
        }
        if ((i & 8) == 8) {
            EnumC8965l enumC8965l = c8732l.f17976l;
            enumC8965l.getClass();
            this.f8154l = 8 | this.f8154l;
            this.f8157l = enumC8965l;
        }
        if (!c8732l.f17967l.isEmpty()) {
            if (this.f8152l.isEmpty()) {
                this.f8152l = c8732l.f17967l;
                this.f8154l &= -17;
            } else {
                if ((this.f8154l & 16) != 16) {
                    this.f8152l = new ArrayList(this.f8152l);
                    this.f8154l |= 16;
                }
                this.f8152l.addAll(c8732l.f17967l);
            }
        }
        if (!c8732l.f17975l.isEmpty()) {
            if (this.f8153l.isEmpty()) {
                this.f8153l = c8732l.f17975l;
                this.f8154l &= -33;
            } else {
                if ((this.f8154l & 32) != 32) {
                    this.f8153l = new ArrayList(this.f8153l);
                    this.f8154l |= 32;
                }
                this.f8153l.addAll(c8732l.f17975l);
            }
        }
        this.f5168l = this.f5168l.billing(c8732l.f17970l);
    }
}
