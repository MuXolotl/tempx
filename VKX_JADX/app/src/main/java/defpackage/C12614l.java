package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12614l implements InterfaceC5344l {
    public static int billing(InterfaceC12822l interfaceC12822l, ArrayList arrayList, int i, Function2 function2) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int i3 = AbstractC13319l.yandex;
        int iMetrica = AbstractC1019l.metrica(i, interfaceC12822l.mo870l(32.0f));
        InterfaceC6357l interfaceC6357l = (InterfaceC6357l) AbstractC16901l.m4217extends(list4);
        if (interfaceC6357l != null) {
            iIntValue = ((Number) function2.invoke(interfaceC6357l, Integer.valueOf(iMetrica))).intValue();
            iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l.metrica(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue = 0;
        }
        InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) AbstractC16901l.m4217extends(list5);
        if (interfaceC6357l2 != null) {
            iIntValue2 = ((Number) function2.invoke(interfaceC6357l2, Integer.valueOf(iMetrica))).intValue();
            iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l2.metrica(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue2 = 0;
        }
        InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) AbstractC16901l.m4217extends(list2);
        int iIntValue3 = interfaceC6357l3 != null ? ((Number) function2.invoke(interfaceC6357l3, Integer.valueOf(iMetrica))).intValue() : 0;
        InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) AbstractC16901l.m4217extends(list);
        int iIntValue4 = interfaceC6357l4 != null ? ((Number) function2.invoke(interfaceC6357l4, Integer.valueOf(iMetrica))).intValue() : 0;
        InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) AbstractC16901l.m4217extends(list3);
        int iIntValue5 = interfaceC6357l5 != null ? ((Number) function2.invoke(interfaceC6357l5, Integer.valueOf(iMetrica))).intValue() : 0;
        boolean z = iIntValue5 > interfaceC12822l.mo874transient(AbstractC7039l.isPro(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return AbstractC13319l.amazon(interfaceC12822l, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, interfaceC12822l.mo870l((i2 == 3 ? 12.0f : 8.0f) * 2.0f), AbstractC7563l.loadAd(0, 0, 0, 0, 15));
    }

    public static int mopub(InterfaceC12822l interfaceC12822l, ArrayList arrayList, int i, Function2 function2) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        InterfaceC6357l interfaceC6357l = (InterfaceC6357l) AbstractC16901l.m4217extends(list4);
        int iIntValue = interfaceC6357l != null ? ((Number) function2.invoke(interfaceC6357l, Integer.valueOf(i))).intValue() : 0;
        InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) AbstractC16901l.m4217extends(list5);
        int iIntValue2 = interfaceC6357l2 != null ? ((Number) function2.invoke(interfaceC6357l2, Integer.valueOf(i))).intValue() : 0;
        InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) AbstractC16901l.m4217extends(list);
        int iIntValue3 = interfaceC6357l3 != null ? ((Number) function2.invoke(interfaceC6357l3, Integer.valueOf(i))).intValue() : 0;
        InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) AbstractC16901l.m4217extends(list2);
        int iIntValue4 = interfaceC6357l4 != null ? ((Number) function2.invoke(interfaceC6357l4, Integer.valueOf(i))).intValue() : 0;
        InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) AbstractC16901l.m4217extends(list3);
        int iIntValue5 = interfaceC6357l5 != null ? ((Number) function2.invoke(interfaceC6357l5, Integer.valueOf(i))).intValue() : 0;
        int i2 = AbstractC13319l.yandex;
        int iMo870l = interfaceC12822l.mo870l(32.0f);
        long jLoadAd = AbstractC7563l.loadAd(0, 0, 0, 0, 15);
        return C15519l.amazon(jLoadAd) ? C15519l.admob(jLoadAd) : AbstractC5020l.applovin(iMo870l, iIntValue, Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)), iIntValue2);
    }

    @Override // defpackage.InterfaceC5344l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return billing(interfaceC12822l, (ArrayList) list, i, C4137l.f8502l);
    }

    @Override // defpackage.InterfaceC5344l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return mopub(interfaceC12822l, (ArrayList) list, i, C15392l.f30064l);
    }

    @Override // defpackage.InterfaceC5344l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        int i;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jYandex = C15519l.yandex(0, 0, 0, 0, 10, j);
        int i2 = AbstractC13319l.yandex;
        int iMo870l = interfaceC7448l.mo870l(32.0f);
        InterfaceC6357l interfaceC6357l = (InterfaceC6357l) AbstractC16901l.m4217extends(list5);
        int iRemoteconfig = interfaceC6357l != null ? interfaceC6357l.remoteconfig(C15519l.mopub(j)) : 0;
        InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) AbstractC16901l.m4217extends(list6);
        int iMetrica = AbstractC1019l.metrica(C15519l.admob(jYandex), iRemoteconfig + (interfaceC6357l2 != null ? interfaceC6357l2.remoteconfig(C15519l.mopub(j)) : 0) + iMo870l);
        InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) AbstractC16901l.m4217extends(list4);
        long jSubs = AbstractC7563l.subs(-iMo870l, jYandex, -interfaceC7448l.mo870l(((((AbstractC16901l.m4217extends(list3) != null) && (AbstractC16901l.m4217extends(list4) != null)) || ((interfaceC6357l3 != null ? interfaceC6357l3.mo1460for(iMetrica) : 0) > interfaceC7448l.mo874transient(AbstractC7039l.isPro(30)))) ? 12.0f : 8.0f) * 2.0f));
        InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) AbstractC16901l.m4217extends(list5);
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l4 != null ? interfaceC6357l4.adcel(jSubs) : null;
        int i3 = abstractC10113lAdcel != null ? abstractC10113lAdcel.f20592l : 0;
        InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) AbstractC16901l.m4217extends(list6);
        AbstractC10113l abstractC10113lAdcel2 = interfaceC6357l5 != null ? interfaceC6357l5.adcel(AbstractC7563l.isPro(-i3, 0, 2, jSubs)) : null;
        int i4 = i3 + (abstractC10113lAdcel2 != null ? abstractC10113lAdcel2.f20592l : 0);
        InterfaceC6357l interfaceC6357l6 = (InterfaceC6357l) AbstractC16901l.m4217extends(list2);
        AbstractC10113l abstractC10113lAdcel3 = interfaceC6357l6 != null ? interfaceC6357l6.adcel(AbstractC7563l.isPro(-i4, 0, 2, jSubs)) : null;
        int i5 = abstractC10113lAdcel3 != null ? abstractC10113lAdcel3.f20591l : 0;
        InterfaceC6357l interfaceC6357l7 = (InterfaceC6357l) AbstractC16901l.m4217extends(list4);
        AbstractC10113l abstractC10113lAdcel4 = interfaceC6357l7 != null ? interfaceC6357l7.adcel(AbstractC7563l.subs(-i4, jSubs, -i5)) : null;
        int i6 = i5 + (abstractC10113lAdcel4 != null ? abstractC10113lAdcel4.f20591l : 0);
        boolean z = (abstractC10113lAdcel4 == null || abstractC10113lAdcel4.mo884throw(AbstractC12013l.yandex) == abstractC10113lAdcel4.mo884throw(AbstractC12013l.loadAd)) ? false : true;
        InterfaceC6357l interfaceC6357l8 = (InterfaceC6357l) AbstractC16901l.m4217extends(list3);
        AbstractC10113l abstractC10113lAdcel5 = interfaceC6357l8 != null ? interfaceC6357l8.adcel(AbstractC7563l.subs(-i4, jSubs, -i6)) : null;
        boolean z2 = abstractC10113lAdcel5 != null;
        boolean z3 = abstractC10113lAdcel4 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f = i == 3 ? 12.0f : 8.0f;
        float f2 = f * 2.0f;
        final int iAdmob = C15519l.amazon(j) ? C15519l.admob(j) : AbstractC5020l.applovin(iMo870l, abstractC10113lAdcel != null ? abstractC10113lAdcel.f20592l : 0, Math.max(abstractC10113lAdcel3 != null ? abstractC10113lAdcel3.f20592l : 0, Math.max(abstractC10113lAdcel5 != null ? abstractC10113lAdcel5.f20592l : 0, abstractC10113lAdcel4 != null ? abstractC10113lAdcel4.f20592l : 0)), abstractC10113lAdcel2 != null ? abstractC10113lAdcel2.f20592l : 0);
        final AbstractC10113l abstractC10113l = abstractC10113lAdcel5;
        float f3 = f;
        final int iAmazon = AbstractC13319l.amazon(interfaceC7448l, abstractC10113lAdcel != null ? abstractC10113lAdcel.f20591l : 0, abstractC10113lAdcel2 != null ? abstractC10113lAdcel2.f20591l : 0, abstractC10113lAdcel3 != null ? abstractC10113lAdcel3.f20591l : 0, abstractC10113lAdcel5 != null ? abstractC10113lAdcel5.f20591l : 0, abstractC10113lAdcel4 != null ? abstractC10113lAdcel4.f20591l : 0, i, interfaceC7448l.mo870l(f2), j);
        final boolean z4 = i == 3;
        final int iMo870l2 = interfaceC7448l.mo870l(16.0f);
        final int iMo870l3 = interfaceC7448l.mo870l(16.0f);
        final int iMo870l4 = interfaceC7448l.mo870l(f3);
        final AbstractC10113l abstractC10113l2 = abstractC10113lAdcel2;
        final AbstractC10113l abstractC10113l3 = abstractC10113lAdcel3;
        final AbstractC10113l abstractC10113l4 = abstractC10113lAdcel4;
        final AbstractC10113l abstractC10113l5 = abstractC10113lAdcel;
        return interfaceC7448l.isVip(iAdmob, iAmazon, C14054l.f27396l, new Function1() { // from class: lَِؒ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iRound;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                AbstractC10113l abstractC10113l6 = abstractC10113l5;
                int i7 = iMo870l2;
                boolean z5 = z4;
                int iRound2 = iMo870l4;
                int i8 = iAmazon;
                if (abstractC10113l6 != null) {
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l6, i7, z5 ? iRound2 : Math.round(((i8 - abstractC10113l6.f20591l) / 2.0f) * 1.0f));
                }
                int i9 = i7 + (abstractC10113l6 != null ? abstractC10113l6.f20592l : 0);
                AbstractC10113l abstractC10113l7 = abstractC10113l3;
                AbstractC10113l abstractC10113l8 = abstractC10113l;
                AbstractC10113l abstractC10113l9 = abstractC10113l4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i8 - (((abstractC10113l7 != null ? abstractC10113l7.f20591l : 0) + (abstractC10113l8 != null ? abstractC10113l8.f20591l : 0)) + (abstractC10113l9 != null ? abstractC10113l9.f20591l : 0))) / 2.0f) * 1.0f);
                }
                if (abstractC10113l8 != null) {
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l8, i9, iRound);
                }
                int i10 = iRound + (abstractC10113l8 != null ? abstractC10113l8.f20591l : 0);
                if (abstractC10113l7 != null) {
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l7, i9, i10);
                }
                int i11 = i10 + (abstractC10113l7 != null ? abstractC10113l7.f20591l : 0);
                if (abstractC10113l9 != null) {
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l9, i9, i11);
                }
                AbstractC10113l abstractC10113l10 = abstractC10113l2;
                if (abstractC10113l10 != null) {
                    int i12 = (iAdmob - iMo870l3) - abstractC10113l10.f20592l;
                    if (!z5) {
                        iRound2 = Math.round(((i8 - abstractC10113l10.f20591l) / 2.0f) * 1.0f);
                    }
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l10, i12, iRound2);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC5344l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        return billing(interfaceC12822l, (ArrayList) list, i, C17428l.f33963l);
    }

    @Override // defpackage.InterfaceC5344l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        return mopub(interfaceC12822l, (ArrayList) list, i, C3051l.f6575l);
    }
}
