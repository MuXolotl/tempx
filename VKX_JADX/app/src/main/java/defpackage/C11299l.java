package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11299l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12418l f22771l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22772l;

    public /* synthetic */ C11299l(C12418l c12418l, int i) {
        this.f22772l = i;
        this.f22771l = c12418l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f22772l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        final C12418l c12418l = this.f22771l;
        boolean z = true;
        final int i2 = 0;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zAdmob = c6956l.admob(c12418l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C16931l(26, c12418l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, interfaceC11780l, null, null, null, false, null, (Function1) objM2132native, c6956l, (iIntValue << 6) & 896, 507);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob2 = c6956l2.admob(c12418l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6547l(c12418l, 0);
                        c6956l2.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native2, 15);
                    final boolean z2 = z ? 1 : 0;
                    AbstractC13319l.yandex(AbstractC12027l.purchase, interfaceC17242lLoadAd, null, null, AbstractC14566l.amazon(-1940280658, new Function2() { // from class: lِٙ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int i3 = z2;
                            C13863l c13863l2 = C1867l.yandex;
                            C12418l c12418l2 = c12418l;
                            switch (i3) {
                                case 0:
                                    C6956l c6956l3 = (C6956l) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        boolean z3 = ((EnumC15312l) ((C10086l) c12418l2.f24521l).getValue()) == EnumC15312l.MY_MUSIC;
                                        boolean zAdmob3 = c6956l3.admob(c12418l2);
                                        Object objM2132native3 = c6956l3.m2132native();
                                        if (zAdmob3 || objM2132native3 == c13863l2) {
                                            objM2132native3 = new C6547l(c12418l2, 2);
                                            c6956l3.m2147try(objM2132native3);
                                        }
                                        AbstractC0676l.yandex(z3, (Function0) objM2132native3, null, false, null, c6956l3, 0);
                                    } else {
                                        c6956l3.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l4 = (C6956l) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        boolean z4 = ((EnumC15312l) ((C10086l) c12418l2.f24521l).getValue()) == EnumC15312l.RECOMMENDATIONS;
                                        boolean zAdmob4 = c6956l4.admob(c12418l2);
                                        Object objM2132native4 = c6956l4.m2132native();
                                        if (zAdmob4 || objM2132native4 == c13863l2) {
                                            objM2132native4 = new C6547l(c12418l2, 1);
                                            c6956l4.m2147try(objM2132native4);
                                        }
                                        AbstractC0676l.yandex(z4, (Function0) objM2132native4, null, false, null, c6956l4, 0);
                                    } else {
                                        c6956l4.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l2), null, null, c6956l2, 24582, 492);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob3 = c6956l3.admob(c12418l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C6547l(c12418l, 3);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC13319l.yandex(AbstractC12027l.mopub, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native3, 15), null, null, AbstractC14566l.amazon(944965996, new Function2() { // from class: lِٙ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int i3 = i2;
                            C13863l c13863l2 = C1867l.yandex;
                            C12418l c12418l2 = c12418l;
                            switch (i3) {
                                case 0:
                                    C6956l c6956l4 = (C6956l) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        boolean z3 = ((EnumC15312l) ((C10086l) c12418l2.f24521l).getValue()) == EnumC15312l.MY_MUSIC;
                                        boolean zAdmob4 = c6956l4.admob(c12418l2);
                                        Object objM2132native4 = c6956l4.m2132native();
                                        if (zAdmob4 || objM2132native4 == c13863l2) {
                                            objM2132native4 = new C6547l(c12418l2, 2);
                                            c6956l4.m2147try(objM2132native4);
                                        }
                                        AbstractC0676l.yandex(z3, (Function0) objM2132native4, null, false, null, c6956l4, 0);
                                    } else {
                                        c6956l4.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l5 = (C6956l) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        boolean z4 = ((EnumC15312l) ((C10086l) c12418l2.f24521l).getValue()) == EnumC15312l.RECOMMENDATIONS;
                                        boolean zAdmob5 = c6956l5.admob(c12418l2);
                                        Object objM2132native5 = c6956l5.m2132native();
                                        if (zAdmob5 || objM2132native5 == c13863l2) {
                                            objM2132native5 = new C6547l(c12418l2, 1);
                                            c6956l5.m2147try(objM2132native5);
                                        }
                                        AbstractC0676l.yandex(z4, (Function0) objM2132native5, null, false, null, c6956l5, 0);
                                    } else {
                                        c6956l5.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l3), null, null, c6956l3, 24582, 492);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
