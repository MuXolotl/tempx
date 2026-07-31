package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؚْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7234l implements InterfaceC5344l {
    public Integer amazon;
    public C5616l crashlytics;
    public final InterfaceC1489l loadAd;
    public final InterfaceC2262l yandex;

    public C7234l(InterfaceC2262l interfaceC2262l, InterfaceC1489l interfaceC1489l) {
        this.yandex = interfaceC2262l;
        this.loadAd = interfaceC1489l;
    }

    @Override // defpackage.InterfaceC5344l
    public final /* synthetic */ int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.crashlytics(this, interfaceC12822l, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC5344l
    public final /* synthetic */ int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.billing(this, interfaceC12822l, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC5344l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        C7234l c7234l;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((InterfaceC6357l) list2.get(i2)).adcel(j));
        }
        if (!arrayList2.isEmpty()) {
            obj = arrayList2.get(0);
            int i3 = ((AbstractC10113l) obj).f20592l;
            int iSmaato = AbstractC14055l.smaato(arrayList2);
            if (1 <= iSmaato) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i4);
                    int i5 = ((AbstractC10113l) obj4).f20592l;
                    if (i3 < i5) {
                        obj = obj4;
                        i3 = i5;
                    }
                    if (i4 == iSmaato) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            obj = null;
        }
        AbstractC10113l abstractC10113l = (AbstractC10113l) obj;
        int i6 = abstractC10113l != null ? abstractC10113l.f20592l : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            arrayList3.add(((InterfaceC6357l) list3.get(i7)).adcel(j));
        }
        if (!arrayList3.isEmpty()) {
            obj2 = arrayList3.get(0);
            int i8 = ((AbstractC10113l) obj2).f20592l;
            int iSmaato2 = AbstractC14055l.smaato(arrayList3);
            if (1 <= iSmaato2) {
                int i9 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i9);
                    int i10 = ((AbstractC10113l) obj5).f20592l;
                    if (i8 < i10) {
                        obj2 = obj5;
                        i8 = i10;
                    }
                    if (i9 == iSmaato2) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            obj2 = null;
        }
        AbstractC10113l abstractC10113l2 = (AbstractC10113l) obj2;
        Integer numValueOf = abstractC10113l2 != null ? Integer.valueOf(abstractC10113l2.f20592l) : null;
        if (!arrayList3.isEmpty()) {
            obj3 = arrayList3.get(0);
            int i11 = ((AbstractC10113l) obj3).f20591l;
            int iSmaato3 = AbstractC14055l.smaato(arrayList3);
            if (1 <= iSmaato3) {
                while (true) {
                    Object obj6 = arrayList3.get(i);
                    int i12 = ((AbstractC10113l) obj6).f20591l;
                    if (i11 < i12) {
                        obj3 = obj6;
                        i11 = i12;
                    }
                    if (i == iSmaato3) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            obj3 = null;
        }
        AbstractC10113l abstractC10113l3 = (AbstractC10113l) obj3;
        int i13 = abstractC10113l3 != null ? abstractC10113l3.f20591l : 0;
        C7069l c7069l = C7069l.yandex;
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + interfaceC7448l.mo870l(8.0f) + Math.max(interfaceC7448l.mo870l(18.0f), i6);
        int i14 = i6 == 0 ? (-(interfaceC7448l.mo870l(8.0f) + interfaceC7448l.mo870l(18.0f))) / 2 : 0;
        Integer num = this.amazon;
        if (num != null) {
            C5616l c5616l = this.crashlytics;
            if (c5616l == null) {
                c5616l = new C5616l(num, AbstractC3483l.billing, null, 12);
                this.crashlytics = c5616l;
            }
            if (((Number) c5616l.purchase.getValue()).intValue() != i14) {
                int i15 = i14;
                i14 = i15;
                c7234l = this;
                AbstractC10999l.mopub(c7234l.yandex, null, 0, new C13941l(c5616l, i15, this, (InterfaceC14029l) null, 4), 3);
            }
            int i16 = i13;
            return interfaceC7448l.isVip(iIntValue, i16, C14054l.f27396l, new C1247l(arrayList2, c7234l, i14, arrayList3, i16));
        }
        this.amazon = Integer.valueOf(i14);
        c7234l = this;
        int i17 = i13;
        return interfaceC7448l.isVip(iIntValue, i17, C14054l.f27396l, new C1247l(arrayList2, c7234l, i14, arrayList3, i17));
    }

    @Override // defpackage.InterfaceC5344l
    public final /* synthetic */ int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.purchase(this, interfaceC12822l, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC5344l
    public final /* synthetic */ int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.amazon(this, interfaceC12822l, (ArrayList) list, i);
    }
}
