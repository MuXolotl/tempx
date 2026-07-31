package defpackage;

import java.util.Arrays;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑٛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0441l {
    public static final int[] yandex = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] loadAd = {-1, 8000, AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] crashlytics = {64, 112, 128, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 384, 448, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] amazon = {8000, AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] purchase = {5, 8, 10, 12};
    public static final int[] billing = {6, 9, 12, 15};
    public static final int[] mopub = {2, 4, 6, 8};
    public static final int[] admob = {9, 11, 13, 16};
    public static final int[] subs = {5, 8, 10, 12};

    public static C17201l admob() {
        byte[] bArr = new byte[16];
        AbstractC0195l.yandex.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long jMopub = AbstractC5711l.mopub(0, bArr);
        long jMopub2 = AbstractC5711l.mopub(8, bArr);
        return (jMopub == 0 && jMopub2 == 0) ? C17201l.f33381l : new C17201l(jMopub, jMopub2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int amazon(byte[] bArr) {
        int i;
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b2 = bArr[8];
            }
            i2 = (((b2 & 60) >> 2) | i3) + 1;
            z = true;
            if (z) {
                return (i2 * 16) / 14;
            }
            return i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b = bArr[6];
        i2 = (((b & 240) >> 4) | i) + 1;
        if (z) {
            return (i2 * 16) / 14;
        }
        return i2;
    }

    public static C5257l billing(byte[] bArr) {
        byte[] bArr2;
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C5257l(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        C5257l c5257l = new C5257l(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C5257l c5257l2 = new C5257l(bArrCopyOf, bArrCopyOf.length);
            while (c5257l2.loadAd() >= 16) {
                c5257l2.metrica(2);
                int iMopub = c5257l2.mopub(14) & 16383;
                int iMin = Math.min(8 - c5257l.amazon, 14);
                int i3 = c5257l.amazon;
                int i4 = (8 - i3) - iMin;
                byte[] bArr3 = c5257l.loadAd;
                int i5 = c5257l.crashlytics;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr3[i5]);
                bArr3[i5] = b4;
                int i6 = 14 - iMin;
                bArr3[i5] = (byte) (b4 | ((iMopub >>> i6) << i4));
                int i7 = i5 + 1;
                while (true) {
                    bArr2 = c5257l.loadAd;
                    if (i6 > 8) {
                        bArr2[i7] = (byte) (iMopub >>> (i6 - 8));
                        i6 -= 8;
                        i7++;
                    }
                }
                int i8 = 8 - i6;
                byte b5 = (byte) (bArr2[i7] & ((1 << i8) - 1));
                bArr2[i7] = b5;
                bArr2[i7] = (byte) (((iMopub & ((1 << i6) - 1)) << i8) | b5);
                c5257l.metrica(14);
                c5257l.yandex();
            }
        }
        c5257l.firebase(bArrCopyOf.length, bArrCopyOf);
        return c5257l;
    }

    public static void crashlytics(long j, C13143l c13143l, InterfaceC8979l[] interfaceC8979lArr) {
        int iSignatures = c13143l.signatures();
        if ((iSignatures & 64) != 0) {
            c13143l.m3568throw(1);
            int i = (iSignatures & 31) * 3;
            int i2 = c13143l.loadAd;
            for (InterfaceC8979l interfaceC8979l : interfaceC8979lArr) {
                c13143l.m3562for(i2);
                interfaceC8979l.purchase(i, c13143l);
                AbstractC12442l.subscription(j != -9223372036854775807L);
                interfaceC8979l.yandex(j, 1, i, 0, null);
            }
        }
    }

    public static void isPro(int i, int i2, C14706l[][] c14706lArr) {
        int i3;
        int length = c14706lArr.length;
        int i4 = -1;
        while (true) {
            int i5 = -1;
            while (true) {
                int i6 = i4 + i;
                if (i6 >= 0 && i6 < length && (i3 = i5 + i2) >= 0 && i3 < length) {
                    c14706lArr[i6][i3] = new C14706l((i5 >= 0 && i5 < 7 && (i4 == 0 || i4 == 6)) || (i4 >= 0 && i4 < 7 && (i5 == 0 || i5 == 6)) || (2 <= i4 && i4 < 5 && 2 <= i5 && i5 <= 4), 5);
                }
                if (i5 == 7) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i4 == 7) {
                return;
            } else {
                i4++;
            }
        }
    }

    public static void loadAd(long j, C13143l c13143l, InterfaceC8979l[] interfaceC8979lArr) {
        int i;
        int iSignatures;
        while (true) {
            if (c13143l.yandex() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c13143l.yandex() == 0) {
                    i = -1;
                    break;
                }
                int iSignatures2 = c13143l.signatures();
                i2 += iSignatures2;
                if (iSignatures2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (c13143l.yandex() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iSignatures = c13143l.signatures();
                    i3 += iSignatures;
                }
            } while (iSignatures == 255);
            int i4 = c13143l.loadAd + i3;
            if (i3 == -1 || i3 > c13143l.yandex()) {
                AbstractC6427l.vip("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = c13143l.crashlytics;
            } else if (i == 4 && i3 >= 8) {
                int iSignatures3 = c13143l.signatures();
                int iM3567synchronized = c13143l.m3567synchronized();
                int iRemoteconfig = iM3567synchronized == 49 ? c13143l.remoteconfig() : 0;
                int iSignatures4 = c13143l.signatures();
                if (iM3567synchronized == 47) {
                    c13143l.m3568throw(1);
                }
                boolean z = iSignatures3 == 181 && (iM3567synchronized == 49 || iM3567synchronized == 47) && iSignatures4 == 3;
                if (iM3567synchronized == 49) {
                    z &= iRemoteconfig == 1195456820;
                }
                if (z) {
                    crashlytics(j, c13143l, interfaceC8979lArr);
                }
            }
            c13143l.m3562for(i4);
        }
    }

    public static int mopub(C5257l c5257l, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c5257l.billing(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c5257l.mopub(iArr[i]) + i3;
    }

    public static int purchase(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static void subs(int i, int i2, boolean z, C14706l[][] c14706lArr) {
        C14706l[] c14706lArr2 = c14706lArr[i];
        C14706l c14706l = c14706lArr2[i2];
        if (c14706l != null) {
            c14706l.f28767l = z;
        } else {
            c14706lArr2[i2] = new C14706l(z, 5);
        }
    }

    public static final void yandex(int i, int i2, C6956l c6956l) {
        c6956l.m2133new(1268410940);
        int i3 = (c6956l.amazon(i) ? 4 : 2) | i2 | (c6956l.amazon(R.drawable.ic_playlist_32) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l, 1.0f), 100.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPurchase);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(i, i3 & 14, c6956l);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC0080l.isPro(c4346l, 48.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 440, 0);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_arrow_right_outline_28, 0, c6956l), null, AbstractC3605l.smaato(AbstractC0080l.isPro(c4346l, 56.0f), 10.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, c6956l, 440, 0);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_playlist_32, (i3 >> 3) & 14, c6956l), null, AbstractC0080l.isPro(c4346l, 48.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 440, 0);
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4314l(i, i2);
        }
    }
}
