package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُؚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11237l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f22610l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22611l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f22612l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f22613l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22614l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f22615l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f22616l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f22617l;

    public /* synthetic */ C11237l(C13072l c13072l, C18159l c18159l, InterfaceC8714l interfaceC8714l, C6417l c6417l, C9894l c9894l, InterfaceC8714l interfaceC8714l2, InterfaceC2262l interfaceC2262l) {
        this.f22610l = c13072l;
        this.f22616l = c18159l;
        this.f22615l = interfaceC8714l;
        this.f22617l = c6417l;
        this.f22611l = c9894l;
        this.f22613l = interfaceC8714l2;
        this.f22612l = interfaceC2262l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l;
        int i = this.f22614l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f22612l;
        Object obj5 = this.f22611l;
        Object obj6 = this.f22617l;
        Object obj7 = this.f22615l;
        Object obj8 = this.f22616l;
        Object obj9 = this.f22610l;
        switch (i) {
            case 0:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj9;
                C18159l c18159l = (C18159l) obj8;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj7;
                C6417l c6417l = (C6417l) obj6;
                C9894l c9894l = (C9894l) obj5;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l2.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(c4346l, interfaceC11780l), interfaceC3102l.loadAd(), null);
                    boolean zAdmob = c6956l2.admob(c18159l) | c6956l2.billing(interfaceC8714l) | c6956l2.admob(c6417l) | c6956l2.billing(c9894l);
                    InterfaceC12244l interfaceC12244l = this.f22613l;
                    boolean zBilling = zAdmob | c6956l2.billing(interfaceC12244l) | c6956l2.admob(interfaceC2262l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        c6956l = c6956l2;
                        C2623l c2623l = new C2623l(c18159l, c6417l, interfaceC8714l, c9894l, interfaceC12244l, interfaceC2262l, 0);
                        c6956l.m2147try(c2623l);
                        objM2132native = c2623l;
                    } else {
                        c6956l = c6956l2;
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                Function1 function1 = (Function1) obj9;
                Function1 function2 = (Function1) obj8;
                Function1 function3 = (Function1) obj7;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj6;
                C13242l c13242l = (C13242l) obj5;
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l3.billing(interfaceC11780l2) ? 4 : 2;
                }
                int i2 = iIntValue2;
                if (c6956l3.m2127for(i2 & 1, (i2 & 19) != 18)) {
                    boolean zBooleanValue = ((Boolean) interfaceC12244l3.getValue()).booleanValue();
                    InterfaceC12244l interfaceC12244l4 = this.f22613l;
                    if (zBooleanValue && ((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l4.getValue())).isEmpty()) {
                        c6956l3.m2123default(-1551269698);
                        InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l2);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                        long j = c6956l3.f14595continue;
                        int i3 = (int) (j ^ (j >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lFirebase);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l);
                        } else {
                            c6956l3.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                        AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                        AbstractC8960l.loadAd(null, 0L, null, c6956l3, 0, 7);
                        c6956l3.startapp(true);
                        c6956l3.startapp(false);
                    } else if (((Boolean) interfaceC12244l3.getValue()).booleanValue() || !((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l4.getValue())).isEmpty()) {
                        c6956l3.m2123default(-1550878199);
                        boolean zBilling2 = c6956l3.billing(interfaceC12244l4) | c6956l3.billing(function1) | c6956l3.billing(function2) | c6956l3.billing(function3) | c6956l3.billing(interfaceC12244l2) | c6956l3.admob(c13242l);
                        Object objM2132native2 = c6956l3.m2132native();
                        if (zBilling2 || objM2132native2 == c13863l) {
                            C2623l c2623l2 = new C2623l(interfaceC12244l4, (Object) function1, (Object) function2, (Object) function3, interfaceC12244l2, (Object) c13242l, 5);
                            c6956l3.m2147try(c2623l2);
                            objM2132native2 = c2623l2;
                        }
                        AbstractC16336l.yandex(null, null, interfaceC11780l2, null, null, null, false, null, (Function1) objM2132native2, c6956l3, (i2 << 6) & 896, 507);
                        c6956l3.startapp(false);
                    } else {
                        c6956l3.m2123default(-1550993674);
                        c6956l3.startapp(false);
                    }
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C11237l(InterfaceC8714l interfaceC8714l, Function1 function1, Function1 function2, Function1 function3, InterfaceC8714l interfaceC8714l2, C13242l c13242l, InterfaceC8714l interfaceC8714l3) {
        this.f22613l = interfaceC8714l;
        this.f22610l = function1;
        this.f22616l = function2;
        this.f22615l = function3;
        this.f22617l = interfaceC8714l2;
        this.f22611l = c13242l;
        this.f22612l = interfaceC8714l3;
    }
}
