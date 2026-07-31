package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15195l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f29791l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f29792l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f29793l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6038l f29794l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29795l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ float f29796l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f29797l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f29798l;

    public /* synthetic */ C15195l(InterfaceC11780l interfaceC11780l, AudioTrack audioTrack, C6038l c6038l, int i, float f, int i2, String str) {
        this.f29793l = interfaceC11780l;
        this.f29791l = audioTrack;
        this.f29794l = c6038l;
        this.f29797l = i;
        this.f29796l = f;
        this.f29798l = i2;
        this.f29792l = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f29795l;
        C13863l c13863l = C1867l.yandex;
        Object obj4 = this.f29793l;
        switch (i) {
            case 0:
                final InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj4;
                final InterfaceC4277l interfaceC4277l = (InterfaceC4277l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC4277l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C17253l c17253lLoadAd = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).loadAd(c6956l);
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    boolean zBilling = c6956l.billing(interfaceC11780l) | ((iIntValue & 14) == 4);
                    final AudioTrack audioTrack = this.f29791l;
                    boolean zBilling2 = zBilling | c6956l.billing(audioTrack);
                    final C6038l c6038l = this.f29794l;
                    boolean zAdmob = zBilling2 | c6956l.admob(c6038l);
                    final int i2 = this.f29797l;
                    boolean zAmazon = zAdmob | c6956l.amazon(i2);
                    final float f = this.f29796l;
                    boolean zCrashlytics = zAmazon | c6956l.crashlytics(f);
                    final int i3 = this.f29798l;
                    boolean zAmazon2 = zCrashlytics | c6956l.amazon(i3);
                    final String str = this.f29792l;
                    boolean zBilling3 = zAmazon2 | c6956l.billing(str);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling3 || objM2132native == c13863l) {
                        Function1 function1 = new Function1() { // from class: lؗۜؗ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                C1336l c1336l = (C1336l) obj5;
                                InterfaceC4277l interfaceC4277l2 = interfaceC4277l;
                                InterfaceC11780l interfaceC11780l2 = interfaceC11780l;
                                final AudioTrack audioTrack2 = audioTrack;
                                final C6038l c6038l2 = c6038l;
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1578574227, true, new C11223l(interfaceC4277l2, interfaceC11780l2, audioTrack2, c6038l2, 18)), 3);
                                final int i4 = i2;
                                final float f2 = f;
                                final int i5 = i3;
                                final String str2 = str;
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(555545814, true, new Function3() { // from class: lٕؓؒ
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        C6956l c6956l2 = (C6956l) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2);
                                            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
                                            long j = c6956l2.f14595continue;
                                            int i6 = (int) (j ^ (j >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                                            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                                            InterfaceC8801l.firebase.getClass();
                                            C16395l c16395l = C3438l.loadAd;
                                            c6956l2.m2140super();
                                            if (c6956l2.f14603switch) {
                                                c6956l2.firebase(c16395l);
                                            } else {
                                                c6956l2.m2136protected();
                                            }
                                            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                                            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                                            AbstractC8182l.billing(c6956l2, Integer.valueOf(i6), C3438l.isPro);
                                            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                                            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                                            C17253l c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                                            C17253l c17253l2 = C12719l.yandex;
                                            C10707l c10707l = AbstractC16964l.yandex;
                                            C13412l c13412lYandex = C12719l.yandex(((C14370l) c6956l2.isPro(c10707l)).yandex.ads, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, 0L, c6956l2, 12);
                                            C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
                                            final int i7 = i4;
                                            boolean zAmazon3 = c6956l2.amazon(i7);
                                            AudioTrack audioTrack3 = audioTrack2;
                                            boolean zBilling4 = zAmazon3 | c6956l2.billing(audioTrack3);
                                            C6038l c6038l3 = c6038l2;
                                            boolean zAdmob2 = zBilling4 | c6956l2.admob(c6038l3);
                                            Object objM2132native2 = c6956l2.m2132native();
                                            if (zAdmob2 || objM2132native2 == C1867l.yandex) {
                                                objM2132native2 = new C18695l(i7, audioTrack3, c6038l3, 2);
                                                c6956l2.m2147try(objM2132native2);
                                            }
                                            final float f3 = f2;
                                            final int i8 = i5;
                                            final String str3 = str2;
                                            AbstractC17457l.loadAd((Function0) objM2132native2, null, false, c6839lYandex, c13412lYandex, null, null, c17253l, AbstractC14566l.amazon(35301890, new Function3() { // from class: lْٕٔ
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                    C6956l c6956l3;
                                                    C6956l c6956l4 = (C6956l) obj10;
                                                    int iIntValue3 = ((Integer) obj11).intValue();
                                                    if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                        C4346l c4346l = C4346l.f8873l;
                                                        InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(c4346l);
                                                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                                                        long j2 = c6956l4.f14595continue;
                                                        int i9 = (int) (j2 ^ (j2 >>> 32));
                                                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                                                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lPurchase);
                                                        InterfaceC8801l.firebase.getClass();
                                                        C16395l c16395l2 = C3438l.loadAd;
                                                        c6956l4.m2140super();
                                                        if (c6956l4.f14603switch) {
                                                            c6956l4.firebase(c16395l2);
                                                        } else {
                                                            c6956l4.m2136protected();
                                                        }
                                                        C6415l c6415l = C3438l.mopub;
                                                        AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon, c6415l);
                                                        C6415l c6415l2 = C3438l.billing;
                                                        AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, c6415l2);
                                                        Integer numValueOf = Integer.valueOf(i9);
                                                        C6415l c6415l3 = C3438l.isPro;
                                                        AbstractC8182l.billing(c6956l4, numValueOf, c6415l3);
                                                        C11192l c11192l = C3438l.firebase;
                                                        AbstractC8182l.purchase(c6956l4, c11192l);
                                                        C6415l c6415l4 = C3438l.amazon;
                                                        AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, c6415l4);
                                                        InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                                                        long jLoadAd = C9735l.loadAd(0.5f, ((C14370l) c6956l4.isPro(AbstractC16964l.yandex)).yandex.yandex);
                                                        long j3 = C9735l.isPro;
                                                        float f4 = f3;
                                                        boolean zCrashlytics2 = c6956l4.crashlytics(f4);
                                                        Object objM2132native3 = c6956l4.m2132native();
                                                        C13863l c13863l2 = C1867l.yandex;
                                                        if (zCrashlytics2 || objM2132native3 == c13863l2) {
                                                            objM2132native3 = new C11063l(0, f4);
                                                            c6956l4.m2147try(objM2132native3);
                                                        }
                                                        Function0 function0 = (Function0) objM2132native3;
                                                        Object objM2132native4 = c6956l4.m2132native();
                                                        if (objM2132native4 == c13863l2) {
                                                            objM2132native4 = new C9673l(4);
                                                            c6956l4.m2147try(objM2132native4);
                                                        }
                                                        AbstractC4332l.loadAd(function0, interfaceC17242lCrashlytics2, jLoadAd, j3, 2, 0.0f, (Function1) objM2132native4, c6956l4, 1772592, 0);
                                                        InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 8.0f);
                                                        C5062l c5062lYandex2 = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l4, 48);
                                                        long j4 = c6956l4.f14595continue;
                                                        int i10 = (int) (j4 ^ (j4 >>> 32));
                                                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                                                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lSmaato);
                                                        c6956l4.m2140super();
                                                        if (c6956l4.f14603switch) {
                                                            c6956l4.firebase(c16395l2);
                                                        } else {
                                                            c6956l4.m2136protected();
                                                        }
                                                        AbstractC8182l.billing(c6956l4, c5062lYandex2, c6415l);
                                                        AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, c6415l2);
                                                        AbstractC11043l.isPro(i10, c6956l4, c6415l3, c6956l4, c11192l);
                                                        AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, c6415l4);
                                                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.player_play, 0, c6956l4), null, null, 0L, c6956l4, 56, 12);
                                                        AbstractC9334l.yandex(c6956l4, AbstractC0080l.vip(c4346l, 8.0f));
                                                        C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l4, 0);
                                                        long j5 = c6956l4.f14595continue;
                                                        int i11 = (int) (j5 ^ (j5 >>> 32));
                                                        InterfaceC18556l interfaceC18556lSmaato4 = c6956l4.smaato();
                                                        InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l4, c4346l);
                                                        c6956l4.m2140super();
                                                        if (c6956l4.f14603switch) {
                                                            c6956l4.firebase(c16395l2);
                                                        } else {
                                                            c6956l4.m2136protected();
                                                        }
                                                        AbstractC8182l.billing(c6956l4, c1853lYandex, c6415l);
                                                        AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato4, c6415l2);
                                                        AbstractC11043l.isPro(i11, c6956l4, c6415l3, c6956l4, c11192l);
                                                        AbstractC8182l.billing(c6956l4, interfaceC17242lBilling4, c6415l4);
                                                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.mab_play), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                                        int i12 = i8;
                                                        String str4 = str3;
                                                        if (i12 == 0) {
                                                            c6956l4.m2123default(-1238493485);
                                                            AbstractC13010l.loadAd(str4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                                            c6956l3 = c6956l4;
                                                            c6956l3.startapp(false);
                                                        } else if (i7 > 0) {
                                                            c6956l4.m2123default(-1238324721);
                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_left, new Object[]{str4}, c6956l4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                                            c6956l3 = c6956l4;
                                                            c6956l3.startapp(false);
                                                        } else {
                                                            c6956l4.m2123default(-1238144301);
                                                            AbstractC13010l.loadAd(str4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                                            c6956l3 = c6956l4;
                                                            c6956l3.startapp(false);
                                                        }
                                                        c6956l3.startapp(true);
                                                        AbstractC9334l.yandex(c6956l3, new C9247l(1.0f, true));
                                                        c6956l3.startapp(true);
                                                        c6956l3.startapp(true);
                                                    } else {
                                                        c6956l4.m2124else();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, c6956l2), c6956l2, 817889280, 358);
                                            c6956l2.startapp(true);
                                        } else {
                                            c6956l2.m2124else();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC5889l.crashlytics, 3);
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1680815212, true, new C13178l(audioTrack2, 2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(function1);
                        objM2132native = function1;
                    }
                    AbstractC16336l.yandex(interfaceC17242lCrashlytics, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24582, 490);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C6038l c6038l2 = this.f29794l;
                    boolean z = c6038l2.m1923instanceof() instanceof C6598l;
                    boolean zAdmob2 = c6956l2.admob(interfaceC2262l) | c6956l2.admob(c6038l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C17257l(interfaceC2262l, c6038l2, 0);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC9256l.loadAd(z, (Function0) objM2132native2, null, null, null, null, false, 0.0f, AbstractC14566l.amazon(-2121342110, new C15195l(interfaceC11780l2, this.f29791l, c6038l2, this.f29797l, this.f29796l, this.f29798l, this.f29792l), c6956l2), c6956l2, 100663296, 252);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15195l(C6038l c6038l, InterfaceC2262l interfaceC2262l, AudioTrack audioTrack, int i, float f, int i2, String str) {
        this.f29794l = c6038l;
        this.f29793l = interfaceC2262l;
        this.f29791l = audioTrack;
        this.f29797l = i;
        this.f29796l = f;
        this.f29798l = i2;
        this.f29792l = str;
    }
}
