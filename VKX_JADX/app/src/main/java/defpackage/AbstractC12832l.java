package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lّۙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12832l {
    public static final C4733l yandex = new C4733l(C6762l.class, new C11467l(29));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new C4875l(0));
    public static final C5773l crashlytics = new C5773l(C8166l.class, new C4875l(1));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new C4875l(2));

    public static C9982l admob(C6762l c6762l) {
        try {
            C13608l c13608lM3651strictfp = C13608l.m3651strictfp(AbstractC2130l.mopub(c6762l.amazon), C7597l.yandex());
            C6798l c6798lInmobi = C9982l.inmobi();
            String str = c6762l.loadAd;
            c6798lInmobi.purchase();
            C9982l.signatures((C9982l) c6798lInmobi.f19242l, str);
            c6798lInmobi.purchase();
            C9982l.isVip((C9982l) c6798lInmobi.f19242l, c13608lM3651strictfp);
            return (C9982l) c6798lInmobi.yandex();
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object amazon(Context context, C10765l c10765l, String str, String str2, String str3, String str4, AbstractC0283l abstractC0283l) throws Throwable {
        C3207l c3207l;
        String str5;
        String str6;
        String str7;
        Context context2;
        Context context3;
        Object objFirebase;
        String str8;
        C10712l c10712l;
        String str9;
        Object objFirebase2;
        if (abstractC0283l instanceof C3207l) {
            c3207l = (C3207l) abstractC0283l;
            int i = c3207l.f6882l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3207l.f6882l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3207l = new C3207l(abstractC0283l);
            }
        } else {
            c3207l = new C3207l(abstractC0283l);
        }
        Object objSignature = c3207l.f6879l;
        int i2 = c3207l.f6882l;
        int i3 = 1;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSignature);
            C10322l c10322lPurchase = purchase(context, c10765l, str4);
            c3207l.f6881l = context;
            str5 = str;
            c3207l.f6880l = str5;
            c3207l.f6883l = str2;
            str6 = str3;
            c3207l.f6878l = str6;
            c3207l.f6882l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c3207l));
            c2397l.license();
            c10322lPurchase.loadAd(new C13324l(c2397l, 0));
            c10322lPurchase.yandex(new C13324l(c2397l, i3));
            objSignature = c2397l.Signature();
            if (objSignature != enumC9342l) {
                str7 = str2;
                context2 = context;
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            String str10 = (String) c3207l.f6878l;
            String str11 = c3207l.f6883l;
            String str12 = c3207l.f6880l;
            context2 = (Context) c3207l.f6881l;
            AbstractC2829l.crashlytics(objSignature);
            str6 = str10;
            str7 = str11;
            str5 = str12;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C10712l c10712l2 = (C10712l) c3207l.f6881l;
                AbstractC2829l.crashlytics(objSignature);
                return c10712l2;
            }
            c10712l = (C10712l) c3207l.f6878l;
            str9 = c3207l.f6883l;
            str8 = c3207l.f6880l;
            context3 = (Context) c3207l.f6881l;
            AbstractC2829l.crashlytics(objSignature);
        }
        c3207l.f6881l = c10712l;
        c3207l.f6880l = null;
        c3207l.f6883l = null;
        c3207l.f6878l = null;
        c3207l.f6882l = 3;
        if (c10712l.billing.isEmpty()) {
            objFirebase2 = Unit.INSTANCE;
        } else {
            C16552l c16552l = AbstractC11463l.yandex;
            String str13 = str8;
            Context context4 = context3;
            objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C13979l(c10712l, context4, str13, str9, null, 5), c3207l);
            if (objFirebase2 != enumC9342l) {
                objFirebase2 = Unit.INSTANCE;
            }
        }
        if (objFirebase2 != enumC9342l) {
            return enumC9342l;
        }
        return c10712l;
        C10712l c10712l3 = (C10712l) objSignature;
        c3207l.f6881l = context2;
        c3207l.f6880l = str7;
        c3207l.f6883l = str6;
        c3207l.f6878l = c10712l3;
        c3207l.f6882l = 2;
        if (c10712l3.amazon.isEmpty()) {
            objFirebase = Unit.INSTANCE;
            context3 = context2;
        } else {
            C16552l c16552l2 = AbstractC11463l.yandex;
            Context context5 = context2;
            context3 = context5;
            objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C8568l(c10712l3, context5, str5, interfaceC14029l, 8), c3207l);
            if (objFirebase != enumC9342l) {
                objFirebase = Unit.INSTANCE;
            }
        }
        if (objFirebase != enumC9342l) {
            str8 = str7;
            c10712l = c10712l3;
            str9 = str6;
            c3207l.f6881l = c10712l;
            c3207l.f6880l = null;
            c3207l.f6883l = null;
            c3207l.f6878l = null;
            c3207l.f6882l = 3;
            if (c10712l.billing.isEmpty()) {
                objFirebase2 = Unit.INSTANCE;
            } else {
                C16552l c16552l3 = AbstractC11463l.yandex;
                String str14 = str8;
                Context context6 = context3;
                objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C13979l(c10712l, context6, str14, str9, null, 5), c3207l);
                if (objFirebase2 != enumC9342l) {
                    objFirebase2 = Unit.INSTANCE;
                }
            }
            if (objFirebase2 != enumC9342l) {
                return c10712l;
            }
        }
        return enumC9342l;
    }

    public static C6762l billing(C9982l c9982l, C9358l c9358l) throws GeneralSecurityException {
        C6932l c6932l;
        C17927l c17927l = C17927l.mopub;
        C6932l c6932l2 = C6932l.firebase;
        C6932l c6932l3 = C6932l.isPro;
        C6932l c6932l4 = C6932l.subs;
        C6932l c6932l5 = C6932l.mopub;
        C6932l c6932l6 = C6932l.admob;
        C6932l c6932l7 = C6932l.billing;
        C5001l c5001lM3650package = C13608l.m3650package();
        c5001lM3650package.subs(c9982l.applovin().inmobi());
        c5001lM3650package.isPro(c9982l.applovin().m3653throws());
        c5001lM3650package.admob(EnumC9483l.RAW);
        AbstractC3302l abstractC3302lBilling = AbstractC2130l.billing(((C13608l) c5001lM3650package.yandex()).purchase());
        if (abstractC3302lBilling instanceof C16816l) {
            c6932l = c6932l7;
        } else if (abstractC3302lBilling instanceof C15840l) {
            c6932l = c6932l6;
        } else if (abstractC3302lBilling instanceof C10441l) {
            c6932l = c6932l5;
        } else if (abstractC3302lBilling instanceof C8378l) {
            c6932l = c6932l4;
        } else if (abstractC3302lBilling instanceof C3281l) {
            c6932l = c6932l3;
        } else {
            if (!(abstractC3302lBilling instanceof C2385l)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(abstractC3302lBilling)));
            }
            c6932l = c6932l2;
        }
        if (c9358l.equals(C9358l.crashlytics)) {
            c17927l = C17927l.billing;
        } else if (c9358l != C9358l.purchase) {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
        }
        String strAppmetrica = c9982l.appmetrica();
        AbstractC1440l abstractC1440l = (AbstractC1440l) abstractC3302lBilling;
        if (strAppmetrica == null) {
            C18262l.ads("kekUri must be set");
            return null;
        }
        if (abstractC1440l == null) {
            C18262l.ads("dekParametersForNewKeys must be set");
            return null;
        }
        if (abstractC1440l.yandex()) {
            C18262l.ads("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        if ((c6932l == c6932l7 && (abstractC1440l instanceof C16816l)) || ((c6932l == c6932l6 && (abstractC1440l instanceof C15840l)) || ((c6932l == c6932l5 && (abstractC1440l instanceof C10441l)) || ((c6932l == c6932l4 && (abstractC1440l instanceof C8378l)) || ((c6932l == c6932l3 && (abstractC1440l instanceof C3281l)) || (c6932l == c6932l2 && (abstractC1440l instanceof C2385l))))))) {
            return new C6762l(c17927l, strAppmetrica, c6932l, abstractC1440l);
        }
        throw new GeneralSecurityException(AbstractC14814l.ads("Cannot use parsing strategy ", c6932l.loadAd, " when new keys are picked according to ", String.valueOf(abstractC1440l), "."));
    }

    public static C2490l crashlytics() {
        return (C2490l) C2490l.subs.getValue();
    }

    public static void loadAd(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static final InterfaceC7042l mopub(InterfaceC7702l interfaceC7702l, InterfaceC2262l interfaceC2262l) {
        return AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8912l(interfaceC7702l, null, 9), 3);
    }

    public static final C10322l purchase(Context context, C10765l c10765l, final String str) {
        C10322l c10322l;
        if (!(c10765l instanceof C10765l)) {
            C18725l.billing();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        if (!AbstractC8576l.yandex(str, "__LottieInternalDefaultCacheKey__")) {
            CallableC7505l callableC7505l = new CallableC7505l(context, c10765l.yandex, str, i);
            HashMap map = AbstractC8446l.yandex;
            C10712l c10712lYandex = str == null ? null : C16032l.loadAd.yandex(str);
            c10322l = c10712lYandex != null ? new C10322l(c10712lYandex) : null;
            if (str != null && map.containsKey(str)) {
                c10322l = (C10322l) map.get(str);
            }
            if (c10322l != null) {
                return c10322l;
            }
            C10322l c10322l2 = new C10322l(callableC7505l);
            if (str != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c10322l2.loadAd(new InterfaceC8364l() { // from class: lٍٜۗ
                    @Override // defpackage.InterfaceC8364l
                    public final void onResult(Object obj) {
                        int i3 = i2;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        String str2 = str;
                        switch (i3) {
                            case 0:
                                HashMap map2 = AbstractC8446l.yandex;
                                map2.remove(str2);
                                atomicBoolean2.set(true);
                                if (map2.size() == 0) {
                                    AbstractC8446l.purchase();
                                }
                                break;
                            default:
                                HashMap map3 = AbstractC8446l.yandex;
                                map3.remove(str2);
                                atomicBoolean2.set(true);
                                if (map3.size() == 0) {
                                    AbstractC8446l.purchase();
                                }
                                break;
                        }
                    }
                });
                c10322l2.yandex(new InterfaceC8364l() { // from class: lٍٜۗ
                    @Override // defpackage.InterfaceC8364l
                    public final void onResult(Object obj) {
                        int i3 = i;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        String str2 = str;
                        switch (i3) {
                            case 0:
                                HashMap map2 = AbstractC8446l.yandex;
                                map2.remove(str2);
                                atomicBoolean2.set(true);
                                if (map2.size() == 0) {
                                    AbstractC8446l.purchase();
                                }
                                break;
                            default:
                                HashMap map3 = AbstractC8446l.yandex;
                                map3.remove(str2);
                                atomicBoolean2.set(true);
                                if (map3.size() == 0) {
                                    AbstractC8446l.purchase();
                                }
                                break;
                        }
                    }
                });
                if (!atomicBoolean.get()) {
                    map.put(str, c10322l2);
                    if (map.size() == 1) {
                        AbstractC8446l.purchase();
                    }
                }
            }
            return c10322l2;
        }
        String str2 = c10765l.yandex;
        HashMap map2 = AbstractC8446l.yandex;
        final String strStartapp = AbstractC14814l.startapp("url_", str2);
        CallableC7505l callableC7505l2 = new CallableC7505l(context, str2, strStartapp, i);
        HashMap map3 = AbstractC8446l.yandex;
        C10712l c10712lYandex2 = C16032l.loadAd.yandex(strStartapp);
        c10322l = c10712lYandex2 != null ? new C10322l(c10712lYandex2) : null;
        if (map3.containsKey(strStartapp)) {
            c10322l = (C10322l) map3.get(strStartapp);
        }
        if (c10322l != null) {
            return c10322l;
        }
        C10322l c10322l3 = new C10322l(callableC7505l2);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        c10322l3.loadAd(new InterfaceC8364l() { // from class: lٍٜۗ
            @Override // defpackage.InterfaceC8364l
            public final void onResult(Object obj) {
                int i3 = i2;
                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                String str3 = strStartapp;
                switch (i3) {
                    case 0:
                        HashMap map4 = AbstractC8446l.yandex;
                        map4.remove(str3);
                        atomicBoolean3.set(true);
                        if (map4.size() == 0) {
                            AbstractC8446l.purchase();
                        }
                        break;
                    default:
                        HashMap map5 = AbstractC8446l.yandex;
                        map5.remove(str3);
                        atomicBoolean3.set(true);
                        if (map5.size() == 0) {
                            AbstractC8446l.purchase();
                        }
                        break;
                }
            }
        });
        c10322l3.yandex(new InterfaceC8364l() { // from class: lٍٜۗ
            @Override // defpackage.InterfaceC8364l
            public final void onResult(Object obj) {
                int i3 = i;
                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                String str3 = strStartapp;
                switch (i3) {
                    case 0:
                        HashMap map4 = AbstractC8446l.yandex;
                        map4.remove(str3);
                        atomicBoolean3.set(true);
                        if (map4.size() == 0) {
                            AbstractC8446l.purchase();
                        }
                        break;
                    default:
                        HashMap map5 = AbstractC8446l.yandex;
                        map5.remove(str3);
                        atomicBoolean3.set(true);
                        if (map5.size() == 0) {
                            AbstractC8446l.purchase();
                        }
                        break;
                }
            }
        });
        if (!atomicBoolean2.get()) {
            map3.put(strStartapp, c10322l3);
            if (map3.size() == 1) {
                AbstractC8446l.purchase();
            }
        }
        return c10322l3;
    }

    public static void yandex(Object obj, Object obj2) {
        if (obj == null) {
            C6541l.subs(AbstractC15560l.subscription(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
