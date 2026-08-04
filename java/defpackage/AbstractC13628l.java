package defpackage;

import android.database.SQLException;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْۙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13628l {
    public static final int[][] yandex = {new int[0], new int[]{6, 18}, new int[]{6, 22}, new int[]{6, 26}, new int[]{6, 30}, new int[]{6, 34}, new int[]{6, 22, 38}, new int[]{6, 24, 42}, new int[]{6, 26, 46}, new int[]{6, 28, 50}, new int[]{6, 30, 54}, new int[]{6, 32, 58}, new int[]{6, 34, 62}, new int[]{6, 26, 46, 66}, new int[]{6, 26, 48, 70}, new int[]{6, 26, 50, 74}, new int[]{6, 30, 54, 78}, new int[]{6, 30, 56, 82}, new int[]{6, 30, 58, 86}, new int[]{6, 34, 62, 90}, new int[]{6, 28, 50, 72, 94}, new int[]{6, 26, 50, 74, 98}, new int[]{6, 30, 54, 78, 102}, new int[]{6, 28, 54, 80, 106}, new int[]{6, 32, 58, 84, 110}, new int[]{6, 30, 58, 86, 114}, new int[]{6, 34, 62, 90, 118}, new int[]{6, 26, 50, 74, 98, 122}, new int[]{6, 30, 54, 78, 102, 126}, new int[]{6, 26, 52, 78, 104, 130}, new int[]{6, 30, 56, 82, 108, 134}, new int[]{6, 34, 60, 86, 112, 138}, new int[]{6, 30, 58, 86, 114, 142}, new int[]{6, 34, 62, 90, 118, 146}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][][] loadAd = {new int[][]{new int[]{41, 25, 17, 10}, new int[]{34, 20, 14, 8}, new int[]{27, 16, 11, 7}, new int[]{17, 10, 7, 4}}, new int[][]{new int[]{77, 47, 32, 20}, new int[]{63, 38, 26, 16}, new int[]{48, 29, 20, 12}, new int[]{34, 20, 14, 8}}, new int[][]{new int[]{127, 77, 53, 32}, new int[]{EnergyProfile.EVCONNECTOR_TYPE_OTHER, 61, 42, 26}, new int[]{77, 47, 32, 20}, new int[]{58, 35, 24, 15}}, new int[][]{new int[]{187, 114, 78, 48}, new int[]{149, 90, 62, 38}, new int[]{111, 67, 46, 28}, new int[]{82, 50, 34, 21}}, new int[][]{new int[]{255, 154, 106, 65}, new int[]{202, 122, 84, 52}, new int[]{144, 87, 60, 37}, new int[]{106, 64, 44, 27}}, new int[][]{new int[]{322, 195, 134, 82}, new int[]{255, 154, 106, 65}, new int[]{178, 108, 74, 45}, new int[]{139, 84, 58, 36}}, new int[][]{new int[]{370, 224, 154, 95}, new int[]{293, 178, 122, 75}, new int[]{207, 125, 86, 53}, new int[]{154, 93, 64, 39}}, new int[][]{new int[]{461, 279, 192, 118}, new int[]{365, 221, 152, 93}, new int[]{259, 157, 108, 66}, new int[]{202, 122, 84, 52}}, new int[][]{new int[]{552, 335, 230, 141}, new int[]{432, 262, 180, 111}, new int[]{312, 189, 130, 80}, new int[]{235, 143, 98, 60}}, new int[][]{new int[]{652, 395, 271, 167}, new int[]{513, 311, 213, 131}, new int[]{364, 221, 151, 93}, new int[]{288, 174, 119, 74}}, new int[][]{new int[]{772, 468, 321, 198}, new int[]{604, 366, 251, 155}, new int[]{427, 259, 177, 109}, new int[]{331, 200, 137, 85}}, new int[][]{new int[]{883, 535, 367, 226}, new int[]{691, 419, 287, 177}, new int[]{489, 296, 203, 125}, new int[]{374, 227, 155, 96}}, new int[][]{new int[]{1022, 619, 425, 262}, new int[]{796, 483, 331, 204}, new int[]{580, 352, 241, 149}, new int[]{427, 259, 177, 109}}, new int[][]{new int[]{1101, 667, 458, 282}, new int[]{871, 528, 362, 223}, new int[]{621, 376, 258, 159}, new int[]{468, 283, 194, 120}}, new int[][]{new int[]{1250, 758, 520, 320}, new int[]{991, 600, 412, 254}, new int[]{703, 426, 292, 180}, new int[]{530, 321, 220, 136}}, new int[][]{new int[]{1408, 854, 586, 361}, new int[]{1082, 656, 450, 277}, new int[]{775, 470, 322, 198}, new int[]{602, 365, 250, 154}}, new int[][]{new int[]{1548, 938, 644, 397}, new int[]{1212, 734, 504, 310}, new int[]{876, 531, 364, 224}, new int[]{674, 408, 280, 173}}, new int[][]{new int[]{1725, 1046, 718, 442}, new int[]{1346, 816, 560, 345}, new int[]{948, 574, 394, 243}, new int[]{746, 452, 310, 191}}, new int[][]{new int[]{1903, 1153, 792, 488}, new int[]{1500, 909, 624, 384}, new int[]{1063, 644, 442, 272}, new int[]{813, 493, 338, 208}}, new int[][]{new int[]{2061, 1249, 858, 528}, new int[]{1600, 970, 666, 410}, new int[]{1159, 702, 482, 297}, new int[]{919, 557, 382, 235}}, new int[][]{new int[]{2232, 1352, 929, 572}, new int[]{1708, 1035, 711, 438}, new int[]{1224, 742, 509, 314}, new int[]{969, 587, 403, 248}}, new int[][]{new int[]{2409, 1460, 1003, 618}, new int[]{1872, 1134, 779, 480}, new int[]{1358, 823, 565, 348}, new int[]{1056, 640, 439, 270}}, new int[][]{new int[]{2620, 1588, 1091, 672}, new int[]{2059, 1248, 857, 528}, new int[]{1468, 890, 611, 376}, new int[]{1108, 672, 461, 284}}, new int[][]{new int[]{2812, 1704, 1171, 721}, new int[]{2188, 1326, 911, 561}, new int[]{1588, 963, 661, 407}, new int[]{1228, 744, 511, 315}}, new int[][]{new int[]{3057, 1853, 1273, 784}, new int[]{2395, 1451, 997, 614}, new int[]{1718, 1041, 715, 440}, new int[]{1286, 779, 535, 330}}, new int[][]{new int[]{3283, 1990, 1367, 842}, new int[]{2544, 1542, 1059, 652}, new int[]{1804, 1094, 751, 462}, new int[]{1425, 864, 593, 365}}, new int[][]{new int[]{3517, 2132, 1465, 902}, new int[]{2701, 1637, 1125, 692}, new int[]{1933, 1172, 805, 496}, new int[]{1501, 910, 625, 385}}, new int[][]{new int[]{3669, 2223, 1528, 940}, new int[]{2857, 1732, 1190, 732}, new int[]{2085, 1263, 868, 534}, new int[]{1581, 958, 658, 405}}, new int[][]{new int[]{3909, 2369, 1628, 1002}, new int[]{3035, 1839, 1264, 778}, new int[]{2181, 1322, 908, 559}, new int[]{1677, 1016, 698, 430}}, new int[][]{new int[]{4158, 2520, 1732, 1066}, new int[]{3289, 1994, 1370, 843}, new int[]{2358, 1429, 982, 604}, new int[]{1782, 1080, 742, 457}}, new int[][]{new int[]{4417, 2677, 1840, 1132}, new int[]{3486, 2113, 1452, 894}, new int[]{2473, 1499, 1030, 634}, new int[]{1897, 1150, 790, 486}}, new int[][]{new int[]{4686, 2840, 1952, 1201}, new int[]{3693, 2238, 1538, 947}, new int[]{2670, 1618, 1112, 684}, new int[]{2022, 1226, 842, 518}}, new int[][]{new int[]{4965, 3009, 2068, 1273}, new int[]{3909, 2369, 1628, 1002}, new int[]{2805, 1700, 1168, 719}, new int[]{2157, 1307, 898, 553}}, new int[][]{new int[]{5253, 3183, 2188, 1347}, new int[]{4134, 2506, 1722, 1060}, new int[]{2949, 1787, 1228, 756}, new int[]{2301, 1394, 958, 590}}};

    /* JADX WARN: Code duplicated, block: B:101:0x01b7 A[Catch: all -> 0x0154, TRY_LEAVE, TryCatch #13 {all -> 0x0154, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:16:0x0077, B:18:0x0081, B:70:0x0153, B:66:0x014c, B:73:0x0158, B:101:0x01b7, B:104:0x01c6, B:99:0x01b2, B:111:0x01d2, B:114:0x01de, B:115:0x01e5, B:116:0x01e6, B:117:0x01e9, B:118:0x01ea, B:119:0x01ff, B:7:0x0029, B:9:0x0032, B:15:0x0058, B:108:0x01ca, B:109:0x01cf, B:63:0x0145, B:96:0x01ab, B:19:0x008a, B:21:0x0093, B:24:0x00a4, B:53:0x0132, B:49:0x012b, B:56:0x0136, B:57:0x013b, B:58:0x013c, B:46:0x0124), top: B:149:0x000a, inners: #3, #8, #11, #12 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01c6 A[Catch: all -> 0x0154, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0154, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0020, B:16:0x0077, B:18:0x0081, B:70:0x0153, B:66:0x014c, B:73:0x0158, B:101:0x01b7, B:104:0x01c6, B:99:0x01b2, B:111:0x01d2, B:114:0x01de, B:115:0x01e5, B:116:0x01e6, B:117:0x01e9, B:118:0x01ea, B:119:0x01ff, B:7:0x0029, B:9:0x0032, B:15:0x0058, B:108:0x01ca, B:109:0x01cf, B:63:0x0145, B:96:0x01ab, B:19:0x008a, B:21:0x0093, B:24:0x00a4, B:53:0x0132, B:49:0x012b, B:56:0x0136, B:57:0x013b, B:58:0x013c, B:46:0x0124), top: B:149:0x000a, inners: #3, #8, #11, #12 }] */
    public static final C13126l admob(C14025l c14025l, AbstractC5921l abstractC5921l, Function1 function1) {
        C1503l c1503l;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        C13007l c13007lMo696throw = abstractC5921l.mo696throw(c14025l);
        try {
            long size = c13007lMo696throw.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + c13007lMo696throw.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                C1503l c1503l2 = new C1503l(c13007lMo696throw.billing(j));
                try {
                    if (c1503l2.mo715l() == 101010256) {
                        int iAdcel = c1503l2.adcel() & 65535;
                        int iAdcel2 = c1503l2.adcel() & 65535;
                        long jAdcel = c1503l2.adcel() & 65535;
                        if (jAdcel != (c1503l2.adcel() & 65535) || iAdcel != 0 || iAdcel2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        c1503l2.skip(4L);
                        long jMo715l = ((long) c1503l2.mo715l()) & 4294967295L;
                        int iAdcel3 = c1503l2.adcel() & 65535;
                        C3535l c3535l = new C3535l(iAdcel3, jAdcel, jMo715l);
                        c1503l2.pro(iAdcel3);
                        c1503l2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            C1503l c1503l3 = new C1503l(c13007lMo696throw.billing(j3));
                            try {
                                if (c1503l3.mo715l() == 117853008) {
                                    int iMo715l = c1503l3.mo715l();
                                    long jMo711l = c1503l3.mo711l();
                                    if (c1503l3.mo715l() != 1 || iMo715l != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    C1503l c1503l4 = new C1503l(c13007lMo696throw.billing(jMo711l));
                                    try {
                                        int iMo715l2 = c1503l4.mo715l();
                                        if (iMo715l2 != 101075792) {
                                            throw new IOException("bad zip: expected " + mopub(101075792) + " but was " + mopub(iMo715l2));
                                        }
                                        c1503l4.skip(12L);
                                        int iMo715l3 = c1503l4.mo715l();
                                        int iMo715l4 = c1503l4.mo715l();
                                        long jMo711l2 = c1503l4.mo711l();
                                        if (jMo711l2 != c1503l4.mo711l() || iMo715l3 != 0 || iMo715l4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        c1503l4.skip(8L);
                                        C3535l c3535l2 = new C3535l(iAdcel3, jMo711l2, c1503l4.mo711l());
                                        try {
                                            Unit unit = Unit.INSTANCE;
                                            try {
                                                c1503l4.close();
                                                th4 = null;
                                            } catch (Throwable th5) {
                                                th4 = th5;
                                            }
                                            c3535l = c3535l2;
                                        } catch (Throwable th6) {
                                            th3 = th6;
                                            c3535l = c3535l2;
                                            try {
                                                c1503l4.close();
                                                Unit unit2 = Unit.INSTANCE;
                                            } catch (Throwable th7) {
                                                AbstractC11718l.yandex(th3, th7);
                                            }
                                            th4 = th3;
                                        }
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th8) {
                                        th3 = th8;
                                    }
                                }
                                Unit unit3 = Unit.INSTANCE;
                                try {
                                    c1503l3.close();
                                    th2 = null;
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                try {
                                    c1503l3.close();
                                    Unit unit4 = Unit.INSTANCE;
                                } catch (Throwable th11) {
                                    AbstractC11718l.yandex(th10, th11);
                                }
                                th2 = th10;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        C1503l c1503l5 = new C1503l(c13007lMo696throw.billing(c3535l.loadAd));
                        try {
                            long j4 = c3535l.yandex;
                            while (j2 < j4) {
                                C11018l c11018lSubs = subs(c1503l5);
                                c1503l = c1503l5;
                                try {
                                    if (c11018lSubs.admob >= c3535l.loadAd) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) function1.invoke(c11018lSubs)).booleanValue()) {
                                        arrayList.add(c11018lSubs);
                                    }
                                    j2++;
                                    c1503l5 = c1503l;
                                } catch (Throwable th12) {
                                    th = th12;
                                    th = th;
                                    try {
                                        c1503l.close();
                                        Unit unit5 = Unit.INSTANCE;
                                    } catch (Throwable th13) {
                                        AbstractC11718l.yandex(th, th13);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    C13126l c13126l = new C13126l(c14025l, abstractC5921l, crashlytics(arrayList));
                                    try {
                                        c13007lMo696throw.close();
                                        Unit unit6 = Unit.INSTANCE;
                                    } catch (Throwable unused) {
                                    }
                                    return c13126l;
                                }
                            }
                            C1503l c1503l6 = c1503l5;
                            Unit unit7 = Unit.INSTANCE;
                            try {
                                c1503l6.close();
                                th = null;
                            } catch (Throwable th14) {
                                th = th14;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            c1503l = c1503l5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        C13126l c13126l2 = new C13126l(c14025l, abstractC5921l, crashlytics(arrayList));
                        c13007lMo696throw.close();
                        Unit unit8 = Unit.INSTANCE;
                        return c13126l2;
                    }
                    c1503l2.close();
                    j--;
                } catch (Throwable th16) {
                    c1503l2.close();
                    throw th16;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th17) {
            if (c13007lMo696throw == null) {
                throw th17;
            }
            try {
                c13007lMo696throw.close();
                Unit unit9 = Unit.INSTANCE;
                throw th17;
            } catch (Throwable th18) {
                AbstractC11718l.yandex(th17, th18);
                throw th17;
            }
        }
    }

    public static final void amazon(InterfaceC0684l interfaceC0684l, String str) {
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l(str);
        try {
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

    public static long billing(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC7563l.smaato(i6);
                    C17132l.firebase();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i4);
        }
        return AbstractC7563l.yandex(iMin, iMin3, Math.min(i5, i3), iMin2);
    }

    public static final LinkedHashMap crashlytics(ArrayList arrayList) {
        String str = C14025l.f27330l;
        C14025l c14025lAdcel = C6162l.adcel("/", false);
        LinkedHashMap linkedHashMapVip = AbstractC8676l.vip(new C8195l(c14025lAdcel, new C11018l(c14025lAdcel, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (C11018l c11018l : AbstractC16901l.m4243this(arrayList, new C15696l(28))) {
            if (((C11018l) linkedHashMapVip.put(c11018l.yandex, c11018l)) == null) {
                while (true) {
                    C14025l c14025l = c11018l.yandex;
                    C14025l c14025lCrashlytics = c14025l.crashlytics();
                    if (c14025lCrashlytics == null) {
                        break;
                    }
                    C11018l c11018l2 = (C11018l) linkedHashMapVip.get(c14025lCrashlytics);
                    if (c11018l2 != null) {
                        c11018l2.adcel.add(c14025l);
                        break;
                    }
                    C11018l c11018l3 = new C11018l(c14025lCrashlytics, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapVip.put(c14025lCrashlytics, c11018l3);
                    c11018l3.adcel.add(c14025l);
                    c11018l = c11018l3;
                }
            }
        }
        return linkedHashMapVip;
    }

    public static final C11018l firebase(C1503l c1503l, C11018l c11018l) throws IOException {
        int iMo715l = c1503l.mo715l();
        if (iMo715l != 67324752) {
            throw new IOException("bad zip: expected " + mopub(67324752) + " but was " + mopub(iMo715l));
        }
        c1503l.skip(2L);
        short sAdcel = c1503l.adcel();
        int i = sAdcel & 65535;
        if ((sAdcel & 1) != 0) {
            C18262l.metrica("unsupported zip: general purpose bit flag=".concat(mopub(i)));
            return null;
        }
        c1503l.skip(18L);
        long jAdcel = ((long) c1503l.adcel()) & 65535;
        int iAdcel = c1503l.adcel() & 65535;
        c1503l.skip(jAdcel);
        if (c11018l == null) {
            c1503l.skip(iAdcel);
            return null;
        }
        C10700l c10700l = new C10700l();
        C10700l c10700l2 = new C10700l();
        C10700l c10700l3 = new C10700l();
        isPro(c1503l, iAdcel, new C17657l(c1503l, c10700l, c10700l2, c10700l3));
        return new C11018l(c11018l.yandex, c11018l.loadAd, c11018l.crashlytics, c11018l.amazon, c11018l.purchase, c11018l.billing, c11018l.mopub, c11018l.admob, c11018l.subs, c11018l.isPro, c11018l.firebase, c11018l.smaato, c11018l.remoteconfig, (Integer) c10700l.f21708l, (Integer) c10700l2.f21708l, (Integer) c10700l3.f21708l);
    }

    public static final void isPro(C1503l c1503l, int i, Function2 function2) throws IOException {
        C0869l c0869l = c1503l.f3755l;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                C18262l.metrica("bad zip: truncated header in extra field");
                return;
            }
            int iAdcel = c1503l.adcel() & 65535;
            long jAdcel = ((long) c1503l.adcel()) & 65535;
            long j2 = j - 4;
            if (j2 < jAdcel) {
                C18262l.metrica("bad zip: truncated value in extra field");
                return;
            }
            c1503l.subscription(jAdcel);
            long j3 = c0869l.f2526l;
            function2.invoke(Integer.valueOf(iAdcel), Long.valueOf(jAdcel));
            long j4 = (c0869l.f2526l + jAdcel) - j3;
            if (j4 < 0) {
                C18262l.metrica(AbstractC0653l.vip(iAdcel, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    c0869l.skip(j4);
                }
                j = j2 - jAdcel;
            }
        }
    }

    public static final void loadAd(C1513l c1513l, InterfaceC17242l interfaceC17242l, C8232l c8232l, C17253l c17253l, InterfaceC3501l interfaceC3501l, InterfaceC5404l interfaceC5404l, InterfaceC14745l interfaceC14745l, boolean z, C10306l c10306l, Function1 function1, C6956l c6956l, int i) {
        C8232l c8232l2;
        InterfaceC14745l interfaceC14745l2;
        C10306l c10306lLoadAd;
        C8232l c8232lYandex;
        int i2;
        InterfaceC5404l interfaceC5404l2;
        c6956l.m2133new(-2072102870);
        int i3 = i | (c6956l.billing(c1513l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | 373317760;
        int i4 = c6956l.admob(function1) ? 4 : 2;
        boolean z2 = true;
        if (c6956l.m2127for(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            c6956l.m2141switch();
            int i5 = i & 1;
            Object obj = C1867l.yandex;
            if (i5 == 0 || c6956l.ad()) {
                c8232lYandex = AbstractC18088l.yandex(c6956l);
                C17308l c17308lYandex = AbstractC0310l.yandex(c6956l);
                boolean zBilling = c6956l.billing(c17308lYandex);
                Object objM2132native = c6956l.m2132native();
                if (zBilling || objM2132native == obj) {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                }
                i2 = i3 & (-1908409217);
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                interfaceC14745l2 = (C1192l) objM2132native;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-1908409217);
                c8232lYandex = c8232l;
                interfaceC14745l2 = interfaceC14745l;
                z2 = z;
                c10306lLoadAd = c10306l;
            }
            c6956l.adcel();
            int i6 = (i2 & 14) | 48;
            if ((((i6 & 14) ^ 6) <= 4 || !c6956l.billing(c1513l)) && (i6 & 6) != 4) {
                z2 = false;
            }
            Object objM2132native2 = c6956l.m2132native();
            if (z2 || objM2132native2 == obj) {
                interfaceC5404l2 = interfaceC5404l;
                objM2132native2 = new C1232l(new C14601l(c1513l, interfaceC5404l2, 15));
                c6956l.m2147try(objM2132native2);
            } else {
                interfaceC5404l2 = interfaceC5404l;
            }
            c8232l2 = c8232lYandex;
            AbstractC16837l.yandex(interfaceC17242l, c8232l2, (C1232l) objM2132native2, c17253l, true, interfaceC14745l2, z2, c10306lLoadAd, interfaceC3501l, interfaceC5404l2, function1, c6956l, ((i2 >> 3) & 14) | 818113536, 6 | ((i4 << 3) & 112));
        } else {
            c6956l.m2124else();
            c8232l2 = c8232l;
            interfaceC14745l2 = interfaceC14745l;
            z2 = z;
            c10306lLoadAd = c10306l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14674l(c1513l, interfaceC17242l, c8232l2, c17253l, interfaceC3501l, interfaceC5404l, interfaceC14745l2, z2, c10306lLoadAd, function1, i);
        }
    }

    public static final String mopub(int i) {
        AbstractC8576l.loadAd(16);
        return "0x".concat(Integer.toString(i, 16));
    }

    public static long purchase(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC7563l.smaato(i6);
                    C17132l.firebase();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i2);
        }
        return AbstractC7563l.yandex(Math.min(i5, i), iMin2, iMin, iMin3);
    }

    public static final void smaato(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final C11018l subs(final C1503l c1503l) throws IOException {
        int iMo715l = c1503l.mo715l();
        if (iMo715l != 33639248) {
            throw new IOException("bad zip: expected " + mopub(33639248) + " but was " + mopub(iMo715l));
        }
        c1503l.skip(4L);
        short sAdcel = c1503l.adcel();
        int i = sAdcel & 65535;
        if ((sAdcel & 1) != 0) {
            C18262l.metrica("unsupported zip: general purpose bit flag=".concat(mopub(i)));
            return null;
        }
        int iAdcel = c1503l.adcel() & 65535;
        int iAdcel2 = c1503l.adcel() & 65535;
        int iAdcel3 = c1503l.adcel() & 65535;
        long jMo715l = ((long) c1503l.mo715l()) & 4294967295L;
        final C17078l c17078l = new C17078l();
        c17078l.f33243l = ((long) c1503l.mo715l()) & 4294967295L;
        final C17078l c17078l2 = new C17078l();
        c17078l2.f33243l = ((long) c1503l.mo715l()) & 4294967295L;
        int iAdcel4 = c1503l.adcel() & 65535;
        int iAdcel5 = c1503l.adcel() & 65535;
        int iAdcel6 = c1503l.adcel() & 65535;
        c1503l.skip(8L);
        final C17078l c17078l3 = new C17078l();
        c17078l3.f33243l = ((long) c1503l.mo715l()) & 4294967295L;
        String strPro = c1503l.pro(iAdcel4);
        if (AbstractC12024l.inmobi(strPro, (char) 0)) {
            C18262l.metrica("bad zip: filename contains 0x00");
            return null;
        }
        long j = c17078l2.f33243l == 4294967295L ? 8L : 0L;
        if (c17078l.f33243l == 4294967295L) {
            j += 8;
        }
        if (c17078l3.f33243l == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final C10700l c10700l = new C10700l();
        final C10700l c10700l2 = new C10700l();
        final C10700l c10700l3 = new C10700l();
        final C9122l c9122l = new C9122l();
        isPro(c1503l, iAdcel5, new Function2() { // from class: lِٕۖ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                C1503l c1503l2 = c1503l;
                if (iIntValue == 1) {
                    C9122l c9122l2 = c9122l;
                    if (c9122l2.f18750l) {
                        C18262l.metrica("bad zip: zip64 extra repeated");
                        return null;
                    }
                    c9122l2.f18750l = true;
                    if (jLongValue < j2) {
                        C18262l.metrica("bad zip: zip64 extra too short");
                        return null;
                    }
                    C17078l c17078l4 = c17078l2;
                    long jMo711l = c17078l4.f33243l;
                    if (jMo711l == 4294967295L) {
                        jMo711l = c1503l2.mo711l();
                    }
                    c17078l4.f33243l = jMo711l;
                    C17078l c17078l5 = c17078l;
                    c17078l5.f33243l = c17078l5.f33243l == 4294967295L ? c1503l2.mo711l() : 0L;
                    C17078l c17078l6 = c17078l3;
                    c17078l6.f33243l = c17078l6.f33243l == 4294967295L ? c1503l2.mo711l() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        C18262l.metrica("bad zip: NTFS extra too short");
                        return null;
                    }
                    c1503l2.skip(4L);
                    AbstractC13628l.isPro(c1503l2, (int) (jLongValue - 4), new C17657l(c10700l, c1503l2, c10700l2, c10700l3));
                }
                return Unit.INSTANCE;
            }
        });
        if (j2 > 0 && !c9122l.f18750l) {
            C18262l.metrica("bad zip: zip64 extra required but absent");
            return null;
        }
        String strPro2 = c1503l.pro(iAdcel6);
        String str = C14025l.f27330l;
        return new C11018l(C6162l.adcel("/", false).purchase(strPro), AbstractC16648l.Signature(strPro, "/", false), strPro2, jMo715l, c17078l.f33243l, c17078l2.f33243l, iAdcel, c17078l3.f33243l, iAdcel3, iAdcel2, (Long) c10700l.f21708l, (Long) c10700l2.f21708l, (Long) c10700l3.f21708l, 57344);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void yandex(final C1513l c1513l, final InterfaceC17242l interfaceC17242l, C8232l c8232l, final C17253l c17253l, final InterfaceC5404l interfaceC5404l, InterfaceC3501l interfaceC3501l, InterfaceC14745l interfaceC14745l, boolean z, C10306l c10306l, final Function1 function1, C6956l c6956l, final int i, final int i2) {
        InterfaceC3501l interfaceC3501l2;
        int i3;
        int i4;
        boolean z2;
        final C8232l c8232l2;
        final InterfaceC14745l interfaceC14745l2;
        final boolean z3;
        final C10306l c10306lLoadAd;
        final InterfaceC3501l interfaceC3501l3;
        C4224l c4224lAds;
        int i5;
        C8232l c8232lYandex;
        C17308l c17308lYandex;
        boolean zBilling;
        Object objM2132native;
        InterfaceC14745l interfaceC14745l3;
        int i6;
        InterfaceC3501l interfaceC3501l4;
        boolean z4;
        boolean z5;
        Object objM2132native2;
        c6956l.m2133new(635941664);
        int i7 = 16;
        int i8 = i | (c6956l.billing(c1513l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        int i9 = i8 | 24704;
        int i10 = i2 & 64;
        if (i10 == 0) {
            if ((i & 1572864) == 0) {
                interfaceC3501l2 = interfaceC3501l;
                i9 |= c6956l.billing(interfaceC3501l2) ? 1048576 : 524288;
            }
            i3 = i9 | 373293056;
            if (c6956l.admob(function1)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            if ((306783379 & i3) == 306783378 || (i4 & 3) != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i3 & 1, z2)) {
                c6956l.m2141switch();
                i5 = i & 1;
                Object obj = C1867l.yandex;
                if (i5 != 0 || c6956l.ad()) {
                    c8232lYandex = AbstractC18088l.yandex(c6956l);
                    if (i10 != 0) {
                        interfaceC3501l2 = AbstractC8313l.crashlytics;
                    }
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == obj) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    interfaceC14745l3 = (C1192l) objM2132native;
                    i6 = i3 & (-1908409217);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                    interfaceC3501l4 = interfaceC3501l2;
                    z4 = true;
                } else {
                    c6956l.m2124else();
                    interfaceC14745l3 = interfaceC14745l;
                    interfaceC3501l4 = interfaceC3501l2;
                    i6 = i3 & (-1908409217);
                    c8232lYandex = c8232l;
                    z4 = z;
                    c10306lLoadAd = c10306l;
                }
                c6956l.adcel();
                int i11 = (i6 & 14) | ((i6 >> 15) & 112);
                z5 = ((((i11 & 14) ^ 6) <= 4 && c6956l.billing(c1513l)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) <= 32 && c6956l.billing(interfaceC3501l4)) || (i11 & 48) == 32);
                objM2132native2 = c6956l.m2132native();
                if (z5 || objM2132native2 == obj) {
                    objM2132native2 = new C1232l(new C14601l(c1513l, interfaceC3501l4, i7));
                    c6956l.m2147try(objM2132native2);
                }
                c8232l2 = c8232lYandex;
                interfaceC14745l2 = interfaceC14745l3;
                z3 = z4;
                AbstractC16837l.yandex(interfaceC17242l, c8232l2, (C1232l) objM2132native2, c17253l, false, interfaceC14745l2, z3, c10306lLoadAd, interfaceC3501l4, interfaceC5404l, function1, c6956l, ((i6 >> 3) & 14) | 12807168 | ((i6 << 9) & 1879048192), 6 | ((i4 << 3) & 112));
                interfaceC3501l3 = interfaceC3501l4;
            } else {
                c6956l.m2124else();
                c8232l2 = c8232l;
                interfaceC14745l2 = interfaceC14745l;
                z3 = z;
                c10306lLoadAd = c10306l;
                interfaceC3501l3 = interfaceC3501l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lّٟٛ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        AbstractC13628l.yandex(c1513l, interfaceC17242l, c8232l2, c17253l, interfaceC5404l, interfaceC3501l3, interfaceC14745l2, z3, c10306lLoadAd, function1, (C6956l) obj2, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i9 = 1597568 | i8;
        interfaceC3501l2 = interfaceC3501l;
        i3 = i9 | 373293056;
        if (c6956l.admob(function1)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        if ((306783379 & i3) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (c6956l.m2127for(i3 & 1, z2)) {
            c6956l.m2141switch();
            i5 = i & 1;
            Object obj2 = C1867l.yandex;
            if (i5 != 0) {
                c8232lYandex = AbstractC18088l.yandex(c6956l);
                if (i10 != 0) {
                    interfaceC3501l2 = AbstractC8313l.crashlytics;
                }
                c17308lYandex = AbstractC0310l.yandex(c6956l);
                zBilling = c6956l.billing(c17308lYandex);
                objM2132native = c6956l.m2132native();
                if (zBilling) {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                }
                interfaceC14745l3 = (C1192l) objM2132native;
                i6 = i3 & (-1908409217);
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                interfaceC3501l4 = interfaceC3501l2;
                z4 = true;
            } else {
                c8232lYandex = AbstractC18088l.yandex(c6956l);
                if (i10 != 0) {
                    interfaceC3501l2 = AbstractC8313l.crashlytics;
                }
                c17308lYandex = AbstractC0310l.yandex(c6956l);
                zBilling = c6956l.billing(c17308lYandex);
                objM2132native = c6956l.m2132native();
                if (zBilling) {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                }
                interfaceC14745l3 = (C1192l) objM2132native;
                i6 = i3 & (-1908409217);
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                interfaceC3501l4 = interfaceC3501l2;
                z4 = true;
            }
            c6956l.adcel();
            int i12 = (i6 & 14) | ((i6 >> 15) & 112);
            z5 = ((((i12 & 14) ^ 6) <= 4 && c6956l.billing(c1513l)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) <= 32 && c6956l.billing(interfaceC3501l4)) || (i12 & 48) == 32);
            objM2132native2 = c6956l.m2132native();
            if (z5) {
                objM2132native2 = new C1232l(new C14601l(c1513l, interfaceC3501l4, i7));
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C1232l(new C14601l(c1513l, interfaceC3501l4, i7));
                c6956l.m2147try(objM2132native2);
            }
            c8232l2 = c8232lYandex;
            interfaceC14745l2 = interfaceC14745l3;
            z3 = z4;
            AbstractC16837l.yandex(interfaceC17242l, c8232l2, (C1232l) objM2132native2, c17253l, false, interfaceC14745l2, z3, c10306lLoadAd, interfaceC3501l4, interfaceC5404l, function1, c6956l, ((i6 >> 3) & 14) | 12807168 | ((i6 << 9) & 1879048192), 6 | ((i4 << 3) & 112));
            interfaceC3501l3 = interfaceC3501l4;
        } else {
            c6956l.m2124else();
            c8232l2 = c8232l;
            interfaceC14745l2 = interfaceC14745l;
            z3 = z;
            c10306lLoadAd = c10306l;
            interfaceC3501l3 = interfaceC3501l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lّٟٛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    AbstractC13628l.yandex(c1513l, interfaceC17242l, c8232l2, c17253l, interfaceC5404l, interfaceC3501l3, interfaceC14745l2, z3, c10306lLoadAd, function1, (C6956l) obj3, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
