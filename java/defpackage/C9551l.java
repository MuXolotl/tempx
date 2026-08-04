package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9551l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7246l f19459l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19460l;

    public /* synthetic */ C9551l(C7246l c7246l, int i) {
        this.f19460l = 0;
        this.f19459l = c7246l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19460l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        C7246l c7246l = this.f19459l;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c7246l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C7246l c7246l2 = this.f19459l;
                    boolean zAdmob = c6956l.admob(c7246l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C13246l c13246l = new C13246l(0, c7246l2, C7246l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 8);
                        c6956l.m2147try(c13246l);
                        objM2132native = c13246l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC2069l.subs, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c6956l2.m2124else();
                } else if (((Boolean) c7246l.f15079l.getValue()).booleanValue()) {
                    c6956l2.m2123default(847693706);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.find_duplicates_confirm_invert_text_off), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(847840491);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.find_duplicates_confirm_invert_text_on), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    c6956l2.startapp(false);
                }
                break;
            case 3:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) c7246l.f15079l.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l3.admob(c7246l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C15079l(23, c7246l);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) objM2132native2, null, false, null, c6956l3, 0, 124);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zAdmob3 = c6956l4.admob(c7246l);
                    Object objM2132native3 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C10752l(c7246l, z ? 1 : 0);
                        c6956l4.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC2069l.yandex, c6956l4, 805306368, 510);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 5:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zAdmob4 = c6956l5.admob(c7246l);
                    Object objM2132native4 = c6956l5.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C10752l(c7246l, i4);
                        c6956l5.m2147try(objM2132native4);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native4, null, false, null, null, null, AbstractC2069l.loadAd, c6956l5, 805306368, 510);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 6:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l6, 0);
                    long j = c6956l6.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
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
                    AbstractC8182l.billing(c6956l6, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l6, C3438l.firebase);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.find_duplicates_confirm_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                    int i6 = AbstractC15548l.yandex;
                    C15087l c15087lYandex = AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l6, 510);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob5 = c6956l6.admob(c7246l);
                    Object objM2132native5 = c6956l6.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C10752l(c7246l, 4);
                        c6956l6.m2147try(objM2132native5);
                    }
                    AbstractC13319l.yandex(AbstractC2069l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native5, 15), null, AbstractC14566l.amazon(-1754375798, new C9551l(c7246l, i2, z ? (byte) 1 : (byte) 0), c6956l6), null, AbstractC14566l.amazon(-1598133620, new C9551l(c7246l, i3, z ? (byte) 1 : (byte) 0), c6956l6), c15087lYandex, c6956l6, 199686, 404);
                    c6956l6.startapp(true);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 7:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zAdmob6 = c6956l7.admob(c7246l);
                    Object objM2132native6 = c6956l7.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        objM2132native6 = new C10752l(c7246l, i2);
                        c6956l7.m2147try(objM2132native6);
                    }
                    AbstractC15831l.yandex((Function0) objM2132native6, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, c6956l7, 48);
                } else {
                    c6956l7.m2124else();
                }
                break;
            default:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC4156l interfaceC4156l = (InterfaceC4156l) c7246l.f15076l.getValue();
                    C16102l c16102l = interfaceC4156l instanceof C16102l ? (C16102l) interfaceC4156l : null;
                    if ((c16102l != null ? c16102l.yandex : 0) > 0) {
                        c6956l8.m2123default(-1175047961);
                        C10707l c10707l = AbstractC16964l.yandex;
                        InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC3605l.firebase(AbstractC4927l.amazon(c4346l, ((C14370l) c6956l8.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), ((C15700l) c6956l8.isPro(AbstractC18678l.yandex)).loadAd(c6956l8)), 16.0f);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                        long j2 = c6956l8.f14595continue;
                        int i7 = (int) (j2 ^ (j2 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l8.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l8, interfaceC17242lSmaato);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l2 = C3438l.loadAd;
                        c6956l8.m2140super();
                        if (c6956l8.f14603switch) {
                            c6956l8.firebase(c16395l2);
                        } else {
                            c6956l8.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l8, interfaceC10835lAmazon, C3438l.mopub);
                        AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato2, C3438l.billing);
                        AbstractC8182l.billing(c6956l8, Integer.valueOf(i7), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l8, C3438l.firebase);
                        AbstractC8182l.billing(c6956l8, interfaceC17242lBilling2, C3438l.amazon);
                        int size = c7246l.f15075l.size();
                        boolean z2 = size > 0;
                        C6839l c6839l = ((C14370l) c6956l8.isPro(c10707l)).crashlytics.crashlytics;
                        C17253l c17253l = C12719l.yandex;
                        C13412l c13412lYandex = C12719l.yandex(((C14370l) c6956l8.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l8.isPro(c10707l)).yandex.license, 0L, 0L, c6956l8, 12);
                        C17253l c17253lLoadAd = AbstractC3605l.loadAd(0.0f, 8.0f, 1);
                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                        boolean zAdmob7 = c6956l8.admob(c7246l);
                        Object objM2132native7 = c6956l8.m2132native();
                        if (zAdmob7 || objM2132native7 == c13863l) {
                            objM2132native7 = new C10752l(c7246l, i3);
                            c6956l8.m2147try(objM2132native7);
                        }
                        AbstractC17457l.loadAd((Function0) objM2132native7, interfaceC17242lAmazon2, z2, c6839l, c13412lYandex, null, null, c17253lLoadAd, AbstractC14566l.amazon(-1330165877, new C8821l(size, 5), c6956l8), c6956l8, 817889328, 352);
                        c6956l8.startapp(true);
                    } else {
                        c6956l8.m2123default(-1189794010);
                    }
                    c6956l8.startapp(false);
                } else {
                    c6956l8.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9551l(C7246l c7246l, int i, byte b) {
        this.f19460l = i;
        this.f19459l = c7246l;
    }
}
