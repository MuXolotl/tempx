package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lٔۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15323l {
    public static final String[] admob;
    public static final Pattern amazon;
    public static final Pattern billing;
    public static final long[] crashlytics;
    public static final int[] firebase;
    public static final int[] isPro;
    public static final byte[] loadAd;
    public static HashMap mopub;
    public static final Pattern purchase;
    public static final int[] smaato;
    public static final String[] subs;
    public static final String yandex;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        yandex = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        loadAd = new byte[0];
        crashlytics = new long[0];
        amazon = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        purchase = Pattern.compile("%([A-Fa-f0-9]{2})");
        billing = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        admob = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        subs = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        isPro = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        firebase = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        smaato = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int Signature(int i) {
        if (i == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                switch (i) {
                    case 12:
                        return 743676;
                    case 13:
                        return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                    case 14:
                        return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                    default:
                        return 0;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x00ff, please report this as an issue */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static long m3958abstract(long j, long j2, long j3, RoundingMode roundingMode) {
        double dRint;
        long j4;
        boolean z;
        long jAdmob = AbstractC3483l.admob(j, j2);
        if (jAdmob != Long.MAX_VALUE && jAdmob != Long.MIN_VALUE) {
            return AbstractC3483l.amazon(jAdmob, j3, roundingMode);
        }
        long jBilling = AbstractC3483l.billing(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jAmazon = AbstractC3483l.amazon(j2, jBilling, roundingMode2);
        long jAmazon2 = AbstractC3483l.amazon(j3, jBilling, roundingMode2);
        long jBilling2 = AbstractC3483l.billing(Math.abs(j), Math.abs(jAmazon2));
        long jAmazon3 = AbstractC3483l.amazon(j, jBilling2, roundingMode2);
        long jAmazon4 = AbstractC3483l.amazon(jAmazon2, jBilling2, roundingMode2);
        long jAdmob2 = AbstractC3483l.admob(jAmazon3, jAmazon);
        if (jAdmob2 != Long.MAX_VALUE && jAdmob2 != Long.MIN_VALUE) {
            return AbstractC3483l.amazon(jAdmob2, jAmazon4, roundingMode);
        }
        double d = jAmazon3 * (jAmazon / jAmazon4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i = AbstractC4771l.yandex;
        if (!AbstractC5006l.billing(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AbstractC11276l.yandex[roundingMode.ordinal()]) {
            case 1:
                AbstractC9464l.admob(AbstractC4771l.yandex(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 2:
                if (d >= 0.0d || AbstractC4771l.yandex(d)) {
                    dRint = d;
                } else {
                    j4 = ((long) d) - 1;
                    dRint = j4;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 3:
                if (d <= 0.0d || AbstractC4771l.yandex(d)) {
                    dRint = d;
                } else {
                    j4 = ((long) d) + 1;
                    dRint = j4;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 4:
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 5:
                if (AbstractC4771l.yandex(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) + ((long) (d > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d) + d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            default:
                C11586l.yandex();
                return 0L;
        }
    }

    public static String ad(int i, String str) {
        String[] strArrM3977public = m3977public(str);
        if (strArrM3977public.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM3977public) {
            if (i == AbstractC3825l.admob(AbstractC3825l.amazon(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int adcel(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = isPro[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static void admob(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Handler ads(C13214l c13214l) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, c13214l);
    }

    public static Point advert(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m3964else(context)) {
            String strM3979strictfp = Build.VERSION.SDK_INT < 28 ? m3979strictfp("sys.display-size") : m3979strictfp("vendor.display-size");
            if (!TextUtils.isEmpty(strM3979strictfp)) {
                try {
                    String[] strArrSplit = strM3979strictfp.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC6427l.admob("Util", "Invalid display size: " + strM3979strictfp);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int amazon(List list, Long l, boolean z) {
        int i;
        int iBinarySearch = Collections.binarySearch(list, l);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || ((Comparable) list.get(i2)).compareTo(l) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    public static String applovin(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_SUBTYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        C18073l.admob();
        return null;
    }

    public static long appmetrica(float f, long j) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static int billing(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static boolean m3959case(C13143l c13143l, C13143l c13143l2, Inflater inflater) {
        if (c13143l.yandex() > 0 && c13143l.isPro() == 120 && c13143l.yandex() != 0) {
            if (c13143l2.yandex.length < c13143l.yandex()) {
                c13143l2.crashlytics(c13143l.yandex() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(c13143l.yandex, c13143l.loadAd, c13143l.yandex());
            int iInflate = 0;
            while (true) {
                try {
                    byte[] bArr = c13143l2.yandex;
                    iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                    if (inflater.finished()) {
                        c13143l2.m3561extends(iInflate);
                        inflater.reset();
                        return true;
                    }
                    if (!inflater.needsDictionary() && !inflater.needsInput()) {
                        byte[] bArr2 = c13143l2.yandex;
                        if (iInflate == bArr2.length) {
                            c13143l2.crashlytics(bArr2.length * 2);
                        }
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
                inflater.reset();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static boolean m3960catch(int i) {
        return i == 10 || i == 13;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static String m3961class(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strAdmob = AbstractC11452l.admob(str);
        int i = 0;
        String str2 = strAdmob.split("-", 2)[0];
        if (mopub == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = admob;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                map.put(strArr[i2], strArr[i2 + 1]);
            }
            mopub = map;
        }
        String str4 = (String) mopub.get(str2);
        if (str4 != null) {
            strAdmob = str4.concat(strAdmob.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strAdmob;
        }
        while (true) {
            String[] strArr2 = subs;
            if (i >= strArr2.length) {
                return strAdmob;
            }
            if (strAdmob.startsWith(strArr2[i])) {
                return strArr2[i + 1] + strAdmob.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static long m3962continue(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static int crashlytics(C15206l c15206l, long j) {
        int i = c15206l.loadAd - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (c15206l.amazon(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < c15206l.loadAd && c15206l.amazon(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static int m3963default(long j, long j2) {
        long jAdmob = AbstractC3483l.admob(j, 100L);
        return AbstractC9966l.ads((jAdmob == Long.MAX_VALUE || jAdmob == Long.MIN_VALUE) ? j / (j2 / 100) : jAdmob / j2);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static boolean m3964else(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static boolean m3965extends(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static void m3966final(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static String m3967finally(int i) {
        return new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII);
    }

    public static long firebase(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static boolean m3968for(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static long m3969goto(int i, long j) {
        return m3970import(j, 1000000L, i, RoundingMode.DOWN);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static long m3970import(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return AbstractC3483l.amazon(j, AbstractC3483l.amazon(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return AbstractC3483l.admob(j, AbstractC3483l.amazon(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 < j || j3 % j != 0) {
            return (j3 >= j || j % j3 != 0) ? m3958abstract(j, j2, j3, roundingMode) : AbstractC3483l.admob(j2, AbstractC3483l.amazon(j, j3, RoundingMode.UNNECESSARY));
        }
        return AbstractC3483l.amazon(j2, AbstractC3483l.amazon(j3, j, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long inmobi(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static boolean m3971instanceof(InterfaceC9814l interfaceC9814l, boolean z) {
        return interfaceC9814l == null || !interfaceC9814l.startapp() || interfaceC9814l.purchase() == 1 || interfaceC9814l.purchase() == 4 || !(!z || interfaceC9814l.mo2770l() == 0 || interfaceC9814l.mo2770l() == 4);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static Object[] m3972interface(int i, Object[] objArr) {
        AbstractC12442l.admob(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    public static int isPro(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static Looper isVip() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static int license(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    if (i == 1879048192) {
                                        return 8;
                                    }
                                    C11983l.crashlytics();
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int loadAd(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return z ? iBinarySearch : i;
    }

    public static int metrica(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iHashCode = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
        }
        return iHashCode;
    }

    public static int mopub(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static boolean m3973native(InterfaceC9814l interfaceC9814l) {
        boolean z = false;
        if (interfaceC9814l == null) {
            return false;
        }
        int iPurchase = interfaceC9814l.purchase();
        if (iPurchase != 1 || !interfaceC9814l.mo2779l(2)) {
            if (iPurchase == 4 && interfaceC9814l.mo2779l(4)) {
                interfaceC9814l.premium();
            }
            if (interfaceC9814l.mo2779l(1)) {
                return z;
            }
            interfaceC9814l.mo2801protected();
            return true;
        }
        interfaceC9814l.yandex();
        z = true;
        if (interfaceC9814l.mo2779l(1)) {
            return z;
        }
        interfaceC9814l.mo2801protected();
        return true;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static void m3974new(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m3974new(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static long m3975package(float f, long j) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    public static int premium(String str) {
        String[] strArrSplit;
        int length;
        int i = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static int m3976private(Uri uri, String str) {
        int i;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!AbstractC11452l.yandex("rtsp", scheme) && !AbstractC11452l.yandex("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strAdmob = AbstractC11452l.admob(lastPathSegment.substring(iLastIndexOf + 1));
                    strAdmob.getClass();
                    switch (strAdmob.hashCode()) {
                        case 104579:
                            if (strAdmob.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strAdmob.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strAdmob.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strAdmob.equals("m3u8")) {
                            }
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        */
                    /*
                        Method dump skipped, instruction units count: 286
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15323l.m3976private(android.net.Uri, java.lang.String):int");
                }

                public static int pro(int i, String str) {
                    int i2 = 0;
                    for (String str2 : m3977public(str)) {
                        if (i == AbstractC3825l.admob(AbstractC3825l.amazon(str2))) {
                            i2++;
                        }
                    }
                    return i2;
                }

                /* JADX INFO: renamed from: public, reason: not valid java name */
                public static String[] m3977public(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                public static int purchase(int[] iArr, int i, boolean z, boolean z2) {
                    int i2;
                    int i3;
                    int iBinarySearch = Arrays.binarySearch(iArr, i);
                    if (iBinarySearch < 0) {
                        i3 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i2 = iBinarySearch - 1;
                            if (i2 < 0 || iArr[i2] != i) {
                                break;
                            }
                            iBinarySearch = i2;
                        }
                        i3 = z ? iBinarySearch : i2;
                    }
                    return z2 ? Math.max(0, i3) : i3;
                }

                public static boolean remoteconfig(Object obj, Object[] objArr) {
                    for (Object obj2 : objArr) {
                        if (Objects.equals(obj2, obj)) {
                            return true;
                        }
                    }
                    return false;
                }

                public static int signatures(int i) {
                    if (i == 2 || i == 4) {
                        return 6005;
                    }
                    if (i == 10) {
                        return 6004;
                    }
                    if (i == 7) {
                        return 6005;
                    }
                    if (i == 8) {
                        return 6003;
                    }
                    switch (i) {
                        case 15:
                            return 6003;
                        case 16:
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            return 6005;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i) {
                                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }

                public static boolean smaato(SparseArray sparseArray, int i) {
                    return sparseArray.indexOfKey(i) >= 0;
                }

                public static Bundle startapp(Bundle bundle) {
                    if (bundle == null) {
                        return null;
                    }
                    ClassLoader classLoader = AbstractC15323l.class.getClassLoader();
                    classLoader.getClass();
                    bundle.setClassLoader(classLoader);
                    try {
                        bundle.isEmpty();
                        return bundle;
                    } catch (RuntimeException e) {
                        AbstractC6427l.subs("Util", "Ignoring invalid bundle", e);
                        return null;
                    }
                }

                /* JADX INFO: renamed from: static, reason: not valid java name */
                public static long m3978static(String str) throws C17655l {
                    Matcher matcher = amazon.matcher(str);
                    if (!matcher.matches()) {
                        throw C17655l.yandex(null, "Invalid date/time format: ".concat(str));
                    }
                    int i = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        int i2 = Integer.parseInt(matcher.group(12)) * 60;
                        String strGroup = matcher.group(13);
                        i = strGroup != null ? Integer.parseInt(strGroup) + i2 : i2;
                        if ("-".equals(matcher.group(11))) {
                            i *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
                }

                /* JADX INFO: renamed from: strictfp, reason: not valid java name */
                public static String m3979strictfp(String str) {
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        return (String) cls.getMethod("get", String.class).invoke(cls, str);
                    } catch (Exception e) {
                        AbstractC6427l.subs("Util", "Failed to read system property ".concat(str), e);
                        return null;
                    }
                }

                public static float subs(float f, float f2, float f3) {
                    return Math.max(f2, Math.min(f, f3));
                }

                public static void subscription(NotificationManager notificationManager, String str) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 26 || notificationManager.getNotificationChannel("default_channel_id") != null) {
                        return;
                    }
                    NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", str, 2);
                    if (i <= 27) {
                        notificationChannel.setShowBadge(false);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }

                /* JADX INFO: renamed from: super, reason: not valid java name */
                public static void m3980super(long j, long[] jArr) {
                    long j2;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i = 0;
                    if (j >= 1000000 && j % 1000000 == 0) {
                        long jAmazon = AbstractC3483l.amazon(j, 1000000L, RoundingMode.UNNECESSARY);
                        while (i < jArr.length) {
                            jArr[i] = AbstractC3483l.amazon(jArr[i], jAmazon, roundingMode);
                            i++;
                        }
                        return;
                    }
                    if (j < 1000000 && 1000000 % j == 0) {
                        long jAmazon2 = AbstractC3483l.amazon(1000000L, j, RoundingMode.UNNECESSARY);
                        while (i < jArr.length) {
                            jArr[i] = AbstractC3483l.admob(jArr[i], jAmazon2);
                            i++;
                        }
                        return;
                    }
                    int i2 = 0;
                    while (i2 < jArr.length) {
                        long j3 = jArr[i2];
                        if (j3 != 0) {
                            if (j >= j3 && j % j3 == 0) {
                                jArr[i2] = AbstractC3483l.amazon(1000000L, AbstractC3483l.amazon(j, j3, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j >= j3 || j3 % j != 0) {
                                j2 = j;
                                jArr[i2] = m3958abstract(j3, 1000000L, j2, roundingMode);
                            } else {
                                jArr[i2] = AbstractC3483l.admob(1000000L, AbstractC3483l.amazon(j3, j, RoundingMode.UNNECESSARY));
                            }
                            j2 = j;
                        } else {
                            j2 = j;
                        }
                        i2++;
                        j = j2;
                    }
                }

                /* JADX INFO: renamed from: switch, reason: not valid java name */
                public static void m3981switch(ArrayList arrayList, int i, int i2, int i3) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
                        arrayDeque.addFirst(arrayList.remove(i + i4));
                    }
                    arrayList.addAll(Math.min(i3, arrayList.size()), arrayDeque);
                }

                /* JADX INFO: renamed from: synchronized, reason: not valid java name */
                public static String[] m3982synchronized() {
                    Configuration configuration = Resources.getSystem().getConfiguration();
                    String[] strArrSplit = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
                    for (int i = 0; i < strArrSplit.length; i++) {
                        strArrSplit[i] = m3961class(strArrSplit[i]);
                    }
                    return strArrSplit;
                }

                public static int tapsense(int i) {
                    switch (i) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 15:
                        case 16:
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            return 28;
                        case 13:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 23:
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        default:
                            return Alert.DURATION_SHOW_INDEFINITELY;
                        case 14:
                            return 25;
                        case 20:
                            return 30;
                        case 21:
                        case 22:
                            return 31;
                        case 30:
                        case 31:
                            return 34;
                    }
                }

                /* JADX INFO: renamed from: this, reason: not valid java name */
                public static C1090l m3983this(ListenableFuture listenableFuture, InterfaceC12538l interfaceC12538l) {
                    C1090l c1090l = new C1090l();
                    RunnableC16241l runnableC16241l = new RunnableC16241l(c1090l, listenableFuture, 1);
                    EnumC1535l enumC1535l = EnumC1535l.f3808l;
                    c1090l.yandex(runnableC16241l, enumC1535l);
                    listenableFuture.yandex(new RunnableC15278l(listenableFuture, c1090l, interfaceC12538l, 8), enumC1535l);
                    return c1090l;
                }

                /* JADX INFO: renamed from: throw, reason: not valid java name */
                public static boolean m3984throw(Context context) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i == 30) {
                        String str = Build.MODEL;
                        if (AbstractC11452l.yandex(str, "moto g(20)") || AbstractC11452l.yandex(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i == 34 && AbstractC11452l.yandex(Build.MODEL, "sm-x200");
                }

                /* JADX INFO: renamed from: throws, reason: not valid java name */
                public static int m3985throws(int i, ByteOrder byteOrder) {
                    if (i == 8) {
                        return 3;
                    }
                    if (i == 16) {
                        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
                    }
                    if (i == 24) {
                        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
                    }
                    if (i != 32) {
                        return 0;
                    }
                    return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
                }

                /* JADX INFO: renamed from: try, reason: not valid java name */
                public static long m3986try(long j) {
                    return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
                }

                public static boolean vip(SparseArray sparseArray, SparseArray sparseArray2) {
                    if (sparseArray == null) {
                        return sparseArray2 == null;
                    }
                    if (sparseArray2 == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentEquals(sparseArray2);
                    }
                    int size = sparseArray.size();
                    if (size != sparseArray2.size()) {
                        return false;
                    }
                    for (int i = 0; i < size; i++) {
                        if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX INFO: renamed from: volatile, reason: not valid java name */
                public static String m3987volatile(int i) {
                    switch (i) {
                        case -2:
                            return "none";
                        case -1:
                            return "unknown";
                        case 0:
                            return "default";
                        case 1:
                            return "audio";
                        case 2:
                            return "video";
                        case 3:
                            return "text";
                        case 4:
                            return "image";
                        case 5:
                            return "metadata";
                        case 6:
                            return "camera motion";
                        default:
                            return i >= 10000 ? AbstractC15560l.tapsense("custom (", i, ")") : "?";
                    }
                }

                public static long yandex(long j, long j2) {
                    long j3 = j + j2;
                    long j4 = (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
                    if ((j4 != Long.MIN_VALUE || j3 == Long.MIN_VALUE) && (j4 != Long.MAX_VALUE || j3 == Long.MAX_VALUE)) {
                        return j4;
                    }
                    return Long.MAX_VALUE;
                }
            }
