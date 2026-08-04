package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْٕٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13393l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f26303l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26304l;

    public /* synthetic */ C13393l(int i, Function2 function2) {
        this.f26304l = 13;
        this.f26303l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws C8630l {
        InterfaceC2449l interfaceC2449l;
        int i = this.f26304l;
        C4346l c4346l = C4346l.f8873l;
        Function2 function2 = this.f26303l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lPremium = AbstractC3605l.firebase(c4346l, AbstractC0850l.yandex).premium(new C14020l(C18450l.f36034l));
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    function2.invoke(c6956l, 0);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lPremium2 = AbstractC3605l.firebase(new C9247l(1.0f, false), AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, ((Boolean) AbstractC7063l.yandex.getValue()).booleanValue() ? 16.0f : 24.0f, 7)).premium(new C14020l(C18450l.f36046l));
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l2.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, C3438l.amazon);
                    function2.invoke(c6956l2, 0);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC4115l.mopub(c4346l, 4.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j3 = c6956l3.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l3, interfaceC17242lMopub);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l3);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling3, C3438l.amazon);
                    function2.invoke(c6956l3, 0);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objM2132native = c6956l4.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = new C10351l(29);
                        c6956l4.m2147try(objM2132native);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native);
                    InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j4 = c6956l4.f14595continue;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l4, interfaceC17242lLoadAd);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l4);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.crashlytics(c6956l4, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling4, C3438l.amazon);
                    function2.invoke(c6956l4, 0);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                return new C8119l((C14378l) ((C10972l) obj2).yandex.invoke(((C8119l) obj).yandex), function2);
            case 5:
                File file = (File) obj;
                if (function2.invoke(file, (IOException) obj2) != EnumC6374l.f13344l) {
                    return Unit.INSTANCE;
                }
                throw new C8630l(file, null, null);
            case 6:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lYandex = AbstractC0080l.yandex(c4346l, 56.0f, 56.0f);
                    InterfaceC10835l interfaceC10835lAmazon5 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j5 = c6956l5.f14595continue;
                    int i6 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l5, interfaceC17242lYandex);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l5 = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l5);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon5, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato5, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling5, C3438l.amazon);
                    function2.invoke(c6956l5, 0);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC11282l.yandex(((C9472l) c6956l6.isPro(AbstractC3459l.yandex)).smaato, function2, c6956l6, 0);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C15543l c15543l = (C15543l) obj;
                List list = (List) function2.invoke(c15543l, obj2);
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj3 = list.get(i7);
                    if (obj3 != null && (interfaceC2449l = c15543l.f30377l) != null && !interfaceC2449l.crashlytics(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i7 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 9:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC0080l.loadAd(c4346l, 0.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon6 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j6 = c6956l7.f14595continue;
                    int i8 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l7, interfaceC17242lLoadAd2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l6 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l6);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, interfaceC10835lAmazon6, C3438l.mopub);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato6, C3438l.billing);
                    AbstractC8182l.billing(c6956l7, Integer.valueOf(i8), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l7, C3438l.firebase);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling6, C3438l.amazon);
                    function2.invoke(c6956l7, 0);
                    c6956l7.startapp(true);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lLoadAd3 = AbstractC0080l.loadAd(c4346l, 0.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon7 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j7 = c6956l8.f14595continue;
                    int i9 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l8, interfaceC17242lLoadAd3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l7 = C3438l.loadAd;
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(c16395l7);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, interfaceC10835lAmazon7, C3438l.mopub);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato7, C3438l.billing);
                    AbstractC8182l.billing(c6956l8, Integer.valueOf(i9), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l8, C3438l.firebase);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling7, C3438l.amazon);
                    function2.invoke(c6956l8, 0);
                    c6956l8.startapp(true);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lMopub2 = AbstractC4115l.mopub(c4346l, 4.0f, 2);
                    InterfaceC10835l interfaceC10835lAmazon8 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j8 = c6956l9.f14595continue;
                    int i10 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato8 = c6956l9.smaato();
                    InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l9, interfaceC17242lMopub2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l8 = C3438l.loadAd;
                    c6956l9.m2140super();
                    if (c6956l9.f14603switch) {
                        c6956l9.firebase(c16395l8);
                    } else {
                        c6956l9.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l9, interfaceC10835lAmazon8, C3438l.mopub);
                    AbstractC8182l.billing(c6956l9, interfaceC18556lSmaato8, C3438l.billing);
                    AbstractC8182l.billing(c6956l9, Integer.valueOf(i10), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l9, C3438l.firebase);
                    AbstractC8182l.billing(c6956l9, interfaceC17242lBilling8, C3438l.amazon);
                    function2.invoke(c6956l9, 0);
                    c6956l9.startapp(true);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC13010l.yandex(C11090l.yandex(AbstractC8644l.yandex(c6956l10, AbstractC4049l.crashlytics), 0L, 0L, null, null, 0L, 0L, null, null, 16744447), function2, c6956l10, 0);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC12853l.crashlytics(function2, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C13393l(Function2 function2, int i, byte b) {
        this.f26304l = i;
        this.f26303l = function2;
    }
}
