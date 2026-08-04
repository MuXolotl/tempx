package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7182l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f15018l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f15019l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15020l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f15021l;

    public /* synthetic */ C7182l(C15271l c15271l, boolean z, C2403l c2403l) {
        this.f15020l = 2;
        this.f15018l = c15271l;
        this.f15019l = z;
        this.f15021l = c2403l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15020l;
        C13863l c13863l = C1867l.yandex;
        Object obj4 = this.f15021l;
        boolean z = this.f15019l;
        Object obj5 = this.f15018l;
        switch (i) {
            case 0:
                C13849l c13849l = (C13849l) obj5;
                C2391l c2391l = (C2391l) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (z) {
                        c6956l.m2123default(152944886);
                        boolean zAdmob = c6956l.admob(c13849l) | c6956l.admob(c2391l);
                        Object objM2132native = c6956l.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            objM2132native = new C4722l(c13849l, c2391l, 2);
                            c6956l.m2147try(objM2132native);
                        }
                        AbstractC7470l.billing((Function0) objM2132native, null, false, null, null, null, AbstractC15918l.loadAd, c6956l, 1572864, 62);
                    } else {
                        c6956l.m2123default(142015619);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C2403l c2403l = (C2403l) obj5;
                Function0 function0 = (Function0) obj4;
                InterfaceC17242l interfaceC17242lPurchase = (InterfaceC17242l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                c6956l2.m2123default(-896681958);
                if (z) {
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = AbstractC12311l.isPro(c6956l2);
                        c6956l2.m2147try(objM2132native2);
                    }
                    InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native2;
                    Object objM2132native3 = c6956l2.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = new C12951l(0L);
                        c6956l2.m2147try(objM2132native3);
                    }
                    C12951l c12951l = (C12951l) objM2132native3;
                    Object objM2132native4 = c6956l2.m2132native();
                    if (objM2132native4 == c13863l) {
                        objM2132native4 = AbstractC8020l.smaato(Boolean.FALSE);
                        c6956l2.m2147try(objM2132native4);
                    }
                    InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native4;
                    InterfaceC8714l interfaceC8714lCrashlytics = C10053l.crashlytics(c2403l, c6956l2, 0);
                    boolean zBilling = c6956l2.billing(interfaceC8714lCrashlytics) | c6956l2.admob(interfaceC2262l) | c6956l2.billing(c2403l) | c6956l2.admob(c12951l);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (zBilling || objM2132native5 == c13863l) {
                        C17796l c17796l = new C17796l(interfaceC2262l, interfaceC8714lCrashlytics, c2403l, c12951l, 18);
                        c6956l2.m2147try(c17796l);
                        objM2132native5 = c17796l;
                    }
                    InterfaceC17242l interfaceC17242lVip = AbstractC8576l.vip(interfaceC17242lPurchase, (Function1) objM2132native5);
                    boolean zAdmob2 = c6956l2.admob(interfaceC2262l) | c6956l2.billing(c2403l) | c6956l2.admob(c12951l) | c6956l2.billing(null) | c6956l2.billing(function0);
                    Object objM2132native6 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native6 == c13863l) {
                        C12327l c12327l = new C12327l(interfaceC2262l, function0, c2403l, c12951l, interfaceC8714l);
                        c6956l2.m2147try(c12327l);
                        objM2132native6 = c12327l;
                    }
                    interfaceC17242lPurchase = AbstractC10802l.purchase(interfaceC17242lVip, (Function1) objM2132native6);
                }
                c6956l2.startapp(false);
                return interfaceC17242lPurchase;
            default:
                C15271l c15271l = (C15271l) obj5;
                C10086l c10086l = c15271l.billing;
                C2403l c2403l2 = (C2403l) obj4;
                C6956l c6956l3 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                c6956l3.m2123default(-2137546592);
                boolean z2 = ((EnumC7283l) c10086l.getValue()) == EnumC7283l.f15126l || !(c6956l3.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l);
                boolean zBilling2 = c6956l3.billing(c15271l);
                Object objM2132native7 = c6956l3.m2132native();
                if (zBilling2 || objM2132native7 == c13863l) {
                    objM2132native7 = new C0783l(10, c15271l);
                    c6956l3.m2147try(objM2132native7);
                }
                InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip((Function1) objM2132native7, c6956l3);
                Object objM2132native8 = c6956l3.m2132native();
                if (objM2132native8 == c13863l) {
                    C7239l c7239l = new C7239l(new C9922l(interfaceC8714lVip, 28));
                    c6956l3.m2147try(c7239l);
                    objM2132native8 = c7239l;
                }
                InterfaceC17955l interfaceC17955l = (InterfaceC17955l) objM2132native8;
                boolean zBilling3 = c6956l3.billing(interfaceC17955l) | c6956l3.billing(c15271l);
                Object objM2132native9 = c6956l3.m2132native();
                if (zBilling3 || objM2132native9 == c13863l) {
                    objM2132native9 = new C18576l(interfaceC17955l, c15271l);
                    c6956l3.m2147try(objM2132native9);
                }
                InterfaceC17242l interfaceC17242lBilling = AbstractC13611l.billing(C4346l.f8873l, (C18576l) objM2132native9, (EnumC7283l) c10086l.getValue(), z && c15271l.loadAd.admob() != 0.0f, z2, c2403l2);
                c6956l3.startapp(false);
                return interfaceC17242lBilling;
        }
    }

    public /* synthetic */ C7182l(boolean z, Object obj, Object obj2, int i) {
        this.f15020l = i;
        this.f15019l = z;
        this.f15018l = obj;
        this.f15021l = obj2;
    }
}
