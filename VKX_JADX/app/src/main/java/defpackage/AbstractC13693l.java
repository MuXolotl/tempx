package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13693l {
    public static final C9754l loadAd;
    public static final int[] yandex = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    static {
        int i = 0;
        loadAd = new C9754l(i, i, 9);
    }

    public static void admob(C5257l c5257l, C11516l c11516l) throws C17655l {
        c5257l.metrica(2);
        boolean zBilling = c5257l.billing();
        int iMopub = c5257l.mopub(8);
        for (int i = 0; i < iMopub; i++) {
            c5257l.metrica(2);
            if (c5257l.billing()) {
                c5257l.metrica(5);
            }
            if (zBilling) {
                c5257l.metrica(24);
            } else {
                if (c5257l.billing()) {
                    if (!c5257l.billing()) {
                        c5257l.metrica(4);
                    }
                    c11516l.crashlytics = c5257l.mopub(6) + 1;
                }
                c5257l.metrica(4);
            }
        }
        if (c5257l.billing()) {
            c5257l.metrica(3);
            if (c5257l.billing()) {
                subs(c5257l);
            }
        }
    }

    public static void amazon(int i, C13143l c13143l) {
        c13143l.m3563native(7);
        byte[] bArr = c13143l.yandex;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    public static C15380l billing(C5257l c5257l) {
        int i;
        int i2;
        int iMopub = c5257l.mopub(16);
        int iMopub2 = c5257l.mopub(16);
        if (iMopub2 == 65535) {
            iMopub2 = c5257l.mopub(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iMopub2 + i;
        if (iMopub == 44097) {
            i3 += 2;
        }
        if (c5257l.mopub(2) == 3) {
            do {
                c5257l.mopub(2);
            } while (c5257l.billing());
        }
        int iMopub3 = c5257l.mopub(10);
        if (c5257l.billing() && c5257l.mopub(3) > 0) {
            c5257l.metrica(2);
        }
        int i4 = c5257l.billing() ? 48000 : 44100;
        int iMopub4 = c5257l.mopub(4);
        int[] iArr = yandex;
        if (i4 == 44100 && iMopub4 == 13) {
            i2 = iArr[iMopub4];
        } else if (i4 != 48000 || iMopub4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iMopub4];
            int i6 = iMopub3 % 5;
            if (i6 == 1) {
                if (iMopub4 != 3 || iMopub4 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iMopub4 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iMopub4 == 3 || iMopub4 == 8 || iMopub4 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iMopub4 == 8 || iMopub4 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new C15380l(i4, i3, i2, 0);
    }

    public static final C4991l crashlytics(C10754l c10754l, C3625l c3625l) {
        c10754l.getClass();
        int length = c3625l.f7563l.length();
        int length2 = c3625l.f7563l.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            firebase(i, length2, i);
        }
        firebase(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            smaato(i2, length, i2);
        }
        smaato(length2, length, length2);
        return new C4991l(c3625l, new C9754l(c3625l.f7563l.length(), c3625l.f7563l.length(), 9));
    }

    public static final void firebase(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbSubscription = AbstractC14814l.subscription(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbSubscription.append(i2);
        sbSubscription.append("]");
        AbstractC14825l.crashlytics(sbSubscription.toString());
    }

    public static final void isPro(int i) {
        throw new C14747l(AbstractC0653l.vip(i, "An unknown field for index "));
    }

    public static final void loadAd(boolean z, final C17004l c17004l, Function0 function0, C6956l c6956l, int i) {
        C15578l c15578lAmazon;
        c6956l.m2133new(2023453089);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.billing(c17004l) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            if (c17004l.crashlytics != 0) {
                c6956l.m2123default(825169814);
                c15578lAmazon = AbstractC14566l.amazon(224785615, new Function2() { // from class: lٍؔؕ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i3;
                        C17004l c17004l2 = c17004l;
                        switch (i5) {
                            case 0:
                                C6956l c6956l2 = (C6956l) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c17004l2.crashlytics, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, c17004l2.yandex), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(825279213);
                c6956l.startapp(false);
                c15578lAmazon = null;
            }
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), false, null, function0, 15);
            Function2 function2 = c17004l.loadAd;
            int i5 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC14566l.amazon(1293185667, new Function2() { // from class: lٍؔؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    C17004l c17004l2 = c17004l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c17004l2.crashlytics, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, c17004l2.yandex), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), interfaceC17242lLoadAd, null, function2, c15578lAmazon, z ? null : AbstractC1889l.yandex, AbstractC15548l.yandex(C9735l.isPro, 0L, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, c6956l, 506), c6956l, 6, 388);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16693l(z, c17004l, function0, i, 5);
        }
    }

    public static String metrica(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC6791l.signatures("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC6791l.signatures("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C8339l.metrica(AbstractC9361l.Signature(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    public static void mopub(C5257l c5257l, C11516l c11516l) throws C17655l {
        int iMopub = c5257l.mopub(5);
        c5257l.metrica(2);
        if (c5257l.billing()) {
            c5257l.metrica(5);
        }
        if (iMopub >= 7 && iMopub <= 10) {
            c5257l.vip();
        }
        if (c5257l.billing()) {
            int iMopub2 = c5257l.mopub(3);
            if (c11516l.loadAd == -1 && iMopub >= 0 && iMopub <= 15 && (iMopub2 == 0 || iMopub2 == 1)) {
                c11516l.loadAd = iMopub;
            }
            if (c5257l.billing()) {
                subs(c5257l);
            }
        }
    }

    public static final C1310l purchase(C14187l c14187l) {
        C1310l c1310l;
        Iterator it = AbstractC0007l.crashlytics(c14187l).amazon().iterator();
        do {
            c1310l = null;
            if (!it.hasNext()) {
                break;
            }
            Object objBilling = AbstractC0007l.crashlytics(c14187l).billing((C11911l) it.next());
            if (objBilling instanceof C1310l) {
                c1310l = (C1310l) objBilling;
            }
        } while (c1310l == null);
        return c1310l == null ? C1310l.yandex : c1310l;
    }

    public static void remoteconfig(int i, int i2) {
        String strSignatures;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strSignatures = AbstractC6791l.signatures("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C8339l.metrica(AbstractC9361l.Signature(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strSignatures = AbstractC6791l.signatures("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strSignatures);
        }
    }

    public static final void smaato(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbSubscription = AbstractC14814l.subscription(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbSubscription.append(i2);
        sbSubscription.append("]");
        AbstractC14825l.crashlytics(sbSubscription.toString());
    }

    public static void subs(C5257l c5257l) throws C17655l {
        int iMopub = c5257l.mopub(6);
        if (iMopub < 2 || iMopub > 42) {
            throw C17655l.crashlytics(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iMopub)));
        }
        c5257l.metrica(iMopub * 8);
    }

    public static void vip(int i, int i2, int i3) {
        String strMetrica;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strMetrica = metrica(i, i3, "start index");
            } else {
                strMetrica = (i2 < 0 || i2 > i3) ? metrica(i2, i3, "end index") : AbstractC6791l.signatures("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strMetrica);
        }
    }

    public static final void yandex(int i, int i2, C6956l c6956l, boolean z, boolean z2) {
        boolean z3;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1568045024);
        int i3 = i2 | (c6956l2.amazon(i) ? 4 : 2);
        if (c6956l2.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            C9946l c9946l = AbstractC16837l.yandex;
            if (z) {
                c6956l2.m2123default(-1235562010);
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.amazon(AbstractC0080l.purchase(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.loadAd(3)), 8.0f), 1.0f), ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.ads, c9946l), c6956l2, 0);
            } else {
                c6956l2.m2123default(-1246538676);
            }
            c6956l2.startapp(false);
            String strPurchase = AbstractC11999l.purchase(c6956l2, i);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC3605l.remoteconfig(c4346l, 16.0f, 12.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 48, 0, 262136);
            c6956l2 = c6956l;
            if (z2) {
                c6956l2.m2123default(-1235064212);
                z3 = false;
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.amazon(AbstractC0080l.purchase(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.loadAd(12)), 8.0f), 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.ads, c9946l), c6956l2, 0);
            } else {
                z3 = false;
                c6956l2.m2123default(-1246538676);
            }
            c6956l2.startapp(z3);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12778l(i, z, z2, i2);
        }
    }
}
