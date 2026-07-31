package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0064l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10655l f963l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f964l = 0;

    public /* synthetic */ C0064l(C10655l c10655l) {
        this.f963l = c10655l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13863l c13863l;
        C10655l c10655l;
        boolean z;
        switch (this.f964l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C15089l c15089l = C18450l.f36034l;
                    float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, fYandex, 7);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                    C10655l c10655l2 = this.f963l;
                    AbstractC7877l abstractC7877l = c10655l2.f21621l;
                    List list = c10655l2.f21620l;
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, abstractC7877l.f16423l), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    C10655l c10655l3 = c10655l2;
                    AbstractC13010l.loadAd(c10655l2.f21619l, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).firebase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.content_blocked_info), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).smaato, c6956l, 48, 0, 130040);
                    C6956l c6956l2 = c6956l;
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
                    boolean zIsEmpty = list.isEmpty();
                    C13863l c13863l2 = C1867l.yandex;
                    if (zIsEmpty) {
                        c13863l = c13863l2;
                        c10655l = c10655l3;
                        z = false;
                        c6956l2.m2123default(-578426177);
                    } else {
                        c6956l2.m2123default(-570611418);
                        c13863l = c13863l2;
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.content_blocked_alt), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l2).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).vip, c6956l2, 48, 0, 131064);
                        c6956l2 = c6956l2;
                        Iterator it = list.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC14055l.subscription();
                                throw null;
                            }
                            final C16179l c16179l = (C16179l) next;
                            int i4 = AbstractC15548l.yandex;
                            long j2 = C9735l.isPro;
                            C10707l c10707l = AbstractC16964l.yandex;
                            C6956l c6956l3 = c6956l2;
                            Iterator it2 = it;
                            C15087l c15087lYandex = AbstractC15548l.yandex(j2, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, 0L, c6956l3, 504);
                            c6956l2 = c6956l3;
                            C10655l c10655l4 = c10655l3;
                            boolean zAdmob = c6956l2.admob(c10655l4) | c6956l2.billing(c16179l);
                            Object objM2132native = c6956l2.m2132native();
                            if (zAdmob || objM2132native == c13863l) {
                                objM2132native = new C12242l(c10655l4, c16179l, 8);
                                c6956l2.m2147try(objM2132native);
                            }
                            final int i5 = 0;
                            final int i6 = 1;
                            AbstractC13319l.yandex(AbstractC14566l.amazon(-1410134866, new Function2() { // from class: lَؓۡ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i7 = i5;
                                    C16179l c16179l2 = c16179l;
                                    switch (i7) {
                                        case 0:
                                            C6956l c6956l4 = (C6956l) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, c16179l2.yandex), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                            } else {
                                                c6956l4.m2124else();
                                            }
                                            break;
                                        default:
                                            C6956l c6956l5 = (C6956l) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c16179l2.loadAd, 0, c6956l5), null, null, 0L, c6956l5, 56, 12);
                                            } else {
                                                c6956l5.m2124else();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, c6956l2), AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native, 15), null, null, AbstractC14566l.amazon(-776576982, new Function2() { // from class: lَؓۡ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i7 = i6;
                                    C16179l c16179l2 = c16179l;
                                    switch (i7) {
                                        case 0:
                                            C6956l c6956l4 = (C6956l) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, c16179l2.yandex), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                            } else {
                                                c6956l4.m2124else();
                                            }
                                            break;
                                        default:
                                            C6956l c6956l5 = (C6956l) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c16179l2.loadAd, 0, c6956l5), null, null, 0L, c6956l5, 56, 12);
                                            } else {
                                                c6956l5.m2124else();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, c6956l2), null, c15087lYandex, c6956l2, 24582, 428);
                            if (i2 != AbstractC14055l.smaato(list)) {
                                c6956l2.m2123default(1307936939);
                                AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                            } else {
                                c6956l2.m2123default(1298826070);
                            }
                            c6956l2.startapp(false);
                            it = it2;
                            i2 = i3;
                            c10655l3 = c10655l4;
                        }
                        c10655l = c10655l3;
                        z = false;
                    }
                    c6956l2.startapp(z);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                    boolean zAdmob2 = c6956l2.admob(c10655l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6335l(0, c10655l, C10655l.class, "dismiss", "dismiss()V", 0, 0, 16);
                        c6956l2.m2147try(objM2132native2);
                    }
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    C6956l c6956l4 = c6956l2;
                    AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native2), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), false, ((C14370l) c6956l4.isPro(c10707l2)).crashlytics.crashlytics, C12719l.yandex(((C14370l) c6956l2.isPro(c10707l2)).yandex.Signature, ((C14370l) c6956l2.isPro(c10707l2)).yandex.license, 0L, 0L, c6956l4, 12), null, null, c17253l, AbstractC18719l.yandex, c6956l4, 817889328, 356);
                    c6956l4.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f963l.license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0064l(C10655l c10655l, int i) {
        this.f963l = c10655l;
    }
}
