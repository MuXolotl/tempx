package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9259l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C18128l f19032l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f19033l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f19034l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f19035l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f19036l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C4207l f19037l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C18128l f19038l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19039l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public List f19040l;

    public static C9259l subs() {
        C9259l c9259l = new C9259l();
        C18128l c18128l = C18128l.f35421l;
        c9259l.f19032l = c18128l;
        c9259l.f19038l = c18128l;
        c9259l.f19040l = Collections.EMPTY_LIST;
        c9259l.f19037l = C4207l.f8622l;
        return c9259l;
    }

    public final C18426l admob() {
        C18426l c18426l = new C18426l(this);
        int i = this.f19036l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c18426l.f35990l = this.f19035l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c18426l.f35989l = this.f19039l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c18426l.f35993l = this.f19032l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c18426l.f35985l = this.f19033l;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c18426l.f35986l = this.f19038l;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        c18426l.f35992l = this.f19034l;
        if ((i & 64) == 64) {
            this.f19040l = DesugarCollections.unmodifiableList(this.f19040l);
            this.f19036l &= -65;
        }
        c18426l.f35988l = this.f19040l;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c18426l.f35994l = this.f19037l;
        c18426l.f35984l = i2;
        return c18426l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C18426l c18426l = null;
        try {
            try {
                C18426l.f35981l.getClass();
                isPro(new C18426l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c18426l != null) {
                    isPro(c18426l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C18426l c18426l2 = (C18426l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c18426l = c18426l2;
                if (c18426l != null) {
                    isPro(c18426l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C9259l c9259lSubs = subs();
        c9259lSubs.isPro(admob());
        return c9259lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C18426l c18426lAdmob = admob();
        if (c18426lAdmob.yandex()) {
            return c18426lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C18426l c18426l) {
        C4207l c4207l;
        C18128l c18128l;
        C18128l c18128l2;
        if (c18426l == C18426l.f35982l) {
            return;
        }
        int i = c18426l.f35984l;
        if ((i & 1) == 1) {
            int i2 = c18426l.f35990l;
            this.f19036l = 1 | this.f19036l;
            this.f19035l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c18426l.f35989l;
            this.f19036l = 2 | this.f19036l;
            this.f19039l = i3;
        }
        if ((i & 4) == 4) {
            C18128l c18128l3 = c18426l.f35993l;
            if ((this.f19036l & 4) != 4 || (c18128l2 = this.f19032l) == C18128l.f35421l) {
                this.f19032l = c18128l3;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l2);
                c7699lAds.isPro(c18128l3);
                this.f19032l = c7699lAds.admob();
            }
            this.f19036l |= 4;
        }
        int i4 = c18426l.f35984l;
        if ((i4 & 8) == 8) {
            int i5 = c18426l.f35985l;
            this.f19036l = 8 | this.f19036l;
            this.f19033l = i5;
        }
        if ((i4 & 16) == 16) {
            C18128l c18128l4 = c18426l.f35986l;
            if ((this.f19036l & 16) != 16 || (c18128l = this.f19038l) == C18128l.f35421l) {
                this.f19038l = c18128l4;
            } else {
                C7699l c7699lAds2 = C18128l.ads(c18128l);
                c7699lAds2.isPro(c18128l4);
                this.f19038l = c7699lAds2.admob();
            }
            this.f19036l |= 16;
        }
        if ((c18426l.f35984l & 32) == 32) {
            int i6 = c18426l.f35992l;
            this.f19036l = 32 | this.f19036l;
            this.f19034l = i6;
        }
        if (!c18426l.f35988l.isEmpty()) {
            if (this.f19040l.isEmpty()) {
                this.f19040l = c18426l.f35988l;
                this.f19036l &= -65;
            } else {
                if ((this.f19036l & 64) != 64) {
                    this.f19040l = new ArrayList(this.f19040l);
                    this.f19036l |= 64;
                }
                this.f19040l.addAll(c18426l.f35988l);
            }
        }
        if ((c18426l.f35984l & 64) == 64) {
            C4207l c4207l2 = c18426l.f35994l;
            if ((this.f19036l & 128) != 128 || (c4207l = this.f19037l) == C4207l.f8622l) {
                this.f19037l = c4207l2;
            } else {
                C13836l c13836lIsPro = C4207l.isPro(c4207l);
                c13836lIsPro.subs(c4207l2);
                this.f19037l = c13836lIsPro.billing();
            }
            this.f19036l |= 128;
        }
        billing(c18426l);
        this.f5168l = this.f5168l.billing(c18426l.f35987l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C18426l) abstractC4730l);
        return this;
    }
}
