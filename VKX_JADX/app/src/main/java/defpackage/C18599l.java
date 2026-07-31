package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18599l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f36327l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36328l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f36329l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f36330l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36331l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f36332l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f36333l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f36334l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f36335l;

    public /* synthetic */ C18599l(C15578l c15578l, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f36327l = c15578l;
        this.f36333l = obj;
        this.f36332l = obj2;
        this.f36335l = obj3;
        this.f36328l = obj4;
        this.f36329l = obj5;
        this.f36334l = obj6;
        this.f36330l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        ArrayList arrayList;
        Object obj4;
        Object obj5;
        int i;
        ArrayList arrayList2;
        C9754l c9754l;
        Object obj6;
        Integer numValueOf;
        final int iIntValue;
        int iMo870l;
        int iCrashlytics;
        Object obj7;
        Object obj8;
        int iMo870l2;
        int iMo870l3;
        int i2;
        int i3 = this.f36331l;
        int i4 = this.f36330l;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                this.f36327l.smaato(this.f36333l, this.f36332l, this.f36335l, this.f36328l, this.f36329l, this.f36334l, (C6956l) obj, AbstractC0545l.purchase(i4) | 1);
                return Unit.INSTANCE;
            default:
                final InterfaceC10137l interfaceC10137l = (InterfaceC10137l) this.f36333l;
                Function2 function2 = (Function2) this.f36332l;
                Function2 function3 = (Function2) this.f36335l;
                Function2 function4 = (Function2) this.f36328l;
                Function2 function5 = (Function2) this.f36329l;
                C3518l c3518l = (C3518l) this.f36334l;
                final InterfaceC15847l interfaceC15847l = (InterfaceC15847l) obj;
                C15519l c15519l = (C15519l) obj2;
                final int iAdmob = C15519l.admob(c15519l.yandex);
                final int iMopub = C15519l.mopub(c15519l.yandex);
                long jYandex = C15519l.yandex(0, 0, 0, 0, 10, c15519l.yandex);
                int iAmazon = interfaceC10137l.amazon(interfaceC15847l, interfaceC15847l.getLayoutDirection());
                int iLoadAd = interfaceC10137l.loadAd(interfaceC15847l, interfaceC15847l.getLayoutDirection());
                int iCrashlytics2 = interfaceC10137l.crashlytics(interfaceC15847l);
                List listAds = interfaceC15847l.ads(EnumC8267l.f17167l, function2);
                ArrayList arrayList3 = new ArrayList(listAds.size());
                int size = listAds.size();
                int i5 = 0;
                while (i5 < size) {
                    arrayList3.add(((InterfaceC6357l) listAds.get(i5)).adcel(jYandex));
                    i5++;
                    listAds = listAds;
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i6 = ((AbstractC10113l) obj3).f20591l;
                    int iSmaato = AbstractC14055l.smaato(arrayList3);
                    if (1 <= iSmaato) {
                        int i7 = i6;
                        Object obj9 = obj3;
                        int i8 = 1;
                        while (true) {
                            Object obj10 = arrayList3.get(i8);
                            arrayList = arrayList3;
                            int i9 = ((AbstractC10113l) obj10).f20591l;
                            if (i7 < i9) {
                                i7 = i9;
                                obj9 = obj10;
                            }
                            if (i8 != iSmaato) {
                                i8++;
                                arrayList3 = arrayList;
                            } else {
                                obj3 = obj9;
                            }
                        }
                    } else {
                        arrayList = arrayList3;
                    }
                }
                AbstractC10113l abstractC10113l = (AbstractC10113l) obj3;
                int i10 = abstractC10113l != null ? abstractC10113l.f20591l : 0;
                List listAds2 = interfaceC15847l.ads(EnumC8267l.f17165l, function3);
                ArrayList arrayList4 = new ArrayList(listAds2.size());
                int size2 = listAds2.size();
                int i11 = 0;
                while (i11 < size2) {
                    arrayList4.add(((InterfaceC6357l) listAds2.get(i11)).adcel(AbstractC7563l.subs((-iAmazon) - iLoadAd, jYandex, -iCrashlytics2)));
                    i11++;
                    size2 = size2;
                    listAds2 = listAds2;
                }
                if (arrayList4.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList4.get(0);
                    int i12 = ((AbstractC10113l) obj4).f20591l;
                    int iSmaato2 = AbstractC14055l.smaato(arrayList4);
                    if (1 <= iSmaato2) {
                        int i13 = i12;
                        Object obj11 = obj4;
                        int i14 = 1;
                        while (true) {
                            Object obj12 = arrayList4.get(i14);
                            int i15 = ((AbstractC10113l) obj12).f20591l;
                            if (i13 < i15) {
                                i13 = i15;
                                obj11 = obj12;
                            }
                            if (i14 != iSmaato2) {
                                i14++;
                            } else {
                                obj4 = obj11;
                            }
                        }
                    }
                }
                AbstractC10113l abstractC10113l2 = (AbstractC10113l) obj4;
                int i16 = abstractC10113l2 != null ? abstractC10113l2.f20591l : 0;
                if (arrayList4.isEmpty()) {
                    i = i16;
                    arrayList2 = arrayList4;
                    obj5 = null;
                } else {
                    obj5 = arrayList4.get(0);
                    int i17 = ((AbstractC10113l) obj5).f20592l;
                    int iSmaato3 = AbstractC14055l.smaato(arrayList4);
                    i = i16;
                    if (1 <= iSmaato3) {
                        int i18 = 1;
                        while (true) {
                            Object obj13 = arrayList4.get(i18);
                            arrayList2 = arrayList4;
                            int i19 = ((AbstractC10113l) obj13).f20592l;
                            if (i17 < i19) {
                                i17 = i19;
                                obj5 = obj13;
                            }
                            if (i18 != iSmaato3) {
                                i18++;
                                arrayList4 = arrayList2;
                            }
                        }
                    } else {
                        arrayList2 = arrayList4;
                    }
                }
                AbstractC10113l abstractC10113l3 = (AbstractC10113l) obj5;
                int i20 = abstractC10113l3 != null ? abstractC10113l3.f20592l : 0;
                List listAds3 = interfaceC15847l.ads(EnumC8267l.f17169l, function4);
                final ArrayList arrayList5 = new ArrayList(listAds3.size());
                int size3 = listAds3.size();
                int i21 = 0;
                while (i21 < size3) {
                    int i22 = i20;
                    List list = listAds3;
                    int i23 = size3;
                    int i24 = iAmazon;
                    AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) listAds3.get(i21)).adcel(AbstractC7563l.subs((-iAmazon) - iLoadAd, jYandex, -iCrashlytics2));
                    if (abstractC10113lAdcel.f20591l == 0 || abstractC10113lAdcel.f20592l == 0) {
                        abstractC10113lAdcel = null;
                    }
                    if (abstractC10113lAdcel != null) {
                        arrayList5.add(abstractC10113lAdcel);
                    }
                    i21++;
                    i20 = i22;
                    listAds3 = list;
                    iAmazon = i24;
                    size3 = i23;
                }
                final int i25 = i20;
                int i26 = iAmazon;
                if (arrayList5.isEmpty()) {
                    c9754l = null;
                } else {
                    if (arrayList5.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList5.get(0);
                        int i27 = ((AbstractC10113l) obj7).f20592l;
                        int iSmaato4 = AbstractC14055l.smaato(arrayList5);
                        if (1 <= iSmaato4) {
                            int i28 = 1;
                            while (true) {
                                Object obj14 = arrayList5.get(i28);
                                int i29 = ((AbstractC10113l) obj14).f20592l;
                                if (i27 < i29) {
                                    i27 = i29;
                                    obj7 = obj14;
                                }
                                if (i28 != iSmaato4) {
                                    i28++;
                                }
                            }
                        }
                    }
                    int i30 = ((AbstractC10113l) obj7).f20592l;
                    if (arrayList5.isEmpty()) {
                        obj8 = null;
                    } else {
                        obj8 = arrayList5.get(0);
                        int i31 = ((AbstractC10113l) obj8).f20591l;
                        int iSmaato5 = AbstractC14055l.smaato(arrayList5);
                        if (1 <= iSmaato5) {
                            int i32 = 1;
                            while (true) {
                                Object obj15 = arrayList5.get(i32);
                                int i33 = ((AbstractC10113l) obj15).f20591l;
                                if (i31 < i33) {
                                    i31 = i33;
                                    obj8 = obj15;
                                }
                                if (i32 != iSmaato5) {
                                    i32++;
                                }
                            }
                        }
                    }
                    int i34 = ((AbstractC10113l) obj8).f20591l;
                    EnumC9931l enumC9931l = EnumC9931l.f20223l;
                    if (i4 == 0) {
                        if (interfaceC15847l.getLayoutDirection() == enumC9931l) {
                            iMo870l2 = interfaceC15847l.mo870l(16.0f);
                            i2 = iMo870l2 + i26;
                        } else {
                            iMo870l3 = interfaceC15847l.mo870l(16.0f);
                            i2 = ((iAdmob - iMo870l3) - i30) - iLoadAd;
                        }
                    } else if (i4 != 2 && i4 != 3) {
                        i2 = (((iAdmob - i30) + i26) - iLoadAd) / 2;
                    } else if (interfaceC15847l.getLayoutDirection() == enumC9931l) {
                        iMo870l3 = interfaceC15847l.mo870l(16.0f);
                        i2 = ((iAdmob - iMo870l3) - i30) - iLoadAd;
                    } else {
                        iMo870l2 = interfaceC15847l.mo870l(16.0f);
                        i2 = iMo870l2 + i26;
                    }
                    c9754l = new C9754l(i2, i34, 3);
                }
                List listAds4 = interfaceC15847l.ads(EnumC8267l.f17168l, function5);
                final ArrayList arrayList6 = new ArrayList(listAds4.size());
                int size4 = listAds4.size();
                for (int i35 = 0; i35 < size4; i35++) {
                    arrayList6.add(((InterfaceC6357l) listAds4.get(i35)).adcel(jYandex));
                }
                if (arrayList6.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList6.get(0);
                    int i36 = ((AbstractC10113l) obj6).f20591l;
                    int iSmaato6 = AbstractC14055l.smaato(arrayList6);
                    if (1 <= iSmaato6) {
                        int i37 = 1;
                        while (true) {
                            Object obj16 = arrayList6.get(i37);
                            int i38 = ((AbstractC10113l) obj16).f20591l;
                            if (i36 < i38) {
                                i36 = i38;
                                obj6 = obj16;
                            }
                            if (i37 != iSmaato6) {
                                i37++;
                            }
                        }
                    }
                }
                AbstractC10113l abstractC10113l4 = (AbstractC10113l) obj6;
                Integer numValueOf2 = abstractC10113l4 != null ? Integer.valueOf(abstractC10113l4.f20591l) : null;
                if (c9754l != null) {
                    int i39 = c9754l.f19892l;
                    if (numValueOf2 == null || i4 == 3) {
                        iMo870l = interfaceC15847l.mo870l(16.0f) + i39;
                        iCrashlytics = interfaceC10137l.crashlytics(interfaceC15847l);
                    } else {
                        iMo870l = numValueOf2.intValue() + i39;
                        iCrashlytics = interfaceC15847l.mo870l(16.0f);
                    }
                    numValueOf = Integer.valueOf(iCrashlytics + iMo870l);
                } else {
                    numValueOf = null;
                }
                if (i != 0) {
                    iIntValue = i + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : interfaceC10137l.crashlytics(interfaceC15847l));
                } else {
                    iIntValue = 0;
                }
                C13421l c13421l = new C13421l(interfaceC10137l, interfaceC15847l);
                c3518l.yandex.setValue(new C17253l(AbstractC3605l.billing(c13421l, interfaceC15847l.getLayoutDirection()), arrayList.isEmpty() ? c13421l.amazon() : interfaceC15847l.mo872static(i10), AbstractC3605l.purchase(c13421l, interfaceC15847l.getLayoutDirection()), numValueOf2 != null ? interfaceC15847l.mo872static(numValueOf2.intValue()) : c13421l.yandex()));
                List listAds5 = interfaceC15847l.ads(EnumC8267l.f17166l, new C15578l(-278021671, true, new C10848l(this.f36327l, c3518l, 10)));
                final ArrayList arrayList7 = new ArrayList(listAds5.size());
                int size5 = listAds5.size();
                for (int i40 = 0; i40 < size5; i40++) {
                    arrayList7.add(((InterfaceC6357l) listAds5.get(i40)).adcel(jYandex));
                }
                final Integer num = numValueOf2;
                final C9754l c9754l2 = c9754l;
                final Integer num2 = numValueOf;
                final ArrayList arrayList8 = arrayList;
                final ArrayList arrayList9 = arrayList2;
                return interfaceC15847l.isVip(iAdmob, iMopub, C14054l.f27396l, new Function1() { // from class: lٟؔۤ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj17) {
                        int i41;
                        AbstractC9601l abstractC9601l = (AbstractC9601l) obj17;
                        ArrayList arrayList10 = arrayList7;
                        int size6 = arrayList10.size();
                        for (int i42 = 0; i42 < size6; i42++) {
                            abstractC9601l.mopub((AbstractC10113l) arrayList10.get(i42), 0, 0, 0.0f);
                        }
                        ArrayList arrayList11 = arrayList8;
                        int size7 = arrayList11.size();
                        for (int i43 = 0; i43 < size7; i43++) {
                            abstractC9601l.mopub((AbstractC10113l) arrayList11.get(i43), 0, 0, 0.0f);
                        }
                        ArrayList arrayList12 = arrayList9;
                        int size8 = arrayList12.size();
                        int i44 = 0;
                        while (true) {
                            i41 = iMopub;
                            if (i44 >= size8) {
                                break;
                            }
                            AbstractC10113l abstractC10113l5 = (AbstractC10113l) arrayList12.get(i44);
                            int i45 = iAdmob - i25;
                            InterfaceC15847l interfaceC15847l2 = interfaceC15847l;
                            EnumC9931l layoutDirection = interfaceC15847l2.getLayoutDirection();
                            InterfaceC10137l interfaceC10137l2 = interfaceC10137l;
                            abstractC9601l.mopub(abstractC10113l5, ((interfaceC10137l2.amazon(interfaceC15847l2, layoutDirection) + i45) - interfaceC10137l2.loadAd(interfaceC15847l2, interfaceC15847l2.getLayoutDirection())) / 2, i41 - iIntValue, 0.0f);
                            i44++;
                        }
                        ArrayList arrayList13 = arrayList6;
                        int size9 = arrayList13.size();
                        for (int i46 = 0; i46 < size9; i46++) {
                            AbstractC10113l abstractC10113l6 = (AbstractC10113l) arrayList13.get(i46);
                            Integer num3 = num;
                            abstractC9601l.mopub(abstractC10113l6, 0, i41 - (num3 != null ? num3.intValue() : 0), 0.0f);
                        }
                        C9754l c9754l3 = c9754l2;
                        if (c9754l3 != null) {
                            ArrayList arrayList14 = arrayList5;
                            int size10 = arrayList14.size();
                            for (int i47 = 0; i47 < size10; i47++) {
                                abstractC9601l.mopub((AbstractC10113l) arrayList14.get(i47), c9754l3.f19893l, i41 - num2.intValue(), 0.0f);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                });
        }
    }

    public /* synthetic */ C18599l(InterfaceC10137l interfaceC10137l, Function2 function2, Function2 function3, Function2 function4, int i, Function2 function5, C3518l c3518l, C15578l c15578l) {
        this.f36333l = interfaceC10137l;
        this.f36332l = function2;
        this.f36335l = function3;
        this.f36328l = function4;
        this.f36330l = i;
        this.f36329l = function5;
        this.f36334l = c3518l;
        this.f36327l = c15578l;
    }
}
