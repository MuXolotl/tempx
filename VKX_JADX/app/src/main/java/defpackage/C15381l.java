package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٕؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15381l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12000l f30045l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30046l;

    public /* synthetic */ C15381l(C12000l c12000l, int i) {
        this.f30046l = i;
        this.f30045l = c12000l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jFirebase;
        long jFirebase2;
        int i = this.f30046l;
        int i2 = 2;
        C13863l c13863l = C1867l.yandex;
        C12000l c12000l = this.f30045l;
        int i3 = 1;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int i4 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC1760l.mopub, null, null, null, null, AbstractC14566l.amazon(1704885083, new C3663l(c12000l, i2, b == true ? 1 : 0), c6956l), AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510), c6956l, 196614, 414);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    int i5 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC1760l.billing, null, null, null, null, AbstractC14566l.amazon(1840912380, new C3663l(c12000l, i3, b2 == true ? 1 : 0), c6956l2), AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l2, 510), c6956l2, 196614, 414);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2);
                    boolean zAdmob = c6956l3.admob(c12000l);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C1412l(22, c12000l);
                        c6956l3.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lVip, null, interfaceC11780l, c7537l, null, null, false, null, (Function1) objM2132native, c6956l3, ((iIntValue3 << 6) & 896) | 24582, 490);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zAdmob2 = c6956l4.admob(c12000l);
                    Object objM2132native2 = c6956l4.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C7436l(c12000l, b3 == true ? 1 : 0);
                        c6956l4.m2147try(objM2132native2);
                    }
                    Function0 function0 = (Function0) objM2132native2;
                    if (c12000l.m3296import()) {
                        c6956l4.m2123default(-186461921);
                        c6956l4.startapp(false);
                        jFirebase = C9735l.firebase;
                    } else {
                        c6956l4.m2123default(-186459605);
                        C10707l c10707l = AbstractC16964l.yandex;
                        jFirebase = AbstractC12953l.firebase(C9735l.loadAd(0.15f, ((C14370l) c6956l4.isPro(c10707l)).yandex.yandex), ((C14370l) c6956l4.isPro(c10707l)).yandex.ads);
                        c6956l4.startapp(false);
                    }
                    AbstractC3383l.loadAd(function0, null, false, null, AbstractC13880l.yandex(jFirebase, 0L, 0L, 0L, c6956l4, 0, 14), null, null, AbstractC14566l.amazon(1351535231, new C15381l(c12000l, i3), c6956l4), c6956l4, 100663296, 238);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(1 & iIntValue5, (iIntValue5 & 17) != 16)) {
                    boolean zAdmob3 = c6956l5.admob(c12000l);
                    Object objM2132native3 = c6956l5.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C7436l(c12000l, i2);
                        c6956l5.m2147try(objM2132native3);
                    }
                    Function0 function1 = (Function0) objM2132native3;
                    if (c12000l.m3296import()) {
                        c6956l5.m2123default(-2059672982);
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        jFirebase2 = AbstractC12953l.firebase(C9735l.loadAd(0.15f, ((C14370l) c6956l5.isPro(c10707l2)).yandex.yandex), ((C14370l) c6956l5.isPro(c10707l2)).yandex.ads);
                        c6956l5.startapp(false);
                    } else {
                        c6956l5.m2123default(-2059675298);
                        c6956l5.startapp(false);
                        jFirebase2 = C9735l.firebase;
                    }
                    AbstractC3383l.loadAd(function1, null, false, null, AbstractC13880l.yandex(jFirebase2, 0L, 0L, 0L, c6956l5, 0, 14), null, null, AbstractC14566l.amazon(1215507934, new C15381l(c12000l, b4 == true ? 1 : 0), c6956l5), c6956l5, 100663296, 238);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
