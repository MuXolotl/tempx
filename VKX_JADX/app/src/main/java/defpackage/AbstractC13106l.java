package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13106l {
    public static final C9138l amazon;
    public static final C9138l[] billing;
    public static final C9138l crashlytics;
    public static final C9138l loadAd;
    public static final C9138l purchase;
    public static boolean yandex = true;

    static {
        C9138l c9138l = new C9138l(-1, 1L, "client_side_logging", true);
        C9138l c9138l2 = new C9138l(-1, 1L, "cxless_client_minimal", true);
        loadAd = c9138l2;
        C9138l c9138l3 = new C9138l(-1, 1L, "cxless_caf_control", true);
        C9138l c9138l4 = new C9138l(-1, 1L, "module_flag_control", true);
        crashlytics = c9138l4;
        C9138l c9138l5 = new C9138l(-1, 1L, "discovery_hint_supply", true);
        C9138l c9138l6 = new C9138l(-1, 1L, "relay_casting_set_active_account", true);
        C9138l c9138l7 = new C9138l(-1, 1L, "analytics_proto_enum_translation", true);
        amazon = c9138l7;
        C9138l c9138l8 = new C9138l(-1, 1L, "integer_to_integer_map", true);
        purchase = c9138l8;
        billing = new C9138l[]{c9138l, c9138l2, c9138l3, c9138l4, c9138l5, c9138l6, c9138l7, c9138l8, new C9138l(-1, 1L, "relay_casting_set_remote_casting_mode", true), new C9138l(-1, 1L, "get_relay_access_token", true), new C9138l(-1, 1L, "get_cast_settings", true), new C9138l(-1, 1L, "set_bundle_setting", true), new C9138l(-1, 1L, "get_client_updated_info", true), new C9138l(-1, 1L, "device_suggestions", true)};
    }

    public static C13494l admob(C6956l c6956l) {
        return ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd;
    }

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, C1739l c1739l) {
        return interfaceC17242l.premium(new C1949l(c1739l));
    }

    public static C1919l billing(C6956l c6956l) {
        return ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics;
    }

    public static final void crashlytics(final C15851l c15851l, InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, long j, long j2, long j3, long j4, long j5, C6956l c6956l, final int i, final int i2) {
        int i3;
        long jPurchase;
        long jPurchase2;
        long jPurchase3;
        long jPurchase4;
        int i4;
        final InterfaceC17242l interfaceC17242l2;
        final InterfaceC6347l interfaceC6347l2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        int i5;
        int i6;
        int i7;
        InterfaceC17242l interfaceC17242l3;
        long jPurchase5;
        C15851l c15851l2;
        long j11;
        boolean z;
        C15578l c15578lAmazon;
        c6956l.m2133new(274621471);
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(c15851l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 432;
        if ((i & 3072) == 0) {
            i8 = i3 | 1456;
        }
        if ((i & 24576) == 0) {
            jPurchase = j;
            i8 |= ((i2 & 16) == 0 && c6956l.purchase(jPurchase)) ? 16384 : 8192;
        } else {
            jPurchase = j;
        }
        if ((196608 & i) == 0) {
            jPurchase2 = j2;
            i8 |= ((i2 & 32) == 0 && c6956l.purchase(jPurchase2)) ? 131072 : 65536;
        } else {
            jPurchase2 = j2;
        }
        if ((1572864 & i) == 0) {
            jPurchase3 = j3;
            i8 |= ((i2 & 64) == 0 && c6956l.purchase(jPurchase3)) ? 1048576 : 524288;
        } else {
            jPurchase3 = j3;
        }
        if ((12582912 & i) == 0) {
            jPurchase4 = j4;
            i8 |= ((i2 & 128) == 0 && c6956l.purchase(jPurchase4)) ? 8388608 : 4194304;
        } else {
            jPurchase4 = j4;
        }
        if ((100663296 & i) == 0) {
            i4 = i8 | (((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 && c6956l.purchase(j5)) ? 67108864 : 33554432);
        } else {
            i4 = i8;
        }
        if (c6956l.m2127for(i4 & 1, (i4 & 38347923) != 38347922)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 5);
                int i9 = i4 & (-7169);
                if ((i2 & 16) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 6);
                    i9 = i4 & (-64513);
                }
                int i10 = i9;
                if ((i2 & 32) != 0) {
                    jPurchase2 = AbstractC15038l.purchase(c6956l, 4);
                    i5 = 5;
                    i10 &= -458753;
                } else {
                    i5 = 5;
                }
                if ((i2 & 64) != 0) {
                    jPurchase3 = AbstractC15038l.purchase(c6956l, i5);
                    i10 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jPurchase4 = AbstractC15038l.purchase(c6956l, i5);
                    i6 = i10 & (-29360129);
                } else {
                    i6 = i10;
                }
                int i11 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                C4346l c4346l = C4346l.f8873l;
                if (i11 != 0) {
                    jPurchase5 = AbstractC15038l.purchase(c6956l, 4);
                    i7 = i6 & (-234881025);
                    interfaceC17242l3 = c4346l;
                } else {
                    i7 = i6;
                    interfaceC17242l3 = c4346l;
                    jPurchase5 = j5;
                }
                interfaceC6347l2 = interfaceC6347lLoadAd;
            } else {
                c6956l.m2124else();
                int i12 = i4 & (-7169);
                if ((i2 & 16) != 0) {
                    i12 = i4 & (-64513);
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i12 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i12 &= -234881025;
                }
                interfaceC6347l2 = interfaceC6347l;
                jPurchase5 = j5;
                i7 = i12;
                interfaceC17242l3 = interfaceC17242l;
            }
            c6956l.adcel();
            String str = c15851l.yandex.loadAd;
            if (str != null) {
                c6956l.m2123default(-663827885);
                long j12 = jPurchase3;
                j11 = j12;
                c15851l2 = c15851l;
                c15578lAmazon = AbstractC14566l.amazon(-1378313599, new C2050l(3, j12, c15851l, str), c6956l);
                z = false;
                c6956l.startapp(false);
            } else {
                c15851l2 = c15851l;
                j11 = jPurchase3;
                z = false;
                c6956l.m2123default(-663528921);
                c6956l.startapp(false);
                c15578lAmazon = null;
            }
            c15851l2.yandex.getClass();
            c6956l.m2123default(-662527001);
            c6956l.startapp(z);
            int i13 = i7 << 3;
            int i14 = (i13 & 7168) | 805306368 | (i13 & 458752) | (i13 & 3670016) | (29360128 & i7) | (234881024 & i7);
            j6 = jPurchase;
            j7 = jPurchase2;
            long j13 = jPurchase4;
            long j14 = jPurchase5;
            loadAd(AbstractC3605l.smaato(interfaceC17242l3, 12.0f), c15578lAmazon, null, interfaceC6347l2, j6, j7, j13, j14, AbstractC14566l.amazon(-1266389126, new C1645l(11, c15851l2), c6956l), c6956l, i14);
            j10 = j14;
            interfaceC17242l2 = interfaceC17242l3;
            j9 = j13;
            j8 = j11;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            interfaceC6347l2 = interfaceC6347l;
            j6 = jPurchase;
            j7 = jPurchase2;
            j8 = jPurchase3;
            j9 = jPurchase4;
            j10 = j5;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lَْٞ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    AbstractC13106l.crashlytics(c15851l, interfaceC17242l2, interfaceC6347l2, j6, j7, j8, j9, j10, (C6956l) obj, iPurchase, i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void loadAd(final InterfaceC17242l interfaceC17242l, final Function2 function2, final Function2 function3, final InterfaceC6347l interfaceC6347l, final long j, final long j2, final long j3, final long j4, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        Function2 function4;
        Function2 function5;
        InterfaceC6347l interfaceC6347l2;
        long j5;
        C15578l c15578l2;
        c6956l.m2133new(-1218779924);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function4 = function2;
            i2 |= c6956l.admob(function4) ? 32 : 16;
        } else {
            function4 = function2;
        }
        if ((i & 384) == 0) {
            function5 = function3;
            i2 |= c6956l.admob(function5) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            function5 = function3;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.mopub(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            interfaceC6347l2 = interfaceC6347l;
            i2 |= c6956l.billing(interfaceC6347l2) ? 16384 : 8192;
        } else {
            interfaceC6347l2 = interfaceC6347l;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.purchase(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.purchase(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= c6956l.purchase(j5) ? 8388608 : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.purchase(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            c15578l2 = c15578l;
            i2 |= c6956l.admob(c15578l2) ? 536870912 : 268435456;
        } else {
            c15578l2 = c15578l;
        }
        if (c6956l.m2127for(i2 & 1, (306783379 & i2) != 306783378)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            C15578l c15578lAmazon = AbstractC14566l.amazon(-1343524879, new C16019l(function4, c15578l2, function5, j5, j4), c6956l);
            int i3 = (i2 & 14) | 12779520;
            int i4 = i2 >> 9;
            AbstractC3274l.yandex(interfaceC17242l, interfaceC6347l2, j, j2, 0.0f, 6.0f, null, c15578lAmazon, c6956l, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 80);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lۣٗٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    AbstractC13106l.loadAd(interfaceC17242l, function2, function3, interfaceC6347l, j, j2, j3, j4, c15578l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final InterfaceC15234l mopub(InterfaceC8371l interfaceC8371l) {
        InterfaceC8371l interfaceC8371lSignature = interfaceC8371l.Signature();
        if (interfaceC8371lSignature == null || (interfaceC8371l instanceof InterfaceC9921l)) {
            return null;
        }
        if (!(interfaceC8371lSignature.Signature() instanceof InterfaceC9921l)) {
            return mopub(interfaceC8371lSignature);
        }
        if (interfaceC8371lSignature instanceof InterfaceC15234l) {
            return (InterfaceC15234l) interfaceC8371lSignature;
        }
        return null;
    }

    public static C0764l purchase(C6956l c6956l) {
        return ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
    }

    public static final InterfaceC17477l subs(InterfaceC11865l interfaceC11865l, C2312l c2312l) {
        InterfaceC7637l interfaceC7637lMo2893l;
        C16781l c16781l = c2312l.yandex;
        if (!c16781l.crashlytics()) {
            C2144l c2144l = interfaceC11865l.mo2270l(c2312l.loadAd()).f21347l;
            C3498l c3498lMopub = c16781l.mopub();
            EnumC11300l enumC11300l = EnumC11300l.f22777l;
            InterfaceC15234l interfaceC15234lPurchase = c2144l.purchase(c3498lMopub, enumC11300l);
            InterfaceC17477l interfaceC17477l = interfaceC15234lPurchase instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPurchase : null;
            if (interfaceC17477l != null) {
                return interfaceC17477l;
            }
            InterfaceC17477l interfaceC17477lSubs = subs(interfaceC11865l, c2312l.loadAd());
            InterfaceC15234l interfaceC15234lPurchase2 = (interfaceC17477lSubs == null || (interfaceC7637lMo2893l = interfaceC17477lSubs.mo2893l()) == null) ? null : interfaceC7637lMo2893l.purchase(c16781l.mopub(), enumC11300l);
            if (interfaceC15234lPurchase2 instanceof InterfaceC17477l) {
                return (InterfaceC17477l) interfaceC15234lPurchase2;
            }
        }
        return null;
    }

    public static final void yandex(C15578l c15578l, Function2 function2, Function2 function3, C11090l c11090l, long j, long j2, C6956l c6956l, int i) {
        Function2 function4;
        C11090l c11090l2;
        Function2 function5;
        boolean z;
        int i2;
        boolean z2;
        long j3 = j2;
        c6956l.m2133new(-321841045);
        int i3 = i | (c6956l.admob(c15578l) ? 4 : 2) | (c6956l.admob(function2) ? 32 : 16) | (c6956l.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(c11090l) ? 2048 : 1024) | (c6956l.purchase(j) ? 16384 : 8192) | (c6956l.purchase(j3) ? 131072 : 65536);
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            float f = function3 == null ? 8.0f : 0.0f;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 16.0f, 0.0f, f, 0.0f, 10);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C10327l(9);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native;
            long j4 = c6956l.f14595continue;
            int i4 = (int) (j4 ^ (j4 >>> 32));
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
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835l, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC14312l.isPro(c4346l, "text"), 0.0f, 6.0f, 1);
            C14855l c14855l = C18450l.f36026l;
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
            long j5 = c6956l.f14595continue;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC2812l.pro(i3 & 14, c15578l, c6956l, true);
            if (function2 != null) {
                c6956l.m2123default(989211000);
                InterfaceC17242l interfaceC17242lIsPro = AbstractC14312l.isPro(c4346l, "action");
                InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
                long j6 = c6956l.f14595continue;
                int i6 = (int) (j6 ^ (j6 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lIsPro);
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
                c11090l2 = c11090l;
                i2 = 8;
                function4 = function2;
                AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(j, AbstractC12502l.yandex), AbstractC13010l.yandex.yandex(c11090l2)}, function4, c6956l, 8 | (i3 & 112));
                c6956l.startapp(true);
                z = false;
                c6956l.startapp(false);
            } else {
                function4 = function2;
                c11090l2 = c11090l;
                z = false;
                i2 = 8;
                c6956l.m2123default(989526208);
                c6956l.startapp(false);
            }
            if (function3 != null) {
                c6956l.m2123default(989574568);
                InterfaceC17242l interfaceC17242lIsPro2 = AbstractC14312l.isPro(c4346l, "dismissAction");
                InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l, z);
                long j7 = c6956l.f14595continue;
                int i7 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lIsPro2);
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon3, c6415l);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
                AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
                j3 = j2;
                function5 = function3;
                AbstractC10478l.yandex(AbstractC5020l.startapp(j3, AbstractC12502l.yandex), function5, c6956l, i2 | ((i3 >> 3) & 112));
                z2 = true;
                c6956l.startapp(true);
                c6956l.startapp(false);
            } else {
                function5 = function3;
                z2 = true;
                j3 = j2;
                c6956l.m2123default(989843648);
                c6956l.startapp(z);
            }
            c6956l.startapp(z2);
        } else {
            function4 = function2;
            c11090l2 = c11090l;
            function5 = function3;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15022l(c15578l, function4, function5, c11090l2, j, j3, i);
        }
    }
}
