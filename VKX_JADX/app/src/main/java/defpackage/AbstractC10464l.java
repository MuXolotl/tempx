package defpackage;

import java.math.RoundingMode;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَٞۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10464l {
    public static final C9379l yandex = new C9379l();

    public static void admob(int i, C16827l c16827l, C11338l c11338l, boolean z) {
        C14946l c14946l;
        C14946l c14946l2;
        boolean z2;
        C14946l c14946l3;
        C14946l c14946l4;
        if (c11338l.remoteconfig) {
            return;
        }
        if (!(c11338l instanceof C10664l) && c11338l.ad() && purchase(c11338l)) {
            C10664l.m2936case(c11338l, c16827l, new C9379l());
        }
        C14946l c14946lMopub = c11338l.mopub(2);
        C14946l c14946lMopub2 = c11338l.mopub(4);
        int iCrashlytics = c14946lMopub.crashlytics();
        int iCrashlytics2 = c14946lMopub2.crashlytics();
        HashSet<C14946l> hashSet = c14946lMopub.yandex;
        if (hashSet != null && c14946lMopub.crashlytics) {
            for (C14946l c14946l5 : hashSet) {
                C11338l c11338l2 = c14946l5.amazon;
                int i2 = i + 1;
                boolean zPurchase = purchase(c11338l2);
                C14946l c14946l6 = c11338l2.f22867synchronized;
                C14946l c14946l7 = c11338l2.f22873volatile;
                if (c11338l2.ad() && zPurchase) {
                    z2 = true;
                    C10664l.m2936case(c11338l2, c16827l, new C9379l());
                } else {
                    z2 = true;
                }
                boolean z3 = ((c14946l5 == c14946l6 && (c14946l4 = c14946l7.billing) != null && c14946l4.crashlytics) || (c14946l5 == c14946l7 && (c14946l3 = c14946l6.billing) != null && c14946l3.crashlytics)) ? z2 : false;
                int i3 = c11338l2.f22844const[0];
                if (i3 != 3 || zPurchase) {
                    if (!c11338l2.ad()) {
                        if (c14946l5 == c14946l6 && c14946l7.billing == null) {
                            int iAmazon = c14946l6.amazon() + iCrashlytics;
                            c11338l2.m3063throws(iAmazon, c11338l2.metrica() + iAmazon);
                            admob(i2, c16827l, c11338l2, z);
                        } else if (c14946l5 == c14946l7 && c14946l6.billing == null) {
                            int iAmazon2 = iCrashlytics - c14946l7.amazon();
                            c11338l2.m3063throws(iAmazon2 - c11338l2.metrica(), iAmazon2);
                            admob(i2, c16827l, c11338l2, z);
                        } else if (z3 && !c11338l2.license()) {
                            subs(i2, c16827l, c11338l2, z);
                        }
                    }
                } else if (i3 == 3 && c11338l2.license >= 0 && c11338l2.Signature >= 0 && (c11338l2.f22862public == 8 || (c11338l2.ads == 0 && c11338l2.f22856interface == 0.0f))) {
                    if (!c11338l2.license() && z3 && !c11338l2.license()) {
                        isPro(i2, c11338l, c16827l, c11338l2, z);
                    }
                }
            }
        }
        if (c11338l instanceof C10526l) {
            return;
        }
        HashSet<C14946l> hashSet2 = c14946lMopub2.yandex;
        if (hashSet2 != null && c14946lMopub2.crashlytics) {
            for (C14946l c14946l8 : hashSet2) {
                C11338l c11338l3 = c14946l8.amazon;
                int i4 = i + 1;
                boolean zPurchase2 = purchase(c11338l3);
                C14946l c14946l9 = c11338l3.f22867synchronized;
                C14946l c14946l10 = c11338l3.f22873volatile;
                if (c11338l3.ad() && zPurchase2) {
                    C10664l.m2936case(c11338l3, c16827l, new C9379l());
                }
                boolean z4 = (c14946l8 == c14946l9 && (c14946l2 = c14946l10.billing) != null && c14946l2.crashlytics) || (c14946l8 == c14946l10 && (c14946l = c14946l9.billing) != null && c14946l.crashlytics);
                int i5 = c11338l3.f22844const[0];
                if (i5 != 3 || zPurchase2) {
                    if (!c11338l3.ad()) {
                        if (c14946l8 == c14946l9 && c14946l10.billing == null) {
                            int iAmazon3 = c14946l9.amazon() + iCrashlytics2;
                            c11338l3.m3063throws(iAmazon3, c11338l3.metrica() + iAmazon3);
                            admob(i4, c16827l, c11338l3, z);
                        } else if (c14946l8 == c14946l10 && c14946l9.billing == null) {
                            int iAmazon4 = iCrashlytics2 - c14946l10.amazon();
                            c11338l3.m3063throws(iAmazon4 - c11338l3.metrica(), iAmazon4);
                            admob(i4, c16827l, c11338l3, z);
                        } else if (z4 && !c11338l3.license()) {
                            subs(i4, c16827l, c11338l3, z);
                        }
                    }
                } else if (i5 == 3 && c11338l3.license >= 0 && c11338l3.Signature >= 0) {
                    if (c11338l3.f22862public == 8 || (c11338l3.ads == 0 && c11338l3.f22856interface == 0.0f)) {
                        if (!c11338l3.license() && z4 && !c11338l3.license()) {
                            isPro(i4, c11338l, c16827l, c11338l3, z);
                        }
                    }
                }
            }
        }
        c11338l.remoteconfig = true;
    }

    public static final void amazon(long j, C11090l c11090l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1206445228);
        if ((i & 6) == 0) {
            i2 = (c6956l.purchase(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(c11090l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C8540l c8540l = AbstractC13010l.yandex;
            AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(j, AbstractC12502l.yandex), c8540l.yandex(((C11090l) c6956l.isPro(c8540l)).purchase(c11090l))}, c15578l, c6956l, ((i2 >> 3) & 112) | 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17027l(j, c11090l, c15578l, i, 1);
        }
    }

    public static int billing(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(AbstractC12589l.applovin(i, i2, "overflow: checkedAdd(", ", ", ")"));
    }

    public static final C14542l crashlytics(C7819l c7819l, Throwable th) {
        InterfaceC1286l interfaceC1286l;
        if (th instanceof C16012l) {
            Function1 function1 = c7819l.adcel;
            C4865l c4865l = c7819l.pro;
            interfaceC1286l = (InterfaceC1286l) function1.invoke(c7819l);
            if (interfaceC1286l == null) {
                interfaceC1286l = (InterfaceC1286l) c4865l.isPro.invoke(c7819l);
            }
            if (interfaceC1286l == null && (interfaceC1286l = (InterfaceC1286l) c7819l.startapp.invoke(c7819l)) == null) {
                interfaceC1286l = (InterfaceC1286l) c4865l.subs.invoke(c7819l);
            }
        } else {
            interfaceC1286l = (InterfaceC1286l) c7819l.startapp.invoke(c7819l);
            if (interfaceC1286l == null) {
                interfaceC1286l = (InterfaceC1286l) c7819l.pro.subs.invoke(c7819l);
            }
        }
        return new C14542l(interfaceC1286l, c7819l, th);
    }

    public static void firebase(int i, C16827l c16827l, C11338l c11338l) {
        float f = c11338l.f22839abstract;
        C14946l c14946l = c11338l.f22864strictfp;
        int iCrashlytics = c14946l.billing.crashlytics();
        C14946l c14946l2 = c11338l.f22857native;
        int iCrashlytics2 = c14946l2.billing.crashlytics();
        int iAmazon = c14946l.amazon() + iCrashlytics;
        int iAmazon2 = iCrashlytics2 - c14946l2.amazon();
        if (iCrashlytics == iCrashlytics2) {
            f = 0.5f;
        } else {
            iCrashlytics = iAmazon;
            iCrashlytics2 = iAmazon2;
        }
        int iSubs = c11338l.subs();
        int i2 = (iCrashlytics2 - iCrashlytics) - iSubs;
        if (iCrashlytics > iCrashlytics2) {
            i2 = (iCrashlytics - iCrashlytics2) - iSubs;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iCrashlytics + i3;
        int i5 = i4 + iSubs;
        if (iCrashlytics > iCrashlytics2) {
            i4 = iCrashlytics - i3;
            i5 = i4 - iSubs;
        }
        c11338l.m3060package(i4, i5);
        remoteconfig(i + 1, c16827l, c11338l);
    }

    public static void isPro(int i, C11338l c11338l, C16827l c16827l, C11338l c11338l2, boolean z) {
        float f = c11338l2.f22854import;
        C14946l c14946l = c11338l2.f22867synchronized;
        int iAmazon = c14946l.amazon() + c14946l.billing.crashlytics();
        C14946l c14946l2 = c11338l2.f22873volatile;
        int iCrashlytics = c14946l2.billing.crashlytics() - c14946l2.amazon();
        if (iCrashlytics >= iAmazon) {
            int iMetrica = c11338l2.metrica();
            if (c11338l2.f22862public != 8) {
                int i2 = c11338l2.ads;
                if (i2 == 2) {
                    iMetrica = (int) (c11338l2.f22854import * 0.5f * (c11338l instanceof C10664l ? c11338l.metrica() : c11338l.f22866switch.metrica()));
                } else if (i2 == 0) {
                    iMetrica = iCrashlytics - iAmazon;
                }
                iMetrica = Math.max(c11338l2.Signature, iMetrica);
                int i3 = c11338l2.license;
                if (i3 > 0) {
                    iMetrica = Math.min(i3, iMetrica);
                }
            }
            int i4 = iAmazon + ((int) ((f * ((iCrashlytics - iAmazon) - iMetrica)) + 0.5f));
            c11338l2.m3063throws(i4, iMetrica + i4);
            admob(i + 1, c16827l, c11338l2, z);
        }
    }

    public static final void loadAd(C15578l c15578l, C15578l c15578l2, Function2 function2, C6956l c6956l, int i) {
        c6956l.m2133new(-52757249);
        int i2 = 4;
        int i3 = (c6956l.admob(c15578l) ? 4 : 2) | i | (c6956l.admob(c15578l2) ? 32 : 16) | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        byte b = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C10707l c10707l = AbstractC3459l.yandex;
            int i4 = 3;
            AbstractC11282l.yandex(((C9472l) c6956l.isPro(c10707l)).admob, AbstractC14566l.amazon(-64505424, new C15701l(c15578l, i4), c6956l), c6956l, 48);
            AbstractC11282l.yandex(((C9472l) c6956l.isPro(c10707l)).smaato, AbstractC14566l.amazon(167446503, new C15701l(c15578l2, i2), c6956l), c6956l, 48);
            AbstractC11282l.yandex(((C9472l) c6956l.isPro(c10707l)).smaato, AbstractC14566l.amazon(-1736013592, new C13393l(function2, i4, b), c6956l), c6956l, 48);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2719l(c15578l, c15578l2, function2, i);
        }
    }

    public static int mopub(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (AbstractC15373l.yandex[roundingMode.ordinal()]) {
            case 1:
                AbstractC9464l.admob(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                C11586l.yandex();
                return 0;
        }
        return i3 + i5;
    }

    public static boolean purchase(C11338l c11338l) {
        int[] iArr = c11338l.f22844const;
        int i = iArr[0];
        int i2 = iArr[1];
        C11338l c11338l2 = c11338l.f22866switch;
        C10664l c10664l = c11338l2 != null ? (C10664l) c11338l2 : null;
        if (c10664l != null) {
            int i3 = c10664l.f22844const[0];
        }
        if (c10664l != null) {
            int i4 = c10664l.f22844const[1];
        }
        boolean z = i == 1 || c11338l.advert() || i == 2 || (i == 3 && c11338l.ads == 0 && c11338l.f22856interface == 0.0f && c11338l.ads(0)) || (i == 3 && c11338l.ads == 1 && c11338l.subscription(0, c11338l.metrica()));
        boolean z2 = i2 == 1 || c11338l.isVip() || i2 == 2 || (i2 == 3 && c11338l.subscription == 0 && c11338l.f22856interface == 0.0f && c11338l.ads(1)) || (i2 == 3 && c11338l.subscription == 1 && c11338l.subscription(1, c11338l.subs()));
        return (c11338l.f22856interface > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void remoteconfig(int i, C16827l c16827l, C11338l c11338l) {
        C14946l c14946l;
        C14946l c14946l2;
        C14946l c14946l3;
        C14946l c14946l4;
        if (c11338l.vip) {
            return;
        }
        if (!(c11338l instanceof C10664l) && c11338l.ad() && purchase(c11338l)) {
            C10664l.m2936case(c11338l, c16827l, new C9379l());
        }
        C14946l c14946lMopub = c11338l.mopub(3);
        C14946l c14946lMopub2 = c11338l.mopub(5);
        int iCrashlytics = c14946lMopub.crashlytics();
        int iCrashlytics2 = c14946lMopub2.crashlytics();
        HashSet<C14946l> hashSet = c14946lMopub.yandex;
        if (hashSet != null && c14946lMopub.crashlytics) {
            for (C14946l c14946l5 : hashSet) {
                C11338l c11338l2 = c14946l5.amazon;
                int i2 = i + 1;
                boolean zPurchase = purchase(c11338l2);
                C14946l c14946l6 = c11338l2.f22864strictfp;
                C14946l c14946l7 = c11338l2.f22857native;
                if (c11338l2.ad() && zPurchase) {
                    C10664l.m2936case(c11338l2, c16827l, new C9379l());
                }
                boolean z = (c14946l5 == c14946l6 && (c14946l4 = c14946l7.billing) != null && c14946l4.crashlytics) || (c14946l5 == c14946l7 && (c14946l3 = c14946l6.billing) != null && c14946l3.crashlytics);
                int i3 = c11338l2.f22844const[1];
                if (i3 != 3 || zPurchase) {
                    if (!c11338l2.ad()) {
                        if (c14946l5 == c14946l6 && c14946l7.billing == null) {
                            int iAmazon = c14946l6.amazon() + iCrashlytics;
                            c11338l2.m3060package(iAmazon, c11338l2.subs() + iAmazon);
                            remoteconfig(i2, c16827l, c11338l2);
                        } else if (c14946l5 == c14946l7 && c14946l6.billing == null) {
                            int iAmazon2 = iCrashlytics - c14946l7.amazon();
                            c11338l2.m3060package(iAmazon2 - c11338l2.subs(), iAmazon2);
                            remoteconfig(i2, c16827l, c11338l2);
                        } else if (z && !c11338l2.pro()) {
                            firebase(i2, c16827l, c11338l2);
                        }
                    }
                } else if (i3 == 3 && c11338l2.advert >= 0 && c11338l2.ad >= 0 && (c11338l2.f22862public == 8 || (c11338l2.subscription == 0 && c11338l2.f22856interface == 0.0f))) {
                    if (!c11338l2.pro() && z && !c11338l2.pro()) {
                        smaato(i2, c11338l, c16827l, c11338l2);
                    }
                }
            }
        }
        char c = 1;
        if (c11338l instanceof C10526l) {
            return;
        }
        HashSet<C14946l> hashSet2 = c14946lMopub2.yandex;
        if (hashSet2 != null && c14946lMopub2.crashlytics) {
            for (C14946l c14946l8 : hashSet2) {
                C11338l c11338l3 = c14946l8.amazon;
                int i4 = i + 1;
                boolean zPurchase2 = purchase(c11338l3);
                C14946l c14946l9 = c11338l3.f22864strictfp;
                C14946l c14946l10 = c11338l3.f22857native;
                if (c11338l3.ad() && zPurchase2) {
                    C10664l.m2936case(c11338l3, c16827l, new C9379l());
                }
                boolean z2 = (c14946l8 == c14946l9 && (c14946l2 = c14946l10.billing) != null && c14946l2.crashlytics) || (c14946l8 == c14946l10 && (c14946l = c14946l9.billing) != null && c14946l.crashlytics);
                int i5 = c11338l3.f22844const[1];
                if (i5 != 3 || zPurchase2) {
                    if (!c11338l3.ad()) {
                        if (c14946l8 == c14946l9 && c14946l10.billing == null) {
                            int iAmazon3 = c14946l9.amazon() + iCrashlytics2;
                            c11338l3.m3060package(iAmazon3, c11338l3.subs() + iAmazon3);
                            remoteconfig(i4, c16827l, c11338l3);
                        } else if (c14946l8 == c14946l10 && c14946l9.billing == null) {
                            int iAmazon4 = iCrashlytics2 - c14946l10.amazon();
                            c11338l3.m3060package(iAmazon4 - c11338l3.subs(), iAmazon4);
                            remoteconfig(i4, c16827l, c11338l3);
                        } else if (z2 && !c11338l3.pro()) {
                            firebase(i4, c16827l, c11338l3);
                        }
                    }
                } else if (i5 == 3 && c11338l3.advert >= 0 && c11338l3.ad >= 0 && (c11338l3.f22862public == 8 || (c11338l3.subscription == 0 && c11338l3.f22856interface == 0.0f))) {
                    if (!c11338l3.pro() && z2 && !c11338l3.pro()) {
                        smaato(i4, c11338l, c16827l, c11338l3);
                    }
                }
            }
        }
        C14946l c14946lMopub3 = c11338l.mopub(6);
        if (c14946lMopub3.yandex != null && c14946lMopub3.crashlytics) {
            int iCrashlytics3 = c14946lMopub3.crashlytics();
            for (C14946l c14946l11 : c14946lMopub3.yandex) {
                C11338l c11338l4 = c14946l11.amazon;
                int i6 = i + 1;
                boolean zPurchase3 = purchase(c11338l4);
                C14946l c14946l12 = c11338l4.f22860private;
                if (c11338l4.ad() && zPurchase3) {
                    C10664l.m2936case(c11338l4, c16827l, new C9379l());
                }
                if (c11338l4.f22844const[c] != 3 || zPurchase3) {
                    if (c11338l4.ad()) {
                        continue;
                    } else if (c14946l11 == c14946l12) {
                        int iAmazon5 = c14946l11.amazon() + iCrashlytics3;
                        if (c11338l4.inmobi) {
                            int i7 = iAmazon5 - c11338l4.f22858new;
                            int i8 = c11338l4.f22843class + i7;
                            c11338l4.f22849final = i7;
                            c11338l4.f22864strictfp.subs(i7);
                            c11338l4.f22857native.subs(i8);
                            c14946l12.subs(iAmazon5);
                            c11338l4.smaato = c;
                        }
                        remoteconfig(i6, c16827l, c11338l4);
                    }
                }
                c = 1;
            }
        }
        c11338l.vip = true;
    }

    public static void smaato(int i, C11338l c11338l, C16827l c16827l, C11338l c11338l2) {
        float f = c11338l2.f22839abstract;
        C14946l c14946l = c11338l2.f22864strictfp;
        int iAmazon = c14946l.amazon() + c14946l.billing.crashlytics();
        C14946l c14946l2 = c11338l2.f22857native;
        int iCrashlytics = c14946l2.billing.crashlytics() - c14946l2.amazon();
        if (iCrashlytics >= iAmazon) {
            int iSubs = c11338l2.subs();
            if (c11338l2.f22862public != 8) {
                int i2 = c11338l2.subscription;
                if (i2 == 2) {
                    iSubs = (int) (f * 0.5f * (c11338l instanceof C10664l ? c11338l.subs() : c11338l.f22866switch.subs()));
                } else if (i2 == 0) {
                    iSubs = iCrashlytics - iAmazon;
                }
                iSubs = Math.max(c11338l2.ad, iSubs);
                int i3 = c11338l2.advert;
                if (i3 > 0) {
                    iSubs = Math.min(i3, iSubs);
                }
            }
            int i4 = iAmazon + ((int) ((f * ((iCrashlytics - iAmazon) - iSubs)) + 0.5f));
            c11338l2.m3060package(i4, iSubs + i4);
            remoteconfig(i + 1, c16827l, c11338l2);
        }
    }

    public static void subs(int i, C16827l c16827l, C11338l c11338l, boolean z) {
        float f = c11338l.f22854import;
        C14946l c14946l = c11338l.f22867synchronized;
        int iCrashlytics = c14946l.billing.crashlytics();
        C14946l c14946l2 = c11338l.f22873volatile;
        int iCrashlytics2 = c14946l2.billing.crashlytics();
        int iAmazon = c14946l.amazon() + iCrashlytics;
        int iAmazon2 = iCrashlytics2 - c14946l2.amazon();
        if (iCrashlytics == iCrashlytics2) {
            f = 0.5f;
        } else {
            iCrashlytics = iAmazon;
            iCrashlytics2 = iAmazon2;
        }
        int iMetrica = c11338l.metrica();
        int i2 = (iCrashlytics2 - iCrashlytics) - iMetrica;
        if (iCrashlytics > iCrashlytics2) {
            i2 = (iCrashlytics - iCrashlytics2) - iMetrica;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iCrashlytics;
        int i4 = i3 + iMetrica;
        if (iCrashlytics > iCrashlytics2) {
            i4 = i3 - iMetrica;
        }
        c11338l.m3063throws(i3, i4);
        admob(i + 1, c16827l, c11338l, z);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:92:0x022d  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void yandex(final Function0 function0, InterfaceC17242l interfaceC17242l, C18356l c18356l, C6050l c6050l, C5923l c5923l, C14408l c14408l, C17640l c17640l, C2403l c2403l, final C15578l c15578l, C6956l c6956l, final int i, final int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        final C5923l c5923lYandex;
        int i5;
        C2403l c2403l2;
        int i6;
        boolean z;
        final C6050l c6050l2;
        final C17640l c17640l2;
        final InterfaceC17242l interfaceC17242l3;
        final C2403l c2403l3;
        final C18356l c18356l2;
        final C14408l c14408l2;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        C18356l c18356l3;
        int i7;
        InterfaceC17242l interfaceC17242l5;
        int i8;
        C2403l c2403l4;
        int i9;
        c6956l.m2133new(-1911482175);
        if ((i & 6) == 0) {
            i3 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? 32 : 16;
            }
            i4 = i3 | 384;
            if ((i & 3072) == 0) {
                i4 = i3 | 1408;
            }
            if ((i & 24576) == 0) {
                i4 |= 8192;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    c5923lYandex = c5923l;
                    int i11 = c6956l.billing(c5923lYandex) ? 131072 : 65536;
                    i4 |= i11;
                } else {
                    c5923lYandex = c5923l;
                }
                i4 |= i11;
            } else {
                c5923lYandex = c5923l;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            if ((12582912 & i) == 0) {
                i4 |= 4194304;
            }
            i5 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i5 != 0) {
                if ((100663296 & i) == 0) {
                    c2403l2 = c2403l;
                    if (c6956l.billing(c2403l2)) {
                        i6 = 67108864;
                    } else {
                        i6 = 33554432;
                    }
                    i4 |= i6;
                }
                if ((805306368 & i) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i4 |= i9;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (c6956l.m2127for(i4 & 1, z)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0 || c6956l.ad()) {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        C6839l c6839l = C7219l.loadAd;
                        c18356l3 = new C18356l(c6839l, c6839l, c6839l);
                        C10707l c10707l = AbstractC10689l.yandex;
                        long jIsPro = ((C10936l) c6956l.isPro(c10707l)).isPro();
                        C6050l c6050l3 = new C6050l(jIsPro, AbstractC10689l.yandex(jIsPro, c6956l), jIsPro, AbstractC10689l.yandex(jIsPro, c6956l), jIsPro, AbstractC10689l.yandex(jIsPro, c6956l));
                        i7 = i4 & (-64513);
                        if ((i2 & 32) != 0) {
                            C14855l c14855l = C7219l.yandex;
                            c5923lYandex = C7219l.yandex(7);
                            i7 = i4 & (-523265);
                        }
                        C2209l c2209l = C2209l.crashlytics;
                        interfaceC17242l5 = interfaceC17242l4;
                        C2209l c2209l2 = new C2209l(AbstractC2576l.yandex(3.0f, ((C10936l) c6956l.isPro(c10707l)).yandex()), c6839l, 2);
                        c14408l2 = new C14408l(c2209l, c2209l2, c2209l2);
                        C4442l c4442l = C4442l.loadAd;
                        c17640l2 = new C17640l(c4442l, c4442l, c4442l);
                        i8 = i7 & (-33030145);
                        if (i5 != 0) {
                            c2403l4 = null;
                        } else {
                            c2403l4 = c2403l2;
                        }
                        c6050l2 = c6050l3;
                    } else {
                        c6956l.m2124else();
                        int i12 = i4 & (-64513);
                        if ((i2 & 32) != 0) {
                            i12 = i4 & (-523265);
                        }
                        c17640l2 = c17640l;
                        c5923lYandex = c5923lYandex;
                        i8 = i12 & (-33030145);
                        c2403l4 = c2403l2;
                        c18356l3 = c18356l;
                        c6050l2 = c6050l;
                        interfaceC17242l5 = interfaceC17242l2;
                        c14408l2 = c14408l;
                    }
                    c6956l.adcel();
                    InterfaceC6347l interfaceC6347l = c18356l3.yandex;
                    C8886l c8886l = new C8886l(interfaceC6347l, c18356l3.loadAd, c18356l3.crashlytics, interfaceC6347l, interfaceC6347l);
                    long j = c6050l2.yandex;
                    long j2 = c6050l2.loadAd;
                    C7568l c7568l = new C7568l(j, j2, c6050l2.crashlytics, c6050l2.amazon, c6050l2.purchase, c6050l2.billing, j, j2);
                    c5923lYandex.getClass();
                    C10513l c10513l = new C10513l(1.0f, c5923lYandex.yandex, 1.0f, 1.0f, 1.0f);
                    C2209l c2209l3 = c14408l2.yandex;
                    AbstractC16291l.loadAd(function0, interfaceC17242l5, false, c8886l, c7568l, c10513l, new C9486l(c2209l3, c14408l2.loadAd, c14408l2.crashlytics, c2209l3, c2209l3), new C11568l(c17640l2.yandex, c17640l2.loadAd, c17640l2.crashlytics), c2403l4, AbstractC14566l.amazon(2047816642, new C16524l(c15578l, 0), c6956l), c6956l, i8 & 1022, ((i8 >> 24) & 14) | 48, 24);
                    interfaceC17242l3 = interfaceC17242l5;
                    c2403l3 = c2403l4;
                    c18356l2 = c18356l3;
                } else {
                    c6956l.m2124else();
                    c6050l2 = c6050l;
                    c17640l2 = c17640l;
                    c5923lYandex = c5923lYandex;
                    interfaceC17242l3 = interfaceC17242l2;
                    c2403l3 = c2403l2;
                    c18356l2 = c18356l;
                    c14408l2 = c14408l;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؙٕۙ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC10464l.yandex(function0, interfaceC17242l3, c18356l2, c6050l2, c5923lYandex, c14408l2, c17640l2, c2403l3, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 100663296;
            c2403l2 = c2403l;
            if ((805306368 & i) == 0) {
                if (c6956l.admob(c15578l)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i4 |= i9;
            }
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    C6839l c6839l2 = C7219l.loadAd;
                    c18356l3 = new C18356l(c6839l2, c6839l2, c6839l2);
                    C10707l c10707l2 = AbstractC10689l.yandex;
                    long jIsPro2 = ((C10936l) c6956l.isPro(c10707l2)).isPro();
                    C6050l c6050l4 = new C6050l(jIsPro2, AbstractC10689l.yandex(jIsPro2, c6956l), jIsPro2, AbstractC10689l.yandex(jIsPro2, c6956l), jIsPro2, AbstractC10689l.yandex(jIsPro2, c6956l));
                    i7 = i4 & (-64513);
                    if ((i2 & 32) != 0) {
                        C14855l c14855l2 = C7219l.yandex;
                        c5923lYandex = C7219l.yandex(7);
                        i7 = i4 & (-523265);
                    }
                    C2209l c2209l4 = C2209l.crashlytics;
                    interfaceC17242l5 = interfaceC17242l4;
                    C2209l c2209l5 = new C2209l(AbstractC2576l.yandex(3.0f, ((C10936l) c6956l.isPro(c10707l2)).yandex()), c6839l2, 2);
                    c14408l2 = new C14408l(c2209l4, c2209l5, c2209l5);
                    C4442l c4442l2 = C4442l.loadAd;
                    c17640l2 = new C17640l(c4442l2, c4442l2, c4442l2);
                    i8 = i7 & (-33030145);
                    if (i5 != 0) {
                        c2403l4 = null;
                    } else {
                        c2403l4 = c2403l2;
                    }
                    c6050l2 = c6050l4;
                } else {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    C6839l c6839l3 = C7219l.loadAd;
                    c18356l3 = new C18356l(c6839l3, c6839l3, c6839l3);
                    C10707l c10707l3 = AbstractC10689l.yandex;
                    long jIsPro3 = ((C10936l) c6956l.isPro(c10707l3)).isPro();
                    C6050l c6050l5 = new C6050l(jIsPro3, AbstractC10689l.yandex(jIsPro3, c6956l), jIsPro3, AbstractC10689l.yandex(jIsPro3, c6956l), jIsPro3, AbstractC10689l.yandex(jIsPro3, c6956l));
                    i7 = i4 & (-64513);
                    if ((i2 & 32) != 0) {
                        C14855l c14855l3 = C7219l.yandex;
                        c5923lYandex = C7219l.yandex(7);
                        i7 = i4 & (-523265);
                    }
                    C2209l c2209l6 = C2209l.crashlytics;
                    interfaceC17242l5 = interfaceC17242l4;
                    C2209l c2209l7 = new C2209l(AbstractC2576l.yandex(3.0f, ((C10936l) c6956l.isPro(c10707l3)).yandex()), c6839l3, 2);
                    c14408l2 = new C14408l(c2209l6, c2209l7, c2209l7);
                    C4442l c4442l3 = C4442l.loadAd;
                    c17640l2 = new C17640l(c4442l3, c4442l3, c4442l3);
                    i8 = i7 & (-33030145);
                    if (i5 != 0) {
                        c2403l4 = null;
                    } else {
                        c2403l4 = c2403l2;
                    }
                    c6050l2 = c6050l5;
                }
                c6956l.adcel();
                InterfaceC6347l interfaceC6347l2 = c18356l3.yandex;
                C8886l c8886l2 = new C8886l(interfaceC6347l2, c18356l3.loadAd, c18356l3.crashlytics, interfaceC6347l2, interfaceC6347l2);
                long j3 = c6050l2.yandex;
                long j4 = c6050l2.loadAd;
                C7568l c7568l2 = new C7568l(j3, j4, c6050l2.crashlytics, c6050l2.amazon, c6050l2.purchase, c6050l2.billing, j3, j4);
                c5923lYandex.getClass();
                C10513l c10513l2 = new C10513l(1.0f, c5923lYandex.yandex, 1.0f, 1.0f, 1.0f);
                C2209l c2209l8 = c14408l2.yandex;
                AbstractC16291l.loadAd(function0, interfaceC17242l5, false, c8886l2, c7568l2, c10513l2, new C9486l(c2209l8, c14408l2.loadAd, c14408l2.crashlytics, c2209l8, c2209l8), new C11568l(c17640l2.yandex, c17640l2.loadAd, c17640l2.crashlytics), c2403l4, AbstractC14566l.amazon(2047816642, new C16524l(c15578l, 0), c6956l), c6956l, i8 & 1022, ((i8 >> 24) & 14) | 48, 24);
                interfaceC17242l3 = interfaceC17242l5;
                c2403l3 = c2403l4;
                c18356l2 = c18356l3;
            } else {
                c6956l.m2124else();
                c6050l2 = c6050l;
                c17640l2 = c17640l;
                c5923lYandex = c5923lYandex;
                interfaceC17242l3 = interfaceC17242l2;
                c2403l3 = c2403l2;
                c18356l2 = c18356l;
                c14408l2 = c14408l;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؙٕۙ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC10464l.yandex(function0, interfaceC17242l3, c18356l2, c6050l2, c5923lYandex, c14408l2, c17640l2, c2403l3, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i3 |= 48;
        interfaceC17242l2 = interfaceC17242l;
        i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 = i3 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                c5923lYandex = c5923l;
                if (c6956l.billing(c5923lYandex)) {
                }
                i4 |= i11;
            } else {
                c5923lYandex = c5923l;
            }
            i4 |= i11;
        } else {
            c5923lYandex = c5923l;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        i5 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i5 != 0) {
            if ((100663296 & i) == 0) {
                c2403l2 = c2403l;
                if (c6956l.billing(c2403l2)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            if ((805306368 & i) == 0) {
                if (c6956l.admob(c15578l)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i4 |= i9;
            }
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    C6839l c6839l4 = C7219l.loadAd;
                    c18356l3 = new C18356l(c6839l4, c6839l4, c6839l4);
                    C10707l c10707l4 = AbstractC10689l.yandex;
                    long jIsPro4 = ((C10936l) c6956l.isPro(c10707l4)).isPro();
                    C6050l c6050l6 = new C6050l(jIsPro4, AbstractC10689l.yandex(jIsPro4, c6956l), jIsPro4, AbstractC10689l.yandex(jIsPro4, c6956l), jIsPro4, AbstractC10689l.yandex(jIsPro4, c6956l));
                    i7 = i4 & (-64513);
                    if ((i2 & 32) != 0) {
                        C14855l c14855l4 = C7219l.yandex;
                        c5923lYandex = C7219l.yandex(7);
                        i7 = i4 & (-523265);
                    }
                    C2209l c2209l9 = C2209l.crashlytics;
                    interfaceC17242l5 = interfaceC17242l4;
                    C2209l c2209l10 = new C2209l(AbstractC2576l.yandex(3.0f, ((C10936l) c6956l.isPro(c10707l4)).yandex()), c6839l4, 2);
                    c14408l2 = new C14408l(c2209l9, c2209l10, c2209l10);
                    C4442l c4442l4 = C4442l.loadAd;
                    c17640l2 = new C17640l(c4442l4, c4442l4, c4442l4);
                    i8 = i7 & (-33030145);
                    if (i5 != 0) {
                        c2403l4 = null;
                    } else {
                        c2403l4 = c2403l2;
                    }
                    c6050l2 = c6050l6;
                } else {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    C6839l c6839l5 = C7219l.loadAd;
                    c18356l3 = new C18356l(c6839l5, c6839l5, c6839l5);
                    C10707l c10707l5 = AbstractC10689l.yandex;
                    long jIsPro5 = ((C10936l) c6956l.isPro(c10707l5)).isPro();
                    C6050l c6050l7 = new C6050l(jIsPro5, AbstractC10689l.yandex(jIsPro5, c6956l), jIsPro5, AbstractC10689l.yandex(jIsPro5, c6956l), jIsPro5, AbstractC10689l.yandex(jIsPro5, c6956l));
                    i7 = i4 & (-64513);
                    if ((i2 & 32) != 0) {
                        C14855l c14855l5 = C7219l.yandex;
                        c5923lYandex = C7219l.yandex(7);
                        i7 = i4 & (-523265);
                    }
                    C2209l c2209l11 = C2209l.crashlytics;
                    interfaceC17242l5 = interfaceC17242l4;
                    C2209l c2209l12 = new C2209l(AbstractC2576l.yandex(3.0f, ((C10936l) c6956l.isPro(c10707l5)).yandex()), c6839l5, 2);
                    c14408l2 = new C14408l(c2209l11, c2209l12, c2209l12);
                    C4442l c4442l5 = C4442l.loadAd;
                    c17640l2 = new C17640l(c4442l5, c4442l5, c4442l5);
                    i8 = i7 & (-33030145);
                    if (i5 != 0) {
                        c2403l4 = null;
                    } else {
                        c2403l4 = c2403l2;
                    }
                    c6050l2 = c6050l7;
                }
                c6956l.adcel();
                InterfaceC6347l interfaceC6347l3 = c18356l3.yandex;
                C8886l c8886l3 = new C8886l(interfaceC6347l3, c18356l3.loadAd, c18356l3.crashlytics, interfaceC6347l3, interfaceC6347l3);
                long j5 = c6050l2.yandex;
                long j6 = c6050l2.loadAd;
                C7568l c7568l3 = new C7568l(j5, j6, c6050l2.crashlytics, c6050l2.amazon, c6050l2.purchase, c6050l2.billing, j5, j6);
                c5923lYandex.getClass();
                C10513l c10513l3 = new C10513l(1.0f, c5923lYandex.yandex, 1.0f, 1.0f, 1.0f);
                C2209l c2209l13 = c14408l2.yandex;
                AbstractC16291l.loadAd(function0, interfaceC17242l5, false, c8886l3, c7568l3, c10513l3, new C9486l(c2209l13, c14408l2.loadAd, c14408l2.crashlytics, c2209l13, c2209l13), new C11568l(c17640l2.yandex, c17640l2.loadAd, c17640l2.crashlytics), c2403l4, AbstractC14566l.amazon(2047816642, new C16524l(c15578l, 0), c6956l), c6956l, i8 & 1022, ((i8 >> 24) & 14) | 48, 24);
                interfaceC17242l3 = interfaceC17242l5;
                c2403l3 = c2403l4;
                c18356l2 = c18356l3;
            } else {
                c6956l.m2124else();
                c6050l2 = c6050l;
                c17640l2 = c17640l;
                c5923lYandex = c5923lYandex;
                interfaceC17242l3 = interfaceC17242l2;
                c2403l3 = c2403l2;
                c18356l2 = c18356l;
                c14408l2 = c14408l;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؙٕۙ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC10464l.yandex(function0, interfaceC17242l3, c18356l2, c6050l2, c5923lYandex, c14408l2, c17640l2, c2403l3, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 100663296;
        c2403l2 = c2403l;
        if ((805306368 & i) == 0) {
            if (c6956l.admob(c15578l)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i4 |= i9;
        }
        if ((306783379 & i4) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i4 & 1, z)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                C6839l c6839l6 = C7219l.loadAd;
                c18356l3 = new C18356l(c6839l6, c6839l6, c6839l6);
                C10707l c10707l6 = AbstractC10689l.yandex;
                long jIsPro6 = ((C10936l) c6956l.isPro(c10707l6)).isPro();
                C6050l c6050l8 = new C6050l(jIsPro6, AbstractC10689l.yandex(jIsPro6, c6956l), jIsPro6, AbstractC10689l.yandex(jIsPro6, c6956l), jIsPro6, AbstractC10689l.yandex(jIsPro6, c6956l));
                i7 = i4 & (-64513);
                if ((i2 & 32) != 0) {
                    C14855l c14855l6 = C7219l.yandex;
                    c5923lYandex = C7219l.yandex(7);
                    i7 = i4 & (-523265);
                }
                C2209l c2209l14 = C2209l.crashlytics;
                interfaceC17242l5 = interfaceC17242l4;
                C2209l c2209l15 = new C2209l(AbstractC2576l.yandex(3.0f, ((C10936l) c6956l.isPro(c10707l6)).yandex()), c6839l6, 2);
                c14408l2 = new C14408l(c2209l14, c2209l15, c2209l15);
                C4442l c4442l6 = C4442l.loadAd;
                c17640l2 = new C17640l(c4442l6, c4442l6, c4442l6);
                i8 = i7 & (-33030145);
                if (i5 != 0) {
                    c2403l4 = null;
                } else {
                    c2403l4 = c2403l2;
                }
                c6050l2 = c6050l8;
            } else {
                if (i10 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                C6839l c6839l7 = C7219l.loadAd;
                c18356l3 = new C18356l(c6839l7, c6839l7, c6839l7);
                C10707l c10707l7 = AbstractC10689l.yandex;
                long jIsPro7 = ((C10936l) c6956l.isPro(c10707l7)).isPro();
                C6050l c6050l9 = new C6050l(jIsPro7, AbstractC10689l.yandex(jIsPro7, c6956l), jIsPro7, AbstractC10689l.yandex(jIsPro7, c6956l), jIsPro7, AbstractC10689l.yandex(jIsPro7, c6956l));
                i7 = i4 & (-64513);
                if ((i2 & 32) != 0) {
                    C14855l c14855l7 = C7219l.yandex;
                    c5923lYandex = C7219l.yandex(7);
                    i7 = i4 & (-523265);
                }
                C2209l c2209l16 = C2209l.crashlytics;
                interfaceC17242l5 = interfaceC17242l4;
                C2209l c2209l17 = new C2209l(AbstractC2576l.yandex(3.0f, ((C10936l) c6956l.isPro(c10707l7)).yandex()), c6839l7, 2);
                c14408l2 = new C14408l(c2209l16, c2209l17, c2209l17);
                C4442l c4442l7 = C4442l.loadAd;
                c17640l2 = new C17640l(c4442l7, c4442l7, c4442l7);
                i8 = i7 & (-33030145);
                if (i5 != 0) {
                    c2403l4 = null;
                } else {
                    c2403l4 = c2403l2;
                }
                c6050l2 = c6050l9;
            }
            c6956l.adcel();
            InterfaceC6347l interfaceC6347l4 = c18356l3.yandex;
            C8886l c8886l4 = new C8886l(interfaceC6347l4, c18356l3.loadAd, c18356l3.crashlytics, interfaceC6347l4, interfaceC6347l4);
            long j7 = c6050l2.yandex;
            long j8 = c6050l2.loadAd;
            C7568l c7568l4 = new C7568l(j7, j8, c6050l2.crashlytics, c6050l2.amazon, c6050l2.purchase, c6050l2.billing, j7, j8);
            c5923lYandex.getClass();
            C10513l c10513l4 = new C10513l(1.0f, c5923lYandex.yandex, 1.0f, 1.0f, 1.0f);
            C2209l c2209l18 = c14408l2.yandex;
            AbstractC16291l.loadAd(function0, interfaceC17242l5, false, c8886l4, c7568l4, c10513l4, new C9486l(c2209l18, c14408l2.loadAd, c14408l2.crashlytics, c2209l18, c2209l18), new C11568l(c17640l2.yandex, c17640l2.loadAd, c17640l2.crashlytics), c2403l4, AbstractC14566l.amazon(2047816642, new C16524l(c15578l, 0), c6956l), c6956l, i8 & 1022, ((i8 >> 24) & 14) | 48, 24);
            interfaceC17242l3 = interfaceC17242l5;
            c2403l3 = c2403l4;
            c18356l2 = c18356l3;
        } else {
            c6956l.m2124else();
            c6050l2 = c6050l;
            c17640l2 = c17640l;
            c5923lYandex = c5923lYandex;
            interfaceC17242l3 = interfaceC17242l2;
            c2403l3 = c2403l2;
            c18356l2 = c18356l;
            c14408l2 = c14408l;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؙٕۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC10464l.yandex(function0, interfaceC17242l3, c18356l2, c6050l2, c5923lYandex, c14408l2, c17640l2, c2403l3, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
