package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1450l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11941l f3634l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3635l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f3636l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1450l(C11941l c11941l, InterfaceC8714l interfaceC8714l, int i) {
        super(2);
        this.f3635l = i;
        this.f3634l = c11941l;
        this.f3636l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3635l;
        InterfaceC8714l interfaceC8714l = this.f3636l;
        C11941l c11941l = this.f3634l;
        int i2 = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (objM2132native == c13863l) {
                        objM2132native = C11192l.f22530l;
                        c6956l.m2147try(objM2132native);
                    }
                    C15986l c15986l = new C15986l((Function1) objM2132native, false);
                    boolean zAdmob = c6956l.admob(c11941l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C13984l(c11941l, 1);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lYandex = AbstractC15788l.yandex(AbstractC4107l.purchase(c15986l, (Function1) objM2132native2), c11941l.getCanCalculatePosition() ? 1.0f : 0.0f);
                    C8540l c8540l = AbstractC3017l.yandex;
                    Function2 function2 = (Function2) interfaceC8714l.getValue();
                    Object objM2132native3 = c6956l.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = C10327l.crashlytics;
                        c6956l.m2147try(objM2132native3);
                    }
                    InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native3;
                    long j = c6956l.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    function2.invoke(c6956l, 0);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC10478l.yandex(AbstractC3017l.loadAd.yandex(Boolean.TRUE), AbstractC14566l.amazon(1022273628, new C1450l(c11941l, interfaceC8714l, i2), c6956l2), c6956l2, 56);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
