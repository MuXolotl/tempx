package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: l٘ۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18125l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0324l f35414l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13238l f35415l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35416l;

    public /* synthetic */ C18125l(InterfaceC13238l interfaceC13238l, C0324l c0324l, int i) {
        this.f35416l = i;
        this.f35415l = interfaceC13238l;
        this.f35414l = c0324l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        C8206l c8206l;
        C6956l c6956l;
        int i2;
        String str2;
        String str3;
        C8206l c8206l2;
        C6956l c6956l2;
        int i3 = this.f35416l;
        C13863l c13863l = C1867l.yandex;
        C5631l c5631l = C5631l.yandex;
        C17536l c17536l = C17536l.yandex;
        InterfaceC13238l interfaceC13238l = this.f35415l;
        C4346l c4346l = C4346l.f8873l;
        C0324l c0324l = this.f35414l;
        switch (i3) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l3.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l3.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l3.m2127for(i & 1, (i & 147) != 146)) {
                    InterfaceC17314l interfaceC17314l = (InterfaceC17314l) interfaceC13238l.get(iIntValue);
                    c6956l3.m2123default(-1455938537);
                    if (AbstractC8576l.yandex(interfaceC17314l, c17536l)) {
                        c6956l3.m2123default(-1455906019);
                        c6956l3.startapp(false);
                    } else if (interfaceC17314l instanceof C7933l) {
                        c6956l3.m2123default(-1455838563);
                        c6956l3.startapp(false);
                    } else {
                        if (AbstractC8576l.yandex(interfaceC17314l, c5631l)) {
                            c6956l3.m2123default(-1455755204);
                            AbstractC10704l.crashlytics(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), c6956l3, 6);
                            c6956l3.startapp(false);
                        } else {
                            if (!(interfaceC17314l instanceof C15661l)) {
                                throw AbstractC12900l.billing(-739702420, c6956l3, false);
                            }
                            c6956l3.m2123default(-1455436865);
                            C15661l c15661l = (C15661l) interfaceC17314l;
                            C3346l c3346l = c15661l.loadAd;
                            C8206l c8206l3 = c3346l.tapsense;
                            if (c8206l3 == null || (str = c8206l3.admob) == null) {
                                List list = c3346l.ad;
                                if (list == null || (c8206l = (C8206l) AbstractC16901l.m4217extends(list)) == null) {
                                    str = null;
                                } else {
                                    String str4 = c8206l.admob;
                                    str = str4;
                                }
                            } else {
                                str = str4;
                            }
                            String str5 = c3346l.amazon;
                            Object objM2132native = c6956l3.m2132native();
                            if (objM2132native == c13863l) {
                                objM2132native = C5818l.f12240l;
                                c6956l3.m2147try(objM2132native);
                            }
                            String strLoadAd = AbstractC13251l.loadAd(c3346l, (Function1) objM2132native);
                            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                            boolean zAdmob = c6956l3.admob(interfaceC17314l) | c6956l3.admob(c0324l);
                            Object objM2132native2 = c6956l3.m2132native();
                            if (zAdmob || objM2132native2 == c13863l) {
                                objM2132native2 = new C3575l(c0324l, c15661l, 0);
                                c6956l3.m2147try(objM2132native2);
                            }
                            AbstractC10704l.yandex(str, str5, strLoadAd, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native2, 15), c6956l3, 0);
                            c6956l = c6956l3;
                            c6956l.startapp(false);
                        }
                        c6956l.startapp(false);
                    }
                    c6956l = c6956l3;
                    c6956l.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l4 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l4.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l4.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l4.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    InterfaceC17314l interfaceC17314l2 = (InterfaceC17314l) interfaceC13238l.get(iIntValue3);
                    c6956l4.m2123default(1527472044);
                    if (AbstractC8576l.yandex(interfaceC17314l2, c17536l)) {
                        c6956l4.m2123default(1527511568);
                        c6956l4.startapp(false);
                    } else if (interfaceC17314l2 instanceof C7933l) {
                        c6956l4.m2123default(1527575056);
                        c6956l4.startapp(false);
                    } else {
                        if (AbstractC8576l.yandex(interfaceC17314l2, c5631l)) {
                            c6956l4.m2123default(1527653951);
                            AbstractC10704l.crashlytics(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), c6956l4, 6);
                            c6956l4.startapp(false);
                        } else {
                            if (!(interfaceC17314l2 instanceof C15661l)) {
                                throw AbstractC12900l.billing(-643463369, c6956l4, false);
                            }
                            c6956l4.m2123default(1527943088);
                            C15661l c15661l2 = (C15661l) interfaceC17314l2;
                            C3346l c3346l2 = c15661l2.loadAd;
                            C8206l c8206l4 = c3346l2.tapsense;
                            if (c8206l4 == null || (str = c8206l4.admob) == null) {
                                List list2 = c3346l2.ad;
                                if (list2 == null || (c8206l2 = (C8206l) AbstractC16901l.m4217extends(list2)) == null) {
                                    str2 = null;
                                    str3 = null;
                                } else {
                                    String str6 = c8206l2.admob;
                                    str3 = str6;
                                    str2 = null;
                                }
                            } else {
                                str3 = str6;
                                str2 = null;
                            }
                            String str7 = c3346l2.amazon;
                            Object objM2132native3 = c6956l4.m2132native();
                            if (objM2132native3 == c13863l) {
                                objM2132native3 = C1490l.f3706l;
                                c6956l4.m2147try(objM2132native3);
                            }
                            String strLoadAd2 = AbstractC13251l.loadAd(c3346l2, (Function1) objM2132native3);
                            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                            boolean zAdmob2 = c6956l4.admob(interfaceC17314l2) | c6956l4.admob(c0324l);
                            Object objM2132native4 = c6956l4.m2132native();
                            if (zAdmob2 || objM2132native4 == c13863l) {
                                objM2132native4 = new C3575l(c0324l, c15661l2, 1);
                                c6956l4.m2147try(objM2132native4);
                            }
                            AbstractC10704l.yandex(str3, str7, strLoadAd2, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, str2, (Function0) objM2132native4, 15), c6956l4, 0);
                            c6956l2 = c6956l4;
                            c6956l2.startapp(false);
                        }
                        c6956l2.startapp(false);
                    }
                    c6956l2 = c6956l4;
                    c6956l2.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
