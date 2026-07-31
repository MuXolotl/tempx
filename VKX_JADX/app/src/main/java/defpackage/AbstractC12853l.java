package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12853l {
    public static final float amazon;
    public static final float crashlytics;
    public static final float loadAd;
    public static final long purchase;
    public static final float yandex;

    static {
        float f = AbstractC4049l.yandex;
        yandex = AbstractC4049l.yandex;
        loadAd = 16.0f;
        crashlytics = 14.0f;
        amazon = 6.0f;
        purchase = AbstractC7039l.isPro(20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void amazon(final long j, final long j2, final boolean z, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        boolean z2;
        Object objMopub;
        boolean z3;
        InterfaceC17807l interfaceC17807lRemoteconfig;
        c6956l.m2133new(-833145221);
        if ((i & 6) == 0) {
            i2 = (c6956l.purchase(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.purchase(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        ?? r11 = 0;
        boolean z4 = false;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z2), null, c6956l, i3 & 14, 2);
            boolean zBooleanValue = ((Boolean) c18656lIsPro.amazon.getValue()).booleanValue();
            c6956l.m2123default(-1069234984);
            long j3 = zBooleanValue ? j : j2;
            c6956l.startapp(false);
            AbstractC11833l abstractC11833lBilling = C9735l.billing(j3);
            boolean zBilling = c6956l.billing(abstractC11833lBilling);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                C0010l c0010l = new C0010l(C11192l.f22516l, new C3006l(10, abstractC11833lBilling));
                c6956l.m2147try(c0010l);
                objM2132native = c0010l;
            }
            C0010l c0010l2 = (C0010l) objM2132native;
            if (c18656lIsPro.mopub()) {
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling2 = c6956l.billing(c18656lIsPro);
                objMopub = c6956l.m2132native();
                if (zBilling2 || objMopub == c13863l) {
                    AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                    Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    try {
                        Object objCrashlytics = c18656lIsPro.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics);
                        objMopub = objCrashlytics;
                        z4 = false;
                    } catch (Throwable th) {
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        throw th;
                    }
                }
                c6956l.startapp(z4);
                r11 = z4;
            }
            boolean zBooleanValue2 = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(-1069234984);
            long j4 = zBooleanValue2 ? j : j2;
            c6956l.startapp(r11);
            C9735l c9735l = new C9735l(j4);
            boolean zBilling3 = c6956l.billing(c18656lIsPro);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling3 || objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.mopub(new C17648l(c18656lIsPro, r11));
                c6956l.m2147try(objM2132native2);
            }
            boolean zBooleanValue3 = ((Boolean) ((InterfaceC12244l) objM2132native2).getValue()).booleanValue();
            c6956l.m2123default(-1069234984);
            long j5 = zBooleanValue3 ? j : j2;
            c6956l.startapp(false);
            C9735l c9735l2 = new C9735l(j5);
            boolean zBilling4 = c6956l.billing(c18656lIsPro);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling4 || objM2132native3 == c13863l) {
                objM2132native3 = AbstractC8020l.mopub(new C17648l(c18656lIsPro, 1));
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC17460l interfaceC17460l = (InterfaceC17460l) ((InterfaceC12244l) objM2132native3).getValue();
            c6956l.m2123default(1058649156);
            if (interfaceC17460l.crashlytics(Boolean.FALSE, Boolean.TRUE)) {
                c6956l.m2123default(272207019);
                interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 4);
                z3 = false;
                c6956l.startapp(false);
            } else {
                z3 = false;
                c6956l.m2123default(272326989);
                interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 5);
                c6956l.startapp(false);
            }
            c6956l.startapp(z3);
            AbstractC10478l.yandex(AbstractC5020l.startapp(((C9735l) AbstractC2438l.billing(c18656lIsPro, c9735l, c9735l2, interfaceC17807lRemoteconfig, c0010l2, c6956l, 0).f19321l.getValue()).yandex, AbstractC12502l.yandex), c15578l, c6956l, (i3 & 112) | 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lًٍُ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC12853l.amazon(j, j2, z, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void crashlytics(Function2 function2, C6956l c6956l, int i) {
        boolean z;
        C14855l c14855l = C18450l.f36026l;
        c6956l.m2133new(-1349901398);
        int i2 = 2;
        int i3 = (c6956l.admob(function2) ? 4 : 2) | i | (c6956l.admob(null) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z2 = ((i3 & 112) == 32) | (i4 == 4);
            Object objM2132native = c6956l.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                objM2132native = new C17999l(i2, function2);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native;
            long j = c6956l.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
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
            Integer numValueOf = Integer.valueOf(i5);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            if (function2 != null) {
                c6956l.m2123default(870361332);
                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC14312l.isPro(c4346l, "text"), loadAd, 0.0f, 2);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                long j2 = c6956l.f14595continue;
                int i6 = (int) (j2 ^ (j2 >>> 32));
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
                AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                function2.invoke(c6956l, Integer.valueOf(i4));
                z = true;
                c6956l.startapp(true);
                c6956l.startapp(false);
            } else {
                z = true;
                c6956l.m2123default(870466081);
                c6956l.startapp(false);
            }
            c6956l.m2123default(870557345);
            c6956l.startapp(false);
            c6956l.startapp(z);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13393l(i, function2);
        }
    }

    public static final void loadAd(final boolean z, final Function0 function0, InterfaceC17242l interfaceC17242l, boolean z2, final Function2 function2, final long j, final long j2, C6956l c6956l, final int i) {
        final InterfaceC17242l interfaceC17242l2;
        final boolean z3;
        InterfaceC17242l interfaceC17242l3;
        boolean z4;
        C15578l c15578lAmazon;
        c6956l.m2133new(1015017965);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16) | 200064 | (c6956l.purchase(j) ? 1048576 : 524288) | (c6956l.purchase(j2) ? 8388608 : 4194304) | 100663296;
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                interfaceC17242l3 = C4346l.f8873l;
                z4 = true;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
                z4 = z2;
            }
            c6956l.adcel();
            if (function2 == null) {
                c6956l.m2123default(1830887765);
                c6956l.startapp(false);
                c15578lAmazon = null;
            } else {
                c6956l.m2123default(1830887766);
                c15578lAmazon = AbstractC14566l.amazon(-1745256900, new C13393l(function2, 12, (byte) 0), c6956l);
                c6956l.startapp(false);
            }
            int i3 = (i2 & 14) | 12582912 | (i2 & 112) | 3072;
            int i4 = i2 >> 6;
            yandex(z, function0, AbstractC13095l.m3537else(interfaceC17242l3, new C2039l(4)), z4, j, j2, AbstractC14566l.amazon(-906085472, new C15950l(1, c15578lAmazon), c6956l), c6956l, (i4 & 458752) | i3 | (57344 & i4) | 1572864);
            interfaceC17242l2 = interfaceC17242l3;
            z3 = z4;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            z3 = z2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z, function0, interfaceC17242l2, z3, function2, j, j2, i) { // from class: lّۣٛ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f25394l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ long f25395l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f25396l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25397l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f25398l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25399l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ long f25400l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(24577);
                    AbstractC12853l.loadAd(this.f25397l, this.f25396l, this.f25394l, this.f25399l, this.f25398l, this.f25400l, this.f25395l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void yandex(final boolean z, final Function0 function0, final InterfaceC17242l interfaceC17242l, final boolean z2, final long j, final long j2, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        c6956l.m2133new(-1573136853);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.mopub(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.purchase(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.purchase(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 8388608 : 4194304;
        }
        if (c6956l.m2127for(i2 & 1, (4793491 & i2) != 4793490)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            int i3 = i2 >> 12;
            amazon(j, j2, z, AbstractC14566l.amazon(1128552423, new C15772l(interfaceC17242l, z, AbstractC10493l.yandex(true, 0.0f, j, null, 250), z2, function0, c15578l), c6956l), c6956l, ((i2 << 6) & 896) | (i3 & 112) | (i3 & 14) | 3072);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lُؚؐ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC12853l.yandex(z, function0, interfaceC17242l, z2, j, j2, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
