package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lْٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14333l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f28074l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28075l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f28076l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3102l f28077l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28078l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ String f28079l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f28080l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C0471l f28081l;

    public /* synthetic */ C14333l(C0471l c0471l, InterfaceC2262l interfaceC2262l, C2663l c2663l, String str, long j, String str2, int i) {
        this.f28081l = c0471l;
        this.f28076l = interfaceC2262l;
        this.f28077l = c2663l;
        this.f28074l = str;
        this.f28080l = j;
        this.f28079l = str2;
        this.f28075l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f28078l;
        C13863l c13863l = C1867l.yandex;
        Object obj4 = this.f28076l;
        switch (i) {
            case 0:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 19) != 18)) {
                    C0471l c0471l = this.f28081l;
                    boolean z = c0471l.m564finally() instanceof C15842l;
                    boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(c0471l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C1717l(interfaceC2262l, c0471l, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC9256l.loadAd(z, (Function0) objM2132native, null, null, null, null, false, 0.0f, AbstractC14566l.amazon(522055469, new C14333l(this.f28077l, this.f28074l, this.f28080l, interfaceC11780l, this.f28079l, c0471l, this.f28075l), c6956l), c6956l, 100663296, 252);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                final InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C17253l c17253lLoadAd = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).loadAd(c6956l2);
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), this.f28077l.loadAd(), null);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    final String str = this.f28074l;
                    boolean zBilling = c6956l2.billing(str);
                    final long j = this.f28080l;
                    boolean zPurchase = zBilling | c6956l2.purchase(j) | c6956l2.billing(interfaceC11780l2);
                    final String str2 = this.f28079l;
                    boolean zBilling2 = zPurchase | c6956l2.billing(str2);
                    final C0471l c0471l2 = this.f28081l;
                    boolean zAdmob2 = zBilling2 | c6956l2.admob(c0471l2);
                    final int i2 = this.f28075l;
                    boolean zAmazon = c6956l2.amazon(i2) | zAdmob2;
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAmazon || objM2132native2 == c13863l) {
                        Function1 function1 = new Function1() { // from class: lًۥۣ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                C1336l c1336l = (C1336l) obj5;
                                final String str3 = str;
                                final long j2 = j;
                                final InterfaceC11780l interfaceC11780l3 = interfaceC11780l2;
                                final String str4 = str2;
                                final C0471l c0471l3 = c0471l2;
                                int i3 = 1;
                                C15578l c15578l = new C15578l(-2116278536, true, new Function3() { // from class: lٞؑ
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) throws IOException {
                                        C16395l c16395l;
                                        C6956l c6956l3 = (C6956l) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            C4346l c4346l = C4346l.f8873l;
                                            InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(AbstractC0080l.amazon(c4346l, 1.0f));
                                            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                                            long j3 = c6956l3.f14595continue;
                                            int i4 = (int) (j3 ^ (j3 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                                            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lPurchase);
                                            InterfaceC8801l.firebase.getClass();
                                            C16395l c16395l2 = C3438l.loadAd;
                                            c6956l3.m2140super();
                                            if (c6956l3.f14603switch) {
                                                c6956l3.firebase(c16395l2);
                                            } else {
                                                c6956l3.m2136protected();
                                            }
                                            C6415l c6415l = C3438l.mopub;
                                            AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, c6415l);
                                            C6415l c6415l2 = C3438l.billing;
                                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, c6415l2);
                                            Integer numValueOf = Integer.valueOf(i4);
                                            C6415l c6415l3 = C3438l.isPro;
                                            AbstractC8182l.billing(c6956l3, numValueOf, c6415l3);
                                            C11192l c11192l = C3438l.firebase;
                                            AbstractC8182l.purchase(c6956l3, c11192l);
                                            C6415l c6415l4 = C3438l.amazon;
                                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, c6415l4);
                                            C18627l c18627l = new C18627l(AbstractC13106l.purchase(c6956l3).signatures);
                                            C18627l c18627l2 = new C18627l(AbstractC13106l.purchase(c6956l3).signatures);
                                            C9477l c9477l = new C9477l((Context) c6956l3.isPro(AbstractC1242l.loadAd));
                                            c9477l.crashlytics = str3;
                                            AbstractC12872l.crashlytics(c9477l, new C5739l(AbstractC12098l.crashlytics(c6956l3)));
                                            C7819l c7819lYandex = c9477l.yandex();
                                            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                                            long j4 = j2;
                                            boolean zPurchase2 = c6956l3.purchase(j4);
                                            Object objM2132native3 = c6956l3.m2132native();
                                            if (zPurchase2 || objM2132native3 == C1867l.yandex) {
                                                objM2132native3 = new C4199l(j4, 8);
                                                c6956l3.m2147try(objM2132native3);
                                            }
                                            AbstractC7741l.purchase(c7819lYandex, null, AbstractC14289l.smaato(interfaceC17242lCrashlytics, (Function1) objM2132native3), c18627l, c18627l2, C4176l.yandex, c6956l3, 36912, 6, 31712);
                                            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(AbstractC3605l.firebase(AbstractC0080l.amazon(c4346l, 1.0f), interfaceC11780l3), C18450l.f36021l), 16.0f, 0.0f, 2);
                                            C7537l c7537l2 = new C7537l(8.0f, true, new C8339l(12));
                                            C15089l c15089l = C18450l.f36046l;
                                            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l2, c15089l, c6956l3, 6);
                                            long j5 = c6956l3.f14595continue;
                                            int i5 = (int) (j5 ^ (j5 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                                            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip);
                                            c6956l3.m2140super();
                                            if (c6956l3.f14603switch) {
                                                c16395l = c16395l2;
                                                c6956l3.firebase(c16395l);
                                            } else {
                                                c16395l = c16395l2;
                                                c6956l3.m2136protected();
                                            }
                                            AbstractC8182l.billing(c6956l3, c1853lYandex, c6415l);
                                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, c6415l2);
                                            AbstractC11043l.isPro(i5, c6956l3, c6415l3, c6956l3, c11192l);
                                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, c6415l4);
                                            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l3, 54);
                                            long j6 = c6956l3.f14595continue;
                                            int i6 = (int) (j6 ^ (j6 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato3 = c6956l3.smaato();
                                            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                                            c6956l3.m2140super();
                                            if (c6956l3.f14603switch) {
                                                c6956l3.firebase(c16395l);
                                            } else {
                                                c6956l3.m2136protected();
                                            }
                                            AbstractC8182l.billing(c6956l3, c5062lYandex, c6415l);
                                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato3, c6415l2);
                                            AbstractC11043l.isPro(i6, c6956l3, c6415l3, c6956l3, c11192l);
                                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling3, c6415l4);
                                            C16395l c16395l3 = c16395l;
                                            AbstractC7741l.purchase(str4, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 120.0f), AbstractC13106l.billing(c6956l3).crashlytics), new C18627l(AbstractC13106l.purchase(c6956l3).signatures), new C18627l(AbstractC13106l.purchase(c6956l3).signatures), null, c6956l3, 36912, 0, 32736);
                                            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l3, 6);
                                            long j7 = c6956l3.f14595continue;
                                            int i7 = (int) (j7 ^ (j7 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato4 = c6956l3.smaato();
                                            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l3, c4346l);
                                            c6956l3.m2140super();
                                            if (c6956l3.f14603switch) {
                                                c6956l3.firebase(c16395l3);
                                            } else {
                                                c6956l3.m2136protected();
                                            }
                                            AbstractC8182l.billing(c6956l3, c1853lYandex2, c6415l);
                                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato4, c6415l2);
                                            AbstractC11043l.isPro(i7, c6956l3, c6415l3, c6956l3, c11192l);
                                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling4, c6415l4);
                                            C0471l c0471l4 = c0471l3;
                                            AbstractC13010l.loadAd(c0471l4.m566public().yandex.amazon, null, AbstractC13106l.purchase(c6956l3).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 2, 0, AbstractC13106l.admob(c6956l3).amazon, c6956l3, 0, 24576, 114682);
                                            AbstractC13010l.loadAd(c0471l4.m566public().yandex.yandex, null, AbstractC13106l.purchase(c6956l3).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c6956l3, 0, 24576, 245754);
                                            c6956l3.startapp(true);
                                            c6956l3.startapp(true);
                                            c6956l3.startapp(true);
                                            c6956l3.startapp(true);
                                        } else {
                                            c6956l3.m2124else();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                                int i4 = 3;
                                AbstractC1757l.appmetrica(c1336l, null, null, c15578l, 3);
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-260229727, true, new C13993l(c0471l3, i2, 0)), 3);
                                if (c0471l3.m566public().yandex.firebase != null) {
                                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1445772291, true, new C4385l(c0471l3, i3)), 3);
                                }
                                if (!c0471l3.m566public().yandex.isPro.isEmpty()) {
                                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-148822682, true, new C4385l(c0471l3, 2)), 3);
                                }
                                if (c0471l3.m566public().yandex.crashlytics.length() > 0) {
                                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1792771451, true, new C4385l(c0471l3, i4)), 3);
                                }
                                Integer num = c0471l3.m566public().crashlytics.loadAd;
                                if ((num != null ? num.intValue() : 0) > 0) {
                                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(858247076, true, new C4385l(c0471l3, 4)), 3);
                                    List list = (List) c0471l3.m566public().crashlytics.yandex;
                                    if (list == null) {
                                        list = C2580l.f5619l;
                                    }
                                    c1336l.firebase(list.size(), null, new C13512l(list, 14, false), new C15578l(802480018, true, new C6780l(list, c0471l3, 19)));
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(function1);
                        objM2132native2 = function1;
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native2, c6956l2, 24576, 490);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14333l(InterfaceC3102l interfaceC3102l, String str, long j, InterfaceC11780l interfaceC11780l, String str2, C0471l c0471l, int i) {
        this.f28077l = interfaceC3102l;
        this.f28074l = str;
        this.f28080l = j;
        this.f28076l = interfaceC11780l;
        this.f28079l = str2;
        this.f28081l = c0471l;
        this.f28075l = i;
    }
}
