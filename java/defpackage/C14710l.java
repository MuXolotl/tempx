package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14710l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f28769l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f28770l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f28771l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f28772l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28773l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f28774l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f28775l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f28776l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f28777l;

    public /* synthetic */ C14710l(C0483l c0483l, C14974l c14974l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C15578l c15578l4, C15578l c15578l5, C15578l c15578l6, int i) {
        this.f28772l = c0483l;
        this.f28769l = c14974l;
        this.f28775l = c15578l;
        this.f28774l = c15578l2;
        this.f28777l = c15578l3;
        this.f28770l = c15578l4;
        this.f28771l = c15578l5;
        this.f28776l = c15578l6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f28773l;
        Object obj3 = this.f28776l;
        Object obj4 = this.f28771l;
        Object obj5 = this.f28770l;
        Object obj6 = this.f28777l;
        InterfaceC14328l interfaceC14328l = this.f28774l;
        Object obj7 = this.f28775l;
        Object obj8 = this.f28769l;
        Object obj9 = this.f28772l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0483l) obj9).amazon((C14974l) obj8, (C15578l) obj7, (C15578l) interfaceC14328l, (C15578l) obj6, (C15578l) obj5, (C15578l) obj4, (C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(1797553));
                break;
            default:
                C6523l c6523l = (C6523l) obj9;
                C6523l c6523l2 = (C6523l) obj8;
                C10178l c10178l = (C10178l) obj7;
                Function0 function0 = (Function0) interfaceC14328l;
                C10178l c10178l2 = (C10178l) obj6;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj4;
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C3790l c3790l = new C3790l(0, 6, 119);
                    boolean zBilling = c6956l.billing(c6523l);
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C9964l(c6523l, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    InterfaceC11381l interfaceC11381l = (InterfaceC11381l) objM2132native;
                    boolean z = !((Boolean) interfaceC8714l.getValue()).booleanValue();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC9966l.billing(AbstractC0080l.amazon(c4346l, 1.0f), c6523l2);
                    boolean zBilling2 = c6956l.billing(c6523l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C5901l(c6523l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC13702l.crashlytics(AbstractC17082l.crashlytics(interfaceC17242lBilling2, (Function1) objM2132native2), null, 3);
                    Object objM2132native3 = c6956l.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = new C2613l(15);
                        c6956l.m2147try(objM2132native3);
                    }
                    AbstractC2130l.loadAd(c10178l, AbstractC4962l.yandex(interfaceC17242lCrashlytics, false, (Function1) objM2132native3), z, null, null, AbstractC17824l.remoteconfig, null, false, null, c3790l, interfaceC11381l, null, null, null, null, null, c6956l, 12582912, 1572864, 33357688);
                    C3790l c3790l2 = new C3790l(7, 7, 115);
                    boolean zBilling3 = c6956l.billing(function0);
                    Object objM2132native4 = c6956l.m2132native();
                    if (zBilling3 || objM2132native4 == c13863l) {
                        objM2132native4 = new C10047l(0, function0);
                        c6956l.m2147try(objM2132native4);
                    }
                    InterfaceC11381l interfaceC11381l2 = (InterfaceC11381l) objM2132native4;
                    boolean z2 = !((Boolean) interfaceC8714l.getValue()).booleanValue();
                    int i3 = !((Boolean) interfaceC8714l2.getValue()).booleanValue() ? 1 : 0;
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC13702l.crashlytics(AbstractC9966l.billing(AbstractC0080l.amazon(c4346l, 1.0f), c6523l), null, 3);
                    Object objM2132native5 = c6956l.m2132native();
                    if (objM2132native5 == c13863l) {
                        objM2132native5 = new C2613l(16);
                        c6956l.m2147try(objM2132native5);
                    }
                    AbstractC8496l.yandex(c10178l2, AbstractC4962l.yandex(interfaceC17242lCrashlytics2, false, (Function1) objM2132native5), z2, null, null, AbstractC17824l.metrica, AbstractC14566l.amazon(1216090232, new C7605l(interfaceC8714l2, 5), c6956l), ((Boolean) interfaceC8714l3.getValue()).booleanValue() ? AbstractC17824l.vip : null, ((Boolean) interfaceC8714l3.getValue()).booleanValue(), null, i3, (char) 0, c3790l2, interfaceC11381l2, null, null, null, c6956l, 102236160, 0, 8169144);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14710l(C6523l c6523l, C6523l c6523l2, C10178l c10178l, Function0 function0, C10178l c10178l2, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC8714l interfaceC8714l3) {
        this.f28772l = c6523l;
        this.f28769l = c6523l2;
        this.f28775l = c10178l;
        this.f28774l = function0;
        this.f28777l = c10178l2;
        this.f28770l = interfaceC8714l;
        this.f28771l = interfaceC8714l2;
        this.f28776l = interfaceC8714l3;
    }
}
