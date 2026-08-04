package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٔؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14643l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f28655l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C3647l f28656l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f28657l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f28658l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C1339l f28659l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f28660l;

    public static C14643l subs() {
        C14643l c14643l = new C14643l();
        List list = Collections.EMPTY_LIST;
        c14643l.f28657l = list;
        c14643l.f28660l = list;
        c14643l.f28655l = list;
        c14643l.f28656l = C3647l.f7625l;
        c14643l.f28659l = C1339l.f3429l;
        return c14643l;
    }

    public final C5665l admob() {
        C5665l c5665l = new C5665l(this);
        int i = this.f28658l;
        if ((i & 1) == 1) {
            this.f28657l = DesugarCollections.unmodifiableList(this.f28657l);
            this.f28658l &= -2;
        }
        c5665l.f12052l = this.f28657l;
        if ((this.f28658l & 2) == 2) {
            this.f28660l = DesugarCollections.unmodifiableList(this.f28660l);
            this.f28658l &= -3;
        }
        c5665l.f12051l = this.f28660l;
        if ((this.f28658l & 4) == 4) {
            this.f28655l = DesugarCollections.unmodifiableList(this.f28655l);
            this.f28658l &= -5;
        }
        c5665l.f12054l = this.f28655l;
        int i2 = (i & 8) != 8 ? 0 : 1;
        c5665l.f12047l = this.f28656l;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        c5665l.f12048l = this.f28659l;
        c5665l.f12046l = i2;
        return c5665l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C5665l c5665l = null;
        try {
            try {
                C5665l.f12044l.getClass();
                isPro(new C5665l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c5665l != null) {
                    isPro(c5665l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C5665l c5665l2 = (C5665l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c5665l = c5665l2;
                if (c5665l != null) {
                    isPro(c5665l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C14643l c14643lSubs = subs();
        c14643lSubs.isPro(admob());
        return c14643lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C5665l c5665lAdmob = admob();
        if (c5665lAdmob.yandex()) {
            return c5665lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C5665l c5665l) {
        C1339l c1339l;
        C3647l c3647l;
        if (c5665l == C5665l.f12045l) {
            return;
        }
        if (!c5665l.f12052l.isEmpty()) {
            if (this.f28657l.isEmpty()) {
                this.f28657l = c5665l.f12052l;
                this.f28658l &= -2;
            } else {
                if ((this.f28658l & 1) != 1) {
                    this.f28657l = new ArrayList(this.f28657l);
                    this.f28658l |= 1;
                }
                this.f28657l.addAll(c5665l.f12052l);
            }
        }
        if (!c5665l.f12051l.isEmpty()) {
            if (this.f28660l.isEmpty()) {
                this.f28660l = c5665l.f12051l;
                this.f28658l &= -3;
            } else {
                if ((this.f28658l & 2) != 2) {
                    this.f28660l = new ArrayList(this.f28660l);
                    this.f28658l |= 2;
                }
                this.f28660l.addAll(c5665l.f12051l);
            }
        }
        if (!c5665l.f12054l.isEmpty()) {
            if (this.f28655l.isEmpty()) {
                this.f28655l = c5665l.f12054l;
                this.f28658l &= -5;
            } else {
                if ((this.f28658l & 4) != 4) {
                    this.f28655l = new ArrayList(this.f28655l);
                    this.f28658l |= 4;
                }
                this.f28655l.addAll(c5665l.f12054l);
            }
        }
        if ((c5665l.f12046l & 1) == 1) {
            C3647l c3647l2 = c5665l.f12047l;
            if ((this.f28658l & 8) != 8 || (c3647l = this.f28656l) == C3647l.f7625l) {
                this.f28656l = c3647l2;
            } else {
                C10657l c10657lSubs = C3647l.subs(c3647l);
                c10657lSubs.firebase(c3647l2);
                this.f28656l = c10657lSubs.admob();
            }
            this.f28658l |= 8;
        }
        if ((c5665l.f12046l & 2) == 2) {
            C1339l c1339l2 = c5665l.f12048l;
            if ((this.f28658l & 16) != 16 || (c1339l = this.f28659l) == C1339l.f3429l) {
                this.f28659l = c1339l2;
            } else {
                C3730l c3730l = new C3730l(2);
                c3730l.f7796l = Collections.EMPTY_LIST;
                c3730l.vip(c1339l);
                c3730l.vip(c1339l2);
                this.f28659l = c3730l.isPro();
            }
            this.f28658l |= 16;
        }
        billing(c5665l);
        this.f5168l = this.f5168l.billing(c5665l.f12049l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C5665l) abstractC4730l);
        return this;
    }
}
