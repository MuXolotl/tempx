package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٖؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1950l extends AbstractC16915l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4439l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4440l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f4441l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4442l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f4443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1950l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.f4440l = i;
        this.f4439l = obj;
        this.f4442l = obj2;
        this.f4441l = obj3;
        this.f4443l = obj4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        C18656l c18656l;
        Boolean bool;
        int i = this.f4440l;
        Object obj6 = this.f4443l;
        C13863l c13863l = C1867l.yandex;
        Object obj7 = this.f4441l;
        Object obj8 = this.f4439l;
        Object obj9 = this.f4442l;
        boolean z = true;
        switch (i) {
            case 0:
                InterfaceC9085l interfaceC9085l = (InterfaceC9085l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                C11362l c11362l = (C11362l) obj8;
                C14931l c14931l = (C14931l) obj7;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c6956l.billing(interfaceC9085l) : c6956l.admob(interfaceC9085l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zBilling = c6956l.billing(c11362l) | c6956l.admob(obj9) | c6956l.admob(c14931l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        obj4 = objM2132native;
                        C12683l c12683l = new C12683l(c11362l, obj9, c14931l, true ? 1 : 0);
                        c6956l.m2147try(c12683l);
                        obj4 = c12683l;
                    }
                    AbstractC12311l.loadAd(interfaceC9085l, (Function1) obj4, c6956l);
                    c14931l.amazon.vip(obj9, ((C1209l) interfaceC9085l).loadAd);
                    Object objM2132native2 = c6956l.m2132native();
                    Object obj10 = objM2132native2;
                    if (objM2132native2 == c13863l) {
                        C8511l c8511l = new C8511l(interfaceC9085l);
                        c6956l.m2147try(c8511l);
                        obj10 = c8511l;
                    }
                    ((Function4) obj6).invoke((C8511l) obj10, obj9, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                ((Number) obj3).intValue();
                C11177l c11177l = C11177l.f22467l;
                C18656l c18656l2 = (C18656l) obj9;
                c6956l2.m2123default(-1539505585);
                C8832l c8832l = (C8832l) obj8;
                String str = c8832l.yandex;
                c6956l2.m2121class(-1996110647, str);
                C14632l c14632l = (C14632l) obj7;
                Object objM2132native3 = c6956l2.m2132native();
                if (objM2132native3 == c13863l) {
                    C12376l c12376l = c14632l.f28633l;
                    Object c14509l = c12376l.get(str);
                    if (c14509l == null) {
                        c14509l = new C14509l(str, c14632l);
                        c12376l.put(str, c14509l);
                    }
                    objM2132native3 = (C14509l) c14509l;
                    c6956l2.m2147try(objM2132native3);
                }
                C14509l c14509l2 = (C14509l) objM2132native3;
                c6956l2.m2121class(-1996106866, c18656l2);
                if (c18656l2 != null) {
                    c6956l2.m2123default(-1749734647);
                    String string = str.toString();
                    boolean zBilling2 = c6956l2.billing(c18656l2);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native4 == c13863l) {
                        objM2132native4 = c18656l2.crashlytics();
                        c6956l2.m2147try(objM2132native4);
                    }
                    if (c18656l2.mopub()) {
                        objM2132native4 = c18656l2.crashlytics();
                    }
                    c6956l2.m2123default(1498260051);
                    Boolean bool2 = (Boolean) c11177l.invoke(objM2132native4);
                    c6956l2.startapp(false);
                    Object value = c18656l2.amazon.getValue();
                    c6956l2.m2123default(1498260051);
                    Boolean bool3 = (Boolean) c11177l.invoke(value);
                    c6956l2.startapp(false);
                    obj5 = null;
                    C18656l c18656lAmazon = AbstractC2438l.amazon(c18656l2, bool2, bool3, string, c6956l2, 0);
                    c6956l2 = c6956l2;
                    if (c18656l2.mopub()) {
                        c6956l2.m2123default(782538635);
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(782386797);
                        Object value2 = c18656l2.purchase.getValue();
                        if (value2 == null) {
                            c6956l2.m2123default(782437481);
                            c6956l2.startapp(false);
                            bool = null;
                        } else {
                            c6956l2.m2123default(782437482);
                            c6956l2.m2123default(1498260051);
                            bool = (Boolean) c11177l.invoke(value2);
                            c6956l2.startapp(false);
                            c6956l2.startapp(false);
                        }
                        c18656lAmazon.purchase.setValue(bool);
                        c6956l2.startapp(false);
                    }
                    c6956l2.startapp(false);
                    c18656l = c18656lAmazon;
                    c14509l2 = c14509l2;
                } else {
                    obj5 = null;
                    c6956l2.m2123default(-1749482679);
                    AbstractC9464l.purchase(1, c11177l);
                    Boolean bool4 = (Boolean) c11177l.invoke(Unit.INSTANCE);
                    boolean zBooleanValue = bool4.booleanValue();
                    Object objM2132native5 = c6956l2.m2132native();
                    if (objM2132native5 == c13863l) {
                        if (c14509l2.crashlytics().isEmpty()) {
                            z = zBooleanValue;
                        } else if (zBooleanValue) {
                            z = false;
                        }
                        objM2132native5 = new C14783l(Boolean.valueOf(z));
                        c6956l2.m2147try(objM2132native5);
                    }
                    C14783l c14783l = (C14783l) objM2132native5;
                    c14783l.crashlytics.setValue(bool4);
                    C18656l c18656lAdmob = AbstractC2438l.admob(c14783l, null, c6956l2, 0, 2);
                    c6956l2.startapp(false);
                    c18656l = c18656lAdmob;
                }
                c6956l2.m2121class(-1996043323, Boolean.valueOf(c14632l.loadAd()));
                C14509l c14509l3 = c14509l2;
                C15738l c15738lPurchase = AbstractC2438l.purchase(c18656l, AbstractC3483l.remoteconfig, null, c6956l2, 0, 2);
                c6956l2.startapp(false);
                boolean zBilling3 = c6956l2.billing(c18656l);
                Object objM2132native6 = c6956l2.m2132native();
                if (zBilling3 || objM2132native6 == c13863l) {
                    objM2132native6 = new C17154l(c14632l, c18656l, c15738lPurchase, c14509l3.admob);
                    c6956l2.m2147try(objM2132native6);
                }
                C17154l c17154l = (C17154l) objM2132native6;
                if (!AbstractC8576l.yandex((C15738l) c17154l.amazon.getValue(), c15738lPurchase)) {
                    c17154l.amazon.setValue(c15738lPurchase);
                    c17154l.mopub.setValue(obj5);
                    c17154l.billing = AbstractC12535l.yandex;
                }
                c17154l.purchase.setValue(AbstractC17122l.yandex);
                c6956l2.startapp(false);
                C9144l c9144l = (C9144l) obj6;
                Object objM2132native7 = c6956l2.m2132native();
                if (objM2132native7 == c13863l) {
                    objM2132native7 = new C0633l(c14509l3, c17154l, c9144l, c8832l);
                    c6956l2.m2147try(objM2132native7);
                }
                C0633l c0633l = (C0633l) objM2132native7;
                c8832l.crashlytics.setValue(c0633l);
                c0633l.f2092l.setValue(c14509l3);
                C10086l c10086l = c0633l.f2086l;
                Boolean bool5 = Boolean.TRUE;
                c10086l.setValue(bool5);
                c0633l.f2091l.setValue(c17154l);
                c0633l.f2095l.setValue(C5517l.loadAd);
                c0633l.f2087l.setValue(c9144l);
                c0633l.f2088l.subs(0.0f);
                c0633l.f2085l.setValue(bool5);
                c0633l.f2094l.setValue(c8832l);
                c6956l2.startapp(false);
                InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(new C2995l(c0633l));
                c6956l2.startapp(false);
                return interfaceC17242lPremium;
        }
    }
}
