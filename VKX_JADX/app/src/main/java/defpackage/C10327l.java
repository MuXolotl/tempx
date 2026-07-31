package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10327l implements InterfaceC10835l {
    public final /* synthetic */ int yandex;
    public static final C10327l loadAd = new C10327l(0);
    public static final C10327l crashlytics = new C10327l(1);
    public static final C10327l amazon = new C10327l(2);
    public static final C10327l purchase = new C10327l(3);
    public static final C10327l billing = new C10327l(4);
    public static final C4741l mopub = new C4741l(16);
    public static final C10327l admob = new C10327l(5);
    public static final C10327l subs = new C10327l(6);
    public static final C10327l isPro = new C10327l(7);
    public static final C10327l firebase = new C10327l(8);

    public /* synthetic */ C10327l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        int i2 = this.yandex;
        return AbstractC1757l.smaato(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        int i2 = this.yandex;
        return AbstractC1757l.Signature(this, interfaceC12822l, list, i);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[PHI: r4 r6
  0x0114: PHI (r4v26 int) = (r4v25 int), (r4v31 int), (r4v31 int) binds: [B:68:0x012c, B:61:0x0108, B:63:0x010e] A[DONT_GENERATE, DONT_INLINE]
  0x0114: PHI (r6v4 int) = (r6v3 int), (r6v9 int), (r6v9 int) binds: [B:68:0x012c, B:61:0x0108, B:63:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        Object obj;
        Object obj2;
        int iMo870l;
        int iMax;
        int i;
        int iMo884throw;
        int i2 = this.yandex;
        C14054l c14054l = C14054l.f27396l;
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iIsPro = 0;
                int iSubs = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) list.get(i3)).adcel(j);
                    iIsPro = Math.max(iIsPro, abstractC10113lAdcel.f20592l);
                    iSubs = Math.max(iSubs, abstractC10113lAdcel.f20591l);
                    arrayList.add(abstractC10113lAdcel);
                }
                if (list.isEmpty()) {
                    iIsPro = C15519l.isPro(j);
                    iSubs = C15519l.subs(j);
                }
                return interfaceC7448l.isVip(iIsPro, iSubs, c14054l, new C4819l(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return interfaceC7448l.isVip(0, 0, c14054l, C11192l.f22540l);
                }
                if (size2 == 1) {
                    AbstractC10113l abstractC10113lAdcel2 = ((InterfaceC6357l) list.get(0)).adcel(j);
                    return interfaceC7448l.isVip(abstractC10113lAdcel2.f20592l, abstractC10113lAdcel2.f20591l, c14054l, new C16441l(abstractC10113lAdcel2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax2 = 0;
                int iMax3 = 0;
                for (int i4 = 0; i4 < size3; i4++) {
                    AbstractC10113l abstractC10113lAdcel3 = ((InterfaceC6357l) list.get(i4)).adcel(j);
                    iMax2 = Math.max(iMax2, abstractC10113lAdcel3.f20592l);
                    iMax3 = Math.max(iMax3, abstractC10113lAdcel3.f20591l);
                    arrayList2.add(abstractC10113lAdcel3);
                }
                return interfaceC7448l.isVip(iMax2, iMax3, c14054l, new C4819l(1, arrayList2));
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    arrayList3.add(((InterfaceC6357l) list.get(i5)).adcel(j));
                }
                return interfaceC7448l.isVip(C15519l.admob(j), C15519l.mopub(j), c14054l, new C8103l(0, arrayList3));
            case 3:
                return interfaceC7448l.isVip(C15519l.isPro(j), C15519l.subs(j), c14054l, new C10351l(18));
            case 4:
                return interfaceC7448l.isVip(C15519l.admob(j), C15519l.mopub(j), c14054l, mopub);
            case 5:
                return interfaceC7448l.isVip(C15519l.isPro(j), C15519l.subs(j), c14054l, new C17049l(27));
            case 6:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int iMax4 = 0;
                int iMax5 = 0;
                for (int i6 = 0; i6 < size5; i6++) {
                    AbstractC10113l abstractC10113lAdcel4 = ((InterfaceC6357l) list.get(i6)).adcel(j);
                    iMax4 = Math.max(iMax4, abstractC10113lAdcel4.f20592l);
                    iMax5 = Math.max(iMax5, abstractC10113lAdcel4.f20591l);
                    arrayList4.add(abstractC10113lAdcel4);
                }
                return interfaceC7448l.isVip(iMax4, iMax5, c14054l, new C8103l(3, arrayList4));
            case 7:
                return interfaceC7448l.isVip(C15519l.billing(j) ? C15519l.admob(j) : 0, C15519l.purchase(j) ? C15519l.mopub(j) : 0, c14054l, new C1698l(15));
            case 8:
                return interfaceC7448l.isVip(C15519l.isPro(j), C15519l.subs(j), c14054l, new C12176l(20));
            default:
                int iMin = Math.min(C15519l.admob(j), interfaceC7448l.mo870l(600.0f));
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size6) {
                        obj = list.get(i7);
                        if (!AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj), "action")) {
                            i7++;
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj;
                final AbstractC10113l abstractC10113lAdcel5 = interfaceC6357l != null ? interfaceC6357l.adcel(j) : null;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size7) {
                        obj2 = list.get(i8);
                        if (!AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj2), "dismissAction")) {
                            i8++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) obj2;
                AbstractC10113l abstractC10113lAdcel6 = interfaceC6357l2 != null ? interfaceC6357l2.adcel(j) : null;
                int i9 = abstractC10113lAdcel5 != null ? abstractC10113lAdcel5.f20592l : 0;
                int i10 = abstractC10113lAdcel5 != null ? abstractC10113lAdcel5.f20591l : 0;
                int i11 = abstractC10113lAdcel6 != null ? abstractC10113lAdcel6.f20592l : 0;
                int i12 = abstractC10113lAdcel6 != null ? abstractC10113lAdcel6.f20591l : 0;
                int iMo870l2 = ((iMin - i9) - i11) - (i11 == 0 ? interfaceC7448l.mo870l(8.0f) : 0);
                int iIsPro2 = C15519l.isPro(j);
                if (iMo870l2 < iIsPro2) {
                    iMo870l2 = iIsPro2;
                }
                int size8 = list.size();
                int i13 = 0;
                while (i13 < size8) {
                    InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) list.get(i13);
                    int i14 = i12;
                    if (AbstractC8576l.yandex(AbstractC14312l.subs(interfaceC6357l3), "text")) {
                        final AbstractC10113l abstractC10113lAdcel7 = interfaceC6357l3.adcel(C15519l.yandex(0, iMo870l2, 0, 0, 9, j));
                        C17857l c17857l = AbstractC12013l.yandex;
                        int iMo884throw2 = abstractC10113lAdcel7.mo884throw(c17857l);
                        int iMo884throw3 = abstractC10113lAdcel7.mo884throw(AbstractC12013l.loadAd);
                        final int i15 = iMin - i11;
                        final int i16 = i15 - i9;
                        if (iMo884throw2 == iMo884throw3 || !(iMo884throw2 != Integer.MIN_VALUE && iMo884throw3 != Integer.MIN_VALUE)) {
                            iMax = Math.max(interfaceC7448l.mo870l(48.0f), Math.max(i10, i14));
                            iMo870l = (iMax - abstractC10113lAdcel7.f20591l) / 2;
                            if (abstractC10113lAdcel5 == null || (iMo884throw = abstractC10113lAdcel5.mo884throw(c17857l)) == Integer.MIN_VALUE) {
                                i = 0;
                            } else {
                                i = (iMo884throw2 + iMo870l) - iMo884throw;
                            }
                        } else {
                            iMo870l = interfaceC7448l.mo870l(30.0f) - iMo884throw2;
                            iMax = Math.max(interfaceC7448l.mo870l(68.0f), abstractC10113lAdcel7.f20591l + iMo870l);
                            if (abstractC10113lAdcel5 != null) {
                                i = (iMax - abstractC10113lAdcel5.f20591l) / 2;
                            } else {
                                i = 0;
                            }
                        }
                        final int i17 = iMo870l;
                        final int i18 = abstractC10113lAdcel6 != null ? (iMax - abstractC10113lAdcel6.f20591l) / 2 : 0;
                        final AbstractC10113l abstractC10113l = abstractC10113lAdcel6;
                        final int i19 = i;
                        return interfaceC7448l.isVip(iMin, iMax, c14054l, new Function1() { // from class: lٌُؒ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                AbstractC9601l abstractC9601l = (AbstractC9601l) obj3;
                                AbstractC9601l.smaato(abstractC9601l, abstractC10113lAdcel7, 0, i17);
                                AbstractC10113l abstractC10113l2 = abstractC10113lAdcel5;
                                if (abstractC10113l2 != null) {
                                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l2, i16, i19);
                                }
                                AbstractC10113l abstractC10113l3 = abstractC10113l;
                                if (abstractC10113l3 != null) {
                                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l3, i15, i18);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i13++;
                    i12 = i14;
                }
                AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
                C17132l.firebase();
                return null;
        }
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        int i2 = this.yandex;
        return AbstractC1757l.ads(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        int i2 = this.yandex;
        return AbstractC1757l.metrica(this, interfaceC12822l, list, i);
    }
}
