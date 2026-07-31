package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؖؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3856l {
    public static final C3856l yandex = new C3856l();
    public static final C6839l loadAd = AbstractC7497l.yandex;
    public static final float crashlytics = 80.0f;
    public static final float amazon = 80.0f;
    public static final float purchase = 3.0f;

    public final void loadAd(final C7806l c7806l, final boolean z, final InterfaceC17242l interfaceC17242l, final float f, InterfaceC6347l interfaceC6347l, final long j, float f2, final C15578l c15578l, C6956l c6956l, final int i) {
        final C7806l c7806l2;
        int i2;
        final InterfaceC6347l interfaceC6347l2;
        final float f3;
        int i3;
        final InterfaceC6347l interfaceC6347l3;
        c6956l.m2133new(-1341144489);
        if ((i & 6) == 0) {
            c7806l2 = c7806l;
            i2 = (c6956l.billing(c7806l2) ? 4 : 2) | i;
        } else {
            c7806l2 = c7806l;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.crashlytics(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.purchase(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.billing(this) ? 67108864 : 33554432;
        }
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                i3 = i2 & (-3727361);
                interfaceC6347l3 = loadAd;
                f3 = purchase;
            } else {
                c6956l.m2124else();
                i3 = i2 & (-3727361);
                interfaceC6347l3 = interfaceC6347l;
                f3 = f2;
            }
            int i4 = i3;
            c6956l.adcel();
            int i5 = AbstractC9256l.yandex;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(interfaceC17242l, 40.0f);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C9673l(17);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lSmaato = AbstractC14289l.smaato(interfaceC17242lIsPro, (Function1) objM2132native);
            boolean zCrashlytics = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && c6956l.crashlytics(f)) || (i4 & 3072) == 2048) | c6956l.crashlytics(f3) | c6956l.billing(interfaceC6347l3);
            Object objM2132native2 = c6956l.m2132native();
            if (zCrashlytics || objM2132native2 == c13863l) {
                Function3 function3 = new Function3() { // from class: lِؓ٘
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) obj2).adcel(((C15519l) obj3).yandex);
                        int i6 = abstractC10113lAdcel.f20592l;
                        int i7 = abstractC10113lAdcel.f20591l;
                        final C7806l c7806l3 = c7806l2;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final InterfaceC6347l interfaceC6347l4 = interfaceC6347l3;
                        return ((InterfaceC7448l) obj).isVip(i6, i7, C14054l.f27396l, new Function1() { // from class: lؓ۠ٙ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                final C7806l c7806l4 = c7806l3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final InterfaceC6347l interfaceC6347l5 = interfaceC6347l4;
                                AbstractC9601l.startapp((AbstractC9601l) obj4, abstractC10113lAdcel, 0, 0, new Function1() { // from class: lٌؙؕ
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        C6148l c6148l = (C6148l) obj5;
                                        C7806l c7806l5 = c7806l4;
                                        boolean z4 = ((Number) c7806l5.yandex.amazon()).floatValue() > 0.0f || z3;
                                        float fFloatValue = ((Number) c7806l5.yandex.amazon()).floatValue();
                                        c6148l.getClass();
                                        c6148l.pro((fFloatValue * AbstractC9361l.yandex(c6148l, f6)) - Float.intBitsToFloat((int) (c6148l.f12958l & 4294967295L)));
                                        c6148l.metrica(z4 ? c6148l.f12941l.loadAd() * f7 : 0.0f);
                                        c6148l.startapp(interfaceC6347l5);
                                        c6148l.purchase(true);
                                        return Unit.INSTANCE;
                                    }
                                }, 4);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                };
                c6956l.m2147try(function3);
                objM2132native2 = function3;
            }
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC13095l.m3537else(interfaceC17242lSmaato, (Function3) objM2132native2), j, interfaceC6347l3);
            int i6 = ((i4 >> 12) & 7168) | 48;
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j2 = c6956l.f14595continue;
            int i7 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i7), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c15578l.invoke(C16170l.yandex, c6956l, Integer.valueOf(((i6 >> 6) & 112) | 6));
            c6956l.startapp(true);
            interfaceC6347l2 = interfaceC6347l3;
        } else {
            c6956l.m2124else();
            interfaceC6347l2 = interfaceC6347l;
            f3 = f2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؖ٘ٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f8608l.loadAd(c7806l, z, interfaceC17242l, f, interfaceC6347l2, j, f3, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void yandex(final C7806l c7806l, final boolean z, final InterfaceC17242l interfaceC17242l, long j, long j2, float f, C6956l c6956l, final int i) {
        final long j3;
        final long j4;
        final float f2;
        int i2;
        float f3;
        final long j5;
        long j6;
        c6956l.m2133new(-1076870256);
        int i3 = i | (c6956l.billing(c7806l) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 74752;
        if (c6956l.m2127for(i3 & 1, (599187 & i3) != 599186)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                C10707l c10707l = AbstractC16964l.yandex;
                long j7 = ((C14370l) c6956l.isPro(c10707l)).yandex.f2308package;
                long j8 = ((C14370l) c6956l.isPro(c10707l)).yandex.subscription;
                i2 = i3 & (-523265);
                f3 = amazon;
                j5 = j8;
                j6 = j7;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            }
            c6956l.adcel();
            loadAd(c7806l, z, interfaceC17242l, f3, null, j6, 0.0f, AbstractC14566l.amazon(298232649, new Function3() { // from class: lؘؔۤ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        AbstractC18037l.crashlytics(Boolean.valueOf(z), null, C17423l.remoteconfig(c6956l2, 4), null, AbstractC14566l.amazon(-2064098104, new C5853l(j5, c7806l, 2), c6956l2), c6956l2, 24576, 10);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, (i2 & 896) | (i2 & 14) | 12582912 | (i2 & 112) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            c6956l.m2124else();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(c7806l, z, interfaceC17242l, j3, j4, f2, i) { // from class: lٕؕۧ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f7893l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ float f7894l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C7806l f7895l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ long f7897l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f7898l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ long f7899l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1572865);
                    this.f7896l.yandex(this.f7895l, this.f7893l, this.f7898l, this.f7897l, this.f7899l, this.f7894l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
