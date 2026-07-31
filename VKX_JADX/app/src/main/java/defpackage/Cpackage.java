package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* JADX INFO: renamed from: package, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public class Cpackage extends Ccase {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f36535l = new ad(6, Cpackage.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f36536l;

    public Cpackage(byte[] bArr) {
        if (bArr.length < 4) {
            C8339l.metrica("GeneralizedTime string too short");
            throw null;
        }
        this.f36536l = bArr;
        if (m4579volatile(0) && m4579volatile(1) && m4579volatile(2) && m4579volatile(3)) {
            return;
        }
        C8339l.metrica("illegal characters in GeneralizedTime string");
        throw null;
    }

    public static String applovin(int i) {
        return i < 10 ? AbstractC0653l.vip(i, "0") : Integer.toString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Cpackage inmobi(applovin applovinVar) {
        String strAds;
        if (applovinVar == 0 || (applovinVar instanceof Cpackage)) {
            return (Cpackage) applovinVar;
        }
        Ccase ccaseBilling = applovinVar.billing();
        if (ccaseBilling instanceof Cpackage) {
            return (Cpackage) ccaseBilling;
        }
        if (applovinVar instanceof byte[]) {
            try {
                return (Cpackage) f36535l.m215l((byte[]) applovinVar);
            } catch (Exception e) {
                strAds = AbstractC5020l.ads(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            strAds = "illegal object in getInstance: ".concat(applovinVar.getClass().getName());
        }
        C8339l.metrica(strAds);
        return null;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static String m4574native(String str) {
        StringBuilder sb;
        String str2;
        String string;
        char cCharAt;
        String strSubstring = str.substring(14);
        int i = 1;
        while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            string = strSubstring.substring(0, 4).concat(strSubstring.substring(i));
        } else {
            if (i2 == 1) {
                sb = new StringBuilder();
                sb.append(strSubstring.substring(0, i));
                str2 = "00";
            } else {
                if (i2 != 2) {
                    return str;
                }
                sb = new StringBuilder();
                sb.append(strSubstring.substring(0, i));
                str2 = "0";
            }
            sb.append(str2);
            sb.append(strSubstring.substring(i));
            string = sb.toString();
        }
        return str.substring(0, 14).concat(string);
    }

    @Override // defpackage.Ccase
    public int Signature(boolean z) {
        return C7972l.m2216for(this.f36536l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    public final Date appmetrica() {
        SimpleDateFormat simpleDateFormatPremium;
        SimpleDateFormat simpleDateFormat;
        String strYandex = AbstractC9008l.yandex(this.f36536l);
        if (strYandex.endsWith("Z")) {
            if (m4575package()) {
                simpleDateFormatPremium = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", AbstractC12215l.yandex);
            } else if (m4576strictfp()) {
                simpleDateFormatPremium = new SimpleDateFormat("yyyyMMddHHmmss'Z'", AbstractC12215l.yandex);
            } else {
                simpleDateFormatPremium = m4577synchronized() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", AbstractC12215l.yandex) : new SimpleDateFormat("yyyyMMddHH'Z'", AbstractC12215l.yandex);
            }
            simpleDateFormatPremium.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strYandex.indexOf(45) > 0 || strYandex.indexOf(43) > 0) {
            strYandex = m4578throws();
            simpleDateFormatPremium = premium();
        } else {
            if (m4575package()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else if (m4576strictfp()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            } else {
                simpleDateFormat = m4577synchronized() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            }
            simpleDateFormatPremium = simpleDateFormat;
            simpleDateFormatPremium.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (m4575package()) {
            strYandex = m4574native(strYandex);
        }
        return simpleDateFormatPremium.parse(strYandex);
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f36536l);
    }

    @Override // defpackage.Ccase
    public Ccase isVip() {
        return new C4472l(this.f36536l);
    }

    @Override // defpackage.Ccase
    public void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(24, z, this.f36536l);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean m4575package() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f36536l;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public final SimpleDateFormat premium() {
        SimpleDateFormat simpleDateFormat;
        if (m4575package()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
        } else if (m4576strictfp()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        } else {
            simpleDateFormat = m4577synchronized() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        }
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m4576strictfp() {
        return m4579volatile(12) && m4579volatile(13);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m4577synchronized() {
        return m4579volatile(10) && m4579volatile(11);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final String m4578throws() {
        String str;
        String strYandex = AbstractC9008l.yandex(this.f36536l);
        if (strYandex.charAt(strYandex.length() - 1) == 'Z') {
            return strYandex.substring(0, strYandex.length() - 1).concat("GMT+00:00");
        }
        int length = strYandex.length();
        char cCharAt = strYandex.charAt(length - 6);
        if ((cCharAt == '-' || cCharAt == '+') && strYandex.indexOf("GMT") == length - 9) {
            return strYandex;
        }
        int length2 = strYandex.length();
        int i = length2 - 5;
        char cCharAt2 = strYandex.charAt(i);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(strYandex.substring(0, i));
            sb.append("GMT");
            int i2 = length2 - 2;
            sb.append(strYandex.substring(i, i2));
            sb.append(":");
            sb.append(strYandex.substring(i2));
            return sb.toString();
        }
        int length3 = strYandex.length() - 3;
        char cCharAt3 = strYandex.charAt(length3);
        if (cCharAt3 == '-' || cCharAt3 == '+') {
            return strYandex.substring(0, length3) + "GMT" + strYandex.substring(length3) + ":00";
        }
        StringBuilder sbAd = AbstractC5020l.ad(strYandex);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i3 = rawOffset / 3600000;
        int i4 = (rawOffset - (3600000 * i3)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (m4575package()) {
                    strYandex = m4574native(strYandex);
                }
                if (timeZone.inDaylightTime(premium().parse(strYandex + "GMT" + str + applovin(i3) + ":" + applovin(i4)))) {
                    i3 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        sbAd.append("GMT" + str + applovin(i3) + ":" + applovin(i4));
        return sbAd.toString();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (!(ccase instanceof Cpackage)) {
            return false;
        }
        return Arrays.equals(this.f36536l, ((Cpackage) ccase).f36536l);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean m4579volatile(int i) {
        byte b;
        byte[] bArr = this.f36536l;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    public Cpackage(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", AbstractC12215l.yandex);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f36536l = AbstractC9008l.crashlytics(simpleDateFormat.format(date));
    }
}
