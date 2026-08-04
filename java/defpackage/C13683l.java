package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;

/* JADX INFO: renamed from: lْۜۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13683l extends AbstractC8859l {
    public final /* synthetic */ int mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13683l(AbstractC11918l abstractC11918l, AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, int i) {
        super(abstractC11918l, abstractC2426l, abstractC2426l2);
        this.mopub = i;
    }

    private final AbstractC8859l applovin(AbstractC8859l abstractC8859l) {
        AbstractC2426l abstractC2426lStartapp;
        AbstractC2426l abstractC2426lStartapp2;
        AbstractC2426l abstractC2426lStartapp3;
        AbstractC2426l abstractC2426lStartapp4;
        AbstractC2426l abstractC2426l;
        AbstractC2426l abstractC2426l2;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        AbstractC2426l abstractC2426l3 = abstractC8859l.loadAd;
        AbstractC2426l abstractC2426lStartapp5 = this.loadAd;
        boolean zMetrica = abstractC2426lStartapp5.metrica();
        AbstractC11918l abstractC11918l = this.yandex;
        if (zMetrica) {
            return abstractC2426l3.metrica() ? abstractC11918l.remoteconfig() : abstractC8859l.yandex(this);
        }
        AbstractC2426l abstractC2426l4 = this.amazon[0];
        AbstractC2426l abstractC2426l5 = abstractC8859l.crashlytics;
        AbstractC2426l abstractC2426lIsPro = abstractC8859l.isPro();
        boolean zVip = abstractC2426l4.vip();
        if (zVip) {
            abstractC2426lStartapp = abstractC2426l3;
            abstractC2426lStartapp2 = abstractC2426l5;
        } else {
            abstractC2426lStartapp = abstractC2426l3.startapp(abstractC2426l4);
            abstractC2426lStartapp2 = abstractC2426l5.startapp(abstractC2426l4);
        }
        boolean zVip2 = abstractC2426lIsPro.vip();
        AbstractC2426l abstractC2426l6 = this.crashlytics;
        if (zVip2) {
            abstractC2426lStartapp3 = abstractC2426l6;
        } else {
            abstractC2426lStartapp5 = abstractC2426lStartapp5.startapp(abstractC2426lIsPro);
            abstractC2426lStartapp3 = abstractC2426l6.startapp(abstractC2426lIsPro);
        }
        AbstractC2426l abstractC2426lAmazon = abstractC2426lStartapp3.amazon(abstractC2426lStartapp2);
        AbstractC2426l abstractC2426lAmazon2 = abstractC2426lStartapp5.amazon(abstractC2426lStartapp);
        if (abstractC2426lAmazon2.metrica()) {
            return abstractC2426lAmazon.metrica() ? advert() : abstractC11918l.remoteconfig();
        }
        int i = 15;
        if (abstractC2426l3.metrica()) {
            AbstractC8859l abstractC8859lStartapp = startapp();
            AbstractC2426l abstractC2426l7 = abstractC8859lStartapp.loadAd;
            AbstractC2426l abstractC2426lSubs = abstractC8859lStartapp.subs();
            AbstractC2426l abstractC2426lAdmob = abstractC2426lSubs.amazon(abstractC2426l5).admob(abstractC2426l7);
            AbstractC2426l abstractC2426lSignatures = AbstractC9361l.signatures(abstractC2426lAdmob, abstractC2426lAdmob, abstractC2426l7);
            if (abstractC2426lSignatures.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lSignatures, abstractC11918l.crashlytics, i);
            }
            AbstractC2426l abstractC2426lAmazon3 = abstractC2426lAdmob.startapp(abstractC2426l7.amazon(abstractC2426lSignatures)).amazon(abstractC2426lSignatures).amazon(abstractC2426lSubs).admob(abstractC2426lSignatures).amazon(abstractC2426lSignatures);
            abstractC2426lStartapp4 = abstractC11918l.isPro(InterfaceC11695l.startapp);
            abstractC2426l = abstractC2426lAmazon3;
            abstractC2426l2 = abstractC2426lSignatures;
        } else {
            AbstractC2426l abstractC2426lLicense = abstractC2426lAmazon2.license();
            AbstractC2426l abstractC2426lStartapp6 = abstractC2426lAmazon.startapp(abstractC2426lStartapp5);
            AbstractC2426l abstractC2426lStartapp7 = abstractC2426lAmazon.startapp(abstractC2426lStartapp);
            AbstractC2426l abstractC2426lStartapp8 = abstractC2426lStartapp6.startapp(abstractC2426lStartapp7);
            if (abstractC2426lStartapp8.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lStartapp8, abstractC11918l.crashlytics, i);
            }
            AbstractC2426l abstractC2426lStartapp9 = abstractC2426lAmazon.startapp(abstractC2426lLicense);
            abstractC2426lStartapp4 = !zVip2 ? abstractC2426lStartapp9.startapp(abstractC2426lIsPro) : abstractC2426lStartapp9;
            AbstractC2426l abstractC2426lPro = abstractC2426lStartapp7.amazon(abstractC2426lLicense).pro(abstractC2426lStartapp4, abstractC2426l6.amazon(abstractC2426l4));
            if (!zVip) {
                abstractC2426lStartapp4 = abstractC2426lStartapp4.startapp(abstractC2426l4);
            }
            abstractC2426l = abstractC2426lPro;
            abstractC2426l2 = abstractC2426lStartapp8;
        }
        return new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l, new AbstractC2426l[]{abstractC2426lStartapp4}, 15);
    }

    private final AbstractC8859l appmetrica(AbstractC8859l abstractC8859l) {
        AbstractC2426l abstractC2426lStartapp;
        AbstractC2426l abstractC2426lStartapp2;
        AbstractC2426l abstractC2426lStartapp3;
        AbstractC2426l abstractC2426lStartapp4;
        AbstractC2426l abstractC2426l;
        AbstractC2426l abstractC2426l2;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        AbstractC2426l abstractC2426l3 = abstractC8859l.loadAd;
        AbstractC2426l abstractC2426lStartapp5 = this.loadAd;
        boolean zMetrica = abstractC2426lStartapp5.metrica();
        AbstractC11918l abstractC11918l = this.yandex;
        if (zMetrica) {
            return abstractC2426l3.metrica() ? abstractC11918l.remoteconfig() : abstractC8859l.yandex(this);
        }
        AbstractC2426l abstractC2426l4 = this.amazon[0];
        AbstractC2426l abstractC2426l5 = abstractC8859l.crashlytics;
        AbstractC2426l abstractC2426lIsPro = abstractC8859l.isPro();
        boolean zVip = abstractC2426l4.vip();
        if (zVip) {
            abstractC2426lStartapp = abstractC2426l3;
            abstractC2426lStartapp2 = abstractC2426l5;
        } else {
            abstractC2426lStartapp = abstractC2426l3.startapp(abstractC2426l4);
            abstractC2426lStartapp2 = abstractC2426l5.startapp(abstractC2426l4);
        }
        boolean zVip2 = abstractC2426lIsPro.vip();
        AbstractC2426l abstractC2426l6 = this.crashlytics;
        if (zVip2) {
            abstractC2426lStartapp3 = abstractC2426l6;
        } else {
            abstractC2426lStartapp5 = abstractC2426lStartapp5.startapp(abstractC2426lIsPro);
            abstractC2426lStartapp3 = abstractC2426l6.startapp(abstractC2426lIsPro);
        }
        AbstractC2426l abstractC2426lAmazon = abstractC2426lStartapp3.amazon(abstractC2426lStartapp2);
        AbstractC2426l abstractC2426lAmazon2 = abstractC2426lStartapp5.amazon(abstractC2426lStartapp);
        if (abstractC2426lAmazon2.metrica()) {
            return abstractC2426lAmazon.metrica() ? advert() : abstractC11918l.remoteconfig();
        }
        int i = 16;
        if (abstractC2426l3.metrica()) {
            AbstractC8859l abstractC8859lStartapp = startapp();
            AbstractC2426l abstractC2426l7 = abstractC8859lStartapp.loadAd;
            AbstractC2426l abstractC2426lSubs = abstractC8859lStartapp.subs();
            AbstractC2426l abstractC2426lAdmob = abstractC2426lSubs.amazon(abstractC2426l5).admob(abstractC2426l7);
            AbstractC2426l abstractC2426lPurchase = abstractC2426lAdmob.license().amazon(abstractC2426lAdmob).amazon(abstractC2426l7).purchase();
            if (abstractC2426lPurchase.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lPurchase, abstractC11918l.crashlytics.Signature(), i);
            }
            AbstractC2426l abstractC2426lAmazon3 = abstractC2426lAdmob.startapp(abstractC2426l7.amazon(abstractC2426lPurchase)).amazon(abstractC2426lPurchase).amazon(abstractC2426lSubs).admob(abstractC2426lPurchase).amazon(abstractC2426lPurchase);
            abstractC2426lStartapp4 = abstractC11918l.isPro(InterfaceC11695l.startapp);
            abstractC2426l = abstractC2426lAmazon3;
            abstractC2426l2 = abstractC2426lPurchase;
        } else {
            AbstractC2426l abstractC2426lLicense = abstractC2426lAmazon2.license();
            AbstractC2426l abstractC2426lStartapp6 = abstractC2426lAmazon.startapp(abstractC2426lStartapp5);
            AbstractC2426l abstractC2426lStartapp7 = abstractC2426lAmazon.startapp(abstractC2426lStartapp);
            AbstractC2426l abstractC2426lStartapp8 = abstractC2426lStartapp6.startapp(abstractC2426lStartapp7);
            if (abstractC2426lStartapp8.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lStartapp8, abstractC11918l.crashlytics.Signature(), i);
            }
            AbstractC2426l abstractC2426lStartapp9 = abstractC2426lAmazon.startapp(abstractC2426lLicense);
            abstractC2426lStartapp4 = !zVip2 ? abstractC2426lStartapp9.startapp(abstractC2426lIsPro) : abstractC2426lStartapp9;
            AbstractC2426l abstractC2426lPro = abstractC2426lStartapp7.amazon(abstractC2426lLicense).pro(abstractC2426lStartapp4, abstractC2426l6.amazon(abstractC2426l4));
            if (!zVip) {
                abstractC2426lStartapp4 = abstractC2426lStartapp4.startapp(abstractC2426l4);
            }
            abstractC2426l = abstractC2426lPro;
            abstractC2426l2 = abstractC2426lStartapp8;
        }
        return new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l, new AbstractC2426l[]{abstractC2426lStartapp4}, 16);
    }

    private final AbstractC8859l inmobi(AbstractC8859l abstractC8859l) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        C10957l c10957l;
        C10957l c10957l2;
        C10957l c10957l3;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        C10957l c10957l4 = (C10957l) this.loadAd;
        C10957l c10957l5 = (C10957l) abstractC8859l.loadAd;
        boolean zAmazon = AbstractC17742l.amazon(c10957l4.f22089l);
        AbstractC11918l abstractC11918l = this.yandex;
        if (zAmazon) {
            return AbstractC17742l.amazon(c10957l5.f22089l) ? abstractC11918l.remoteconfig() : abstractC8859l.yandex(this);
        }
        C10957l c10957l6 = (C10957l) this.crashlytics;
        C10957l c10957l7 = (C10957l) this.amazon[0];
        C10957l c10957l8 = (C10957l) abstractC8859l.crashlytics;
        C10957l c10957l9 = (C10957l) abstractC8859l.isPro();
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        boolean zVip = c10957l7.vip();
        long[] jArr8 = c10957l7.f22089l;
        long[] jArrSubscription = zVip ? null : AbstractC10774l.subscription(jArr8);
        if (jArrSubscription == null) {
            jArr2 = c10957l5.f22089l;
            jArr = c10957l8.f22089l;
        } else {
            AbstractC10774l.adcel(c10957l5.f22089l, jArrSubscription, jArr5);
            AbstractC10774l.adcel(c10957l8.f22089l, jArrSubscription, jArr7);
            jArr = jArr7;
            jArr2 = jArr5;
        }
        long[] jArrSubscription2 = c10957l9.vip() ? null : AbstractC10774l.subscription(c10957l9.f22089l);
        long[] jArr9 = c10957l4.f22089l;
        if (jArrSubscription2 == null) {
            jArr3 = c10957l6.f22089l;
        } else {
            AbstractC10774l.adcel(jArr9, jArrSubscription2, jArr4);
            AbstractC10774l.adcel(c10957l6.f22089l, jArrSubscription2, jArr6);
            jArr9 = jArr4;
            jArr3 = jArr6;
        }
        AbstractC10774l.yandex(jArr3, jArr, jArr6);
        AbstractC10774l.yandex(jArr9, jArr2, jArr7);
        if (AbstractC17742l.amazon(jArr7)) {
            return AbstractC17742l.amazon(jArr6) ? advert() : abstractC11918l.remoteconfig();
        }
        boolean zAmazon2 = AbstractC17742l.amazon(c10957l5.f22089l);
        int i = 17;
        if (zAmazon2) {
            AbstractC8859l abstractC8859lStartapp = startapp();
            C10957l c10957l10 = (C10957l) abstractC8859lStartapp.loadAd;
            AbstractC2426l abstractC2426lSubs = abstractC8859lStartapp.subs();
            AbstractC2426l abstractC2426lAdmob = abstractC2426lSubs.amazon(c10957l8).admob(c10957l10);
            C10957l c10957l11 = (C10957l) abstractC2426lAdmob.license().amazon(abstractC2426lAdmob).amazon(c10957l10);
            if (AbstractC17742l.amazon(c10957l11.f22089l)) {
                return new C13683l(abstractC11918l, c10957l11, abstractC11918l.crashlytics, i);
            }
            c10957l = (C10957l) abstractC2426lAdmob.startapp(c10957l10.amazon(c10957l11)).amazon(c10957l11).amazon(abstractC2426lSubs).admob(c10957l11).amazon(c10957l11);
            c10957l3 = (C10957l) abstractC11918l.isPro(InterfaceC11695l.startapp);
            c10957l2 = c10957l11;
        } else {
            AbstractC10774l.license(jArr7, jArr7);
            long[] jArrSubscription3 = AbstractC10774l.subscription(jArr6);
            AbstractC10774l.adcel(jArr9, jArrSubscription3, jArr4);
            AbstractC10774l.adcel(jArr2, jArrSubscription3, jArr5);
            C10957l c10957l12 = new C10957l(jArr4);
            AbstractC10774l.vip(jArr4, jArr5, jArr4);
            if (AbstractC17742l.amazon(jArr4)) {
                return new C13683l(abstractC11918l, c10957l12, abstractC11918l.crashlytics, i);
            }
            C10957l c10957l13 = new C10957l(jArr6);
            AbstractC10774l.adcel(jArr7, jArrSubscription3, jArr6);
            if (jArrSubscription2 != null) {
                AbstractC10774l.adcel(jArr6, jArrSubscription2, jArr6);
            }
            long[] jArr10 = new long[18];
            AbstractC10774l.yandex(jArr5, jArr7, jArr7);
            long[] jArr11 = new long[18];
            AbstractC10774l.remoteconfig(jArr7, jArr11);
            AbstractC10774l.amazon(jArr10, jArr11, jArr10);
            AbstractC10774l.yandex(c10957l6.f22089l, jArr8, jArr7);
            AbstractC10774l.startapp(jArr7, jArr6, jArr10);
            c10957l = new C10957l(jArr7);
            AbstractC10774l.tapsense(jArr10, jArr7);
            if (jArrSubscription != null) {
                AbstractC10774l.adcel(jArr6, jArrSubscription, jArr6);
            }
            c10957l2 = c10957l12;
            c10957l3 = c10957l13;
        }
        return new C13683l(abstractC11918l, c10957l2, c10957l, new AbstractC2426l[]{c10957l3}, 17);
    }

    private final AbstractC8859l premium(AbstractC8859l abstractC8859l) {
        AbstractC2426l abstractC2426lStartapp;
        AbstractC2426l abstractC2426lStartapp2;
        AbstractC2426l abstractC2426lStartapp3;
        AbstractC2426l abstractC2426lStartapp4;
        AbstractC2426l abstractC2426l;
        AbstractC2426l abstractC2426l2;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        AbstractC2426l abstractC2426l3 = abstractC8859l.loadAd;
        AbstractC2426l abstractC2426lStartapp5 = this.loadAd;
        boolean zMetrica = abstractC2426lStartapp5.metrica();
        AbstractC11918l abstractC11918l = this.yandex;
        if (zMetrica) {
            return abstractC2426l3.metrica() ? abstractC11918l.remoteconfig() : abstractC8859l.yandex(this);
        }
        AbstractC2426l abstractC2426l4 = this.amazon[0];
        AbstractC2426l abstractC2426l5 = abstractC8859l.crashlytics;
        AbstractC2426l abstractC2426lIsPro = abstractC8859l.isPro();
        boolean zVip = abstractC2426l4.vip();
        if (zVip) {
            abstractC2426lStartapp = abstractC2426l3;
            abstractC2426lStartapp2 = abstractC2426l5;
        } else {
            abstractC2426lStartapp = abstractC2426l3.startapp(abstractC2426l4);
            abstractC2426lStartapp2 = abstractC2426l5.startapp(abstractC2426l4);
        }
        boolean zVip2 = abstractC2426lIsPro.vip();
        AbstractC2426l abstractC2426l6 = this.crashlytics;
        if (zVip2) {
            abstractC2426lStartapp3 = abstractC2426l6;
        } else {
            abstractC2426lStartapp5 = abstractC2426lStartapp5.startapp(abstractC2426lIsPro);
            abstractC2426lStartapp3 = abstractC2426l6.startapp(abstractC2426lIsPro);
        }
        AbstractC2426l abstractC2426lAmazon = abstractC2426lStartapp3.amazon(abstractC2426lStartapp2);
        AbstractC2426l abstractC2426lAmazon2 = abstractC2426lStartapp5.amazon(abstractC2426lStartapp);
        if (abstractC2426lAmazon2.metrica()) {
            return abstractC2426lAmazon.metrica() ? advert() : abstractC11918l.remoteconfig();
        }
        int i = 14;
        if (abstractC2426l3.metrica()) {
            AbstractC8859l abstractC8859lStartapp = startapp();
            AbstractC2426l abstractC2426l7 = abstractC8859lStartapp.loadAd;
            AbstractC2426l abstractC2426lSubs = abstractC8859lStartapp.subs();
            AbstractC2426l abstractC2426lAdmob = abstractC2426lSubs.amazon(abstractC2426l5).admob(abstractC2426l7);
            AbstractC2426l abstractC2426lPurchase = abstractC2426lAdmob.license().amazon(abstractC2426lAdmob).amazon(abstractC2426l7).purchase();
            if (abstractC2426lPurchase.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lPurchase, abstractC11918l.crashlytics.Signature(), i);
            }
            AbstractC2426l abstractC2426lAmazon3 = abstractC2426lAdmob.startapp(abstractC2426l7.amazon(abstractC2426lPurchase)).amazon(abstractC2426lPurchase).amazon(abstractC2426lSubs).admob(abstractC2426lPurchase).amazon(abstractC2426lPurchase);
            abstractC2426lStartapp4 = abstractC11918l.isPro(InterfaceC11695l.startapp);
            abstractC2426l = abstractC2426lAmazon3;
            abstractC2426l2 = abstractC2426lPurchase;
        } else {
            AbstractC2426l abstractC2426lLicense = abstractC2426lAmazon2.license();
            AbstractC2426l abstractC2426lStartapp6 = abstractC2426lAmazon.startapp(abstractC2426lStartapp5);
            AbstractC2426l abstractC2426lStartapp7 = abstractC2426lAmazon.startapp(abstractC2426lStartapp);
            AbstractC2426l abstractC2426lStartapp8 = abstractC2426lStartapp6.startapp(abstractC2426lStartapp7);
            if (abstractC2426lStartapp8.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lStartapp8, abstractC11918l.crashlytics.Signature(), i);
            }
            AbstractC2426l abstractC2426lStartapp9 = abstractC2426lAmazon.startapp(abstractC2426lLicense);
            abstractC2426lStartapp4 = !zVip2 ? abstractC2426lStartapp9.startapp(abstractC2426lIsPro) : abstractC2426lStartapp9;
            AbstractC2426l abstractC2426lPro = abstractC2426lStartapp7.amazon(abstractC2426lLicense).pro(abstractC2426lStartapp4, abstractC2426l6.amazon(abstractC2426l4));
            if (!zVip) {
                abstractC2426lStartapp4 = abstractC2426lStartapp4.startapp(abstractC2426l4);
            }
            abstractC2426l = abstractC2426lPro;
            abstractC2426l2 = abstractC2426lStartapp8;
        }
        return new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l, new AbstractC2426l[]{abstractC2426lStartapp4}, 14);
    }

    private final AbstractC8859l signatures(AbstractC8859l abstractC8859l) {
        AbstractC2426l abstractC2426lStartapp;
        AbstractC2426l abstractC2426lStartapp2;
        AbstractC2426l abstractC2426lStartapp3;
        AbstractC2426l abstractC2426lStartapp4;
        AbstractC2426l abstractC2426l;
        AbstractC2426l abstractC2426l2;
        if (smaato()) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return this;
        }
        AbstractC2426l abstractC2426l3 = abstractC8859l.loadAd;
        AbstractC2426l abstractC2426lStartapp5 = this.loadAd;
        boolean zMetrica = abstractC2426lStartapp5.metrica();
        AbstractC11918l abstractC11918l = this.yandex;
        if (zMetrica) {
            return abstractC2426l3.metrica() ? abstractC11918l.remoteconfig() : abstractC8859l.yandex(this);
        }
        AbstractC2426l abstractC2426l4 = this.amazon[0];
        AbstractC2426l abstractC2426l5 = abstractC8859l.crashlytics;
        AbstractC2426l abstractC2426lIsPro = abstractC8859l.isPro();
        boolean zVip = abstractC2426l4.vip();
        if (zVip) {
            abstractC2426lStartapp = abstractC2426l3;
            abstractC2426lStartapp2 = abstractC2426l5;
        } else {
            abstractC2426lStartapp = abstractC2426l3.startapp(abstractC2426l4);
            abstractC2426lStartapp2 = abstractC2426l5.startapp(abstractC2426l4);
        }
        boolean zVip2 = abstractC2426lIsPro.vip();
        AbstractC2426l abstractC2426l6 = this.crashlytics;
        if (zVip2) {
            abstractC2426lStartapp3 = abstractC2426l6;
        } else {
            abstractC2426lStartapp5 = abstractC2426lStartapp5.startapp(abstractC2426lIsPro);
            abstractC2426lStartapp3 = abstractC2426l6.startapp(abstractC2426lIsPro);
        }
        AbstractC2426l abstractC2426lAmazon = abstractC2426lStartapp3.amazon(abstractC2426lStartapp2);
        AbstractC2426l abstractC2426lAmazon2 = abstractC2426lStartapp5.amazon(abstractC2426lStartapp);
        if (abstractC2426lAmazon2.metrica()) {
            return abstractC2426lAmazon.metrica() ? advert() : abstractC11918l.remoteconfig();
        }
        int i = 13;
        if (abstractC2426l3.metrica()) {
            AbstractC8859l abstractC8859lStartapp = startapp();
            AbstractC2426l abstractC2426l7 = abstractC8859lStartapp.loadAd;
            AbstractC2426l abstractC2426lSubs = abstractC8859lStartapp.subs();
            AbstractC2426l abstractC2426lAdmob = abstractC2426lSubs.amazon(abstractC2426l5).admob(abstractC2426l7);
            AbstractC2426l abstractC2426lSignatures = AbstractC9361l.signatures(abstractC2426lAdmob, abstractC2426lAdmob, abstractC2426l7);
            if (abstractC2426lSignatures.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lSignatures, abstractC11918l.crashlytics, i);
            }
            AbstractC2426l abstractC2426lAmazon3 = abstractC2426lAdmob.startapp(abstractC2426l7.amazon(abstractC2426lSignatures)).amazon(abstractC2426lSignatures).amazon(abstractC2426lSubs).admob(abstractC2426lSignatures).amazon(abstractC2426lSignatures);
            abstractC2426lStartapp4 = abstractC11918l.isPro(InterfaceC11695l.startapp);
            abstractC2426l = abstractC2426lAmazon3;
            abstractC2426l2 = abstractC2426lSignatures;
        } else {
            AbstractC2426l abstractC2426lLicense = abstractC2426lAmazon2.license();
            AbstractC2426l abstractC2426lStartapp6 = abstractC2426lAmazon.startapp(abstractC2426lStartapp5);
            AbstractC2426l abstractC2426lStartapp7 = abstractC2426lAmazon.startapp(abstractC2426lStartapp);
            AbstractC2426l abstractC2426lStartapp8 = abstractC2426lStartapp6.startapp(abstractC2426lStartapp7);
            if (abstractC2426lStartapp8.metrica()) {
                return new C13683l(abstractC11918l, abstractC2426lStartapp8, abstractC11918l.crashlytics, i);
            }
            AbstractC2426l abstractC2426lStartapp9 = abstractC2426lAmazon.startapp(abstractC2426lLicense);
            abstractC2426lStartapp4 = !zVip2 ? abstractC2426lStartapp9.startapp(abstractC2426lIsPro) : abstractC2426lStartapp9;
            AbstractC2426l abstractC2426lPro = abstractC2426lStartapp7.amazon(abstractC2426lLicense).pro(abstractC2426lStartapp4, abstractC2426l6.amazon(abstractC2426l4));
            if (!zVip) {
                abstractC2426lStartapp4 = abstractC2426lStartapp4.startapp(abstractC2426l4);
            }
            abstractC2426l = abstractC2426lPro;
            abstractC2426l2 = abstractC2426lStartapp8;
        }
        return new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l, new AbstractC2426l[]{abstractC2426lStartapp4}, 13);
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l Signature(AbstractC2426l abstractC2426l) {
        if (smaato()) {
            return this;
        }
        int iMopub = mopub();
        if (iMopub != 5 && iMopub != 6) {
            return super.Signature(abstractC2426l);
        }
        AbstractC2426l abstractC2426l2 = this.crashlytics;
        AbstractC2426l abstractC2426l3 = this.loadAd;
        return this.yandex.billing(abstractC2426l3, abstractC2426l2.amazon(abstractC2426l3).startapp(abstractC2426l).amazon(abstractC2426l3), this.amazon);
    }

    @Override // defpackage.AbstractC8859l
    public final boolean ads() {
        AbstractC2426l abstractC2426lAds;
        AbstractC2426l abstractC2426lPro;
        AbstractC11918l abstractC11918l = this.yandex;
        AbstractC2426l abstractC2426lStartapp = abstractC11918l.loadAd;
        AbstractC2426l abstractC2426lStartapp2 = abstractC11918l.crashlytics;
        int i = abstractC11918l.billing;
        AbstractC2426l abstractC2426l = this.crashlytics;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l2 = this.loadAd;
        if (i != 6) {
            AbstractC2426l abstractC2426lStartapp3 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l);
            if (i != 0) {
                if (i != 1) {
                    C8339l.smaato("unsupported coordinate system");
                    return false;
                }
                AbstractC2426l abstractC2426l3 = abstractC2426lArr[0];
                if (!abstractC2426l3.vip()) {
                    AbstractC2426l abstractC2426lStartapp4 = abstractC2426l3.startapp(abstractC2426l3.license());
                    abstractC2426lStartapp3 = abstractC2426lStartapp3.startapp(abstractC2426l3);
                    abstractC2426lStartapp = abstractC2426lStartapp.startapp(abstractC2426l3);
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426lStartapp4);
                }
            }
            return abstractC2426lStartapp3.equals(abstractC2426l2.amazon(abstractC2426lStartapp).startapp(abstractC2426l2.license()).amazon(abstractC2426lStartapp2));
        }
        AbstractC2426l abstractC2426l4 = abstractC2426lArr[0];
        boolean zVip = abstractC2426l4.vip();
        if (abstractC2426l2.metrica()) {
            AbstractC2426l abstractC2426lLicense = abstractC2426l.license();
            if (!zVip) {
                abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l4.license());
            }
            return abstractC2426lLicense.equals(abstractC2426lStartapp2);
        }
        AbstractC2426l abstractC2426lLicense2 = abstractC2426l2.license();
        if (zVip) {
            abstractC2426lAds = AbstractC9361l.signatures(abstractC2426l, abstractC2426l, abstractC2426lStartapp);
            abstractC2426lPro = abstractC2426lLicense2.license().amazon(abstractC2426lStartapp2);
        } else {
            AbstractC2426l abstractC2426lLicense3 = abstractC2426l4.license();
            AbstractC2426l abstractC2426lLicense4 = abstractC2426lLicense3.license();
            abstractC2426lAds = abstractC2426l.amazon(abstractC2426l4).ads(abstractC2426l, abstractC2426lStartapp, abstractC2426lLicense3);
            abstractC2426lPro = abstractC2426lLicense2.pro(abstractC2426lStartapp2, abstractC2426lLicense4);
        }
        return abstractC2426lAds.startapp(abstractC2426lLicense2).equals(abstractC2426lPro);
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l advert() {
        C13683l c13683l;
        AbstractC2426l abstractC2426lAmazon;
        int i = this.mopub;
        int i2 = 6;
        int i3 = 9;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426lStartapp = this.crashlytics;
        AbstractC2426l abstractC2426lStartapp2 = this.loadAd;
        int i4 = 1;
        int i5 = 0;
        switch (i) {
            case 0:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l = this.yandex;
                if (zMetrica) {
                    return abstractC11918l.remoteconfig();
                }
                int i6 = abstractC11918l.billing;
                if (i6 == 0) {
                    AbstractC2426l abstractC2426lAmazon2 = abstractC2426lStartapp.admob(abstractC2426lStartapp2).amazon(abstractC2426lStartapp2);
                    AbstractC2426l abstractC2426lAmazon3 = abstractC2426lAmazon2.license().amazon(abstractC2426lAmazon2).amazon(abstractC11918l.loadAd);
                    return new C13683l(abstractC11918l, abstractC2426lAmazon3, abstractC2426lStartapp2.pro(abstractC2426lAmazon3, abstractC2426lAmazon2.purchase()), i5);
                }
                if (i6 == 1) {
                    AbstractC2426l abstractC2426l = abstractC2426lArr[0];
                    boolean zVip = abstractC2426l.vip();
                    AbstractC2426l abstractC2426lStartapp3 = zVip ? abstractC2426lStartapp2 : abstractC2426lStartapp2.startapp(abstractC2426l);
                    if (!zVip) {
                        abstractC2426lStartapp = abstractC2426lStartapp.startapp(abstractC2426l);
                    }
                    AbstractC2426l abstractC2426lLicense = abstractC2426lStartapp2.license();
                    AbstractC2426l abstractC2426lAmazon4 = abstractC2426lLicense.amazon(abstractC2426lStartapp);
                    AbstractC2426l abstractC2426lLicense2 = abstractC2426lStartapp3.license();
                    AbstractC2426l abstractC2426lAmazon5 = abstractC2426lAmazon4.amazon(abstractC2426lStartapp3);
                    AbstractC2426l abstractC2426lAds = abstractC2426lAmazon5.ads(abstractC2426lAmazon4, abstractC2426lLicense2, abstractC11918l.loadAd);
                    c13683l = new C13683l(abstractC11918l, abstractC2426lStartapp3.startapp(abstractC2426lAds), abstractC2426lLicense.license().ads(abstractC2426lStartapp3, abstractC2426lAds, abstractC2426lAmazon5), new AbstractC2426l[]{abstractC2426lStartapp3.startapp(abstractC2426lLicense2)}, 0);
                } else {
                    if (i6 != 6) {
                        C8339l.smaato("unsupported coordinate system");
                        return null;
                    }
                    AbstractC2426l abstractC2426l2 = abstractC2426lArr[0];
                    boolean zVip2 = abstractC2426l2.vip();
                    AbstractC2426l abstractC2426lStartapp4 = zVip2 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l2);
                    AbstractC2426l abstractC2426lLicense3 = zVip2 ? abstractC2426l2 : abstractC2426l2.license();
                    AbstractC2426l abstractC2426l3 = abstractC11918l.loadAd;
                    AbstractC2426l abstractC2426lStartapp5 = zVip2 ? abstractC2426l3 : abstractC2426l3.startapp(abstractC2426lLicense3);
                    AbstractC2426l abstractC2426lSignatures = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp4, abstractC2426lStartapp5);
                    if (abstractC2426lSignatures.metrica()) {
                        return new C13683l(abstractC11918l, abstractC2426lSignatures, abstractC11918l.crashlytics.Signature(), i5);
                    }
                    AbstractC2426l abstractC2426lLicense4 = abstractC2426lSignatures.license();
                    AbstractC2426l abstractC2426lStartapp6 = zVip2 ? abstractC2426lSignatures : abstractC2426lSignatures.startapp(abstractC2426lLicense3);
                    AbstractC2426l abstractC2426l4 = abstractC11918l.crashlytics;
                    if (abstractC2426l4.billing() < (abstractC11918l.smaato() >> 1)) {
                        AbstractC2426l abstractC2426lLicense5 = abstractC2426lStartapp.amazon(abstractC2426lStartapp2).license();
                        abstractC2426lAmazon = abstractC2426lLicense5.amazon(abstractC2426lSignatures).amazon(abstractC2426lLicense3).startapp(abstractC2426lLicense5).amazon(abstractC2426l4.vip() ? abstractC2426lStartapp5.amazon(abstractC2426lLicense3).license() : abstractC2426lStartapp5.pro(abstractC2426l4, abstractC2426lLicense3.license())).amazon(abstractC2426lLicense4);
                        if (!abstractC2426l3.metrica()) {
                            if (!abstractC2426l3.vip()) {
                                abstractC2426lAmazon = abstractC2426lAmazon.amazon(abstractC2426l3.purchase().startapp(abstractC2426lStartapp6));
                            }
                        }
                        c13683l = new C13683l(abstractC11918l, abstractC2426lLicense4, abstractC2426lAmazon, new AbstractC2426l[]{abstractC2426lStartapp6}, 0);
                    } else {
                        if (!zVip2) {
                            abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l2);
                        }
                        abstractC2426lAmazon = abstractC2426lStartapp2.pro(abstractC2426lSignatures, abstractC2426lStartapp4).amazon(abstractC2426lLicense4);
                    }
                    abstractC2426lAmazon = abstractC2426lAmazon.amazon(abstractC2426lStartapp6);
                    c13683l = new C13683l(abstractC11918l, abstractC2426lLicense4, abstractC2426lAmazon, new AbstractC2426l[]{abstractC2426lStartapp6}, 0);
                }
                return c13683l;
            case 1:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica2 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l2 = this.yandex;
                if (zMetrica2) {
                    return abstractC11918l2.remoteconfig();
                }
                AbstractC2426l abstractC2426l5 = abstractC2426lArr[0];
                boolean zVip3 = abstractC2426l5.vip();
                AbstractC2426l abstractC2426lStartapp7 = zVip3 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l5);
                AbstractC2426l abstractC2426lLicense6 = zVip3 ? abstractC2426l5 : abstractC2426l5.license();
                AbstractC2426l abstractC2426lStartapp8 = abstractC11918l2.loadAd;
                if (!zVip3) {
                    abstractC2426lStartapp8 = abstractC2426lStartapp8.startapp(abstractC2426lLicense6);
                }
                AbstractC2426l abstractC2426lSignatures2 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp7, abstractC2426lStartapp8);
                if (abstractC2426lSignatures2.metrica()) {
                    return new C13683l(abstractC11918l2, abstractC2426lSignatures2, abstractC11918l2.crashlytics.Signature(), i4);
                }
                AbstractC2426l abstractC2426lLicense7 = abstractC2426lSignatures2.license();
                AbstractC2426l abstractC2426lStartapp9 = zVip3 ? abstractC2426lSignatures2 : abstractC2426lSignatures2.startapp(abstractC2426lLicense6);
                if (!zVip3) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l5);
                }
                return new C13683l(abstractC11918l2, abstractC2426lLicense7, abstractC2426lStartapp2.pro(abstractC2426lSignatures2, abstractC2426lStartapp7).amazon(abstractC2426lLicense7).amazon(abstractC2426lStartapp9), new AbstractC2426l[]{abstractC2426lStartapp9}, 1);
            case 2:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica3 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l3 = this.yandex;
                if (zMetrica3) {
                    return abstractC11918l3.remoteconfig();
                }
                AbstractC2426l abstractC2426l6 = abstractC2426lArr[0];
                boolean zVip4 = abstractC2426l6.vip();
                AbstractC2426l abstractC2426lStartapp10 = zVip4 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l6);
                AbstractC2426l abstractC2426lLicense8 = zVip4 ? abstractC2426l6 : abstractC2426l6.license();
                AbstractC2426l abstractC2426lStartapp11 = abstractC11918l3.loadAd;
                if (!zVip4) {
                    abstractC2426lStartapp11 = abstractC2426lStartapp11.startapp(abstractC2426lLicense8);
                }
                AbstractC2426l abstractC2426lSignatures3 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp10, abstractC2426lStartapp11);
                if (abstractC2426lSignatures3.metrica()) {
                    return new C13683l(abstractC11918l3, abstractC2426lSignatures3, abstractC11918l3.crashlytics.Signature(), 2);
                }
                AbstractC2426l abstractC2426lLicense9 = abstractC2426lSignatures3.license();
                AbstractC2426l abstractC2426lStartapp12 = zVip4 ? abstractC2426lSignatures3 : abstractC2426lSignatures3.startapp(abstractC2426lLicense8);
                if (!zVip4) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l6);
                }
                return new C13683l(abstractC11918l3, abstractC2426lLicense9, abstractC2426lStartapp2.pro(abstractC2426lSignatures3, abstractC2426lStartapp10).amazon(abstractC2426lLicense9).amazon(abstractC2426lStartapp12), new AbstractC2426l[]{abstractC2426lStartapp12}, 2);
            case 3:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica4 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l4 = this.yandex;
                if (zMetrica4) {
                    return abstractC11918l4.remoteconfig();
                }
                AbstractC2426l abstractC2426l7 = abstractC2426lArr[0];
                boolean zVip5 = abstractC2426l7.vip();
                AbstractC2426l abstractC2426lStartapp13 = zVip5 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l7);
                AbstractC2426l abstractC2426lLicense10 = zVip5 ? abstractC2426l7 : abstractC2426l7.license();
                AbstractC2426l abstractC2426lStartapp14 = abstractC11918l4.loadAd;
                if (!zVip5) {
                    abstractC2426lStartapp14 = abstractC2426lStartapp14.startapp(abstractC2426lLicense10);
                }
                AbstractC2426l abstractC2426lSignatures4 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp13, abstractC2426lStartapp14);
                if (abstractC2426lSignatures4.metrica()) {
                    return new C13683l(abstractC11918l4, abstractC2426lSignatures4, abstractC11918l4.crashlytics.Signature(), 3);
                }
                AbstractC2426l abstractC2426lLicense11 = abstractC2426lSignatures4.license();
                AbstractC2426l abstractC2426lStartapp15 = zVip5 ? abstractC2426lSignatures4 : abstractC2426lSignatures4.startapp(abstractC2426lLicense10);
                if (!zVip5) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l7);
                }
                return new C13683l(abstractC11918l4, abstractC2426lLicense11, abstractC2426lStartapp2.pro(abstractC2426lSignatures4, abstractC2426lStartapp13).amazon(abstractC2426lLicense11).amazon(abstractC2426lStartapp15), new AbstractC2426l[]{abstractC2426lStartapp15}, 3);
            case 4:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica5 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l5 = this.yandex;
                if (zMetrica5) {
                    return abstractC11918l5.remoteconfig();
                }
                AbstractC2426l abstractC2426l8 = abstractC2426lArr[0];
                boolean zVip6 = abstractC2426l8.vip();
                AbstractC2426l abstractC2426lStartapp16 = zVip6 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l8);
                AbstractC2426l abstractC2426lLicense12 = zVip6 ? abstractC2426l8 : abstractC2426l8.license();
                AbstractC2426l abstractC2426lStartapp17 = abstractC11918l5.loadAd;
                if (!zVip6) {
                    abstractC2426lStartapp17 = abstractC2426lStartapp17.startapp(abstractC2426lLicense12);
                }
                AbstractC2426l abstractC2426lSignatures5 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp16, abstractC2426lStartapp17);
                if (abstractC2426lSignatures5.metrica()) {
                    return new C13683l(abstractC11918l5, abstractC2426lSignatures5, abstractC11918l5.crashlytics.Signature(), 4);
                }
                AbstractC2426l abstractC2426lLicense13 = abstractC2426lSignatures5.license();
                AbstractC2426l abstractC2426lStartapp18 = zVip6 ? abstractC2426lSignatures5 : abstractC2426lSignatures5.startapp(abstractC2426lLicense12);
                if (!zVip6) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l8);
                }
                return new C13683l(abstractC11918l5, abstractC2426lLicense13, abstractC2426lStartapp2.pro(abstractC2426lSignatures5, abstractC2426lStartapp16).amazon(abstractC2426lLicense13).amazon(abstractC2426lStartapp18), new AbstractC2426l[]{abstractC2426lStartapp18}, 4);
            case 5:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica6 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l6 = this.yandex;
                if (zMetrica6) {
                    return abstractC11918l6.remoteconfig();
                }
                AbstractC2426l abstractC2426lLicense14 = abstractC2426lArr[0];
                boolean zVip7 = abstractC2426lLicense14.vip();
                AbstractC2426l abstractC2426lStartapp19 = zVip7 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426lLicense14);
                if (!zVip7) {
                    abstractC2426lLicense14 = abstractC2426lLicense14.license();
                }
                AbstractC2426l abstractC2426lSignatures6 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp19, abstractC2426lLicense14);
                if (abstractC2426lSignatures6.metrica()) {
                    return new C13683l(abstractC11918l6, abstractC2426lSignatures6, abstractC11918l6.crashlytics, 5);
                }
                AbstractC2426l abstractC2426lLicense15 = abstractC2426lSignatures6.license();
                AbstractC2426l abstractC2426lStartapp20 = zVip7 ? abstractC2426lSignatures6 : abstractC2426lSignatures6.startapp(abstractC2426lLicense14);
                AbstractC2426l abstractC2426lLicense16 = abstractC2426lStartapp.amazon(abstractC2426lStartapp2).license();
                return new C13683l(abstractC11918l6, abstractC2426lLicense15, abstractC2426lLicense16.amazon(abstractC2426lSignatures6).amazon(abstractC2426lLicense14).startapp(abstractC2426lLicense16).amazon(abstractC2426lLicense15), new AbstractC2426l[]{abstractC2426lStartapp20}, 5);
            case 6:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica7 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l7 = this.yandex;
                if (zMetrica7) {
                    return abstractC11918l7.remoteconfig();
                }
                AbstractC2426l abstractC2426l9 = abstractC2426lArr[0];
                boolean zVip8 = abstractC2426l9.vip();
                AbstractC2426l abstractC2426lStartapp21 = zVip8 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l9);
                AbstractC2426l abstractC2426lLicense17 = zVip8 ? abstractC2426l9 : abstractC2426l9.license();
                AbstractC2426l abstractC2426lStartapp22 = abstractC11918l7.loadAd;
                if (!zVip8) {
                    abstractC2426lStartapp22 = abstractC2426lStartapp22.startapp(abstractC2426lLicense17);
                }
                AbstractC2426l abstractC2426lSignatures7 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp21, abstractC2426lStartapp22);
                if (abstractC2426lSignatures7.metrica()) {
                    return new C13683l(abstractC11918l7, abstractC2426lSignatures7, abstractC11918l7.crashlytics.Signature(), i2);
                }
                AbstractC2426l abstractC2426lLicense18 = abstractC2426lSignatures7.license();
                AbstractC2426l abstractC2426lStartapp23 = zVip8 ? abstractC2426lSignatures7 : abstractC2426lSignatures7.startapp(abstractC2426lLicense17);
                if (!zVip8) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l9);
                }
                return new C13683l(abstractC11918l7, abstractC2426lLicense18, abstractC2426lStartapp2.pro(abstractC2426lSignatures7, abstractC2426lStartapp21).amazon(abstractC2426lLicense18).amazon(abstractC2426lStartapp23), new AbstractC2426l[]{abstractC2426lStartapp23}, 6);
            case 7:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica8 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l8 = this.yandex;
                if (zMetrica8) {
                    return abstractC11918l8.remoteconfig();
                }
                AbstractC2426l abstractC2426l10 = abstractC2426lArr[0];
                boolean zVip9 = abstractC2426l10.vip();
                AbstractC2426l abstractC2426lStartapp24 = zVip9 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l10);
                AbstractC2426l abstractC2426lLicense19 = zVip9 ? abstractC2426l10 : abstractC2426l10.license();
                AbstractC2426l abstractC2426lSignatures8 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp24, abstractC2426lLicense19);
                if (abstractC2426lSignatures8.metrica()) {
                    return new C13683l(abstractC11918l8, abstractC2426lSignatures8, abstractC11918l8.crashlytics.Signature(), 7);
                }
                AbstractC2426l abstractC2426lLicense20 = abstractC2426lSignatures8.license();
                AbstractC2426l abstractC2426lStartapp25 = zVip9 ? abstractC2426lSignatures8 : abstractC2426lSignatures8.startapp(abstractC2426lLicense19);
                if (!zVip9) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l10);
                }
                return new C13683l(abstractC11918l8, abstractC2426lLicense20, abstractC2426lStartapp2.pro(abstractC2426lSignatures8, abstractC2426lStartapp24).amazon(abstractC2426lLicense20).amazon(abstractC2426lStartapp25), new AbstractC2426l[]{abstractC2426lStartapp25}, 7);
            case 8:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica9 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l9 = this.yandex;
                if (zMetrica9) {
                    return abstractC11918l9.remoteconfig();
                }
                AbstractC2426l abstractC2426l11 = abstractC2426lArr[0];
                boolean zVip10 = abstractC2426l11.vip();
                AbstractC2426l abstractC2426lStartapp26 = zVip10 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l11);
                AbstractC2426l abstractC2426lLicense21 = zVip10 ? abstractC2426l11 : abstractC2426l11.license();
                AbstractC2426l abstractC2426lStartapp27 = abstractC11918l9.loadAd;
                if (!zVip10) {
                    abstractC2426lStartapp27 = abstractC2426lStartapp27.startapp(abstractC2426lLicense21);
                }
                AbstractC2426l abstractC2426lSignatures9 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp26, abstractC2426lStartapp27);
                if (abstractC2426lSignatures9.metrica()) {
                    return new C13683l(abstractC11918l9, abstractC2426lSignatures9, abstractC11918l9.crashlytics.Signature(), 8);
                }
                AbstractC2426l abstractC2426lLicense22 = abstractC2426lSignatures9.license();
                AbstractC2426l abstractC2426lStartapp28 = zVip10 ? abstractC2426lSignatures9 : abstractC2426lSignatures9.startapp(abstractC2426lLicense21);
                if (!zVip10) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l11);
                }
                return new C13683l(abstractC11918l9, abstractC2426lLicense22, abstractC2426lStartapp2.pro(abstractC2426lSignatures9, abstractC2426lStartapp26).amazon(abstractC2426lLicense22).amazon(abstractC2426lStartapp28), new AbstractC2426l[]{abstractC2426lStartapp28}, 8);
            case 9:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica10 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l10 = this.yandex;
                if (zMetrica10) {
                    return abstractC11918l10.remoteconfig();
                }
                AbstractC2426l abstractC2426l12 = abstractC2426lArr[0];
                boolean zVip11 = abstractC2426l12.vip();
                AbstractC2426l abstractC2426lStartapp29 = zVip11 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l12);
                AbstractC2426l abstractC2426lLicense23 = zVip11 ? abstractC2426l12 : abstractC2426l12.license();
                AbstractC2426l abstractC2426lStartapp30 = abstractC11918l10.loadAd;
                if (!zVip11) {
                    abstractC2426lStartapp30 = abstractC2426lStartapp30.startapp(abstractC2426lLicense23);
                }
                AbstractC2426l abstractC2426lSignatures10 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp29, abstractC2426lStartapp30);
                if (abstractC2426lSignatures10.metrica()) {
                    return new C13683l(abstractC11918l10, abstractC2426lSignatures10, abstractC11918l10.crashlytics.Signature(), i3);
                }
                AbstractC2426l abstractC2426lLicense24 = abstractC2426lSignatures10.license();
                AbstractC2426l abstractC2426lStartapp31 = zVip11 ? abstractC2426lSignatures10 : abstractC2426lSignatures10.startapp(abstractC2426lLicense23);
                if (!zVip11) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l12);
                }
                return new C13683l(abstractC11918l10, abstractC2426lLicense24, abstractC2426lStartapp2.pro(abstractC2426lSignatures10, abstractC2426lStartapp29).amazon(abstractC2426lLicense24).amazon(abstractC2426lStartapp31), new AbstractC2426l[]{abstractC2426lStartapp31}, 9);
            case 10:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica11 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l11 = this.yandex;
                if (zMetrica11) {
                    return abstractC11918l11.remoteconfig();
                }
                AbstractC2426l abstractC2426lLicense25 = abstractC2426lArr[0];
                boolean zVip12 = abstractC2426lLicense25.vip();
                AbstractC2426l abstractC2426lLicense26 = zVip12 ? abstractC2426lLicense25 : abstractC2426lLicense25.license();
                AbstractC2426l abstractC2426lAmazon6 = zVip12 ? abstractC2426lStartapp.license().amazon(abstractC2426lStartapp) : abstractC2426lStartapp.amazon(abstractC2426lLicense25).startapp(abstractC2426lStartapp);
                if (abstractC2426lAmazon6.metrica()) {
                    return new C13683l(abstractC11918l11, abstractC2426lAmazon6, abstractC11918l11.crashlytics, 10);
                }
                AbstractC2426l abstractC2426lLicense27 = abstractC2426lAmazon6.license();
                AbstractC2426l abstractC2426lStartapp32 = zVip12 ? abstractC2426lAmazon6 : abstractC2426lAmazon6.startapp(abstractC2426lLicense26);
                AbstractC2426l abstractC2426lLicense28 = abstractC2426lStartapp.amazon(abstractC2426lStartapp2).license();
                if (!zVip12) {
                    abstractC2426lLicense25 = abstractC2426lLicense26.license();
                }
                return new C13683l(abstractC11918l11, abstractC2426lLicense27, abstractC2426lLicense28.amazon(abstractC2426lAmazon6).amazon(abstractC2426lLicense26).startapp(abstractC2426lLicense28).amazon(abstractC2426lLicense25).amazon(abstractC2426lLicense27).amazon(abstractC2426lStartapp32), new AbstractC2426l[]{abstractC2426lStartapp32}, 10);
            case 11:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica12 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l12 = this.yandex;
                if (zMetrica12) {
                    return abstractC11918l12.remoteconfig();
                }
                AbstractC2426l abstractC2426l13 = abstractC2426lArr[0];
                boolean zVip13 = abstractC2426l13.vip();
                AbstractC2426l abstractC2426lStartapp33 = zVip13 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l13);
                AbstractC2426l abstractC2426lLicense29 = zVip13 ? abstractC2426l13 : abstractC2426l13.license();
                AbstractC2426l abstractC2426lSignatures11 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp33, abstractC2426lLicense29);
                if (abstractC2426lSignatures11.metrica()) {
                    return new C13683l(abstractC11918l12, abstractC2426lSignatures11, abstractC11918l12.crashlytics.Signature(), 11);
                }
                AbstractC2426l abstractC2426lLicense30 = abstractC2426lSignatures11.license();
                AbstractC2426l abstractC2426lStartapp34 = zVip13 ? abstractC2426lSignatures11 : abstractC2426lSignatures11.startapp(abstractC2426lLicense29);
                if (!zVip13) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l13);
                }
                return new C13683l(abstractC11918l12, abstractC2426lLicense30, abstractC2426lStartapp2.pro(abstractC2426lSignatures11, abstractC2426lStartapp33).amazon(abstractC2426lLicense30).amazon(abstractC2426lStartapp34), new AbstractC2426l[]{abstractC2426lStartapp34}, 11);
            case 12:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica13 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l13 = this.yandex;
                if (zMetrica13) {
                    return abstractC11918l13.remoteconfig();
                }
                AbstractC2426l abstractC2426lLicense31 = abstractC2426lArr[0];
                boolean zVip14 = abstractC2426lLicense31.vip();
                AbstractC2426l abstractC2426lLicense32 = zVip14 ? abstractC2426lLicense31 : abstractC2426lLicense31.license();
                AbstractC2426l abstractC2426lAmazon7 = zVip14 ? abstractC2426lStartapp.license().amazon(abstractC2426lStartapp) : abstractC2426lStartapp.amazon(abstractC2426lLicense31).startapp(abstractC2426lStartapp);
                if (abstractC2426lAmazon7.metrica()) {
                    return new C13683l(abstractC11918l13, abstractC2426lAmazon7, abstractC11918l13.crashlytics, 12);
                }
                AbstractC2426l abstractC2426lLicense33 = abstractC2426lAmazon7.license();
                AbstractC2426l abstractC2426lStartapp35 = zVip14 ? abstractC2426lAmazon7 : abstractC2426lAmazon7.startapp(abstractC2426lLicense32);
                AbstractC2426l abstractC2426lLicense34 = abstractC2426lStartapp.amazon(abstractC2426lStartapp2).license();
                if (!zVip14) {
                    abstractC2426lLicense31 = abstractC2426lLicense32.license();
                }
                return new C13683l(abstractC11918l13, abstractC2426lLicense33, abstractC2426lLicense34.amazon(abstractC2426lAmazon7).amazon(abstractC2426lLicense32).startapp(abstractC2426lLicense34).amazon(abstractC2426lLicense31).amazon(abstractC2426lLicense33).amazon(abstractC2426lStartapp35), new AbstractC2426l[]{abstractC2426lStartapp35}, 12);
            case 13:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica14 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l14 = this.yandex;
                if (zMetrica14) {
                    return abstractC11918l14.remoteconfig();
                }
                AbstractC2426l abstractC2426lLicense35 = abstractC2426lArr[0];
                boolean zVip15 = abstractC2426lLicense35.vip();
                AbstractC2426l abstractC2426lLicense36 = zVip15 ? abstractC2426lLicense35 : abstractC2426lLicense35.license();
                AbstractC2426l abstractC2426lAmazon8 = zVip15 ? abstractC2426lStartapp.license().amazon(abstractC2426lStartapp) : abstractC2426lStartapp.amazon(abstractC2426lLicense35).startapp(abstractC2426lStartapp);
                if (abstractC2426lAmazon8.metrica()) {
                    return new C13683l(abstractC11918l14, abstractC2426lAmazon8, abstractC11918l14.crashlytics, 13);
                }
                AbstractC2426l abstractC2426lLicense37 = abstractC2426lAmazon8.license();
                AbstractC2426l abstractC2426lStartapp36 = zVip15 ? abstractC2426lAmazon8 : abstractC2426lAmazon8.startapp(abstractC2426lLicense36);
                AbstractC2426l abstractC2426lLicense38 = abstractC2426lStartapp.amazon(abstractC2426lStartapp2).license();
                if (!zVip15) {
                    abstractC2426lLicense35 = abstractC2426lLicense36.license();
                }
                return new C13683l(abstractC11918l14, abstractC2426lLicense37, abstractC2426lLicense38.amazon(abstractC2426lAmazon8).amazon(abstractC2426lLicense36).startapp(abstractC2426lLicense38).amazon(abstractC2426lLicense35).amazon(abstractC2426lLicense37).amazon(abstractC2426lStartapp36), new AbstractC2426l[]{abstractC2426lStartapp36}, 13);
            case 14:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica15 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l15 = this.yandex;
                if (zMetrica15) {
                    return abstractC11918l15.remoteconfig();
                }
                AbstractC2426l abstractC2426l14 = abstractC2426lArr[0];
                boolean zVip16 = abstractC2426l14.vip();
                AbstractC2426l abstractC2426lStartapp37 = zVip16 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l14);
                AbstractC2426l abstractC2426lLicense39 = zVip16 ? abstractC2426l14 : abstractC2426l14.license();
                AbstractC2426l abstractC2426lSignatures12 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp37, abstractC2426lLicense39);
                if (abstractC2426lSignatures12.metrica()) {
                    return new C13683l(abstractC11918l15, abstractC2426lSignatures12, abstractC11918l15.crashlytics.Signature(), 14);
                }
                AbstractC2426l abstractC2426lLicense40 = abstractC2426lSignatures12.license();
                AbstractC2426l abstractC2426lStartapp38 = zVip16 ? abstractC2426lSignatures12 : abstractC2426lSignatures12.startapp(abstractC2426lLicense39);
                if (!zVip16) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l14);
                }
                return new C13683l(abstractC11918l15, abstractC2426lLicense40, abstractC2426lStartapp2.pro(abstractC2426lSignatures12, abstractC2426lStartapp37).amazon(abstractC2426lLicense40).amazon(abstractC2426lStartapp38), new AbstractC2426l[]{abstractC2426lStartapp38}, 14);
            case 15:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica16 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l16 = this.yandex;
                if (zMetrica16) {
                    return abstractC11918l16.remoteconfig();
                }
                AbstractC2426l abstractC2426lLicense41 = abstractC2426lArr[0];
                boolean zVip17 = abstractC2426lLicense41.vip();
                AbstractC2426l abstractC2426lLicense42 = zVip17 ? abstractC2426lLicense41 : abstractC2426lLicense41.license();
                AbstractC2426l abstractC2426lAmazon9 = zVip17 ? abstractC2426lStartapp.license().amazon(abstractC2426lStartapp) : abstractC2426lStartapp.amazon(abstractC2426lLicense41).startapp(abstractC2426lStartapp);
                if (abstractC2426lAmazon9.metrica()) {
                    return new C13683l(abstractC11918l16, abstractC2426lAmazon9, abstractC11918l16.crashlytics, 15);
                }
                AbstractC2426l abstractC2426lLicense43 = abstractC2426lAmazon9.license();
                AbstractC2426l abstractC2426lStartapp39 = zVip17 ? abstractC2426lAmazon9 : abstractC2426lAmazon9.startapp(abstractC2426lLicense42);
                AbstractC2426l abstractC2426lLicense44 = abstractC2426lStartapp.amazon(abstractC2426lStartapp2).license();
                if (!zVip17) {
                    abstractC2426lLicense41 = abstractC2426lLicense42.license();
                }
                return new C13683l(abstractC11918l16, abstractC2426lLicense43, abstractC2426lLicense44.amazon(abstractC2426lAmazon9).amazon(abstractC2426lLicense42).startapp(abstractC2426lLicense44).amazon(abstractC2426lLicense41).amazon(abstractC2426lLicense43).amazon(abstractC2426lStartapp39), new AbstractC2426l[]{abstractC2426lStartapp39}, 15);
            case 16:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica17 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l17 = this.yandex;
                if (zMetrica17) {
                    return abstractC11918l17.remoteconfig();
                }
                AbstractC2426l abstractC2426l15 = abstractC2426lArr[0];
                boolean zVip18 = abstractC2426l15.vip();
                AbstractC2426l abstractC2426lStartapp40 = zVip18 ? abstractC2426lStartapp : abstractC2426lStartapp.startapp(abstractC2426l15);
                AbstractC2426l abstractC2426lLicense45 = zVip18 ? abstractC2426l15 : abstractC2426l15.license();
                AbstractC2426l abstractC2426lSignatures13 = AbstractC9361l.signatures(abstractC2426lStartapp, abstractC2426lStartapp40, abstractC2426lLicense45);
                if (abstractC2426lSignatures13.metrica()) {
                    return new C13683l(abstractC11918l17, abstractC2426lSignatures13, abstractC11918l17.crashlytics.Signature(), 16);
                }
                AbstractC2426l abstractC2426lLicense46 = abstractC2426lSignatures13.license();
                AbstractC2426l abstractC2426lStartapp41 = zVip18 ? abstractC2426lSignatures13 : abstractC2426lSignatures13.startapp(abstractC2426lLicense45);
                if (!zVip18) {
                    abstractC2426lStartapp2 = abstractC2426lStartapp2.startapp(abstractC2426l15);
                }
                return new C13683l(abstractC11918l17, abstractC2426lLicense46, abstractC2426lStartapp2.pro(abstractC2426lSignatures13, abstractC2426lStartapp40).amazon(abstractC2426lLicense46).amazon(abstractC2426lStartapp41), new AbstractC2426l[]{abstractC2426lStartapp41}, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (smaato()) {
                    return this;
                }
                boolean zMetrica18 = abstractC2426lStartapp2.metrica();
                AbstractC11918l abstractC11918l18 = this.yandex;
                if (zMetrica18) {
                    return abstractC11918l18.remoteconfig();
                }
                AbstractC2426l abstractC2426lLicense47 = abstractC2426lArr[0];
                boolean zVip19 = abstractC2426lLicense47.vip();
                AbstractC2426l abstractC2426lLicense48 = zVip19 ? abstractC2426lLicense47 : abstractC2426lLicense47.license();
                AbstractC2426l abstractC2426lAmazon10 = zVip19 ? abstractC2426lStartapp.license().amazon(abstractC2426lStartapp) : abstractC2426lStartapp.amazon(abstractC2426lLicense47).startapp(abstractC2426lStartapp);
                if (abstractC2426lAmazon10.metrica()) {
                    return new C13683l(abstractC11918l18, abstractC2426lAmazon10, abstractC11918l18.crashlytics, 17);
                }
                AbstractC2426l abstractC2426lLicense49 = abstractC2426lAmazon10.license();
                AbstractC2426l abstractC2426lStartapp42 = zVip19 ? abstractC2426lAmazon10 : abstractC2426lAmazon10.startapp(abstractC2426lLicense48);
                AbstractC2426l abstractC2426lLicense50 = abstractC2426lStartapp.amazon(abstractC2426lStartapp2).license();
                if (!zVip19) {
                    abstractC2426lLicense47 = abstractC2426lLicense48.license();
                }
                return new C13683l(abstractC11918l18, abstractC2426lLicense49, abstractC2426lLicense50.amazon(abstractC2426lAmazon10).amazon(abstractC2426lLicense48).startapp(abstractC2426lLicense50).amazon(abstractC2426lLicense47).amazon(abstractC2426lLicense49).amazon(abstractC2426lStartapp42), new AbstractC2426l[]{abstractC2426lStartapp42}, 17);
            default:
                if (smaato()) {
                    return this;
                }
                C10957l c10957l = (C10957l) abstractC2426lStartapp2;
                boolean zAmazon = AbstractC17742l.amazon(c10957l.f22089l);
                AbstractC11918l abstractC11918l19 = this.yandex;
                if (zAmazon) {
                    return abstractC11918l19.remoteconfig();
                }
                C10957l c10957l2 = (C10957l) abstractC2426lStartapp;
                C10957l c10957l3 = (C10957l) abstractC2426lArr[0];
                long[] jArr = new long[9];
                long[] jArr2 = new long[9];
                boolean zVip20 = c10957l3.vip();
                long[] jArr3 = c10957l3.f22089l;
                long[] jArrSubscription = zVip20 ? null : AbstractC10774l.subscription(jArr3);
                long[] jArr4 = c10957l2.f22089l;
                if (jArrSubscription != null) {
                    AbstractC10774l.adcel(jArr4, jArrSubscription, jArr);
                    AbstractC10774l.license(jArr3, jArr2);
                    jArr4 = jArr;
                    jArr3 = jArr2;
                }
                long[] jArr5 = new long[9];
                AbstractC10774l.license(c10957l2.f22089l, jArr5);
                AbstractC10774l.crashlytics(jArr4, jArr3, jArr5);
                int i7 = 18;
                if (AbstractC17742l.amazon(jArr5)) {
                    return new C13683l(abstractC11918l19, new C10957l(jArr5), C9949l.remoteconfig, i7);
                }
                long[] jArr6 = new long[18];
                AbstractC10774l.startapp(jArr5, jArr4, jArr6);
                C10957l c10957l4 = new C10957l(jArr);
                AbstractC10774l.license(jArr5, jArr);
                C10957l c10957l5 = new C10957l(jArr5);
                if (jArrSubscription != null) {
                    AbstractC10774l.vip(jArr5, jArr3, jArr5);
                }
                long[] jArr7 = c10957l.f22089l;
                if (jArrSubscription != null) {
                    AbstractC10774l.adcel(jArr7, jArrSubscription, jArr2);
                    jArr7 = jArr2;
                }
                long[] jArr8 = new long[18];
                AbstractC10774l.remoteconfig(jArr7, jArr8);
                AbstractC10774l.amazon(jArr6, jArr8, jArr6);
                AbstractC10774l.tapsense(jArr6, jArr2);
                AbstractC10774l.crashlytics(jArr, jArr5, jArr2);
                return new C13683l(abstractC11918l19, c10957l4, new C10957l(jArr2), new AbstractC2426l[]{c10957l5}, 18);
        }
    }

    @Override // defpackage.AbstractC8859l
    public final boolean billing() {
        int i = this.mopub;
        AbstractC2426l abstractC2426l = this.crashlytics;
        AbstractC2426l abstractC2426l2 = this.loadAd;
        switch (i) {
            case 0:
                if (!abstractC2426l2.metrica()) {
                    int iMopub = mopub();
                    if (iMopub != 5 && iMopub != 6) {
                        return abstractC2426l.admob(abstractC2426l2).isVip();
                    }
                    if (abstractC2426l.isVip() != abstractC2426l2.isVip()) {
                        return true;
                    }
                }
                return false;
            case 1:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 2:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 3:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 4:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 5:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 6:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 7:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 8:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 9:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 10:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 11:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 12:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 13:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 14:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 15:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case 16:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
            default:
                return (abstractC2426l2.metrica() || abstractC2426l.isVip() == abstractC2426l2.isVip()) ? false : true;
        }
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l crashlytics() {
        switch (this.mopub) {
            case 0:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 0);
            case 1:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 1);
            case 2:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 2);
            case 3:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 3);
            case 4:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 4);
            case 5:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 5);
            case 6:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 6);
            case 7:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 7);
            case 8:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 8);
            case 9:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 9);
            case 10:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 10);
            case 11:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 11);
            case 12:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 12);
            case 13:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 13);
            case 14:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 14);
            case 15:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 15);
            case 16:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 17);
            default:
                loadAd();
                return new C13683l(null, this.loadAd, purchase(), 18);
        }
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l isVip(AbstractC8859l abstractC8859l) {
        AbstractC8859l c13683l = abstractC8859l;
        int i = this.mopub;
        int i2 = 6;
        int i3 = 3;
        int i4 = 9;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l = this.crashlytics;
        AbstractC2426l abstractC2426l2 = this.loadAd;
        int i5 = 1;
        int i6 = 0;
        switch (i) {
            case 0:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC11918l abstractC11918l = this.yandex;
                        if (abstractC11918l.billing == 6) {
                            AbstractC2426l abstractC2426l3 = c13683l.loadAd;
                            AbstractC2426l abstractC2426l4 = c13683l.amazon[0];
                            if (!abstractC2426l3.metrica() && abstractC2426l4.vip()) {
                                AbstractC2426l abstractC2426l5 = abstractC2426lArr[0];
                                AbstractC2426l abstractC2426l6 = c13683l.crashlytics;
                                AbstractC2426l abstractC2426lLicense = abstractC2426l2.license();
                                AbstractC2426l abstractC2426lLicense2 = abstractC2426l.license();
                                AbstractC2426l abstractC2426lLicense3 = abstractC2426l5.license();
                                AbstractC2426l abstractC2426lAmazon = abstractC11918l.loadAd.startapp(abstractC2426lLicense3).amazon(abstractC2426lLicense2).amazon(abstractC2426l.startapp(abstractC2426l5));
                                AbstractC2426l abstractC2426lPurchase = abstractC2426l6.purchase();
                                AbstractC2426l abstractC2426lAds = abstractC11918l.loadAd.amazon(abstractC2426lPurchase).startapp(abstractC2426lLicense3).amazon(abstractC2426lLicense2).ads(abstractC2426lAmazon, abstractC2426lLicense, abstractC2426lLicense3);
                                AbstractC2426l abstractC2426lStartapp = abstractC2426l3.startapp(abstractC2426lLicense3);
                                AbstractC2426l abstractC2426lLicense4 = abstractC2426lStartapp.amazon(abstractC2426lAmazon).license();
                                if (abstractC2426lLicense4.metrica()) {
                                    return abstractC2426lAds.metrica() ? c13683l.advert() : abstractC11918l.remoteconfig();
                                }
                                if (abstractC2426lAds.metrica()) {
                                    return new C13683l(abstractC11918l, abstractC2426lAds, abstractC11918l.crashlytics.Signature(), i6);
                                }
                                AbstractC2426l abstractC2426lStartapp2 = abstractC2426lAds.license().startapp(abstractC2426lStartapp);
                                AbstractC2426l abstractC2426lStartapp3 = abstractC2426lAds.startapp(abstractC2426lLicense4).startapp(abstractC2426lLicense3);
                                return new C13683l(abstractC11918l, abstractC2426lStartapp2, abstractC2426lAds.amazon(abstractC2426lLicense4).license().ads(abstractC2426lAmazon, abstractC2426lPurchase, abstractC2426lStartapp3), new AbstractC2426l[]{abstractC2426lStartapp3}, 0);
                            }
                        }
                        return advert().yandex(c13683l);
                    }
                }
                return c13683l;
            case 1:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l7 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro = c13683l.isPro();
                        if (abstractC2426l7.metrica() || !abstractC2426lIsPro.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l8 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l9 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense5 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense6 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense7 = abstractC2426l8.license();
                        AbstractC2426l abstractC2426lStartapp4 = abstractC2426l.startapp(abstractC2426l8);
                        AbstractC11918l abstractC11918l2 = this.yandex;
                        AbstractC2426l abstractC2426lAmazon2 = abstractC11918l2.loadAd.startapp(abstractC2426lLicense7).amazon(abstractC2426lLicense6).amazon(abstractC2426lStartapp4);
                        AbstractC2426l abstractC2426lPurchase2 = abstractC2426l9.purchase();
                        AbstractC2426l abstractC2426lAds2 = abstractC11918l2.loadAd.amazon(abstractC2426lPurchase2).startapp(abstractC2426lLicense7).amazon(abstractC2426lLicense6).ads(abstractC2426lAmazon2, abstractC2426lLicense5, abstractC2426lLicense7);
                        AbstractC2426l abstractC2426lStartapp5 = abstractC2426l7.startapp(abstractC2426lLicense7);
                        AbstractC2426l abstractC2426lLicense8 = abstractC2426lStartapp5.amazon(abstractC2426lAmazon2).license();
                        if (abstractC2426lLicense8.metrica()) {
                            return abstractC2426lAds2.metrica() ? c13683l.advert() : abstractC11918l2.remoteconfig();
                        }
                        if (abstractC2426lAds2.metrica()) {
                            return new C13683l(abstractC11918l2, abstractC2426lAds2, abstractC11918l2.crashlytics.Signature(), i5);
                        }
                        AbstractC2426l abstractC2426lStartapp6 = abstractC2426lAds2.license().startapp(abstractC2426lStartapp5);
                        AbstractC2426l abstractC2426lStartapp7 = abstractC2426lAds2.startapp(abstractC2426lLicense8).startapp(abstractC2426lLicense7);
                        return new C13683l(abstractC11918l2, abstractC2426lStartapp6, abstractC2426lAds2.amazon(abstractC2426lLicense8).license().ads(abstractC2426lAmazon2, abstractC2426lPurchase2, abstractC2426lStartapp7), new AbstractC2426l[]{abstractC2426lStartapp7}, 1);
                    }
                }
                return c13683l;
            case 2:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l10 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro2 = c13683l.isPro();
                        if (abstractC2426l10.metrica() || !abstractC2426lIsPro2.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l11 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l12 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense9 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense10 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense11 = abstractC2426l11.license();
                        AbstractC2426l abstractC2426lStartapp8 = abstractC2426l.startapp(abstractC2426l11);
                        AbstractC11918l abstractC11918l3 = this.yandex;
                        AbstractC2426l abstractC2426lAmazon3 = abstractC11918l3.loadAd.startapp(abstractC2426lLicense11).amazon(abstractC2426lLicense10).amazon(abstractC2426lStartapp8);
                        AbstractC2426l abstractC2426lPurchase3 = abstractC2426l12.purchase();
                        AbstractC2426l abstractC2426lAds3 = abstractC11918l3.loadAd.amazon(abstractC2426lPurchase3).startapp(abstractC2426lLicense11).amazon(abstractC2426lLicense10).ads(abstractC2426lAmazon3, abstractC2426lLicense9, abstractC2426lLicense11);
                        AbstractC2426l abstractC2426lStartapp9 = abstractC2426l10.startapp(abstractC2426lLicense11);
                        AbstractC2426l abstractC2426lLicense12 = abstractC2426lStartapp9.amazon(abstractC2426lAmazon3).license();
                        if (abstractC2426lLicense12.metrica()) {
                            return abstractC2426lAds3.metrica() ? c13683l.advert() : abstractC11918l3.remoteconfig();
                        }
                        if (abstractC2426lAds3.metrica()) {
                            return new C13683l(abstractC11918l3, abstractC2426lAds3, abstractC11918l3.crashlytics.Signature(), 2);
                        }
                        AbstractC2426l abstractC2426lStartapp10 = abstractC2426lAds3.license().startapp(abstractC2426lStartapp9);
                        AbstractC2426l abstractC2426lStartapp11 = abstractC2426lAds3.startapp(abstractC2426lLicense12).startapp(abstractC2426lLicense11);
                        return new C13683l(abstractC11918l3, abstractC2426lStartapp10, abstractC2426lAds3.amazon(abstractC2426lLicense12).license().ads(abstractC2426lAmazon3, abstractC2426lPurchase3, abstractC2426lStartapp11), new AbstractC2426l[]{abstractC2426lStartapp11}, 2);
                    }
                }
                return c13683l;
            case 3:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l13 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro3 = c13683l.isPro();
                        if (abstractC2426l13.metrica() || !abstractC2426lIsPro3.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l14 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l15 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense13 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense14 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense15 = abstractC2426l14.license();
                        AbstractC2426l abstractC2426lStartapp12 = abstractC2426l.startapp(abstractC2426l14);
                        AbstractC11918l abstractC11918l4 = this.yandex;
                        AbstractC2426l abstractC2426lAmazon4 = abstractC11918l4.loadAd.startapp(abstractC2426lLicense15).amazon(abstractC2426lLicense14).amazon(abstractC2426lStartapp12);
                        AbstractC2426l abstractC2426lPurchase4 = abstractC2426l15.purchase();
                        AbstractC2426l abstractC2426lAds4 = abstractC11918l4.loadAd.amazon(abstractC2426lPurchase4).startapp(abstractC2426lLicense15).amazon(abstractC2426lLicense14).ads(abstractC2426lAmazon4, abstractC2426lLicense13, abstractC2426lLicense15);
                        AbstractC2426l abstractC2426lStartapp13 = abstractC2426l13.startapp(abstractC2426lLicense15);
                        AbstractC2426l abstractC2426lLicense16 = abstractC2426lStartapp13.amazon(abstractC2426lAmazon4).license();
                        if (abstractC2426lLicense16.metrica()) {
                            return abstractC2426lAds4.metrica() ? c13683l.advert() : abstractC11918l4.remoteconfig();
                        }
                        if (abstractC2426lAds4.metrica()) {
                            return new C13683l(abstractC11918l4, abstractC2426lAds4, abstractC11918l4.crashlytics.Signature(), i3);
                        }
                        AbstractC2426l abstractC2426lStartapp14 = abstractC2426lAds4.license().startapp(abstractC2426lStartapp13);
                        AbstractC2426l abstractC2426lStartapp15 = abstractC2426lAds4.startapp(abstractC2426lLicense16).startapp(abstractC2426lLicense15);
                        return new C13683l(abstractC11918l4, abstractC2426lStartapp14, abstractC2426lAds4.amazon(abstractC2426lLicense16).license().ads(abstractC2426lAmazon4, abstractC2426lPurchase4, abstractC2426lStartapp15), new AbstractC2426l[]{abstractC2426lStartapp15}, 3);
                    }
                }
                return c13683l;
            case 4:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l16 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro4 = c13683l.isPro();
                        if (abstractC2426l16.metrica() || !abstractC2426lIsPro4.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l17 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l18 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense17 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense18 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense19 = abstractC2426l17.license();
                        AbstractC2426l abstractC2426lStartapp16 = abstractC2426l.startapp(abstractC2426l17);
                        AbstractC11918l abstractC11918l5 = this.yandex;
                        AbstractC2426l abstractC2426lAmazon5 = abstractC11918l5.loadAd.startapp(abstractC2426lLicense19).amazon(abstractC2426lLicense18).amazon(abstractC2426lStartapp16);
                        AbstractC2426l abstractC2426lPurchase5 = abstractC2426l18.purchase();
                        AbstractC2426l abstractC2426lAds5 = abstractC11918l5.loadAd.amazon(abstractC2426lPurchase5).startapp(abstractC2426lLicense19).amazon(abstractC2426lLicense18).ads(abstractC2426lAmazon5, abstractC2426lLicense17, abstractC2426lLicense19);
                        AbstractC2426l abstractC2426lStartapp17 = abstractC2426l16.startapp(abstractC2426lLicense19);
                        AbstractC2426l abstractC2426lLicense20 = abstractC2426lStartapp17.amazon(abstractC2426lAmazon5).license();
                        if (abstractC2426lLicense20.metrica()) {
                            return abstractC2426lAds5.metrica() ? c13683l.advert() : abstractC11918l5.remoteconfig();
                        }
                        if (abstractC2426lAds5.metrica()) {
                            return new C13683l(abstractC11918l5, abstractC2426lAds5, abstractC11918l5.crashlytics.Signature(), 4);
                        }
                        AbstractC2426l abstractC2426lStartapp18 = abstractC2426lAds5.license().startapp(abstractC2426lStartapp17);
                        AbstractC2426l abstractC2426lStartapp19 = abstractC2426lAds5.startapp(abstractC2426lLicense20).startapp(abstractC2426lLicense19);
                        return new C13683l(abstractC11918l5, abstractC2426lStartapp18, abstractC2426lAds5.amazon(abstractC2426lLicense20).license().ads(abstractC2426lAmazon5, abstractC2426lPurchase5, abstractC2426lStartapp19), new AbstractC2426l[]{abstractC2426lStartapp19}, 4);
                    }
                }
                return c13683l;
            case 5:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l19 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro5 = c13683l.isPro();
                        if (abstractC2426l19.metrica() || !abstractC2426lIsPro5.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l20 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l21 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense21 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense22 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense23 = abstractC2426l20.license();
                        AbstractC2426l abstractC2426lAmazon6 = abstractC2426lLicense23.amazon(abstractC2426lLicense22).amazon(abstractC2426l.startapp(abstractC2426l20));
                        AbstractC2426l abstractC2426lAds6 = abstractC2426l21.startapp(abstractC2426lLicense23).amazon(abstractC2426lLicense22).ads(abstractC2426lAmazon6, abstractC2426lLicense21, abstractC2426lLicense23);
                        AbstractC2426l abstractC2426lStartapp20 = abstractC2426l19.startapp(abstractC2426lLicense23);
                        AbstractC2426l abstractC2426lLicense24 = abstractC2426lStartapp20.amazon(abstractC2426lAmazon6).license();
                        boolean zMetrica = abstractC2426lLicense24.metrica();
                        AbstractC11918l abstractC11918l6 = this.yandex;
                        boolean zMetrica2 = abstractC2426lAds6.metrica();
                        if (zMetrica) {
                            return zMetrica2 ? c13683l.advert() : abstractC11918l6.remoteconfig();
                        }
                        if (zMetrica2) {
                            return new C13683l(abstractC11918l6, abstractC2426lAds6, abstractC11918l6.crashlytics, 5);
                        }
                        AbstractC2426l abstractC2426lStartapp21 = abstractC2426lAds6.license().startapp(abstractC2426lStartapp20);
                        AbstractC2426l abstractC2426lStartapp22 = abstractC2426lAds6.startapp(abstractC2426lLicense24).startapp(abstractC2426lLicense23);
                        return new C13683l(abstractC11918l6, abstractC2426lStartapp21, abstractC2426lAds6.amazon(abstractC2426lLicense24).license().ads(abstractC2426lAmazon6, abstractC2426l21.purchase(), abstractC2426lStartapp22), new AbstractC2426l[]{abstractC2426lStartapp22}, 5);
                    }
                }
                return c13683l;
            case 6:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l22 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro6 = c13683l.isPro();
                        if (abstractC2426l22.metrica() || !abstractC2426lIsPro6.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l23 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l24 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense25 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense26 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense27 = abstractC2426l23.license();
                        AbstractC2426l abstractC2426lStartapp23 = abstractC2426l.startapp(abstractC2426l23);
                        AbstractC11918l abstractC11918l7 = this.yandex;
                        AbstractC2426l abstractC2426lAmazon7 = abstractC11918l7.loadAd.startapp(abstractC2426lLicense27).amazon(abstractC2426lLicense26).amazon(abstractC2426lStartapp23);
                        AbstractC2426l abstractC2426lPurchase6 = abstractC2426l24.purchase();
                        AbstractC2426l abstractC2426lAds7 = abstractC11918l7.loadAd.amazon(abstractC2426lPurchase6).startapp(abstractC2426lLicense27).amazon(abstractC2426lLicense26).ads(abstractC2426lAmazon7, abstractC2426lLicense25, abstractC2426lLicense27);
                        AbstractC2426l abstractC2426lStartapp24 = abstractC2426l22.startapp(abstractC2426lLicense27);
                        AbstractC2426l abstractC2426lLicense28 = abstractC2426lStartapp24.amazon(abstractC2426lAmazon7).license();
                        if (abstractC2426lLicense28.metrica()) {
                            return abstractC2426lAds7.metrica() ? c13683l.advert() : abstractC11918l7.remoteconfig();
                        }
                        if (abstractC2426lAds7.metrica()) {
                            return new C13683l(abstractC11918l7, abstractC2426lAds7, abstractC11918l7.crashlytics.Signature(), i2);
                        }
                        AbstractC2426l abstractC2426lStartapp25 = abstractC2426lAds7.license().startapp(abstractC2426lStartapp24);
                        AbstractC2426l abstractC2426lStartapp26 = abstractC2426lAds7.startapp(abstractC2426lLicense28).startapp(abstractC2426lLicense27);
                        return new C13683l(abstractC11918l7, abstractC2426lStartapp25, abstractC2426lAds7.amazon(abstractC2426lLicense28).license().ads(abstractC2426lAmazon7, abstractC2426lPurchase6, abstractC2426lStartapp26), new AbstractC2426l[]{abstractC2426lStartapp26}, 6);
                    }
                }
                return c13683l;
            case 7:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l25 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro7 = c13683l.isPro();
                        if (abstractC2426l25.metrica() || !abstractC2426lIsPro7.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l26 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l27 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense29 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense30 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense31 = abstractC2426l26.license();
                        AbstractC2426l abstractC2426lAmazon8 = abstractC2426lLicense31.amazon(abstractC2426lLicense30).amazon(abstractC2426l.startapp(abstractC2426l26));
                        AbstractC2426l abstractC2426lAds8 = abstractC2426l27.startapp(abstractC2426lLicense31).amazon(abstractC2426lLicense30).ads(abstractC2426lAmazon8, abstractC2426lLicense29, abstractC2426lLicense31);
                        AbstractC2426l abstractC2426lStartapp27 = abstractC2426l25.startapp(abstractC2426lLicense31);
                        AbstractC2426l abstractC2426lLicense32 = abstractC2426lStartapp27.amazon(abstractC2426lAmazon8).license();
                        boolean zMetrica3 = abstractC2426lLicense32.metrica();
                        AbstractC11918l abstractC11918l8 = this.yandex;
                        boolean zMetrica4 = abstractC2426lAds8.metrica();
                        if (zMetrica3) {
                            return zMetrica4 ? c13683l.advert() : abstractC11918l8.remoteconfig();
                        }
                        if (zMetrica4) {
                            return new C13683l(abstractC11918l8, abstractC2426lAds8, abstractC11918l8.crashlytics.Signature(), 7);
                        }
                        AbstractC2426l abstractC2426lStartapp28 = abstractC2426lAds8.license().startapp(abstractC2426lStartapp27);
                        AbstractC2426l abstractC2426lStartapp29 = abstractC2426lAds8.startapp(abstractC2426lLicense32).startapp(abstractC2426lLicense31);
                        return new C13683l(abstractC11918l8, abstractC2426lStartapp28, abstractC2426lAds8.amazon(abstractC2426lLicense32).license().ads(abstractC2426lAmazon8, abstractC2426l27.purchase(), abstractC2426lStartapp29), new AbstractC2426l[]{abstractC2426lStartapp29}, 7);
                    }
                }
                return c13683l;
            case 8:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l28 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro8 = c13683l.isPro();
                        if (abstractC2426l28.metrica() || !abstractC2426lIsPro8.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l29 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l30 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense33 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense34 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense35 = abstractC2426l29.license();
                        AbstractC2426l abstractC2426lStartapp30 = abstractC2426l.startapp(abstractC2426l29);
                        AbstractC11918l abstractC11918l9 = this.yandex;
                        AbstractC2426l abstractC2426lAmazon9 = abstractC11918l9.loadAd.startapp(abstractC2426lLicense35).amazon(abstractC2426lLicense34).amazon(abstractC2426lStartapp30);
                        AbstractC2426l abstractC2426lPurchase7 = abstractC2426l30.purchase();
                        AbstractC2426l abstractC2426lAds9 = abstractC11918l9.loadAd.amazon(abstractC2426lPurchase7).startapp(abstractC2426lLicense35).amazon(abstractC2426lLicense34).ads(abstractC2426lAmazon9, abstractC2426lLicense33, abstractC2426lLicense35);
                        AbstractC2426l abstractC2426lStartapp31 = abstractC2426l28.startapp(abstractC2426lLicense35);
                        AbstractC2426l abstractC2426lLicense36 = abstractC2426lStartapp31.amazon(abstractC2426lAmazon9).license();
                        if (abstractC2426lLicense36.metrica()) {
                            return abstractC2426lAds9.metrica() ? c13683l.advert() : abstractC11918l9.remoteconfig();
                        }
                        if (abstractC2426lAds9.metrica()) {
                            return new C13683l(abstractC11918l9, abstractC2426lAds9, abstractC11918l9.crashlytics.Signature(), 8);
                        }
                        AbstractC2426l abstractC2426lStartapp32 = abstractC2426lAds9.license().startapp(abstractC2426lStartapp31);
                        AbstractC2426l abstractC2426lStartapp33 = abstractC2426lAds9.startapp(abstractC2426lLicense36).startapp(abstractC2426lLicense35);
                        return new C13683l(abstractC11918l9, abstractC2426lStartapp32, abstractC2426lAds9.amazon(abstractC2426lLicense36).license().ads(abstractC2426lAmazon9, abstractC2426lPurchase7, abstractC2426lStartapp33), new AbstractC2426l[]{abstractC2426lStartapp33}, 8);
                    }
                }
                return c13683l;
            case 9:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l31 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro9 = c13683l.isPro();
                        if (abstractC2426l31.metrica() || !abstractC2426lIsPro9.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l32 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l33 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense37 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense38 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense39 = abstractC2426l32.license();
                        AbstractC2426l abstractC2426lStartapp34 = abstractC2426l.startapp(abstractC2426l32);
                        AbstractC11918l abstractC11918l10 = this.yandex;
                        AbstractC2426l abstractC2426lAmazon10 = abstractC11918l10.loadAd.startapp(abstractC2426lLicense39).amazon(abstractC2426lLicense38).amazon(abstractC2426lStartapp34);
                        AbstractC2426l abstractC2426lPurchase8 = abstractC2426l33.purchase();
                        AbstractC2426l abstractC2426lAds10 = abstractC11918l10.loadAd.amazon(abstractC2426lPurchase8).startapp(abstractC2426lLicense39).amazon(abstractC2426lLicense38).ads(abstractC2426lAmazon10, abstractC2426lLicense37, abstractC2426lLicense39);
                        AbstractC2426l abstractC2426lStartapp35 = abstractC2426l31.startapp(abstractC2426lLicense39);
                        AbstractC2426l abstractC2426lLicense40 = abstractC2426lStartapp35.amazon(abstractC2426lAmazon10).license();
                        if (abstractC2426lLicense40.metrica()) {
                            return abstractC2426lAds10.metrica() ? c13683l.advert() : abstractC11918l10.remoteconfig();
                        }
                        if (abstractC2426lAds10.metrica()) {
                            return new C13683l(abstractC11918l10, abstractC2426lAds10, abstractC11918l10.crashlytics.Signature(), i4);
                        }
                        AbstractC2426l abstractC2426lStartapp36 = abstractC2426lAds10.license().startapp(abstractC2426lStartapp35);
                        AbstractC2426l abstractC2426lStartapp37 = abstractC2426lAds10.startapp(abstractC2426lLicense40).startapp(abstractC2426lLicense39);
                        return new C13683l(abstractC11918l10, abstractC2426lStartapp36, abstractC2426lAds10.amazon(abstractC2426lLicense40).license().ads(abstractC2426lAmazon10, abstractC2426lPurchase8, abstractC2426lStartapp37), new AbstractC2426l[]{abstractC2426lStartapp37}, 9);
                    }
                }
                return c13683l;
            case 10:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l34 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro10 = c13683l.isPro();
                        if (abstractC2426l34.metrica() || !abstractC2426lIsPro10.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l35 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l36 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense41 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense42 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense43 = abstractC2426l35.license();
                        AbstractC2426l abstractC2426lAmazon11 = abstractC2426lLicense42.amazon(abstractC2426l.startapp(abstractC2426l35));
                        AbstractC2426l abstractC2426lPurchase9 = abstractC2426l36.purchase();
                        AbstractC2426l abstractC2426lAds11 = abstractC2426lPurchase9.startapp(abstractC2426lLicense43).amazon(abstractC2426lLicense42).ads(abstractC2426lAmazon11, abstractC2426lLicense41, abstractC2426lLicense43);
                        AbstractC2426l abstractC2426lStartapp38 = abstractC2426l34.startapp(abstractC2426lLicense43);
                        AbstractC2426l abstractC2426lLicense44 = abstractC2426lStartapp38.amazon(abstractC2426lAmazon11).license();
                        boolean zMetrica5 = abstractC2426lLicense44.metrica();
                        AbstractC11918l abstractC11918l11 = this.yandex;
                        boolean zMetrica6 = abstractC2426lAds11.metrica();
                        if (zMetrica5) {
                            return zMetrica6 ? c13683l.advert() : abstractC11918l11.remoteconfig();
                        }
                        if (zMetrica6) {
                            return new C13683l(abstractC11918l11, abstractC2426lAds11, abstractC11918l11.crashlytics, 10);
                        }
                        AbstractC2426l abstractC2426lStartapp39 = abstractC2426lAds11.license().startapp(abstractC2426lStartapp38);
                        AbstractC2426l abstractC2426lStartapp40 = abstractC2426lAds11.startapp(abstractC2426lLicense44).startapp(abstractC2426lLicense43);
                        return new C13683l(abstractC11918l11, abstractC2426lStartapp39, abstractC2426lAds11.amazon(abstractC2426lLicense44).license().ads(abstractC2426lAmazon11, abstractC2426lPurchase9, abstractC2426lStartapp40), new AbstractC2426l[]{abstractC2426lStartapp40}, 10);
                    }
                }
                return c13683l;
            case 11:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l37 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro11 = c13683l.isPro();
                        if (abstractC2426l37.metrica() || !abstractC2426lIsPro11.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l38 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l39 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense45 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense46 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense47 = abstractC2426l38.license();
                        AbstractC2426l abstractC2426lAmazon12 = abstractC2426lLicense47.amazon(abstractC2426lLicense46).amazon(abstractC2426l.startapp(abstractC2426l38));
                        AbstractC2426l abstractC2426lAds12 = abstractC2426l39.startapp(abstractC2426lLicense47).amazon(abstractC2426lLicense46).ads(abstractC2426lAmazon12, abstractC2426lLicense45, abstractC2426lLicense47);
                        AbstractC2426l abstractC2426lStartapp41 = abstractC2426l37.startapp(abstractC2426lLicense47);
                        AbstractC2426l abstractC2426lLicense48 = abstractC2426lStartapp41.amazon(abstractC2426lAmazon12).license();
                        boolean zMetrica7 = abstractC2426lLicense48.metrica();
                        AbstractC11918l abstractC11918l12 = this.yandex;
                        boolean zMetrica8 = abstractC2426lAds12.metrica();
                        if (zMetrica7) {
                            return zMetrica8 ? c13683l.advert() : abstractC11918l12.remoteconfig();
                        }
                        if (zMetrica8) {
                            return new C13683l(abstractC11918l12, abstractC2426lAds12, abstractC11918l12.crashlytics.Signature(), 11);
                        }
                        AbstractC2426l abstractC2426lStartapp42 = abstractC2426lAds12.license().startapp(abstractC2426lStartapp41);
                        AbstractC2426l abstractC2426lStartapp43 = abstractC2426lAds12.startapp(abstractC2426lLicense48).startapp(abstractC2426lLicense47);
                        return new C13683l(abstractC11918l12, abstractC2426lStartapp42, abstractC2426lAds12.amazon(abstractC2426lLicense48).license().ads(abstractC2426lAmazon12, abstractC2426l39.purchase(), abstractC2426lStartapp43), new AbstractC2426l[]{abstractC2426lStartapp43}, 11);
                    }
                }
                return c13683l;
            case 12:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l40 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro12 = c13683l.isPro();
                        if (abstractC2426l40.metrica() || !abstractC2426lIsPro12.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l41 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l42 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense49 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense50 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense51 = abstractC2426l41.license();
                        AbstractC2426l abstractC2426lAmazon13 = abstractC2426lLicense50.amazon(abstractC2426l.startapp(abstractC2426l41));
                        AbstractC2426l abstractC2426lPurchase10 = abstractC2426l42.purchase();
                        AbstractC2426l abstractC2426lAds13 = abstractC2426lPurchase10.startapp(abstractC2426lLicense51).amazon(abstractC2426lLicense50).ads(abstractC2426lAmazon13, abstractC2426lLicense49, abstractC2426lLicense51);
                        AbstractC2426l abstractC2426lStartapp44 = abstractC2426l40.startapp(abstractC2426lLicense51);
                        AbstractC2426l abstractC2426lLicense52 = abstractC2426lStartapp44.amazon(abstractC2426lAmazon13).license();
                        boolean zMetrica9 = abstractC2426lLicense52.metrica();
                        AbstractC11918l abstractC11918l13 = this.yandex;
                        boolean zMetrica10 = abstractC2426lAds13.metrica();
                        if (zMetrica9) {
                            return zMetrica10 ? c13683l.advert() : abstractC11918l13.remoteconfig();
                        }
                        if (zMetrica10) {
                            return new C13683l(abstractC11918l13, abstractC2426lAds13, abstractC11918l13.crashlytics, 12);
                        }
                        AbstractC2426l abstractC2426lStartapp45 = abstractC2426lAds13.license().startapp(abstractC2426lStartapp44);
                        AbstractC2426l abstractC2426lStartapp46 = abstractC2426lAds13.startapp(abstractC2426lLicense52).startapp(abstractC2426lLicense51);
                        return new C13683l(abstractC11918l13, abstractC2426lStartapp45, abstractC2426lAds13.amazon(abstractC2426lLicense52).license().ads(abstractC2426lAmazon13, abstractC2426lPurchase10, abstractC2426lStartapp46), new AbstractC2426l[]{abstractC2426lStartapp46}, 12);
                    }
                }
                return c13683l;
            case 13:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l43 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro13 = c13683l.isPro();
                        if (abstractC2426l43.metrica() || !abstractC2426lIsPro13.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l44 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l45 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense53 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense54 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense55 = abstractC2426l44.license();
                        AbstractC2426l abstractC2426lAmazon14 = abstractC2426lLicense54.amazon(abstractC2426l.startapp(abstractC2426l44));
                        AbstractC2426l abstractC2426lPurchase11 = abstractC2426l45.purchase();
                        AbstractC2426l abstractC2426lAds14 = abstractC2426lPurchase11.startapp(abstractC2426lLicense55).amazon(abstractC2426lLicense54).ads(abstractC2426lAmazon14, abstractC2426lLicense53, abstractC2426lLicense55);
                        AbstractC2426l abstractC2426lStartapp47 = abstractC2426l43.startapp(abstractC2426lLicense55);
                        AbstractC2426l abstractC2426lLicense56 = abstractC2426lStartapp47.amazon(abstractC2426lAmazon14).license();
                        boolean zMetrica11 = abstractC2426lLicense56.metrica();
                        AbstractC11918l abstractC11918l14 = this.yandex;
                        boolean zMetrica12 = abstractC2426lAds14.metrica();
                        if (zMetrica11) {
                            return zMetrica12 ? c13683l.advert() : abstractC11918l14.remoteconfig();
                        }
                        if (zMetrica12) {
                            return new C13683l(abstractC11918l14, abstractC2426lAds14, abstractC11918l14.crashlytics, 13);
                        }
                        AbstractC2426l abstractC2426lStartapp48 = abstractC2426lAds14.license().startapp(abstractC2426lStartapp47);
                        AbstractC2426l abstractC2426lStartapp49 = abstractC2426lAds14.startapp(abstractC2426lLicense56).startapp(abstractC2426lLicense55);
                        return new C13683l(abstractC11918l14, abstractC2426lStartapp48, abstractC2426lAds14.amazon(abstractC2426lLicense56).license().ads(abstractC2426lAmazon14, abstractC2426lPurchase11, abstractC2426lStartapp49), new AbstractC2426l[]{abstractC2426lStartapp49}, 13);
                    }
                }
                return c13683l;
            case 14:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l46 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro14 = c13683l.isPro();
                        if (abstractC2426l46.metrica() || !abstractC2426lIsPro14.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l47 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l48 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense57 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense58 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense59 = abstractC2426l47.license();
                        AbstractC2426l abstractC2426lAmazon15 = abstractC2426lLicense59.amazon(abstractC2426lLicense58).amazon(abstractC2426l.startapp(abstractC2426l47));
                        AbstractC2426l abstractC2426lAds15 = abstractC2426l48.startapp(abstractC2426lLicense59).amazon(abstractC2426lLicense58).ads(abstractC2426lAmazon15, abstractC2426lLicense57, abstractC2426lLicense59);
                        AbstractC2426l abstractC2426lStartapp50 = abstractC2426l46.startapp(abstractC2426lLicense59);
                        AbstractC2426l abstractC2426lLicense60 = abstractC2426lStartapp50.amazon(abstractC2426lAmazon15).license();
                        boolean zMetrica13 = abstractC2426lLicense60.metrica();
                        AbstractC11918l abstractC11918l15 = this.yandex;
                        boolean zMetrica14 = abstractC2426lAds15.metrica();
                        if (zMetrica13) {
                            return zMetrica14 ? c13683l.advert() : abstractC11918l15.remoteconfig();
                        }
                        if (zMetrica14) {
                            return new C13683l(abstractC11918l15, abstractC2426lAds15, abstractC11918l15.crashlytics.Signature(), 14);
                        }
                        AbstractC2426l abstractC2426lStartapp51 = abstractC2426lAds15.license().startapp(abstractC2426lStartapp50);
                        AbstractC2426l abstractC2426lStartapp52 = abstractC2426lAds15.startapp(abstractC2426lLicense60).startapp(abstractC2426lLicense59);
                        return new C13683l(abstractC11918l15, abstractC2426lStartapp51, abstractC2426lAds15.amazon(abstractC2426lLicense60).license().ads(abstractC2426lAmazon15, abstractC2426l48.purchase(), abstractC2426lStartapp52), new AbstractC2426l[]{abstractC2426lStartapp52}, 14);
                    }
                }
                return c13683l;
            case 15:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l49 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro15 = c13683l.isPro();
                        if (abstractC2426l49.metrica() || !abstractC2426lIsPro15.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l50 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l51 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense61 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense62 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense63 = abstractC2426l50.license();
                        AbstractC2426l abstractC2426lAmazon16 = abstractC2426lLicense62.amazon(abstractC2426l.startapp(abstractC2426l50));
                        AbstractC2426l abstractC2426lPurchase12 = abstractC2426l51.purchase();
                        AbstractC2426l abstractC2426lAds16 = abstractC2426lPurchase12.startapp(abstractC2426lLicense63).amazon(abstractC2426lLicense62).ads(abstractC2426lAmazon16, abstractC2426lLicense61, abstractC2426lLicense63);
                        AbstractC2426l abstractC2426lStartapp53 = abstractC2426l49.startapp(abstractC2426lLicense63);
                        AbstractC2426l abstractC2426lLicense64 = abstractC2426lStartapp53.amazon(abstractC2426lAmazon16).license();
                        boolean zMetrica15 = abstractC2426lLicense64.metrica();
                        AbstractC11918l abstractC11918l16 = this.yandex;
                        boolean zMetrica16 = abstractC2426lAds16.metrica();
                        if (zMetrica15) {
                            return zMetrica16 ? c13683l.advert() : abstractC11918l16.remoteconfig();
                        }
                        if (zMetrica16) {
                            return new C13683l(abstractC11918l16, abstractC2426lAds16, abstractC11918l16.crashlytics, 15);
                        }
                        AbstractC2426l abstractC2426lStartapp54 = abstractC2426lAds16.license().startapp(abstractC2426lStartapp53);
                        AbstractC2426l abstractC2426lStartapp55 = abstractC2426lAds16.startapp(abstractC2426lLicense64).startapp(abstractC2426lLicense63);
                        return new C13683l(abstractC11918l16, abstractC2426lStartapp54, abstractC2426lAds16.amazon(abstractC2426lLicense64).license().ads(abstractC2426lAmazon16, abstractC2426lPurchase12, abstractC2426lStartapp55), new AbstractC2426l[]{abstractC2426lStartapp55}, 15);
                    }
                }
                return c13683l;
            case 16:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l52 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro16 = c13683l.isPro();
                        if (abstractC2426l52.metrica() || !abstractC2426lIsPro16.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l53 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l54 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense65 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense66 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense67 = abstractC2426l53.license();
                        AbstractC2426l abstractC2426lAmazon17 = abstractC2426lLicense67.amazon(abstractC2426lLicense66).amazon(abstractC2426l.startapp(abstractC2426l53));
                        AbstractC2426l abstractC2426lAds17 = abstractC2426l54.startapp(abstractC2426lLicense67).amazon(abstractC2426lLicense66).ads(abstractC2426lAmazon17, abstractC2426lLicense65, abstractC2426lLicense67);
                        AbstractC2426l abstractC2426lStartapp56 = abstractC2426l52.startapp(abstractC2426lLicense67);
                        AbstractC2426l abstractC2426lLicense68 = abstractC2426lStartapp56.amazon(abstractC2426lAmazon17).license();
                        boolean zMetrica17 = abstractC2426lLicense68.metrica();
                        AbstractC11918l abstractC11918l17 = this.yandex;
                        boolean zMetrica18 = abstractC2426lAds17.metrica();
                        if (zMetrica17) {
                            return zMetrica18 ? c13683l.advert() : abstractC11918l17.remoteconfig();
                        }
                        if (zMetrica18) {
                            return new C13683l(abstractC11918l17, abstractC2426lAds17, abstractC11918l17.crashlytics.Signature(), 16);
                        }
                        AbstractC2426l abstractC2426lStartapp57 = abstractC2426lAds17.license().startapp(abstractC2426lStartapp56);
                        AbstractC2426l abstractC2426lStartapp58 = abstractC2426lAds17.startapp(abstractC2426lLicense68).startapp(abstractC2426lLicense67);
                        return new C13683l(abstractC11918l17, abstractC2426lStartapp57, abstractC2426lAds17.amazon(abstractC2426lLicense68).license().ads(abstractC2426lAmazon17, abstractC2426l54.purchase(), abstractC2426lStartapp58), new AbstractC2426l[]{abstractC2426lStartapp58}, 16);
                    }
                }
                return c13683l;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    if (!abstractC2426l2.metrica()) {
                        AbstractC2426l abstractC2426l55 = c13683l.loadAd;
                        AbstractC2426l abstractC2426lIsPro17 = c13683l.isPro();
                        if (abstractC2426l55.metrica() || !abstractC2426lIsPro17.vip()) {
                            return advert().yandex(c13683l);
                        }
                        AbstractC2426l abstractC2426l56 = abstractC2426lArr[0];
                        AbstractC2426l abstractC2426l57 = c13683l.crashlytics;
                        AbstractC2426l abstractC2426lLicense69 = abstractC2426l2.license();
                        AbstractC2426l abstractC2426lLicense70 = abstractC2426l.license();
                        AbstractC2426l abstractC2426lLicense71 = abstractC2426l56.license();
                        AbstractC2426l abstractC2426lAmazon18 = abstractC2426lLicense70.amazon(abstractC2426l.startapp(abstractC2426l56));
                        AbstractC2426l abstractC2426lPurchase13 = abstractC2426l57.purchase();
                        AbstractC2426l abstractC2426lAds18 = abstractC2426lPurchase13.startapp(abstractC2426lLicense71).amazon(abstractC2426lLicense70).ads(abstractC2426lAmazon18, abstractC2426lLicense69, abstractC2426lLicense71);
                        AbstractC2426l abstractC2426lStartapp59 = abstractC2426l55.startapp(abstractC2426lLicense71);
                        AbstractC2426l abstractC2426lLicense72 = abstractC2426lStartapp59.amazon(abstractC2426lAmazon18).license();
                        boolean zMetrica19 = abstractC2426lLicense72.metrica();
                        AbstractC11918l abstractC11918l18 = this.yandex;
                        boolean zMetrica20 = abstractC2426lAds18.metrica();
                        if (zMetrica19) {
                            return zMetrica20 ? c13683l.advert() : abstractC11918l18.remoteconfig();
                        }
                        if (zMetrica20) {
                            return new C13683l(abstractC11918l18, abstractC2426lAds18, abstractC11918l18.crashlytics, 17);
                        }
                        AbstractC2426l abstractC2426lStartapp60 = abstractC2426lAds18.license().startapp(abstractC2426lStartapp59);
                        AbstractC2426l abstractC2426lStartapp61 = abstractC2426lAds18.startapp(abstractC2426lLicense72).startapp(abstractC2426lLicense71);
                        return new C13683l(abstractC11918l18, abstractC2426lStartapp60, abstractC2426lAds18.amazon(abstractC2426lLicense72).license().ads(abstractC2426lAmazon18, abstractC2426lPurchase13, abstractC2426lStartapp61), new AbstractC2426l[]{abstractC2426lStartapp61}, 17);
                    }
                }
                return c13683l;
            default:
                if (!smaato()) {
                    if (c13683l.smaato()) {
                        return advert();
                    }
                    C10957l c10957l = (C10957l) abstractC2426l2;
                    if (!AbstractC17742l.amazon(c10957l.f22089l)) {
                        C10957l c10957l2 = (C10957l) c13683l.loadAd;
                        C10957l c10957l3 = (C10957l) c13683l.isPro();
                        if (AbstractC17742l.amazon(c10957l2.f22089l) || !c10957l3.vip()) {
                            return advert().yandex(c13683l);
                        }
                        C10957l c10957l4 = (C10957l) abstractC2426l;
                        C10957l c10957l5 = (C10957l) abstractC2426lArr[0];
                        C10957l c10957l6 = (C10957l) c13683l.crashlytics;
                        long[] jArr = new long[9];
                        long[] jArr2 = new long[9];
                        long[] jArr3 = new long[9];
                        long[] jArr4 = new long[9];
                        AbstractC10774l.license(c10957l.f22089l, jArr);
                        AbstractC10774l.license(c10957l4.f22089l, jArr2);
                        AbstractC10774l.license(c10957l5.f22089l, jArr3);
                        AbstractC10774l.vip(c10957l4.f22089l, c10957l5.f22089l, jArr4);
                        AbstractC10774l.crashlytics(jArr3, jArr2, jArr4);
                        long[] jArrSubscription = AbstractC10774l.subscription(jArr3);
                        AbstractC10774l.adcel(c10957l6.f22089l, jArrSubscription, jArr3);
                        AbstractC10774l.yandex(jArr3, jArr2, jArr3);
                        int i7 = 18;
                        long[] jArr5 = new long[18];
                        AbstractC10774l.startapp(jArr3, jArr4, jArr5);
                        long[] jArr6 = new long[18];
                        AbstractC10774l.isPro(jArr, jArrSubscription, jArr6);
                        AbstractC10774l.amazon(jArr5, jArr6, jArr5);
                        AbstractC10774l.tapsense(jArr5, jArr3);
                        AbstractC10774l.adcel(c10957l2.f22089l, jArrSubscription, jArr);
                        AbstractC10774l.yandex(jArr, jArr4, jArr2);
                        AbstractC10774l.license(jArr2, jArr2);
                        boolean zAmazon = AbstractC17742l.amazon(jArr2);
                        AbstractC11918l abstractC11918l19 = this.yandex;
                        if (zAmazon) {
                            return AbstractC17742l.amazon(jArr3) ? c13683l.advert() : abstractC11918l19.remoteconfig();
                        }
                        if (!AbstractC17742l.amazon(jArr3)) {
                            C10957l c10957l7 = new C10957l(i3);
                            long[] jArr7 = new long[9];
                            c10957l7.f22089l = jArr7;
                            AbstractC10774l.license(jArr3, jArr7);
                            AbstractC10774l.vip(jArr7, jArr, jArr7);
                            C10957l c10957l8 = new C10957l(jArr);
                            AbstractC10774l.vip(jArr3, jArr2, jArr);
                            AbstractC10774l.adcel(jArr, jArrSubscription, jArr);
                            C10957l c10957l9 = new C10957l(jArr2);
                            AbstractC10774l.yandex(jArr3, jArr2, jArr2);
                            AbstractC10774l.license(jArr2, jArr2);
                            for (int i8 = 0; i8 < 18; i8++) {
                                jArr5[i8] = 0;
                            }
                            AbstractC10774l.startapp(c10957l9.f22089l, jArr4, jArr5);
                            long[] jArr8 = c10957l6.f22089l;
                            jArr4[0] = jArr8[0] ^ 1;
                            for (int i9 = 1; i9 < 9; i9++) {
                                jArr4[i9] = jArr8[i9];
                            }
                            AbstractC10774l.startapp(jArr4, c10957l8.f22089l, jArr5);
                            AbstractC10774l.tapsense(jArr5, c10957l9.f22089l);
                            return new C13683l(abstractC11918l19, c10957l7, c10957l9, new AbstractC2426l[]{c10957l8}, 18);
                        }
                        c13683l = new C13683l(abstractC11918l19, new C10957l(jArr3), C9949l.remoteconfig, i7);
                    }
                }
                return c13683l;
        }
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l license(AbstractC8859l abstractC8859l) {
        return abstractC8859l.smaato() ? this : yandex(abstractC8859l.metrica());
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l metrica() {
        C13683l c13683l;
        int i = this.mopub;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l = this.crashlytics;
        int i2 = 0;
        switch (i) {
            case 0:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l2 = this.loadAd;
                if (abstractC2426l2.metrica()) {
                    return this;
                }
                int iMopub = mopub();
                AbstractC11918l abstractC11918l = this.yandex;
                if (iMopub == 0) {
                    return new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l.amazon(abstractC2426l2), i2);
                }
                if (iMopub == 1) {
                    c13683l = new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l.amazon(abstractC2426l2), new AbstractC2426l[]{abstractC2426lArr[0]}, 0);
                } else {
                    if (iMopub == 5) {
                        return new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l.purchase(), i2);
                    }
                    if (iMopub != 6) {
                        C8339l.smaato("unsupported coordinate system");
                        return null;
                    }
                    AbstractC2426l abstractC2426l3 = abstractC2426lArr[0];
                    c13683l = new C13683l(abstractC11918l, abstractC2426l2, abstractC2426l.amazon(abstractC2426l3), new AbstractC2426l[]{abstractC2426l3}, 0);
                }
                return c13683l;
            case 1:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l4 = this.loadAd;
                if (abstractC2426l4.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l5 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l4, abstractC2426l.amazon(abstractC2426l5), new AbstractC2426l[]{abstractC2426l5}, 1);
            case 2:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l6 = this.loadAd;
                if (abstractC2426l6.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l7 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l6, abstractC2426l.amazon(abstractC2426l7), new AbstractC2426l[]{abstractC2426l7}, 2);
            case 3:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l8 = this.loadAd;
                if (abstractC2426l8.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l9 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l8, abstractC2426l.amazon(abstractC2426l9), new AbstractC2426l[]{abstractC2426l9}, 3);
            case 4:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l10 = this.loadAd;
                if (abstractC2426l10.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l11 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l10, abstractC2426l.amazon(abstractC2426l11), new AbstractC2426l[]{abstractC2426l11}, 4);
            case 5:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l12 = this.loadAd;
                if (abstractC2426l12.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l13 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l12, abstractC2426l.amazon(abstractC2426l13), new AbstractC2426l[]{abstractC2426l13}, 5);
            case 6:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l14 = this.loadAd;
                if (abstractC2426l14.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l15 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l14, abstractC2426l.amazon(abstractC2426l15), new AbstractC2426l[]{abstractC2426l15}, 6);
            case 7:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l16 = this.loadAd;
                if (abstractC2426l16.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l17 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l16, abstractC2426l.amazon(abstractC2426l17), new AbstractC2426l[]{abstractC2426l17}, 7);
            case 8:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l18 = this.loadAd;
                if (abstractC2426l18.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l19 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l18, abstractC2426l.amazon(abstractC2426l19), new AbstractC2426l[]{abstractC2426l19}, 8);
            case 9:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l20 = this.loadAd;
                if (abstractC2426l20.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l21 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l20, abstractC2426l.amazon(abstractC2426l21), new AbstractC2426l[]{abstractC2426l21}, 9);
            case 10:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l22 = this.loadAd;
                if (abstractC2426l22.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l23 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l22, abstractC2426l.amazon(abstractC2426l23), new AbstractC2426l[]{abstractC2426l23}, 10);
            case 11:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l24 = this.loadAd;
                if (abstractC2426l24.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l25 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l24, abstractC2426l.amazon(abstractC2426l25), new AbstractC2426l[]{abstractC2426l25}, 11);
            case 12:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l26 = this.loadAd;
                if (abstractC2426l26.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l27 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l26, abstractC2426l.amazon(abstractC2426l27), new AbstractC2426l[]{abstractC2426l27}, 12);
            case 13:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l28 = this.loadAd;
                if (abstractC2426l28.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l29 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l28, abstractC2426l.amazon(abstractC2426l29), new AbstractC2426l[]{abstractC2426l29}, 13);
            case 14:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l30 = this.loadAd;
                if (abstractC2426l30.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l31 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l30, abstractC2426l.amazon(abstractC2426l31), new AbstractC2426l[]{abstractC2426l31}, 14);
            case 15:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l32 = this.loadAd;
                if (abstractC2426l32.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l33 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l32, abstractC2426l.amazon(abstractC2426l33), new AbstractC2426l[]{abstractC2426l33}, 15);
            case 16:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l34 = this.loadAd;
                if (abstractC2426l34.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l35 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l34, abstractC2426l.amazon(abstractC2426l35), new AbstractC2426l[]{abstractC2426l35}, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l36 = this.loadAd;
                if (abstractC2426l36.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l37 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l36, abstractC2426l.amazon(abstractC2426l37), new AbstractC2426l[]{abstractC2426l37}, 17);
            default:
                if (smaato()) {
                    return this;
                }
                AbstractC2426l abstractC2426l38 = this.loadAd;
                if (abstractC2426l38.metrica()) {
                    return this;
                }
                AbstractC2426l abstractC2426l39 = abstractC2426lArr[0];
                return new C13683l(this.yandex, abstractC2426l38, abstractC2426l.amazon(abstractC2426l39), new AbstractC2426l[]{abstractC2426l39}, 18);
        }
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC2426l subs() {
        int i = this.mopub;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l = this.crashlytics;
        AbstractC2426l abstractC2426l2 = this.loadAd;
        switch (i) {
            case 0:
                int iMopub = mopub();
                if ((iMopub != 5 && iMopub != 6) || smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                if (6 != iMopub) {
                    return abstractC2426lStartapp;
                }
                AbstractC2426l abstractC2426l3 = abstractC2426lArr[0];
                return !abstractC2426l3.vip() ? abstractC2426lStartapp.admob(abstractC2426l3) : abstractC2426lStartapp;
            case 1:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp2 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l4 = abstractC2426lArr[0];
                return !abstractC2426l4.vip() ? abstractC2426lStartapp2.admob(abstractC2426l4) : abstractC2426lStartapp2;
            case 2:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp3 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l5 = abstractC2426lArr[0];
                return !abstractC2426l5.vip() ? abstractC2426lStartapp3.admob(abstractC2426l5) : abstractC2426lStartapp3;
            case 3:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp4 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l6 = abstractC2426lArr[0];
                return !abstractC2426l6.vip() ? abstractC2426lStartapp4.admob(abstractC2426l6) : abstractC2426lStartapp4;
            case 4:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp5 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l7 = abstractC2426lArr[0];
                return !abstractC2426l7.vip() ? abstractC2426lStartapp5.admob(abstractC2426l7) : abstractC2426lStartapp5;
            case 5:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp6 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l8 = abstractC2426lArr[0];
                return !abstractC2426l8.vip() ? abstractC2426lStartapp6.admob(abstractC2426l8) : abstractC2426lStartapp6;
            case 6:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp7 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l9 = abstractC2426lArr[0];
                return !abstractC2426l9.vip() ? abstractC2426lStartapp7.admob(abstractC2426l9) : abstractC2426lStartapp7;
            case 7:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp8 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l10 = abstractC2426lArr[0];
                return !abstractC2426l10.vip() ? abstractC2426lStartapp8.admob(abstractC2426l10) : abstractC2426lStartapp8;
            case 8:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp9 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l11 = abstractC2426lArr[0];
                return !abstractC2426l11.vip() ? abstractC2426lStartapp9.admob(abstractC2426l11) : abstractC2426lStartapp9;
            case 9:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp10 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l12 = abstractC2426lArr[0];
                return !abstractC2426l12.vip() ? abstractC2426lStartapp10.admob(abstractC2426l12) : abstractC2426lStartapp10;
            case 10:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp11 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l13 = abstractC2426lArr[0];
                return !abstractC2426l13.vip() ? abstractC2426lStartapp11.admob(abstractC2426l13) : abstractC2426lStartapp11;
            case 11:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp12 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l14 = abstractC2426lArr[0];
                return !abstractC2426l14.vip() ? abstractC2426lStartapp12.admob(abstractC2426l14) : abstractC2426lStartapp12;
            case 12:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp13 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l15 = abstractC2426lArr[0];
                return !abstractC2426l15.vip() ? abstractC2426lStartapp13.admob(abstractC2426l15) : abstractC2426lStartapp13;
            case 13:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp14 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l16 = abstractC2426lArr[0];
                return !abstractC2426l16.vip() ? abstractC2426lStartapp14.admob(abstractC2426l16) : abstractC2426lStartapp14;
            case 14:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp15 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l17 = abstractC2426lArr[0];
                return !abstractC2426l17.vip() ? abstractC2426lStartapp15.admob(abstractC2426l17) : abstractC2426lStartapp15;
            case 15:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp16 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l18 = abstractC2426lArr[0];
                return !abstractC2426l18.vip() ? abstractC2426lStartapp16.admob(abstractC2426l18) : abstractC2426lStartapp16;
            case 16:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp17 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l19 = abstractC2426lArr[0];
                return !abstractC2426l19.vip() ? abstractC2426lStartapp17.admob(abstractC2426l19) : abstractC2426lStartapp17;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp18 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l20 = abstractC2426lArr[0];
                return !abstractC2426l20.vip() ? abstractC2426lStartapp18.admob(abstractC2426l20) : abstractC2426lStartapp18;
            default:
                if (smaato() || abstractC2426l2.metrica()) {
                    return abstractC2426l;
                }
                AbstractC2426l abstractC2426lStartapp19 = abstractC2426l.amazon(abstractC2426l2).startapp(abstractC2426l2);
                AbstractC2426l abstractC2426l21 = abstractC2426lArr[0];
                return !abstractC2426l21.vip() ? abstractC2426lStartapp19.admob(abstractC2426l21) : abstractC2426lStartapp19;
        }
    }

    @Override // defpackage.AbstractC8859l
    public final boolean subscription() {
        AbstractC11918l abstractC11918l = this.yandex;
        BigInteger bigInteger = abstractC11918l.purchase;
        if (InterfaceC11695l.adcel.equals(bigInteger)) {
            AbstractC8859l abstractC8859lStartapp = startapp();
            abstractC8859lStartapp.loadAd();
            return ((AbstractC13869l) abstractC8859lStartapp.loadAd).appmetrica() != 0;
        }
        if (!InterfaceC11695l.subscription.equals(bigInteger)) {
            return super.subscription();
        }
        AbstractC8859l abstractC8859lStartapp2 = startapp();
        abstractC8859lStartapp2.loadAd();
        AbstractC2426l abstractC2426l = abstractC8859lStartapp2.loadAd;
        AbstractC2426l abstractC2426lLicense = ((AbstractC7399l) abstractC11918l).license(abstractC2426l.amazon(abstractC11918l.loadAd));
        if (abstractC2426lLicense == null) {
            return false;
        }
        return ((AbstractC13869l) abstractC2426l.startapp(abstractC2426lLicense).amazon(abstractC8859lStartapp2.purchase())).appmetrica() == 0;
    }

    @Override // defpackage.AbstractC8859l
    public final AbstractC8859l tapsense(AbstractC2426l abstractC2426l) {
        if (smaato()) {
            return this;
        }
        int iMopub = mopub();
        AbstractC11918l abstractC11918l = this.yandex;
        AbstractC2426l[] abstractC2426lArr = this.amazon;
        AbstractC2426l abstractC2426l2 = this.crashlytics;
        AbstractC2426l abstractC2426l3 = this.loadAd;
        if (iMopub == 5) {
            return abstractC11918l.billing(abstractC2426l3, abstractC2426l2.amazon(abstractC2426l3).admob(abstractC2426l).amazon(abstractC2426l3.startapp(abstractC2426l)), abstractC2426lArr);
        }
        if (iMopub != 6) {
            return super.tapsense(abstractC2426l);
        }
        AbstractC2426l abstractC2426l4 = abstractC2426lArr[0];
        AbstractC2426l abstractC2426lStartapp = abstractC2426l3.startapp(abstractC2426l.license());
        return abstractC11918l.billing(abstractC2426lStartapp, abstractC2426l2.amazon(abstractC2426l3).amazon(abstractC2426lStartapp), new AbstractC2426l[]{abstractC2426l4.startapp(abstractC2426l)});
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C13683l m3654throws(int i) {
        if (smaato()) {
            return this;
        }
        AbstractC11918l abstractC11918l = this.yandex;
        int i2 = abstractC11918l.billing;
        AbstractC2426l abstractC2426l = this.crashlytics;
        AbstractC2426l abstractC2426l2 = this.loadAd;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 5) {
                    if (i2 != 6) {
                        C8339l.smaato("unsupported coordinate system");
                        return null;
                    }
                }
            }
            return (C13683l) abstractC11918l.billing(abstractC2426l2.ad(i), abstractC2426l.ad(i), new AbstractC2426l[]{this.amazon[0].ad(i)});
        }
        return (C13683l) abstractC11918l.purchase(abstractC2426l2.ad(i), abstractC2426l.ad(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:621:0x0f27, code lost:
    
        if (r6.metrica() != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x1019, code lost:
    
        if (r4.metrica() != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x1078, code lost:
    
        if (r2.metrica() != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:?, code lost:
    
        return advert();
     */
    @Override // defpackage.AbstractC8859l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8859l yandex(defpackage.AbstractC8859l r20) {
        /*
            Method dump skipped, instruction units count: 4298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13683l.yandex(lٌ٘۠):lٌ٘۠");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13683l(AbstractC11918l abstractC11918l, AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr, int i) {
        super(abstractC11918l, abstractC2426l, abstractC2426l2, abstractC2426lArr);
        this.mopub = i;
    }
}
