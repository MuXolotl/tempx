package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3596l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10056l f7516l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7517l;

    public /* synthetic */ C3596l(C10056l c10056l, int i) {
        this.f7517l = i;
        this.f7516l = c10056l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7517l;
        C4346l c4346l = C4346l.f8873l;
        int i2 = 18;
        int i3 = 4;
        C10056l c10056l = this.f7516l;
        int i4 = 1;
        byte b = 0;
        switch (i) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(c7091l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c10056l.m2875this(AbstractC5020l.smaato(c7091l, c4346l), c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-1165619608, new C12893l(c10056l, i4, b), c6956l2);
                    int i5 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC10000l.vip, null, null, null, AbstractC10000l.metrica, c15578lAmazon, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l2, 510), c6956l2, 221190, 398);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c6956l3.m2123default(-735019606);
                    ListIterator listIterator = C10056l.f20511l.listIterator(0);
                    while (true) {
                        boolean zHasNext = listIterator.hasNext();
                        C13863l c13863l = C1867l.yandex;
                        if (zHasNext) {
                            C8195l c8195l = (C8195l) listIterator.next();
                            int iIntValue4 = ((Number) c8195l.f17098l).intValue();
                            int iIntValue5 = ((Number) c8195l.f17097l).intValue();
                            c6956l3.m2121class(-735017741, Integer.valueOf(iIntValue4));
                            boolean zAmazon = c6956l3.amazon(iIntValue4) | c6956l3.admob(c10056l);
                            Object objM2132native = c6956l3.m2132native();
                            if (zAmazon || objM2132native == c13863l) {
                                objM2132native = new C8803l(iIntValue4, c10056l, i3);
                                c6956l3.m2147try(objM2132native);
                            }
                            AbstractC1544l.billing((Function0) objM2132native, AbstractC14566l.amazon(-879756080, new C4314l(iIntValue5, i2, b), c6956l3), null, false, null, null, null, null, null, null, c6956l3, 48);
                            c6956l3.startapp(false);
                        } else {
                            c6956l3.startapp(false);
                            boolean zAdmob = c6956l3.admob(c10056l);
                            Object objM2132native2 = c6956l3.m2132native();
                            if (zAdmob || objM2132native2 == c13863l) {
                                objM2132native2 = new C6195l(c10056l, 5);
                                c6956l3.m2147try(objM2132native2);
                            }
                            AbstractC1544l.billing((Function0) objM2132native2, AbstractC10000l.remoteconfig, null, false, null, null, null, null, null, null, c6956l3, 48);
                        }
                    }
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C7091l c7091l2 = (C7091l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c6956l4.billing(c7091l2) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    c10056l.m2872import(AbstractC5020l.smaato(c7091l2, c4346l), c6956l4, 0);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C7091l c7091l3 = (C7091l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c6956l5.billing(c7091l3) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    c10056l.m2869abstract(AbstractC5020l.smaato(c7091l3, c4346l), c6956l5, 0);
                } else {
                    c6956l5.m2124else();
                }
                break;
            default:
                C7091l c7091l4 = (C7091l) obj;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c6956l6.billing(c7091l4) ? 4 : 2;
                }
                if (c6956l6.m2127for(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    c10056l.m2874public(AbstractC5020l.smaato(c7091l4, c4346l), c6956l6, 0);
                } else {
                    c6956l6.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
