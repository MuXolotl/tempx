package defpackage;

import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؚؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3825l {
    public static final ArrayList yandex = new ArrayList();
    public static final Pattern loadAd = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int admob(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (subs(str)) {
            return 1;
        }
        if (remoteconfig(str)) {
            return 2;
        }
        if (smaato(str)) {
            return 3;
        }
        if (firebase(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = yandex;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        C18725l.loadAd();
        return 0;
    }

    public static String amazon(String str) {
        C9754l c9754lBilling;
        String strPurchase = null;
        if (str != null) {
            String strAdmob = AbstractC11452l.admob(str.trim());
            if (strAdmob.startsWith("avc1") || strAdmob.startsWith("avc3")) {
                return "video/avc";
            }
            if (strAdmob.startsWith("hev1") || strAdmob.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strAdmob.startsWith("vvc1") || strAdmob.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (strAdmob.startsWith("dvav") || strAdmob.startsWith("dva1") || strAdmob.startsWith("dvhe") || strAdmob.startsWith("dvh1") || strAdmob.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (strAdmob.startsWith("av01")) {
                return "video/av01";
            }
            if (strAdmob.startsWith("vp9") || strAdmob.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strAdmob.startsWith("vp8") || strAdmob.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strAdmob.startsWith("mp4a")) {
                if (strAdmob.startsWith("mp4a.") && (c9754lBilling = billing(strAdmob)) != null) {
                    strPurchase = purchase(c9754lBilling.f19893l);
                }
                return strPurchase == null ? "audio/mp4a-latm" : strPurchase;
            }
            if (strAdmob.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strAdmob.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strAdmob.startsWith("ac-3") || strAdmob.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strAdmob.startsWith("ec-3") || strAdmob.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strAdmob.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strAdmob.startsWith("ac-4") || strAdmob.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strAdmob.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strAdmob.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strAdmob.startsWith("dtsh") || strAdmob.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strAdmob.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strAdmob.startsWith("opus")) {
                return "audio/opus";
            }
            if (strAdmob.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strAdmob.startsWith("flac")) {
                return "audio/flac";
            }
            if (strAdmob.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strAdmob.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strAdmob.contains("cea708")) {
                return "application/cea-708";
            }
            if (strAdmob.contains("eia608") || strAdmob.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = yandex;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                C18725l.loadAd();
                return null;
            }
        }
        return null;
    }

    public static C9754l billing(String str) {
        Matcher matcher = loadAd.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C9754l(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 5);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int crashlytics(String str, String str2) {
        C9754l c9754lBilling;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c9754lBilling = billing(str2)) == null) {
                    return 0;
                }
                return c9754lBilling.yandex();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static boolean firebase(String str) {
        return "image".equals(mopub(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean isPro(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static String loadAd(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM3977public = AbstractC15323l.m3977public(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM3977public) {
                if (str2.equals(amazon(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static String mopub(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static String purchase(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 97:
            case 98:
            case 99:
            case 100:
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean remoteconfig(String str) {
        return "video".equals(mopub(str));
    }

    public static boolean smaato(String str) {
        return "text".equals(mopub(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean subs(String str) {
        return "audio".equals(mopub(str));
    }

    public static String vip(String str) {
        if (str == null) {
            return null;
        }
        String strAdmob = AbstractC11452l.admob(str);
        strAdmob.getClass();
        switch (strAdmob) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strAdmob;
        }
    }

    public static boolean yandex(String str, String str2) {
        C9754l c9754lBilling;
        int iYandex;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "application/vnd.dvb.ait":
            case "application/x-icy":
            case "application/x-camera-motion":
            case "application/id3":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "application/meta":
            case "audio/ac3":
            case "audio/raw":
            case "application/x-media3-cues":
            case "application/x-itut-t35":
            case "application/x-emsg":
            case "video/apv":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "application/x-scte35":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (c9754lBilling = billing(str2)) == null || (iYandex = c9754lBilling.yandex()) == 0 || iYandex == 16) ? false : true;
            default:
                return false;
        }
    }
}
