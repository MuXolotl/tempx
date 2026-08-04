package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lًۛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8270l {
    public boolean admob;
    public int amazon;
    public EnumC2909l billing;
    public boolean crashlytics;
    public InterfaceC0308l loadAd;
    public StringBuilder mopub;
    public boolean purchase;
    public StringBuilder subs;
    public C4816l yandex;

    public static C12671l Signature(C11522l c11522l) {
        return c11522l.license("auto") ? new C12671l(0.0f) : c11522l.m3109for();
    }

    public static void ad(AbstractC6747l abstractC6747l, String str) throws C16376l {
        int i;
        C11522l c11522l = new C11522l(str);
        c11522l.m3122super();
        String strM3100catch = c11522l.m3100catch();
        if ("defer".equals(strM3100catch)) {
            c11522l.m3122super();
            strM3100catch = c11522l.m3100catch();
        }
        EnumC14937l enumC14937l = (EnumC14937l) AbstractC3794l.yandex.get(strM3100catch);
        c11522l.m3122super();
        if (c11522l.advert()) {
            i = 0;
        } else {
            String strM3100catch2 = c11522l.m3100catch();
            strM3100catch2.getClass();
            if (strM3100catch2.equals("meet")) {
                i = 1;
            } else {
                if (!strM3100catch2.equals("slice")) {
                    throw new C16376l("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        abstractC6747l.vip = new C3299l(enumC14937l, i);
    }

    public static ArrayList adcel(String str) {
        C11522l c11522l = new C11522l(str);
        ArrayList arrayList = null;
        do {
            String strM3126throw = c11522l.m3126throw();
            if (strM3126throw == null) {
                strM3126throw = c11522l.m3105else(',', true);
            }
            if (strM3126throw == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM3126throw);
            c11522l.m3110goto();
        } while (!c11522l.advert());
        return arrayList;
    }

    public static void admob(AbstractC16054l abstractC16054l, Attributes attributes) throws C16376l {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iSmaato = AbstractC0653l.smaato(attributes, i2);
            if (iSmaato == 23) {
                abstractC16054l.isPro = isVip(strTrim);
            } else if (iSmaato != 24) {
                if (iSmaato != 26) {
                    if (iSmaato == 60) {
                        if (strTrim != null) {
                            try {
                                if (strTrim.equals("pad")) {
                                    i = 1;
                                } else if (strTrim.equals("reflect")) {
                                    i = 2;
                                } else if (strTrim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    C8339l.metrica("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(strTrim));
                                }
                                abstractC16054l.firebase = i;
                            } catch (IllegalArgumentException unused) {
                                throw new C16376l(AbstractC15560l.Signature("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                            }
                        } else {
                            C6541l.subs("Name is null");
                        }
                        i = 0;
                        abstractC16054l.firebase = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    abstractC16054l.smaato = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC16054l.subs = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    C11983l.pro("Invalid value for attribute gradientUnits");
                    return;
                }
                abstractC16054l.subs = Boolean.TRUE;
            }
        }
    }

    public static String ads(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static HashMap advert(C11522l c11522l) {
        HashMap map = new HashMap();
        c11522l.m3122super();
        String strM3105else = c11522l.m3105else('=', false);
        while (strM3105else != null) {
            c11522l.Signature('=');
            map.put(strM3105else, c11522l.m3126throw());
            c11522l.m3122super();
            strM3105else = c11522l.m3105else('=', false);
        }
        return map;
    }

    public static int amazon(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = f % 360.0f;
        if (f < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return loadAd(purchase(f10, f9, f6 - 2.0f) * 256.0f) | (loadAd(purchase(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (loadAd(purchase(f10, f9, f6) * 256.0f) << 8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x0270  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:235:0x037d  */
    /* JADX WARN: Code duplicated, block: B:311:0x0491  */
    /* JADX WARN: Code duplicated, block: B:345:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:390:0x0588  */
    /* JADX WARN: Code duplicated, block: B:445:0x0650  */
    public static void applovin(C2071l c2071l, String str, String str2) {
        C12014l c12014l;
        Boolean bool;
        int i;
        int i2;
        String strM3105else;
        C12671l c12671lSubscription;
        String strSubstring;
        C12671l c12671lSubscription2;
        int i3;
        int i4;
        C12671l c12671lM3109for;
        C12671l[] c12671lArr;
        int i5;
        int i6;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = EnumC14410l.yandex(str).ordinal();
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C11522l c11522l = new C11522l(str2.substring(5));
                c11522l.m3122super();
                C12671l c12671lSignature = Signature(c11522l);
                c11522l.m3110goto();
                C12671l c12671lSignature2 = Signature(c11522l);
                c11522l.m3110goto();
                C12671l c12671lSignature3 = Signature(c11522l);
                c11522l.m3110goto();
                C12671l c12671lSignature4 = Signature(c11522l);
                c11522l.m3122super();
                if (c11522l.Signature(')') || c11522l.advert()) {
                    c12014l = new C12014l(22, false);
                    c12014l.f23941l = c12671lSignature;
                    c12014l.f23940l = c12671lSignature2;
                    c12014l.f23944l = c12671lSignature3;
                    c12014l.f23943l = c12671lSignature4;
                } else {
                    c12014l = null;
                }
            } else {
                c12014l = null;
            }
            c2071l.f4620l = c12014l;
            if (c12014l != null) {
                c2071l.f4624l |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            c2071l.f4622l = ads(str2);
            c2071l.f4624l |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            c2071l.f4637l = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            c2071l.f4624l |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                c2071l.f4642l = vip(str2);
                c2071l.f4624l |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                int i7 = str2.equals("ltr") ? 1 : !str2.equals("rtl") ? 0 : 2;
                c2071l.f4621l = i7;
                if (i7 != 0) {
                    c2071l.f4624l |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                c2071l.f4629l = ads(str2);
                c2071l.f4624l |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                c2071l.f4630l = license(str2);
                c2071l.f4624l |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                c2071l.f4632l = bool;
                if (bool != null) {
                    c2071l.f4624l |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i8 = str2.equals("none") ? 1 : !str2.equals("non-scaling-stroke") ? 0 : 2;
                c2071l.f4619l = i8;
                if (i8 != 0) {
                    c2071l.f4624l |= 34359738368L;
                    return;
                }
                return;
            }
            C2128l c2128l = C2128l.f4766l;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    c2071l.f4636l = c2128l;
                } else {
                    try {
                        c2071l.f4636l = vip(str2);
                    } catch (C16376l e) {
                        Log.w("SVGParser", e.getMessage());
                        return;
                    }
                }
                c2071l.f4624l |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                c2071l.f4610l = license(str2);
                c2071l.f4624l |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                c2071l.f4631l = i;
                if (i != 0) {
                    c2071l.f4624l |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i2 = 4;
                        break;
                    case "underline":
                        i2 = 2;
                        break;
                    case "none":
                        i2 = 1;
                        break;
                    case "blink":
                        i2 = 5;
                        break;
                    case "overline":
                        i2 = 3;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                c2071l.f4643l = i2;
                if (i2 != 0) {
                    c2071l.f4624l |= 131072;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            c2071l.f4617l = Boolean.valueOf(!str2.equals("none"));
                            c2071l.f4624l |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    AbstractC18728l abstractC18728lPro = pro(str2);
                    c2071l.f4623l = abstractC18728lPro;
                    if (abstractC18728lPro != null) {
                        c2071l.f4624l |= 1;
                    }
                    break;
                case 16:
                    int i9 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    c2071l.f4645l = i9;
                    if (i9 != 0) {
                        c2071l.f4624l |= 2;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Float fLicense = license(str2);
                    c2071l.f4614l = fLicense;
                    if (fLicense != null) {
                        c2071l.f4624l |= 4;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        C11522l c11522l2 = new C11522l(str2);
                        Integer num = null;
                        String str3 = null;
                        int i10 = 0;
                        while (true) {
                            strM3105else = c11522l2.m3105else('/', false);
                            c11522l2.m3122super();
                            if (strM3105else == null) {
                                break;
                            } else if (num == null || i10 == 0) {
                                if (!strM3105else.equals("normal") && (num != null || (num = (Integer) AbstractC6667l.yandex.get(strM3105else)) == null)) {
                                    if (i10 == 0) {
                                        switch (strM3105else) {
                                            case "oblique":
                                                i10 = 3;
                                                break;
                                            case "italic":
                                                i10 = 2;
                                                break;
                                            case "normal":
                                                i10 = 1;
                                                break;
                                            default:
                                                i10 = 0;
                                                break;
                                        }
                                        if (i10 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strM3105else.equals("small-caps")) {
                                        str3 = strM3105else;
                                    }
                                }
                            }
                        }
                        try {
                            c12671lSubscription = (C12671l) AbstractC12318l.yandex.get(strM3105else);
                            if (c12671lSubscription == null) {
                                c12671lSubscription = subscription(strM3105else);
                            }
                        } catch (C16376l unused) {
                            c12671lSubscription = null;
                        }
                        if (c11522l2.Signature('/')) {
                            c11522l2.m3122super();
                            String strM3100catch = c11522l2.m3100catch();
                            if (strM3100catch != null) {
                                subscription(strM3100catch);
                            }
                            c11522l2.m3122super();
                        }
                        if (c11522l2.advert()) {
                            strSubstring = null;
                        } else {
                            int i11 = c11522l2.loadAd;
                            c11522l2.loadAd = c11522l2.crashlytics;
                            strSubstring = ((String) c11522l2.amazon).substring(i11);
                        }
                        c2071l.f4638l = adcel(strSubstring);
                        c2071l.f4613l = c12671lSubscription;
                        c2071l.f4644l = Integer.valueOf(num == null ? 400 : num.intValue());
                        c2071l.f4609l = i10 == 0 ? 1 : i10;
                        c2071l.f4624l |= 122880;
                        break;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    ArrayList arrayListAdcel = adcel(str2);
                    c2071l.f4638l = arrayListAdcel;
                    if (arrayListAdcel != null) {
                        c2071l.f4624l |= 8192;
                    }
                    break;
                case 20:
                    try {
                        C12671l c12671l = (C12671l) AbstractC12318l.yandex.get(str2);
                        c12671lSubscription2 = c12671l == null ? subscription(str2) : c12671l;
                    } catch (C16376l unused2) {
                        c12671lSubscription2 = null;
                    }
                    c2071l.f4613l = c12671lSubscription2;
                    if (c12671lSubscription2 != null) {
                        c2071l.f4624l |= 16384;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) AbstractC6667l.yandex.get(str2);
                    c2071l.f4644l = num2;
                    if (num2 != null) {
                        c2071l.f4624l |= 32768;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i3 = 3;
                            break;
                        case "italic":
                            i3 = 2;
                            break;
                        case "normal":
                            i3 = 1;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    c2071l.f4609l = i3;
                    if (i3 != 0) {
                        c2071l.f4624l |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            switch (str2) {
                                case "optimizeQuality":
                                    i4 = 2;
                                    break;
                                case "auto":
                                    i4 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i4 = 3;
                                    break;
                                default:
                                    i4 = 0;
                                    break;
                            }
                            c2071l.f4611l = i4;
                            if (i4 != 0) {
                                c2071l.f4624l |= 137438953472L;
                            }
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            String strAds = ads(str2);
                            c2071l.f4626l = strAds;
                            c2071l.f4646l = strAds;
                            c2071l.f4625l = strAds;
                            c2071l.f4624l |= 14680064;
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            c2071l.f4626l = ads(str2);
                            c2071l.f4624l |= 2097152;
                            break;
                        case 30:
                            c2071l.f4646l = ads(str2);
                            c2071l.f4624l |= 4194304;
                            break;
                        case 31:
                            c2071l.f4625l = ads(str2);
                            c2071l.f4624l |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        c2071l.f4612l = c2128l;
                                    } else {
                                        try {
                                            c2071l.f4612l = vip(str2);
                                        } catch (C16376l e2) {
                                            Log.w("SVGParser", e2.getMessage());
                                            return;
                                        }
                                    }
                                    c2071l.f4624l |= 67108864;
                                    break;
                                case 63:
                                    c2071l.f4647l = license(str2);
                                    c2071l.f4624l |= 134217728;
                                    break;
                                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                    AbstractC18728l abstractC18728lPro2 = pro(str2);
                                    c2071l.f4634l = abstractC18728lPro2;
                                    if (abstractC18728lPro2 != null) {
                                        c2071l.f4624l |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        C11522l c11522l3 = new C11522l(str2);
                                        c11522l3.m3122super();
                                        if (c11522l3.advert() || (c12671lM3109for = c11522l3.m3109for()) == null || c12671lM3109for.billing()) {
                                            c12671lArr = null;
                                        } else {
                                            float f = c12671lM3109for.f24959l;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(c12671lM3109for);
                                            while (true) {
                                                if (!c11522l3.advert()) {
                                                    c11522l3.m3110goto();
                                                    C12671l c12671lM3109for2 = c11522l3.m3109for();
                                                    if (c12671lM3109for2 != null && !c12671lM3109for2.billing()) {
                                                        arrayList.add(c12671lM3109for2);
                                                        f += c12671lM3109for2.f24959l;
                                                    }
                                                } else if (f != 0.0f) {
                                                    c12671lArr = (C12671l[]) arrayList.toArray(new C12671l[arrayList.size()]);
                                                }
                                                c12671lArr = null;
                                            }
                                        }
                                        c2071l.f4618l = c12671lArr;
                                        if (c12671lArr != null) {
                                            c2071l.f4624l |= 512;
                                        }
                                    } else {
                                        c2071l.f4618l = null;
                                        c2071l.f4624l |= 512;
                                    }
                                    break;
                                case 66:
                                    c2071l.f4640l = subscription(str2);
                                    c2071l.f4624l |= 1024;
                                    break;
                                case 67:
                                    if ("butt".equals(str2)) {
                                        i5 = 1;
                                    } else if ("round".equals(str2)) {
                                        i5 = 2;
                                    } else {
                                        i5 = "square".equals(str2) ? 3 : 0;
                                    }
                                    c2071l.f4627l = i5;
                                    if (i5 != 0) {
                                        c2071l.f4624l |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        i6 = 1;
                                    } else if ("round".equals(str2)) {
                                        i6 = 2;
                                    } else {
                                        i6 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    c2071l.f4639l = i6;
                                    if (i6 != 0) {
                                        c2071l.f4624l |= 128;
                                    }
                                    break;
                                case 69:
                                    c2071l.f4615l = Float.valueOf(startapp(str2));
                                    c2071l.f4624l |= 256;
                                    break;
                                case 70:
                                    Float fLicense2 = license(str2);
                                    c2071l.f4633l = fLicense2;
                                    if (fLicense2 != null) {
                                        c2071l.f4624l |= 16;
                                    }
                                    break;
                                case 71:
                                    c2071l.f4641l = subscription(str2);
                                    c2071l.f4624l |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                c2071l.f4628l = c2128l;
                                            } else {
                                                try {
                                                    c2071l.f4628l = vip(str2);
                                                } catch (C16376l e3) {
                                                    Log.w("SVGParser", e3.getMessage());
                                                    return;
                                                }
                                            }
                                            c2071l.f4624l |= 8589934592L;
                                            break;
                                        case 89:
                                            c2071l.f4635l = license(str2);
                                            c2071l.f4624l |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    c2071l.f4616l = Boolean.valueOf(str2.equals("visible"));
                                                    c2071l.f4624l |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (C16376l unused3) {
        }
    }

    public static void billing(InterfaceC15969l interfaceC15969l, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iSmaato = AbstractC0653l.smaato(attributes, i);
            if (iSmaato != 73) {
                switch (iSmaato) {
                    case 52:
                        C11522l c11522l = new C11522l(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!c11522l.advert()) {
                            String strM3100catch = c11522l.m3100catch();
                            if (strM3100catch.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strM3100catch.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c11522l.m3122super();
                        }
                        interfaceC15969l.amazon(hashSet);
                        break;
                    case 53:
                        interfaceC15969l.admob(strTrim);
                        break;
                    case 54:
                        C11522l c11522l2 = new C11522l(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!c11522l2.advert()) {
                            hashSet2.add(c11522l2.m3100catch());
                            c11522l2.m3122super();
                        }
                        interfaceC15969l.subs(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListAdcel = adcel(strTrim);
                        interfaceC15969l.mopub(arrayListAdcel != null ? new HashSet(arrayListAdcel) : new HashSet(0));
                        break;
                }
            } else {
                C11522l c11522l3 = new C11522l(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!c11522l3.advert()) {
                    String strM3100catch2 = c11522l3.m3100catch();
                    int iIndexOf = strM3100catch2.indexOf(45);
                    if (iIndexOf != -1) {
                        strM3100catch2 = strM3100catch2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strM3100catch2, "", "").getLanguage());
                    c11522l3.m3122super();
                }
                interfaceC15969l.isPro(hashSet3);
            }
        }
    }

    public static void firebase(AbstractC10714l abstractC10714l, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iSmaato = AbstractC0653l.smaato(attributes, i);
            if (iSmaato == 9) {
                abstractC10714l.startapp = tapsense(strTrim);
            } else if (iSmaato == 10) {
                abstractC10714l.adcel = tapsense(strTrim);
            } else if (iSmaato == 82) {
                abstractC10714l.vip = tapsense(strTrim);
            } else if (iSmaato == 83) {
                abstractC10714l.metrica = tapsense(strTrim);
            }
        }
    }

    public static void isPro(AbstractC12707l abstractC12707l, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iSmaato = AbstractC0653l.smaato(attributes, i);
                if (iSmaato == 0) {
                    C15154l c15154l = new C15154l(strTrim);
                    ArrayList arrayList = null;
                    while (!c15154l.advert()) {
                        String strM3100catch = c15154l.m3100catch();
                        if (strM3100catch != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strM3100catch);
                            c15154l.m3122super();
                        }
                    }
                    abstractC12707l.mopub = arrayList;
                } else if (iSmaato != 72) {
                    if (abstractC12707l.purchase == null) {
                        abstractC12707l.purchase = new C2071l();
                    }
                    applovin(abstractC12707l.purchase, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C11522l c11522l = new C11522l(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strM3105else = c11522l.m3105else(':', false);
                        c11522l.m3122super();
                        if (!c11522l.Signature(':')) {
                            break;
                        }
                        c11522l.m3122super();
                        String strM3105else2 = c11522l.m3105else(';', true);
                        if (strM3105else2 == null) {
                            break;
                        }
                        c11522l.m3122super();
                        if (c11522l.advert() || c11522l.Signature(';')) {
                            if (abstractC12707l.billing == null) {
                                abstractC12707l.billing = new C2071l();
                            }
                            applovin(abstractC12707l.billing, strM3105else, strM3105else2);
                            c11522l.m3122super();
                        }
                    }
                }
            }
        }
    }

    public static Matrix isVip(String str) throws C16376l {
        Matrix matrix = new Matrix();
        C11522l c11522l = new C11522l(str);
        c11522l.m3122super();
        while (!c11522l.advert()) {
            String str2 = (String) c11522l.amazon;
            String strSubstring = null;
            if (!c11522l.advert()) {
                int i = c11522l.loadAd;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c11522l.admob();
                    }
                }
                int i2 = c11522l.loadAd;
                while (C11522l.m3095strictfp(iCharAt)) {
                    iCharAt = c11522l.admob();
                }
                if (iCharAt == 40) {
                    c11522l.loadAd++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    c11522l.loadAd = i;
                }
            }
            if (strSubstring == null) {
                throw new C16376l("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c11522l.m3122super();
                    float fM3106extends = c11522l.m3106extends();
                    c11522l.m3110goto();
                    float fM3106extends2 = c11522l.m3106extends();
                    c11522l.m3110goto();
                    float fM3106extends3 = c11522l.m3106extends();
                    c11522l.m3110goto();
                    float fM3106extends4 = c11522l.m3106extends();
                    c11522l.m3110goto();
                    float fM3106extends5 = c11522l.m3106extends();
                    c11522l.m3110goto();
                    float fM3106extends6 = c11522l.m3106extends();
                    c11522l.m3122super();
                    if (Float.isNaN(fM3106extends6) || !c11522l.Signature(')')) {
                        throw new C16376l("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM3106extends, fM3106extends3, fM3106extends5, fM3106extends2, fM3106extends4, fM3106extends6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c11522l.m3122super();
                    float fM3106extends7 = c11522l.m3106extends();
                    float fM3114interface = c11522l.m3114interface();
                    float fM3114interface2 = c11522l.m3114interface();
                    c11522l.m3122super();
                    if (Float.isNaN(fM3106extends7) || !c11522l.Signature(')')) {
                        throw new C16376l("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM3114interface)) {
                        matrix.preRotate(fM3106extends7);
                    } else {
                        if (Float.isNaN(fM3114interface2)) {
                            throw new C16376l("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fM3106extends7, fM3114interface, fM3114interface2);
                    }
                    break;
                    break;
                case "scale":
                    c11522l.m3122super();
                    float fM3106extends8 = c11522l.m3106extends();
                    float fM3114interface3 = c11522l.m3114interface();
                    c11522l.m3122super();
                    if (Float.isNaN(fM3106extends8) || !c11522l.Signature(')')) {
                        throw new C16376l("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM3114interface3)) {
                        matrix.preScale(fM3106extends8, fM3114interface3);
                    } else {
                        matrix.preScale(fM3106extends8, fM3106extends8);
                    }
                    break;
                    break;
                case "skewX":
                    c11522l.m3122super();
                    float fM3106extends9 = c11522l.m3106extends();
                    c11522l.m3122super();
                    if (Float.isNaN(fM3106extends9) || !c11522l.Signature(')')) {
                        throw new C16376l("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM3106extends9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c11522l.m3122super();
                    float fM3106extends10 = c11522l.m3106extends();
                    c11522l.m3122super();
                    if (Float.isNaN(fM3106extends10) || !c11522l.Signature(')')) {
                        throw new C16376l("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM3106extends10)));
                    break;
                    break;
                case "translate":
                    c11522l.m3122super();
                    float fM3106extends11 = c11522l.m3106extends();
                    float fM3114interface4 = c11522l.m3114interface();
                    c11522l.m3122super();
                    if (Float.isNaN(fM3106extends11) || !c11522l.Signature(')')) {
                        throw new C16376l("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM3114interface4)) {
                        matrix.preTranslate(fM3106extends11, fM3114interface4);
                    } else {
                        matrix.preTranslate(fM3106extends11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C16376l(AbstractC15560l.Signature("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (c11522l.advert()) {
                return matrix;
            }
            c11522l.m3110goto();
        }
        return matrix;
    }

    public static Float license(String str) {
        try {
            float fStartapp = startapp(str);
            float f = 0.0f;
            if (fStartapp < 0.0f) {
                fStartapp = f;
            } else {
                f = 1.0f;
                if (fStartapp > 1.0f) {
                    fStartapp = f;
                }
            }
            return Float.valueOf(fStartapp);
        } catch (C16376l unused) {
            return null;
        }
    }

    public static int loadAd(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static float metrica(int i, String str) throws C16376l {
        float fPremium = new C14513l((byte) 0, 2).premium(0, i, str);
        if (Float.isNaN(fPremium)) {
            throw new C16376l(AbstractC14814l.startapp("Invalid float value: ", str));
        }
        return fPremium;
    }

    public static void mopub(AbstractC12707l abstractC12707l, Attributes attributes) throws C16376l {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC12707l.crashlytics = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    abstractC12707l.amazon = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new C16376l(AbstractC14814l.startapp("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC12707l.amazon = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static AbstractC18728l pro(String str) {
        boolean zStartsWith = str.startsWith("url(");
        AbstractC18728l abstractC18728lVip = C13555l.f26572l;
        C2128l c2128l = C2128l.f4766l;
        AbstractC18728l abstractC18728l = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return abstractC18728lVip;
            }
            if (str.equals("currentColor")) {
                return c2128l;
            }
            try {
                return vip(str);
            } catch (C16376l unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new C0172l(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    abstractC18728lVip = c2128l;
                } else {
                    try {
                        abstractC18728lVip = vip(strTrim2);
                    } catch (C16376l unused2) {
                        abstractC18728lVip = null;
                    }
                }
            }
            abstractC18728l = abstractC18728lVip;
        }
        return new C0172l(strTrim, abstractC18728l);
    }

    public static float purchase(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return AbstractC4338l.Signature(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? AbstractC4338l.Signature(4.0f, f3, f2 - f, f) : f;
    }

    public static void remoteconfig(AbstractC13951l abstractC13951l, Attributes attributes) throws C16376l {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iSmaato = AbstractC0653l.smaato(attributes, i);
            if (iSmaato == 48) {
                ad(abstractC13951l, strTrim);
            } else if (iSmaato != 80) {
                continue;
            } else {
                C11522l c11522l = new C11522l(strTrim);
                c11522l.m3122super();
                float fM3106extends = c11522l.m3106extends();
                c11522l.m3110goto();
                float fM3106extends2 = c11522l.m3106extends();
                c11522l.m3110goto();
                float fM3106extends3 = c11522l.m3106extends();
                c11522l.m3110goto();
                float fM3106extends4 = c11522l.m3106extends();
                if (Float.isNaN(fM3106extends) || Float.isNaN(fM3106extends2) || Float.isNaN(fM3106extends3) || Float.isNaN(fM3106extends4)) {
                    C11983l.pro("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fM3106extends3 < 0.0f) {
                    C11983l.pro("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fM3106extends4 < 0.0f) {
                        C11983l.pro("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    abstractC13951l.metrica = new C10006l(fM3106extends, fM3106extends2, fM3106extends3, fM3106extends4);
                }
            }
        }
    }

    public static void smaato(InterfaceC8761l interfaceC8761l, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC14410l.yandex(attributes.getLocalName(i)) == EnumC14410l.f28222l) {
                interfaceC8761l.firebase(isVip(attributes.getValue(i)));
            }
        }
    }

    public static float startapp(String str) throws C16376l {
        int length = str.length();
        if (length != 0) {
            return metrica(length, str);
        }
        C11983l.pro("Invalid float value (empty string)");
        return 0.0f;
    }

    public static void subs(C15075l c15075l, Attributes attributes, String str) throws C16376l {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC14410l.yandex(attributes.getLocalName(i)) == EnumC14410l.f28223l) {
                C11522l c11522l = new C11522l(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c11522l.m3122super();
                while (!c11522l.advert()) {
                    float fM3106extends = c11522l.m3106extends();
                    if (Float.isNaN(fM3106extends)) {
                        throw new C16376l(AbstractC15560l.Signature("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c11522l.m3110goto();
                    float fM3106extends2 = c11522l.m3106extends();
                    if (Float.isNaN(fM3106extends2)) {
                        throw new C16376l(AbstractC15560l.Signature("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c11522l.m3110goto();
                    arrayList.add(Float.valueOf(fM3106extends));
                    arrayList.add(Float.valueOf(fM3106extends2));
                }
                c15075l.metrica = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c15075l.metrica[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static C12671l subscription(String str) throws C16376l {
        int iIsVip;
        if (str.length() == 0) {
            C11983l.pro("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iIsVip = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iIsVip = AbstractC0653l.isVip(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C16376l("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iIsVip = 1;
        }
        try {
            return new C12671l(iIsVip, metrica(length, str));
        } catch (NumberFormatException e) {
            throw new C16376l("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList tapsense(String str) throws C16376l {
        if (str.length() == 0) {
            C11983l.pro("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        C11522l c11522l = new C11522l(str);
        c11522l.m3122super();
        while (!c11522l.advert()) {
            float fM3106extends = c11522l.m3106extends();
            if (Float.isNaN(fM3106extends)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) c11522l.amazon;
                int i = c11522l.loadAd;
                while (!c11522l.advert() && !C11522l.m3095strictfp(str2.charAt(c11522l.loadAd))) {
                    c11522l.loadAd++;
                }
                String strSubstring = str2.substring(i, c11522l.loadAd);
                c11522l.loadAd = i;
                sb.append(strSubstring);
                throw new C16376l(sb.toString());
            }
            int iM3099case = c11522l.m3099case();
            if (iM3099case == 0) {
                iM3099case = 1;
            }
            arrayList.add(new C12671l(iM3099case, fM3106extends));
            c11522l.m3110goto();
        }
        return arrayList;
    }

    public static C13555l vip(String str) throws C16376l {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C8128l c8128l = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i = cCharAt - 'a';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i2++;
                        }
                    }
                    if (i2 != 1) {
                        c8128l = new C8128l(j2, i2);
                    }
                }
            }
            if (c8128l == null) {
                throw new C16376l("Bad hex colour value: ".concat(str));
            }
            long j3 = c8128l.f16931l;
            int i3 = c8128l.f16932l;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new C13555l(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new C13555l(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new C16376l("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new C13555l((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new C13555l((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            C11522l c11522l = new C11522l(str.substring(zStartsWith ? 5 : 4));
            c11522l.m3122super();
            float fM3106extends = c11522l.m3106extends();
            if (!Float.isNaN(fM3106extends) && c11522l.Signature('%')) {
                fM3106extends = (fM3106extends * 256.0f) / 100.0f;
            }
            float fFirebase = c11522l.firebase(fM3106extends);
            if (!Float.isNaN(fFirebase) && c11522l.Signature('%')) {
                fFirebase = (fFirebase * 256.0f) / 100.0f;
            }
            float fFirebase2 = c11522l.firebase(fFirebase);
            if (!Float.isNaN(fFirebase2) && c11522l.Signature('%')) {
                fFirebase2 = (fFirebase2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                c11522l.m3122super();
                if (Float.isNaN(fFirebase2) || !c11522l.Signature(')')) {
                    throw new C16376l("Bad rgb() colour value: ".concat(str));
                }
                return new C13555l((loadAd(fM3106extends) << 16) | (-16777216) | (loadAd(fFirebase) << 8) | loadAd(fFirebase2));
            }
            float fFirebase3 = c11522l.firebase(fFirebase2);
            c11522l.m3122super();
            if (Float.isNaN(fFirebase3) || !c11522l.Signature(')')) {
                throw new C16376l("Bad rgba() colour value: ".concat(str));
            }
            return new C13555l((loadAd(fFirebase3 * 256.0f) << 24) | (loadAd(fM3106extends) << 16) | (loadAd(fFirebase) << 8) | loadAd(fFirebase2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) AbstractC9705l.yandex.get(lowerCase);
            if (num != null) {
                return new C13555l(num.intValue());
            }
            throw new C16376l("Invalid colour keyword: ".concat(lowerCase));
        }
        C11522l c11522l2 = new C11522l(str.substring(zStartsWith2 ? 5 : 4));
        c11522l2.m3122super();
        float fM3106extends2 = c11522l2.m3106extends();
        float fFirebase4 = c11522l2.firebase(fM3106extends2);
        if (!Float.isNaN(fFirebase4)) {
            c11522l2.Signature('%');
        }
        float fFirebase5 = c11522l2.firebase(fFirebase4);
        if (!Float.isNaN(fFirebase5)) {
            c11522l2.Signature('%');
        }
        if (!zStartsWith2) {
            c11522l2.m3122super();
            if (Float.isNaN(fFirebase5) || !c11522l2.Signature(')')) {
                throw new C16376l("Bad hsl() colour value: ".concat(str));
            }
            return new C13555l(amazon(fM3106extends2, fFirebase4, fFirebase5) | (-16777216));
        }
        float fFirebase6 = c11522l2.firebase(fFirebase5);
        c11522l2.m3122super();
        if (Float.isNaN(fFirebase6) || !c11522l2.Signature(')')) {
            throw new C16376l("Bad hsla() colour value: ".concat(str));
        }
        return new C13555l((loadAd(fFirebase6 * 256.0f) << 24) | amazon(fM3106extends2, fFirebase4, fFirebase5));
    }

    public final void appmetrica() {
        C4816l c4816l = new C4816l(4, false);
        c4816l.f9860l = null;
        c4816l.f9859l = new C3927l(0);
        c4816l.f9862l = new HashMap();
        this.yandex = c4816l;
    }

    public final void crashlytics(String str, String str2, String str3) {
        if (this.crashlytics) {
            int i = this.amazon - 1;
            this.amazon = i;
            if (i == 0) {
                this.crashlytics = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            EnumC2909l enumC2909l = (EnumC2909l) EnumC2909l.f6323l.get(str2);
            if (enumC2909l == null) {
                enumC2909l = EnumC2909l.f6324l;
            }
            switch (enumC2909l.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case 20:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                    this.loadAd = ((AbstractC15046l) this.loadAd).loadAd;
                    break;
                case 5:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    this.purchase = false;
                    if (this.mopub != null) {
                        EnumC2909l enumC2909l2 = this.billing;
                        if (enumC2909l2 == EnumC2909l.f6320l || enumC2909l2 == EnumC2909l.f6322l) {
                            this.yandex.getClass();
                        }
                        this.mopub.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.subs;
                    if (sb != null) {
                        this.admob = false;
                        String string = sb.toString();
                        appmetrica appmetricaVar = new appmetrica(1, 3);
                        C4816l c4816l = this.yandex;
                        C15154l c15154l = new C15154l(string);
                        c15154l.m3122super();
                        ((C3927l) c4816l.f9859l).loadAd(appmetricaVar.ad(c15154l));
                        this.subs.setLength(0);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:375:0x06cb A[PHI: r1
  0x06cb: PHI (r1v51 int) = (r1v50 int), (r1v52 int), (r1v52 int), (r1v52 int), (r1v50 int) binds: [B:360:0x0673, B:830:0x06cb, B:382:0x06f3, B:374:0x06b8, B:364:0x0682] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:456:0x0923  */
    /* JADX WARN: Code duplicated, block: B:459:0x092a  */
    /* JADX WARN: Code duplicated, block: B:829:0x0966 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:0x094a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void inmobi(String str, String str2, String str3, Attributes attributes) throws C16376l {
        int i;
        char c;
        float fM3106extends;
        float f;
        int i2;
        char cCharAt;
        byte b;
        if (this.crashlytics) {
            this.amazon++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            EnumC2909l enumC2909l = (EnumC2909l) EnumC2909l.f6323l.get(str2.length() > 0 ? str2 : str3);
            if (enumC2909l == null) {
                enumC2909l = EnumC2909l.f6324l;
            }
            int i3 = 77;
            byte b2 = 0;
            switch (enumC2909l.ordinal()) {
                case 0:
                    C15965l c15965l = new C15965l();
                    c15965l.yandex = this.yandex;
                    c15965l.loadAd = this.loadAd;
                    mopub(c15965l, attributes);
                    isPro(c15965l, attributes);
                    billing(c15965l, attributes);
                    remoteconfig(c15965l, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim = attributes.getValue(i4).trim();
                        int iSmaato = AbstractC0653l.smaato(attributes, i4);
                        if (iSmaato == 25) {
                            C12671l c12671lSubscription = subscription(strTrim);
                            c15965l.subscription = c12671lSubscription;
                            if (c12671lSubscription.billing()) {
                                C11983l.pro("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (iSmaato != 79) {
                            switch (iSmaato) {
                                case 81:
                                    C12671l c12671lSubscription2 = subscription(strTrim);
                                    c15965l.ads = c12671lSubscription2;
                                    if (c12671lSubscription2.billing()) {
                                        C11983l.pro("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    c15965l.startapp = subscription(strTrim);
                                    break;
                                case 83:
                                    c15965l.adcel = subscription(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    InterfaceC0308l interfaceC0308l = this.loadAd;
                    if (interfaceC0308l == null) {
                        this.yandex.f9860l = c15965l;
                    } else {
                        interfaceC0308l.purchase(c15965l);
                    }
                    this.loadAd = c15965l;
                    return;
                case 1:
                case 7:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C7471l c7471l = new C7471l();
                    c7471l.yandex = this.yandex;
                    c7471l.loadAd = this.loadAd;
                    mopub(c7471l, attributes);
                    isPro(c7471l, attributes);
                    smaato(c7471l, attributes);
                    billing(c7471l, attributes);
                    this.loadAd.purchase(c7471l);
                    this.loadAd = c7471l;
                    return;
                case 2:
                    InterfaceC0308l interfaceC0308l2 = this.loadAd;
                    if (interfaceC0308l2 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C5540l c5540l = new C5540l();
                    c5540l.yandex = this.yandex;
                    c5540l.loadAd = interfaceC0308l2;
                    mopub(c5540l, attributes);
                    isPro(c5540l, attributes);
                    smaato(c5540l, attributes);
                    billing(c5540l, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim2 = attributes.getValue(i5).trim();
                        int iSmaato2 = AbstractC0653l.smaato(attributes, i5);
                        if (iSmaato2 == 6) {
                            c5540l.metrica = subscription(strTrim2);
                        } else if (iSmaato2 == 7) {
                            c5540l.startapp = subscription(strTrim2);
                        } else if (iSmaato2 != 49) {
                            continue;
                        } else {
                            C12671l c12671lSubscription3 = subscription(strTrim2);
                            c5540l.adcel = c12671lSubscription3;
                            if (c12671lSubscription3.billing()) {
                                C11983l.pro("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.loadAd.purchase(c5540l);
                    return;
                case 3:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C11932l c11932l = new C11932l();
                    c11932l.yandex = this.yandex;
                    c11932l.loadAd = this.loadAd;
                    mopub(c11932l, attributes);
                    isPro(c11932l, attributes);
                    smaato(c11932l, attributes);
                    billing(c11932l, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim3 = attributes.getValue(i6).trim();
                        if (AbstractC0653l.smaato(attributes, i6) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                c11932l.metrica = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    C11983l.pro("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                c11932l.metrica = Boolean.TRUE;
                            }
                        }
                    }
                    this.loadAd.purchase(c11932l);
                    this.loadAd = c11932l;
                    return;
                case 4:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C1808l c1808l = new C1808l();
                    c1808l.yandex = this.yandex;
                    c1808l.loadAd = this.loadAd;
                    mopub(c1808l, attributes);
                    isPro(c1808l, attributes);
                    smaato(c1808l, attributes);
                    this.loadAd.purchase(c1808l);
                    this.loadAd = c1808l;
                    return;
                case 5:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    this.purchase = true;
                    this.billing = enumC2909l;
                    return;
                case 6:
                    InterfaceC0308l interfaceC0308l3 = this.loadAd;
                    if (interfaceC0308l3 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C13233l c13233l = new C13233l();
                    c13233l.yandex = this.yandex;
                    c13233l.loadAd = interfaceC0308l3;
                    mopub(c13233l, attributes);
                    isPro(c13233l, attributes);
                    smaato(c13233l, attributes);
                    billing(c13233l, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim4 = attributes.getValue(i7).trim();
                        int iSmaato3 = AbstractC0653l.smaato(attributes, i7);
                        if (iSmaato3 == 6) {
                            c13233l.metrica = subscription(strTrim4);
                        } else if (iSmaato3 == 7) {
                            c13233l.startapp = subscription(strTrim4);
                        } else if (iSmaato3 == 56) {
                            C12671l c12671lSubscription4 = subscription(strTrim4);
                            c13233l.adcel = c12671lSubscription4;
                            if (c12671lSubscription4.billing()) {
                                C11983l.pro("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (iSmaato3 != 57) {
                            continue;
                        } else {
                            C12671l c12671lSubscription5 = subscription(strTrim4);
                            c13233l.ads = c12671lSubscription5;
                            if (c12671lSubscription5.billing()) {
                                C11983l.pro("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.loadAd.purchase(c13233l);
                    return;
                case 8:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C7556l c7556l = new C7556l();
                    c7556l.yandex = this.yandex;
                    c7556l.loadAd = this.loadAd;
                    mopub(c7556l, attributes);
                    isPro(c7556l, attributes);
                    smaato(c7556l, attributes);
                    billing(c7556l, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim5 = attributes.getValue(i8).trim();
                        int iSmaato4 = AbstractC0653l.smaato(attributes, i8);
                        if (iSmaato4 == 25) {
                            C12671l c12671lSubscription6 = subscription(strTrim5);
                            c7556l.subscription = c12671lSubscription6;
                            if (c12671lSubscription6.billing()) {
                                C11983l.pro("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iSmaato4 != 26) {
                            if (iSmaato4 != 48) {
                                switch (iSmaato4) {
                                    case 81:
                                        C12671l c12671lSubscription7 = subscription(strTrim5);
                                        c7556l.ads = c12671lSubscription7;
                                        if (c12671lSubscription7.billing()) {
                                            C11983l.pro("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        c7556l.startapp = subscription(strTrim5);
                                        break;
                                    case 83:
                                        c7556l.adcel = subscription(strTrim5);
                                        break;
                                }
                            } else {
                                ad(c7556l, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i8)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) {
                            c7556l.metrica = strTrim5;
                        }
                    }
                    this.loadAd.purchase(c7556l);
                    this.loadAd = c7556l;
                    return;
                case 9:
                    InterfaceC0308l interfaceC0308l4 = this.loadAd;
                    if (interfaceC0308l4 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C5474l c5474l = new C5474l();
                    c5474l.yandex = this.yandex;
                    c5474l.loadAd = interfaceC0308l4;
                    mopub(c5474l, attributes);
                    isPro(c5474l, attributes);
                    smaato(c5474l, attributes);
                    billing(c5474l, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim6 = attributes.getValue(i9).trim();
                        switch (AbstractC0653l.smaato(attributes, i9)) {
                            case 84:
                                c5474l.metrica = subscription(strTrim6);
                                break;
                            case 85:
                                c5474l.startapp = subscription(strTrim6);
                                break;
                            case 86:
                                c5474l.adcel = subscription(strTrim6);
                                break;
                            case 87:
                                c5474l.ads = subscription(strTrim6);
                                break;
                        }
                    }
                    this.loadAd.purchase(c5474l);
                    return;
                case 10:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C9766l c9766l = new C9766l();
                    c9766l.yandex = this.yandex;
                    c9766l.loadAd = this.loadAd;
                    mopub(c9766l, attributes);
                    isPro(c9766l, attributes);
                    admob(c9766l, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim7 = attributes.getValue(i10).trim();
                        switch (AbstractC0653l.smaato(attributes, i10)) {
                            case 84:
                                c9766l.remoteconfig = subscription(strTrim7);
                                break;
                            case 85:
                                c9766l.vip = subscription(strTrim7);
                                break;
                            case 86:
                                c9766l.metrica = subscription(strTrim7);
                                break;
                            case 87:
                                c9766l.startapp = subscription(strTrim7);
                                break;
                        }
                    }
                    this.loadAd.purchase(c9766l);
                    this.loadAd = c9766l;
                    return;
                case 11:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C15662l c15662l = new C15662l();
                    c15662l.yandex = this.yandex;
                    c15662l.loadAd = this.loadAd;
                    mopub(c15662l, attributes);
                    isPro(c15662l, attributes);
                    billing(c15662l, attributes);
                    remoteconfig(c15662l, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim8 = attributes.getValue(i11).trim();
                        int iSmaato5 = AbstractC0653l.smaato(attributes, i11);
                        if (iSmaato5 != 41) {
                            if (iSmaato5 == 50) {
                                c15662l.adcel = subscription(strTrim8);
                            } else if (iSmaato5 != 51) {
                                switch (iSmaato5) {
                                    case 32:
                                        C12671l c12671lSubscription8 = subscription(strTrim8);
                                        c15662l.tapsense = c12671lSubscription8;
                                        if (c12671lSubscription8.billing()) {
                                            C11983l.pro("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        continue;
                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                        if ("strokeWidth".equals(strTrim8)) {
                                            c15662l.startapp = false;
                                            continue;
                                        } else {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                C11983l.pro("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                            c15662l.startapp = true;
                                        }
                                        break;
                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                        C12671l c12671lSubscription9 = subscription(strTrim8);
                                        c15662l.subscription = c12671lSubscription9;
                                        if (c12671lSubscription9.billing()) {
                                            C11983l.pro("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                }
                            } else {
                                c15662l.ads = subscription(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            c15662l.Signature = Float.valueOf(Float.NaN);
                        } else {
                            c15662l.Signature = Float.valueOf(startapp(strTrim8));
                        }
                    }
                    this.loadAd.purchase(c15662l);
                    this.loadAd = c15662l;
                    return;
                case 12:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C6250l c6250l = new C6250l();
                    c6250l.yandex = this.yandex;
                    c6250l.loadAd = this.loadAd;
                    mopub(c6250l, attributes);
                    isPro(c6250l, attributes);
                    billing(c6250l, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim9 = attributes.getValue(i12).trim();
                        int iSmaato6 = AbstractC0653l.smaato(attributes, i12);
                        if (iSmaato6 == 25) {
                            C12671l c12671lSubscription10 = subscription(strTrim9);
                            c6250l.adcel = c12671lSubscription10;
                            if (c12671lSubscription10.billing()) {
                                C11983l.pro("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (iSmaato6 != 36) {
                            if (iSmaato6 != 37) {
                                switch (iSmaato6) {
                                    case 81:
                                        C12671l c12671lSubscription11 = subscription(strTrim9);
                                        c6250l.startapp = c12671lSubscription11;
                                        if (c12671lSubscription11.billing()) {
                                            C11983l.pro("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        subscription(strTrim9);
                                        break;
                                    case 83:
                                        subscription(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                c6250l.vip = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    C11983l.pro("Invalid value for attribute maskUnits");
                                    return;
                                }
                                c6250l.vip = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            c6250l.metrica = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                C11983l.pro("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            c6250l.metrica = Boolean.TRUE;
                        }
                    }
                    this.loadAd.purchase(c6250l);
                    this.loadAd = c6250l;
                    return;
                case 13:
                    InterfaceC0308l interfaceC0308l5 = this.loadAd;
                    if (interfaceC0308l5 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C10878l c10878l = new C10878l();
                    c10878l.yandex = this.yandex;
                    c10878l.loadAd = interfaceC0308l5;
                    mopub(c10878l, attributes);
                    isPro(c10878l, attributes);
                    smaato(c10878l, attributes);
                    billing(c10878l, attributes);
                    int i13 = 0;
                    while (i13 < attributes.getLength()) {
                        String strTrim10 = attributes.getValue(i13).trim();
                        int iSmaato7 = AbstractC0653l.smaato(attributes, i13);
                        if (iSmaato7 == 13) {
                            C11522l c11522l = new C11522l(strTrim10);
                            C11522l c11522l2 = new C11522l(b2, 4);
                            c11522l2.loadAd = b2;
                            c11522l2.crashlytics = b2;
                            c11522l2.amazon = new byte[8];
                            c11522l2.purchase = new float[16];
                            if (c11522l.advert()) {
                                i = i13;
                            } else {
                                int iIntValue = c11522l.m3118private().intValue();
                                char c2 = 'm';
                                if (iIntValue == i3 || iIntValue == 109) {
                                    float f2 = 0.0f;
                                    float f3 = 0.0f;
                                    float f4 = 0.0f;
                                    float f5 = 0.0f;
                                    float f6 = 0.0f;
                                    float f7 = 0.0f;
                                    while (true) {
                                        c11522l.m3122super();
                                        switch (iIntValue) {
                                            case 65:
                                            case 97:
                                                i = i13;
                                                c = c2;
                                                float f8 = f4;
                                                float fM3106extends2 = c11522l.m3106extends();
                                                float fFirebase = c11522l.firebase(fM3106extends2);
                                                float fFirebase2 = c11522l.firebase(fFirebase);
                                                Boolean boolIsPro = c11522l.isPro(Float.valueOf(fFirebase2));
                                                Boolean boolIsPro2 = c11522l.isPro(boolIsPro);
                                                if (boolIsPro2 == null) {
                                                    fM3106extends = Float.NaN;
                                                } else {
                                                    c11522l.m3110goto();
                                                    fM3106extends = c11522l.m3106extends();
                                                }
                                                float fFirebase3 = c11522l.firebase(fM3106extends);
                                                if (Float.isNaN(fFirebase3) || fM3106extends2 < 0.0f || fFirebase < 0.0f) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    float f9 = fM3106extends;
                                                    if (iIntValue == 97) {
                                                        fFirebase3 += f8;
                                                        f = f9 + f2;
                                                    } else {
                                                        f = f9;
                                                    }
                                                    float f10 = fFirebase3;
                                                    c11522l2.amazon(fM3106extends2, fFirebase, fFirebase2, boolIsPro.booleanValue(), boolIsPro2.booleanValue(), f, f10);
                                                    f2 = f;
                                                    f3 = f2;
                                                    f4 = f10;
                                                    f5 = f4;
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics && (((cCharAt = ((String) c11522l.amazon).charAt(i2)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 67:
                                            case 99:
                                                i = i13;
                                                c = c2;
                                                float fM3106extends3 = c11522l.m3106extends();
                                                float fFirebase4 = c11522l.firebase(fM3106extends3);
                                                float fFirebase5 = c11522l.firebase(fFirebase4);
                                                float fFirebase6 = c11522l.firebase(fFirebase5);
                                                float fFirebase7 = c11522l.firebase(fFirebase6);
                                                float fFirebase8 = c11522l.firebase(fFirebase7);
                                                if (Float.isNaN(fFirebase8)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 99) {
                                                        fFirebase7 += f2;
                                                        fFirebase8 += f4;
                                                        fM3106extends3 += f2;
                                                        fFirebase4 += f4;
                                                        fFirebase5 += f2;
                                                        fFirebase6 += f4;
                                                    }
                                                    float f11 = fFirebase5;
                                                    float f12 = fFirebase8;
                                                    float f13 = fFirebase7;
                                                    c11522l2.crashlytics(fM3106extends3, fFirebase4, f11, fFirebase6, f13, f12);
                                                    f3 = f11;
                                                    f5 = fFirebase6;
                                                    f2 = f13;
                                                    f4 = f12;
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 72:
                                            case 104:
                                                i = i13;
                                                c = c2;
                                                float fM3106extends4 = c11522l.m3106extends();
                                                if (Float.isNaN(fM3106extends4)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 104) {
                                                        fM3106extends4 += f2;
                                                    }
                                                    f2 = fM3106extends4;
                                                    c11522l2.purchase(f2, f4);
                                                    f3 = f2;
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 76:
                                            case 108:
                                                i = i13;
                                                char c3 = c2;
                                                float fM3106extends5 = c11522l.m3106extends();
                                                float fFirebase9 = c11522l.firebase(fM3106extends5);
                                                if (Float.isNaN(fFirebase9)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 108) {
                                                        fM3106extends5 += f2;
                                                        fFirebase9 += f4;
                                                    }
                                                    f2 = fM3106extends5;
                                                    f4 = fFirebase9;
                                                    c11522l2.purchase(f2, f4);
                                                    f3 = f2;
                                                    c = c3;
                                                    f5 = f4;
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 77:
                                            case 109:
                                                i = i13;
                                                float fM3106extends6 = c11522l.m3106extends();
                                                float fFirebase10 = c11522l.firebase(fM3106extends6);
                                                if (Float.isNaN(fFirebase10)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 109 && c11522l2.loadAd != 0) {
                                                        fM3106extends6 += f2;
                                                        fFirebase10 += f4;
                                                    }
                                                    f2 = fM3106extends6;
                                                    f4 = fFirebase10;
                                                    c11522l2.loadAd(f2, f4);
                                                    f3 = f2;
                                                    f6 = f3;
                                                    f7 = f4;
                                                    c = 'm';
                                                    iIntValue = iIntValue != 109 ? 76 : 108;
                                                    f5 = f7;
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 81:
                                            case 113:
                                                i = i13;
                                                float fM3106extends7 = c11522l.m3106extends();
                                                float fFirebase11 = c11522l.firebase(fM3106extends7);
                                                float fFirebase12 = c11522l.firebase(fFirebase11);
                                                float fFirebase13 = c11522l.firebase(fFirebase12);
                                                if (Float.isNaN(fFirebase13)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 113) {
                                                        fFirebase12 += f2;
                                                        fFirebase13 += f4;
                                                        fM3106extends7 += f2;
                                                        fFirebase11 += f4;
                                                    }
                                                    f2 = fFirebase12;
                                                    f4 = fFirebase13;
                                                    f5 = fFirebase11;
                                                    f3 = fM3106extends7;
                                                    c11522l2.yandex(f3, f5, f2, f4);
                                                    c = 'm';
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 83:
                                            case 115:
                                                float f14 = (f2 * 2.0f) - f3;
                                                float f15 = (2.0f * f4) - f5;
                                                float fM3106extends8 = c11522l.m3106extends();
                                                float fFirebase14 = c11522l.firebase(fM3106extends8);
                                                i = i13;
                                                float fFirebase15 = c11522l.firebase(fFirebase14);
                                                float fFirebase16 = c11522l.firebase(fFirebase15);
                                                if (Float.isNaN(fFirebase16)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 115) {
                                                        fFirebase15 += f2;
                                                        fFirebase16 += f4;
                                                        fM3106extends8 += f2;
                                                        fFirebase14 += f4;
                                                    }
                                                    float f16 = fM3106extends8;
                                                    float f17 = fFirebase16;
                                                    float f18 = fFirebase15;
                                                    float f19 = fFirebase14;
                                                    c11522l2.crashlytics(f14, f15, f16, f19, f18, f17);
                                                    f3 = f16;
                                                    f5 = f19;
                                                    f2 = f18;
                                                    f4 = f17;
                                                    c = 'm';
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 84:
                                            case 116:
                                                f3 = (f2 * 2.0f) - f3;
                                                f5 = (2.0f * f4) - f5;
                                                float fM3106extends9 = c11522l.m3106extends();
                                                float fFirebase17 = c11522l.firebase(fM3106extends9);
                                                if (Float.isNaN(fFirebase17)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                    i = i13;
                                                } else {
                                                    if (iIntValue == 116) {
                                                        fM3106extends9 += f2;
                                                        fFirebase17 += f4;
                                                    }
                                                    f2 = fM3106extends9;
                                                    f4 = fFirebase17;
                                                    c11522l2.yandex(f3, f5, f2, f4);
                                                    i = i13;
                                                    c = c2;
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 86:
                                            case 118:
                                                float fM3106extends10 = c11522l.m3106extends();
                                                if (Float.isNaN(fM3106extends10)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                    i = i13;
                                                } else {
                                                    if (iIntValue == 118) {
                                                        fM3106extends10 += f4;
                                                    }
                                                    f4 = fM3106extends10;
                                                    c11522l2.purchase(f2, f4);
                                                    i = i13;
                                                    c = c2;
                                                    f5 = f4;
                                                    c11522l.m3110goto();
                                                    if (c11522l.advert()) {
                                                        i2 = c11522l.loadAd;
                                                        if (i2 != c11522l.crashlytics) {
                                                            iIntValue = c11522l.m3118private().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 90:
                                            case 122:
                                                c11522l2.close();
                                                i = i13;
                                                c = c2;
                                                f2 = f6;
                                                f3 = f2;
                                                f4 = f7;
                                                f5 = f4;
                                                c11522l.m3110goto();
                                                if (c11522l.advert()) {
                                                    i2 = c11522l.loadAd;
                                                    if (i2 != c11522l.crashlytics) {
                                                        iIntValue = c11522l.m3118private().intValue();
                                                    }
                                                    c2 = c;
                                                    i13 = i;
                                                }
                                                break;
                                            default:
                                                i = i13;
                                                break;
                                        }
                                    }
                                } else {
                                    i = i13;
                                }
                            }
                            c10878l.metrica = c11522l2;
                        } else {
                            if (iSmaato7 == 43 && startapp(strTrim10) < 0.0f) {
                                C11983l.pro("Invalid <path> element. pathLength cannot be negative");
                                return;
                            }
                            i = i13;
                        }
                        i13 = i + 1;
                        i3 = 77;
                        b2 = 0;
                    }
                    this.loadAd.purchase(c10878l);
                    return;
                case 14:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C6292l c6292l = new C6292l();
                    c6292l.yandex = this.yandex;
                    c6292l.loadAd = this.loadAd;
                    mopub(c6292l, attributes);
                    isPro(c6292l, attributes);
                    billing(c6292l, attributes);
                    remoteconfig(c6292l, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim11 = attributes.getValue(i14).trim();
                        int iSmaato8 = AbstractC0653l.smaato(attributes, i14);
                        if (iSmaato8 == 25) {
                            C12671l c12671lSubscription12 = subscription(strTrim11);
                            c6292l.license = c12671lSubscription12;
                            if (c12671lSubscription12.billing()) {
                                C11983l.pro("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (iSmaato8 != 26) {
                            switch (iSmaato8) {
                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        c6292l.adcel = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            C11983l.pro("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                        c6292l.adcel = Boolean.TRUE;
                                    }
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                    c6292l.ads = isVip(strTrim11);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        c6292l.startapp = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            C11983l.pro("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                        c6292l.startapp = Boolean.TRUE;
                                    }
                                    break;
                                default:
                                    switch (iSmaato8) {
                                        case 81:
                                            C12671l c12671lSubscription13 = subscription(strTrim11);
                                            c6292l.Signature = c12671lSubscription13;
                                            if (c12671lSubscription13.billing()) {
                                                C11983l.pro("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                            break;
                                        case 82:
                                            c6292l.subscription = subscription(strTrim11);
                                            break;
                                        case 83:
                                            c6292l.tapsense = subscription(strTrim11);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i14)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i14))) {
                            c6292l.pro = strTrim11;
                        }
                    }
                    this.loadAd.purchase(c6292l);
                    this.loadAd = c6292l;
                    return;
                case 15:
                    InterfaceC0308l interfaceC0308l6 = this.loadAd;
                    if (interfaceC0308l6 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C10292l c10292l = new C10292l();
                    c10292l.yandex = this.yandex;
                    c10292l.loadAd = interfaceC0308l6;
                    mopub(c10292l, attributes);
                    isPro(c10292l, attributes);
                    smaato(c10292l, attributes);
                    billing(c10292l, attributes);
                    subs(c10292l, attributes, "polygon");
                    this.loadAd.purchase(c10292l);
                    return;
                case 16:
                    InterfaceC0308l interfaceC0308l7 = this.loadAd;
                    if (interfaceC0308l7 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C15075l c15075l = new C15075l();
                    c15075l.yandex = this.yandex;
                    c15075l.loadAd = interfaceC0308l7;
                    mopub(c15075l, attributes);
                    isPro(c15075l, attributes);
                    smaato(c15075l, attributes);
                    billing(c15075l, attributes);
                    subs(c15075l, attributes, "polyline");
                    this.loadAd.purchase(c15075l);
                    return;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C0973l c0973l = new C0973l();
                    c0973l.yandex = this.yandex;
                    c0973l.loadAd = this.loadAd;
                    mopub(c0973l, attributes);
                    isPro(c0973l, attributes);
                    admob(c0973l, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim12 = attributes.getValue(i15).trim();
                        int iSmaato9 = AbstractC0653l.smaato(attributes, i15);
                        if (iSmaato9 == 6) {
                            c0973l.remoteconfig = subscription(strTrim12);
                        } else if (iSmaato9 == 7) {
                            c0973l.vip = subscription(strTrim12);
                        } else if (iSmaato9 == 11) {
                            c0973l.startapp = subscription(strTrim12);
                        } else if (iSmaato9 == 12) {
                            c0973l.adcel = subscription(strTrim12);
                        } else if (iSmaato9 != 49) {
                            continue;
                        } else {
                            C12671l c12671lSubscription14 = subscription(strTrim12);
                            c0973l.metrica = c12671lSubscription14;
                            if (c12671lSubscription14.billing()) {
                                C11983l.pro("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.loadAd.purchase(c0973l);
                    this.loadAd = c0973l;
                    return;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    InterfaceC0308l interfaceC0308l8 = this.loadAd;
                    if (interfaceC0308l8 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C0096l c0096l = new C0096l();
                    c0096l.yandex = this.yandex;
                    c0096l.loadAd = interfaceC0308l8;
                    mopub(c0096l, attributes);
                    isPro(c0096l, attributes);
                    smaato(c0096l, attributes);
                    billing(c0096l, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim13 = attributes.getValue(i16).trim();
                        int iSmaato10 = AbstractC0653l.smaato(attributes, i16);
                        if (iSmaato10 == 25) {
                            C12671l c12671lSubscription15 = subscription(strTrim13);
                            c0096l.ads = c12671lSubscription15;
                            if (c12671lSubscription15.billing()) {
                                C11983l.pro("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (iSmaato10 == 56) {
                            C12671l c12671lSubscription16 = subscription(strTrim13);
                            c0096l.subscription = c12671lSubscription16;
                            if (c12671lSubscription16.billing()) {
                                C11983l.pro("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (iSmaato10 != 57) {
                            switch (iSmaato10) {
                                case 81:
                                    C12671l c12671lSubscription17 = subscription(strTrim13);
                                    c0096l.adcel = c12671lSubscription17;
                                    if (c12671lSubscription17.billing()) {
                                        C11983l.pro("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    c0096l.metrica = subscription(strTrim13);
                                    break;
                                case 83:
                                    c0096l.startapp = subscription(strTrim13);
                                    break;
                            }
                        } else {
                            C12671l c12671lSubscription18 = subscription(strTrim13);
                            c0096l.tapsense = c12671lSubscription18;
                            if (c12671lSubscription18.billing()) {
                                C11983l.pro("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.loadAd.purchase(c0096l);
                    return;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    InterfaceC0308l interfaceC0308l9 = this.loadAd;
                    if (interfaceC0308l9 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C2390l c2390l = new C2390l();
                    c2390l.yandex = this.yandex;
                    c2390l.loadAd = interfaceC0308l9;
                    mopub(c2390l, attributes);
                    isPro(c2390l, attributes);
                    this.loadAd.purchase(c2390l);
                    this.loadAd = c2390l;
                    return;
                case 20:
                    InterfaceC0308l interfaceC0308l10 = this.loadAd;
                    if (interfaceC0308l10 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(interfaceC0308l10 instanceof AbstractC16054l)) {
                        C11983l.pro("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    C6999l c6999l = new C6999l();
                    c6999l.yandex = this.yandex;
                    c6999l.loadAd = interfaceC0308l10;
                    mopub(c6999l, attributes);
                    isPro(c6999l, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim14 = attributes.getValue(i17).trim();
                        if (AbstractC0653l.smaato(attributes, i17) == 39) {
                            if (strTrim14.length() == 0) {
                                C11983l.pro("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = strTrim14.length();
                            if (strTrim14.charAt(strTrim14.length() - 1) == '%') {
                                length--;
                                b = true;
                            } else {
                                b = false;
                            }
                            try {
                                float fMetrica = metrica(length, strTrim14);
                                float f20 = 100.0f;
                                if (b != false) {
                                    fMetrica /= 100.0f;
                                }
                                if (fMetrica < 0.0f) {
                                    f20 = 0.0f;
                                } else if (fMetrica <= 100.0f) {
                                    f20 = fMetrica;
                                }
                                c6999l.admob = Float.valueOf(f20);
                            } catch (NumberFormatException e) {
                                throw new C16376l("Invalid offset value in <stop>: ".concat(strTrim14), e);
                            }
                        }
                    }
                    this.loadAd.purchase(c6999l);
                    this.loadAd = c6999l;
                    return;
                case 21:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim15 = attributes.getValue(i18).trim();
                        int iSmaato11 = AbstractC0653l.smaato(attributes, i18);
                        if (iSmaato11 == 38) {
                            str4 = strTrim15;
                        } else if (iSmaato11 == 77) {
                            zEquals = strTrim15.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        C15154l c15154l = new C15154l(str4);
                        c15154l.m3122super();
                        for (EnumC15797l enumC15797l : appmetrica.Signature(c15154l)) {
                            if (enumC15797l == EnumC15797l.f31019l || enumC15797l == EnumC15797l.f31018l) {
                                this.admob = true;
                                return;
                            }
                        }
                    }
                    this.crashlytics = true;
                    this.amazon = 1;
                    return;
                case 22:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C14957l c14957l = new C14957l();
                    c14957l.yandex = this.yandex;
                    c14957l.loadAd = this.loadAd;
                    mopub(c14957l, attributes);
                    isPro(c14957l, attributes);
                    smaato(c14957l, attributes);
                    billing(c14957l, attributes);
                    this.loadAd.purchase(c14957l);
                    this.loadAd = c14957l;
                    return;
                case 23:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C11316l c11316l = new C11316l();
                    c11316l.yandex = this.yandex;
                    c11316l.loadAd = this.loadAd;
                    mopub(c11316l, attributes);
                    isPro(c11316l, attributes);
                    billing(c11316l, attributes);
                    remoteconfig(c11316l, attributes);
                    this.loadAd.purchase(c11316l);
                    this.loadAd = c11316l;
                    return;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C15298l c15298l = new C15298l();
                    c15298l.yandex = this.yandex;
                    c15298l.loadAd = this.loadAd;
                    mopub(c15298l, attributes);
                    isPro(c15298l, attributes);
                    smaato(c15298l, attributes);
                    billing(c15298l, attributes);
                    firebase(c15298l, attributes);
                    this.loadAd.purchase(c15298l);
                    this.loadAd = c15298l;
                    return;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C8596l c8596l = new C8596l();
                    c8596l.yandex = this.yandex;
                    c8596l.loadAd = this.loadAd;
                    mopub(c8596l, attributes);
                    isPro(c8596l, attributes);
                    billing(c8596l, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String strTrim16 = attributes.getValue(i19).trim();
                        int iSmaato12 = AbstractC0653l.smaato(attributes, i19);
                        if (iSmaato12 != 26) {
                            if (iSmaato12 == 61) {
                                c8596l.metrica = subscription(strTrim16);
                            }
                        } else if ("".equals(attributes.getURI(i19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i19))) {
                            c8596l.vip = strTrim16;
                        }
                    }
                    this.loadAd.purchase(c8596l);
                    this.loadAd = c8596l;
                    InterfaceC0308l interfaceC0308l11 = c8596l.loadAd;
                    if (interfaceC0308l11 instanceof C15298l) {
                        c8596l.startapp = (C15298l) interfaceC0308l11;
                        return;
                    } else {
                        c8596l.startapp = ((InterfaceC17831l) interfaceC0308l11).crashlytics();
                        return;
                    }
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    InterfaceC0308l interfaceC0308l12 = this.loadAd;
                    if (interfaceC0308l12 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(interfaceC0308l12 instanceof AbstractC17931l)) {
                        C11983l.pro("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    C0549l c0549l = new C0549l();
                    c0549l.yandex = this.yandex;
                    c0549l.loadAd = this.loadAd;
                    mopub(c0549l, attributes);
                    isPro(c0549l, attributes);
                    billing(c0549l, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String strTrim17 = attributes.getValue(i20).trim();
                        if (AbstractC0653l.smaato(attributes, i20) == 26 && ("".equals(attributes.getURI(i20)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i20)))) {
                            c0549l.vip = strTrim17;
                        }
                    }
                    this.loadAd.purchase(c0549l);
                    InterfaceC0308l interfaceC0308l13 = c0549l.loadAd;
                    if (interfaceC0308l13 instanceof C15298l) {
                        c0549l.metrica = (C15298l) interfaceC0308l13;
                        return;
                    } else {
                        c0549l.metrica = ((InterfaceC17831l) interfaceC0308l13).crashlytics();
                        return;
                    }
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    InterfaceC0308l interfaceC0308l14 = this.loadAd;
                    if (interfaceC0308l14 == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(interfaceC0308l14 instanceof AbstractC17931l)) {
                        C11983l.pro("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    C14015l c14015l = new C14015l();
                    c14015l.yandex = this.yandex;
                    c14015l.loadAd = this.loadAd;
                    mopub(c14015l, attributes);
                    isPro(c14015l, attributes);
                    billing(c14015l, attributes);
                    firebase(c14015l, attributes);
                    this.loadAd.purchase(c14015l);
                    this.loadAd = c14015l;
                    InterfaceC0308l interfaceC0308l15 = c14015l.loadAd;
                    if (interfaceC0308l15 instanceof C15298l) {
                        c14015l.ads = (C15298l) interfaceC0308l15;
                        return;
                    } else {
                        c14015l.ads = ((InterfaceC17831l) interfaceC0308l15).crashlytics();
                        return;
                    }
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C12573l c12573l = new C12573l();
                    c12573l.yandex = this.yandex;
                    c12573l.loadAd = this.loadAd;
                    mopub(c12573l, attributes);
                    isPro(c12573l, attributes);
                    smaato(c12573l, attributes);
                    billing(c12573l, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String strTrim18 = attributes.getValue(i21).trim();
                        int iSmaato13 = AbstractC0653l.smaato(attributes, i21);
                        if (iSmaato13 == 25) {
                            C12671l c12671lSubscription19 = subscription(strTrim18);
                            c12573l.subscription = c12671lSubscription19;
                            if (c12671lSubscription19.billing()) {
                                C11983l.pro("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iSmaato13 != 26) {
                            switch (iSmaato13) {
                                case 81:
                                    C12671l c12671lSubscription20 = subscription(strTrim18);
                                    c12573l.ads = c12671lSubscription20;
                                    if (c12671lSubscription20.billing()) {
                                        C11983l.pro("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    c12573l.startapp = subscription(strTrim18);
                                    break;
                                case 83:
                                    c12573l.adcel = subscription(strTrim18);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i21)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i21))) {
                            c12573l.metrica = strTrim18;
                        }
                    }
                    this.loadAd.purchase(c12573l);
                    this.loadAd = c12573l;
                    return;
                case 30:
                    if (this.loadAd == null) {
                        C11983l.pro("Invalid document. Root element must be <svg>");
                        return;
                    }
                    C11958l c11958l = new C11958l();
                    c11958l.yandex = this.yandex;
                    c11958l.loadAd = this.loadAd;
                    mopub(c11958l, attributes);
                    billing(c11958l, attributes);
                    remoteconfig(c11958l, attributes);
                    this.loadAd.purchase(c11958l);
                    this.loadAd = c11958l;
                    return;
                default:
                    this.crashlytics = true;
                    this.amazon = 1;
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2290package(char[] cArr, int i, int i2) {
        if (this.crashlytics) {
            return;
        }
        if (this.purchase) {
            if (this.mopub == null) {
                this.mopub = new StringBuilder(i2);
            }
            this.mopub.append(cArr, i, i2);
        } else if (this.admob) {
            if (this.subs == null) {
                this.subs = new StringBuilder(i2);
            }
            this.subs.append(cArr, i, i2);
        } else if (this.loadAd instanceof AbstractC17931l) {
            yandex(new String(cArr, i, i2));
        }
    }

    public final void premium(InputStream inputStream) throws C16376l {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C7450l c7450l = new C7450l();
                c7450l.yandex = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        appmetrica();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        C11522l c11522l = new C11522l(xmlPullParserNewPullParser.getText());
                        String strM3100catch = c11522l.m3100catch();
                        advert(c11522l);
                        strM3100catch.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((C15965l) this.yandex.f9860l) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                signatures(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        inmobi(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c7450l);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        crashlytics(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m2290package(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m2291throws(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e) {
                throw new C16376l("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new C16376l("XML parser problem", e2);
        }
    }

    public final void signatures(InputStream inputStream) throws C16376l {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C8326l c8326l = new C8326l(this);
            xMLReader.setContentHandler(c8326l);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c8326l);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new C16376l("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new C16376l("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new C16376l("SVG parse error", e3);
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m2291throws(String str) {
        if (this.crashlytics) {
            return;
        }
        if (this.purchase) {
            if (this.mopub == null) {
                this.mopub = new StringBuilder(str.length());
            }
            this.mopub.append(str);
        } else if (this.admob) {
            if (this.subs == null) {
                this.subs = new StringBuilder(str.length());
            }
            this.subs.append(str);
        } else if (this.loadAd instanceof AbstractC17931l) {
            yandex(str);
        }
    }

    public final void yandex(String str) {
        AbstractC11837l abstractC11837l = (AbstractC11837l) this.loadAd;
        int size = abstractC11837l.subs.size();
        AbstractC15046l abstractC15046l = size == 0 ? null : (AbstractC15046l) abstractC11837l.subs.get(size - 1);
        if (abstractC15046l instanceof C4222l) {
            C4222l c4222l = (C4222l) abstractC15046l;
            c4222l.crashlytics = AbstractC0653l.ads(new StringBuilder(), c4222l.crashlytics, str);
        } else {
            InterfaceC0308l interfaceC0308l = this.loadAd;
            C4222l c4222l2 = new C4222l();
            c4222l2.crashlytics = str;
            interfaceC0308l.purchase(c4222l2);
        }
    }
}
