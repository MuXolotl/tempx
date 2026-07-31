package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؘ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5998l {
    public static final C15578l yandex = new C15578l(636288403, false, new C8323l(0));
    public static final C15578l loadAd = new C15578l(-1357803046, false, new C8323l(1));

    public static int Signature(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            int i2 = i;
            long j11 = (j10 * j) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j11;
            int i3 = i2 + 1;
            long j12 = (j10 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j11 >>> 32);
            iArr3[i3] = (int) j12;
            int i4 = i2 + 2;
            long j13 = (j10 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j12 >>> 32);
            iArr3[i4] = (int) j13;
            int i5 = i2 + 3;
            long j14 = (j10 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j13 >>> 32);
            iArr3[i5] = (int) j14;
            int i6 = i2 + 4;
            long j15 = (j10 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j14 >>> 32);
            iArr3[i6] = (int) j15;
            int i7 = i2 + 5;
            long j16 = (j10 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j15 >>> 32);
            iArr3[i7] = (int) j16;
            int i8 = i2 + 6;
            long j17 = (j10 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j16 >>> 32);
            iArr3[i8] = (int) j17;
            int i9 = i2 + 7;
            long j18 = (j10 * j8) + (((long) iArr3[i9]) & 4294967295L) + (j17 >>> 32);
            iArr3[i9] = (int) j18;
            int i10 = i2 + 8;
            long j19 = (j18 >>> 32) + (((long) iArr3[i10]) & 4294967295L) + j9;
            iArr3[i10] = (int) j19;
            j9 = j19 >>> 32;
            i = i3;
        }
        return (int) j9;
    }

    public static int ad(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static boolean adcel(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
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
        jArr2[i + 3] = jArr[3];
    }

    public static boolean ads(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void advert(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
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
        long j7 = ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        iArr3[7] = (int) (((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L)) + (j7 >> 32));
    }

    public static int amazon(int i, int i2, int[] iArr, int[] iArr2, int i3) {
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
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i10])) + (j7 >>> 32);
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean billing(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean firebase(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[8 + i] + RecyclerView.UNDEFINED_DURATION;
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
            advert(iArr, 8, iArr2, 0, iArr3);
            return z;
        }
        advert(iArr2, 0, iArr, 8, iArr3);
        return z;
    }

    public static void isVip(int[] iArr, int[] iArr2) {
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
        long j6 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        iArr2[7] = (int) (((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j7 >> 32));
    }

    public static C8139l license(InterfaceC0684l interfaceC0684l, String str) {
        Map mapCrashlytics;
        C4344l c4344l;
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (interfaceC14742lMo668l.mo827l()) {
                int iLoadAd = AbstractC8513l.loadAd(interfaceC14742lMo668l, "name");
                int iLoadAd2 = AbstractC8513l.loadAd(interfaceC14742lMo668l, "type");
                int iLoadAd3 = AbstractC8513l.loadAd(interfaceC14742lMo668l, "notnull");
                int iLoadAd4 = AbstractC8513l.loadAd(interfaceC14742lMo668l, "pk");
                int iLoadAd5 = AbstractC8513l.loadAd(interfaceC14742lMo668l, "dflt_value");
                C17963l c17963l = new C17963l();
                do {
                    String strMo826implements = interfaceC14742lMo668l.mo826implements(iLoadAd);
                    c17963l.put(strMo826implements, new C7057l((int) interfaceC14742lMo668l.getLong(iLoadAd4), 2, strMo826implements, interfaceC14742lMo668l.mo826implements(iLoadAd2), interfaceC14742lMo668l.isNull(iLoadAd5) ? null : interfaceC14742lMo668l.mo826implements(iLoadAd5), interfaceC14742lMo668l.getLong(iLoadAd3) != 0));
                } while (interfaceC14742lMo668l.mo827l());
                mapCrashlytics = c17963l.crashlytics();
                AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            } else {
                mapCrashlytics = C14054l.f27396l;
                AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            }
            InterfaceC14742l interfaceC14742lMo668l2 = interfaceC0684l.mo668l("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iLoadAd6 = AbstractC8513l.loadAd(interfaceC14742lMo668l2, "id");
                int iLoadAd7 = AbstractC8513l.loadAd(interfaceC14742lMo668l2, "seq");
                int iLoadAd8 = AbstractC8513l.loadAd(interfaceC14742lMo668l2, "table");
                int iLoadAd9 = AbstractC8513l.loadAd(interfaceC14742lMo668l2, "on_delete");
                int iLoadAd10 = AbstractC8513l.loadAd(interfaceC14742lMo668l2, "on_update");
                List listPurchase = AbstractC14879l.purchase(interfaceC14742lMo668l2);
                interfaceC14742lMo668l2.reset();
                C4344l c4344l2 = new C4344l();
                while (interfaceC14742lMo668l2.mo827l()) {
                    if (interfaceC14742lMo668l2.getLong(iLoadAd7) == j) {
                        int i = (int) interfaceC14742lMo668l2.getLong(iLoadAd6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iLoadAd6;
                        ArrayList<C18580l> arrayList3 = new ArrayList();
                        for (Object obj : listPurchase) {
                            int i3 = iLoadAd7;
                            List list = listPurchase;
                            if (((C18580l) obj).f36279l == i) {
                                arrayList3.add(obj);
                            }
                            iLoadAd7 = i3;
                            listPurchase = list;
                        }
                        int i4 = iLoadAd7;
                        List list2 = listPurchase;
                        for (C18580l c18580l : arrayList3) {
                            arrayList.add(c18580l.f36277l);
                            arrayList2.add(c18580l.f36280l);
                        }
                        c4344l2.add(new C7707l(interfaceC14742lMo668l2.mo826implements(iLoadAd8), interfaceC14742lMo668l2.mo826implements(iLoadAd9), interfaceC14742lMo668l2.mo826implements(iLoadAd10), arrayList, arrayList2));
                        iLoadAd6 = i2;
                        iLoadAd7 = i4;
                        listPurchase = list2;
                        j = 0;
                    }
                }
                C4344l c4344lYandex = AbstractC9905l.yandex(c4344l2);
                AbstractC1214l.yandex(interfaceC14742lMo668l2, null);
                InterfaceC14742l interfaceC14742lMo668l3 = interfaceC0684l.mo668l("PRAGMA index_list(`" + str + "`)");
                try {
                    int iLoadAd11 = AbstractC8513l.loadAd(interfaceC14742lMo668l3, "name");
                    int iLoadAd12 = AbstractC8513l.loadAd(interfaceC14742lMo668l3, "origin");
                    int iLoadAd13 = AbstractC8513l.loadAd(interfaceC14742lMo668l3, "unique");
                    if (iLoadAd11 == -1 || iLoadAd12 == -1 || iLoadAd13 == -1) {
                        AbstractC1214l.yandex(interfaceC14742lMo668l3, null);
                        c4344l = null;
                    } else {
                        C4344l c4344l3 = new C4344l();
                        while (interfaceC14742lMo668l3.mo827l()) {
                            if ("c".equals(interfaceC14742lMo668l3.mo826implements(iLoadAd12))) {
                                C14337l c14337lBilling = AbstractC14879l.billing(interfaceC0684l, interfaceC14742lMo668l3.mo826implements(iLoadAd11), interfaceC14742lMo668l3.getLong(iLoadAd13) == 1);
                                if (c14337lBilling == null) {
                                    AbstractC1214l.yandex(interfaceC14742lMo668l3, null);
                                    c4344l = null;
                                } else {
                                    c4344l3.add(c14337lBilling);
                                }
                            }
                        }
                        C4344l c4344lYandex2 = AbstractC9905l.yandex(c4344l3);
                        AbstractC1214l.yandex(interfaceC14742lMo668l3, null);
                        c4344l = c4344lYandex2;
                    }
                    return new C8139l(str, mapCrashlytics, c4344lYandex, c4344l);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1214l.yandex(interfaceC14742lMo668l3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC1214l.yandex(interfaceC14742lMo668l2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th5);
                throw th6;
            }
        }
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean metrica(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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

    public static void mopub(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
        iArr2[i + 7] = iArr[7];
    }

    public static BigInteger premium(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC10000l.Signature(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void pro(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
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
                long j21 = jRemoteconfig3 & 4294967295L;
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32);
                long j25 = j23 & 4294967295L;
                long j26 = (j22 * j) + (jRemoteconfig2 & 4294967295L);
                int i10 = (int) j26;
                iArr2[4] = i9 | (i10 << 1);
                long jRemoteconfig4 = AbstractC0653l.remoteconfig(j22, j6, j26 >>> 32, j21);
                long jRemoteconfig5 = AbstractC0653l.remoteconfig(j22, j9, jRemoteconfig4 >>> 32, j20 & 4294967295L);
                long jRemoteconfig6 = AbstractC0653l.remoteconfig(j22, j14, jRemoteconfig5 >>> 32, j25);
                long j27 = jRemoteconfig5 & 4294967295L;
                long j28 = j24 + (jRemoteconfig6 >>> 32);
                long j29 = jRemoteconfig6 & 4294967295L;
                long j30 = ((long) iArr[5]) & 4294967295L;
                long j31 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32);
                long j33 = (j30 * j) + (jRemoteconfig4 & 4294967295L);
                int i11 = (int) j33;
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long jRemoteconfig7 = AbstractC0653l.remoteconfig(j30, j6, j33 >>> 32, j27);
                long jRemoteconfig8 = AbstractC0653l.remoteconfig(j30, j9, jRemoteconfig7 >>> 32, j29);
                long jRemoteconfig9 = AbstractC0653l.remoteconfig(j30, j14, jRemoteconfig8 >>> 32, j28 & 4294967295L);
                long j34 = jRemoteconfig8 & 4294967295L;
                long jRemoteconfig10 = AbstractC0653l.remoteconfig(j30, j22, jRemoteconfig9 >>> 32, j31 & 4294967295L);
                long j35 = jRemoteconfig9 & 4294967295L;
                long j36 = j32 + (jRemoteconfig10 >>> 32);
                long j37 = ((long) iArr[6]) & 4294967295L;
                long j38 = (((long) iArr2[11]) & 4294967295L) + (j36 >>> 32);
                long j39 = (((long) iArr2[12]) & 4294967295L) + (j38 >>> 32);
                long j40 = (j37 * j) + (jRemoteconfig7 & 4294967295L);
                int i13 = (int) j40;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jRemoteconfig11 = AbstractC0653l.remoteconfig(j37, j6, j40 >>> 32, j34);
                long jRemoteconfig12 = AbstractC0653l.remoteconfig(j37, j9, jRemoteconfig11 >>> 32, j35);
                long jRemoteconfig13 = AbstractC0653l.remoteconfig(j37, j14, jRemoteconfig12 >>> 32, jRemoteconfig10 & 4294967295L);
                long j41 = jRemoteconfig12 & 4294967295L;
                long jRemoteconfig14 = AbstractC0653l.remoteconfig(j37, j22, jRemoteconfig13 >>> 32, j36 & 4294967295L);
                long j42 = jRemoteconfig13 & 4294967295L;
                long jRemoteconfig15 = AbstractC0653l.remoteconfig(j37, j30, jRemoteconfig14 >>> 32, j38 & 4294967295L);
                long j43 = j39 + (jRemoteconfig15 >>> 32);
                long j44 = ((long) iArr[7]) & 4294967295L;
                long j45 = (((long) iArr2[13]) & 4294967295L) + (j43 >>> 32);
                long j46 = (((long) iArr2[14]) & 4294967295L) + (j45 >>> 32);
                long j47 = j45 & 4294967295L;
                long j48 = (j44 * j) + (jRemoteconfig11 & 4294967295L);
                int i15 = (int) j48;
                iArr2[7] = (i15 << 1) | i14;
                int i16 = i15 >>> 31;
                long jRemoteconfig16 = AbstractC0653l.remoteconfig(j44, j6, j48 >>> 32, j41);
                long jRemoteconfig17 = AbstractC0653l.remoteconfig(j44, j9, jRemoteconfig16 >>> 32, j42);
                long jRemoteconfig18 = AbstractC0653l.remoteconfig(j44, j14, jRemoteconfig17 >>> 32, jRemoteconfig14 & 4294967295L);
                long jRemoteconfig19 = AbstractC0653l.remoteconfig(j44, j22, jRemoteconfig18 >>> 32, jRemoteconfig15 & 4294967295L);
                long jRemoteconfig20 = AbstractC0653l.remoteconfig(j44, j30, jRemoteconfig19 >>> 32, j43 & 4294967295L);
                long jRemoteconfig21 = AbstractC0653l.remoteconfig(j44, j37, jRemoteconfig20 >>> 32, j47);
                long j49 = j46 + (jRemoteconfig21 >>> 32);
                int i17 = (int) jRemoteconfig16;
                iArr2[8] = (i17 << 1) | i16;
                int i18 = (int) jRemoteconfig17;
                iArr2[9] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jRemoteconfig18;
                iArr2[10] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) jRemoteconfig19;
                iArr2[11] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) jRemoteconfig20;
                iArr2[12] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) jRemoteconfig21;
                iArr2[13] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j49;
                iArr2[14] = i27 | (i28 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j49 >>> 32))) << 1) | (i28 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int purchase(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L);
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) iArr2[23])) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static int[] remoteconfig(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            C11983l.crashlytics();
            return null;
        }
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static BigInteger signatures(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC10000l.isPro(i2, (7 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean smaato(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean startapp(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void subs(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean subscription(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
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
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j18 = ((long) iArr[i]) & 4294967295L;
            long j19 = (j18 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j19;
            int i3 = i + 1;
            long j20 = j5;
            long j21 = (j18 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j19 >>> 32);
            iArr3[i3] = (int) j21;
            int i4 = i + 2;
            long j22 = (j18 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j21 >>> 32);
            iArr3[i4] = (int) j22;
            int i5 = i + 3;
            long j23 = (j18 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j22 >>> 32);
            iArr3[i5] = (int) j23;
            int i6 = i + 4;
            long j24 = (j18 * j20) + (((long) iArr3[i6]) & 4294967295L) + (j23 >>> 32);
            iArr3[i6] = (int) j24;
            int i7 = i + 5;
            long j25 = (j18 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j24 >>> 32);
            iArr3[i7] = (int) j25;
            int i8 = i + 6;
            long j26 = (j18 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j25 >>> 32);
            iArr3[i8] = (int) j26;
            int i9 = i + 7;
            long j27 = (j18 * j8) + (((long) iArr3[i9]) & 4294967295L) + (j26 >>> 32);
            iArr3[i9] = (int) j27;
            iArr3[i + 8] = (int) (j27 >>> 32);
            i = i3;
            j5 = j20;
        }
    }

    public static int vip(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final C8420l yandex(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        InterfaceC8917l interfaceC8917lYandex = AbstractC5443l.yandex(f);
        if (interfaceC8917lYandex == null) {
            interfaceC8917lYandex = new C7689l(f);
        }
        return new C8420l(f2, f, interfaceC8917lYandex);
    }
}
