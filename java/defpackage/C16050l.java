package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕۥٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16050l {
    public final /* synthetic */ int yandex;
    public static final C15578l loadAd = new C15578l(985783600, false, new C5142l(2));
    public static final C15578l crashlytics = new C15578l(-1122204817, false, new C5142l(3));
    public static final C15578l amazon = new C15578l(190765633, false, new C5142l(4));

    public static final long adcel(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC8177l.yandex;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lPremium = AbstractC16648l.premium(property);
        if (lPremium == null) {
            C1759l.vip("System property '", str, "' has unrecognized value '", property, 39);
            return 0L;
        }
        long jLongValue = lPremium.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static boolean admob(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
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

    public static int ads(int i, int i2, String str) {
        return (int) adcel(str, i, 1L, (i2 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150);
    }

    public static void amazon(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
    }

    public static int[] billing(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            C11983l.crashlytics();
            return null;
        }
        int[] iArr = new int[5];
        for (int i = 0; i < 5; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static boolean firebase(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPro(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    public static int metrica(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >> 32);
    }

    public static int mopub(int[] iArr) {
        return iArr[0] & 1;
    }

    public static boolean purchase(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int remoteconfig(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = 0;
        while (i < 5) {
            long j8 = j;
            long j9 = ((long) iArr[i]) & j8;
            int i2 = i;
            long j10 = (j9 * j2) + (((long) iArr3[i]) & j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j3) + (((long) iArr3[i3]) & j8) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            int i4 = i2 + 2;
            long j12 = (j9 * j4) + (((long) iArr3[i4]) & j8) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i2 + 3;
            long j13 = (j9 * j5) + (((long) iArr3[i5]) & j8) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i2 + 4;
            long j14 = (j9 * j6) + (((long) iArr3[i6]) & j8) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i2 + 5;
            long j15 = (j14 >>> 32) + (((long) iArr3[i7]) & j8) + j7;
            iArr3[i7] = (int) j15;
            j7 = j15 >>> 32;
            j = j8;
            j2 = j2;
            i = i3;
        }
        return (int) j7;
    }

    public static void smaato(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = j6 * j;
        iArr3[0] = (int) j7;
        char c = ' ';
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j3);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j4);
        iArr3[3] = (int) j10;
        long j11 = (j6 * j5) + (j10 >>> 32);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        int i = 1;
        for (int i2 = 5; i < i2; i2 = 5) {
            long j12 = ((long) iArr[i]) & 4294967295L;
            int i3 = i;
            long j13 = (j12 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i3] = (int) j13;
            long j14 = j13 >>> c;
            long j15 = j12 * j2;
            int i4 = i3 + 1;
            char c2 = c;
            long j16 = j15 + (((long) iArr3[i4]) & 4294967295L) + j14;
            iArr3[i4] = (int) j16;
            int i5 = i3 + 2;
            long j17 = (j12 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j16 >>> c2);
            iArr3[i5] = (int) j17;
            int i6 = i3 + 3;
            long j18 = (j12 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j17 >>> c2);
            iArr3[i6] = (int) j18;
            long j19 = j18 >>> c2;
            int i7 = i3 + 4;
            long j20 = (j12 * j5) + (((long) iArr3[i7]) & 4294967295L) + j19;
            iArr3[i7] = (int) j20;
            iArr3[i3 + 5] = (int) (j20 >>> c2);
            i = i4;
            c = c2;
        }
    }

    public static void startapp(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        iArr2[4] = (int) (((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4]))) + (j4 >> 32));
    }

    public static BigInteger subscription(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC10000l.isPro(i2, (4 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void vip(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
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
                long j25 = (j21 * j) + (jRemoteconfig2 & 4294967295L);
                int i10 = (int) j25;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long jRemoteconfig4 = AbstractC0653l.remoteconfig(j21, j6, j25 >>> 32, jRemoteconfig3 & 4294967295L);
                long jRemoteconfig5 = AbstractC0653l.remoteconfig(j21, j9, jRemoteconfig4 >>> 32, j23);
                long jRemoteconfig6 = AbstractC0653l.remoteconfig(j21, j14, jRemoteconfig5 >>> 32, j22 & 4294967295L);
                long j26 = j24 + (jRemoteconfig6 >>> 32);
                int i12 = (int) jRemoteconfig4;
                iArr2[5] = (i12 << 1) | i11;
                int i13 = (int) jRemoteconfig5;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) jRemoteconfig6;
                iArr2[7] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j26;
                iArr2[8] = i16 | (i17 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j26 >>> 32))) << 1) | (i17 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int yandex(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    public final void crashlytics(InterfaceC14742l interfaceC14742l, Object obj) throws IOException {
        int i;
        int i2;
        int[] iArrM4222implements;
        int[] iArrM4222implements2;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.yandex) {
            case 0:
                C1044l c1044l = (C1044l) obj;
                interfaceC14742l.mo824final(1, c1044l.yandex);
                interfaceC14742l.mo824final(2, c1044l.loadAd);
                return;
            case 1:
                C9046l c9046l = (C9046l) obj;
                interfaceC14742l.mo824final(1, c9046l.yandex);
                interfaceC14742l.firebase(2, c9046l.loadAd.longValue());
                return;
            case 2:
                C11059l c11059l = (C11059l) obj;
                interfaceC14742l.mo824final(1, c11059l.yandex);
                interfaceC14742l.firebase(2, c11059l.loadAd);
                interfaceC14742l.firebase(3, c11059l.crashlytics);
                return;
            case 3:
                C17063l c17063l = (C17063l) obj;
                interfaceC14742l.mo824final(1, c17063l.yandex);
                interfaceC14742l.mo824final(2, c17063l.loadAd);
                return;
            case 4:
                C7718l c7718l = (C7718l) obj;
                interfaceC14742l.mo824final(1, c7718l.yandex);
                interfaceC14742l.firebase(2, AbstractC11748l.smaato(c7718l.loadAd));
                interfaceC14742l.mo824final(3, c7718l.crashlytics);
                interfaceC14742l.mo824final(4, c7718l.amazon);
                C4279l c4279l = C4279l.loadAd;
                interfaceC14742l.smaato(5, AbstractC7280l.admob(c7718l.purchase));
                interfaceC14742l.smaato(6, AbstractC7280l.admob(c7718l.billing));
                interfaceC14742l.firebase(7, c7718l.mopub);
                interfaceC14742l.firebase(8, c7718l.admob);
                interfaceC14742l.firebase(9, c7718l.subs);
                interfaceC14742l.firebase(10, c7718l.firebase);
                int iInmobi = AbstractC5020l.inmobi(c7718l.smaato);
                if (iInmobi == 0) {
                    i = 0;
                } else {
                    if (iInmobi != 1) {
                        C18725l.billing();
                        return;
                    }
                    i = 1;
                }
                interfaceC14742l.firebase(11, i);
                interfaceC14742l.firebase(12, c7718l.remoteconfig);
                interfaceC14742l.firebase(13, c7718l.vip);
                interfaceC14742l.firebase(14, c7718l.metrica);
                interfaceC14742l.firebase(15, c7718l.startapp);
                interfaceC14742l.firebase(16, c7718l.adcel ? 1L : 0L);
                int iInmobi2 = AbstractC5020l.inmobi(c7718l.ads);
                if (iInmobi2 == 0) {
                    i2 = 0;
                } else {
                    if (iInmobi2 != 1) {
                        C18725l.billing();
                        return;
                    }
                    i2 = 1;
                }
                interfaceC14742l.firebase(17, i2);
                interfaceC14742l.firebase(18, c7718l.subscription);
                interfaceC14742l.firebase(19, c7718l.tapsense);
                interfaceC14742l.firebase(20, c7718l.Signature);
                interfaceC14742l.firebase(21, c7718l.license);
                interfaceC14742l.firebase(22, c7718l.pro);
                String str = c7718l.ad;
                if (str == null) {
                    interfaceC14742l.metrica(23);
                } else {
                    interfaceC14742l.mo824final(23, str);
                }
                Boolean bool = c7718l.advert;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    interfaceC14742l.metrica(24);
                } else {
                    interfaceC14742l.firebase(24, numValueOf.intValue());
                }
                C13152l c13152l = c7718l.isPro;
                int i4 = c13152l.yandex;
                int iInmobi3 = AbstractC5020l.inmobi(i4);
                if (iInmobi3 == 0) {
                    i3 = 0;
                } else if (iInmobi3 == 1) {
                    i3 = 1;
                } else if (iInmobi3 == 2) {
                    i3 = 2;
                } else if (iInmobi3 != 3) {
                    if (iInmobi3 == 4) {
                        i3 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                            C4875l.smaato(AbstractC15560l.advert(i4), " to int", "Could not convert ");
                            return;
                        }
                        i3 = 5;
                    }
                }
                interfaceC14742l.firebase(25, i3);
                C8891l c8891l = c13152l.loadAd;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) c8891l.yandex;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i5 >= 31) {
                                    iArrM4222implements = AbstractC12148l.m3361extends(networkRequest);
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i6 = 0; i6 < 10; i6++) {
                                        int i7 = iArr[i6];
                                        if (AbstractC13950l.m3808extends(networkRequest, i7)) {
                                            arrayList.add(Integer.valueOf(i7));
                                        }
                                    }
                                    iArrM4222implements = AbstractC16901l.m4222implements(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrM4222implements2 = AbstractC12148l.loadAd(networkRequest);
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i8 = 0; i8 < 30; i8++) {
                                        int i9 = iArr2[i8];
                                        if (AbstractC13950l.m3819private(networkRequest, i9)) {
                                            arrayList2.add(Integer.valueOf(i9));
                                        }
                                    }
                                    iArrM4222implements2 = AbstractC16901l.m4222implements(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrM4222implements.length);
                                for (int i10 : iArrM4222implements) {
                                    objectOutputStream.writeInt(i10);
                                }
                                objectOutputStream.writeInt(iArrM4222implements2.length);
                                for (int i11 : iArrM4222implements2) {
                                    objectOutputStream.writeInt(i11);
                                }
                                Unit unit = Unit.INSTANCE;
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC7876l.loadAd(objectOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC7876l.loadAd(byteArrayOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                interfaceC14742l.smaato(26, byteArray);
                interfaceC14742l.firebase(27, c13152l.crashlytics ? 1L : 0L);
                interfaceC14742l.firebase(28, c13152l.amazon ? 1L : 0L);
                interfaceC14742l.firebase(29, c13152l.purchase ? 1L : 0L);
                interfaceC14742l.firebase(30, c13152l.billing ? 1L : 0L);
                interfaceC14742l.firebase(31, c13152l.mopub);
                interfaceC14742l.firebase(32, c13152l.admob);
                Set<C0047l> set = c13152l.subs;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (C0047l c0047l : set) {
                                objectOutputStream2.writeUTF(c0047l.yandex.toString());
                                objectOutputStream2.writeBoolean(c0047l.loadAd);
                            }
                            Unit unit2 = Unit.INSTANCE;
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC7876l.loadAd(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            AbstractC7876l.loadAd(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                interfaceC14742l.smaato(33, byteArray2);
                return;
            default:
                C0854l c0854l = (C0854l) obj;
                interfaceC14742l.mo824final(1, c0854l.yandex);
                interfaceC14742l.mo824final(2, c0854l.loadAd);
                return;
        }
    }

    public void subs(InterfaceC0684l interfaceC0684l, Object obj) {
        String str;
        if (obj == null) {
            return;
        }
        switch (this.yandex) {
            case 0:
                str = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                break;
            case 1:
                str = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                break;
            case 2:
                str = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                break;
            case 3:
                str = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                break;
            case 4:
                str = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                break;
            default:
                str = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                break;
        }
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l(str);
        try {
            crashlytics(interfaceC14742lMo668l, obj);
            interfaceC14742lMo668l.mo827l();
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th);
                throw th2;
            }
        }
    }
}
