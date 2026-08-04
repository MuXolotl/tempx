package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16128l implements InterfaceC10835l {
    public final int amazon;
    public final InterfaceC11780l billing;
    public final InterfaceC6947l crashlytics;
    public final InterfaceC3501l loadAd;
    public final float purchase;
    public final InterfaceC6477l yandex;

    public C16128l(InterfaceC6477l interfaceC6477l, InterfaceC3501l interfaceC3501l, InterfaceC6947l interfaceC6947l, int i, float f, InterfaceC11780l interfaceC11780l) {
        this.yandex = interfaceC6477l;
        this.loadAd = interfaceC3501l;
        this.crashlytics = interfaceC6947l;
        this.amazon = i;
        this.purchase = f;
        this.billing = interfaceC11780l;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        Integer numValueOf;
        int iMo870l = interfaceC12822l.mo870l(this.purchase);
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
        return Math.max(iMo870l, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        int size = list.size();
        int iRemoteconfig = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iRemoteconfig += ((InterfaceC6357l) list.get(i2)).remoteconfig(i);
        }
        return iRemoteconfig;
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, final long j) {
        int iAdmob;
        int i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i2);
            if (AbstractC8576l.yandex(AbstractC14312l.subs(interfaceC6357l), "navigationIcon")) {
                final AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, 0, 0, 0, 14, j));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) list.get(i3);
                    if (AbstractC8576l.yandex(AbstractC14312l.subs(interfaceC6357l2), "actionIcons")) {
                        final AbstractC10113l abstractC10113lAdcel2 = interfaceC6357l2.adcel(C15519l.yandex(0, 0, 0, 0, 14, j));
                        EnumC9931l layoutDirection = interfaceC7448l.getLayoutDirection();
                        InterfaceC11780l interfaceC11780l = this.billing;
                        float fBilling = AbstractC3605l.billing(interfaceC11780l, layoutDirection);
                        float fPurchase = AbstractC3605l.purchase(interfaceC11780l, interfaceC7448l.getLayoutDirection());
                        int iMax = Math.max(interfaceC7448l.mo870l(AbstractC18079l.billing), abstractC10113lAdcel.f20592l);
                        if (C15519l.admob(j) == Integer.MAX_VALUE) {
                            iAdmob = C15519l.admob(j);
                        } else {
                            int iAdmob2 = (((C15519l.admob(j) - iMax) - abstractC10113lAdcel2.f20592l) - interfaceC7448l.mo870l(fBilling)) - interfaceC7448l.mo870l(fPurchase);
                            iAdmob = iAdmob2 < 0 ? 0 : iAdmob2;
                        }
                        int i4 = iAdmob;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) list.get(i5);
                            if (AbstractC8576l.yandex(AbstractC14312l.subs(interfaceC6357l3), "title")) {
                                final AbstractC10113l abstractC10113lAdcel3 = interfaceC6357l3.adcel(C15519l.yandex(0, i4, 0, 0, 12, j));
                                C17857l c17857l = AbstractC12013l.loadAd;
                                final int iMo884throw = abstractC10113lAdcel3.mo884throw(c17857l) != Integer.MIN_VALUE ? abstractC10113lAdcel3.mo884throw(c17857l) : 0;
                                float fInvoke = this.yandex.invoke();
                                int iAds = Float.isNaN(fInvoke) ? 0 : AbstractC5573l.ads(fInvoke);
                                final int iMax2 = Math.max(interfaceC7448l.mo870l(this.purchase), abstractC10113lAdcel3.f20591l) + interfaceC7448l.mo870l(interfaceC11780l.amazon()) + interfaceC7448l.mo870l(interfaceC11780l.yandex());
                                if (C15519l.mopub(j) == Integer.MAX_VALUE) {
                                    i = iMax2;
                                } else {
                                    int i6 = iAds + iMax2;
                                    i = i6 >= 0 ? i6 : 0;
                                }
                                int iMo870l = interfaceC7448l.mo870l(interfaceC11780l.amazon());
                                int iMo870l2 = interfaceC7448l.mo870l(interfaceC11780l.yandex());
                                final int iMo870l3 = interfaceC7448l.mo870l(AbstractC3605l.billing(interfaceC11780l, interfaceC7448l.getLayoutDirection()));
                                final int iMo870l4 = interfaceC7448l.mo870l(AbstractC3605l.purchase(interfaceC11780l, interfaceC7448l.getLayoutDirection()));
                                final int i7 = (iMo870l + i) - iMo870l2;
                                return interfaceC7448l.isVip(C15519l.admob(j), i, C14054l.f27396l, new Function1() { // from class: lُٓۙ
                                    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
                                    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
                                    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
                                    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
                                    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
                                    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
                                    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int iAdmob3;
                                        InterfaceC3501l interfaceC3501l;
                                        int iMax3;
                                        int i8;
                                        int i9;
                                        int i10;
                                        int i11;
                                        int i12;
                                        AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                                        AbstractC10113l abstractC10113l = abstractC10113lAdcel;
                                        int i13 = abstractC10113l.f20591l;
                                        int i14 = i7;
                                        int i15 = iMo870l3;
                                        AbstractC9601l.smaato(abstractC9601l, abstractC10113l, i15, (i14 - i13) / 2);
                                        int iMax4 = Math.max(AbstractC9361l.yandex(abstractC9601l, AbstractC18079l.billing), abstractC10113l.f20592l);
                                        AbstractC10113l abstractC10113l2 = abstractC10113lAdcel2;
                                        int i16 = abstractC10113l2.f20592l;
                                        C16128l c16128l = this;
                                        InterfaceC6947l interfaceC6947l = c16128l.crashlytics;
                                        AbstractC10113l abstractC10113l3 = abstractC10113lAdcel3;
                                        int i17 = abstractC10113l3.f20592l;
                                        long j2 = j;
                                        int iYandex = interfaceC6947l.yandex(i17, C15519l.admob(j2), EnumC9931l.f20223l);
                                        if (iYandex >= iMax4) {
                                            if (abstractC10113l3.f20592l + iYandex > C15519l.admob(j2) - i16) {
                                                iAdmob3 = (C15519l.admob(j2) - i16) - (abstractC10113l3.f20592l + iYandex);
                                            }
                                            interfaceC3501l = c16128l.loadAd;
                                            if (interfaceC3501l.equals(AbstractC8313l.purchase)) {
                                                iMax3 = (i14 - abstractC10113l3.f20591l) / 2;
                                            } else if (interfaceC3501l.equals(AbstractC8313l.amazon)) {
                                                i8 = c16128l.amazon;
                                                i9 = abstractC10113l3.f20591l;
                                                if (i8 == 0) {
                                                    iMax3 = i14 - i9;
                                                } else {
                                                    i10 = i8 - (i9 - iMo884throw);
                                                    i11 = i10 + i9;
                                                    i12 = iMax2;
                                                    if (i11 > i12) {
                                                        i10 -= i11 - i12;
                                                    }
                                                    iMax3 = (i14 - i9) - Math.max(0, i10);
                                                }
                                            } else {
                                                iMax3 = 0;
                                            }
                                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l3, iYandex, iMax3);
                                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l2, (C15519l.admob(j2) - abstractC10113l2.f20592l) - iMo870l4, (i14 - abstractC10113l2.f20591l) / 2);
                                            return Unit.INSTANCE;
                                        }
                                        iAdmob3 = iMax4 - iYandex;
                                        iYandex += iAdmob3 + i15;
                                        interfaceC3501l = c16128l.loadAd;
                                        if (interfaceC3501l.equals(AbstractC8313l.purchase)) {
                                            iMax3 = (i14 - abstractC10113l3.f20591l) / 2;
                                        } else if (interfaceC3501l.equals(AbstractC8313l.amazon)) {
                                            i8 = c16128l.amazon;
                                            i9 = abstractC10113l3.f20591l;
                                            if (i8 == 0) {
                                                iMax3 = i14 - i9;
                                            } else {
                                                i10 = i8 - (i9 - iMo884throw);
                                                i11 = i10 + i9;
                                                i12 = iMax2;
                                                if (i11 > i12) {
                                                    i10 -= i11 - i12;
                                                }
                                                iMax3 = (i14 - i9) - Math.max(0, i10);
                                            }
                                        } else {
                                            iMax3 = 0;
                                        }
                                        AbstractC9601l.smaato(abstractC9601l, abstractC10113l3, iYandex, iMax3);
                                        AbstractC9601l.smaato(abstractC9601l, abstractC10113l2, (C15519l.admob(j2) - abstractC10113l2.f20592l) - iMo870l4, (i14 - abstractC10113l2.f20591l) / 2);
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
                        C17132l.firebase();
                        return null;
                    }
                    i3++;
                    this = this;
                }
                AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
                C17132l.firebase();
                return null;
            }
        }
        AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
        C17132l.firebase();
        return null;
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        Integer numValueOf;
        int iMo870l = interfaceC12822l.mo870l(this.purchase);
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
        return Math.max(iMo870l, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        int size = list.size();
        int iMetrica = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMetrica += ((InterfaceC6357l) list.get(i2)).metrica(i);
        }
        return iMetrica;
    }
}
