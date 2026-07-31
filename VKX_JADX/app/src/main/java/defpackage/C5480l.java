package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5480l implements InterfaceC14748l {
    public final long admob;
    public final AbstractC2249l amazon;
    public final AbstractC2249l billing;
    public final Object crashlytics;
    public final C0010l loadAd;
    public final Object mopub;
    public final AbstractC2249l purchase;
    public final C1796l yandex;

    public C5480l(C17308l c17308l, C0010l c0010l, Object obj, AbstractC2249l abstractC2249l) {
        AbstractC2249l abstractC2249l2;
        InterfaceC18080l interfaceC18080l = c17308l.yandex;
        C1796l c1796l = new C1796l();
        c1796l.loadAd = interfaceC18080l;
        c1796l.yandex = interfaceC18080l.mopub();
        InterfaceC18080l interfaceC18080l2 = (InterfaceC18080l) c1796l.loadAd;
        this.yandex = c1796l;
        this.loadAd = c0010l;
        this.crashlytics = obj;
        AbstractC2249l abstractC2249l3 = (AbstractC2249l) c0010l.yandex.invoke(obj);
        this.amazon = abstractC2249l3;
        this.purchase = AbstractC4959l.amazon(abstractC2249l);
        Function1 function1 = c0010l.loadAd;
        if (((AbstractC2249l) c1796l.purchase) == null) {
            c1796l.purchase = abstractC2249l3.crashlytics();
        }
        AbstractC2249l abstractC2249l4 = (AbstractC2249l) c1796l.purchase;
        int iLoadAd = (abstractC2249l4 == null ? null : abstractC2249l4).loadAd();
        int i = 0;
        while (true) {
            abstractC2249l2 = (AbstractC2249l) c1796l.purchase;
            if (i >= iLoadAd) {
                break;
            }
            if (abstractC2249l2 == null) {
                abstractC2249l2 = null;
            }
            abstractC2249l2.purchase(i, interfaceC18080l2.adcel(abstractC2249l3.yandex(i), abstractC2249l.yandex(i)));
            i++;
        }
        this.mopub = function1.invoke(abstractC2249l2 == null ? null : abstractC2249l2);
        if (((AbstractC2249l) c1796l.amazon) == null) {
            c1796l.amazon = abstractC2249l3.crashlytics();
        }
        AbstractC2249l abstractC2249l5 = (AbstractC2249l) c1796l.amazon;
        int iLoadAd2 = (abstractC2249l5 != null ? abstractC2249l5 : null).loadAd();
        long jMax = 0;
        for (int i2 = 0; i2 < iLoadAd2; i2++) {
            abstractC2249l3.getClass();
            jMax = Math.max(jMax, interfaceC18080l2.metrica(abstractC2249l.yandex(i2)));
        }
        this.admob = jMax;
        AbstractC2249l abstractC2249lAmazon = AbstractC4959l.amazon(this.yandex.crashlytics(jMax, this.amazon, abstractC2249l));
        this.billing = abstractC2249lAmazon;
        int iLoadAd3 = abstractC2249lAmazon.loadAd();
        for (int i3 = 0; i3 < iLoadAd3; i3++) {
            AbstractC2249l abstractC2249l6 = this.billing;
            float fYandex = abstractC2249l6.yandex(i3);
            float f = this.yandex.yandex;
            abstractC2249l6.purchase(i3, AbstractC8576l.amazon(fYandex, -f, f));
        }
    }

    @Override // defpackage.InterfaceC14748l
    public final AbstractC2249l amazon(long j) {
        if (AbstractC5020l.purchase(this, j)) {
            return this.billing;
        }
        return this.yandex.crashlytics(j, this.amazon, this.purchase);
    }

    @Override // defpackage.InterfaceC14748l
    public final Object billing(long j) {
        AbstractC2249l abstractC2249l;
        if (AbstractC5020l.purchase(this, j)) {
            return this.mopub;
        }
        Function1 function1 = this.loadAd.loadAd;
        C1796l c1796l = this.yandex;
        AbstractC2249l abstractC2249l2 = (AbstractC2249l) c1796l.crashlytics;
        AbstractC2249l abstractC2249l3 = this.amazon;
        if (abstractC2249l2 == null) {
            c1796l.crashlytics = abstractC2249l3.crashlytics();
        }
        AbstractC2249l abstractC2249l4 = (AbstractC2249l) c1796l.crashlytics;
        if (abstractC2249l4 == null) {
            abstractC2249l4 = null;
        }
        int iLoadAd = abstractC2249l4.loadAd();
        int i = 0;
        while (true) {
            abstractC2249l = (AbstractC2249l) c1796l.crashlytics;
            if (i >= iLoadAd) {
                break;
            }
            if (abstractC2249l == null) {
                abstractC2249l = null;
            }
            abstractC2249l.purchase(i, ((InterfaceC18080l) c1796l.loadAd).firebase(abstractC2249l3.yandex(i), this.purchase.yandex(i), j));
            i++;
        }
        return function1.invoke(abstractC2249l != null ? abstractC2249l : null);
    }

    @Override // defpackage.InterfaceC14748l
    public final C0010l crashlytics() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC14748l
    public final long loadAd() {
        return this.admob;
    }

    @Override // defpackage.InterfaceC14748l
    public final Object mopub() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC14748l
    public final /* synthetic */ boolean purchase(long j) {
        return AbstractC5020l.purchase(this, j);
    }

    @Override // defpackage.InterfaceC14748l
    public final boolean yandex() {
        return false;
    }
}
