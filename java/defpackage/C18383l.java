package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: l٘ۨٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18383l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f35894l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f35895l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35896l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f35897l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f35898l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f35899l;

    public /* synthetic */ C18383l(C9231l c9231l, InterfaceC8714l interfaceC8714l, C0324l c0324l, InterfaceC8714l interfaceC8714l2, InterfaceC8714l interfaceC8714l3) {
        this.f35896l = 0;
        this.f35895l = c9231l;
        this.f35894l = interfaceC8714l;
        this.f35899l = c0324l;
        this.f35898l = interfaceC8714l2;
        this.f35897l = interfaceC8714l3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f35896l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f35899l;
        Object obj5 = this.f35897l;
        Object obj6 = this.f35898l;
        Object obj7 = this.f35894l;
        Object obj8 = this.f35895l;
        switch (i) {
            case 0:
                C9231l c9231l = (C9231l) obj8;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj7;
                C0324l c0324l = (C0324l) obj4;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj6;
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) obj5;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c6956l.m2124else();
                } else if (((Boolean) interfaceC12244l3.getValue()).booleanValue() && ((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l.getValue())).isEmpty()) {
                    c6956l.m2123default(1263998369);
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lFirebase);
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
                    AbstractC8960l.loadAd(null, 0L, null, c6956l, 0, 7);
                    c6956l.startapp(true);
                    c6956l.startapp(false);
                } else if (((Boolean) interfaceC12244l3.getValue()).booleanValue() || !((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l.getValue())).isEmpty()) {
                    c6956l.m2123default(1264464237);
                    boolean zAdmob = c6956l.admob(c9231l) | c6956l.billing(interfaceC12244l) | c6956l.admob(c0324l) | c6956l.billing(interfaceC12244l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C17796l(c9231l, interfaceC12244l, c0324l, interfaceC12244l2);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, interfaceC11780l, null, null, null, false, null, (Function1) objM2132native, c6956l, (iIntValue << 6) & 896, 507);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(1264305517);
                    c6956l.startapp(false);
                }
                break;
            case 1:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj8;
                C17136l c17136l = (C17136l) obj7;
                C11362l c11362l = (C11362l) obj6;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l2), interfaceC3102l.loadAd(), null);
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    boolean zAdmob2 = c6956l2.admob(c17136l) | c6956l2.billing(c11362l) | c6956l2.billing(interfaceC8714l) | c6956l2.admob(interfaceC13238l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C17796l(c11362l, interfaceC13238l, c17136l, interfaceC8714l, 4);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, c17253l, c7537l, null, null, false, null, (Function1) objM2132native2, c6956l2, 24960, 490);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C5866l c5866l = (C5866l) obj8;
                C0228l c0228l = (C0228l) obj7;
                C16307l c16307l = (C16307l) obj6;
                C5056l c5056l = (C5056l) obj5;
                InterfaceC1234l interfaceC1234l = (InterfaceC1234l) obj4;
                InterfaceC11780l interfaceC11780l3 = (InterfaceC11780l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC11780l3) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lFirebase2 = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l3);
                    boolean zAdmob3 = c6956l3.admob(c0228l) | c6956l3.admob(c16307l) | c6956l3.billing(c5056l) | c6956l3.admob(interfaceC1234l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C17796l(c0228l, c16307l, c5056l, interfaceC1234l, 10);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC16336l.yandex(interfaceC17242lFirebase2, c5866l, null, null, null, null, false, null, (Function1) objM2132native3, c6956l3, 0, 508);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                EnumC12999l enumC12999l = (EnumC12999l) obj8;
                Function1 function1 = (Function1) obj6;
                InterfaceC12244l interfaceC12244l4 = (InterfaceC12244l) obj7;
                Function0 function0 = (Function0) obj5;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj4;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zAmazon = c6956l4.amazon(enumC12999l == null ? -1 : enumC12999l.ordinal()) | c6956l4.billing(function1) | c6956l4.billing(interfaceC12244l4) | c6956l4.billing(function0);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zAmazon || objM2132native4 == c13863l) {
                        C2831l c2831l = new C2831l(enumC12999l, function1, interfaceC8714l2, interfaceC12244l4, function0);
                        c6956l4.m2147try(c2831l);
                        objM2132native4 = c2831l;
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native4, c6956l4, 0, 511);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                AbstractC13264l abstractC13264l = (AbstractC13264l) obj8;
                C0956l c0956l = (C0956l) obj6;
                C6523l c6523l = (C6523l) obj5;
                InterfaceC12244l interfaceC12244l5 = (InterfaceC12244l) obj7;
                C15308l c15308l = (C15308l) obj4;
                C0923l c0923l = (C0923l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l5.billing(c0923l) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    AbstractC7252l.yandex(abstractC13264l, AbstractC0080l.amazon(c4346l, 1.0f), AbstractC3605l.loadAd((c0923l.loadAd() - 180.0f) / 2.0f, 0.0f, 2), new C0457l(180.0f), 0.0f, null, null, false, null, null, null, AbstractC14566l.amazon(-344009786, new C2154l(c0956l, c6523l, interfaceC12244l5, c15308l), c6956l5), c6956l5, 48, 24576, 16368);
                } else {
                    c6956l5.m2124else();
                }
                break;
            default:
                C5866l c5866l2 = (C5866l) obj8;
                InterfaceC12244l interfaceC12244l6 = (InterfaceC12244l) obj7;
                C5056l c5056l2 = (C5056l) obj6;
                C17003l c17003l = (C17003l) obj5;
                InterfaceC1234l interfaceC1234l2 = (InterfaceC1234l) obj4;
                InterfaceC11780l interfaceC11780l4 = (InterfaceC11780l) obj;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c6956l6.billing(interfaceC11780l4) ? 4 : 2;
                }
                if (!c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    c6956l6.m2124else();
                } else if (((InterfaceC13238l) interfaceC12244l6.getValue()).isEmpty()) {
                    c6956l6.m2123default(-130327524);
                    AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l4), false, 0L, c6956l6, 0, 6);
                    c6956l6.startapp(false);
                } else {
                    c6956l6.m2123default(-133705904);
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(AbstractC3605l.firebase(c4346l, interfaceC11780l4), 1.0f);
                    C7537l c7537l2 = new C7537l(12.0f, true, new C8339l(12));
                    C17253l c17253lAmazon = AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, 16.0f, 7);
                    boolean zBilling = c6956l6.billing(interfaceC12244l6) | c6956l6.billing(c5056l2) | c6956l6.admob(c17003l) | c6956l6.admob(interfaceC1234l2);
                    Object objM2132native5 = c6956l6.m2132native();
                    if (zBilling || objM2132native5 == c13863l) {
                        objM2132native5 = new C17796l(interfaceC12244l6, c5056l2, c17003l, interfaceC1234l2);
                        c6956l6.m2147try(objM2132native5);
                    }
                    AbstractC16336l.yandex(interfaceC17242lCrashlytics, c5866l2, c17253lAmazon, c7537l2, null, null, false, null, (Function1) objM2132native5, c6956l6, 24960, 488);
                    c6956l6.startapp(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C18383l(C2887l c2887l, C0956l c0956l, C6523l c6523l, InterfaceC8714l interfaceC8714l, C15308l c15308l) {
        this.f35896l = 4;
        this.f35895l = c2887l;
        this.f35898l = c0956l;
        this.f35897l = c6523l;
        this.f35894l = interfaceC8714l;
        this.f35899l = c15308l;
    }

    public /* synthetic */ C18383l(EnumC12999l enumC12999l, Function1 function1, InterfaceC8714l interfaceC8714l, Function0 function0, InterfaceC8714l interfaceC8714l2) {
        this.f35896l = 3;
        this.f35895l = enumC12999l;
        this.f35898l = function1;
        this.f35894l = interfaceC8714l;
        this.f35897l = function0;
        this.f35899l = interfaceC8714l2;
    }

    public /* synthetic */ C18383l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f35896l = i;
        this.f35895l = obj;
        this.f35894l = obj2;
        this.f35898l = obj3;
        this.f35897l = obj4;
        this.f35899l = obj5;
    }
}
