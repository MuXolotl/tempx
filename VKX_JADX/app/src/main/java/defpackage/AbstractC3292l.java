package defpackage;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3292l {
    public static final C15578l yandex = new C15578l(573934858, false, new C5142l(5));
    public static final C15578l loadAd = new C15578l(1597553195, false, new C5142l(6));

    public static int Signature(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = (((long) iArr3[i]) & 4294967295L) + (j10 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = (j10 * j2) + (((long) iArr3[i2]) & 4294967295L) + (j11 >>> 32);
            iArr3[i2] = (int) j12;
            int i3 = i + 2;
            long j13 = (j10 * j3) + (((long) iArr3[i3]) & 4294967295L) + (j12 >>> 32);
            int i4 = i;
            iArr3[i3] = (int) j13;
            int i5 = i4 + 3;
            long j14 = (j10 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j13 >>> 32);
            iArr3[i5] = (int) j14;
            int i6 = i4 + 4;
            long j15 = (j10 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j14 >>> 32);
            iArr3[i6] = (int) j15;
            int i7 = i4 + 5;
            long j16 = (j10 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j15 >>> 32);
            iArr3[i7] = (int) j16;
            int i8 = i4 + 6;
            long j17 = (j10 * j9) + (((long) iArr3[i8]) & 4294967295L) + (j16 >>> 32);
            iArr3[i8] = (int) j17;
            int i9 = i4 + 7;
            long j18 = (j17 >>> 32) + (((long) iArr3[i9]) & 4294967295L) + j8;
            iArr3[i9] = (int) j18;
            j8 = j18 >>> 32;
            i = i2;
            j7 = j9;
        }
        return (int) j8;
    }

    public static void ad(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
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
        long j6 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        iArr3[6] = (int) (((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L)) + (j6 >> 32));
    }

    public static boolean adcel(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    public static void admob(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
    }

    public static boolean ads(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger advert(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC10000l.isPro(i2, (6 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int amazon(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int billing(int i, int i2, int[] iArr, int[] iArr2, int i3) {
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
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (4294967295L & ((long) iArr2[i9])) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static final boolean crashlytics(C18666l c18666l, Resources resources) {
        Object objMopub = c18666l.amazon.f13225l.mopub(AbstractC0424l.yandex);
        if (objMopub == null) {
            objMopub = null;
        }
        List list = (List) objMopub;
        return !AbstractC14425l.isPro(c18666l) && (c18666l.amazon.f13223l || (c18666l.adcel() && ((list != null ? (String) AbstractC16901l.m4217extends(list) : null) != null || startapp(c18666l) != null || metrica(c18666l, resources) != null || vip(c18666l))));
    }

    public static boolean firebase(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 6;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[7 + i] + RecyclerView.UNDEFINED_DURATION;
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
            ad(iArr, 7, iArr2, 0, iArr3);
            return z;
        }
        ad(iArr2, 0, iArr, 7, iArr3);
        return z;
    }

    public static void license(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
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
                long j34 = jRemoteconfig8 & 4294967295L;
                long jRemoteconfig10 = AbstractC0653l.remoteconfig(j28, j21, jRemoteconfig9 >>> 32, j32);
                long j35 = j31 + (jRemoteconfig10 >>> 32);
                long j36 = jRemoteconfig10 & 4294967295L;
                long j37 = ((long) iArr[6]) & 4294967295L;
                long j38 = (((long) iArr2[11]) & 4294967295L) + (j35 >>> 32);
                long j39 = j35 & 4294967295L;
                long j40 = (((long) iArr2[12]) & 4294967295L) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = (j37 * j) + (jRemoteconfig7 & 4294967295L);
                int i14 = (int) j42;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long jRemoteconfig11 = AbstractC0653l.remoteconfig(j37, j6, j42 >>> 32, j34);
                long jRemoteconfig12 = AbstractC0653l.remoteconfig(j37, j9, jRemoteconfig11 >>> 32, jRemoteconfig9 & 4294967295L);
                long jRemoteconfig13 = AbstractC0653l.remoteconfig(j37, j14, jRemoteconfig12 >>> 32, j36);
                long jRemoteconfig14 = AbstractC0653l.remoteconfig(j37, j21, jRemoteconfig13 >>> 32, j39);
                long jRemoteconfig15 = AbstractC0653l.remoteconfig(j37, j28, jRemoteconfig14 >>> 32, j41);
                long j43 = j40 + (jRemoteconfig15 >>> 32);
                int i16 = (int) jRemoteconfig11;
                iArr2[7] = (i16 << 1) | i15;
                int i17 = (int) jRemoteconfig12;
                iArr2[8] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jRemoteconfig13;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) jRemoteconfig14;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) jRemoteconfig15;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j43;
                iArr2[12] = i24 | (i25 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j43 >>> 32))) << 1) | (i25 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static final boolean loadAd(C18666l c18666l) {
        return !c18666l.firebase().f13225l.crashlytics(AbstractC0424l.isPro);
    }

    public static final String metrica(C18666l c18666l, Resources resources) {
        int iPurchase;
        C6264l c6264l = c18666l.amazon;
        C6264l c6264l2 = c18666l.amazon;
        Object objMopub = c6264l.f13225l.mopub(AbstractC0424l.loadAd);
        String string = null;
        if (objMopub == null) {
            objMopub = null;
        }
        C13660l c13660l = c6264l2.f13225l;
        Object objMopub2 = c13660l.mopub(AbstractC0424l.f1546private);
        if (objMopub2 == null) {
            objMopub2 = null;
        }
        EnumC13846l enumC13846l = (EnumC13846l) objMopub2;
        Object objMopub3 = c13660l.mopub(AbstractC0424l.isVip);
        if (objMopub3 == null) {
            objMopub3 = null;
        }
        C6402l c6402l = (C6402l) objMopub3;
        if (enumC13846l != null) {
            int iOrdinal = enumC13846l.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    if (objMopub == null) {
                        objMopub = resources.getString(R.string.indeterminate);
                    }
                } else if (c6402l != null && c6402l.yandex == 2 && objMopub == null) {
                    objMopub = resources.getString(R.string.state_off);
                }
            } else if (c6402l != null && c6402l.yandex == 2 && objMopub == null) {
                objMopub = resources.getString(R.string.state_on);
            }
        }
        Object objMopub4 = c13660l.mopub(AbstractC0424l.f1544native);
        if (objMopub4 == null) {
            objMopub4 = null;
        }
        Boolean bool = (Boolean) objMopub4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c6402l == null || c6402l.yandex != 4) && objMopub == null) {
                objMopub = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objMopub5 = c13660l.mopub(AbstractC0424l.crashlytics);
        if (objMopub5 == null) {
            objMopub5 = null;
        }
        C14519l c14519l = (C14519l) objMopub5;
        if (c14519l != null) {
            if (c14519l != C14519l.amazon) {
                if (objMopub == null) {
                    C12015l c12015l = c14519l.loadAd;
                    float f = c12015l.loadAd;
                    float f2 = c12015l.yandex;
                    float f3 = f - f2 == 0.0f ? 0.0f : (c14519l.yandex - f2) / (c12015l.loadAd - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        iPurchase = 0;
                    } else {
                        iPurchase = f3 == 1.0f ? 100 : AbstractC8576l.purchase(Math.round(f3 * 100.0f), 1, 99);
                    }
                    objMopub = resources.getString(R.string.template_percent, Integer.valueOf(iPurchase));
                }
            } else if (objMopub == null) {
                objMopub = resources.getString(R.string.in_progress);
            }
        }
        C4707l c4707l = AbstractC0424l.f1545package;
        if (c13660l.crashlytics(c4707l)) {
            C13660l c13660l2 = new C18666l(c18666l.yandex, true, c18666l.crashlytics, c6264l2).firebase().f13225l;
            Object objMopub6 = c13660l2.mopub(AbstractC0424l.yandex);
            if (objMopub6 == null) {
                objMopub6 = null;
            }
            Collection collection = (Collection) objMopub6;
            if (collection == null || collection.isEmpty()) {
                Object objMopub7 = c13660l2.mopub(AbstractC0424l.applovin);
                if (objMopub7 == null) {
                    objMopub7 = null;
                }
                Collection collection2 = (Collection) objMopub7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objMopub8 = c13660l2.mopub(c4707l);
                    if (objMopub8 == null) {
                        objMopub8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objMopub8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objMopub = string;
        }
        return (String) objMopub;
    }

    public static int mopub(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L);
        int i = (int) j;
        iArr[7] = i;
        iArr2[14] = i;
        long j2 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[8] = i2;
        iArr2[15] = i2;
        long j3 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[9] = i3;
        iArr2[16] = i3;
        long j4 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[10] = i4;
        iArr2[17] = i4;
        long j5 = (((long) iArr[11]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[11] = i5;
        iArr2[18] = i5;
        long j6 = (((long) iArr[12]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[12] = i6;
        iArr2[19] = i6;
        long j7 = (((long) iArr[13]) & 4294967295L) + (4294967295L & ((long) iArr2[20])) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[13] = i7;
        iArr2[20] = i7;
        return (int) (j7 >>> 32);
    }

    public static int pro(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int purchase(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int remoteconfig(int[] iArr) {
        return iArr[0] & 1;
    }

    public static int[] smaato(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            C11983l.crashlytics();
            return null;
        }
        int[] iArr = new int[7];
        for (int i = 0; i < 7; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static final C3625l startapp(C18666l c18666l) {
        Object objMopub = c18666l.amazon.f13225l.mopub(AbstractC0424l.f1545package);
        if (objMopub == null) {
            objMopub = null;
        }
        C3625l c3625l = (C3625l) objMopub;
        Object objMopub2 = c18666l.amazon.f13225l.mopub(AbstractC0424l.applovin);
        if (objMopub2 == null) {
            objMopub2 = null;
        }
        List list = (List) objMopub2;
        return c3625l == null ? list != null ? (C3625l) AbstractC16901l.m4217extends(list) : null : c3625l;
    }

    public static void subs(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean subscription(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void tapsense(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        char c = ' ';
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = ((long) iArr[i]) & 4294967295L;
            char c2 = c;
            long j17 = j7;
            long j18 = (j16 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j18;
            long j19 = j18 >>> c2;
            long j20 = j16 * j2;
            int i3 = i + 1;
            long j21 = j20 + (((long) iArr3[i3]) & 4294967295L) + j19;
            iArr3[i3] = (int) j21;
            int i4 = i + 2;
            long j22 = (j16 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j21 >>> c2);
            iArr3[i4] = (int) j22;
            int i5 = i + 3;
            long j23 = (j16 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j22 >>> c2);
            iArr3[i5] = (int) j23;
            int i6 = i + 4;
            long j24 = (j16 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j23 >>> c2);
            iArr3[i6] = (int) j24;
            int i7 = i + 5;
            long j25 = (j16 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j24 >>> c2);
            iArr3[i7] = (int) j25;
            int i8 = i + 6;
            long j26 = (j16 * j17) + (((long) iArr3[i8]) & 4294967295L) + (j25 >>> c2);
            iArr3[i8] = (int) j26;
            iArr3[i + 7] = (int) (j26 >>> c2);
            c = c2;
            i = i3;
            j7 = j17;
        }
    }

    public static final boolean vip(C18666l c18666l) {
        Object objMopub = c18666l.amazon.f13225l.mopub(AbstractC0424l.f1546private);
        if (objMopub == null) {
            objMopub = null;
        }
        EnumC13846l enumC13846l = (EnumC13846l) objMopub;
        C13660l c13660l = c18666l.amazon.f13225l;
        Object objMopub2 = c13660l.mopub(AbstractC0424l.isVip);
        if (objMopub2 == null) {
            objMopub2 = null;
        }
        C6402l c6402l = (C6402l) objMopub2;
        boolean z = enumC13846l != null;
        Object objMopub3 = c13660l.mopub(AbstractC0424l.f1544native);
        if (((Boolean) (objMopub3 != null ? objMopub3 : null)) == null || (c6402l != null && c6402l.yandex == 4)) {
            return z;
        }
        return true;
    }

    public static final void yandex(final int i, final InterfaceC17242l interfaceC17242l, final long j, long j2, Function2 function2, Function4 function4, final C15578l c15578l, C6956l c6956l, final int i2) {
        int i3;
        long j3;
        final long j4;
        final Function2 function3;
        final Function4 function5;
        long jPurchase;
        Function4 function4Amazon;
        int i4;
        Function2 function6;
        c6956l.m2133new(590005957);
        if ((i2 & 6) == 0) {
            i3 = (c6956l.amazon(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j3 = j;
            i3 |= c6956l.purchase(j3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        int i5 = i3 | 221184;
        if ((1572864 & i2) == 0) {
            i5 |= c6956l.admob(c15578l) ? 1048576 : 524288;
        }
        if (c6956l.m2127for(i5 & 1, (599187 & i5) != 599186)) {
            c6956l.m2141switch();
            if ((i2 & 1) == 0 || c6956l.ad()) {
                C15801l c15801l = C15801l.yandex;
                jPurchase = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).purchase();
                function4Amazon = AbstractC14566l.amazon(20261614, new Function4() { // from class: lًٖۜ
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        C6956l c6956l2 = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        C7849l c7849l = (C7849l) AbstractC16901l.m4220for(i, (List) obj);
                        if (c7849l == null) {
                            c6956l2.m2123default(-1976546706);
                            c6956l2.startapp(false);
                        } else {
                            c6956l2.m2123default(-1976546705);
                            C15801l.yandex.yandex(c7849l, zBooleanValue, null, 0L, 0L, c6956l2, (iIntValue & 112) | 196608);
                            c6956l2.startapp(false);
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l);
                i4 = i5 & (-7169);
                function6 = AbstractC9092l.yandex;
            } else {
                c6956l.m2124else();
                jPurchase = j2;
                function4Amazon = function4;
                i4 = i5 & (-7169);
                function6 = function2;
            }
            c6956l.adcel();
            C11194l c11194lCrashlytics = AbstractC13841l.crashlytics(c6956l);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            Function2 function7 = function6;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0019l.amazon(interfaceC17242l), c11194lCrashlytics, false);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C17660l(interfaceC8714l, 2);
                c6956l.m2147try(objM2132native2);
            }
            long j5 = jPurchase;
            AbstractC16291l.crashlytics(AbstractC4962l.yandex(AbstractC8576l.vip(interfaceC17242lPurchase, (Function1) objM2132native2), false, new C10557l(21)), AbstractC16837l.yandex, AbstractC8209l.yandex(j3, j5, c6956l, ((i4 >> 6) & 14) | 384, 0), AbstractC14566l.amazon(1744705866, new C11223l((Object) function7, (Object) function4Amazon, interfaceC8714l, (Object) c15578l, 25), c6956l), c6956l, 50);
            function3 = function7;
            function5 = function4Amazon;
            j4 = j5;
        } else {
            c6956l.m2124else();
            j4 = j2;
            function3 = function2;
            function5 = function4;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؕؒٛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC3292l.yandex(i, interfaceC17242l, j, j4, function3, function5, c15578l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
