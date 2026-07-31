package defpackage;

import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;

/* JADX INFO: renamed from: lْۤؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13766l {
    public static final byte[] yandex = {48, 49, 53, 0};
    public static final byte[] loadAd = {48, 49, 48, 0};
    public static final byte[] crashlytics = {48, 48, 57, 0};
    public static final byte[] amazon = {48, 48, 53, 0};
    public static final byte[] purchase = {48, 48, 49, 0};
    public static final byte[] billing = {48, 48, 49, 0};
    public static final byte[] mopub = {48, 48, 50, 0};

    public static byte[] admob(long j) {
        long j2 = j;
        byte b = 1;
        while (true) {
            j2 >>= 8;
            if (j2 == 0) {
                break;
            }
            b = (byte) (b + 1);
        }
        byte[] bArr = new byte[b + 1];
        bArr[b] = b;
        for (int i = 0; i < b; i++) {
            bArr[i] = (byte) (j >> (((b - i) - 1) * 8));
        }
        return bArr;
    }

    public static final long amazon(long j, boolean z, int i, float f) {
        int iAdmob = ((z || i == 2 || i == 4 || i == 5) && C15519l.amazon(j)) ? C15519l.admob(j) : Alert.DURATION_SHOW_INDEFINITELY;
        if (C15519l.isPro(j) != iAdmob) {
            iAdmob = AbstractC8576l.purchase(AbstractC0509l.loadAd(f), C15519l.isPro(j), iAdmob);
        }
        return AbstractC13628l.billing(0, iAdmob, 0, C15519l.mopub(j));
    }

    public static String billing(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AbstractC9361l.Signature(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return "API_NOT_CONNECTED";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return "DEAD_CLIENT";
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static void crashlytics(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 >>> i3;
        int i6 = 1 << i3;
        int i7 = i5 - 1;
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) - i3;
        int i8 = i4 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i8];
        int[] iArr5 = new int[i8];
        int[][] iArr6 = new int[i6][];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i8);
            int i9 = 0;
            while (i9 < i6) {
                int[] iArr7 = new int[i5 * i8];
                iArr6[i9] = iArr7;
                int i10 = iNumberOfTrailingZeros;
                int i11 = i9;
                int i12 = 0;
                for (int i13 = 0; i13 < i5; i13 += 2) {
                    System.arraycopy(iArr5, 0, iArr7, i12, i8);
                    int i14 = i12 + i8;
                    yandex(iArr5, iArr2, iArr3, iArr4, i4);
                    System.arraycopy(iArr4, 0, iArr7, i14, i8);
                    i12 = i14 + i8;
                    yandex(iArr4, iArr2, iArr3, iArr5, i4);
                }
                i9 = i11 + 1;
                iNumberOfTrailingZeros = i10;
            }
            int i15 = iNumberOfTrailingZeros;
            int i16 = i2 - 1;
            for (int i17 = 0; i17 < i2; i17++) {
                int i18 = iArr5[i8 - 16] & i16;
                System.arraycopy(iArr6[i18 >>> i15], (i18 & i7) * i8, iArr4, 0, i8);
                for (int i19 = i8 - 1; i19 >= 0; i19--) {
                    iArr4[i19] = iArr4[i19] ^ iArr5[i19];
                }
                yandex(iArr4, iArr2, iArr3, iArr5, i4);
            }
            System.arraycopy(iArr5, 0, iArr, i, i8);
            loadAd(iArr6);
            loadAd(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            loadAd(iArr6);
            loadAd(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    public static void loadAd(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (iArr2 != null) {
                Arrays.fill(iArr2, 0);
            }
        }
    }

    public static byte[] mopub(long j) {
        long j2 = j;
        byte b = 1;
        while (true) {
            j2 >>= 8;
            if (j2 == 0) {
                break;
            }
            b = (byte) (b + 1);
        }
        byte[] bArr = new byte[b + 1];
        bArr[0] = b;
        for (int i = 1; i <= b; i++) {
            bArr[i] = (byte) (j >> ((b - i) * 8));
        }
        return bArr;
    }

    public static byte[] purchase(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        String strApplovin;
        int[] iArr = null;
        if (bArr == null) {
            strApplovin = "Passphrase P must be provided.";
        } else if (bArr2 == null) {
            strApplovin = "Salt S must be provided.";
        } else if (i <= 1 || ((i - 1) & i) != 0) {
            strApplovin = "Cost parameter N must be > 1 and a power of 2";
        } else if (i2 == 1 && i >= 65536) {
            strApplovin = "Cost parameter N must be > 1 and < 65536.";
        } else if (i2 >= 1) {
            int i5 = i2 * 128;
            int i6 = Alert.DURATION_SHOW_INDEFINITELY / (i2 * 1024);
            if (i3 < 1 || i3 > i6) {
                strApplovin = AbstractC12589l.applovin(i6, i2, "Parallelisation parameter p must be >= 1 and <= ", " (based on block size r of ", ")");
            } else {
                if (i4 >= 1) {
                    C8094l c8094l = new C8094l(new C2657l());
                    c8094l.init(bArr, bArr2, 1);
                    byte[] bArr3 = ((C13886l) c8094l.generateDerivedParameters(i3 * i5 * 8)).f27156l;
                    try {
                        int length = bArr3.length >>> 2;
                        iArr = new int[length];
                        AbstractC10000l.startapp(0, bArr3, iArr);
                        int i7 = 0;
                        for (int i8 = i * i2; i - i7 > 2 && i8 > 1024; i8 >>>= 1) {
                            i7++;
                        }
                        int i9 = i5 >>> 2;
                        for (int i10 = 0; i10 < length; i10 += i9) {
                            crashlytics(i10, i, i7, i2, iArr);
                        }
                        AbstractC10000l.remoteconfig(bArr3, iArr);
                        C8094l c8094l2 = new C8094l(new C2657l());
                        c8094l2.init(bArr, bArr3, 1);
                        byte[] bArr4 = ((C13886l) c8094l2.generateDerivedParameters(i4 * 8)).f27156l;
                        Arrays.fill(bArr3, (byte) 0);
                        Arrays.fill(iArr, 0);
                        return bArr4;
                    } catch (Throwable th) {
                        if (bArr3 != null) {
                            Arrays.fill(bArr3, (byte) 0);
                        }
                        if (iArr != null) {
                            Arrays.fill(iArr, 0);
                        }
                        throw th;
                    }
                }
                strApplovin = "Generated key length dkLen must be >= 1.";
            }
        } else {
            strApplovin = "Block size r must be >= 1.";
        }
        C8339l.metrica(strApplovin);
        return null;
    }

    public static void yandex(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            for (int length2 = iArr3.length - 1; length2 >= 0; length2--) {
                iArr3[length2] = iArr2[length2] ^ iArr[i2 + length2];
            }
            C3479l.billing(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
    }
}
