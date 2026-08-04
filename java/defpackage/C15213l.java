package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٔ۠ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15213l extends AbstractC8859l {
    public final /* synthetic */ int mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15213l(AbstractC11918l abstractC11918l, AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, int i) {
        super(abstractC11918l, abstractC2426l, abstractC2426l2);
        this.mopub = i;
    }

    private final AbstractC8859l applovin(AbstractC8859l abstractC8859l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        if (this == abstractC8859l) {
            return advert();
        }
        C10438l c10438l = (C10438l) this.loadAd;
        C10438l c10438l2 = (C10438l) this.crashlytics;
        C10438l c10438l3 = (C10438l) abstractC8859l.loadAd;
        C10438l c10438l4 = (C10438l) abstractC8859l.subs();
        C10438l c10438l5 = (C10438l) this.amazon[0];
        C10438l c10438l6 = (C10438l) abstractC8859l.isPro();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = new int[8];
        int[] iArr10 = c10438l5.f21255l;
        boolean zStartapp = AbstractC5998l.startapp(iArr10);
        if (zStartapp) {
            iArr = c10438l3.f21255l;
            iArr2 = c10438l4.f21255l;
        } else {
            AbstractC5998l.pro(iArr10, iArr5);
            AbstractC3461l.subs(iArr5, iArr8);
            AbstractC3461l.mopub(iArr8, c10438l3.f21255l, iArr7, iArr5);
            AbstractC5998l.tapsense(iArr8, iArr10, iArr5);
            AbstractC3461l.subs(iArr5, iArr8);
            AbstractC3461l.mopub(iArr8, c10438l4.f21255l, iArr8, iArr5);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        int[] iArr11 = c10438l6.f21255l;
        boolean zStartapp2 = AbstractC5998l.startapp(iArr11);
        if (zStartapp2) {
            iArr3 = c10438l.f21255l;
            iArr4 = c10438l2.f21255l;
        } else {
            AbstractC5998l.pro(iArr11, iArr5);
            AbstractC3461l.subs(iArr5, iArr9);
            AbstractC3461l.mopub(iArr9, c10438l.f21255l, iArr6, iArr5);
            AbstractC5998l.tapsense(iArr9, iArr11, iArr5);
            AbstractC3461l.subs(iArr5, iArr9);
            AbstractC3461l.mopub(iArr9, c10438l2.f21255l, iArr9, iArr5);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[8];
        AbstractC3461l.smaato(iArr3, iArr, iArr12);
        AbstractC3461l.smaato(iArr4, iArr2, iArr7);
        boolean zAds = AbstractC5998l.ads(iArr12);
        AbstractC11918l abstractC11918l = this.yandex;
        if (zAds) {
            return AbstractC5998l.ads(iArr7) ? advert() : abstractC11918l.remoteconfig();
        }
        AbstractC5998l.pro(iArr12, iArr5);
        AbstractC3461l.subs(iArr5, iArr8);
        int[] iArr13 = new int[8];
        AbstractC5998l.tapsense(iArr8, iArr12, iArr5);
        AbstractC3461l.subs(iArr5, iArr13);
        AbstractC5998l.tapsense(iArr8, iArr3, iArr5);
        AbstractC3461l.subs(iArr5, iArr8);
        int iSmaato = AbstractC4952l.smaato(iArr13, 8);
        int[] iArr14 = AbstractC3461l.yandex;
        if (iSmaato != 0) {
            AbstractC5998l.ad(iArr14, iArr14, iArr13);
        } else {
            AbstractC5998l.ad(iArr14, iArr13, iArr13);
        }
        AbstractC5998l.tapsense(iArr4, iArr13, iArr6);
        AbstractC3461l.isPro(iArr13, AbstractC5998l.crashlytics(iArr8, iArr8, iArr13));
        C10438l c10438l7 = new C10438l(iArr9);
        AbstractC5998l.pro(iArr7, iArr5);
        AbstractC3461l.subs(iArr5, iArr9);
        AbstractC3461l.smaato(iArr9, iArr13, iArr9);
        C10438l c10438l8 = new C10438l(iArr13);
        AbstractC3461l.smaato(iArr8, iArr9, iArr13);
        int iSignature = AbstractC5998l.Signature(iArr13, iArr7, iArr6);
        int[] iArr15 = AbstractC3461l.loadAd;
        if (iSignature != 0 || ((iArr6[15] >>> 1) >= Integer.MAX_VALUE && AbstractC4952l.adcel(16, iArr6, iArr15))) {
            AbstractC4952l.m1652synchronized(16, iArr15, iArr6);
        }
        AbstractC3461l.subs(iArr6, iArr13);
        C10438l c10438l9 = new C10438l(iArr12);
        if (!zStartapp) {
            AbstractC3461l.mopub(iArr12, iArr10, iArr12, iArr5);
        }
        if (!zStartapp2) {
            AbstractC3461l.mopub(iArr12, iArr11, iArr12, iArr5);
        }
        return new C15213l(abstractC11918l, c10438l7, c10438l8, new AbstractC2426l[]{c10438l9}, 12);
    }

    private final AbstractC8859l appmetrica(AbstractC8859l abstractC8859l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        if (this == abstractC8859l) {
            return advert();
        }
        C3849l c3849l = (C3849l) this.loadAd;
        C3849l c3849l2 = (C3849l) this.crashlytics;
        C3849l c3849l3 = (C3849l) abstractC8859l.loadAd;
        C3849l c3849l4 = (C3849l) abstractC8859l.subs();
        C3849l c3849l5 = (C3849l) this.amazon[0];
        C3849l c3849l6 = (C3849l) abstractC8859l.isPro();
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[24];
        int[] iArr8 = new int[12];
        int[] iArr9 = new int[12];
        boolean zVip = c3849l5.vip();
        int[] iArr10 = c3849l5.f7955l;
        if (zVip) {
            iArr = c3849l3.f7955l;
            iArr2 = c3849l4.f7955l;
        } else {
            AbstractC15852l.amazon(iArr10, iArr5);
            AbstractC16817l.smaato(iArr5, iArr8);
            AbstractC16817l.isPro(iArr8, c3849l3.f7955l, iArr7, iArr5);
            AbstractC15852l.crashlytics(iArr8, iArr10, iArr5);
            AbstractC16817l.smaato(iArr5, iArr8);
            AbstractC16817l.isPro(iArr8, c3849l4.f7955l, iArr8, iArr5);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        boolean zVip2 = c3849l6.vip();
        int[] iArr11 = c3849l6.f7955l;
        if (zVip2) {
            iArr3 = c3849l.f7955l;
            iArr4 = c3849l2.f7955l;
        } else {
            AbstractC15852l.amazon(iArr11, iArr5);
            AbstractC16817l.smaato(iArr5, iArr9);
            AbstractC16817l.isPro(iArr9, c3849l.f7955l, iArr6, iArr5);
            AbstractC15852l.crashlytics(iArr9, iArr11, iArr5);
            AbstractC16817l.smaato(iArr5, iArr9);
            AbstractC16817l.isPro(iArr9, c3849l2.f7955l, iArr9, iArr5);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[12];
        AbstractC16817l.adcel(iArr3, iArr, iArr12);
        int[] iArr13 = new int[12];
        AbstractC16817l.adcel(iArr4, iArr2, iArr13);
        boolean zPro = AbstractC4952l.pro(iArr12, 12);
        AbstractC11918l abstractC11918l = this.yandex;
        if (zPro) {
            return AbstractC4952l.pro(iArr13, 12) ? advert() : abstractC11918l.remoteconfig();
        }
        AbstractC15852l.amazon(iArr12, iArr5);
        AbstractC16817l.smaato(iArr5, iArr8);
        int[] iArr14 = new int[12];
        AbstractC15852l.crashlytics(iArr8, iArr12, iArr5);
        AbstractC16817l.smaato(iArr5, iArr14);
        AbstractC16817l.isPro(iArr8, iArr3, iArr8, iArr5);
        int iSmaato = AbstractC4952l.smaato(iArr14, 12);
        int[] iArr15 = AbstractC16817l.f32844l;
        if (iSmaato != 0) {
            AbstractC4952l.inmobi(12, iArr15, iArr15, iArr14);
        } else {
            AbstractC4952l.inmobi(12, iArr15, iArr14, iArr14);
        }
        AbstractC15852l.crashlytics(iArr4, iArr14, iArr6);
        AbstractC16817l.remoteconfig(iArr14, AbstractC4952l.purchase(12, iArr8, iArr8, iArr14));
        C3849l c3849l7 = new C3849l(iArr9);
        AbstractC15852l.amazon(iArr13, iArr5);
        AbstractC16817l.smaato(iArr5, iArr9);
        AbstractC16817l.adcel(iArr9, iArr14, iArr9);
        C3849l c3849l8 = new C3849l(iArr14);
        AbstractC16817l.adcel(iArr8, iArr9, iArr14);
        AbstractC15852l.crashlytics(iArr14, iArr13, iArr7);
        if ((AbstractC4952l.crashlytics(24, iArr6, iArr7, iArr6) != 0 || (iArr6[23] == -1 && AbstractC4952l.adcel(24, iArr6, AbstractC16817l.f32843l))) && AbstractC4952l.mopub(17, AbstractC16817l.f32842l, iArr6) != 0) {
            AbstractC4952l.tapsense(24, 17, iArr6);
        }
        AbstractC16817l.smaato(iArr6, iArr14);
        C3849l c3849l9 = new C3849l(iArr12);
        if (!zVip) {
            AbstractC16817l.isPro(iArr12, iArr10, iArr12, iArr5);
        }
        if (!zVip2) {
            AbstractC16817l.isPro(iArr12, iArr11, iArr12, iArr5);
        }
        return new C15213l(abstractC11918l, c3849l7, c3849l8, new AbstractC2426l[]{c3849l9}, 13);
    }

    private final AbstractC8859l premium(AbstractC8859l abstractC8859l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        if (this == abstractC8859l) {
            return advert();
        }
        C11431l c11431l = (C11431l) this.loadAd;
        C11431l c11431l2 = (C11431l) this.crashlytics;
        C11431l c11431l3 = (C11431l) abstractC8859l.loadAd;
        C11431l c11431l4 = (C11431l) abstractC8859l.subs();
        C11431l c11431l5 = (C11431l) this.amazon[0];
        C11431l c11431l6 = (C11431l) abstractC8859l.isPro();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = new int[8];
        int[] iArr10 = c11431l5.f23005l;
        boolean zStartapp = AbstractC5998l.startapp(iArr10);
        if (zStartapp) {
            iArr = c11431l3.f23005l;
            iArr2 = c11431l4.f23005l;
        } else {
            AbstractC5998l.pro(iArr10, iArr5);
            AbstractC12359l.purchase(iArr5, iArr8);
            AbstractC12359l.amazon(iArr8, c11431l3.f23005l, iArr7, iArr5);
            AbstractC5998l.tapsense(iArr8, iArr10, iArr5);
            AbstractC12359l.purchase(iArr5, iArr8);
            AbstractC12359l.amazon(iArr8, c11431l4.f23005l, iArr8, iArr5);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        int[] iArr11 = c11431l6.f23005l;
        boolean zStartapp2 = AbstractC5998l.startapp(iArr11);
        if (zStartapp2) {
            iArr3 = c11431l.f23005l;
            iArr4 = c11431l2.f23005l;
        } else {
            AbstractC5998l.pro(iArr11, iArr5);
            AbstractC12359l.purchase(iArr5, iArr9);
            AbstractC12359l.amazon(iArr9, c11431l.f23005l, iArr6, iArr5);
            AbstractC5998l.tapsense(iArr9, iArr11, iArr5);
            AbstractC12359l.purchase(iArr5, iArr9);
            AbstractC12359l.amazon(iArr9, c11431l2.f23005l, iArr9, iArr5);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[8];
        AbstractC12359l.admob(iArr3, iArr, iArr12);
        AbstractC12359l.admob(iArr4, iArr2, iArr7);
        boolean zAds = AbstractC5998l.ads(iArr12);
        AbstractC11918l abstractC11918l = this.yandex;
        if (zAds) {
            return AbstractC5998l.ads(iArr7) ? advert() : abstractC11918l.remoteconfig();
        }
        AbstractC5998l.pro(iArr12, iArr5);
        AbstractC12359l.purchase(iArr5, iArr8);
        int[] iArr13 = new int[8];
        AbstractC5998l.tapsense(iArr8, iArr12, iArr5);
        AbstractC12359l.purchase(iArr5, iArr13);
        AbstractC5998l.tapsense(iArr8, iArr3, iArr5);
        AbstractC12359l.purchase(iArr5, iArr8);
        int iSmaato = AbstractC4952l.smaato(iArr13, 8);
        int[] iArr14 = AbstractC12359l.yandex;
        if (iSmaato != 0) {
            AbstractC5998l.ad(iArr14, iArr14, iArr13);
        } else {
            AbstractC5998l.ad(iArr14, iArr13, iArr13);
        }
        AbstractC5998l.tapsense(iArr4, iArr13, iArr6);
        AbstractC12359l.billing(iArr13, AbstractC5998l.crashlytics(iArr8, iArr8, iArr13));
        C11431l c11431l7 = new C11431l(iArr9);
        AbstractC5998l.pro(iArr7, iArr5);
        AbstractC12359l.purchase(iArr5, iArr9);
        AbstractC12359l.admob(iArr9, iArr13, iArr9);
        C11431l c11431l8 = new C11431l(iArr13);
        AbstractC12359l.admob(iArr8, iArr9, iArr13);
        if ((AbstractC5998l.Signature(iArr13, iArr7, iArr6) != 0 || (iArr6[15] == -1 && AbstractC4952l.adcel(16, iArr6, AbstractC12359l.loadAd))) && AbstractC4952l.mopub(10, AbstractC12359l.crashlytics, iArr6) != 0) {
            AbstractC4952l.tapsense(16, 10, iArr6);
        }
        AbstractC12359l.purchase(iArr6, iArr13);
        C11431l c11431l9 = new C11431l(iArr12);
        if (!zStartapp) {
            AbstractC12359l.amazon(iArr12, iArr10, iArr12, iArr5);
        }
        if (!zStartapp2) {
            AbstractC12359l.amazon(iArr12, iArr11, iArr12, iArr5);
        }
        return new C15213l(abstractC11918l, c11431l7, c11431l8, new AbstractC2426l[]{c11431l9}, 11);
    }

    private final AbstractC8859l signatures(AbstractC8859l abstractC8859l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        if (this == abstractC8859l) {
            return advert();
        }
        C5420l c5420l = (C5420l) this.loadAd;
        C5420l c5420l2 = (C5420l) this.crashlytics;
        C5420l c5420l3 = (C5420l) abstractC8859l.loadAd;
        C5420l c5420l4 = (C5420l) abstractC8859l.subs();
        C5420l c5420l5 = (C5420l) this.amazon[0];
        C5420l c5420l6 = (C5420l) abstractC8859l.isPro();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = c5420l5.f11613l;
        boolean zAds = AbstractC3292l.ads(iArr9);
        if (zAds) {
            iArr = c5420l3.f11613l;
            iArr2 = c5420l4.f11613l;
        } else {
            AbstractC4654l.vip(iArr9, iArr7);
            AbstractC4654l.isPro(iArr7, c5420l3.f11613l, iArr6);
            AbstractC4654l.isPro(iArr7, iArr9, iArr7);
            AbstractC4654l.isPro(iArr7, c5420l4.f11613l, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = c5420l6.f11613l;
        boolean zAds2 = AbstractC3292l.ads(iArr10);
        if (zAds2) {
            iArr3 = c5420l.f11613l;
            iArr4 = c5420l2.f11613l;
        } else {
            AbstractC4654l.vip(iArr10, iArr8);
            AbstractC4654l.isPro(iArr8, c5420l.f11613l, iArr5);
            AbstractC4654l.isPro(iArr8, iArr10, iArr8);
            AbstractC4654l.isPro(iArr8, c5420l2.f11613l, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[7];
        AbstractC4654l.metrica(iArr3, iArr, iArr11);
        AbstractC4654l.metrica(iArr4, iArr2, iArr6);
        boolean zSubscription = AbstractC3292l.subscription(iArr11);
        AbstractC11918l abstractC11918l = this.yandex;
        if (zSubscription) {
            return AbstractC3292l.subscription(iArr6) ? advert() : abstractC11918l.remoteconfig();
        }
        AbstractC4654l.vip(iArr11, iArr7);
        int[] iArr12 = new int[7];
        AbstractC4654l.isPro(iArr7, iArr11, iArr12);
        AbstractC4654l.isPro(iArr7, iArr3, iArr7);
        AbstractC4654l.firebase(iArr12, iArr12);
        AbstractC3292l.tapsense(iArr4, iArr12, iArr5);
        AbstractC4654l.remoteconfig(iArr12, AbstractC3292l.purchase(iArr7, iArr7, iArr12));
        C5420l c5420l7 = new C5420l(iArr8);
        AbstractC4654l.vip(iArr6, iArr8);
        AbstractC4654l.metrica(iArr8, iArr12, iArr8);
        C5420l c5420l8 = new C5420l(iArr12);
        AbstractC4654l.metrica(iArr7, iArr8, iArr12);
        if ((AbstractC3292l.Signature(iArr12, iArr6, iArr5) != 0 || (iArr5[13] == -1 && AbstractC4952l.adcel(14, iArr5, AbstractC4654l.loadAd))) && AbstractC4952l.mopub(11, AbstractC4654l.crashlytics, iArr5) != 0) {
            AbstractC4952l.tapsense(14, 11, iArr5);
        }
        AbstractC4654l.smaato(iArr5, iArr12);
        C5420l c5420l9 = new C5420l(iArr11);
        if (!zAds) {
            AbstractC4654l.isPro(iArr11, iArr9, iArr11);
        }
        if (!zAds2) {
            AbstractC4654l.isPro(iArr11, iArr10, iArr11);
        }
        return new C15213l(abstractC11918l, c5420l7, c5420l8, new AbstractC2426l[]{c5420l9}, 10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x002e A[SYNTHETIC] */
    @Override // defpackage.AbstractC8859l
    public AbstractC8859l ad(int i) {
        AbstractC2426l abstractC2426lAdvert;
        int i2;
        boolean z;
        C15213l c15213l;
        AbstractC2426l abstractC2426lAmazon;
        AbstractC2426l abstractC2426lAmazon2;
        AbstractC2426l abstractC2426lAmazon3;
        switch (this.mopub) {
            case 1:
                C15213l c15213l2 = null;
                if (i >= 0) {
                    if (i == 0 || smaato()) {
                        return this;
                    }
                    int i3 = 1;
                    if (i == 1) {
                        return advert();
                    }
                    AbstractC2426l abstractC2426lStartapp = this.crashlytics;
                    boolean zMetrica = abstractC2426lStartapp.metrica();
                    AbstractC11918l abstractC11918l = this.yandex;
                    if (!zMetrica) {
                        int i4 = abstractC11918l.billing;
                        AbstractC2426l abstractC2426lAmazon4 = abstractC11918l.loadAd;
                        AbstractC2426l[] abstractC2426lArr = this.amazon;
                        boolean z2 = false;
                        AbstractC2426l abstractC2426lIsPro = abstractC2426lArr.length < 1 ? abstractC11918l.isPro(InterfaceC11695l.startapp) : abstractC2426lArr[0];
                        boolean zVip = abstractC2426lIsPro.vip();
                        AbstractC2426l abstractC2426lStartapp2 = this.loadAd;
                        if (zVip || i4 == 0) {
                            abstractC2426lAdvert = abstractC2426lStartapp;
                            i2 = 0;
                            while (i2 < i) {
                                if (abstractC2426lAdvert.metrica()) {
                                    AbstractC2426l abstractC2426lLicense = abstractC2426lStartapp2.license();
                                    abstractC2426lAmazon = abstractC2426lLicense.amazon(abstractC2426lLicense).amazon(abstractC2426lLicense);
                                    abstractC2426lAmazon2 = abstractC2426lAdvert.amazon(abstractC2426lAdvert);
                                    AbstractC2426l abstractC2426lStartapp3 = abstractC2426lAmazon2.startapp(abstractC2426lAdvert);
                                    AbstractC2426l abstractC2426lStartapp4 = abstractC2426lStartapp2.startapp(abstractC2426lStartapp3);
                                    AbstractC2426l abstractC2426lAmazon5 = abstractC2426lStartapp4.amazon(abstractC2426lStartapp4);
                                    AbstractC2426l abstractC2426lLicense2 = abstractC2426lStartapp3.license();
                                    abstractC2426lAmazon3 = abstractC2426lLicense2.amazon(abstractC2426lLicense2);
                                    if (!abstractC2426lAmazon4.metrica()) {
                                        abstractC2426lAmazon = abstractC2426lAmazon.amazon(abstractC2426lAmazon4);
                                        AbstractC2426l abstractC2426lStartapp5 = abstractC2426lAmazon3.startapp(abstractC2426lAmazon4);
                                        abstractC2426lAmazon4 = abstractC2426lStartapp5.amazon(abstractC2426lStartapp5);
                                    }
                                    boolean z3 = z2;
                                    AbstractC2426l abstractC2426lAdvert2 = abstractC2426lAmazon.license().advert(abstractC2426lAmazon5.amazon(abstractC2426lAmazon5));
                                    abstractC2426lAdvert = abstractC2426lAmazon.startapp(abstractC2426lAmazon5.advert(abstractC2426lAdvert2)).advert(abstractC2426lAmazon3);
                                    if (abstractC2426lIsPro.vip()) {
                                        abstractC2426lIsPro = abstractC2426lAmazon2;
                                    } else {
                                        abstractC2426lIsPro = abstractC2426lAmazon2.startapp(abstractC2426lIsPro);
                                    }
                                    i2++;
                                    abstractC2426lStartapp2 = abstractC2426lAdvert2;
                                    z2 = z3;
                                }
                            }
                            z = z2;
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    AbstractC2426l abstractC2426l = abstractC2426lIsPro;
                                    AbstractC2426l abstractC2426lStartapp6 = abstractC2426lStartapp2.startapp(abstractC2426l);
                                    AbstractC2426l[] abstractC2426lArr2 = new AbstractC2426l[1];
                                    abstractC2426lArr2[z ? 1 : 0] = abstractC2426l.startapp(abstractC2426l.license());
                                    c15213l = new C15213l(abstractC11918l, abstractC2426lStartapp6, abstractC2426lAdvert, abstractC2426lArr2, 1);
                                } else if (i4 != 2) {
                                    AbstractC2426l[] abstractC2426lArr3 = new AbstractC2426l[1];
                                    abstractC2426lArr3[z ? 1 : 0] = abstractC2426lIsPro;
                                    c15213l = new C15213l(abstractC11918l, abstractC2426lStartapp2, abstractC2426lAdvert, abstractC2426lArr3, 1);
                                } else if (i4 == 4) {
                                    AbstractC2426l[] abstractC2426lArr4 = new AbstractC2426l[2];
                                    abstractC2426lArr4[z ? 1 : 0] = abstractC2426lIsPro;
                                    abstractC2426lArr4[1] = abstractC2426lAmazon4;
                                    c15213l = new C15213l(abstractC11918l, abstractC2426lStartapp2, abstractC2426lAdvert, abstractC2426lArr4, 1);
                                } else {
                                    C8339l.smaato("unsupported coordinate system");
                                }
                                return c15213l;
                            }
                            AbstractC2426l abstractC2426lRemoteconfig = abstractC2426lIsPro.remoteconfig();
                            AbstractC2426l abstractC2426lLicense3 = abstractC2426lRemoteconfig.license();
                            c15213l2 = new C15213l(abstractC11918l, abstractC2426lStartapp2.startapp(abstractC2426lLicense3), abstractC2426lAdvert.startapp(abstractC2426lLicense3.startapp(abstractC2426lRemoteconfig)), i3);
                        } else {
                            if (i4 == 1) {
                                AbstractC2426l abstractC2426lLicense4 = abstractC2426lIsPro.license();
                                abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426lIsPro);
                                abstractC2426lStartapp = abstractC2426lStartapp.startapp(abstractC2426lLicense4);
                                abstractC2426lAmazon4 = m3948throws(abstractC2426lIsPro, abstractC2426lLicense4);
                            } else if (i4 == 2) {
                                abstractC2426lAmazon4 = m3948throws(abstractC2426lIsPro, null);
                            } else if (i4 == 4) {
                                abstractC2426lAmazon4 = m3945package();
                            } else {
                                C8339l.smaato("unsupported coordinate system");
                            }
                            abstractC2426lAdvert = abstractC2426lStartapp;
                            i2 = 0;
                            while (i2 < i) {
                                if (abstractC2426lAdvert.metrica()) {
                                    AbstractC2426l abstractC2426lLicense5 = abstractC2426lStartapp2.license();
                                    abstractC2426lAmazon = abstractC2426lLicense5.amazon(abstractC2426lLicense5).amazon(abstractC2426lLicense5);
                                    abstractC2426lAmazon2 = abstractC2426lAdvert.amazon(abstractC2426lAdvert);
                                    AbstractC2426l abstractC2426lStartapp7 = abstractC2426lAmazon2.startapp(abstractC2426lAdvert);
                                    AbstractC2426l abstractC2426lStartapp8 = abstractC2426lStartapp2.startapp(abstractC2426lStartapp7);
                                    AbstractC2426l abstractC2426lAmazon6 = abstractC2426lStartapp8.amazon(abstractC2426lStartapp8);
                                    AbstractC2426l abstractC2426lLicense6 = abstractC2426lStartapp7.license();
                                    abstractC2426lAmazon3 = abstractC2426lLicense6.amazon(abstractC2426lLicense6);
                                    if (!abstractC2426lAmazon4.metrica()) {
                                        abstractC2426lAmazon = abstractC2426lAmazon.amazon(abstractC2426lAmazon4);
                                        AbstractC2426l abstractC2426lStartapp9 = abstractC2426lAmazon3.startapp(abstractC2426lAmazon4);
                                        abstractC2426lAmazon4 = abstractC2426lStartapp9.amazon(abstractC2426lStartapp9);
                                    }
                                    boolean z4 = z2;
                                    AbstractC2426l abstractC2426lAdvert3 = abstractC2426lAmazon.license().advert(abstractC2426lAmazon6.amazon(abstractC2426lAmazon6));
                                    abstractC2426lAdvert = abstractC2426lAmazon.startapp(abstractC2426lAmazon6.advert(abstractC2426lAdvert3)).advert(abstractC2426lAmazon3);
                                    if (abstractC2426lIsPro.vip()) {
                                        abstractC2426lIsPro = abstractC2426lAmazon2;
                                    } else {
                                        abstractC2426lIsPro = abstractC2426lAmazon2.startapp(abstractC2426lIsPro);
                                    }
                                    i2++;
                                    abstractC2426lStartapp2 = abstractC2426lAdvert3;
                                    z2 = z4;
                                }
                            }
                            z = z2;
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    AbstractC2426l abstractC2426l2 = abstractC2426lIsPro;
                                    AbstractC2426l abstractC2426lStartapp10 = abstractC2426lStartapp2.startapp(abstractC2426l2);
                                    AbstractC2426l[] abstractC2426lArr5 = new AbstractC2426l[1];
                                    abstractC2426lArr5[z ? 1 : 0] = abstractC2426l2.startapp(abstractC2426l2.license());
                                    c15213l = new C15213l(abstractC11918l, abstractC2426lStartapp10, abstractC2426lAdvert, abstractC2426lArr5, 1);
                                } else if (i4 != 2) {
                                    AbstractC2426l[] abstractC2426lArr6 = new AbstractC2426l[1];
                                    abstractC2426lArr6[z ? 1 : 0] = abstractC2426lIsPro;
                                    c15213l = new C15213l(abstractC11918l, abstractC2426lStartapp2, abstractC2426lAdvert, abstractC2426lArr6, 1);
                                } else if (i4 == 4) {
                                    AbstractC2426l[] abstractC2426lArr7 = new AbstractC2426l[2];
                                    abstractC2426lArr7[z ? 1 : 0] = abstractC2426lIsPro;
                                    abstractC2426lArr7[1] = abstractC2426lAmazon4;
                                    c15213l = new C15213l(abstractC11918l, abstractC2426lStartapp2, abstractC2426lAdvert, abstractC2426lArr7, 1);
                                } else {
                                    C8339l.smaato("unsupported coordinate system");
                                }
                                return c15213l;
                            }
                            AbstractC2426l abstractC2426lRemoteconfig2 = abstractC2426lIsPro.remoteconfig();
                            AbstractC2426l abstractC2426lLicense7 = abstractC2426lRemoteconfig2.license();
                            c15213l2 = new C15213l(abstractC11918l, abstractC2426lStartapp2.startapp(abstractC2426lLicense7), abstractC2426lAdvert.startapp(abstractC2426lLicense7.startapp(abstractC2426lRemoteconfig2)), i3);
                        }
                        return c15213l2;
                    }
                    return abstractC11918l.remoteconfig();
                }
                C8339l.metrica("'e' cannot be negative");
                return null;
            default:
                return super.ad(i);
        }
    }

    @Override // defpackage.AbstractC8859l
    public final boolean ads() {
        AbstractC11918l abstractC11918l = this.yandex;
        AbstractC2426l abstractC2426lStartapp = abstractC11918l.loadAd;
        AbstractC2426l abstractC2426lStartapp2 = abstractC11918l.crashlytics;
        AbstractC2426l abstractC2426lLicense = this.crashlytics.license();
        int iMopub = mopub();
        if (iMopub != 0) {
            AbstractC2426l[] abstractC2426lArr = this.amazon;
            if (iMopub == 1) {
                AbstractC2426l abstractC2426l = abstractC2426lArr[0];
                if (!abstractC2426l.vip()) {
                    AbstractC2426l abstractC2426lLicense2 = abstractC2426l.license();
                    AbstractC2426l abstractC2426lStartapp3 = abstractC2426l.startapp(abstractC2426lLicense2);
                    abstractC2426lLicense = abstractC2426lLicense.startapp(abstractC2426l);
                    abstractC2426lStartapp = abstractC2426lStartapp.startapp(abstractC2426lLicense2);
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426lStartapp3);
                }
            } else {
                if (iMopub != 2 && iMopub != 3 && iMopub != 4) {
                    C8339l.smaato("unsupported coordinate system");
                    return false;
                }
                AbstractC2426l abstractC2426l2 = abstractC2426lArr[0];
                if (!abstractC2426l2.vip()) {
                    AbstractC2426l abstractC2426lLicense3 = abstractC2426l2.license();
                    AbstractC2426l abstractC2426lLicense4 = abstractC2426lLicense3.license();
                    AbstractC2426l abstractC2426lStartapp4 = abstractC2426lLicense3.startapp(abstractC2426lLicense4);
                    abstractC2426lStartapp = abstractC2426lStartapp.startapp(abstractC2426lLicense4);
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426lStartapp4);
                }
            }
        }
        AbstractC2426l abstractC2426l3 = this.loadAd;
        return abstractC2426lLicense.equals(abstractC2426l3.license().amazon(abstractC2426lStartapp).startapp(abstractC2426l3).amazon(abstractC2426lStartapp2));
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l advert() {
        C15213l c15213l;
        AbstractC2426l abstractC2426lAdvert;
        AbstractC2426l abstractC2426lStartapp;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int i = this.mopub;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l = this.loadAd;
        AbstractC2426l abstractC2426l2 = this.crashlytics;
        int i2 = 1;
        switch (i) {
            case 0:
                if (smaato()) {
                    return this;
                }
                return abstractC2426l2.metrica() ? this.yandex.remoteconfig() : m3947synchronized(true);
            case 1:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica = abstractC2426l2.metrica();
                AbstractC11918l abstractC11918l = this.yandex;
                if (zMetrica) {
                    return abstractC11918l.remoteconfig();
                }
                int i3 = abstractC11918l.billing;
                if (i3 == 0) {
                    AbstractC2426l abstractC2426lLicense = abstractC2426l.license();
                    AbstractC2426l abstractC2426lAdmob = abstractC2426lLicense.amazon(abstractC2426lLicense).amazon(abstractC2426lLicense).amazon(abstractC11918l.loadAd).admob(abstractC2426l2.amazon(abstractC2426l2));
                    AbstractC2426l abstractC2426lAdvert2 = abstractC2426lAdmob.license().advert(abstractC2426l.amazon(abstractC2426l));
                    c15213l = new C15213l(abstractC11918l, abstractC2426lAdvert2, abstractC2426lAdmob.startapp(abstractC2426l.advert(abstractC2426lAdvert2)).advert(abstractC2426l2), i2);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 4) {
                                return m3946strictfp(true);
                            }
                            C8339l.smaato("unsupported coordinate system");
                            return null;
                        }
                        AbstractC2426l abstractC2426l3 = abstractC2426lArr[0];
                        boolean zVip = abstractC2426l3.vip();
                        AbstractC2426l abstractC2426lLicense2 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense3 = abstractC2426lLicense2.license();
                        AbstractC2426l abstractC2426lStartapp2 = abstractC11918l.loadAd;
                        AbstractC2426l abstractC2426lSubscription = abstractC2426lStartapp2.subscription();
                        if (abstractC2426lSubscription.signatures().equals(BigInteger.valueOf(3L))) {
                            AbstractC2426l abstractC2426lLicense4 = zVip ? abstractC2426l3 : abstractC2426l3.license();
                            AbstractC2426l abstractC2426lStartapp3 = abstractC2426l.amazon(abstractC2426lLicense4).startapp(abstractC2426l.advert(abstractC2426lLicense4));
                            abstractC2426lAdvert = abstractC2426lStartapp3.amazon(abstractC2426lStartapp3).amazon(abstractC2426lStartapp3);
                            abstractC2426lStartapp = abstractC2426lLicense2.startapp(abstractC2426l);
                        } else {
                            AbstractC2426l abstractC2426lLicense5 = abstractC2426l.license();
                            AbstractC2426l abstractC2426lAmazon = abstractC2426lLicense5.amazon(abstractC2426lLicense5).amazon(abstractC2426lLicense5);
                            if (zVip) {
                                abstractC2426lAdvert = abstractC2426lAmazon.amazon(abstractC2426lStartapp2);
                            } else if (abstractC2426lStartapp2.metrica()) {
                                abstractC2426lAdvert = abstractC2426lAmazon;
                            } else {
                                AbstractC2426l abstractC2426lLicense6 = abstractC2426l3.license().license();
                                if (abstractC2426lSubscription.billing() < abstractC2426lStartapp2.billing()) {
                                    abstractC2426lAdvert = abstractC2426lAmazon.advert(abstractC2426lLicense6.startapp(abstractC2426lSubscription));
                                } else {
                                    abstractC2426lStartapp2 = abstractC2426lLicense6.startapp(abstractC2426lStartapp2);
                                    abstractC2426lAdvert = abstractC2426lAmazon.amazon(abstractC2426lStartapp2);
                                }
                            }
                            abstractC2426lStartapp = abstractC2426l.startapp(abstractC2426lLicense2);
                        }
                        AbstractC2426l abstractC2426lAmazon2 = abstractC2426lStartapp.amazon(abstractC2426lStartapp);
                        AbstractC2426l abstractC2426lAmazon3 = abstractC2426lAmazon2.amazon(abstractC2426lAmazon2);
                        AbstractC2426l abstractC2426lAdvert3 = abstractC2426lAdvert.license().advert(abstractC2426lAmazon3.amazon(abstractC2426lAmazon3));
                        AbstractC2426l abstractC2426lStartapp4 = abstractC2426lAmazon3.advert(abstractC2426lAdvert3).startapp(abstractC2426lAdvert);
                        AbstractC2426l abstractC2426lAmazon4 = abstractC2426lLicense3.amazon(abstractC2426lLicense3);
                        AbstractC2426l abstractC2426lAmazon5 = abstractC2426lAmazon4.amazon(abstractC2426lAmazon4);
                        AbstractC2426l abstractC2426lAdvert4 = abstractC2426lStartapp4.advert(abstractC2426lAmazon5.amazon(abstractC2426lAmazon5));
                        AbstractC2426l abstractC2426lAmazon6 = abstractC2426l2.amazon(abstractC2426l2);
                        if (!zVip) {
                            abstractC2426lAmazon6 = abstractC2426lAmazon6.startapp(abstractC2426l3);
                        }
                        return new C15213l(abstractC11918l, abstractC2426lAdvert3, abstractC2426lAdvert4, new AbstractC2426l[]{abstractC2426lAmazon6}, 1);
                    }
                    AbstractC2426l abstractC2426l4 = abstractC2426lArr[0];
                    boolean zVip2 = abstractC2426l4.vip();
                    AbstractC2426l abstractC2426lStartapp5 = abstractC11918l.loadAd;
                    if (!abstractC2426lStartapp5.metrica() && !zVip2) {
                        abstractC2426lStartapp5 = abstractC2426lStartapp5.startapp(abstractC2426l4.license());
                    }
                    AbstractC2426l abstractC2426lLicense7 = abstractC2426l.license();
                    AbstractC2426l abstractC2426lAmazon7 = abstractC2426lStartapp5.amazon(abstractC2426lLicense7.amazon(abstractC2426lLicense7).amazon(abstractC2426lLicense7));
                    AbstractC2426l abstractC2426lStartapp6 = zVip2 ? abstractC2426l2 : abstractC2426l2.startapp(abstractC2426l4);
                    AbstractC2426l abstractC2426lLicense8 = zVip2 ? abstractC2426l2.license() : abstractC2426lStartapp6.startapp(abstractC2426l2);
                    AbstractC2426l abstractC2426lStartapp7 = abstractC2426l.startapp(abstractC2426lLicense8);
                    AbstractC2426l abstractC2426lAmazon8 = abstractC2426lStartapp7.amazon(abstractC2426lStartapp7);
                    AbstractC2426l abstractC2426lAmazon9 = abstractC2426lAmazon8.amazon(abstractC2426lAmazon8);
                    AbstractC2426l abstractC2426lAdvert5 = abstractC2426lAmazon7.license().advert(abstractC2426lAmazon9.amazon(abstractC2426lAmazon9));
                    AbstractC2426l abstractC2426lAmazon10 = abstractC2426lStartapp6.amazon(abstractC2426lStartapp6);
                    AbstractC2426l abstractC2426lStartapp8 = abstractC2426lAdvert5.startapp(abstractC2426lAmazon10);
                    AbstractC2426l abstractC2426lAmazon11 = abstractC2426lLicense8.amazon(abstractC2426lLicense8);
                    AbstractC2426l abstractC2426lStartapp9 = abstractC2426lAmazon9.advert(abstractC2426lAdvert5).startapp(abstractC2426lAmazon7);
                    AbstractC2426l abstractC2426lLicense9 = abstractC2426lAmazon11.license();
                    AbstractC2426l abstractC2426lAdvert6 = abstractC2426lStartapp9.advert(abstractC2426lLicense9.amazon(abstractC2426lLicense9));
                    AbstractC2426l abstractC2426lAmazon12 = zVip2 ? abstractC2426lAmazon11.amazon(abstractC2426lAmazon11) : abstractC2426lAmazon10.license();
                    c15213l = new C15213l(abstractC11918l, abstractC2426lStartapp8, abstractC2426lAdvert6, new AbstractC2426l[]{abstractC2426lAmazon12.amazon(abstractC2426lAmazon12).startapp(abstractC2426lStartapp6)}, 1);
                }
                return c15213l;
            case 2:
                if (smaato()) {
                    return this;
                }
                int[] iArr10 = ((C15568l) abstractC2426l2).f30406l;
                boolean zAds = AbstractC5998l.ads(iArr10);
                AbstractC11918l abstractC11918l2 = this.yandex;
                if (zAds) {
                    return abstractC11918l2.remoteconfig();
                }
                C15568l c15568l = (C15568l) abstractC2426l;
                C15568l c15568l2 = (C15568l) abstractC2426lArr[0];
                int[] iArr11 = new int[8];
                int[] iArr12 = new int[8];
                int[] iArr13 = new int[8];
                AbstractC14460l.remoteconfig(iArr10, iArr13);
                int[] iArr14 = new int[8];
                AbstractC14460l.remoteconfig(iArr13, iArr14);
                int[] iArr15 = c15568l2.f30406l;
                boolean zStartapp = AbstractC5998l.startapp(iArr15);
                if (zStartapp) {
                    iArr = iArr15;
                } else {
                    AbstractC14460l.remoteconfig(iArr15, iArr12);
                    iArr = iArr12;
                }
                int[] iArr16 = c15568l.f30406l;
                AbstractC14460l.metrica(iArr16, iArr, iArr11);
                AbstractC14460l.loadAd(iArr16, iArr, iArr12);
                AbstractC14460l.subs(iArr12, iArr11, iArr12);
                AbstractC14460l.firebase(iArr12, AbstractC5998l.crashlytics(iArr12, iArr12, iArr12));
                AbstractC14460l.subs(iArr13, iArr16, iArr13);
                AbstractC14460l.firebase(iArr13, AbstractC4952l.appmetrica(iArr13, 8));
                AbstractC14460l.firebase(iArr11, AbstractC4952l.applovin(8, iArr14, iArr11));
                C15568l c15568l3 = new C15568l(iArr14);
                AbstractC14460l.remoteconfig(iArr12, iArr14);
                AbstractC14460l.metrica(iArr14, iArr13, iArr14);
                AbstractC14460l.metrica(iArr14, iArr13, iArr14);
                C15568l c15568l4 = new C15568l(iArr13);
                AbstractC14460l.metrica(iArr13, iArr14, iArr13);
                AbstractC14460l.subs(iArr13, iArr12, iArr13);
                AbstractC14460l.metrica(iArr13, iArr11, iArr13);
                C15568l c15568l5 = new C15568l(iArr12);
                if (AbstractC4952l.premium(8, 0, iArr10, iArr12) != 0 || ((iArr12[7] >>> 1) >= Integer.MAX_VALUE && AbstractC5998l.metrica(iArr12, AbstractC14460l.yandex))) {
                    AbstractC14460l.crashlytics(iArr12);
                }
                if (!zStartapp) {
                    AbstractC14460l.subs(iArr12, iArr15, iArr12);
                }
                return new C15213l(abstractC11918l2, c15568l3, c15568l4, new AbstractC2426l[]{c15568l5}, 2);
            case 3:
                if (smaato()) {
                    return this;
                }
                int[] iArr17 = ((C8649l) abstractC2426l2).f17822l;
                boolean zAdmob = AbstractC9168l.admob(iArr17);
                AbstractC11918l abstractC11918l3 = this.yandex;
                if (zAdmob) {
                    return abstractC11918l3.remoteconfig();
                }
                C8649l c8649l = (C8649l) abstractC2426l;
                C8649l c8649l2 = (C8649l) abstractC2426lArr[0];
                int[] iArr18 = new int[4];
                int[] iArr19 = new int[4];
                int[] iArr20 = new int[4];
                AbstractC15497l.remoteconfig(iArr17, iArr20);
                int[] iArr21 = new int[4];
                AbstractC15497l.remoteconfig(iArr20, iArr21);
                int[] iArr22 = c8649l2.f17822l;
                boolean zMopub = AbstractC9168l.mopub(iArr22);
                if (zMopub) {
                    iArr2 = iArr22;
                } else {
                    AbstractC15497l.remoteconfig(iArr22, iArr19);
                    iArr2 = iArr19;
                }
                int[] iArr23 = c8649l.f17822l;
                AbstractC15497l.metrica(iArr23, iArr2, iArr18);
                AbstractC15497l.amazon(iArr23, iArr2, iArr19);
                AbstractC15497l.admob(iArr19, iArr18, iArr19);
                AbstractC15497l.smaato(iArr19, AbstractC9168l.loadAd(iArr19, iArr19, iArr19));
                AbstractC15497l.admob(iArr20, iArr23, iArr20);
                AbstractC15497l.smaato(iArr20, AbstractC4952l.appmetrica(iArr20, 4));
                AbstractC15497l.smaato(iArr18, AbstractC4952l.applovin(4, iArr21, iArr18));
                C8649l c8649l3 = new C8649l(iArr21);
                AbstractC15497l.remoteconfig(iArr19, iArr21);
                AbstractC15497l.metrica(iArr21, iArr20, iArr21);
                AbstractC15497l.metrica(iArr21, iArr20, iArr21);
                C8649l c8649l4 = new C8649l(iArr20);
                AbstractC15497l.metrica(iArr20, iArr21, iArr20);
                AbstractC15497l.admob(iArr20, iArr19, iArr20);
                AbstractC15497l.metrica(iArr20, iArr18, iArr20);
                C8649l c8649l5 = new C8649l(iArr19);
                if (AbstractC4952l.premium(4, 0, iArr17, iArr19) != 0 || ((iArr19[3] >>> 1) >= 2147483646 && AbstractC9168l.billing(iArr19, AbstractC15497l.yandex))) {
                    AbstractC15497l.purchase(iArr19);
                }
                if (!zMopub) {
                    AbstractC15497l.admob(iArr19, iArr22, iArr19);
                }
                return new C15213l(abstractC11918l3, c8649l3, c8649l4, new AbstractC2426l[]{c8649l5}, 3);
            case 4:
                if (smaato()) {
                    return this;
                }
                int[] iArr24 = ((C5489l) abstractC2426l2).f11744l;
                boolean zFirebase = C16050l.firebase(iArr24);
                AbstractC11918l abstractC11918l4 = this.yandex;
                if (zFirebase) {
                    return abstractC11918l4.remoteconfig();
                }
                C5489l c5489l = (C5489l) abstractC2426l;
                C5489l c5489l2 = (C5489l) abstractC2426lArr[0];
                int[] iArr25 = new int[5];
                AbstractC10392l.admob(iArr24, iArr25);
                int[] iArr26 = new int[5];
                AbstractC10392l.admob(iArr25, iArr26);
                int[] iArr27 = new int[5];
                AbstractC10392l.admob(c5489l.f11744l, iArr27);
                AbstractC10392l.mopub(iArr27, C16050l.loadAd(iArr27, iArr27, iArr27));
                AbstractC10392l.amazon(iArr25, c5489l.f11744l, iArr25);
                AbstractC10392l.mopub(iArr25, AbstractC4952l.appmetrica(iArr25, 5));
                int[] iArr28 = new int[5];
                AbstractC10392l.mopub(iArr28, AbstractC4952l.applovin(5, iArr26, iArr28));
                C5489l c5489l3 = new C5489l(iArr26);
                AbstractC10392l.admob(iArr27, iArr26);
                AbstractC10392l.isPro(iArr26, iArr25, iArr26);
                AbstractC10392l.isPro(iArr26, iArr25, iArr26);
                C5489l c5489l4 = new C5489l(iArr25);
                AbstractC10392l.isPro(iArr25, iArr26, iArr25);
                AbstractC10392l.amazon(iArr25, iArr27, iArr25);
                AbstractC10392l.isPro(iArr25, iArr28, iArr25);
                C5489l c5489l5 = new C5489l(iArr27);
                AbstractC10392l.adcel(iArr24, iArr27);
                if (!C16050l.isPro(c5489l2.f11744l)) {
                    AbstractC10392l.amazon(iArr27, c5489l2.f11744l, iArr27);
                }
                return new C15213l(abstractC11918l4, c5489l3, c5489l4, new AbstractC2426l[]{c5489l5}, 4);
            case 5:
                if (smaato()) {
                    return this;
                }
                int[] iArr29 = ((C0448l) abstractC2426l2).f1630l;
                boolean zFirebase2 = C16050l.firebase(iArr29);
                AbstractC11918l abstractC11918l5 = this.yandex;
                if (zFirebase2) {
                    return abstractC11918l5.remoteconfig();
                }
                C0448l c0448l = (C0448l) abstractC2426l;
                C0448l c0448l2 = (C0448l) abstractC2426lArr[0];
                int[] iArr30 = new int[5];
                int[] iArr31 = new int[5];
                int[] iArr32 = new int[5];
                AbstractC3979l.vip(iArr29, iArr32);
                int[] iArr33 = new int[5];
                AbstractC3979l.vip(iArr32, iArr33);
                int[] iArr34 = c0448l2.f1630l;
                boolean zIsPro = C16050l.isPro(iArr34);
                if (zIsPro) {
                    iArr3 = iArr34;
                } else {
                    AbstractC3979l.vip(iArr34, iArr31);
                    iArr3 = iArr31;
                }
                int[] iArr35 = c0448l.f1630l;
                AbstractC3979l.ads(iArr35, iArr3, iArr30);
                int iYandex = C16050l.yandex(iArr35, iArr3, iArr31);
                int[] iArr36 = AbstractC3979l.yandex;
                if (iYandex != 0 || (iArr31[4] == -1 && C16050l.admob(iArr31, iArr36))) {
                    AbstractC4952l.subs(5, -2147483647, iArr31);
                }
                AbstractC3979l.firebase(iArr31, iArr30, iArr31);
                AbstractC3979l.remoteconfig(iArr31, C16050l.loadAd(iArr31, iArr31, iArr31));
                AbstractC3979l.firebase(iArr32, iArr35, iArr32);
                AbstractC3979l.remoteconfig(iArr32, AbstractC4952l.appmetrica(iArr32, 5));
                AbstractC3979l.remoteconfig(iArr30, AbstractC4952l.applovin(5, iArr33, iArr30));
                C0448l c0448l3 = new C0448l(iArr33);
                AbstractC3979l.vip(iArr31, iArr33);
                AbstractC3979l.ads(iArr33, iArr32, iArr33);
                AbstractC3979l.ads(iArr33, iArr32, iArr33);
                C0448l c0448l4 = new C0448l(iArr32);
                AbstractC3979l.ads(iArr32, iArr33, iArr32);
                AbstractC3979l.firebase(iArr32, iArr31, iArr32);
                AbstractC3979l.ads(iArr32, iArr30, iArr32);
                C0448l c0448l5 = new C0448l(iArr31);
                if (AbstractC4952l.premium(5, 0, iArr29, iArr31) != 0 || (iArr31[4] == -1 && C16050l.admob(iArr31, iArr36))) {
                    AbstractC4952l.subs(5, -2147483647, iArr31);
                }
                if (!zIsPro) {
                    AbstractC3979l.firebase(iArr31, iArr34, iArr31);
                }
                return new C15213l(abstractC11918l5, c0448l3, c0448l4, new AbstractC2426l[]{c0448l5}, 5);
            case 6:
                if (smaato()) {
                    return this;
                }
                int[] iArr37 = ((C5489l) abstractC2426l2).f11744l;
                boolean zFirebase3 = C16050l.firebase(iArr37);
                AbstractC11918l abstractC11918l6 = this.yandex;
                if (zFirebase3) {
                    return abstractC11918l6.remoteconfig();
                }
                C5489l c5489l6 = (C5489l) abstractC2426l;
                C5489l c5489l7 = (C5489l) abstractC2426lArr[0];
                int[] iArr38 = new int[5];
                int[] iArr39 = new int[5];
                int[] iArr40 = new int[5];
                AbstractC10392l.admob(iArr37, iArr40);
                int[] iArr41 = new int[5];
                AbstractC10392l.admob(iArr40, iArr41);
                int[] iArr42 = c5489l7.f11744l;
                boolean zIsPro2 = C16050l.isPro(iArr42);
                if (zIsPro2) {
                    iArr4 = iArr42;
                } else {
                    AbstractC10392l.admob(iArr42, iArr39);
                    iArr4 = iArr39;
                }
                int[] iArr43 = c5489l6.f11744l;
                AbstractC10392l.isPro(iArr43, iArr4, iArr38);
                if (C16050l.yandex(iArr43, iArr4, iArr39) != 0 || (iArr39[4] == -1 && C16050l.admob(iArr39, AbstractC10392l.yandex))) {
                    AbstractC4952l.amazon(5, 21389, iArr39);
                }
                AbstractC10392l.amazon(iArr39, iArr38, iArr39);
                AbstractC10392l.mopub(iArr39, C16050l.loadAd(iArr39, iArr39, iArr39));
                AbstractC10392l.amazon(iArr40, iArr43, iArr40);
                AbstractC10392l.mopub(iArr40, AbstractC4952l.appmetrica(iArr40, 5));
                AbstractC10392l.mopub(iArr38, AbstractC4952l.applovin(5, iArr41, iArr38));
                C5489l c5489l8 = new C5489l(iArr41);
                AbstractC10392l.admob(iArr39, iArr41);
                AbstractC10392l.isPro(iArr41, iArr40, iArr41);
                AbstractC10392l.isPro(iArr41, iArr40, iArr41);
                C5489l c5489l9 = new C5489l(iArr40);
                AbstractC10392l.isPro(iArr40, iArr41, iArr40);
                AbstractC10392l.amazon(iArr40, iArr39, iArr40);
                AbstractC10392l.isPro(iArr40, iArr38, iArr40);
                C5489l c5489l10 = new C5489l(iArr39);
                AbstractC10392l.adcel(iArr37, iArr39);
                if (!zIsPro2) {
                    AbstractC10392l.amazon(iArr39, iArr42, iArr39);
                }
                return new C15213l(abstractC11918l6, c5489l8, c5489l9, new AbstractC2426l[]{c5489l10}, 6);
            case 7:
                if (smaato()) {
                    return this;
                }
                int[] iArr44 = ((C11245l) abstractC2426l2).f22638l;
                boolean zStartapp2 = AbstractC0079l.startapp(iArr44);
                AbstractC11918l abstractC11918l7 = this.yandex;
                if (zStartapp2) {
                    return abstractC11918l7.remoteconfig();
                }
                C11245l c11245l = (C11245l) abstractC2426l;
                C11245l c11245l2 = (C11245l) abstractC2426lArr[0];
                int[] iArr45 = new int[6];
                AbstractC7574l.admob(iArr44, iArr45);
                int[] iArr46 = new int[6];
                AbstractC7574l.admob(iArr45, iArr46);
                int[] iArr47 = new int[6];
                AbstractC7574l.admob(c11245l.f22638l, iArr47);
                AbstractC7574l.billing(iArr47, AbstractC0079l.crashlytics(iArr47, iArr47, iArr47));
                AbstractC7574l.amazon(iArr45, c11245l.f22638l, iArr45);
                AbstractC7574l.billing(iArr45, AbstractC4952l.appmetrica(iArr45, 6));
                int[] iArr48 = new int[6];
                AbstractC7574l.billing(iArr48, AbstractC4952l.applovin(6, iArr46, iArr48));
                C11245l c11245l3 = new C11245l(iArr46);
                AbstractC7574l.admob(iArr47, iArr46);
                AbstractC7574l.isPro(iArr46, iArr45, iArr46);
                AbstractC7574l.isPro(iArr46, iArr45, iArr46);
                C11245l c11245l4 = new C11245l(iArr45);
                AbstractC7574l.isPro(iArr45, iArr46, iArr45);
                AbstractC7574l.amazon(iArr45, iArr47, iArr45);
                AbstractC7574l.isPro(iArr45, iArr48, iArr45);
                C11245l c11245l5 = new C11245l(iArr47);
                if (AbstractC4952l.premium(6, 0, iArr44, iArr47) != 0 || (iArr47[5] == -1 && AbstractC0079l.vip(iArr47, AbstractC7574l.yandex))) {
                    AbstractC4952l.amazon(6, 4553, iArr47);
                }
                if (!AbstractC0079l.metrica(c11245l2.f22638l)) {
                    AbstractC7574l.amazon(iArr47, c11245l2.f22638l, iArr47);
                }
                return new C15213l(abstractC11918l7, c11245l3, c11245l4, new AbstractC2426l[]{c11245l5}, 7);
            case 8:
                if (smaato()) {
                    return this;
                }
                int[] iArr49 = ((C6766l) abstractC2426l2).f14176l;
                boolean zStartapp3 = AbstractC0079l.startapp(iArr49);
                AbstractC11918l abstractC11918l8 = this.yandex;
                if (zStartapp3) {
                    return abstractC11918l8.remoteconfig();
                }
                C6766l c6766l = (C6766l) abstractC2426l;
                C6766l c6766l2 = (C6766l) abstractC2426lArr[0];
                int[] iArr50 = new int[6];
                int[] iArr51 = new int[6];
                int[] iArr52 = new int[6];
                AbstractC14879l.subs(iArr49, iArr52);
                int[] iArr53 = new int[6];
                AbstractC14879l.subs(iArr52, iArr53);
                int[] iArr54 = c6766l2.f14176l;
                boolean zMetrica2 = AbstractC0079l.metrica(iArr54);
                if (zMetrica2) {
                    iArr5 = iArr54;
                } else {
                    AbstractC14879l.subs(iArr54, iArr51);
                    iArr5 = iArr51;
                }
                int[] iArr55 = c6766l.f14176l;
                AbstractC14879l.firebase(iArr55, iArr5, iArr50);
                int iLoadAd = AbstractC0079l.loadAd(iArr55, iArr5, iArr51);
                int[] iArr56 = AbstractC14879l.yandex;
                if (iLoadAd != 0 || (iArr51[5] == -1 && AbstractC0079l.vip(iArr51, iArr56))) {
                    AbstractC14879l.yandex(iArr51);
                }
                AbstractC14879l.crashlytics(iArr51, iArr50, iArr51);
                AbstractC14879l.admob(iArr51, AbstractC0079l.crashlytics(iArr51, iArr51, iArr51));
                AbstractC14879l.crashlytics(iArr52, iArr55, iArr52);
                AbstractC14879l.admob(iArr52, AbstractC4952l.appmetrica(iArr52, 6));
                AbstractC14879l.admob(iArr50, AbstractC4952l.applovin(6, iArr53, iArr50));
                C6766l c6766l3 = new C6766l(iArr53);
                AbstractC14879l.subs(iArr51, iArr53);
                AbstractC14879l.firebase(iArr53, iArr52, iArr53);
                AbstractC14879l.firebase(iArr53, iArr52, iArr53);
                C6766l c6766l4 = new C6766l(iArr52);
                AbstractC14879l.firebase(iArr52, iArr53, iArr52);
                AbstractC14879l.crashlytics(iArr52, iArr51, iArr52);
                AbstractC14879l.firebase(iArr52, iArr50, iArr52);
                C6766l c6766l5 = new C6766l(iArr51);
                if (AbstractC4952l.premium(6, 0, iArr49, iArr51) != 0 || (iArr51[5] == -1 && AbstractC0079l.vip(iArr51, iArr56))) {
                    AbstractC14879l.yandex(iArr51);
                }
                if (!zMetrica2) {
                    AbstractC14879l.crashlytics(iArr51, iArr54, iArr51);
                }
                return new C15213l(abstractC11918l8, c6766l3, c6766l4, new AbstractC2426l[]{c6766l5}, 8);
            case 9:
                if (smaato()) {
                    return this;
                }
                int[] iArr57 = ((C0369l) abstractC2426l2).f1444l;
                boolean zSubscription = AbstractC3292l.subscription(iArr57);
                AbstractC11918l abstractC11918l9 = this.yandex;
                if (zSubscription) {
                    return abstractC11918l9.remoteconfig();
                }
                C0369l c0369l = (C0369l) abstractC2426l;
                C0369l c0369l2 = (C0369l) abstractC2426lArr[0];
                int[] iArr58 = new int[7];
                AbstractC9831l.firebase(iArr57, iArr58);
                int[] iArr59 = new int[7];
                AbstractC9831l.firebase(iArr58, iArr59);
                int[] iArr60 = new int[7];
                AbstractC9831l.firebase(c0369l.f1444l, iArr60);
                AbstractC9831l.admob(iArr60, AbstractC3292l.purchase(iArr60, iArr60, iArr60));
                AbstractC9831l.purchase(iArr58, c0369l.f1444l, iArr58);
                AbstractC9831l.admob(iArr58, AbstractC4952l.appmetrica(iArr58, 7));
                int[] iArr61 = new int[7];
                AbstractC9831l.admob(iArr61, AbstractC4952l.applovin(7, iArr59, iArr61));
                C0369l c0369l3 = new C0369l(iArr59);
                AbstractC9831l.firebase(iArr60, iArr59);
                AbstractC9831l.remoteconfig(iArr59, iArr58, iArr59);
                AbstractC9831l.remoteconfig(iArr59, iArr58, iArr59);
                C0369l c0369l4 = new C0369l(iArr58);
                AbstractC9831l.remoteconfig(iArr58, iArr59, iArr58);
                AbstractC9831l.purchase(iArr58, iArr60, iArr58);
                AbstractC9831l.remoteconfig(iArr58, iArr61, iArr58);
                C0369l c0369l5 = new C0369l(iArr60);
                if (AbstractC4952l.premium(7, 0, iArr57, iArr60) != 0 || (iArr60[6] == -1 && AbstractC3292l.adcel(iArr60, AbstractC9831l.yandex))) {
                    AbstractC4952l.amazon(7, 6803, iArr60);
                }
                if (!AbstractC3292l.ads(c0369l2.f1444l)) {
                    AbstractC9831l.purchase(iArr60, c0369l2.f1444l, iArr60);
                }
                return new C15213l(abstractC11918l9, c0369l3, c0369l4, new AbstractC2426l[]{c0369l5}, 9);
            case 10:
                if (smaato()) {
                    return this;
                }
                int[] iArr62 = ((C5420l) abstractC2426l2).f11613l;
                boolean zSubscription2 = AbstractC3292l.subscription(iArr62);
                AbstractC11918l abstractC11918l10 = this.yandex;
                if (zSubscription2) {
                    return abstractC11918l10.remoteconfig();
                }
                C5420l c5420l = (C5420l) abstractC2426l;
                C5420l c5420l2 = (C5420l) abstractC2426lArr[0];
                int[] iArr63 = new int[7];
                int[] iArr64 = new int[7];
                int[] iArr65 = new int[7];
                AbstractC4654l.vip(iArr62, iArr65);
                int[] iArr66 = new int[7];
                AbstractC4654l.vip(iArr65, iArr66);
                int[] iArr67 = c5420l2.f11613l;
                boolean zAds2 = AbstractC3292l.ads(iArr67);
                if (zAds2) {
                    iArr6 = iArr67;
                } else {
                    AbstractC4654l.vip(iArr67, iArr64);
                    iArr6 = iArr64;
                }
                int[] iArr68 = c5420l.f11613l;
                AbstractC4654l.metrica(iArr68, iArr6, iArr63);
                AbstractC4654l.loadAd(iArr68, iArr6, iArr64);
                AbstractC4654l.isPro(iArr64, iArr63, iArr64);
                AbstractC4654l.remoteconfig(iArr64, AbstractC3292l.purchase(iArr64, iArr64, iArr64));
                AbstractC4654l.isPro(iArr65, iArr68, iArr65);
                AbstractC4654l.remoteconfig(iArr65, AbstractC4952l.appmetrica(iArr65, 7));
                AbstractC4654l.remoteconfig(iArr63, AbstractC4952l.applovin(7, iArr66, iArr63));
                C5420l c5420l3 = new C5420l(iArr66);
                AbstractC4654l.vip(iArr64, iArr66);
                AbstractC4654l.metrica(iArr66, iArr65, iArr66);
                AbstractC4654l.metrica(iArr66, iArr65, iArr66);
                C5420l c5420l4 = new C5420l(iArr65);
                AbstractC4654l.metrica(iArr65, iArr66, iArr65);
                AbstractC4654l.isPro(iArr65, iArr64, iArr65);
                AbstractC4654l.metrica(iArr65, iArr63, iArr65);
                C5420l c5420l5 = new C5420l(iArr64);
                AbstractC4654l.startapp(iArr62, iArr64);
                if (!zAds2) {
                    AbstractC4654l.isPro(iArr64, iArr67, iArr64);
                }
                return new C15213l(abstractC11918l10, c5420l3, c5420l4, new AbstractC2426l[]{c5420l5}, 10);
            case 11:
                if (smaato()) {
                    return this;
                }
                int[] iArr69 = ((C11431l) abstractC2426l2).f23005l;
                boolean zAds3 = AbstractC5998l.ads(iArr69);
                AbstractC11918l abstractC11918l11 = this.yandex;
                if (zAds3) {
                    return abstractC11918l11.remoteconfig();
                }
                C11431l c11431l = (C11431l) abstractC2426l;
                C11431l c11431l2 = (C11431l) abstractC2426lArr[0];
                int[] iArr70 = new int[16];
                int[] iArr71 = new int[8];
                AbstractC5998l.pro(iArr69, iArr70);
                AbstractC12359l.purchase(iArr70, iArr71);
                int[] iArr72 = new int[8];
                AbstractC5998l.pro(iArr71, iArr70);
                AbstractC12359l.purchase(iArr70, iArr72);
                int[] iArr73 = new int[8];
                AbstractC5998l.pro(c11431l.f23005l, iArr70);
                AbstractC12359l.purchase(iArr70, iArr73);
                AbstractC12359l.billing(iArr73, AbstractC5998l.crashlytics(iArr73, iArr73, iArr73));
                AbstractC12359l.amazon(iArr71, c11431l.f23005l, iArr71, iArr70);
                AbstractC12359l.billing(iArr71, AbstractC4952l.appmetrica(iArr71, 8));
                int[] iArr74 = new int[8];
                AbstractC12359l.billing(iArr74, AbstractC4952l.applovin(8, iArr72, iArr74));
                C11431l c11431l3 = new C11431l(iArr72);
                AbstractC5998l.pro(iArr73, iArr70);
                AbstractC12359l.purchase(iArr70, iArr72);
                AbstractC12359l.admob(iArr72, iArr71, iArr72);
                AbstractC12359l.admob(iArr72, iArr71, iArr72);
                C11431l c11431l4 = new C11431l(iArr71);
                AbstractC12359l.admob(iArr71, iArr72, iArr71);
                AbstractC5998l.tapsense(iArr71, iArr73, iArr70);
                AbstractC12359l.purchase(iArr70, iArr71);
                AbstractC12359l.admob(iArr71, iArr74, iArr71);
                C11431l c11431l5 = new C11431l(iArr73);
                if (AbstractC4952l.premium(8, 0, iArr69, iArr73) != 0 || (iArr73[7] == -1 && AbstractC5998l.metrica(iArr73, AbstractC12359l.yandex))) {
                    AbstractC4952l.amazon(8, 977, iArr73);
                }
                if (!AbstractC5998l.startapp(c11431l2.f23005l)) {
                    AbstractC12359l.amazon(iArr73, c11431l2.f23005l, iArr73, iArr70);
                }
                return new C15213l(abstractC11918l11, c11431l3, c11431l4, new AbstractC2426l[]{c11431l5}, 11);
            case 12:
                if (smaato()) {
                    return this;
                }
                int[] iArr75 = ((C10438l) abstractC2426l2).f21255l;
                boolean zAds4 = AbstractC5998l.ads(iArr75);
                AbstractC11918l abstractC11918l12 = this.yandex;
                if (zAds4) {
                    return abstractC11918l12.remoteconfig();
                }
                C10438l c10438l = (C10438l) abstractC2426l;
                C10438l c10438l2 = (C10438l) abstractC2426lArr[0];
                int[] iArr76 = new int[16];
                int[] iArr77 = new int[8];
                int[] iArr78 = new int[8];
                int[] iArr79 = new int[8];
                AbstractC5998l.pro(iArr75, iArr76);
                AbstractC3461l.subs(iArr76, iArr79);
                int[] iArr80 = new int[8];
                AbstractC5998l.pro(iArr79, iArr76);
                AbstractC3461l.subs(iArr76, iArr80);
                int[] iArr81 = c10438l2.f21255l;
                boolean zStartapp4 = AbstractC5998l.startapp(iArr81);
                if (zStartapp4) {
                    iArr7 = iArr81;
                } else {
                    AbstractC5998l.pro(iArr81, iArr76);
                    AbstractC3461l.subs(iArr76, iArr78);
                    iArr7 = iArr78;
                }
                int[] iArr82 = c10438l.f21255l;
                AbstractC3461l.smaato(iArr82, iArr7, iArr77);
                int iLoadAd2 = AbstractC5998l.loadAd(iArr82, iArr7, iArr78);
                int[] iArr83 = AbstractC3461l.yandex;
                if (iLoadAd2 != 0 || (iArr78[7] == -1 && AbstractC5998l.metrica(iArr78, iArr83))) {
                    AbstractC3461l.yandex(iArr78);
                }
                AbstractC5998l.tapsense(iArr78, iArr77, iArr76);
                AbstractC3461l.subs(iArr76, iArr78);
                AbstractC3461l.isPro(iArr78, AbstractC5998l.crashlytics(iArr78, iArr78, iArr78));
                AbstractC5998l.tapsense(iArr79, iArr82, iArr76);
                AbstractC3461l.subs(iArr76, iArr79);
                AbstractC3461l.isPro(iArr79, AbstractC4952l.appmetrica(iArr79, 8));
                AbstractC3461l.isPro(iArr77, AbstractC4952l.applovin(8, iArr80, iArr77));
                C10438l c10438l3 = new C10438l(iArr80);
                AbstractC5998l.pro(iArr78, iArr76);
                AbstractC3461l.subs(iArr76, iArr80);
                AbstractC3461l.smaato(iArr80, iArr79, iArr80);
                AbstractC3461l.smaato(iArr80, iArr79, iArr80);
                C10438l c10438l4 = new C10438l(iArr79);
                AbstractC3461l.smaato(iArr79, iArr80, iArr79);
                AbstractC5998l.tapsense(iArr79, iArr78, iArr76);
                AbstractC3461l.subs(iArr76, iArr79);
                AbstractC3461l.smaato(iArr79, iArr77, iArr79);
                C10438l c10438l5 = new C10438l(iArr78);
                if (AbstractC4952l.premium(8, 0, iArr75, iArr78) != 0 || (iArr78[7] == -1 && AbstractC5998l.metrica(iArr78, iArr83))) {
                    AbstractC3461l.yandex(iArr78);
                }
                if (!zStartapp4) {
                    AbstractC3461l.mopub(iArr78, iArr81, iArr78, iArr76);
                }
                return new C15213l(abstractC11918l12, c10438l3, c10438l4, new AbstractC2426l[]{c10438l5}, 12);
            case 13:
                if (smaato()) {
                    return this;
                }
                C3849l c3849l = (C3849l) abstractC2426l2;
                boolean zMetrica3 = c3849l.metrica();
                int[] iArr84 = c3849l.f7955l;
                AbstractC11918l abstractC11918l13 = this.yandex;
                if (zMetrica3) {
                    return abstractC11918l13.remoteconfig();
                }
                C3849l c3849l2 = (C3849l) abstractC2426l;
                C3849l c3849l3 = (C3849l) abstractC2426lArr[0];
                int[] iArr85 = new int[24];
                int[] iArr86 = new int[12];
                int[] iArr87 = new int[12];
                int[] iArr88 = new int[12];
                AbstractC15852l.amazon(iArr84, iArr85);
                AbstractC16817l.smaato(iArr85, iArr88);
                int[] iArr89 = new int[12];
                AbstractC15852l.amazon(iArr88, iArr85);
                AbstractC16817l.smaato(iArr85, iArr89);
                boolean zVip3 = c3849l3.vip();
                int[] iArr90 = c3849l3.f7955l;
                if (zVip3) {
                    iArr8 = iArr90;
                } else {
                    AbstractC15852l.amazon(iArr90, iArr85);
                    AbstractC16817l.smaato(iArr85, iArr87);
                    iArr8 = iArr87;
                }
                int[] iArr91 = c3849l2.f7955l;
                AbstractC16817l.adcel(iArr91, iArr8, iArr86);
                int iCrashlytics = AbstractC4952l.crashlytics(12, iArr91, iArr8, iArr87);
                int[] iArr92 = AbstractC16817l.f32844l;
                if (iCrashlytics != 0 || (iArr87[11] == -1 && AbstractC4952l.adcel(12, iArr87, iArr92))) {
                    AbstractC16817l.billing(iArr87);
                }
                AbstractC15852l.crashlytics(iArr87, iArr86, iArr85);
                AbstractC16817l.smaato(iArr85, iArr87);
                AbstractC16817l.remoteconfig(iArr87, AbstractC4952l.purchase(12, iArr87, iArr87, iArr87));
                AbstractC16817l.isPro(iArr88, iArr91, iArr88, iArr85);
                AbstractC16817l.remoteconfig(iArr88, AbstractC4952l.appmetrica(iArr88, 12));
                AbstractC16817l.remoteconfig(iArr86, AbstractC4952l.applovin(12, iArr89, iArr86));
                C3849l c3849l4 = new C3849l(iArr89);
                AbstractC15852l.amazon(iArr87, iArr85);
                AbstractC16817l.smaato(iArr85, iArr89);
                AbstractC16817l.adcel(iArr89, iArr88, iArr89);
                AbstractC16817l.adcel(iArr89, iArr88, iArr89);
                C3849l c3849l5 = new C3849l(iArr88);
                AbstractC16817l.adcel(iArr88, iArr89, iArr88);
                AbstractC15852l.crashlytics(iArr88, iArr87, iArr85);
                AbstractC16817l.smaato(iArr85, iArr88);
                AbstractC16817l.adcel(iArr88, iArr86, iArr88);
                C3849l c3849l6 = new C3849l(iArr87);
                if (AbstractC4952l.premium(12, 0, iArr84, iArr87) != 0 || (iArr87[11] == -1 && AbstractC4952l.adcel(12, iArr87, iArr92))) {
                    AbstractC16817l.billing(iArr87);
                }
                if (!zVip3) {
                    AbstractC16817l.isPro(iArr87, iArr90, iArr87, iArr85);
                }
                return new C15213l(abstractC11918l13, c3849l4, c3849l5, new AbstractC2426l[]{c3849l6}, 13);
            default:
                if (smaato()) {
                    return this;
                }
                C8489l c8489l = (C8489l) abstractC2426l2;
                boolean zMetrica4 = c8489l.metrica();
                int[] iArr93 = c8489l.f17545l;
                AbstractC11918l abstractC11918l14 = this.yandex;
                if (zMetrica4) {
                    return abstractC11918l14.remoteconfig();
                }
                C8489l c8489l2 = (C8489l) abstractC2426l;
                C8489l c8489l3 = (C8489l) abstractC2426lArr[0];
                int[] iArr94 = new int[33];
                int[] iArr95 = new int[17];
                int[] iArr96 = new int[17];
                int[] iArr97 = new int[17];
                AbstractC11994l.mopub(iArr93, iArr94);
                AbstractC11994l.isPro(iArr94, iArr97);
                int[] iArr98 = new int[17];
                AbstractC11994l.mopub(iArr97, iArr94);
                AbstractC11994l.isPro(iArr94, iArr98);
                boolean zVip4 = c8489l3.vip();
                int[] iArr99 = c8489l3.f17545l;
                if (zVip4) {
                    iArr9 = iArr99;
                } else {
                    AbstractC11994l.mopub(iArr99, iArr94);
                    AbstractC11994l.isPro(iArr94, iArr96);
                    iArr9 = iArr96;
                }
                int[] iArr100 = c8489l2.f17545l;
                AbstractC11994l.remoteconfig(iArr100, iArr9, iArr95);
                AbstractC11994l.yandex(iArr100, iArr9, iArr96);
                AbstractC11994l.billing(iArr96, iArr95, iArr94);
                AbstractC11994l.isPro(iArr94, iArr96);
                AbstractC4952l.purchase(17, iArr96, iArr96, iArr96);
                AbstractC11994l.firebase(iArr96);
                AbstractC11994l.billing(iArr97, iArr100, iArr94);
                AbstractC11994l.isPro(iArr94, iArr97);
                AbstractC4952l.appmetrica(iArr97, 17);
                AbstractC11994l.firebase(iArr97);
                AbstractC4952l.applovin(17, iArr98, iArr95);
                AbstractC11994l.firebase(iArr95);
                C8489l c8489l4 = new C8489l(iArr98);
                AbstractC11994l.mopub(iArr96, iArr94);
                AbstractC11994l.isPro(iArr94, iArr98);
                AbstractC11994l.remoteconfig(iArr98, iArr97, iArr98);
                AbstractC11994l.remoteconfig(iArr98, iArr97, iArr98);
                C8489l c8489l5 = new C8489l(iArr97);
                AbstractC11994l.remoteconfig(iArr97, iArr98, iArr97);
                AbstractC11994l.billing(iArr97, iArr96, iArr94);
                AbstractC11994l.isPro(iArr94, iArr97);
                AbstractC11994l.remoteconfig(iArr97, iArr95, iArr97);
                C8489l c8489l6 = new C8489l(iArr96);
                int i4 = iArr93[16];
                iArr96[16] = (AbstractC4952l.premium(16, i4 << 23, iArr93, iArr96) | (i4 << 1)) & 511;
                if (!zVip4) {
                    AbstractC11994l.admob(iArr96, iArr99, iArr96, iArr94);
                }
                return new C15213l(abstractC11918l14, c8489l4, c8489l5, new AbstractC2426l[]{c8489l6}, 14);
        }
    }

    @Override // defpackage.AbstractC8859l
    public final boolean billing() {
        return purchase().isVip();
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l crashlytics() {
        switch (this.mopub) {
            case 0:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 0);
            case 1:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 1);
            case 2:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 2);
            case 3:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 3);
            case 4:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 4);
            case 5:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 5);
            case 6:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 6);
            case 7:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 7);
            case 8:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 8);
            case 9:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 9);
            case 10:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 10);
            case 11:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 11);
            case 12:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 12);
            case 13:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 13);
            default:
                loadAd();
                return new C15213l(null, this.loadAd, purchase(), 14);
        }
    }

    public C3515l inmobi(C3515l c3515l, int[] iArr) {
        C3515l c3515l2 = (C3515l) this.yandex.loadAd;
        if (AbstractC5998l.startapp(c3515l.f7408l)) {
            return c3515l2;
        }
        C3515l c3515l3 = new C3515l(3);
        int[] iArr2 = new int[8];
        c3515l3.f7408l = iArr2;
        if (iArr == null) {
            AbstractC0714l.subs(c3515l.f7408l, iArr2);
            iArr = iArr2;
        }
        AbstractC0714l.subs(iArr, iArr2);
        AbstractC0714l.amazon(iArr2, c3515l2.f7408l, iArr2);
        return c3515l3;
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l isVip(AbstractC8859l abstractC8859l) {
        int i = this.mopub;
        AbstractC2426l abstractC2426l = this.crashlytics;
        switch (i) {
            case 0:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : m3947synchronized(false).yandex(abstractC8859l);
            case 1:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (!smaato()) {
                    if (abstractC8859l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l.metrica()) {
                        AbstractC11918l abstractC11918l = this.yandex;
                        int i2 = abstractC11918l.billing;
                        if (i2 != 0) {
                            return i2 != 4 ? advert().yandex(abstractC8859l) : m3946strictfp(false).yandex(abstractC8859l);
                        }
                        AbstractC2426l abstractC2426l2 = abstractC8859l.loadAd;
                        AbstractC2426l abstractC2426l3 = abstractC8859l.crashlytics;
                        AbstractC2426l abstractC2426l4 = this.loadAd;
                        AbstractC2426l abstractC2426lAdvert = abstractC2426l2.advert(abstractC2426l4);
                        AbstractC2426l abstractC2426lAdvert2 = abstractC2426l3.advert(abstractC2426l);
                        if (abstractC2426lAdvert.metrica()) {
                            return abstractC2426lAdvert2.metrica() ? pro() : this;
                        }
                        AbstractC2426l abstractC2426lLicense = abstractC2426lAdvert.license();
                        AbstractC2426l abstractC2426lAdvert3 = abstractC2426lLicense.startapp(abstractC2426l4.amazon(abstractC2426l4).amazon(abstractC2426l2)).advert(abstractC2426lAdvert2.license());
                        if (abstractC2426lAdvert3.metrica()) {
                            return abstractC11918l.remoteconfig();
                        }
                        AbstractC2426l abstractC2426lRemoteconfig = abstractC2426lAdvert3.startapp(abstractC2426lAdvert).remoteconfig();
                        AbstractC2426l abstractC2426lStartapp = abstractC2426lAdvert3.startapp(abstractC2426lRemoteconfig).startapp(abstractC2426lAdvert2);
                        AbstractC2426l abstractC2426lAdvert4 = abstractC2426l.amazon(abstractC2426l).startapp(abstractC2426lLicense).startapp(abstractC2426lAdvert).startapp(abstractC2426lRemoteconfig).advert(abstractC2426lStartapp);
                        AbstractC2426l abstractC2426lAmazon = abstractC2426lAdvert4.advert(abstractC2426lStartapp).startapp(abstractC2426lStartapp.amazon(abstractC2426lAdvert4)).amazon(abstractC2426l2);
                        return new C15213l(abstractC11918l, abstractC2426lAmazon, abstractC2426l4.advert(abstractC2426lAmazon).startapp(abstractC2426lAdvert4).advert(abstractC2426l), 1);
                    }
                }
                return abstractC8859l;
            case 2:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 3:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 4:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 5:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 6:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 7:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 8:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 9:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 10:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 11:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 12:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            case 13:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
            default:
                if (this == abstractC8859l) {
                    return pro();
                }
                if (smaato()) {
                    return abstractC8859l;
                }
                if (abstractC8859l.smaato()) {
                    return advert();
                }
                return abstractC2426l.metrica() ? abstractC8859l : advert().yandex(abstractC8859l);
        }
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l license(AbstractC8859l abstractC8859l) {
        return abstractC8859l.smaato() ? this : yandex(abstractC8859l.metrica());
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l metrica() {
        int i = this.mopub;
        AbstractC2426l abstractC2426l = this.crashlytics;
        switch (i) {
            case 0:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 0);
            case 1:
                if (smaato()) {
                    return this;
                }
                AbstractC11918l abstractC11918l = this.yandex;
                int i2 = abstractC11918l.billing;
                AbstractC2426l abstractC2426l2 = this.loadAd;
                return i2 != 0 ? new C15213l(abstractC11918l, abstractC2426l2, abstractC2426l.subscription(), this.amazon, 1) : new C15213l(abstractC11918l, abstractC2426l2, abstractC2426l.subscription(), 1);
            case 2:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 2);
            case 3:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 3);
            case 4:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 4);
            case 5:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 5);
            case 6:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 6);
            case 7:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 7);
            case 8:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 8);
            case 9:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 9);
            case 10:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 10);
            case 11:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 11);
            case 12:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 12);
            case 13:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 13);
            default:
                if (smaato()) {
                    return this;
                }
                return new C15213l(this.yandex, this.loadAd, abstractC2426l.subscription(), this.amazon, 14);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public AbstractC2426l m3945package() {
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l = abstractC2426lArr[1];
        if (abstractC2426l != null) {
            return abstractC2426l;
        }
        AbstractC2426l abstractC2426lM3948throws = m3948throws(abstractC2426lArr[0], null);
        abstractC2426lArr[1] = abstractC2426lM3948throws;
        return abstractC2426lM3948throws;
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l pro() {
        int i = this.mopub;
        AbstractC2426l abstractC2426l = this.crashlytics;
        switch (i) {
            case 0:
                return (smaato() || abstractC2426l.metrica()) ? this : m3947synchronized(false).yandex(this);
            case 1:
                if (smaato() || abstractC2426l.metrica()) {
                    return this;
                }
                AbstractC11918l abstractC11918l = this.yandex;
                int i2 = abstractC11918l.billing;
                if (i2 != 0) {
                    return i2 != 4 ? advert().yandex(this) : m3946strictfp(false).yandex(this);
                }
                AbstractC2426l abstractC2426lAmazon = abstractC2426l.amazon(abstractC2426l);
                AbstractC2426l abstractC2426lLicense = abstractC2426lAmazon.license();
                AbstractC2426l abstractC2426l2 = this.loadAd;
                AbstractC2426l abstractC2426lLicense2 = abstractC2426l2.license();
                AbstractC2426l abstractC2426lAmazon2 = abstractC2426lLicense2.amazon(abstractC2426lLicense2).amazon(abstractC2426lLicense2).amazon(abstractC11918l.loadAd);
                AbstractC2426l abstractC2426lAdvert = abstractC2426l2.amazon(abstractC2426l2).amazon(abstractC2426l2).startapp(abstractC2426lLicense).advert(abstractC2426lAmazon2.license());
                if (abstractC2426lAdvert.metrica()) {
                    return abstractC11918l.remoteconfig();
                }
                AbstractC2426l abstractC2426lRemoteconfig = abstractC2426lAdvert.startapp(abstractC2426lAmazon).remoteconfig();
                AbstractC2426l abstractC2426lStartapp = abstractC2426lAdvert.startapp(abstractC2426lRemoteconfig).startapp(abstractC2426lAmazon2);
                AbstractC2426l abstractC2426lAdvert2 = abstractC2426lLicense.license().startapp(abstractC2426lRemoteconfig).advert(abstractC2426lStartapp);
                AbstractC2426l abstractC2426lAmazon3 = abstractC2426lAdvert2.advert(abstractC2426lStartapp).startapp(abstractC2426lStartapp.amazon(abstractC2426lAdvert2)).amazon(abstractC2426l2);
                return new C15213l(abstractC11918l, abstractC2426lAmazon3, abstractC2426l2.advert(abstractC2426lAmazon3).startapp(abstractC2426lAdvert2).advert(abstractC2426l), 1);
            case 2:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 3:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 4:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 5:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 6:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 7:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 8:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 9:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 10:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 11:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 12:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            case 13:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
            default:
                return (smaato() || abstractC2426l.metrica()) ? this : advert().yandex(this);
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public C15213l m3946strictfp(boolean z) {
        AbstractC2426l abstractC2426lAmazon;
        AbstractC2426l abstractC2426l = this.amazon[0];
        AbstractC2426l abstractC2426lM3945package = m3945package();
        AbstractC2426l abstractC2426l2 = this.loadAd;
        AbstractC2426l abstractC2426lLicense = abstractC2426l2.license();
        AbstractC2426l abstractC2426lAmazon2 = abstractC2426lLicense.amazon(abstractC2426lLicense).amazon(abstractC2426lLicense).amazon(abstractC2426lM3945package);
        AbstractC2426l abstractC2426l3 = this.crashlytics;
        AbstractC2426l abstractC2426lAmazon3 = abstractC2426l3.amazon(abstractC2426l3);
        AbstractC2426l abstractC2426lStartapp = abstractC2426lAmazon3.startapp(abstractC2426l3);
        AbstractC2426l abstractC2426lStartapp2 = abstractC2426l2.startapp(abstractC2426lStartapp);
        AbstractC2426l abstractC2426lAmazon4 = abstractC2426lStartapp2.amazon(abstractC2426lStartapp2);
        AbstractC2426l abstractC2426lAdvert = abstractC2426lAmazon2.license().advert(abstractC2426lAmazon4.amazon(abstractC2426lAmazon4));
        AbstractC2426l abstractC2426lLicense2 = abstractC2426lStartapp.license();
        AbstractC2426l abstractC2426lAmazon5 = abstractC2426lLicense2.amazon(abstractC2426lLicense2);
        AbstractC2426l abstractC2426lAdvert2 = abstractC2426lAmazon2.startapp(abstractC2426lAmazon4.advert(abstractC2426lAdvert)).advert(abstractC2426lAmazon5);
        if (z) {
            AbstractC2426l abstractC2426lStartapp3 = abstractC2426lAmazon5.startapp(abstractC2426lM3945package);
            abstractC2426lAmazon = abstractC2426lStartapp3.amazon(abstractC2426lStartapp3);
        } else {
            abstractC2426lAmazon = null;
        }
        if (!abstractC2426l.vip()) {
            abstractC2426lAmazon3 = abstractC2426lAmazon3.startapp(abstractC2426l);
        }
        return new C15213l(this.yandex, abstractC2426lAdvert, abstractC2426lAdvert2, new AbstractC2426l[]{abstractC2426lAmazon3, abstractC2426lAmazon}, 1);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C15213l m3947synchronized(boolean z) {
        C3515l c3515l;
        C3515l c3515l2 = (C3515l) this.loadAd;
        C3515l c3515l3 = (C3515l) this.crashlytics;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l = abstractC2426lArr[0];
        C3515l c3515l4 = (C3515l) abstractC2426l;
        C3515l c3515lInmobi = (C3515l) abstractC2426lArr[1];
        if (c3515lInmobi == null) {
            c3515lInmobi = inmobi((C3515l) abstractC2426l, null);
            abstractC2426lArr[1] = c3515lInmobi;
        }
        int[] iArr = {(int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j};
        AbstractC0714l.subs(c3515l2.f7408l, iArr);
        int iCrashlytics = AbstractC5998l.crashlytics(iArr, iArr, iArr);
        int[] iArr2 = c3515lInmobi.f7408l;
        long j = (((long) iArr2[0]) & 4294967295L) + (((long) iArr[0]) & 4294967295L);
        long j2 = (((long) iArr2[1]) & 4294967295L) + (((long) iArr[1]) & 4294967295L) + (j >>> 32);
        long j3 = (((long) iArr2[2]) & 4294967295L) + (((long) iArr[2]) & 4294967295L) + (j2 >>> 32);
        long j4 = (((long) iArr2[3]) & 4294967295L) + (((long) iArr[3]) & 4294967295L) + (j3 >>> 32);
        long j5 = (((long) iArr2[4]) & 4294967295L) + (((long) iArr[4]) & 4294967295L) + (j4 >>> 32);
        long j6 = (((long) iArr2[5]) & 4294967295L) + (((long) iArr[5]) & 4294967295L) + (j5 >>> 32);
        long j7 = (((long) iArr2[6]) & 4294967295L) + (((long) iArr[6]) & 4294967295L) + (j6 >>> 32);
        long j8 = (((long) iArr2[7]) & 4294967295L) + (((long) iArr[7]) & 4294967295L) + (j7 >>> 32);
        AbstractC0714l.mopub(iArr, iCrashlytics + ((int) (j8 >>> 32)));
        int[] iArr3 = new int[8];
        AbstractC0714l.remoteconfig(c3515l3.f7408l, iArr3);
        int[] iArr4 = new int[8];
        AbstractC0714l.amazon(iArr3, c3515l3.f7408l, iArr4);
        int[] iArr5 = new int[8];
        AbstractC0714l.amazon(iArr4, c3515l2.f7408l, iArr5);
        AbstractC0714l.remoteconfig(iArr5, iArr5);
        int[] iArr6 = new int[8];
        AbstractC0714l.subs(iArr4, iArr6);
        AbstractC0714l.remoteconfig(iArr6, iArr6);
        C3515l c3515l5 = new C3515l(iArr4);
        AbstractC0714l.subs(iArr, iArr4);
        AbstractC0714l.smaato(iArr4, iArr5, iArr4);
        AbstractC0714l.smaato(iArr4, iArr5, iArr4);
        C3515l c3515l6 = new C3515l(iArr5);
        AbstractC0714l.smaato(iArr5, iArr4, iArr5);
        AbstractC0714l.amazon(iArr5, iArr, iArr5);
        AbstractC0714l.smaato(iArr5, iArr6, iArr5);
        C3515l c3515l7 = new C3515l(iArr3);
        if (!AbstractC5998l.startapp(c3515l4.f7408l)) {
            AbstractC0714l.amazon(iArr3, c3515l4.f7408l, iArr3);
        }
        if (z) {
            c3515l = new C3515l(iArr6);
            AbstractC0714l.amazon(iArr6, c3515lInmobi.f7408l, iArr6);
            AbstractC0714l.remoteconfig(iArr6, iArr6);
        } else {
            c3515l = null;
        }
        return new C15213l(this.yandex, c3515l5, c3515l6, new AbstractC2426l[]{c3515l7, c3515l}, 0);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public AbstractC2426l m3948throws(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        AbstractC2426l abstractC2426l3 = this.yandex.loadAd;
        if (abstractC2426l3.metrica() || abstractC2426l.vip()) {
            return abstractC2426l3;
        }
        if (abstractC2426l2 == null) {
            abstractC2426l2 = abstractC2426l.license();
        }
        AbstractC2426l abstractC2426lLicense = abstractC2426l2.license();
        AbstractC2426l abstractC2426lSubscription = abstractC2426l3.subscription();
        return abstractC2426lSubscription.billing() < abstractC2426l3.billing() ? abstractC2426lLicense.startapp(abstractC2426lSubscription).subscription() : abstractC2426lLicense.startapp(abstractC2426l3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.AbstractC8859l
    public final defpackage.AbstractC8859l yandex(defpackage.AbstractC8859l r39) {
        /*
            Method dump skipped, instruction units count: 3614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15213l.yandex(lٌ٘۠):lٌ٘۠");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15213l(AbstractC11918l abstractC11918l, AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr, int i) {
        super(abstractC11918l, abstractC2426l, abstractC2426l2, abstractC2426lArr);
        this.mopub = i;
    }
}
