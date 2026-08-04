package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٖؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3127l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6709l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6710l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6711l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f6712l;

    public C3127l(C17408l c17408l, InterfaceC2262l interfaceC2262l, InterfaceC12244l interfaceC12244l) {
        this.f6711l = 6;
        C0702l c0702l = EnumC10468l.f21321l;
        this.f6710l = c17408l;
        this.f6712l = interfaceC2262l;
        this.f6709l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        Object obj5;
        Object obj6;
        int i5;
        int i6;
        Object obj7;
        int i7;
        int i8;
        int i9;
        C6956l c6956l;
        C15578l c15578lAmazon;
        int i10;
        int i11;
        Object obj8;
        int i12;
        C15578l c15578l;
        int i13 = this.f6711l;
        InterfaceC14029l interfaceC14029l = null;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        Object obj9 = this.f6712l;
        Object obj10 = this.f6710l;
        int i14 = 16;
        Object obj11 = this.f6709l;
        int i15 = 2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i16 = 1;
        switch (i13) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj9;
                if ((iIntValue2 & 6) == 0) {
                    i = (c6956l2.billing(c7091l) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l2.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l2.m2127for(i & 1, (i & 147) != 146)) {
                    Map.Entry entry = (Map.Entry) ((List) obj10).get(iIntValue);
                    c6956l2.m2123default(-1390207557);
                    String str = (String) entry.getKey();
                    C7968l c7968l = (C7968l) entry.getValue();
                    String strAmazon = AbstractC11999l.amazon(R.string.as2_scenario_bluetooth_pair_added_txt, new Object[]{c7968l.f16617l}, c6956l2);
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, c4346l), 16.0f, 0.0f, 2);
                    C5766l c5766l = (C5766l) obj11;
                    boolean zAdmob = c6956l2.admob(interfaceC2262l) | c6956l2.billing(str);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C3768l(interfaceC2262l, str, 4);
                        c6956l2.m2147try(objM2132native);
                    }
                    c5766l.m1853public(R.drawable.ic_bluetooth_outline_28, strAmazon, c7968l, (Function1) objM2132native, interfaceC17242lVip, c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l3.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l3.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l3.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    C15413l c15413l = (C15413l) ((List) obj10).get(iIntValue3);
                    c6956l3.m2123default(-927831402);
                    ((C4456l) obj11).signatures(c15413l, ((Boolean) ((InterfaceC12244l) obj9).getValue()).booleanValue(), AbstractC0080l.amazon(c4346l, 1.0f), c6956l3, 384);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C7091l c7091l3 = (C7091l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6956l c6956l4 = (C6956l) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                C4975l c4975l = (C4975l) obj11;
                C5073l c5073l = (C5073l) obj9;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (c6956l4.billing(c7091l3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= c6956l4.amazon(iIntValue5) ? 32 : 16;
                }
                if (c6956l4.m2127for(i3 & 1, (i3 & 147) != 146)) {
                    int i17 = i3 & 126;
                    C7117l c7117l = (C7117l) ((List) obj10).get(iIntValue5);
                    c6956l4.m2123default(2101332047);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    boolean zAdmob2 = c6956l4.admob(c4975l) | c6956l4.billing(c5073l) | ((((i3 & 112) ^ 48) > 32 && c6956l4.amazon(iIntValue5)) || (i3 & 48) == 32);
                    Object objM2132native2 = c6956l4.m2132native();
                    Object obj12 = objM2132native2;
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C0946l c0946l = new C0946l(c4975l, c5073l, iIntValue5);
                        c6956l4.m2147try(c0946l);
                        obj12 = c0946l;
                    }
                    Function1 function1 = (Function1) obj12;
                    boolean zAdmob3 = c6956l4.admob(c4975l) | c6956l4.billing(c5073l) | c6956l4.admob(c7117l);
                    Object objM2132native3 = c6956l4.m2132native();
                    Object obj13 = objM2132native3;
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C0340l c0340l = new C0340l(c4975l, c5073l, c7117l);
                        c6956l4.m2147try(c0340l);
                        obj13 = c0340l;
                    }
                    c4975l.m1658import(function1, (Function0) obj13, iIntValue5, c7117l, interfaceC17242lSmaato, c6956l4, ((i17 << 3) & 896) | 24576);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C7091l c7091l4 = (C7091l) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C6956l c6956l5 = (C6956l) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                C2994l c2994l = (C2994l) obj9;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj11;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (c6956l5.billing(c7091l4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= c6956l5.amazon(iIntValue7) ? 32 : 16;
                }
                if (c6956l5.m2127for(i4 & 1, (i4 & 147) != 146)) {
                    C2882l c2882l = (C2882l) ((List) obj10).get(iIntValue7);
                    c6956l5.m2123default(-245053775);
                    boolean zBilling = c6956l5.billing(c2882l);
                    Object objM2132native4 = c6956l5.m2132native();
                    if (zBilling || objM2132native4 == c13863l) {
                        obj5 = objM2132native4;
                        C13765l c13765l = new C13765l(((c2882l.f6279l + 12.0f) / 24.0f) * 100.0f);
                        c6956l5.m2147try(c13765l);
                        obj5 = c13765l;
                    }
                    C13765l c13765l2 = (C13765l) obj5;
                    boolean zCrashlytics = c6956l5.crashlytics(c13765l2.admob());
                    Object objM2132native5 = c6956l5.m2132native();
                    if (zCrashlytics || objM2132native5 == c13863l) {
                        float fAdmob = ((c13765l2.admob() / 100.0f) * 24.0f) - 12.0f;
                        float fPow = (float) Math.pow(10.0d, 1.0d);
                        Float fValueOf = Float.valueOf(AbstractC5573l.ads(fAdmob * fPow) / fPow);
                        c6956l5.m2147try(fValueOf);
                        obj6 = fValueOf;
                    } else {
                        obj6 = objM2132native5;
                    }
                    float fFloatValue = ((Number) obj6).floatValue();
                    float fAdmob2 = c13765l2.admob();
                    C12015l c12015l = new C12015l(0.0f, 100.0f);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling2 = c6956l5.billing(c13765l2);
                    Object objM2132native6 = c6956l5.m2132native();
                    Object obj14 = objM2132native6;
                    if (zBilling2 || objM2132native6 == c13863l) {
                        C6238l c6238l = new C6238l(14, c13765l2);
                        c6956l5.m2147try(c6238l);
                        obj14 = c6238l;
                    }
                    Function1 function2 = (Function1) obj14;
                    boolean zBilling3 = c6956l5.billing(interfaceC8714l) | c6956l5.admob(c2994l) | c6956l5.admob(c2882l) | c6956l5.crashlytics(fFloatValue);
                    Object objM2132native7 = c6956l5.m2132native();
                    Object obj15 = objM2132native7;
                    if (zBilling3 || objM2132native7 == c13863l) {
                        C16887l c16887l = new C16887l(c2994l, c2882l, fFloatValue, interfaceC8714l);
                        c6956l5.m2147try(c16887l);
                        obj15 = c16887l;
                    }
                    AbstractC5832l.yandex(fAdmob2, function2, interfaceC17242lAmazon, null, false, (Function0) obj15, AbstractC14566l.amazon(1292125031, new C17208l(1, c2882l), c6956l5), AbstractC14566l.amazon(-1770710970, new C13902l(fFloatValue), c6956l5), null, 0.0f, 252, c12015l, c6956l5, 14156160);
                    AbstractC9334l.yandex(c6956l5, AbstractC0080l.purchase(c4346l, 16.0f));
                    c6956l5.startapp(false);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                C7091l c7091l5 = (C7091l) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                C6956l c6956l6 = (C6956l) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                C17984l c17984l = (C17984l) obj11;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (c6956l6.billing(c7091l5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= c6956l6.amazon(iIntValue9) ? 32 : 16;
                }
                if (c6956l6.m2127for(i5 & 1, (i5 & 147) != 146)) {
                    C15050l c15050l = (C15050l) ((List) obj10).get(iIntValue9);
                    c6956l6.m2123default(-671216161);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l6, 0);
                    long j = c6956l6.f14595continue;
                    int i18 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l6, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l);
                    } else {
                        c6956l6.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l6, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l6, Integer.valueOf(i18), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l6, C3438l.firebase);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling, C3438l.amazon);
                    int i19 = AbstractC15548l.yandex;
                    C15087l c15087lYandex = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l6, 510);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob4 = c6956l6.admob(c17984l) | c6956l6.admob(c15050l);
                    Object objM2132native8 = c6956l6.m2132native();
                    Object obj16 = objM2132native8;
                    if (zAdmob4 || objM2132native8 == c13863l) {
                        C0340l c0340l2 = new C0340l(c17984l, c15050l, z ? 1 : 0, 23);
                        c6956l6.m2147try(c0340l2);
                        obj16 = c0340l2;
                    }
                    AbstractC13319l.yandex(AbstractC14566l.amazon(1460795058, new C10305l(c15050l, z2 ? 1 : 0), c6956l6), AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) obj16, 15), null, null, AbstractC14566l.amazon(1090577966, new C10305l(c15050l, 1), c6956l6), AbstractC14566l.amazon(998023693, new C6640l(c15050l, (InterfaceC8714l) obj9, 8), c6956l6), c15087lYandex, c6956l6, 221190, 396);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l6, 0, 7);
                    c6956l6.startapp(true);
                    c6956l6.startapp(false);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C7091l c7091l6 = (C7091l) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                C6956l c6956l7 = (C6956l) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                C5866l c5866l = (C5866l) obj9;
                C14965l c14965l = (C14965l) obj11;
                if ((iIntValue12 & 6) == 0) {
                    i6 = (c6956l7.billing(c7091l6) ? 4 : 2) | iIntValue12;
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= c6956l7.amazon(iIntValue11) ? 32 : 16;
                }
                if (c6956l7.m2127for(i6 & 1, (i6 & 147) != 146)) {
                    C5726l c5726l = (C5726l) ((List) obj10).get(iIntValue11);
                    c6956l7.m2123default(-953023052);
                    Unit unit = Unit.INSTANCE;
                    boolean zAdmob5 = c6956l7.admob(c14965l) | c6956l7.admob(c5726l);
                    Object objM2132native9 = c6956l7.m2132native();
                    if (zAdmob5 || objM2132native9 == c13863l) {
                        obj7 = objM2132native9;
                        C15559l c15559l = new C15559l(c14965l, c5726l, interfaceC14029l, 27);
                        c6956l7.m2147try(c15559l);
                        obj7 = c15559l;
                    }
                    AbstractC12311l.amazon(c6956l7, unit, (Function2) obj7);
                    boolean zBilling4 = c6956l7.billing(c5866l);
                    Object objM2132native10 = c6956l7.m2132native();
                    Object obj17 = objM2132native10;
                    if (zBilling4 || objM2132native10 == c13863l) {
                        C11640l c11640l = new C11640l(c5866l, interfaceC14029l, i15);
                        c6956l7.m2147try(c11640l);
                        obj17 = c11640l;
                    }
                    AbstractC12311l.amazon(c6956l7, unit, (Function2) obj17);
                    AbstractC7229l.yandex(c5726l, AbstractC0080l.vip(AbstractC6660l.subs(AbstractC5020l.mopub(c7091l6), 4.0f, ((C0260l) c6956l7.isPro(AbstractC14696l.yandex)).amazon, false, 28), 400.0f), c6956l7, 0);
                    c6956l7.startapp(false);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                C7091l c7091l7 = (C7091l) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                C6956l c6956l8 = (C6956l) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) obj9;
                C17408l c17408l = (C17408l) obj10;
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (c6956l8.billing(c7091l7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= c6956l8.amazon(iIntValue13) ? 32 : 16;
                }
                if (c6956l8.m2127for(i7 & 1, (i7 & 147) != 146)) {
                    EnumC10468l enumC10468l = (EnumC10468l) EnumC10468l.f21324l.get(iIntValue13);
                    c6956l8.m2123default(-708120141);
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob6 = c6956l8.admob(c17408l) | c6956l8.admob(interfaceC2262l2) | c6956l8.amazon(enumC10468l.ordinal());
                    Object objM2132native11 = c6956l8.m2132native();
                    int i20 = 6;
                    if (zAdmob6 || objM2132native11 == c13863l) {
                        objM2132native11 = new C17749l(c17408l, interfaceC2262l2, enumC10468l, i20);
                        c6956l8.m2147try(objM2132native11);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native11, 15);
                    int i21 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC14566l.amazon(-909732273, new C0976l(i20, enumC10468l), c6956l8), interfaceC17242lLoadAd, null, null, null, AbstractC14566l.amazon(-1668095212, new C6640l(enumC10468l, (InterfaceC12244l) obj11, 12), c6956l8), AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l8, 510), c6956l8, 196614, 412);
                    c6956l8.startapp(false);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                C18306l c18306l = (C18306l) obj11;
                C7091l c7091l8 = (C7091l) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                C6956l c6956l9 = (C6956l) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (c6956l9.billing(c7091l8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= c6956l9.amazon(iIntValue15) ? 32 : 16;
                }
                if (c6956l9.m2127for(i8 & 1, (i8 & 147) != 146)) {
                    InterfaceC7270l interfaceC7270l = (InterfaceC7270l) ((AbstractC18082l) obj10).get(iIntValue15);
                    c6956l9.m2123default(-1596471243);
                    if (interfaceC7270l instanceof C15517l) {
                        c6956l9.m2123default(-1596395325);
                        c18306l.m4510const(((C15517l) interfaceC7270l).yandex, ((C12708l) obj9).purchase, iIntValue15 + 1, c6956l9, 0);
                        c6956l9.startapp(false);
                    } else {
                        if (!(interfaceC7270l instanceof C8747l)) {
                            throw AbstractC12900l.billing(-1714067058, c6956l9, false);
                        }
                        c6956l9.m2123default(-1596008011);
                        c18306l.m4517public(((C8747l) interfaceC7270l).yandex, c6956l9, 0);
                        c6956l9.startapp(false);
                    }
                    c6956l9.startapp(false);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C7091l c7091l9 = (C7091l) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                C6956l c6956l10 = (C6956l) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                AbstractC14968l abstractC14968l = (AbstractC14968l) obj9;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj11;
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (c6956l10.billing(c7091l9) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= c6956l10.amazon(iIntValue17) ? 32 : 16;
                }
                if (c6956l10.m2127for(i9 & 1, (i9 & 147) != 146)) {
                    AbstractC8045l abstractC8045l = (AbstractC8045l) ((List) obj10).get(iIntValue17);
                    c6956l10.m2123default(-834678510);
                    if (abstractC8045l instanceof C12451l) {
                        c6956l10.m2123default(-834723833);
                        AbstractC13693l.yandex(((C12451l) abstractC8045l).yandex, 432, c6956l10, false, false);
                        c6956l10.startapp(false);
                    } else if (abstractC8045l instanceof C6835l) {
                        c6956l10.m2123default(-834536376);
                        AbstractC13693l.yandex(R.string.rec_screen_genres_notice, 432, c6956l10, false, false);
                        c6956l10.startapp(false);
                    } else {
                        if (abstractC8045l instanceof C17004l) {
                            c6956l10.m2123default(-834337883);
                            boolean zBooleanValue = ((Boolean) interfaceC12244l.getValue()).booleanValue();
                            C17004l c17004l = (C17004l) abstractC8045l;
                            boolean zBilling5 = c6956l10.billing(abstractC8045l) | c6956l10.billing(interfaceC12244l) | c6956l10.admob(abstractC14968l);
                            Object objM2132native12 = c6956l10.m2132native();
                            if (zBilling5 || objM2132native12 == c13863l) {
                                objM2132native12 = new C17749l(c17004l, abstractC14968l, interfaceC12244l, 12);
                                c6956l10.m2147try(objM2132native12);
                            }
                            AbstractC13693l.loadAd(zBooleanValue, c17004l, (Function0) objM2132native12, c6956l10, 0);
                            c6956l10.startapp(false);
                        } else if (abstractC8045l instanceof C8789l) {
                            c6956l10.m2123default(-833860607);
                            C8789l c8789l = (C8789l) abstractC8045l;
                            Function2 function2Amazon = c8789l.loadAd;
                            if (c8789l.amazon != 0) {
                                c6956l10.m2123default(-833799227);
                                c15578lAmazon = AbstractC14566l.amazon(-124878400, new C17447l(c8789l, i16), c6956l10);
                                c6956l10.startapp(false);
                            } else {
                                c6956l10.m2123default(-833595123);
                                c6956l10.startapp(false);
                                c15578lAmazon = null;
                            }
                            if (function2Amazon != null) {
                                c6956l10.m2123default(-833421182);
                                c6956l10.startapp(false);
                            } else {
                                c6956l10.m2123default(-833333700);
                                function2Amazon = AbstractC14566l.amazon(-339537599, new C17447l(c8789l, z3 ? 1 : 0), c6956l10);
                                c6956l10.startapp(false);
                            }
                            InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC9151l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), false, null, c8789l.purchase, 15);
                            Function2 function3 = c8789l.crashlytics;
                            int i22 = AbstractC15548l.yandex;
                            AbstractC13319l.yandex(function2Amazon, interfaceC17242lLoadAd2, null, function3, c15578lAmazon, null, AbstractC15548l.yandex(C9735l.isPro, 0L, ((C14370l) c6956l10.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, c6956l10, 506), c6956l10, 0, 420);
                            c6956l = c6956l10;
                            c6956l.startapp(false);
                        } else {
                            c6956l = c6956l10;
                            if (!AbstractC8576l.yandex(abstractC8045l, C12414l.yandex)) {
                                throw AbstractC12900l.billing(-1828040431, c6956l, false);
                            }
                            c6956l.m2123default(-831143674);
                            AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                            c6956l.startapp(false);
                        }
                        c6956l.startapp(false);
                    }
                    c6956l = c6956l10;
                    c6956l.startapp(false);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C18297l c18297l = (C18297l) obj;
                ((Boolean) obj2).getClass();
                C6956l c6956l11 = (C6956l) obj3;
                int iIntValue19 = ((Number) obj4).intValue();
                C17003l c17003l = (C17003l) obj10;
                CachedPlaylist cachedPlaylist = (CachedPlaylist) obj11;
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= c6956l11.billing(c18297l) ? 4 : 2;
                }
                if (c6956l11.m2127for(iIntValue19 & 1, (iIntValue19 & 131) != 130)) {
                    C15578l c15578lAmazon2 = AbstractC14566l.amazon(-856079706, new C6640l(c18297l, (InterfaceC1234l) obj9, i14), c6956l11);
                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling6 = c6956l11.billing(cachedPlaylist) | c6956l11.admob(c17003l);
                    Object objM2132native13 = c6956l11.m2132native();
                    if (zBilling6 || objM2132native13 == c13863l) {
                        objM2132native13 = new C16442l(cachedPlaylist, c17003l);
                        c6956l11.m2147try(objM2132native13);
                    }
                    Function0 function0 = (Function0) objM2132native13;
                    boolean zAdmob7 = c6956l11.admob(c17003l) | c6956l11.billing(cachedPlaylist);
                    Object objM2132native14 = c6956l11.m2132native();
                    if (zAdmob7 || objM2132native14 == c13863l) {
                        objM2132native14 = new C16442l(c17003l, cachedPlaylist);
                        c6956l11.m2147try(objM2132native14);
                    }
                    c17003l.m4252import(cachedPlaylist, c15578lAmazon2, AbstractC3605l.vip(AbstractC9151l.amazon(interfaceC17242lAmazon4, null, function0, null, (Function0) objM2132native14, 239), 16.0f, 0.0f, 2), c6956l11, 48);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C7091l c7091l10 = (C7091l) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                C6956l c6956l12 = (C6956l) obj3;
                int iIntValue21 = ((Number) obj4).intValue();
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj9;
                if ((iIntValue21 & 6) == 0) {
                    i10 = iIntValue21 | (c6956l12.billing(c7091l10) ? 4 : 2);
                } else {
                    i10 = iIntValue21;
                }
                if ((iIntValue21 & 48) == 0) {
                    i10 |= c6956l12.amazon(iIntValue20) ? 32 : 16;
                }
                if (c6956l12.m2127for(i10 & 1, (i10 & 147) != 146)) {
                    C12823l c12823l = ((C9229l) ((List) obj10).get(iIntValue20)).yandex;
                    c6956l12.m2123default(-199537967);
                    C0072l c0072l = (C0072l) obj11;
                    boolean zBilling7 = c6956l12.billing(interfaceC12244l2);
                    Object objM2132native15 = c6956l12.m2132native();
                    if (zBilling7 || objM2132native15 == c13863l) {
                        objM2132native15 = new C12803l(interfaceC12244l2, z4 ? 1 : 0);
                        c6956l12.m2147try(objM2132native15);
                    }
                    Function1 function4 = (Function1) objM2132native15;
                    boolean zBilling8 = c6956l12.billing(interfaceC12244l2);
                    Object objM2132native16 = c6956l12.m2132native();
                    if (zBilling8 || objM2132native16 == c13863l) {
                        objM2132native16 = new C12803l(interfaceC12244l2, i16);
                        c6956l12.m2147try(objM2132native16);
                    }
                    c0072l.m270import(c12823l, function4, (Function1) objM2132native16, c6956l12, 0);
                    c6956l12.startapp(false);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C7091l c7091l11 = (C7091l) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                C6956l c6956l13 = (C6956l) obj3;
                int iIntValue23 = ((Number) obj4).intValue();
                Function1 function5 = (Function1) obj11;
                if ((iIntValue23 & 6) == 0) {
                    i11 = iIntValue23 | (c6956l13.billing(c7091l11) ? 4 : 2);
                } else {
                    i11 = iIntValue23;
                }
                if ((iIntValue23 & 48) == 0) {
                    i11 |= c6956l13.amazon(iIntValue22) ? 32 : 16;
                }
                if (c6956l13.m2127for(i11 & 1, (i11 & 147) != 146)) {
                    C12885l c12885l = (C12885l) ((List) obj10).get(iIntValue22);
                    c6956l13.m2123default(21328099);
                    int i23 = AbstractC15548l.yandex;
                    C15087l c15087lYandex2 = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l13, 510);
                    InterfaceC17242l interfaceC17242lAmazon5 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling9 = c6956l13.billing(function5) | c6956l13.billing(c12885l);
                    Object objM2132native17 = c6956l13.m2132native();
                    if (zBilling9 || objM2132native17 == c13863l) {
                        obj8 = objM2132native17;
                        C10558l c10558l = new C10558l(function5, c12885l, i16);
                        c6956l13.m2147try(c10558l);
                        obj8 = c10558l;
                    }
                    AbstractC13319l.yandex(AbstractC14566l.amazon(-2042341771, new C9938l(c12885l, z5 ? 1 : 0), c6956l13), AbstractC9151l.loadAd(interfaceC17242lAmazon5, false, null, (Function0) obj8, 15), null, AbstractC14566l.amazon(932007634, new C9938l(c12885l, i16), c6956l13), null, null, c15087lYandex2, c6956l13, 3078, 436);
                    if (iIntValue22 != AbstractC14055l.smaato(((C2603l) obj9).f5665l)) {
                        c6956l13.m2123default(22198764);
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l13, 0, 7);
                    } else {
                        c6956l13.m2123default(10491087);
                    }
                    c6956l13.startapp(false);
                    c6956l13.startapp(false);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C7091l c7091l12 = (C7091l) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                C6956l c6956l14 = (C6956l) obj3;
                int iIntValue25 = ((Number) obj4).intValue();
                C0113l c0113l = (C0113l) obj11;
                if ((iIntValue25 & 6) == 0) {
                    i12 = iIntValue25 | (c6956l14.billing(c7091l12) ? 4 : 2);
                } else {
                    i12 = iIntValue25;
                }
                if ((iIntValue25 & 48) == 0) {
                    i12 |= c6956l14.amazon(iIntValue24) ? 32 : 16;
                }
                if (c6956l14.m2127for(i12 & 1, (i12 & 147) != 146)) {
                    UmaArtist umaArtist = (UmaArtist) ((List) obj10).get(iIntValue24);
                    c6956l14.m2123default(135747481);
                    String str2 = umaArtist.isPro;
                    if (str2 == null || str2.length() <= 0) {
                        c6956l14.m2123default(136115077);
                        c6956l14.startapp(false);
                        c15578l = null;
                    } else {
                        c6956l14.m2123default(135943710);
                        C15578l c15578lAmazon3 = AbstractC14566l.amazon(-637057127, new C2384l(umaArtist, z6 ? 1 : 0), c6956l14);
                        c6956l14.startapp(false);
                        c15578l = c15578lAmazon3;
                    }
                    InterfaceC17242l interfaceC17242lAmazon6 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob8 = c6956l14.admob(c0113l) | c6956l14.admob(umaArtist);
                    Object objM2132native18 = c6956l14.m2132native();
                    Object obj18 = objM2132native18;
                    if (zAdmob8 || objM2132native18 == c13863l) {
                        C10558l c10558l2 = new C10558l(c0113l, umaArtist, i15);
                        c6956l14.m2147try(c10558l2);
                        obj18 = c10558l2;
                    }
                    AbstractC13319l.yandex(AbstractC14566l.amazon(-1137081382, new C2384l(umaArtist, i16), c6956l14), AbstractC9151l.loadAd(interfaceC17242lAmazon6, false, null, (Function0) obj18, 15), null, c15578l, AbstractC14566l.amazon(141788758, new C6640l(umaArtist, (AbstractC14165l) obj9, 20), c6956l14), null, null, c6956l14, 24582, 484);
                    c6956l14.startapp(false);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3127l(Object obj, Object obj2, Object obj3, int i) {
        this.f6711l = i;
        this.f6710l = obj;
        this.f6709l = obj2;
        this.f6712l = obj3;
    }
}
