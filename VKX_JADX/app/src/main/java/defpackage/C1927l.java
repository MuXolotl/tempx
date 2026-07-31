package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓٙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1927l implements InterfaceC5344l {
    public final /* synthetic */ C8527l amazon;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ C11636l loadAd;
    public final /* synthetic */ float yandex;

    public C1927l(float f, C11636l c11636l, int i, C8527l c8527l) {
        this.yandex = f;
        this.loadAd = c11636l;
        this.crashlytics = i;
        this.amazon = c8527l;
    }

    @Override // defpackage.InterfaceC5344l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.crashlytics(this, interfaceC12822l, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC5344l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.billing(this, interfaceC12822l, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC5344l
    public final InterfaceC17792l loadAd(final InterfaceC7448l interfaceC7448l, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        float f = this.yandex;
        final int iMo870l = interfaceC7448l.mo870l(f);
        int size = list2.size();
        C4776l c4776l = AbstractC6282l.yandex;
        int iMo870l2 = interfaceC7448l.mo870l(90.0f);
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((InterfaceC6357l) list2.get(i)).crashlytics(Alert.DURATION_SHOW_INDEFINITELY)));
        }
        final int iIntValue = numValueOf.intValue();
        int i2 = iMo870l * 2;
        long jYandex = C15519l.yandex(iMo870l2, 0, iIntValue, iIntValue, 2, j);
        final C13250l c13250l = new C13250l();
        c13250l.f26029l = f;
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(((InterfaceC6357l) list2.get(i3)).adcel(jYandex));
        }
        ArrayList arrayList3 = new ArrayList(size);
        int iMo870l3 = i2;
        for (int i4 = 0; i4 < size; i4++) {
            C4776l c4776l2 = AbstractC6282l.yandex;
            C14467l c14467l = new C14467l(90.0f);
            C14467l c14467l2 = new C14467l(interfaceC7448l.mo872static(((AbstractC10113l) arrayList2.get(i4)).f20592l));
            if (c14467l.compareTo(c14467l2) < 0) {
                c14467l = c14467l2;
            }
            float f2 = c14467l.f28331l;
            iMo870l3 = interfaceC7448l.mo870l(f2) + iMo870l3;
            C14467l c14467l3 = new C14467l(f2 - (AbstractC6282l.loadAd * 2.0f));
            C14467l c14467l4 = new C14467l(24.0f);
            if (c14467l3.compareTo(c14467l4) < 0) {
                c14467l3 = c14467l4;
            }
            float f3 = c13250l.f26029l;
            C7622l c7622l = new C7622l(f3, f2, c14467l3.f28331l);
            c13250l.f26029l = f3 + f2;
            arrayList3.add(c7622l);
        }
        this.loadAd.yandex.setValue(arrayList3);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList4.add(((InterfaceC6357l) list3.get(i5)).adcel(C15519l.yandex(iMo870l3, iMo870l3, 0, 0, 8, j)));
        }
        final ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        int i6 = 0;
        while (i6 < size5) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list4.get(i6);
            int iMo870l4 = interfaceC7448l.mo870l(((C7622l) arrayList3.get(this.crashlytics)).loadAd);
            if (iMo870l4 < 0 || iIntValue < 0) {
                AbstractC10280l.yandex("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
            }
            List list5 = list4;
            ArrayList arrayList6 = arrayList3;
            arrayList5.add(interfaceC6357l.adcel(AbstractC7563l.admob(0, iMo870l4, 0, iIntValue)));
            i6++;
            list4 = list5;
            arrayList3 = arrayList6;
        }
        final ArrayList arrayList7 = arrayList3;
        final float f4 = this.yandex;
        final C8527l c8527l = this.amazon;
        final int i7 = this.crashlytics;
        return interfaceC7448l.isVip(iMo870l3, iIntValue, C14054l.f27396l, new Function1() { // from class: lُٜٚ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8;
                ArrayList arrayList8;
                int i9;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                C13250l c13250l2 = c13250l;
                c13250l2.f26029l = f4;
                ArrayList arrayList9 = arrayList4;
                int size6 = arrayList9.size();
                int i10 = 0;
                while (true) {
                    i8 = iIntValue;
                    if (i10 >= size6) {
                        break;
                    }
                    AbstractC10113l abstractC10113l = (AbstractC10113l) arrayList9.get(i10);
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l, 0, i8 - abstractC10113l.f20591l);
                    i10++;
                }
                ArrayList arrayList10 = arrayList5;
                int size7 = arrayList10.size();
                int i11 = 0;
                while (true) {
                    arrayList8 = arrayList7;
                    i9 = i7;
                    if (i11 >= size7) {
                        break;
                    }
                    AbstractC10113l abstractC10113l2 = (AbstractC10113l) arrayList10.get(i11);
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l2, Math.max(0, (AbstractC9361l.yandex(abstractC9601l, ((C7622l) arrayList8.get(i9)).loadAd) - abstractC10113l2.f20592l) / 2), i8 - abstractC10113l2.f20591l);
                    i11++;
                }
                ArrayList arrayList11 = arrayList2;
                int size8 = arrayList11.size();
                for (int i12 = 0; i12 < size8; i12++) {
                    AbstractC9601l.smaato(abstractC9601l, (AbstractC10113l) arrayList11.get(i12), AbstractC9361l.yandex(abstractC9601l, c13250l2.f26029l), 0);
                    c13250l2.f26029l += ((C7622l) arrayList8.get(i12)).loadAd;
                }
                C8527l c8527l2 = c8527l;
                C11194l c11194l = c8527l2.yandex;
                Integer num = c8527l2.crashlytics;
                if (num == null || num.intValue() != i9) {
                    c8527l2.crashlytics = Integer.valueOf(i9);
                    C7622l c7622l2 = (C7622l) AbstractC16901l.m4220for(i9, arrayList8);
                    if (c7622l2 != null) {
                        C7622l c7622l3 = (C7622l) AbstractC16901l.m4214continue(arrayList8);
                        float f5 = c7622l3.yandex + c7622l3.loadAd;
                        InterfaceC7448l interfaceC7448l2 = interfaceC7448l;
                        int iMo870l5 = interfaceC7448l2.mo870l(f5) + iMo870l;
                        int iAdmob = iMo870l5 - c11194l.billing.admob();
                        int iMo870l6 = interfaceC7448l2.mo870l(c7622l2.yandex) - ((iAdmob / 2) - (interfaceC7448l2.mo870l(c7622l2.loadAd) / 2));
                        int i13 = iMo870l5 - iAdmob;
                        if (i13 < 0) {
                            i13 = 0;
                        }
                        int iPurchase = AbstractC8576l.purchase(iMo870l6, 0, i13);
                        if (c11194l.yandex.admob() != iPurchase) {
                            AbstractC10999l.mopub(c8527l2.loadAd, null, 0, new C13017l(c8527l2, iPurchase, (InterfaceC14029l) null, 5), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC5344l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.purchase(this, interfaceC12822l, (ArrayList) list, i);
    }

    @Override // defpackage.InterfaceC5344l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC15560l.amazon(this, interfaceC12822l, (ArrayList) list, i);
    }
}
