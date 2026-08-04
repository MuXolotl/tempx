package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12811l {
    public static final C9138l[] yandex = {new C9138l(-1, 1, "usage_and_diagnostics_listener", true), new C9138l(-1, 1, "usage_and_diagnostics_consents", true), new C9138l(-1, 1, "usage_and_diagnostics_check_consents", true), new C9138l(-1, 1, "usage_and_diagnostics_settings_access", true), new C9138l(-1, 1, "el_capitan", false)};

    public static final void amazon(C14734l c14734l, InterfaceC1555l interfaceC1555l, Function1 function1, float f) {
        float fYandex;
        try {
            fYandex = interfaceC1555l.yandex(f);
        } catch (CancellationException unused) {
            c14734l.yandex();
            fYandex = 0.0f;
        }
        function1.invoke(Float.valueOf(fYandex));
        if (Math.abs(f - fYandex) > 0.5f) {
            c14734l.yandex();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object crashlytics(InterfaceC1555l interfaceC1555l, float f, float f2, C6570l c6570l, InterfaceC1489l interfaceC1489l, Function1 function1, AbstractC0283l abstractC0283l) {
        C2527l c2527l;
        float fFloatValue;
        C6570l c6570l2;
        C13250l c13250l;
        float f3 = f;
        if (abstractC0283l instanceof C2527l) {
            c2527l = (C2527l) abstractC0283l;
            int i = c2527l.f5507l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2527l.f5507l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2527l = new C2527l(abstractC0283l);
            }
        } else {
            c2527l = new C2527l(abstractC0283l);
        }
        C2527l c2527l2 = c2527l;
        Object obj = c2527l2.f5504l;
        int i2 = c2527l2.f5507l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C13250l c13250l2 = new C13250l();
            fFloatValue = ((Number) c6570l.crashlytics()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) c6570l.crashlytics()).floatValue() == 0.0f;
            C6614l c6614l = new C6614l(f2, c13250l2, interfaceC1555l, function1, 1);
            c2527l2.f5508l = c6570l;
            c2527l2.f5503l = c13250l2;
            c2527l2.f5506l = f3;
            c2527l2.f5505l = fFloatValue;
            c2527l2.f5507l = 1;
            Object objBilling = AbstractC18719l.billing(c6570l, f4, interfaceC1489l, !z, c6614l, c2527l2);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
            c6570l2 = c6570l;
            c13250l = c13250l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = c2527l2.f5505l;
            float f6 = c2527l2.f5506l;
            c13250l = c2527l2.f5503l;
            c6570l2 = c2527l2.f5508l;
            AbstractC2829l.crashlytics(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new C16483l(new Float(f3 - c13250l.f26029l), AbstractC15042l.metrica(c6570l2, 0.0f, purchase(((Number) c6570l2.crashlytics()).floatValue(), fFloatValue), 29));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(InterfaceC1555l interfaceC1555l, float f, C6570l c6570l, C17308l c17308l, Function1 function1, AbstractC0283l abstractC0283l) {
        C6058l c6058l;
        float f2;
        C13250l c13250l;
        if (abstractC0283l instanceof C6058l) {
            c6058l = (C6058l) abstractC0283l;
            int i = c6058l.f12830l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6058l.f12830l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6058l = new C6058l(abstractC0283l);
            }
        } else {
            c6058l = new C6058l(abstractC0283l);
        }
        Object obj = c6058l.f12829l;
        int i2 = c6058l.f12830l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C13250l c13250l2 = new C13250l();
            boolean z = ((Number) c6570l.crashlytics()).floatValue() == 0.0f;
            C6614l c6614l = new C6614l(f, c13250l2, interfaceC1555l, function1, 0);
            c6058l.f12831l = c6570l;
            c6058l.f12833l = c13250l2;
            c6058l.f12832l = f;
            c6058l.f12830l = 1;
            Object objPurchase = AbstractC18719l.purchase(c6570l, c17308l, !z, c6614l, c6058l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPurchase == enumC9342l) {
                return enumC9342l;
            }
            f2 = f;
            c13250l = c13250l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = c6058l.f12832l;
            c13250l = c6058l.f12833l;
            c6570l = c6058l.f12831l;
            AbstractC2829l.crashlytics(obj);
        }
        return new C16483l(new Float(f2 - c13250l.f26029l), c6570l);
    }

    public static final float purchase(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x018f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0352  */
    /* JADX WARN: Code duplicated, block: B:42:0x039e  */
    /* JADX WARN: Code duplicated, block: B:45:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void yandex(C10936l c10936l, C0260l c0260l, C9472l c9472l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        C9472l c9472l2;
        int i4;
        boolean z;
        C15578l c15578l2;
        C0260l c0260l2;
        C9472l c9472l3;
        C4224l c4224lAds;
        Object objM2132native;
        C13863l c13863l;
        char c;
        char c2;
        long jMopub;
        boolean zPurchase;
        Object objM2132native2;
        c6956l.m2133new(383110729);
        if ((i & 6) == 0) {
            i3 = i | (c6956l.billing(c10936l) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | 16;
        if ((i2 & 4) == 0) {
            c9472l2 = c9472l;
            int i6 = c6956l.billing(c9472l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            i4 = i5 | i6;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    c0260l2 = (C0260l) c6956l.isPro(AbstractC14696l.yandex);
                    if ((i2 & 4) != 0) {
                        c9472l2 = (C9472l) c6956l.isPro(AbstractC3459l.yandex);
                    }
                } else {
                    c6956l.m2124else();
                    c0260l2 = c0260l;
                }
                c6956l.adcel();
                objM2132native = c6956l.m2132native();
                c13863l = C1867l.yandex;
                if (objM2132native == c13863l) {
                    c = 0;
                    c2 = 2;
                    C10936l c10936l2 = new C10936l(c10936l.mopub(), ((C9735l) c10936l.loadAd.getValue()).yandex, ((C9735l) c10936l.crashlytics.getValue()).yandex, ((C9735l) c10936l.amazon.getValue()).yandex, ((C9735l) c10936l.purchase.getValue()).yandex, ((C9735l) c10936l.billing.getValue()).yandex, ((C9735l) c10936l.mopub.getValue()).yandex, c10936l.admob(), ((C9735l) c10936l.subs.getValue()).yandex, ((C9735l) c10936l.isPro.getValue()).yandex, ((C9735l) c10936l.firebase.getValue()).yandex, ((C9735l) c10936l.smaato.getValue()).yandex, ((C9735l) c10936l.remoteconfig.getValue()).yandex, ((C9735l) c10936l.vip.getValue()).yandex, ((C9735l) c10936l.metrica.getValue()).yandex, c10936l.subs(), c10936l.purchase(), c10936l.isPro(), c10936l.billing(), ((C9735l) c10936l.tapsense.getValue()).yandex, c10936l.amazon(), c10936l.crashlytics(), ((C9735l) c10936l.pro.getValue()).yandex, ((C9735l) c10936l.ad.getValue()).yandex, ((C9735l) c10936l.advert.getValue()).yandex, ((C9735l) c10936l.isVip.getValue()).yandex, c10936l.yandex(), c10936l.loadAd(), ((C9735l) c10936l.applovin.getValue()).yandex);
                    c6956l.m2147try(c10936l2);
                    objM2132native = c10936l2;
                } else {
                    c = 0;
                    c2 = 2;
                }
                C10936l c10936l3 = (C10936l) objM2132native;
                C10707l c10707l = AbstractC10689l.yandex;
                AbstractC1757l.m1041throw(c10936l.mopub(), c10936l3.yandex);
                AbstractC1757l.m1041throw(((C9735l) c10936l.loadAd.getValue()).yandex, c10936l3.loadAd);
                AbstractC1757l.m1041throw(((C9735l) c10936l.crashlytics.getValue()).yandex, c10936l3.crashlytics);
                AbstractC1757l.m1041throw(((C9735l) c10936l.amazon.getValue()).yandex, c10936l3.amazon);
                AbstractC1757l.m1041throw(((C9735l) c10936l.purchase.getValue()).yandex, c10936l3.purchase);
                AbstractC1757l.m1041throw(((C9735l) c10936l.billing.getValue()).yandex, c10936l3.billing);
                c10936l3.mopub.setValue(new C9735l(((C9735l) c10936l.mopub.getValue()).yandex));
                AbstractC1757l.m1041throw(c10936l.admob(), c10936l3.admob);
                AbstractC1757l.m1041throw(((C9735l) c10936l.subs.getValue()).yandex, c10936l3.subs);
                AbstractC1757l.m1041throw(((C9735l) c10936l.isPro.getValue()).yandex, c10936l3.isPro);
                AbstractC1757l.m1041throw(((C9735l) c10936l.firebase.getValue()).yandex, c10936l3.firebase);
                AbstractC1757l.m1041throw(((C9735l) c10936l.smaato.getValue()).yandex, c10936l3.smaato);
                AbstractC1757l.m1041throw(((C9735l) c10936l.remoteconfig.getValue()).yandex, c10936l3.remoteconfig);
                AbstractC1757l.m1041throw(((C9735l) c10936l.vip.getValue()).yandex, c10936l3.vip);
                c10936l3.metrica.setValue(new C9735l(((C9735l) c10936l.metrica.getValue()).yandex));
                c10936l3.startapp.setValue(new C9735l(c10936l.subs()));
                c10936l3.adcel.setValue(new C9735l(c10936l.purchase()));
                c10936l3.ads.setValue(new C9735l(c10936l.isPro()));
                AbstractC1757l.m1041throw(c10936l.billing(), c10936l3.subscription);
                c10936l3.tapsense.setValue(new C9735l(((C9735l) c10936l.tapsense.getValue()).yandex));
                c10936l3.Signature.setValue(new C9735l(c10936l.amazon()));
                AbstractC1757l.m1041throw(c10936l.crashlytics(), c10936l3.license);
                AbstractC1757l.m1041throw(((C9735l) c10936l.pro.getValue()).yandex, c10936l3.pro);
                AbstractC1757l.m1041throw(((C9735l) c10936l.ad.getValue()).yandex, c10936l3.ad);
                AbstractC1757l.m1041throw(((C9735l) c10936l.advert.getValue()).yandex, c10936l3.advert);
                c10936l3.isVip.setValue(new C9735l(((C9735l) c10936l.isVip.getValue()).yandex));
                c10936l3.signatures.setValue(new C9735l(c10936l.yandex()));
                AbstractC1757l.m1041throw(c10936l.loadAd(), c10936l3.premium);
                c10936l3.applovin.setValue(new C9735l(((C9735l) c10936l.applovin.getValue()).yandex));
                jMopub = c10936l3.mopub();
                zPurchase = c6956l.purchase(jMopub);
                objM2132native2 = c6956l.m2132native();
                if (zPurchase || objM2132native2 == c13863l) {
                    objM2132native2 = new C8620l(jMopub, C9735l.loadAd(0.4f, jMopub));
                    c6956l.m2147try(objM2132native2);
                }
                C10092l c10092lYandex = AbstractC10689l.yandex.yandex(c10936l3);
                C10092l c10092lYandex2 = AbstractC14696l.yandex.yandex(c0260l2);
                C10092l c10092lYandex3 = AbstractC4524l.yandex.yandex((C8620l) objM2132native2);
                C10092l c10092lYandex4 = AbstractC3459l.yandex.yandex(c9472l2);
                C10092l[] c10092lArr = new C10092l[4];
                c10092lArr[c] = c10092lYandex;
                c10092lArr[1] = c10092lYandex2;
                c10092lArr[c2] = c10092lYandex3;
                c10092lArr[3] = c10092lYandex4;
                c15578l2 = c15578l;
                AbstractC10478l.loadAd(c10092lArr, AbstractC14566l.amazon(1230193033, new C14601l(c9472l2, c15578l2, 27), c6956l), c6956l, 56);
            } else {
                c15578l2 = c15578l;
                c6956l.m2124else();
                c0260l2 = c0260l;
            }
            c9472l3 = c9472l2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C10515l(c10936l, c0260l2, c9472l3, c15578l2, i, i2);
            }
        }
        c9472l2 = c9472l;
        i4 = i5 | i6;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i4 & 1, z)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                c0260l2 = (C0260l) c6956l.isPro(AbstractC14696l.yandex);
                if ((i2 & 4) != 0) {
                    c9472l2 = (C9472l) c6956l.isPro(AbstractC3459l.yandex);
                }
            } else {
                c0260l2 = (C0260l) c6956l.isPro(AbstractC14696l.yandex);
                if ((i2 & 4) != 0) {
                    c9472l2 = (C9472l) c6956l.isPro(AbstractC3459l.yandex);
                }
            }
            c6956l.adcel();
            objM2132native = c6956l.m2132native();
            c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                c = 0;
                c2 = 2;
                C10936l c10936l4 = new C10936l(c10936l.mopub(), ((C9735l) c10936l.loadAd.getValue()).yandex, ((C9735l) c10936l.crashlytics.getValue()).yandex, ((C9735l) c10936l.amazon.getValue()).yandex, ((C9735l) c10936l.purchase.getValue()).yandex, ((C9735l) c10936l.billing.getValue()).yandex, ((C9735l) c10936l.mopub.getValue()).yandex, c10936l.admob(), ((C9735l) c10936l.subs.getValue()).yandex, ((C9735l) c10936l.isPro.getValue()).yandex, ((C9735l) c10936l.firebase.getValue()).yandex, ((C9735l) c10936l.smaato.getValue()).yandex, ((C9735l) c10936l.remoteconfig.getValue()).yandex, ((C9735l) c10936l.vip.getValue()).yandex, ((C9735l) c10936l.metrica.getValue()).yandex, c10936l.subs(), c10936l.purchase(), c10936l.isPro(), c10936l.billing(), ((C9735l) c10936l.tapsense.getValue()).yandex, c10936l.amazon(), c10936l.crashlytics(), ((C9735l) c10936l.pro.getValue()).yandex, ((C9735l) c10936l.ad.getValue()).yandex, ((C9735l) c10936l.advert.getValue()).yandex, ((C9735l) c10936l.isVip.getValue()).yandex, c10936l.yandex(), c10936l.loadAd(), ((C9735l) c10936l.applovin.getValue()).yandex);
                c6956l.m2147try(c10936l4);
                objM2132native = c10936l4;
            } else {
                c = 0;
                c2 = 2;
            }
            C10936l c10936l5 = (C10936l) objM2132native;
            C10707l c10707l2 = AbstractC10689l.yandex;
            AbstractC1757l.m1041throw(c10936l.mopub(), c10936l5.yandex);
            AbstractC1757l.m1041throw(((C9735l) c10936l.loadAd.getValue()).yandex, c10936l5.loadAd);
            AbstractC1757l.m1041throw(((C9735l) c10936l.crashlytics.getValue()).yandex, c10936l5.crashlytics);
            AbstractC1757l.m1041throw(((C9735l) c10936l.amazon.getValue()).yandex, c10936l5.amazon);
            AbstractC1757l.m1041throw(((C9735l) c10936l.purchase.getValue()).yandex, c10936l5.purchase);
            AbstractC1757l.m1041throw(((C9735l) c10936l.billing.getValue()).yandex, c10936l5.billing);
            c10936l5.mopub.setValue(new C9735l(((C9735l) c10936l.mopub.getValue()).yandex));
            AbstractC1757l.m1041throw(c10936l.admob(), c10936l5.admob);
            AbstractC1757l.m1041throw(((C9735l) c10936l.subs.getValue()).yandex, c10936l5.subs);
            AbstractC1757l.m1041throw(((C9735l) c10936l.isPro.getValue()).yandex, c10936l5.isPro);
            AbstractC1757l.m1041throw(((C9735l) c10936l.firebase.getValue()).yandex, c10936l5.firebase);
            AbstractC1757l.m1041throw(((C9735l) c10936l.smaato.getValue()).yandex, c10936l5.smaato);
            AbstractC1757l.m1041throw(((C9735l) c10936l.remoteconfig.getValue()).yandex, c10936l5.remoteconfig);
            AbstractC1757l.m1041throw(((C9735l) c10936l.vip.getValue()).yandex, c10936l5.vip);
            c10936l5.metrica.setValue(new C9735l(((C9735l) c10936l.metrica.getValue()).yandex));
            c10936l5.startapp.setValue(new C9735l(c10936l.subs()));
            c10936l5.adcel.setValue(new C9735l(c10936l.purchase()));
            c10936l5.ads.setValue(new C9735l(c10936l.isPro()));
            AbstractC1757l.m1041throw(c10936l.billing(), c10936l5.subscription);
            c10936l5.tapsense.setValue(new C9735l(((C9735l) c10936l.tapsense.getValue()).yandex));
            c10936l5.Signature.setValue(new C9735l(c10936l.amazon()));
            AbstractC1757l.m1041throw(c10936l.crashlytics(), c10936l5.license);
            AbstractC1757l.m1041throw(((C9735l) c10936l.pro.getValue()).yandex, c10936l5.pro);
            AbstractC1757l.m1041throw(((C9735l) c10936l.ad.getValue()).yandex, c10936l5.ad);
            AbstractC1757l.m1041throw(((C9735l) c10936l.advert.getValue()).yandex, c10936l5.advert);
            c10936l5.isVip.setValue(new C9735l(((C9735l) c10936l.isVip.getValue()).yandex));
            c10936l5.signatures.setValue(new C9735l(c10936l.yandex()));
            AbstractC1757l.m1041throw(c10936l.loadAd(), c10936l5.premium);
            c10936l5.applovin.setValue(new C9735l(((C9735l) c10936l.applovin.getValue()).yandex));
            jMopub = c10936l5.mopub();
            zPurchase = c6956l.purchase(jMopub);
            objM2132native2 = c6956l.m2132native();
            if (zPurchase) {
                objM2132native2 = new C8620l(jMopub, C9735l.loadAd(0.4f, jMopub));
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C8620l(jMopub, C9735l.loadAd(0.4f, jMopub));
                c6956l.m2147try(objM2132native2);
            }
            C10092l c10092lYandex5 = AbstractC10689l.yandex.yandex(c10936l5);
            C10092l c10092lYandex6 = AbstractC14696l.yandex.yandex(c0260l2);
            C10092l c10092lYandex7 = AbstractC4524l.yandex.yandex((C8620l) objM2132native2);
            C10092l c10092lYandex8 = AbstractC3459l.yandex.yandex(c9472l2);
            C10092l[] c10092lArr2 = new C10092l[4];
            c10092lArr2[c] = c10092lYandex5;
            c10092lArr2[1] = c10092lYandex6;
            c10092lArr2[c2] = c10092lYandex7;
            c10092lArr2[3] = c10092lYandex8;
            c15578l2 = c15578l;
            AbstractC10478l.loadAd(c10092lArr2, AbstractC14566l.amazon(1230193033, new C14601l(c9472l2, c15578l2, 27), c6956l), c6956l, 56);
        } else {
            c15578l2 = c15578l;
            c6956l.m2124else();
            c0260l2 = c0260l;
        }
        c9472l3 = c9472l2;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10515l(c10936l, c0260l2, c9472l3, c15578l2, i, i2);
        }
    }
}
