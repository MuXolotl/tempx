package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11891l implements Function4 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23709l;

    public /* synthetic */ C11891l(int i) {
        this.f23709l = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f23709l;
        C1083l c1083l = AbstractC8313l.yandex;
        int i2 = 14;
        int i3 = 6;
        C4346l c4346l = C4346l.f8873l;
        byte b = 0;
        switch (i) {
            case 0:
                C8924l c8924l = (C8924l) obj;
                C4748l c4748l = (C4748l) obj2;
                Rect rect = (Rect) obj3;
                if (!((Boolean) obj4).booleanValue()) {
                    c8924l.yandex(c4748l.yandex(rect));
                    return Unit.INSTANCE;
                }
                Rect rect2 = new Rect(0, 0, rect.height(), rect.width());
                C5466l c5466lYandex = c4748l.yandex(rect2);
                boolean z = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
                c4748l.crashlytics = rect2.height();
                c8924l.yandex(c5466lYandex, z ? c4748l.billing : c4748l.purchase);
                return Unit.INSTANCE;
            case 1:
                C8924l c8924l2 = (C8924l) obj;
                C4748l c4748l2 = (C4748l) obj2;
                Rect rect3 = (Rect) obj3;
                if (!((Boolean) obj4).booleanValue()) {
                    c8924l2.yandex(c4748l2.yandex(rect3));
                    return Unit.INSTANCE;
                }
                Rect rect4 = new Rect(0, 0, rect3.height(), rect3.width());
                C5466l c5466lYandex2 = c4748l2.yandex(rect4);
                boolean z2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
                c4748l2.crashlytics = rect4.height();
                c8924l2.yandex(c5466lYandex2, z2 ? c4748l2.billing : c4748l2.purchase);
                return Unit.INSTANCE;
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6956l c6956l = (C6956l) obj3;
                ((Integer) obj4).getClass();
                C0086l c0086l = C18450l.f36040l;
                if (zBooleanValue) {
                    c6956l.m2123default(1158397261);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l), null, null, 0L, c6956l, 56, 12);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.mab_added), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(true);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(1159014161);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 48);
                    long j2 = c6956l.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l2);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_add, 0, c6956l), null, null, 0L, c6956l, 56, 12);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.mab_add), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(true);
                    c6956l.startapp(false);
                }
                return Unit.INSTANCE;
            case 3:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                C6956l c6956l2 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (zBooleanValue2) {
                    c6956l2.m2123default(-226220527);
                    AbstractC12491l.yandex(null, ((C9735l) c6956l2.isPro(AbstractC12502l.yandex)).yandex, 2.0f, 24.0f, c6956l2, 3456);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(-225930429);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l2), null, null, ((C9735l) c6956l2.isPro(AbstractC12502l.yandex)).yandex, c6956l2, 56, 4);
                    c6956l2.startapp(false);
                }
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj2).getClass();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 129) != 128)) {
                    AbstractC9383l.yandex(AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l, 1.0f), 1.0f), c6956l3, 6);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C6956l c6956l4 = (C6956l) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                C10707l c10707l = AbstractC16964l.yandex;
                AbstractC13010l.loadAd((String) obj2, null, ((C14370l) c6956l4.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l4.isPro(c10707l)).loadAd.amazon, c6956l4, (iIntValue2 >> 3) & 14, 0, 131066);
                return Unit.INSTANCE;
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                C6956l c6956l5 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (zBooleanValue3) {
                    c6956l5.m2123default(108532173);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l5), null, null, 0L, c6956l5, 56, 12);
                    c6956l5.startapp(false);
                } else {
                    c6956l5.m2123default(108871654);
                    C5062l c5062lYandex3 = AbstractC7001l.yandex(c1083l, C18450l.f36040l, c6956l5, 48);
                    long j3 = c6956l5.f14595continue;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l5, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l3);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c5062lYandex3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling3, C3438l.amazon);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_add, 0, c6956l5), null, null, 0L, c6956l5, 56, 12);
                    AbstractC9334l.yandex(c6956l5, AbstractC0080l.vip(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.mab_add), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                    c6956l5.startapp(true);
                    c6956l5.startapp(false);
                }
                return Unit.INSTANCE;
            case 7:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                C6956l c6956l6 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (zBooleanValue4) {
                    c6956l6.m2123default(-504285423);
                    AbstractC12491l.yandex(null, C9735l.purchase, 2.0f, 32.0f, c6956l6, 3504);
                    c6956l6.startapp(false);
                } else {
                    c6956l6.m2123default(-504009461);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_like_36, 0, c6956l6), null, null, C9735l.purchase, c6956l6, 3128, 4);
                    c6956l6.startapp(false);
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC7064l interfaceC7064l = (InterfaceC7064l) obj2;
                C6956l c6956l7 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                C15089l c15089l = C18450l.f36046l;
                C0086l c0086l2 = C18450l.f36040l;
                boolean zEquals = interfaceC7064l.equals(C12279l.yandex);
                C11485l c11485l = AbstractC8313l.crashlytics;
                if (zEquals) {
                    c6956l7.m2123default(-1490697831);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    C5062l c5062lYandex4 = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c0086l2, c6956l7, 54);
                    long j4 = c6956l7.f14595continue;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l7, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l4);
                    } else {
                        c6956l7.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l7, c5062lYandex4, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato4, c6415l2);
                    Integer numValueOf = Integer.valueOf(i7);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l7, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l7, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling4, c6415l4);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_error_outline_28, 0, c6956l7), null, null, 0L, c6956l7, 56, 12);
                    C9247l c9247l = new C9247l(1.0f, true);
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l7, 0);
                    long j5 = c6956l7.f14595continue;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l7, c9247l);
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l4);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato5, c6415l2);
                    AbstractC11043l.isPro(i8, c6956l7, c6415l3, c6956l7, c11192l);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling5, c6415l4);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.auth2_qr_code_scanner_hint_wrong_code), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l7, 0, 24576, 245758);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.auth2_qr_code_scanner_hint_wrong_code_desc), AbstractC15788l.yandex(c4346l, 0.5f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l7, 48, 24576, 245756);
                    c6956l7.startapp(true);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, 0, c6956l7), null, null, 0L, c6956l7, 56, 12);
                    c6956l7.startapp(true);
                    c6956l7.startapp(false);
                } else if (interfaceC7064l instanceof C12407l) {
                    c6956l7.m2123default(-1489728895);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    C5062l c5062lYandex5 = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c0086l2, c6956l7, 54);
                    long j6 = c6956l7.f14595continue;
                    int i9 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l7, interfaceC17242lAmazon2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l5 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l5);
                    } else {
                        c6956l7.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l7, c5062lYandex5, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato6, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i9);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l7, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l7, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling6, c6415l8);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_external_link_outline_24, 0, c6956l7), null, null, 0L, c6956l7, 56, 12);
                    C9247l c9247l2 = new C9247l(1.0f, true);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l, c6956l7, 0);
                    long j7 = c6956l7.f14595continue;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l7, c9247l2);
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l5);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, c1853lYandex2, c6415l5);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato7, c6415l6);
                    AbstractC11043l.isPro(i10, c6956l7, c6415l7, c6956l7, c11192l2);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling7, c6415l8);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.scan_qr_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l7, 0, 24576, 245758);
                    AbstractC13010l.loadAd(((C12407l) interfaceC7064l).yandex, AbstractC15788l.yandex(c4346l, 0.5f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l7, 48, 24576, 245756);
                    c6956l7.startapp(true);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_right, 0, c6956l7), null, null, 0L, c6956l7, 56, 12);
                    c6956l7.startapp(true);
                    c6956l7.startapp(false);
                } else {
                    if (!interfaceC7064l.equals(C15166l.yandex)) {
                        throw AbstractC12900l.billing(-186635879, c6956l7, false);
                    }
                    c6956l7.m2123default(-1488855594);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.auth2_qr_code_scanner_hint_where_to_find), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 0, 0, 262142);
                    c6956l7.startapp(false);
                }
                return Unit.INSTANCE;
            case 9:
                C6956l c6956l8 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                int iOrdinal = ((EnumC10474l) obj2).ordinal();
                if (iOrdinal == 0) {
                    c6956l8.m2123default(-1461412013);
                    c6956l8.startapp(false);
                } else if (iOrdinal == 1) {
                    c6956l8.m2123default(-1461346479);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_voice_outline_28, 0, c6956l8), "Голосовой поиск", AbstractC0080l.isPro(c4346l, 20.0f), ((C14370l) c6956l8.isPro(AbstractC16964l.yandex)).yandex.subscription, c6956l8, 440, 0);
                    c6956l8.startapp(false);
                } else {
                    if (iOrdinal != 2) {
                        throw AbstractC12900l.billing(-2125352814, c6956l8, false);
                    }
                    c6956l8.m2123default(-1460941123);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_close, 0, c6956l8), "Очистить поиск", AbstractC0080l.isPro(c4346l, 20.0f), ((C14370l) c6956l8.isPro(AbstractC16964l.yandex)).yandex.subscription, c6956l8, 440, 0);
                    c6956l8.startapp(false);
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC16831l interfaceC16831l = (InterfaceC16831l) obj2;
                C6956l c6956l9 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (interfaceC16831l.equals(C16486l.yandex)) {
                    c6956l9.m2123default(-633457293);
                    String strPurchase = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_description);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l9.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l2)).loadAd.vip, c6956l9, 0, 0, 131066);
                    c6956l9.startapp(false);
                } else if (interfaceC16831l.equals(C4242l.yandex)) {
                    c6956l9.m2123default(-633071839);
                    AbstractC4332l.amazon(AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0, 0.0f, c6956l9, 6, 30);
                    c6956l9.startapp(false);
                } else if (interfaceC16831l.equals(C11710l.yandex)) {
                    c6956l9.m2123default(-632843493);
                    String strPurchase2 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_network);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase2, null, ((C14370l) c6956l9.isPro(c10707l3)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l3)).loadAd.vip, c6956l9, 0, 0, 131066);
                    c6956l9.startapp(false);
                } else {
                    if (!(interfaceC16831l instanceof C18087l)) {
                        throw AbstractC12900l.billing(1365042195, c6956l9, false);
                    }
                    c6956l9.m2123default(-632346935);
                    C12985l c12985l = ((C18087l) interfaceC16831l).yandex;
                    switch (c12985l.f25452l) {
                        case SUCCESS:
                            c6956l9.m2123default(-630427384);
                            String str = c12985l.f25453l;
                            if (str == null) {
                                str = "";
                            }
                            String strAmazon = AbstractC11999l.amazon(R.string.spark_code_entry_success, new Object[]{str}, c6956l9);
                            C10707l c10707l4 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strAmazon, null, ((C14370l) c6956l9.isPro(c10707l4)).yandex.yandex, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l4)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        case NOT_FOUND:
                            c6956l9.m2123default(-631851927);
                            String strPurchase3 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_not_found);
                            C10707l c10707l5 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strPurchase3, null, ((C14370l) c6956l9.isPro(c10707l5)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l5)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        case ALREADY_USED_ELSEWHERE:
                            c6956l9.m2123default(-632311378);
                            String strPurchase4 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_used);
                            C10707l c10707l6 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strPurchase4, null, ((C14370l) c6956l9.isPro(c10707l6)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l6)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        case ALREADY_USED_HERE:
                            c6956l9.m2123default(-629923076);
                            String strPurchase5 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_code_already_activated);
                            C10707l c10707l7 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strPurchase5, null, ((C14370l) c6956l9.isPro(c10707l7)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l7)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        case HAS_THIS_ONE_TIME_ENTITLEMENT:
                            c6956l9.m2123default(-630898367);
                            String strPurchase6 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_already_activated);
                            C10707l c10707l8 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strPurchase6, null, ((C14370l) c6956l9.isPro(c10707l8)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l8)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        case EXPIRED:
                            c6956l9.m2123default(-629448373);
                            String strPurchase7 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_expired);
                            C10707l c10707l9 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strPurchase7, null, ((C14370l) c6956l9.isPro(c10707l9)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l9)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        case FLOOD_WAIT:
                            c6956l9.m2123default(-628985171);
                            String strPurchase8 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_flood);
                            C10707l c10707l10 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strPurchase8, null, ((C14370l) c6956l9.isPro(c10707l10)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l10)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        case NO_USES_LEFT:
                            c6956l9.m2123default(-631384633);
                            String strPurchase9 = AbstractC11999l.purchase(c6956l9, R.string.spark_code_entry_error_no_attempts);
                            C10707l c10707l11 = AbstractC16964l.yandex;
                            AbstractC13010l.loadAd(strPurchase9, null, ((C14370l) c6956l9.isPro(c10707l11)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l9.isPro(c10707l11)).loadAd.vip, c6956l9, 0, 0, 131066);
                            c6956l9.startapp(false);
                            break;
                        default:
                            throw AbstractC12900l.billing(1365075937, c6956l9, false);
                    }
                    c6956l9.startapp(false);
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC10807l interfaceC10807l = (InterfaceC10807l) obj2;
                C6956l c6956l10 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                boolean z3 = interfaceC10807l instanceof C5185l;
                C4346l c4346l2 = C4346l.f8873l;
                if (z3) {
                    c6956l10.m2123default(-668173149);
                    AbstractC3383l.yandex(c4346l2, null, null, null, null, AbstractC14566l.amazon(1928259928, new C1350l(18, interfaceC10807l), c6956l10), c6956l10, 196614, 30);
                    c6956l10.startapp(false);
                } else if (interfaceC10807l.equals(C7743l.yandex)) {
                    c6956l10.m2123default(-667320029);
                    AbstractC4332l.amazon(AbstractC0080l.amazon(c4346l2, 1.0f), 0L, 0L, 0, 0.0f, c6956l10, 6, 30);
                    c6956l10.startapp(false);
                } else if (interfaceC10807l.equals(C5896l.yandex)) {
                    c6956l10.m2123default(-667104424);
                    String strPurchase10 = AbstractC11999l.purchase(c6956l10, R.string.spark_payment_window_target_selector_error_not_user);
                    C10707l c10707l12 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase10, null, ((C14370l) c6956l10.isPro(c10707l12)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l10.isPro(c10707l12)).loadAd.vip, c6956l10, 0, 0, 131066);
                    c6956l10.startapp(false);
                } else if (interfaceC10807l.equals(C6521l.yandex)) {
                    c6956l10.m2123default(-666726441);
                    String strPurchase11 = AbstractC11999l.purchase(c6956l10, R.string.spark_payment_window_target_selector_error_not_found);
                    C10707l c10707l13 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase11, null, ((C14370l) c6956l10.isPro(c10707l13)).yandex.pro, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l10.isPro(c10707l13)).loadAd.vip, c6956l10, 0, 0, 131066);
                    c6956l10.startapp(false);
                } else {
                    if (!interfaceC10807l.equals(C14296l.yandex)) {
                        throw AbstractC12900l.billing(-437197145, c6956l10, false);
                    }
                    c6956l10.m2123default(-666350504);
                    String strPurchase12 = AbstractC11999l.purchase(c6956l10, R.string.spark_payment_window_target_selector_text);
                    C10707l c10707l14 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase12, null, ((C14370l) c6956l10.isPro(c10707l14)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l10.isPro(c10707l14)).loadAd.vip, c6956l10, 0, 0, 131066);
                    c6956l10.startapp(false);
                }
                return Unit.INSTANCE;
            case 12:
                C6956l c6956l11 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                InterfaceC5289l interfaceC5289l = (InterfaceC5289l) ((AbstractC5357l) obj2).loadAd();
                if (interfaceC5289l == null) {
                    c6956l11.m2123default(-959335886);
                } else {
                    c6956l11.m2123default(2047263663);
                    interfaceC5289l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l11, 6);
                }
                c6956l11.startapp(false);
                return Unit.INSTANCE;
            case 13:
                int iIntValue3 = ((Integer) obj2).intValue();
                C6956l c6956l12 = (C6956l) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= c6956l12.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l12.m2127for(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    Object objM2132native = c6956l12.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = new C11200l(i2);
                        c6956l12.m2147try(objM2132native);
                    }
                    AbstractC16814l.loadAd(false, (Function0) objM2132native, AbstractC14566l.amazon(1549956368, new C4314l(iIntValue3, i3, b), c6956l12), null, false, AbstractC14566l.amazon(2088200661, new C4314l(iIntValue3, 7, b), c6956l12), AbstractC8182l.yandex, null, null, null, null, null, c6956l12, 113246646, 130680);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            default:
                return new C11528l((InterfaceC12932l) obj, (Context) obj2, (EnumC16103l) obj3, (C10537l) obj4);
        }
    }
}
