package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import androidx.recyclerview.widget.isPro;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lُِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11994l {
    public static final int[] yandex = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void admob(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        billing(iArr, iArr2, iArr4);
        isPro(iArr4, iArr3);
    }

    public static int amazon(C5932l c5932l, AbstractC0962l abstractC0962l, View view, View view2, isPro ispro, boolean z) {
        if (ispro.license() == 0 || c5932l.loadAd() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c5932l.loadAd();
        }
        return (int) (((abstractC0962l.loadAd(view2) - abstractC0962l.purchase(view)) / (Math.abs(isPro.m126native(view) - isPro.m126native(view2)) + 1)) * c5932l.loadAd());
    }

    public static void billing(int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC5998l.tapsense(iArr, iArr2, iArr3);
        long j = ((long) iArr2[8]) & 4294967295L;
        long j2 = ((long) iArr2[9]) & 4294967295L;
        long j3 = ((long) iArr2[10]) & 4294967295L;
        long j4 = ((long) iArr2[11]) & 4294967295L;
        long j5 = ((long) iArr2[12]) & 4294967295L;
        long j6 = ((long) iArr2[13]) & 4294967295L;
        long j7 = ((long) iArr2[14]) & 4294967295L;
        long j8 = ((long) iArr2[15]) & 4294967295L;
        long j9 = ((long) iArr[8]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[16] = (int) j10;
        int i = 32;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[17] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[18] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[19] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[20] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[21] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[22] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[23] = (int) j17;
        iArr3[24] = (int) (j17 >>> 32);
        int i2 = 16;
        int i3 = 1;
        while (i3 < 8) {
            int i4 = i2 + 1;
            int i5 = i3;
            long j18 = j5;
            int i6 = i;
            long j19 = ((long) iArr[8 + i3]) & 4294967295L;
            long j20 = j6;
            long j21 = (j19 * j) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j21;
            int i7 = i2 + 2;
            long j22 = (j19 * j2) + (((long) iArr3[i7]) & 4294967295L) + (j21 >>> i6);
            iArr3[i7] = (int) j22;
            int i8 = i2 + 3;
            long j23 = (j19 * j3) + (((long) iArr3[i8]) & 4294967295L) + (j22 >>> i6);
            iArr3[i8] = (int) j23;
            int i9 = i2 + 4;
            long j24 = (j19 * j4) + (((long) iArr3[i9]) & 4294967295L) + (j23 >>> i6);
            iArr3[i9] = (int) j24;
            int i10 = i2 + 5;
            long j25 = (j19 * j18) + (((long) iArr3[i10]) & 4294967295L) + (j24 >>> i6);
            iArr3[i10] = (int) j25;
            int i11 = i2 + 6;
            long j26 = (j19 * j20) + (((long) iArr3[i11]) & 4294967295L) + (j25 >>> i6);
            iArr3[i11] = (int) j26;
            int i12 = i2 + 7;
            long j27 = (j19 * j7) + (((long) iArr3[i12]) & 4294967295L) + (j26 >>> i6);
            iArr3[i12] = (int) j27;
            int i13 = i2 + 8;
            long j28 = (j19 * j8) + (((long) iArr3[i13]) & 4294967295L) + (j27 >>> i6);
            iArr3[i13] = (int) j28;
            iArr3[i2 + 9] = (int) (j28 >>> i6);
            i3 = i5 + 1;
            i2 = i4;
            i = i6;
            j5 = j18;
            j3 = j3;
            j6 = j20;
        }
        int i14 = i;
        int iPurchase = AbstractC5998l.purchase(iArr3, iArr3);
        int i15 = 0;
        int iAmazon = AbstractC5998l.amazon(24, 16, iArr3, iArr3, AbstractC5998l.amazon(0, 8, iArr3, iArr3, 0) + iPurchase) + iPurchase;
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        boolean z = AbstractC5998l.isPro(iArr, iArr, iArr4) != AbstractC5998l.isPro(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[16];
        AbstractC5998l.tapsense(iArr4, iArr5, iArr6);
        AbstractC4952l.admob(i14, iAmazon + (z ? AbstractC4952l.billing(16, 8, iArr6, iArr3) : AbstractC4952l.m1650package(16, 8, iArr6, iArr3)), 24, iArr3);
        int i16 = iArr[16];
        int i17 = iArr2[16];
        long j29 = ((long) i16) & 4294967295L;
        long j30 = ((long) i17) & 4294967295L;
        long j31 = 0;
        while (true) {
            long j32 = j29;
            int i18 = 16 + i15;
            long j33 = ((((long) iArr[i15]) & 4294967295L) * j30) + (j32 * (((long) iArr2[i15]) & 4294967295L)) + (((long) iArr3[i18]) & 4294967295L) + j31;
            iArr3[i18] = (int) j33;
            long j34 = j33 >>> 32;
            i15++;
            if (i15 >= 16) {
                iArr3[32] = (i16 * i17) + ((int) j34);
                return;
            } else {
                j31 = j34;
                j29 = j32;
            }
        }
    }

    public static int crashlytics(C5932l c5932l, AbstractC0962l abstractC0962l, View view, View view2, isPro ispro, boolean z, boolean z2) {
        if (ispro.license() == 0 || c5932l.loadAd() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c5932l.loadAd() - Math.max(isPro.m126native(view), isPro.m126native(view2))) - 1) : Math.max(0, Math.min(isPro.m126native(view), isPro.m126native(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0962l.loadAd(view2) - abstractC0962l.purchase(view)) / (Math.abs(isPro.m126native(view) - isPro.m126native(view2)) + 1))) + (abstractC0962l.firebase() - abstractC0962l.purchase(view)));
        }
        return iMax;
    }

    public static void firebase(int[] iArr) {
        int i = iArr[16];
        int iSubs = AbstractC4952l.subs(16, i >>> 9, iArr) + (i & 511);
        if (iSubs > 511 || (iSubs == 511 && AbstractC4952l.firebase(16, iArr, yandex))) {
            iSubs = (AbstractC4952l.subscription(iArr) + iSubs) & 511;
        }
        iArr[16] = iSubs;
    }

    public static void isPro(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i2 = i;
        int i3 = 16;
        while (true) {
            int i4 = i3 - 1;
            if (i4 < 0) {
                break;
            }
            int i5 = iArr[i3 + 15];
            iArr2[i4] = (i2 << (-9)) | (i5 >>> 9);
            i2 = i5;
            i3 = i4;
        }
        int iMopub = AbstractC4952l.mopub(16, iArr, iArr2) + ((i2 << (-9)) >>> 23) + (i >>> 9);
        if (iMopub > 511 || (iMopub == 511 && AbstractC4952l.firebase(16, iArr2, yandex))) {
            iMopub = (AbstractC4952l.subscription(iArr2) + iMopub) & 511;
        }
        iArr2[16] = iMopub;
    }

    public static int loadAd(C5932l c5932l, AbstractC0962l abstractC0962l, View view, View view2, isPro ispro, boolean z) {
        if (ispro.license() == 0 || c5932l.loadAd() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(isPro.m126native(view) - isPro.m126native(view2)) + 1;
        }
        return Math.min(abstractC0962l.smaato(), abstractC0962l.loadAd(view2) - abstractC0962l.purchase(view));
    }

    public static int metrica(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static void mopub(int[] iArr, int[] iArr2) {
        AbstractC5998l.pro(iArr, iArr2);
        long j = 4294967295L;
        long j2 = ((long) iArr[8]) & 4294967295L;
        int i = 7;
        int i2 = 16;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j3 = ((long) iArr[i + 8]) & j;
            long j4 = j3 * j3;
            long j5 = j;
            iArr2[i2 + 15] = ((int) (j4 >>> 33)) | (i3 << 31);
            int i5 = i2 - 2;
            iArr2[i2 + 14] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i4 <= 0) {
                long j6 = j2 * j2;
                iArr2[16] = (int) j6;
                long j7 = ((long) iArr[9]) & j5;
                long j8 = ((long) iArr2[18]) & j5;
                long j9 = (j7 * j2) + ((((long) (i3 << 31)) & j5) | (j6 >>> 33));
                int i6 = (int) j9;
                iArr2[17] = (i6 << 1) | (((int) (j6 >>> 32)) & 1);
                long j10 = j8 + (j9 >>> 32);
                long j11 = ((long) iArr[10]) & j5;
                long j12 = ((long) iArr2[19]) & j5;
                long j13 = ((long) iArr2[20]) & j5;
                long j14 = (j11 * j2) + j10;
                int i7 = (int) j14;
                iArr2[18] = (i6 >>> 31) | (i7 << 1);
                int i8 = i7 >>> 31;
                long jRemoteconfig = AbstractC0653l.remoteconfig(j11, j7, j14 >>> 32, j12);
                long j15 = j13 + (jRemoteconfig >>> 32);
                long j16 = ((long) iArr[11]) & j5;
                long j17 = (((long) iArr2[21]) & j5) + (j15 >>> 32);
                long j18 = (((long) iArr2[22]) & j5) + (j17 >>> 32);
                long j19 = (j16 * j2) + (jRemoteconfig & j5);
                int i9 = (int) j19;
                iArr2[19] = (i9 << 1) | i8;
                long jRemoteconfig2 = AbstractC0653l.remoteconfig(j16, j7, j19 >>> 32, j15 & j5);
                long jRemoteconfig3 = AbstractC0653l.remoteconfig(j16, j11, jRemoteconfig2 >>> 32, j17 & j5);
                long j20 = j18 + (jRemoteconfig3 >>> 32);
                long j21 = jRemoteconfig3 & j5;
                long j22 = ((long) iArr[12]) & j5;
                long j23 = (((long) iArr2[23]) & j5) + (j20 >>> 32);
                long j24 = (((long) iArr2[24]) & j5) + (j23 >>> 32);
                long j25 = j23 & j5;
                long j26 = (j22 * j2) + (jRemoteconfig2 & j5);
                int i10 = (int) j26;
                iArr2[20] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                long jRemoteconfig4 = AbstractC0653l.remoteconfig(j22, j7, j26 >>> 32, j21);
                long jRemoteconfig5 = AbstractC0653l.remoteconfig(j22, j11, jRemoteconfig4 >>> 32, j20 & j5);
                long jRemoteconfig6 = AbstractC0653l.remoteconfig(j22, j16, jRemoteconfig5 >>> 32, j25);
                long j27 = jRemoteconfig5 & j5;
                long j28 = j24 + (jRemoteconfig6 >>> 32);
                long j29 = jRemoteconfig6 & j5;
                long j30 = ((long) iArr[13]) & j5;
                long j31 = (((long) iArr2[25]) & j5) + (j28 >>> 32);
                long j32 = j28 & j5;
                long j33 = (((long) iArr2[26]) & j5) + (j31 >>> 32);
                long j34 = j31 & j5;
                long j35 = (j30 * j2) + (jRemoteconfig4 & j5);
                int i12 = (int) j35;
                iArr2[21] = (i12 << 1) | i11;
                long jRemoteconfig7 = AbstractC0653l.remoteconfig(j30, j7, j35 >>> 32, j27);
                long jRemoteconfig8 = AbstractC0653l.remoteconfig(j30, j11, jRemoteconfig7 >>> 32, j29);
                long jRemoteconfig9 = AbstractC0653l.remoteconfig(j30, j16, jRemoteconfig8 >>> 32, j32);
                long j36 = jRemoteconfig8 & j5;
                long jRemoteconfig10 = AbstractC0653l.remoteconfig(j30, j22, jRemoteconfig9 >>> 32, j34);
                long j37 = j33 + (jRemoteconfig10 >>> 32);
                long j38 = jRemoteconfig10 & j5;
                long j39 = ((long) iArr[14]) & j5;
                long j40 = (((long) iArr2[27]) & j5) + (j37 >>> 32);
                long j41 = j37 & j5;
                long j42 = (((long) iArr2[28]) & j5) + (j40 >>> 32);
                long j43 = j40 & j5;
                long j44 = (j39 * j2) + (jRemoteconfig7 & j5);
                int i13 = (int) j44;
                iArr2[22] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                long jRemoteconfig11 = AbstractC0653l.remoteconfig(j39, j7, j44 >>> 32, j36);
                long jRemoteconfig12 = AbstractC0653l.remoteconfig(j39, j11, jRemoteconfig11 >>> 32, jRemoteconfig9 & j5);
                long jRemoteconfig13 = AbstractC0653l.remoteconfig(j39, j16, jRemoteconfig12 >>> 32, j38);
                long j45 = jRemoteconfig12 & j5;
                long jRemoteconfig14 = AbstractC0653l.remoteconfig(j39, j22, jRemoteconfig13 >>> 32, j41);
                long j46 = jRemoteconfig13 & j5;
                long jRemoteconfig15 = AbstractC0653l.remoteconfig(j39, j30, jRemoteconfig14 >>> 32, j43);
                long j47 = jRemoteconfig14 & j5;
                long j48 = j42 + (jRemoteconfig15 >>> 32);
                long j49 = ((long) iArr[15]) & j5;
                long j50 = (((long) iArr2[29]) & j5) + (j48 >>> 32);
                long j51 = (((long) iArr2[30]) & j5) + (j50 >>> 32);
                long j52 = j50 & j5;
                long j53 = (j2 * j49) + (jRemoteconfig11 & j5);
                int i15 = (int) j53;
                iArr2[23] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                long jRemoteconfig16 = AbstractC0653l.remoteconfig(j49, j7, j53 >>> 32, j45);
                long jRemoteconfig17 = AbstractC0653l.remoteconfig(j49, j11, jRemoteconfig16 >>> 32, j46);
                long jRemoteconfig18 = AbstractC0653l.remoteconfig(j49, j16, jRemoteconfig17 >>> 32, j47);
                long jRemoteconfig19 = AbstractC0653l.remoteconfig(j49, j22, jRemoteconfig18 >>> 32, jRemoteconfig15 & j5);
                long jRemoteconfig20 = AbstractC0653l.remoteconfig(j49, j30, jRemoteconfig19 >>> 32, j48 & j5);
                long jRemoteconfig21 = AbstractC0653l.remoteconfig(j49, j39, jRemoteconfig20 >>> 32, j52);
                long j54 = j51 + (jRemoteconfig21 >>> 32);
                int i17 = (int) jRemoteconfig16;
                iArr2[24] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jRemoteconfig17;
                iArr2[25] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) jRemoteconfig18;
                iArr2[26] = i20 | (i21 << 1);
                int i22 = (int) jRemoteconfig19;
                iArr2[27] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) jRemoteconfig20;
                iArr2[28] = i23 | (i24 << 1);
                int i25 = (int) jRemoteconfig21;
                iArr2[29] = (i25 << 1) | (i24 >>> 31);
                int i26 = (int) j54;
                iArr2[30] = (i25 >>> 31) | (i26 << 1);
                iArr2[31] = (i26 >>> 31) | ((iArr2[31] + ((int) (j54 >>> 32))) << 1);
                int iPurchase = AbstractC5998l.purchase(iArr2, iArr2);
                int iAmazon = AbstractC5998l.amazon(24, 16, iArr2, iArr2, AbstractC5998l.amazon(0, 8, iArr2, iArr2, 0) + iPurchase) + iPurchase;
                int[] iArr3 = new int[8];
                AbstractC5998l.isPro(iArr, iArr, iArr3);
                int[] iArr4 = new int[16];
                AbstractC5998l.pro(iArr3, iArr4);
                AbstractC4952l.admob(32, AbstractC4952l.m1650package(16, 8, iArr4, iArr2) + iAmazon, 24, iArr2);
                int i27 = iArr[16];
                iArr2[32] = (i27 * i27) + AbstractC4952l.advert(16, i27 << 1, iArr, iArr2, 16);
                return;
            }
            i2 = i5;
            i = i4;
            j = j5;
        }
    }

    public static final boolean purchase(long j, long j2) {
        return j == j2;
    }

    public static void remoteconfig(int[] iArr, int[] iArr2, int[] iArr3) {
        int iInmobi = (AbstractC4952l.inmobi(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iInmobi < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    i = -1;
                    break;
                }
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 != -1) {
                    break;
                } else {
                    i2++;
                }
            }
            iInmobi = (iInmobi + i) & 511;
        }
        iArr3[16] = iInmobi;
    }

    public static void smaato(C2494l c2494l, C2494l c2494l2, C8904l c8904l, byte[] bArr) {
        C8082l c8082lM1196l = c2494l.m1196l();
        byte[] bArrYandex = c8904l.yandex(c8082lM1196l.purchase(), bArr);
        C8824l c8824lApplovin = C18518l.applovin();
        C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrYandex.length, bArrYandex);
        c8824lApplovin.purchase();
        C18518l.isVip((C18518l) c8824lApplovin.f19242l, c14809lMopub);
        C0332l c0332lYandex = AbstractC4001l.yandex(c8082lM1196l);
        c8824lApplovin.purchase();
        C18518l.signatures((C18518l) c8824lApplovin.f19242l, c0332lYandex);
        if (((SharedPreferences.Editor) c2494l2.f5291l).putString((String) c2494l2.f5290l, AbstractC1315l.amazon(((C18518l) c8824lApplovin.yandex()).purchase())).commit()) {
            return;
        }
        C18262l.metrica("Failed to write to SharedPreferences");
    }

    public static C2494l subs(C10685l c10685l, C8904l c8904l, byte[] bArr) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) c10685l.f21690l;
        try {
            C18518l c18518lAppmetrica = C18518l.appmetrica(byteArrayInputStream, C7597l.yandex());
            byteArrayInputStream.close();
            if (c18518lAppmetrica.premium().size() == 0) {
                C18262l.ads("empty keyset");
                return null;
            }
            try {
                C8082l c8082lM2257synchronized = C8082l.m2257synchronized(c8904l.loadAd(c18518lAppmetrica.premium().firebase(), bArr), C7597l.yandex());
                if (c8082lM2257synchronized == null || c8082lM2257synchronized.applovin() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                return C2494l.m1152l(c8082lM2257synchronized);
            } catch (C2297l unused) {
                C18262l.ads("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static String vip(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? AbstractC15560l.Signature("CornerRadius.circular(", AbstractC4447l.crashlytics(Float.intBitsToFloat(i)), ")") : AbstractC14814l.ads("CornerRadius.elliptical(", AbstractC4447l.crashlytics(Float.intBitsToFloat(i)), ", ", AbstractC4447l.crashlytics(Float.intBitsToFloat(i2)), ")");
    }

    public static void yandex(int[] iArr, int[] iArr2, int[] iArr3) {
        int iCrashlytics = AbstractC4952l.crashlytics(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iCrashlytics > 511 || (iCrashlytics == 511 && AbstractC4952l.firebase(16, iArr3, yandex))) {
            iCrashlytics = (AbstractC4952l.subscription(iArr3) + iCrashlytics) & 511;
        }
        iArr3[16] = iCrashlytics;
    }
}
