package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lَۤٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10684l extends AbstractC2439l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f21687l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f21688l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f21689l;

    public final C16400l admob() {
        C16400l c16400l = new C16400l(this);
        int i = this.f21688l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c16400l.f32097l = this.f21687l;
        if ((i & 2) == 2) {
            this.f21689l = DesugarCollections.unmodifiableList(this.f21689l);
            this.f21688l &= -3;
        }
        c16400l.f32096l = this.f21689l;
        c16400l.f32093l = i2;
        return c16400l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C16400l c16400l = null;
        try {
            try {
                C16400l.f32092l.getClass();
                subs(new C16400l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c16400l != null) {
                    subs(c16400l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C16400l c16400l2 = (C16400l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c16400l = c16400l2;
                if (c16400l != null) {
                    subs(c16400l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C10684l c10684l = new C10684l();
        c10684l.f21689l = Collections.EMPTY_LIST;
        c10684l.subs(admob());
        return c10684l;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C16400l c16400lAdmob = admob();
        if (c16400lAdmob.yandex()) {
            return c16400lAdmob;
        }
        throw new C6451l();
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        subs((C16400l) abstractC4730l);
        return this;
    }

    public final void subs(C16400l c16400l) {
        if (c16400l == C16400l.f32091l) {
            return;
        }
        if ((c16400l.f32093l & 1) == 1) {
            int i = c16400l.f32097l;
            this.f21688l = 1 | this.f21688l;
            this.f21687l = i;
        }
        if (!c16400l.f32096l.isEmpty()) {
            if (this.f21689l.isEmpty()) {
                this.f21689l = c16400l.f32096l;
                this.f21688l &= -3;
            } else {
                if ((this.f21688l & 2) != 2) {
                    this.f21689l = new ArrayList(this.f21689l);
                    this.f21688l |= 2;
                }
                this.f21689l.addAll(c16400l.f32096l);
            }
        }
        billing(c16400l);
        this.f5168l = this.f5168l.billing(c16400l.f32095l);
    }
}
