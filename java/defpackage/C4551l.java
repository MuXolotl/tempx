package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًؖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4551l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C5665l f9198l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f9199l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C8107l f9200l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f9201l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C0012l f9202l;

    public static C4551l subs() {
        C4551l c4551l = new C4551l();
        c4551l.f9200l = C8107l.f16892l;
        c4551l.f9202l = C0012l.f862l;
        c4551l.f9198l = C5665l.f12045l;
        c4551l.f9199l = Collections.EMPTY_LIST;
        return c4551l;
    }

    public final C7431l admob() {
        C7431l c7431l = new C7431l(this);
        int i = this.f9201l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c7431l.f15385l = this.f9200l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c7431l.f15384l = this.f9202l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c7431l.f15387l = this.f9198l;
        if ((i & 8) == 8) {
            this.f9199l = DesugarCollections.unmodifiableList(this.f9199l);
            this.f9201l &= -9;
        }
        c7431l.f15381l = this.f9199l;
        c7431l.f15380l = i2;
        return c7431l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C7431l c7431l = null;
        try {
            try {
                C7431l.f15379l.getClass();
                isPro(new C7431l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c7431l != null) {
                    isPro(c7431l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C7431l c7431l2 = (C7431l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c7431l = c7431l2;
                if (c7431l != null) {
                    isPro(c7431l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C4551l c4551lSubs = subs();
        c4551lSubs.isPro(admob());
        return c4551lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C7431l c7431lAdmob = admob();
        if (c7431lAdmob.yandex()) {
            return c7431lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C7431l c7431l) {
        C5665l c5665l;
        C0012l c0012l;
        C8107l c8107l;
        if (c7431l == C7431l.f15378l) {
            return;
        }
        if ((c7431l.f15380l & 1) == 1) {
            C8107l c8107l2 = c7431l.f15385l;
            if ((this.f9201l & 1) != 1 || (c8107l = this.f9200l) == C8107l.f16892l) {
                this.f9200l = c8107l2;
            } else {
                C3730l c3730l = new C3730l(3);
                c3730l.f7796l = C7088l.f14852l;
                c3730l.remoteconfig(c8107l);
                c3730l.remoteconfig(c8107l2);
                this.f9200l = c3730l.subs();
            }
            this.f9201l |= 1;
        }
        if ((c7431l.f15380l & 2) == 2) {
            C0012l c0012l2 = c7431l.f15384l;
            if ((this.f9201l & 2) != 2 || (c0012l = this.f9202l) == C0012l.f862l) {
                this.f9202l = c0012l2;
            } else {
                C3730l c3730l2 = new C3730l(1);
                c3730l2.f7796l = Collections.EMPTY_LIST;
                c3730l2.smaato(c0012l);
                c3730l2.smaato(c0012l2);
                this.f9202l = c3730l2.admob();
            }
            this.f9201l |= 2;
        }
        if ((c7431l.f15380l & 4) == 4) {
            C5665l c5665l2 = c7431l.f15387l;
            if ((this.f9201l & 4) != 4 || (c5665l = this.f9198l) == C5665l.f12045l) {
                this.f9198l = c5665l2;
            } else {
                C14643l c14643lSubs = C14643l.subs();
                c14643lSubs.isPro(c5665l);
                c14643lSubs.isPro(c5665l2);
                this.f9198l = c14643lSubs.admob();
            }
            this.f9201l |= 4;
        }
        if (!c7431l.f15381l.isEmpty()) {
            if (this.f9199l.isEmpty()) {
                this.f9199l = c7431l.f15381l;
                this.f9201l &= -9;
            } else {
                if ((this.f9201l & 8) != 8) {
                    this.f9199l = new ArrayList(this.f9199l);
                    this.f9201l |= 8;
                }
                this.f9199l.addAll(c7431l.f15381l);
            }
        }
        billing(c7431l);
        this.f5168l = this.f5168l.billing(c7431l.f15383l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C7431l) abstractC4730l);
        return this;
    }
}
