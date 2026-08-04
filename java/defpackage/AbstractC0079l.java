package defpackage;

import android.R;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Annotation;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؑؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0079l {
    public static final C15578l yandex = new C15578l(-345526027, false, new C2464l(12));

    public static int Signature(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger ad(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC10000l.isPro(i2, (5 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean adcel(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void admob(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
    }

    public static void ads(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        int i = 1;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        int i2 = 6;
        iArr3[6] = (int) (j13 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j14 = ((long) iArr[i3]) & 4294967295L;
            long j15 = (j14 * j) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j15;
            i = i3 + 1;
            long j16 = j5;
            long j17 = (j14 * j2) + (((long) iArr3[i]) & 4294967295L) + (j15 >>> 32);
            iArr3[i] = (int) j17;
            int i4 = i3 + 2;
            long j18 = (j14 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j17 >>> 32);
            iArr3[i4] = (int) j18;
            int i5 = i3 + 3;
            long j19 = (j14 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j18 >>> 32);
            iArr3[i5] = (int) j19;
            int i6 = i3 + 4;
            long j20 = (j14 * j16) + (((long) iArr3[i6]) & 4294967295L) + (j19 >>> 32);
            iArr3[i6] = (int) j20;
            int i7 = i3 + 5;
            long j21 = (j14 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j20 >>> 32);
            iArr3[i7] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            j5 = j16;
            i2 = 6;
        }
    }

    public static BigInteger advert(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC10000l.Signature(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final void amazon(C15685l c15685l, C18666l c18666l) {
        C6264l c6264l = c18666l.amazon;
        C13660l c13660l = c6264l.f13225l;
        Object objMopub = c6264l.f13225l.mopub(AbstractC0424l.isVip);
        if (objMopub == null) {
            objMopub = null;
        }
        C6402l c6402l = (C6402l) objMopub;
        if (AbstractC3292l.loadAd(c18666l)) {
            if (c6402l != null && c6402l.yandex == 8) {
                return;
            }
            Object objMopub2 = c13660l.mopub(AbstractC16601l.advert);
            if (objMopub2 == null) {
                objMopub2 = null;
            }
            C7629l c7629l = (C7629l) objMopub2;
            if (c7629l != null) {
                c15685l.loadAd(new C6933l(R.id.accessibilityActionPageUp, c7629l.yandex));
            }
            Object objMopub3 = c13660l.mopub(AbstractC16601l.signatures);
            if (objMopub3 == null) {
                objMopub3 = null;
            }
            C7629l c7629l2 = (C7629l) objMopub3;
            if (c7629l2 != null) {
                c15685l.loadAd(new C6933l(R.id.accessibilityActionPageDown, c7629l2.yandex));
            }
            Object objMopub4 = c13660l.mopub(AbstractC16601l.isVip);
            if (objMopub4 == null) {
                objMopub4 = null;
            }
            C7629l c7629l3 = (C7629l) objMopub4;
            if (c7629l3 != null) {
                c15685l.loadAd(new C6933l(R.id.accessibilityActionPageLeft, c7629l3.yandex));
            }
            Object objMopub5 = c13660l.mopub(AbstractC16601l.premium);
            C7629l c7629l4 = (C7629l) (objMopub5 != null ? objMopub5 : null);
            if (c7629l4 != null) {
                c15685l.loadAd(new C6933l(R.id.accessibilityActionPageRight, c7629l4.yandex));
            }
        }
    }

    public static int billing(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[12]) & 4294967295L);
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[13]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (((long) iArr[11]) & 4294967295L) + (4294967295L & ((long) iArr2[17])) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
    }

    public static int crashlytics(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static boolean firebase(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 5;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[6 + i] + RecyclerView.UNDEFINED_DURATION;
            int i3 = iArr2[i] + RecyclerView.UNDEFINED_DURATION;
            if (i2 < i3) {
                z = false;
                break;
            }
            if (i2 > i3) {
                break;
            }
            i--;
        }
        if (z) {
            license(iArr, 6, iArr2, 0, iArr3);
            return z;
        }
        license(iArr2, 0, iArr, 6, iArr3);
        return z;
    }

    public static void license(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = (((long) iArr[i]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        iArr3[5] = (int) (((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j5 >> 32));
    }

    public static int loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static boolean metrica(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mopub(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
    }

    public static void pro(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        iArr2[5] = (int) (((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5]))) + (j5 >> 32));
    }

    public static int purchase(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) i3) & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + (j >>> 32);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j2 >>> 32);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j3 >>> 32);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L) + (j4 >>> 32);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i8])) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int remoteconfig(int[] iArr) {
        return iArr[0] & 1;
    }

    public static int[] smaato(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            C11983l.crashlytics();
            return null;
        }
        int[] iArr = new int[6];
        for (int i = 0; i < 6; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static boolean startapp(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final C5301l subs(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        C4955l c4955l = new C4955l(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) AbstractC8669l.m2418throw(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            c4955l.smaato(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC8669l.m2418throw(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    int i4 = c4955l.amazon;
                    List[] listArr = c4955l.billing;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[c4955l.amazon] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        C5301l c5301l = new C5301l(str, enumArr);
        c5301l.crashlytics = c4955l;
        return c5301l;
    }

    public static int subscription(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = 0;
        while (i < 6) {
            long j8 = j;
            int i2 = i;
            long j9 = ((long) iArr[i]) & 4294967295L;
            long j10 = (((long) iArr3[i2]) & 4294967295L) + (j9 * j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            int i4 = i2 + 2;
            long j12 = (j9 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i2 + 3;
            long j13 = (j9 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i2 + 4;
            long j14 = (j9 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i2 + 5;
            long j15 = (j9 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j14 >>> 32);
            iArr3[i7] = (int) j15;
            int i8 = i2 + 6;
            long j16 = (j15 >>> 32) + (((long) iArr3[i8]) & 4294967295L) + j7;
            iArr3[i8] = (int) j16;
            j7 = j16 >>> 32;
            i = i3;
            j = j8;
        }
        return (int) j7;
    }

    public static void tapsense(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i6 = (int) j8;
                iArr2[1] = i5 | (i6 << 1);
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i7 = (int) j12;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long jRemoteconfig = AbstractC0653l.remoteconfig(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jRemoteconfig >>> 32);
                long j14 = ((long) iArr[3]) & 4294967295L;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j13 >>> 32);
                long j16 = j13 & 4294967295L;
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j18 = j15 & 4294967295L;
                long j19 = (j14 * j) + (jRemoteconfig & 4294967295L);
                int i8 = (int) j19;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long jRemoteconfig2 = AbstractC0653l.remoteconfig(j14, j6, j19 >>> 32, j16);
                long jRemoteconfig3 = AbstractC0653l.remoteconfig(j14, j9, jRemoteconfig2 >>> 32, j18);
                long j20 = j17 + (jRemoteconfig3 >>> 32);
                long j21 = ((long) iArr[4]) & 4294967295L;
                long j22 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j) + (jRemoteconfig2 & 4294967295L);
                int i10 = (int) j26;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long jRemoteconfig4 = AbstractC0653l.remoteconfig(j21, j6, j26 >>> 32, jRemoteconfig3 & 4294967295L);
                long jRemoteconfig5 = AbstractC0653l.remoteconfig(j21, j9, jRemoteconfig4 >>> 32, j23);
                long jRemoteconfig6 = AbstractC0653l.remoteconfig(j21, j14, jRemoteconfig5 >>> 32, j25);
                long j27 = j24 + (jRemoteconfig6 >>> 32);
                long j28 = ((long) iArr[5]) & 4294967295L;
                long j29 = (((long) iArr2[9]) & 4294967295L) + (j27 >>> 32);
                long j30 = j27 & 4294967295L;
                long j31 = (((long) iArr2[10]) & 4294967295L) + (j29 >>> 32);
                long j32 = j29 & 4294967295L;
                long j33 = (j28 * j) + (jRemoteconfig4 & 4294967295L);
                int i12 = (int) j33;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long jRemoteconfig7 = AbstractC0653l.remoteconfig(j28, j6, j33 >>> 32, jRemoteconfig5 & 4294967295L);
                long jRemoteconfig8 = AbstractC0653l.remoteconfig(j28, j9, jRemoteconfig7 >>> 32, jRemoteconfig6 & 4294967295L);
                long jRemoteconfig9 = AbstractC0653l.remoteconfig(j28, j14, jRemoteconfig8 >>> 32, j30);
                long jRemoteconfig10 = AbstractC0653l.remoteconfig(j28, j21, jRemoteconfig9 >>> 32, j32);
                long j34 = j31 + (jRemoteconfig10 >>> 32);
                int i14 = (int) jRemoteconfig7;
                iArr2[6] = (i14 << 1) | i13;
                int i15 = (int) jRemoteconfig8;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) jRemoteconfig9;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jRemoteconfig10;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j34;
                iArr2[10] = i20 | (i21 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j34 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static boolean vip(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] + RecyclerView.UNDEFINED_DURATION;
            int i3 = iArr2[i] + RecyclerView.UNDEFINED_DURATION;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:101:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01da  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0210  */
    /* JADX WARN: Code duplicated, block: B:117:0x0218  */
    /* JADX WARN: Code duplicated, block: B:119:0x0229  */
    /* JADX WARN: Code duplicated, block: B:122:0x022f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0245  */
    /* JADX WARN: Code duplicated, block: B:126:0x024d  */
    /* JADX WARN: Code duplicated, block: B:128:0x025e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0264  */
    /* JADX WARN: Code duplicated, block: B:133:0x027d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:137:0x0292  */
    /* JADX WARN: Code duplicated, block: B:140:0x0298  */
    /* JADX WARN: Code duplicated, block: B:141:0x029b  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    /* JADX WARN: Code duplicated, block: B:82:0x0179  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    public static final void yandex(C3809l c3809l, boolean z, Function0 function0, InterfaceC17242l interfaceC17242l, Function0 function1, boolean z2, C11971l c11971l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        Function0 function2;
        boolean z3;
        C11971l c11971l2;
        Function0 function3;
        int i3;
        boolean z4;
        C11971l c11971l3;
        C13863l c13863l;
        boolean z5;
        Object objM2132native;
        boolean z6;
        long jYandex;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long jSubs;
        long jAmazon;
        long jYandex2;
        long j7;
        long jLoadAd;
        long jCrashlytics;
        long jLoadAd2;
        char c;
        long jPurchase;
        long jLoadAd3;
        long jCrashlytics2;
        long j8;
        InterfaceC6347l interfaceC6347l;
        c6956l.m2133new(-540314461);
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(c3809l) : c6956l.admob(c3809l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 2048 : 1024;
        }
        int i5 = 221184 | i2;
        if ((i & 1572864) == 0) {
            i5 = 745472 | i2;
        }
        int i6 = 12582912 | i5;
        if ((i & 100663296) == 0) {
            i6 |= c6956l.admob(c15578l) ? 67108864 : 33554432;
        }
        if (c6956l.m2127for(i6 & 1, (i6 & 38347923) != 38347922)) {
            c6956l.m2141switch();
            int i7 = i & 1;
            int i8 = 1;
            C13863l c13863l2 = C1867l.yandex;
            if (i7 == 0 || c6956l.ad()) {
                Object objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == c13863l2) {
                    objM2132native2 = new C1712l(i4);
                    c6956l.m2147try(objM2132native2);
                }
                function3 = (Function0) objM2132native2;
                long j9 = ((C9735l) c6956l.isPro(AbstractC1017l.yandex)).yandex;
                long jLoadAd4 = C9735l.loadAd(0.4f, j9);
                C10707l c10707l = AbstractC10689l.yandex;
                long j10 = ((C9735l) ((C10936l) c6956l.isPro(c10707l)).amazon.getValue()).yandex;
                long jIsPro = ((C10936l) c6956l.isPro(c10707l)).isPro();
                C11971l c11971l4 = new C11971l(j9, jLoadAd4, j10, jIsPro, jIsPro, j9, C9735l.loadAd(0.4f, j9), j10);
                i3 = i6 & (-3670017);
                z4 = true;
                c11971l3 = c11971l4;
            } else {
                c6956l.m2124else();
                function3 = function1;
                z4 = z2;
                i3 = i6 & (-3670017);
                c11971l3 = c11971l;
            }
            c6956l.adcel();
            boolean z7 = (i3 & 896) == 256;
            Object objM2132native3 = c6956l.m2132native();
            if (z7) {
                c13863l = c13863l2;
            } else {
                c13863l = c13863l2;
                if (objM2132native3 == c13863l) {
                }
                InterfaceC17242l interfaceC17242lVip = AbstractC8576l.vip(interfaceC17242l, (Function1) objM2132native3);
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objM2132native = c6956l.m2132native();
                if (z5 || objM2132native == c13863l) {
                    objM2132native = new C13816l(z, 5);
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242lVip, false, (Function1) objM2132native);
                z6 = c3809l.yandex;
                int i9 = i3 >> 18;
                int i10 = i3 >> 9;
                if (z6) {
                    jYandex = c11971l3.yandex;
                } else {
                    jYandex = c11971l3.loadAd;
                }
                if (z4) {
                    j = c11971l3.crashlytics;
                } else {
                    j = c11971l3.admob;
                }
                j2 = j;
                j3 = c11971l3.amazon;
                j4 = c11971l3.purchase;
                if (z6) {
                    j5 = c11971l3.billing;
                } else {
                    j5 = c11971l3.mopub;
                }
                j6 = C9735l.isPro;
                if ((8224 & 1) != 0) {
                    jSubs = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).subs();
                } else {
                    jSubs = j6;
                }
                if ((8224 & 2) != 0) {
                    jYandex = AbstractC10689l.yandex(jSubs, c6956l);
                }
                long j11 = jYandex;
                if ((8224 & 4) != 0) {
                    jAmazon = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).amazon();
                } else {
                    jAmazon = j6;
                }
                if ((8224 & 8) != 0) {
                    jYandex2 = AbstractC10689l.yandex(jAmazon, c6956l);
                } else {
                    jYandex2 = j3;
                }
                long j12 = jSubs;
                if ((8224 & 16) != 0) {
                    j7 = jAmazon;
                } else {
                    j7 = j6;
                }
                long jYandex3 = AbstractC10689l.yandex(j7, c6956l);
                if ((8224 & 64) != 0) {
                    jLoadAd = C9735l.loadAd(0.5f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).amazon());
                } else {
                    jLoadAd = j6;
                }
                if ((128 & 8224) != 0) {
                    jCrashlytics = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).crashlytics();
                } else {
                    jCrashlytics = j2;
                }
                if ((256 & 8224) != 0) {
                    jLoadAd2 = C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).isPro());
                } else {
                    jLoadAd2 = j6;
                }
                c = 8224;
                if ((8224 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    jPurchase = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).purchase();
                } else {
                    jPurchase = j5;
                }
                if ((1024 & 8224) != 0) {
                    jLoadAd3 = C9735l.loadAd(0.5f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).amazon());
                    c = 8224;
                } else {
                    jLoadAd3 = j6;
                }
                if ((2048 & c) != 0) {
                    jCrashlytics2 = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).crashlytics();
                } else {
                    jCrashlytics2 = j4;
                }
                if ((c & 4096) != 0) {
                    j8 = jLoadAd3;
                } else {
                    j8 = j6;
                }
                C7307l c7307l = new C7307l(j12, j11, jAmazon, jYandex2, j7, jYandex3, jLoadAd, jCrashlytics, jLoadAd2, jPurchase, jLoadAd3, jCrashlytics2, j8, jCrashlytics2);
                if ((1022 & 1) != 0) {
                    interfaceC6347l = ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).crashlytics;
                } else {
                    interfaceC6347l = AbstractC16837l.yandex;
                }
                InterfaceC6347l interfaceC6347l2 = interfaceC6347l;
                Function0 function4 = function3;
                C11971l c11971l5 = c11971l3;
                AbstractC16291l.amazon(z, function4, interfaceC17242lYandex, z4, new C12331l(interfaceC6347l2, interfaceC6347l2, interfaceC6347l2, interfaceC6347l2, interfaceC6347l2, interfaceC6347l2, interfaceC6347l2, interfaceC6347l2, interfaceC6347l2, interfaceC6347l2), c7307l, C11001l.crashlytics, null, null, AbstractC14566l.amazon(-3317309, new C16524l(c15578l, i8), c6956l), c6956l, ((i3 >> 3) & 14) | 100663296 | (i10 & 112) | ((i3 >> 6) & 7168), (i9 & 112) | 384, 1584);
                z3 = z4;
                c11971l2 = c11971l5;
                function2 = function4;
            }
            objM2132native3 = new C6199l(15, function0);
            c6956l.m2147try(objM2132native3);
            InterfaceC17242l interfaceC17242lVip2 = AbstractC8576l.vip(interfaceC17242l, (Function1) objM2132native3);
            if ((i3 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objM2132native = c6956l.m2132native();
            if (z5) {
                objM2132native = new C13816l(z, 5);
                c6956l.m2147try(objM2132native);
            } else {
                objM2132native = new C13816l(z, 5);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC4962l.yandex(interfaceC17242lVip2, false, (Function1) objM2132native);
            z6 = c3809l.yandex;
            int i11 = i3 >> 18;
            int i12 = i3 >> 9;
            if (z6) {
                jYandex = c11971l3.yandex;
            } else {
                jYandex = c11971l3.loadAd;
            }
            if (z4) {
                j = c11971l3.crashlytics;
            } else {
                j = c11971l3.admob;
            }
            j2 = j;
            j3 = c11971l3.amazon;
            j4 = c11971l3.purchase;
            if (z6) {
                j5 = c11971l3.billing;
            } else {
                j5 = c11971l3.mopub;
            }
            j6 = C9735l.isPro;
            if ((8224 & 1) != 0) {
                jSubs = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).subs();
            } else {
                jSubs = j6;
            }
            if ((8224 & 2) != 0) {
                jYandex = AbstractC10689l.yandex(jSubs, c6956l);
            }
            long j13 = jYandex;
            if ((8224 & 4) != 0) {
                jAmazon = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).amazon();
            } else {
                jAmazon = j6;
            }
            if ((8224 & 8) != 0) {
                jYandex2 = AbstractC10689l.yandex(jAmazon, c6956l);
            } else {
                jYandex2 = j3;
            }
            long j14 = jSubs;
            if ((8224 & 16) != 0) {
                j7 = jAmazon;
            } else {
                j7 = j6;
            }
            long jYandex4 = AbstractC10689l.yandex(j7, c6956l);
            if ((8224 & 64) != 0) {
                jLoadAd = C9735l.loadAd(0.5f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).amazon());
            } else {
                jLoadAd = j6;
            }
            if ((128 & 8224) != 0) {
                jCrashlytics = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).crashlytics();
            } else {
                jCrashlytics = j2;
            }
            if ((256 & 8224) != 0) {
                jLoadAd2 = C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).isPro());
            } else {
                jLoadAd2 = j6;
            }
            c = 8224;
            if ((8224 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                jPurchase = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).purchase();
            } else {
                jPurchase = j5;
            }
            if ((1024 & 8224) != 0) {
                jLoadAd3 = C9735l.loadAd(0.5f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).amazon());
                c = 8224;
            } else {
                jLoadAd3 = j6;
            }
            if ((2048 & c) != 0) {
                jCrashlytics2 = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).crashlytics();
            } else {
                jCrashlytics2 = j4;
            }
            if ((c & 4096) != 0) {
                j8 = jLoadAd3;
            } else {
                j8 = j6;
            }
            C7307l c7307l2 = new C7307l(j14, j13, jAmazon, jYandex2, j7, jYandex4, jLoadAd, jCrashlytics, jLoadAd2, jPurchase, jLoadAd3, jCrashlytics2, j8, jCrashlytics2);
            if ((1022 & 1) != 0) {
                interfaceC6347l = ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).crashlytics;
            } else {
                interfaceC6347l = AbstractC16837l.yandex;
            }
            InterfaceC6347l interfaceC6347l3 = interfaceC6347l;
            Function0 function5 = function3;
            C11971l c11971l6 = c11971l3;
            AbstractC16291l.amazon(z, function5, interfaceC17242lYandex2, z4, new C12331l(interfaceC6347l3, interfaceC6347l3, interfaceC6347l3, interfaceC6347l3, interfaceC6347l3, interfaceC6347l3, interfaceC6347l3, interfaceC6347l3, interfaceC6347l3, interfaceC6347l3), c7307l2, C11001l.crashlytics, null, null, AbstractC14566l.amazon(-3317309, new C16524l(c15578l, i8), c6956l), c6956l, ((i3 >> 3) & 14) | 100663296 | (i12 & 112) | ((i3 >> 6) & 7168), (i11 & 112) | 384, 1584);
            z3 = z4;
            c11971l2 = c11971l6;
            function2 = function5;
        } else {
            c6956l.m2124else();
            function2 = function1;
            z3 = z2;
            c11971l2 = c11971l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8017l(c3809l, z, function0, interfaceC17242l, function2, z3, c11971l2, c15578l, i);
        }
    }
}
