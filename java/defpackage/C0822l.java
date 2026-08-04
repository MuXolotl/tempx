package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0822l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f2462l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3102l f2463l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2464l;

    public /* synthetic */ C0822l(C13072l c13072l, InterfaceC8714l interfaceC8714l, int i) {
        this.f2464l = i;
        this.f2463l = c13072l;
        this.f2462l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2464l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        InterfaceC8714l interfaceC8714l = this.f2462l;
        InterfaceC3102l interfaceC3102l = this.f2463l;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l), interfaceC3102l.loadAd(), null);
                    boolean zBilling = c6956l.billing(interfaceC8714l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C9922l(interfaceC8714l, 8);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub2 = AbstractC16422l.mopub(AbstractC3605l.firebase(c4346l, interfaceC11780l2), interfaceC3102l.loadAd(), null);
                    boolean zBilling2 = c6956l2.billing(interfaceC8714l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C9922l(interfaceC8714l, 16);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub2, null, null, null, null, null, false, null, (Function1) objM2132native2, c6956l2, 0, 510);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                InterfaceC11780l interfaceC11780l3 = (InterfaceC11780l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC11780l3) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub3 = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l3), interfaceC3102l.loadAd(), null);
                    boolean zBilling3 = c6956l3.billing(interfaceC8714l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zBilling3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C9922l(interfaceC8714l, 23);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub3, null, null, null, null, null, false, null, (Function1) objM2132native3, c6956l3, 0, 510);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
