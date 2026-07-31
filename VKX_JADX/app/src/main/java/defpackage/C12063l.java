package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lِۘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12063l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f23989l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f23990l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f23991l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f23992l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC16055l f23993l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f23994l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f23995l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C18128l f23996l;

    public static C12063l admob() {
        C12063l c12063l = new C12063l();
        c12063l.f23993l = EnumC16055l.TRUE;
        c12063l.f23996l = C18128l.f35421l;
        List list = Collections.EMPTY_LIST;
        c12063l.f23991l = list;
        c12063l.f23995l = list;
        return c12063l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C18092l c18092l = null;
        try {
            try {
                C18092l.f35376l.getClass();
                subs(new C18092l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c18092l != null) {
                    subs(c18092l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C18092l c18092l2 = (C18092l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c18092l = c18092l2;
                if (c18092l != null) {
                    subs(c18092l);
                }
                throw th;
            }
        }
    }

    public final C18092l billing() {
        C18092l c18092l = new C18092l(this);
        int i = this.f23992l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c18092l.f35378l = this.f23989l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c18092l.f35385l = this.f23994l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c18092l.f35384l = this.f23993l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c18092l.f35387l = this.f23996l;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c18092l.f35379l = this.f23990l;
        if ((i & 32) == 32) {
            this.f23991l = DesugarCollections.unmodifiableList(this.f23991l);
            this.f23992l &= -33;
        }
        c18092l.f35380l = this.f23991l;
        if ((this.f23992l & 64) == 64) {
            this.f23995l = DesugarCollections.unmodifiableList(this.f23995l);
            this.f23992l &= -65;
        }
        c18092l.f35386l = this.f23995l;
        c18092l.f35381l = i2;
        return c18092l;
    }

    public final Object clone() {
        C12063l c12063lAdmob = admob();
        c12063lAdmob.subs(billing());
        return c12063lAdmob;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C18092l c18092lBilling = billing();
        if (c18092lBilling.yandex()) {
            return c18092lBilling;
        }
        throw new C6451l();
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        subs((C18092l) abstractC4730l);
        return this;
    }

    public final void subs(C18092l c18092l) {
        C18128l c18128l;
        if (c18092l == C18092l.f35377l) {
            return;
        }
        int i = c18092l.f35381l;
        if ((i & 1) == 1) {
            int i2 = c18092l.f35378l;
            this.f23992l = 1 | this.f23992l;
            this.f23989l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c18092l.f35385l;
            this.f23992l = 2 | this.f23992l;
            this.f23994l = i3;
        }
        if ((i & 4) == 4) {
            EnumC16055l enumC16055l = c18092l.f35384l;
            enumC16055l.getClass();
            this.f23992l = 4 | this.f23992l;
            this.f23993l = enumC16055l;
        }
        if ((c18092l.f35381l & 8) == 8) {
            C18128l c18128l2 = c18092l.f35387l;
            if ((this.f23992l & 8) != 8 || (c18128l = this.f23996l) == C18128l.f35421l) {
                this.f23996l = c18128l2;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l);
                c7699lAds.isPro(c18128l2);
                this.f23996l = c7699lAds.admob();
            }
            this.f23992l |= 8;
        }
        if ((c18092l.f35381l & 16) == 16) {
            int i4 = c18092l.f35379l;
            this.f23992l = 16 | this.f23992l;
            this.f23990l = i4;
        }
        if (!c18092l.f35380l.isEmpty()) {
            if (this.f23991l.isEmpty()) {
                this.f23991l = c18092l.f35380l;
                this.f23992l &= -33;
            } else {
                if ((this.f23992l & 32) != 32) {
                    this.f23991l = new ArrayList(this.f23991l);
                    this.f23992l |= 32;
                }
                this.f23991l.addAll(c18092l.f35380l);
            }
        }
        if (!c18092l.f35386l.isEmpty()) {
            if (this.f23995l.isEmpty()) {
                this.f23995l = c18092l.f35386l;
                this.f23992l &= -65;
            } else {
                if ((this.f23992l & 64) != 64) {
                    this.f23995l = new ArrayList(this.f23995l);
                    this.f23992l |= 64;
                }
                this.f23995l.addAll(c18092l.f35386l);
            }
        }
        this.f5168l = this.f5168l.billing(c18092l.f35382l);
    }
}
