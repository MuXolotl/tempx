package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًًّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12453l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f24576l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f24577l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f24578l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f24579l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f24580l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f24581l;

    public static C12453l subs() {
        C12453l c12453l = new C12453l();
        c12453l.f24578l = 6;
        List list = Collections.EMPTY_LIST;
        c12453l.f24581l = list;
        c12453l.f24576l = list;
        c12453l.f24577l = list;
        c12453l.f24580l = list;
        return c12453l;
    }

    public final C13347l admob() {
        C13347l c13347l = new C13347l(this);
        int i = this.f24579l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c13347l.f26207l = this.f24578l;
        if ((i & 2) == 2) {
            this.f24581l = DesugarCollections.unmodifiableList(this.f24581l);
            this.f24579l &= -3;
        }
        c13347l.f26206l = this.f24581l;
        if ((this.f24579l & 4) == 4) {
            this.f24576l = DesugarCollections.unmodifiableList(this.f24576l);
            this.f24579l &= -5;
        }
        c13347l.f26209l = this.f24576l;
        if ((this.f24579l & 8) == 8) {
            this.f24577l = DesugarCollections.unmodifiableList(this.f24577l);
            this.f24579l &= -9;
        }
        c13347l.f26202l = this.f24577l;
        if ((this.f24579l & 16) == 16) {
            this.f24580l = DesugarCollections.unmodifiableList(this.f24580l);
            this.f24579l &= -17;
        }
        c13347l.f26203l = this.f24580l;
        c13347l.f26201l = i2;
        return c13347l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C13347l c13347l = null;
        try {
            try {
                C13347l.f26199l.getClass();
                isPro(new C13347l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c13347l != null) {
                    isPro(c13347l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C13347l c13347l2 = (C13347l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c13347l = c13347l2;
                if (c13347l != null) {
                    isPro(c13347l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C12453l c12453lSubs = subs();
        c12453lSubs.isPro(admob());
        return c12453lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C13347l c13347lAdmob = admob();
        if (c13347lAdmob.yandex()) {
            return c13347lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C13347l c13347l) {
        if (c13347l == C13347l.f26200l) {
            return;
        }
        if ((c13347l.f26201l & 1) == 1) {
            int i = c13347l.f26207l;
            this.f24579l = 1 | this.f24579l;
            this.f24578l = i;
        }
        if (!c13347l.f26206l.isEmpty()) {
            if (this.f24581l.isEmpty()) {
                this.f24581l = c13347l.f26206l;
                this.f24579l &= -3;
            } else {
                if ((this.f24579l & 2) != 2) {
                    this.f24581l = new ArrayList(this.f24581l);
                    this.f24579l |= 2;
                }
                this.f24581l.addAll(c13347l.f26206l);
            }
        }
        if (!c13347l.f26209l.isEmpty()) {
            if (this.f24576l.isEmpty()) {
                this.f24576l = c13347l.f26209l;
                this.f24579l &= -5;
            } else {
                if ((this.f24579l & 4) != 4) {
                    this.f24576l = new ArrayList(this.f24576l);
                    this.f24579l |= 4;
                }
                this.f24576l.addAll(c13347l.f26209l);
            }
        }
        if (!c13347l.f26202l.isEmpty()) {
            if (this.f24577l.isEmpty()) {
                this.f24577l = c13347l.f26202l;
                this.f24579l &= -9;
            } else {
                if ((this.f24579l & 8) != 8) {
                    this.f24577l = new ArrayList(this.f24577l);
                    this.f24579l |= 8;
                }
                this.f24577l.addAll(c13347l.f26202l);
            }
        }
        if (!c13347l.f26203l.isEmpty()) {
            if (this.f24580l.isEmpty()) {
                this.f24580l = c13347l.f26203l;
                this.f24579l &= -17;
            } else {
                if ((this.f24579l & 16) != 16) {
                    this.f24580l = new ArrayList(this.f24580l);
                    this.f24579l |= 16;
                }
                this.f24580l.addAll(c13347l.f26203l);
            }
        }
        billing(c13347l);
        this.f5168l = this.f5168l.billing(c13347l.f26204l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C13347l) abstractC4730l);
        return this;
    }
}
