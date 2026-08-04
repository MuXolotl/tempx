package defpackage;

import java.util.logging.Level;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؓٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1896l {
    public static final int[] yandex = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final int[] loadAd = {463601321, -1045562440, 1239460018, -1189350089, -412821483, 1160071467, -1564970643, 1256291574, -1170454588, -240530412, 2118977290, -1845154869, -1618855054, -1019204973, 1437344377, -1849925303, 1189267370, 280387897, -680846520, -500732508, -1100672524, -1, -1, -1, -1, -1, -1, 268435455};

    public static String admob(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static final void amazon(InterfaceC3074l interfaceC3074l, Object obj, int i, Object obj2, C6956l c6956l, int i2) {
        c6956l.m2133new(1439843069);
        int i3 = (c6956l.billing(interfaceC3074l) ? 4 : 2) | i2 | (c6956l.billing(obj) ? 32 : 16) | (c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(obj2) ? 2048 : 1024);
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            ((InterfaceC17865l) obj).yandex(obj2, AbstractC14566l.amazon(980966366, new C0741l(interfaceC3074l, i, obj2, 9), c6956l), c6956l, 48);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC3074l, obj, i, obj2, i2);
        }
    }

    public static byte[] billing(byte[] bArr) {
        long jCrashlytics = ((long) AbstractC16655l.crashlytics(0, bArr)) & 4294967295L;
        long jLoadAd = ((long) (AbstractC16655l.loadAd(4, bArr) << 4)) & 4294967295L;
        long jCrashlytics2 = ((long) AbstractC16655l.crashlytics(7, bArr)) & 4294967295L;
        long jLoadAd2 = ((long) (AbstractC16655l.loadAd(11, bArr) << 4)) & 4294967295L;
        long jCrashlytics3 = ((long) AbstractC16655l.crashlytics(14, bArr)) & 4294967295L;
        long jLoadAd3 = ((long) (AbstractC16655l.loadAd(18, bArr) << 4)) & 4294967295L;
        long jCrashlytics4 = ((long) AbstractC16655l.crashlytics(21, bArr)) & 4294967295L;
        long jLoadAd4 = ((long) (AbstractC16655l.loadAd(25, bArr) << 4)) & 4294967295L;
        long jCrashlytics5 = ((long) AbstractC16655l.crashlytics(28, bArr)) & 4294967295L;
        long jLoadAd5 = ((long) (AbstractC16655l.loadAd(32, bArr) << 4)) & 4294967295L;
        long jCrashlytics6 = ((long) AbstractC16655l.crashlytics(35, bArr)) & 4294967295L;
        long jLoadAd6 = ((long) (AbstractC16655l.loadAd(39, bArr) << 4)) & 4294967295L;
        long jCrashlytics7 = ((long) AbstractC16655l.crashlytics(42, bArr)) & 4294967295L;
        long jLoadAd7 = ((long) (AbstractC16655l.loadAd(46, bArr) << 4)) & 4294967295L;
        long jCrashlytics8 = ((long) AbstractC16655l.crashlytics(49, bArr)) & 4294967295L;
        long jLoadAd8 = ((long) (AbstractC16655l.loadAd(53, bArr) << 4)) & 4294967295L;
        long jCrashlytics9 = ((long) AbstractC16655l.crashlytics(56, bArr)) & 4294967295L;
        long jLoadAd9 = ((long) (AbstractC16655l.loadAd(60, bArr) << 4)) & 4294967295L;
        long jCrashlytics10 = ((long) AbstractC16655l.crashlytics(63, bArr)) & 4294967295L;
        long jLoadAd10 = ((long) (AbstractC16655l.loadAd(67, bArr) << 4)) & 4294967295L;
        long jCrashlytics11 = ((long) AbstractC16655l.crashlytics(70, bArr)) & 4294967295L;
        long jLoadAd11 = ((long) (AbstractC16655l.loadAd(74, bArr) << 4)) & 4294967295L;
        long jCrashlytics12 = ((long) AbstractC16655l.crashlytics(77, bArr)) & 4294967295L;
        long jLoadAd12 = ((long) (AbstractC16655l.loadAd(81, bArr) << 4)) & 4294967295L;
        long jCrashlytics13 = AbstractC16655l.crashlytics(84, bArr);
        long j = jCrashlytics13 & 4294967295L;
        long jLoadAd13 = ((long) (AbstractC16655l.loadAd(88, bArr) << 4)) & 4294967295L;
        long jCrashlytics14 = AbstractC16655l.crashlytics(91, bArr);
        long j2 = jCrashlytics14 & 4294967295L;
        long jLoadAd14 = ((long) (AbstractC16655l.loadAd(95, bArr) << 4)) & 4294967295L;
        long jCrashlytics15 = AbstractC16655l.crashlytics(98, bArr);
        long j3 = jCrashlytics15 & 4294967295L;
        long jLoadAd15 = ((long) (AbstractC16655l.loadAd(102, bArr) << 4)) & 4294967295L;
        long jCrashlytics16 = AbstractC16655l.crashlytics(105, bArr);
        long jLoadAd16 = ((long) (AbstractC16655l.loadAd(109, bArr) << 4)) & 4294967295L;
        long j4 = ((long) ((bArr[112] & 255) | ((bArr[113] & 255) << 8))) & 4294967295L;
        long j5 = jLoadAd16 + ((jCrashlytics16 & 4294967295L) >>> 28);
        long j6 = jCrashlytics16 & 268435455;
        long j7 = (j6 * 163752818) + (j5 * 30366549) + (j4 * 43969588) + jCrashlytics9;
        long j8 = (j6 * 258169998) + (j5 * 163752818) + (j4 * 30366549) + jLoadAd9;
        long j9 = (j6 * 96434764) + (j5 * 258169998) + (j4 * 163752818) + jCrashlytics10;
        long j10 = (j6 * 227822194) + (j5 * 96434764) + (j4 * 258169998) + jLoadAd10;
        long j11 = (j6 * 149865618) + (j5 * 227822194) + (j4 * 96434764) + jCrashlytics11;
        long j12 = jLoadAd15 + (j3 >>> 28);
        long j13 = jCrashlytics15 & 268435455;
        long j14 = (j12 * 43969588) + jLoadAd7;
        long j15 = (j12 * 30366549) + (j6 * 43969588) + jCrashlytics8;
        long j16 = (j12 * 163752818) + (j6 * 30366549) + (j5 * 43969588) + jLoadAd8;
        long j17 = (j12 * 258169998) + j7;
        long j18 = (j12 * 96434764) + j8;
        long j19 = (j12 * 227822194) + j9;
        long j20 = (j12 * 149865618) + j10;
        long j21 = (j12 * 550336261) + j11;
        long j22 = (j13 * 43969588) + jCrashlytics7;
        long j23 = (j13 * 30366549) + j14;
        long j24 = (j13 * 163752818) + j15;
        long j25 = (j13 * 258169998) + j16;
        long j26 = (j13 * 96434764) + j17;
        long j27 = (j13 * 227822194) + j18;
        long j28 = (j13 * 149865618) + j19;
        long j29 = (j13 * 550336261) + j20;
        long j30 = jLoadAd14 + (j2 >>> 28);
        long j31 = jCrashlytics14 & 268435455;
        long j32 = (j30 * 163752818) + j23;
        long j33 = (j30 * 258169998) + j24;
        long j34 = (j30 * 149865618) + j27;
        long j35 = (j31 * 43969588) + jCrashlytics6;
        long j36 = (j31 * 30366549) + (j30 * 43969588) + jLoadAd6;
        long j37 = (j31 * 163752818) + (j30 * 30366549) + j22;
        long j38 = (j31 * 258169998) + j32;
        long j39 = (j31 * 96434764) + j33;
        long j40 = (j31 * 227822194) + (j30 * 96434764) + j25;
        long j41 = (j31 * 149865618) + (j30 * 227822194) + j26;
        long j42 = (j31 * 550336261) + j34;
        long j43 = jLoadAd13 + (j >>> 28);
        long j44 = (j43 * 43969588) + jLoadAd5;
        long j45 = (j43 * 30366549) + j35;
        long j46 = (j43 * 163752818) + j36;
        long j47 = (j43 * 258169998) + j37;
        long j48 = (j43 * 149865618) + j40;
        long j49 = (j6 * 550336261) + (j5 * 149865618) + (j4 * 227822194) + jLoadAd11 + (j21 >>> 28);
        long j50 = j21 & 268435455;
        long j51 = (j5 * 550336261) + (j4 * 149865618) + jCrashlytics12 + (j49 >>> 28);
        long j52 = (j4 * 550336261) + jLoadAd12 + (j51 >>> 28);
        long j53 = j51 & 268435455;
        long j54 = (jCrashlytics13 & 268435455) + (j52 >>> 28);
        long j55 = j52 & 268435455;
        long j56 = (j54 * 43969588) + jCrashlytics5;
        long j57 = (j54 * 30366549) + j44;
        long j58 = (j54 * 163752818) + j45;
        long j59 = (j54 * 258169998) + j46;
        long j60 = (j54 * 96434764) + j47;
        long j61 = (j54 * 227822194) + (j43 * 96434764) + j38;
        long j62 = (j54 * 149865618) + (j43 * 227822194) + j39;
        long j63 = (j54 * 550336261) + j48;
        long j64 = (j55 * 43969588) + jLoadAd4;
        long j65 = (j55 * 30366549) + j56;
        long j66 = (j55 * 163752818) + j57;
        long j67 = (j55 * 258169998) + j58;
        long j68 = (j55 * 96434764) + j59;
        long j69 = (j55 * 227822194) + j60;
        long j70 = (j55 * 149865618) + j61;
        long j71 = (j55 * 550336261) + j62;
        long j72 = (j53 * 43969588) + jCrashlytics4;
        long j73 = (j53 * 30366549) + j64;
        long j74 = (j53 * 163752818) + j65;
        long j75 = (j53 * 258169998) + j66;
        long j76 = (j53 * 96434764) + j67;
        long j77 = (j53 * 227822194) + j68;
        long j78 = (j53 * 149865618) + j69;
        long j79 = (j53 * 550336261) + j70;
        long j80 = (j30 * 550336261) + j28 + (j42 >>> 28);
        long j81 = j42 & 268435455;
        long j82 = j29 + (j80 >>> 28);
        long j83 = j80 & 268435455;
        long j84 = j50 + (j82 >>> 28);
        long j85 = j82 & 268435455;
        long j86 = (j49 & 268435455) + (j84 >>> 28);
        long j87 = j84 & 268435455;
        long j88 = (j86 * 43969588) + jLoadAd3;
        long j89 = (j86 * 30366549) + j72;
        long j90 = (j86 * 163752818) + j73;
        long j91 = (j86 * 258169998) + j74;
        long j92 = (j86 * 96434764) + j75;
        long j93 = (j86 * 227822194) + j76;
        long j94 = (j86 * 149865618) + j77;
        long j95 = (j86 * 550336261) + j78;
        long j96 = (j87 * 163752818) + j89;
        long j97 = (j87 * 258169998) + j90;
        long j98 = (j87 * 96434764) + j91;
        long j99 = (j87 * 227822194) + j92;
        long j100 = (j87 * 149865618) + j93;
        long j101 = (j85 * 43969588) + jLoadAd2;
        long j102 = (j85 * 30366549) + (j87 * 43969588) + jCrashlytics3;
        long j103 = (j85 * 163752818) + (j87 * 30366549) + j88;
        long j104 = (j85 * 258169998) + j96;
        long j105 = (j85 * 96434764) + j97;
        long j106 = (j85 * 227822194) + j98;
        long j107 = (j85 * 149865618) + j99;
        long j108 = (j85 * 550336261) + j100;
        long j109 = j63 + (j71 >>> 28);
        long j110 = (j43 * 550336261) + j41 + (j109 >>> 28);
        long j111 = j81 + (j110 >>> 28);
        long j112 = j83 + (j111 >>> 28);
        long j113 = j111 & 268435455;
        long j114 = (j112 * 30366549) + j101;
        long j115 = (j112 * 163752818) + j102;
        long j116 = (j112 * 258169998) + j103;
        long j117 = (j112 * 96434764) + j104;
        long j118 = (43969588 * j113) + jLoadAd;
        long j119 = (258169998 * j113) + j115;
        long j120 = j109 & 67108863;
        long j121 = ((j110 & 268435455) * 4) + ((j109 & 268435455) >>> 26) + 1;
        long j122 = (j121 * 78101261) + jCrashlytics;
        long j123 = (j121 * 141809365) + j118;
        long j124 = (j121 * 175155932) + (30366549 * j113) + (j112 * 43969588) + jCrashlytics2;
        long j125 = (j121 * 64542499) + (163752818 * j113) + j114;
        long j126 = (j121 * 158326419) + j119;
        long j127 = (j121 * 191173276) + (96434764 * j113) + j116;
        long j128 = (j121 * 104575268) + (227822194 * j113) + j117;
        long j129 = j123 + (j122 >>> 28);
        long j130 = j124 + (j129 >>> 28);
        long j131 = j125 + (j130 >>> 28);
        long j132 = j126 + (j131 >>> 28);
        long j133 = j127 + (j132 >>> 28);
        long j134 = j128 + (j133 >>> 28);
        long j135 = (j121 * 137584065) + (149865618 * j113) + (j112 * 227822194) + j105 + (j134 >>> 28);
        long j136 = (j113 * 550336261) + (j112 * 149865618) + j106 + (j135 >>> 28);
        long j137 = (j112 * 550336261) + j107 + (j136 >>> 28);
        long j138 = j108 + (j137 >>> 28);
        long j139 = (j87 * 550336261) + j94 + (j138 >>> 28);
        long j140 = j95 + (j139 >>> 28);
        long j141 = j79 + (j140 >>> 28);
        long j142 = (j71 & 268435455) + (j141 >>> 28);
        long j143 = j120 + (j142 >>> 28);
        long j144 = (j143 >>> 26) - 1;
        long j145 = (j122 & 268435455) - (j144 & 78101261);
        long j146 = ((j129 & 268435455) - (j144 & 141809365)) + (j145 >> 28);
        long j147 = ((j130 & 268435455) - (j144 & 175155932)) + (j146 >> 28);
        long j148 = ((j131 & 268435455) - (j144 & 64542499)) + (j147 >> 28);
        long j149 = ((j132 & 268435455) - (j144 & 158326419)) + (j148 >> 28);
        long j150 = ((j133 & 268435455) - (j144 & 191173276)) + (j149 >> 28);
        long j151 = ((j134 & 268435455) - (j144 & 104575268)) + (j150 >> 28);
        long j152 = ((j135 & 268435455) - (j144 & 137584065)) + (j151 >> 28);
        long j153 = (j136 & 268435455) + (j152 >> 28);
        long j154 = (j137 & 268435455) + (j153 >> 28);
        long j155 = (j138 & 268435455) + (j154 >> 28);
        long j156 = (j139 & 268435455) + (j155 >> 28);
        long j157 = (j140 & 268435455) + (j156 >> 28);
        long j158 = (j141 & 268435455) + (j157 >> 28);
        long j159 = (j142 & 268435455) + (j158 >> 28);
        byte[] bArr2 = new byte[57];
        AbstractC16655l.mopub((j145 & 268435455) | ((j146 & 268435455) << 28), bArr2, 0);
        AbstractC16655l.mopub(((j148 & 268435455) << 28) | (j147 & 268435455), bArr2, 7);
        AbstractC16655l.mopub((j149 & 268435455) | ((j150 & 268435455) << 28), bArr2, 14);
        AbstractC16655l.mopub((j151 & 268435455) | ((j152 & 268435455) << 28), bArr2, 21);
        AbstractC16655l.mopub(((j154 & 268435455) << 28) | (j153 & 268435455), bArr2, 28);
        AbstractC16655l.mopub((j155 & 268435455) | ((j156 & 268435455) << 28), bArr2, 35);
        AbstractC16655l.mopub((j157 & 268435455) | ((j158 & 268435455) << 28), bArr2, 42);
        AbstractC16655l.mopub((((67108863 & j143) + (j159 >> 28)) << 28) | (j159 & 268435455), bArr2, 49);
        return bArr2;
    }

    public static final void crashlytics(C12217l c12217l, boolean z, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-579239002);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c12217l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC16763l.crashlytics(c12217l, z, c15578l, c6956l, i2 & 1022);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1973l(c12217l, z, c15578l, i, 1);
        }
    }

    public static final void loadAd(C16173l c16173l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(2080741862);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c16173l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC16763l.loadAd(c16173l, c15578l, c6956l, i2 & 126);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1993l(c16173l, c15578l, i, i3);
        }
    }

    public static final C8874l mopub(C6956l c6956l) {
        c6956l.m2123default(1967007413);
        Object[] objArr = new Object[0];
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            objM2132native = new C5146l(8);
            c6956l.m2147try(objM2132native);
        }
        C8874l c8874l = (C8874l) AbstractC0825l.smaato(objArr, C8874l.f18239l, (Function0) objM2132native, c6956l, 384);
        c8874l.f18240l = (InterfaceC2449l) c6956l.isPro(AbstractC16780l.yandex);
        c6956l.startapp(false);
        return c8874l;
    }

    public static void purchase(byte[] bArr, int[] iArr) {
        AbstractC16655l.amazon(14, bArr, iArr);
    }

    public static int subs(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static final void yandex(C0205l c0205l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-954926513);
        int i2 = (c6956l.admob(c0205l) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC16763l.yandex(c0205l, c15578l, c6956l, i2 & 126);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6959l(c0205l, c15578l, i, i3);
        }
    }
}
