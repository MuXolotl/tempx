package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3951l {
    public static final C4776l yandex = AbstractC0532l.subs(250, 2, AbstractC5341l.yandex);

    public static final void yandex(final int i, final InterfaceC17242l interfaceC17242l, final long j, long j2, final float f, final float f2, final float f3, final C15578l c15578l, final C15578l c15578l2, C6956l c6956l, final int i2) {
        final long j3;
        int i3;
        long jPurchase;
        c6956l.m2133new(-1510879887);
        int i4 = i2 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | 1024;
        if (c6956l.m2127for(i4 & 1, (38347923 & i4) != 38347922)) {
            c6956l.m2141switch();
            if ((i2 & 1) == 0 || c6956l.ad()) {
                i3 = i4 & (-7169);
                jPurchase = AbstractC15038l.purchase(c6956l, AbstractC4049l.loadAd);
            } else {
                c6956l.m2124else();
                i3 = i4 & (-7169);
                jPurchase = j2;
            }
            c6956l.adcel();
            long j4 = jPurchase;
            AbstractC3274l.yandex(interfaceC17242l, null, j, j4, 0.0f, 0.0f, null, AbstractC14566l.amazon(-1119692426, new Function2() { // from class: lْٛۗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C11194l c11194lCrashlytics = AbstractC13841l.crashlytics(c6956l2);
                        Object objM2132native = c6956l2.m2132native();
                        C13863l c13863l = C1867l.yandex;
                        if (objM2132native == c13863l) {
                            objM2132native = AbstractC12311l.isPro(c6956l2);
                            c6956l2.m2147try(objM2132native);
                        }
                        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
                        boolean zBilling = c6956l2.billing(c11194lCrashlytics) | c6956l2.billing(interfaceC2262l);
                        Object objM2132native2 = c6956l2.m2132native();
                        if (zBilling || objM2132native2 == c13863l) {
                            objM2132native2 = new C17607l(c11194lCrashlytics, interfaceC2262l);
                            c6956l2.m2147try(objM2132native2);
                        }
                        final C17607l c17607l = (C17607l) objM2132native2;
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0019l.amazon(AbstractC4962l.yandex(AbstractC13841l.purchase(AbstractC0080l.adcel(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), C18450l.f36035l), c11194lCrashlytics, false), false, new C10557l(21)));
                        final float f4 = f;
                        boolean zCrashlytics = c6956l2.crashlytics(f4);
                        final C15578l c15578l3 = c15578l2;
                        boolean zBilling2 = zCrashlytics | c6956l2.billing(c15578l3);
                        final float f5 = f2;
                        boolean zCrashlytics2 = zBilling2 | c6956l2.crashlytics(f5);
                        final float f6 = f3;
                        boolean zCrashlytics3 = zCrashlytics2 | c6956l2.crashlytics(f6);
                        final C15578l c15578l4 = c15578l;
                        boolean zBilling3 = zCrashlytics3 | c6956l2.billing(c15578l4) | c6956l2.admob(c17607l);
                        final int i5 = i;
                        boolean zAmazon = c6956l2.amazon(i5) | zBilling3;
                        Object objM2132native3 = c6956l2.m2132native();
                        if (zAmazon || objM2132native3 == c13863l) {
                            Function2 function2 = new Function2() { // from class: lًٕٛ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    final InterfaceC15847l interfaceC15847l = (InterfaceC15847l) obj3;
                                    C15519l c15519l = (C15519l) obj4;
                                    final int iMo870l = interfaceC15847l.mo870l(f4);
                                    List listAds = interfaceC15847l.ads(EnumC11747l.f23526l, c15578l3);
                                    Iterator it = listAds.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(iMax, ((InterfaceC6357l) it.next()).crashlytics(Alert.DURATION_SHOW_INDEFINITELY));
                                    }
                                    long jYandex = C15519l.yandex(0, 0, iMax, 0, 11, c15519l.yandex);
                                    final ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listAds, 10));
                                    Iterator it2 = listAds.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((InterfaceC6357l) it2.next()).adcel(jYandex));
                                    }
                                    int iMo870l2 = iMo870l * 2;
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        final int i6 = iMax;
                                        final float f7 = f5;
                                        if (!zHasNext) {
                                            final int iMo870l3 = interfaceC15847l.mo870l(f6) + iMo870l2;
                                            final C17607l c17607l2 = c17607l;
                                            final int i7 = i5;
                                            final C15578l c15578l5 = c15578l4;
                                            return interfaceC15847l.isVip(iMo870l3, i6, C14054l.f27396l, new Function1() { // from class: lؙُۡ
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj5) {
                                                    AbstractC9601l abstractC9601l = (AbstractC9601l) obj5;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    ArrayList<AbstractC10113l> arrayList3 = arrayList;
                                                    int i8 = iMo870l;
                                                    int iYandex = i8;
                                                    for (AbstractC10113l abstractC10113l : arrayList3) {
                                                        arrayList2.add(new C9647l(abstractC9601l.mo872static(iYandex), abstractC9601l.mo872static(abstractC10113l.f20592l)));
                                                        iYandex += AbstractC9361l.yandex(abstractC9601l, f7) + abstractC10113l.f20592l;
                                                    }
                                                    C15578l c15578l6 = new C15578l(-1486999506, true, new C14601l(c15578l5, arrayList2, 12));
                                                    InterfaceC15847l interfaceC15847l2 = interfaceC15847l;
                                                    for (InterfaceC6357l interfaceC6357l : interfaceC15847l2.ads(EnumC11747l.f23525l, c15578l6)) {
                                                        int i9 = iMo870l3;
                                                        boolean z = i9 >= 0;
                                                        int i10 = i6;
                                                        if (!(z & (i10 >= 0))) {
                                                            AbstractC10280l.yandex("width and height must be >= 0");
                                                        }
                                                        AbstractC9601l.smaato(abstractC9601l, interfaceC6357l.adcel(AbstractC7563l.admob(i9, i9, i10, i10)), 0, 0);
                                                    }
                                                    int i11 = 0;
                                                    for (Object obj6 : arrayList3) {
                                                        int i12 = i11 + 1;
                                                        if (i11 < 0) {
                                                            AbstractC14055l.subscription();
                                                            throw null;
                                                        }
                                                        AbstractC9601l.smaato(abstractC9601l, (AbstractC10113l) obj6, AbstractC9361l.yandex(abstractC9601l, ((C9647l) arrayList2.get(i11)).yandex), 0);
                                                        i11 = i12;
                                                    }
                                                    C17607l c17607l3 = c17607l2;
                                                    C11194l c11194l = c17607l3.yandex;
                                                    Integer num = c17607l3.crashlytics;
                                                    int i13 = i7;
                                                    if (num == null || num.intValue() != i13) {
                                                        c17607l3.crashlytics = Integer.valueOf(i13);
                                                        C9647l c9647l = (C9647l) AbstractC16901l.m4220for(i13, arrayList2);
                                                        if (c9647l != null) {
                                                            C9647l c9647l2 = (C9647l) AbstractC16901l.m4214continue(arrayList2);
                                                            int iMo870l4 = interfaceC15847l2.mo870l(c9647l2.yandex + c9647l2.loadAd) + i8;
                                                            int iAdmob = iMo870l4 - c11194l.billing.admob();
                                                            int iMo870l5 = interfaceC15847l2.mo870l(c9647l.yandex) - ((iAdmob / 2) - (interfaceC15847l2.mo870l(c9647l.loadAd) / 2));
                                                            int i14 = iMo870l4 - iAdmob;
                                                            if (i14 < 0) {
                                                                i14 = 0;
                                                            }
                                                            int iPurchase = AbstractC8576l.purchase(iMo870l5, 0, i14);
                                                            if (c11194l.yandex.admob() != iPurchase) {
                                                                AbstractC10999l.mopub(c17607l3.loadAd, null, 0, new C13017l(c17607l3, iPurchase, (InterfaceC14029l) null, 6), 3);
                                                            }
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            });
                                        }
                                        iMo870l2 = iMo870l2 + ((AbstractC10113l) it3.next()).f20592l + interfaceC15847l.mo870l(f7);
                                        iMax = i6;
                                    }
                                }
                            };
                            c6956l2.m2147try(function2);
                            objM2132native3 = function2;
                        }
                        AbstractC4333l.yandex(interfaceC17242lAmazon, (Function2) objM2132native3, c6956l2, 0, 0);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, ((i3 >> 3) & 14) | 12583296, 114);
            j3 = j4;
        } else {
            c6956l.m2124else();
            j3 = j2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i, interfaceC17242l, j, j3, f, f2, f3, c15578l, c15578l2, i2) { // from class: lُٖؓ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ long f22272l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ float f22273l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f22274l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f22275l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ int f22276l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ float f22277l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ long f22278l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f22279l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ float f22280l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(115040641);
                    AbstractC3951l.yandex(this.f22276l, this.f22275l, this.f22272l, this.f22278l, this.f22277l, this.f22280l, this.f22273l, this.f22274l, this.f22279l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
