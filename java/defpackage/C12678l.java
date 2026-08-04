package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lّٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12678l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f24979l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public EnumC1630l f24980l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public List f24981l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f24982l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f24983l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f24984l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24985l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public List f24986l;

    public static C12678l subs() {
        C12678l c12678l = new C12678l();
        c12678l.f24980l = EnumC1630l.INV;
        List list = Collections.EMPTY_LIST;
        c12678l.f24984l = list;
        c12678l.f24981l = list;
        c12678l.f24986l = list;
        return c12678l;
    }

    public final C17586l admob() {
        C17586l c17586l = new C17586l(this);
        int i = this.f24983l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c17586l.f34243l = this.f24982l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c17586l.f34242l = this.f24985l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c17586l.f34246l = this.f24979l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c17586l.f34238l = this.f24980l;
        if ((i & 16) == 16) {
            this.f24984l = DesugarCollections.unmodifiableList(this.f24984l);
            this.f24983l &= -17;
        }
        c17586l.f34239l = this.f24984l;
        if ((this.f24983l & 32) == 32) {
            this.f24981l = DesugarCollections.unmodifiableList(this.f24981l);
            this.f24983l &= -33;
        }
        c17586l.f34245l = this.f24981l;
        if ((this.f24983l & 64) == 64) {
            this.f24986l = DesugarCollections.unmodifiableList(this.f24986l);
            this.f24983l &= -65;
        }
        c17586l.f34247l = this.f24986l;
        c17586l.f34237l = i2;
        return c17586l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C17586l c17586l = null;
        try {
            try {
                C17586l.f34234l.getClass();
                isPro(new C17586l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c17586l != null) {
                    isPro(c17586l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C17586l c17586l2 = (C17586l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c17586l = c17586l2;
                if (c17586l != null) {
                    isPro(c17586l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C12678l c12678lSubs = subs();
        c12678lSubs.isPro(admob());
        return c12678lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C17586l c17586lAdmob = admob();
        if (c17586lAdmob.yandex()) {
            return c17586lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C17586l c17586l) {
        if (c17586l == C17586l.f34235l) {
            return;
        }
        int i = c17586l.f34237l;
        if ((i & 1) == 1) {
            int i2 = c17586l.f34243l;
            this.f24983l = 1 | this.f24983l;
            this.f24982l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c17586l.f34242l;
            this.f24983l = 2 | this.f24983l;
            this.f24985l = i3;
        }
        if ((i & 4) == 4) {
            boolean z = c17586l.f34246l;
            this.f24983l = 4 | this.f24983l;
            this.f24979l = z;
        }
        if ((i & 8) == 8) {
            EnumC1630l enumC1630l = c17586l.f34238l;
            enumC1630l.getClass();
            this.f24983l = 8 | this.f24983l;
            this.f24980l = enumC1630l;
        }
        if (!c17586l.f34239l.isEmpty()) {
            if (this.f24984l.isEmpty()) {
                this.f24984l = c17586l.f34239l;
                this.f24983l &= -17;
            } else {
                if ((this.f24983l & 16) != 16) {
                    this.f24984l = new ArrayList(this.f24984l);
                    this.f24983l |= 16;
                }
                this.f24984l.addAll(c17586l.f34239l);
            }
        }
        if (!c17586l.f34245l.isEmpty()) {
            if (this.f24981l.isEmpty()) {
                this.f24981l = c17586l.f34245l;
                this.f24983l &= -33;
            } else {
                if ((this.f24983l & 32) != 32) {
                    this.f24981l = new ArrayList(this.f24981l);
                    this.f24983l |= 32;
                }
                this.f24981l.addAll(c17586l.f34245l);
            }
        }
        if (!c17586l.f34247l.isEmpty()) {
            if (this.f24986l.isEmpty()) {
                this.f24986l = c17586l.f34247l;
                this.f24983l &= -65;
            } else {
                if ((this.f24983l & 64) != 64) {
                    this.f24986l = new ArrayList(this.f24986l);
                    this.f24983l |= 64;
                }
                this.f24986l.addAll(c17586l.f34247l);
            }
        }
        billing(c17586l);
        this.f5168l = this.f5168l.billing(c17586l.f34240l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C17586l) abstractC4730l);
        return this;
    }
}
