package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lًؒٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7729l implements InterfaceC10835l {
    public final C14931l yandex;

    public C7729l(C14931l c14931l) {
        this.yandex = c14931l;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC6357l) list.get(0)).crashlytics(i));
            int iSmaato = AbstractC14055l.smaato(list);
            int i2 = 1;
            if (1 <= iSmaato) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC6357l) list.get(i2)).crashlytics(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iSmaato) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC6357l) list.get(0)).remoteconfig(i));
            int iSmaato = AbstractC14055l.smaato(list);
            int i2 = 1;
            if (1 <= iSmaato) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC6357l) list.get(i2)).remoteconfig(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iSmaato) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        C8195l c8195l;
        int size = list.size();
        AbstractC10113l[] abstractC10113lArr = new AbstractC10113l[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i);
            Object objSignature = interfaceC6357l.Signature();
            C6549l c6549l = objSignature instanceof C6549l ? (C6549l) objSignature : null;
            if (c6549l != null && ((Boolean) c6549l.f13670l.getValue()).booleanValue()) {
                AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
                long j3 = (((long) abstractC10113lAdcel.f20591l) & 4294967295L) | (((long) abstractC10113lAdcel.f20592l) << 32);
                Unit unit = Unit.INSTANCE;
                abstractC10113lArr[i] = abstractC10113lAdcel;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) list.get(i2);
            if (abstractC10113lArr[i2] == null) {
                abstractC10113lArr[i2] = interfaceC6357l2.adcel(j);
            }
        }
        if (interfaceC7448l.mo992import()) {
            c8195l = new C8195l(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                AbstractC10113l abstractC10113l = abstractC10113lArr[i5];
                if (abstractC10113l != null) {
                    Object objSignature2 = ((InterfaceC6357l) list.get(i5)).Signature();
                    C6549l c6549l2 = objSignature2 instanceof C6549l ? (C6549l) objSignature2 : null;
                    if (c6549l2 == null || !((Boolean) c6549l2.f13669l.getValue()).booleanValue()) {
                        int i6 = abstractC10113l.f20592l;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = abstractC10113l.f20591l;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            c8195l = new C8195l(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) c8195l.f17098l).intValue();
        int iIntValue2 = ((Number) c8195l.f17097l).intValue();
        if (!interfaceC7448l.mo992import()) {
            this.yandex.crashlytics.setValue(new C4999l((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        }
        return interfaceC7448l.isVip(iIntValue, iIntValue2, C14054l.f27396l, new C10691l(abstractC10113lArr, this, iIntValue, iIntValue2));
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC6357l) list.get(0)).mo1460for(i));
            int iSmaato = AbstractC14055l.smaato(list);
            int i2 = 1;
            if (1 <= iSmaato) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC6357l) list.get(i2)).mo1460for(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iSmaato) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC6357l) list.get(0)).metrica(i));
            int iSmaato = AbstractC14055l.smaato(list);
            int i2 = 1;
            if (1 <= iSmaato) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC6357l) list.get(i2)).metrica(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iSmaato) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
