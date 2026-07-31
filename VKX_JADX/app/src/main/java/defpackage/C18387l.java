package defpackage;

/* JADX INFO: renamed from: lٙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18387l extends C9761l {
    public final C0777l billing;
    public final float[] mopub;
    public final C0777l purchase;

    public C18387l(C0777l c0777l, C0777l c0777l2) {
        float[] fArrSubs;
        super(c0777l2, c0777l, c0777l2, null);
        this.purchase = c0777l;
        this.billing = c0777l2;
        float[] fArr = C7225l.f15054l.f15055l;
        C18558l c18558l = c0777l.amazon;
        float[] fArr2 = c0777l.subs;
        C18558l c18558l2 = c0777l2.amazon;
        float[] fArr3 = c0777l2.isPro;
        if (AbstractC0136l.purchase(c18558l, c18558l2)) {
            fArrSubs = AbstractC0136l.subs(fArr3, fArr2);
        } else {
            float[] fArrYandex = c18558l.yandex();
            float[] fArrYandex2 = c18558l2.yandex();
            C18558l c18558l3 = AbstractC2238l.loadAd;
            fArrSubs = AbstractC0136l.subs(AbstractC0136l.purchase(c18558l2, c18558l3) ? fArr3 : AbstractC0136l.mopub(AbstractC0136l.subs(AbstractC0136l.amazon(fArr, fArrYandex2, new float[]{0.964212f, 1.0f, 0.825188f}), c0777l2.subs)), AbstractC0136l.purchase(c18558l, c18558l3) ? fArr2 : AbstractC0136l.subs(AbstractC0136l.amazon(fArr, fArrYandex, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.mopub = fArrSubs;
    }

    @Override // defpackage.C9761l
    public final long yandex(long j) {
        float fAdmob = C9735l.admob(j);
        float fMopub = C9735l.mopub(j);
        float fPurchase = C9735l.purchase(j);
        float fAmazon = C9735l.amazon(j);
        C8646l c8646l = this.purchase.startapp;
        float fAmazon2 = (float) c8646l.amazon(fAdmob);
        float fAmazon3 = (float) c8646l.amazon(fMopub);
        float fAmazon4 = (float) c8646l.amazon(fPurchase);
        float[] fArr = this.mopub;
        float f = (fArr[6] * fAmazon4) + (fArr[3] * fAmazon3) + (fArr[0] * fAmazon2);
        float f2 = (fArr[7] * fAmazon4) + (fArr[4] * fAmazon3) + (fArr[1] * fAmazon2);
        float f3 = (fArr[8] * fAmazon4) + (fArr[5] * fAmazon3) + (fArr[2] * fAmazon2);
        C0777l c0777l = this.billing;
        float fAmazon5 = (float) c0777l.remoteconfig.amazon(f);
        C8646l c8646l2 = c0777l.remoteconfig;
        return AbstractC12953l.yandex(fAmazon5, (float) c8646l2.amazon(f2), (float) c8646l2.amazon(f3), fAmazon, c0777l);
    }
}
