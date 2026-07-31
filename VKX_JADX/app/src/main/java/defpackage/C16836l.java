package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lٗؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16836l {
    public int amazon;
    public int billing;
    public InterfaceC16061l crashlytics;
    public boolean firebase;
    public C7546l isPro;
    public C11090l loadAd;
    public EnumC9931l metrica;
    public int mopub;
    public boolean purchase;
    public C3417l remoteconfig;
    public InterfaceC13490l subs;
    public long subscription;
    public InterfaceC4452l vip;
    public String yandex;
    public long admob = AbstractC17191l.yandex;
    public long smaato = 0;
    public long startapp = AbstractC7563l.admob(0, 0, 0, 0);
    public int adcel = -1;
    public int ads = -1;

    public C16836l(String str, C11090l c11090l, InterfaceC16061l interfaceC16061l, int i, boolean z, int i2, int i3) {
        this.yandex = str;
        this.loadAd = c11090l;
        this.crashlytics = interfaceC16061l;
        this.amazon = i;
        this.purchase = z;
        this.billing = i2;
        this.mopub = i3;
    }

    public final void amazon(InterfaceC13490l interfaceC13490l) {
        long jYandex;
        InterfaceC13490l interfaceC13490l2 = this.subs;
        if (interfaceC13490l != null) {
            int i = AbstractC17191l.loadAd;
            jYandex = AbstractC17191l.yandex(interfaceC13490l.loadAd(), interfaceC13490l.mo873super());
        } else {
            jYandex = AbstractC17191l.yandex;
        }
        if (interfaceC13490l2 == null) {
            this.subs = interfaceC13490l;
            this.admob = jYandex;
        } else if (interfaceC13490l == null || this.admob != jYandex) {
            this.subs = interfaceC13490l;
            this.admob = jYandex;
            this.subscription = (this.subscription << 2) | 1;
            crashlytics();
        }
    }

    public final void crashlytics() {
        this.isPro = null;
        this.vip = null;
        this.metrica = null;
        this.adcel = -1;
        this.ads = -1;
        this.startapp = AbstractC7563l.admob(0, 0, 0, 0);
        this.smaato = 0L;
        this.firebase = false;
    }

    public final boolean loadAd(long j, EnumC9931l enumC9931l) {
        long jYandex;
        InterfaceC4452l interfaceC4452l;
        this.subscription = (this.subscription << 2) | 3;
        boolean z = true;
        if (this.mopub > 1) {
            C3417l c3417lSubs = AbstractC7209l.subs(this.remoteconfig, enumC9931l, this.loadAd, this.subs, this.crashlytics);
            this.remoteconfig = c3417lSubs;
            jYandex = c3417lSubs.yandex(this.mopub, j);
        } else {
            jYandex = j;
        }
        C7546l c7546l = this.isPro;
        boolean z2 = false;
        if (c7546l != null && (interfaceC4452l = this.vip) != null && !interfaceC4452l.mo1545l() && enumC9931l == this.metrica && (C15519l.loadAd(jYandex, this.startapp) || (C15519l.admob(jYandex) == C15519l.admob(this.startapp) && C15519l.isPro(jYandex) == C15519l.isPro(this.startapp) && C15519l.mopub(jYandex) >= c7546l.subs() && !((C18118l) c7546l.f15549l).amazon))) {
            if (!C15519l.loadAd(jYandex, this.startapp)) {
                C7546l c7546l2 = this.isPro;
                long jAmazon = AbstractC7563l.amazon(jYandex, (((long) AbstractC0509l.loadAd(Math.min(((C14442l) c7546l2.f15545l).f28296l.crashlytics(), c7546l2.tapsense()))) << 32) | (((long) AbstractC0509l.loadAd(c7546l2.subs())) & 4294967295L));
                this.smaato = jAmazon;
                if (this.amazon == 3 || (((int) (jAmazon >> 32)) >= c7546l2.tapsense() && ((int) (4294967295L & jAmazon)) >= c7546l2.subs())) {
                    z = false;
                }
                this.firebase = z;
                this.startapp = jYandex;
            }
            return false;
        }
        InterfaceC4452l interfaceC4452lPurchase = purchase(enumC9931l);
        long jAmazon2 = AbstractC13766l.amazon(jYandex, this.purchase, this.amazon, interfaceC4452lPurchase.mo1547l());
        boolean z3 = this.purchase;
        int i = this.amazon;
        int i2 = this.billing;
        C7546l c7546l3 = new C7546l((C14442l) interfaceC4452lPurchase, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jAmazon2);
        this.startapp = jYandex;
        long jAmazon3 = AbstractC7563l.amazon(jYandex, (((long) AbstractC0509l.loadAd(c7546l3.subs())) & 4294967295L) | (((long) AbstractC0509l.loadAd(c7546l3.tapsense())) << 32));
        this.smaato = jAmazon3;
        if (this.amazon != 3 && (((int) (jAmazon3 >> 32)) < c7546l3.tapsense() || ((int) (jAmazon3 & 4294967295L)) < c7546l3.subs())) {
            z2 = true;
        }
        this.firebase = z2;
        this.isPro = c7546l3;
        return true;
    }

    public final InterfaceC4452l purchase(EnumC9931l enumC9931l) {
        InterfaceC4452l c14442l = this.vip;
        if (c14442l == null || enumC9931l != this.metrica || c14442l.mo1545l()) {
            this.metrica = enumC9931l;
            String str = this.yandex;
            C11090l c11090lCrashlytics = AbstractC7709l.crashlytics(this.loadAd, enumC9931l);
            InterfaceC13490l interfaceC13490l = this.subs;
            InterfaceC16061l interfaceC16061l = this.crashlytics;
            C2580l c2580l = C2580l.f5619l;
            c14442l = new C14442l(str, c11090lCrashlytics, c2580l, c2580l, interfaceC16061l, interfaceC13490l);
        }
        this.vip = c14442l;
        return c14442l;
    }

    public final String toString() {
        return AbstractC15560l.ads(this.subscription, ", constraints=$)", AbstractC14814l.license("ParagraphLayoutCache(paragraph=", this.isPro != null ? "<paragraph>" : "null", ", lastDensity=", AbstractC17191l.loadAd(this.admob), ", history="));
    }

    public final int yandex(int i, EnumC9931l enumC9931l) {
        int i2 = this.adcel;
        int i3 = this.ads;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jYandex = AbstractC7563l.yandex(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.mopub > 1) {
            C3417l c3417lSubs = AbstractC7209l.subs(this.remoteconfig, enumC9931l, this.loadAd, this.subs, this.crashlytics);
            this.remoteconfig = c3417lSubs;
            jYandex = c3417lSubs.yandex(this.mopub, jYandex);
        }
        InterfaceC4452l interfaceC4452lPurchase = purchase(enumC9931l);
        long jAmazon = AbstractC13766l.amazon(jYandex, this.purchase, this.amazon, interfaceC4452lPurchase.mo1547l());
        boolean z = this.purchase;
        int i4 = this.amazon;
        int i5 = this.billing;
        int iLoadAd = AbstractC0509l.loadAd(new C7546l((C14442l) interfaceC4452lPurchase, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jAmazon).subs());
        int iSubs = C15519l.subs(jYandex);
        if (iLoadAd < iSubs) {
            iLoadAd = iSubs;
        }
        this.adcel = i;
        this.ads = iLoadAd;
        return iLoadAd;
    }
}
