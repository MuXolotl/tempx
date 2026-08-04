package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: lًٙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8085l implements InterfaceC17215l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final XmlPullParserFactory f16859l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final Pattern f16854l = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Pattern f16851l = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Pattern f16856l = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final Pattern f16855l = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Pattern f16858l = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Pattern f16852l = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Pattern f16853l = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C13307l f16857l = new C13307l(1, 30.0f, 1);

    public C8085l() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f16859l = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            C18073l.Signature("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x022c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:160:0x024e  */
    /* JADX WARN: Code duplicated, block: B:163:0x025c  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0289  */
    /* JADX WARN: Code duplicated, block: B:171:0x028e  */
    /* JADX WARN: Code duplicated, block: B:174:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:180:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:184:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:188:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    public static C5900l admob(XmlPullParser xmlPullParser, C5900l c5900l) {
        byte b;
        int i;
        C2425l c2425lIsPro;
        C2425l c2425lIsPro2;
        C2425l c2425lIsPro3;
        C3561l c3561l;
        Object next;
        String str;
        int iHashCode;
        C3561l c3561l2;
        Object next2;
        String str2;
        int iHashCode2;
        int i2;
        C4171l c4171l;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        C5900l c5900lYandex = c5900l;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            String attributeName = xmlPullParser.getAttributeName(i3);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b = 0;
                    break;
                case "extent":
                    b = 1;
                    break;
                case "fontFamily":
                    b = 2;
                    break;
                case "textAlign":
                    b = 3;
                    break;
                case "origin":
                    b = 4;
                    break;
                case "textDecoration":
                    b = 5;
                    break;
                case "fontWeight":
                    b = 6;
                    break;
                case "id":
                    b = 7;
                    break;
                case "ruby":
                    b = 8;
                    break;
                case "color":
                    b = 9;
                    break;
                case "shear":
                    b = 10;
                    break;
                case "textCombine":
                    b = 11;
                    break;
                case "fontSize":
                    b = 12;
                    break;
                case "textEmphasis":
                    b = 13;
                    break;
                case "rubyPosition":
                    b = 14;
                    break;
                case "backgroundColor":
                    b = 15;
                    break;
                case "multiRowAlign":
                    b = 16;
                    break;
                default:
                    b = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b) {
                case 0:
                    c5900lYandex = yandex(c5900lYandex);
                    c5900lYandex.subs = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    c5900lYandex = yandex(c5900lYandex);
                    c5900lYandex.Signature = attributeValue;
                    break;
                case 2:
                    c5900lYandex = yandex(c5900lYandex);
                    c5900lYandex.yandex = attributeValue;
                    break;
                case 3:
                    c5900lYandex = yandex(c5900lYandex);
                    String strAdmob = AbstractC11452l.admob(attributeValue);
                    strAdmob.getClass();
                    switch (strAdmob) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c5900lYandex.metrica = alignment;
                    break;
                case 4:
                    c5900lYandex = yandex(c5900lYandex);
                    c5900lYandex.tapsense = attributeValue;
                    break;
                case 5:
                    String strAdmob2 = AbstractC11452l.admob(attributeValue);
                    strAdmob2.getClass();
                    switch (strAdmob2) {
                        case "nounderline":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.mopub = 0;
                            break;
                        case "underline":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.mopub = 1;
                            break;
                        case "nolinethrough":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.billing = 0;
                            break;
                        case "linethrough":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.billing = 1;
                            break;
                    }
                    break;
                case 6:
                    c5900lYandex = yandex(c5900lYandex);
                    c5900lYandex.admob = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c5900lYandex = yandex(c5900lYandex);
                        c5900lYandex.smaato = attributeValue;
                    }
                    break;
                case 8:
                    String strAdmob3 = AbstractC11452l.admob(attributeValue);
                    strAdmob3.getClass();
                    switch (strAdmob3) {
                        case "baseContainer":
                        case "base":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.remoteconfig = 2;
                            break;
                        case "container":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.remoteconfig = 1;
                            break;
                        case "delimiter":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.remoteconfig = 4;
                            break;
                        case "textContainer":
                        case "text":
                            c5900lYandex = yandex(c5900lYandex);
                            c5900lYandex.remoteconfig = 3;
                            break;
                    }
                    break;
                case 9:
                    c5900lYandex = yandex(c5900lYandex);
                    try {
                        c5900lYandex.loadAd = AbstractC11844l.yandex(attributeValue, false);
                        c5900lYandex.crashlytics = true;
                    } catch (IllegalArgumentException unused) {
                        AbstractC11043l.remoteconfig("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    C5900l c5900lYandex2 = yandex(c5900lYandex);
                    Matcher matcher = f16855l.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            AbstractC6427l.metrica("TtmlParser", "Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        AbstractC11043l.remoteconfig("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    c5900lYandex2.subscription = fMin;
                    c5900lYandex = c5900lYandex2;
                    break;
                case 11:
                    String strAdmob4 = AbstractC11452l.admob(attributeValue);
                    strAdmob4.getClass();
                    if (strAdmob4.equals("all")) {
                        c5900lYandex = yandex(c5900lYandex);
                        c5900lYandex.adcel = 1;
                    } else if (strAdmob4.equals("none")) {
                        c5900lYandex = yandex(c5900lYandex);
                        c5900lYandex.adcel = 0;
                    }
                    break;
                case 12:
                    try {
                        c5900lYandex = yandex(c5900lYandex);
                        amazon(attributeValue, c5900lYandex);
                    } catch (C8995l unused2) {
                        AbstractC11043l.remoteconfig("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    c5900lYandex = yandex(c5900lYandex);
                    Pattern pattern = C4171l.amazon;
                    if (attributeValue == null) {
                        c4171l = null;
                    } else {
                        String strAdmob5 = AbstractC11452l.admob(attributeValue.trim());
                        if (strAdmob5.isEmpty()) {
                            c4171l = null;
                        } else {
                            String[] strArrSplit = TextUtils.split(strAdmob5, C4171l.amazon);
                            int length = strArrSplit.length;
                            AbstractC8481l abstractC8481lMetrica = length != 0 ? length != 1 ? AbstractC8481l.metrica(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C12950l(strArrSplit[0]) : C13825l.f26967l;
                            C3561l c3561l3 = new C3561l(AbstractC5088l.isPro(C4171l.admob, abstractC8481lMetrica));
                            String str4 = (String) (c3561l3.hasNext() ? c3561l3.next() : "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i = -2;
                                }
                                c2425lIsPro = AbstractC5088l.isPro(C4171l.purchase, abstractC8481lMetrica);
                                if (c2425lIsPro.isEmpty()) {
                                    c2425lIsPro2 = AbstractC5088l.isPro(C4171l.mopub, abstractC8481lMetrica);
                                    c2425lIsPro3 = AbstractC5088l.isPro(C4171l.billing, abstractC8481lMetrica);
                                    if (c2425lIsPro2.isEmpty() || !c2425lIsPro3.isEmpty()) {
                                        c3561l = new C3561l(c2425lIsPro2);
                                        if (c3561l.hasNext()) {
                                            next = c3561l.next();
                                        } else {
                                            next = "filled";
                                        }
                                        str = (String) next;
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i4 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            c3561l2 = new C3561l(c2425lIsPro3);
                                            if (c3561l2.hasNext()) {
                                                next2 = c3561l2.next();
                                            } else {
                                                next2 = "circle";
                                            }
                                            str2 = (String) next2;
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i2 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i2 = 3;
                                                }
                                                c4171l = new C4171l(i2, i4, i);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i2 = 1;
                                            c4171l = new C4171l(i2, i4, i);
                                        } else {
                                            str.equals("filled");
                                        }
                                        c3561l2 = new C3561l(c2425lIsPro3);
                                        if (c3561l2.hasNext()) {
                                            next2 = c3561l2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            c4171l = new C4171l(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        c4171l = new C4171l(i2, i4, i);
                                    } else {
                                        c4171l = new C4171l(-1, 0, i);
                                    }
                                } else {
                                    str3 = (String) new C3561l(c2425lIsPro).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i5 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        c4171l = new C4171l(i5, 0, i);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    c4171l = new C4171l(i5, 0, i);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i = 1;
                            c2425lIsPro = AbstractC5088l.isPro(C4171l.purchase, abstractC8481lMetrica);
                            if (c2425lIsPro.isEmpty()) {
                                str3 = (String) new C3561l(c2425lIsPro).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    c4171l = new C4171l(i5, 0, i);
                                } else {
                                    str3.equals("auto");
                                }
                                c4171l = new C4171l(i5, 0, i);
                            } else {
                                c2425lIsPro2 = AbstractC5088l.isPro(C4171l.mopub, abstractC8481lMetrica);
                                c2425lIsPro3 = AbstractC5088l.isPro(C4171l.billing, abstractC8481lMetrica);
                                if (c2425lIsPro2.isEmpty()) {
                                    c3561l = new C3561l(c2425lIsPro2);
                                    if (c3561l.hasNext()) {
                                        next = c3561l.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        c3561l2 = new C3561l(c2425lIsPro3);
                                        if (c3561l2.hasNext()) {
                                            next2 = c3561l2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            c4171l = new C4171l(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        c4171l = new C4171l(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    c3561l2 = new C3561l(c2425lIsPro3);
                                    if (c3561l2.hasNext()) {
                                        next2 = c3561l2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        c4171l = new C4171l(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    c4171l = new C4171l(i2, i4, i);
                                } else {
                                    c3561l = new C3561l(c2425lIsPro2);
                                    if (c3561l.hasNext()) {
                                        next = c3561l.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        c3561l2 = new C3561l(c2425lIsPro3);
                                        if (c3561l2.hasNext()) {
                                            next2 = c3561l2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            c4171l = new C4171l(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        c4171l = new C4171l(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    c3561l2 = new C3561l(c2425lIsPro3);
                                    if (c3561l2.hasNext()) {
                                        next2 = c3561l2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        c4171l = new C4171l(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    c4171l = new C4171l(i2, i4, i);
                                }
                            }
                        }
                    }
                    c5900lYandex.ads = c4171l;
                    break;
                case 14:
                    String strAdmob6 = AbstractC11452l.admob(attributeValue);
                    strAdmob6.getClass();
                    if (strAdmob6.equals("before")) {
                        c5900lYandex = yandex(c5900lYandex);
                        c5900lYandex.vip = 1;
                    } else if (strAdmob6.equals("after")) {
                        c5900lYandex = yandex(c5900lYandex);
                        c5900lYandex.vip = 2;
                    }
                    break;
                case 15:
                    c5900lYandex = yandex(c5900lYandex);
                    try {
                        c5900lYandex.amazon = AbstractC11844l.yandex(attributeValue, false);
                        c5900lYandex.purchase = true;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC11043l.remoteconfig("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    c5900lYandex = yandex(c5900lYandex);
                    String strAdmob7 = AbstractC11452l.admob(attributeValue);
                    strAdmob7.getClass();
                    switch (strAdmob7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c5900lYandex.startapp = alignment;
                    break;
            }
        }
        return c5900lYandex;
    }

    public static void amazon(String str, C5900l c5900l) throws C8995l {
        Matcher matcher;
        String str2 = AbstractC15323l.yandex;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f16856l;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C8995l(AbstractC14814l.remoteconfig(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC6427l.vip("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C8995l(AbstractC15560l.Signature("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c5900l.isPro = 3;
                break;
            case "em":
                c5900l.isPro = 2;
                break;
            case "px":
                c5900l.isPro = 1;
                break;
            default:
                throw new C8995l(AbstractC15560l.Signature("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c5900l.firebase = Float.parseFloat(strGroup2);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static void billing(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.C9754l r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8085l.billing(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, lٍۗؓ, java.util.HashMap, java.util.HashMap):void");
    }

    public static int crashlytics(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f16853l.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC6427l.vip("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            AbstractC12442l.amazon(i, i2, "Invalid cell resolution %s %s", z);
            return i2;
        } catch (NumberFormatException unused) {
            AbstractC6427l.vip("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static C9754l firebase(XmlPullParser xmlPullParser) {
        String strAmazon = AbstractC1019l.amazon(xmlPullParser, "extent");
        if (strAmazon == null) {
            return null;
        }
        Matcher matcher = f16852l.matcher(strAmazon);
        if (!matcher.matches()) {
            AbstractC6427l.vip("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strAmazon));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C9754l(i, Integer.parseInt(strGroup2), 8);
        } catch (NumberFormatException unused) {
            AbstractC6427l.vip("TtmlParser", "Ignoring malformed tts extent: ".concat(strAmazon));
            return null;
        }
    }

    public static boolean loadAd(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static C9005l mopub(XmlPullParser xmlPullParser, C9005l c9005l, HashMap map, C13307l c13307l) throws C8995l {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        C5900l c5900lAdmob = admob(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jSubs = -9223372036854775807L;
        long jSubs2 = -9223372036854775807L;
        long jSubs3 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jSubs3 = subs(attributeValue, c13307l);
                    break;
                case "end":
                    jSubs2 = subs(attributeValue, c13307l);
                    break;
                case "begin":
                    jSubs = subs(attributeValue, c13307l);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = AbstractC15323l.yandex;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c9005l != null) {
            long j2 = c9005l.amazon;
            if (j2 != -9223372036854775807L) {
                if (jSubs != -9223372036854775807L) {
                    jSubs += j2;
                }
                if (jSubs2 != -9223372036854775807L) {
                    jSubs2 += j2;
                }
            }
        }
        if (jSubs2 != -9223372036854775807L) {
            j = jSubs2;
        } else {
            if (jSubs3 != -9223372036854775807L) {
                jSubs2 = jSubs + jSubs3;
            } else if (c9005l != null) {
                long j3 = c9005l.purchase;
                if (j3 != -9223372036854775807L) {
                    j = j3;
                }
            }
            j = jSubs2;
        }
        return new C9005l(xmlPullParser.getName(), null, jSubs, j, c5900lAdmob, strArr, str, strSubstring, c9005l);
    }

    public static C13307l purchase(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = AbstractC15323l.yandex;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            AbstractC12442l.subs(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        C13307l c13307l = f16857l;
        int i2 = c13307l.loadAd;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c13307l.crashlytics;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C13307l(i2, i * f, i3);
    }

    public static long subs(String str, C13307l c13307l) throws C8995l {
        double d;
        double d2;
        Matcher matcher = f16854l.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d3 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d5 = d4 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / c13307l.yandex : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c13307l.loadAd)) / ((double) c13307l.yandex) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f16851l.matcher(str);
        if (!matcher2.matches()) {
            throw new C8995l(AbstractC14814l.startapp("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d8 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d = c13307l.yandex;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = c13307l.crashlytics;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            default:
                return (long) (d8 * 1000000.0d);
        }
        d8 *= d2;
        return (long) (d8 * 1000000.0d);
    }

    public static C5900l yandex(C5900l c5900l) {
        return c5900l == null ? new C5900l() : c5900l;
    }

    @Override // defpackage.InterfaceC17215l
    public final InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        InterfaceC2743l interfaceC2743l;
        InterfaceC2743l interfaceC2743l2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f16859l.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C10479l("", -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            C13307l c13307lPurchase = f16857l;
            int iCrashlytics = 15;
            int i3 = 0;
            C3557l c3557l = null;
            C9754l c9754lFirebase = null;
            while (eventType != 1) {
                C9005l c9005l = (C9005l) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    interfaceC2743l = interfaceC2743l2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                c13307lPurchase = purchase(xmlPullParserNewPullParser);
                                iCrashlytics = crashlytics(xmlPullParserNewPullParser);
                                c9754lFirebase = firebase(xmlPullParserNewPullParser);
                            }
                            C13307l c13307l = c13307lPurchase;
                            int i4 = iCrashlytics;
                            C9754l c9754l = c9754lFirebase;
                            if (loadAd(name)) {
                                if ("head".equals(name)) {
                                    billing(xmlPullParserNewPullParser, map, i4, c9754l, map2, map3);
                                } else {
                                    try {
                                        C9005l c9005lMopub = mopub(xmlPullParserNewPullParser, c9005l, map2, c13307l);
                                        arrayDeque.push(c9005lMopub);
                                        if (c9005l != null) {
                                            if (c9005l.remoteconfig == null) {
                                                c9005l.remoteconfig = new ArrayList();
                                            }
                                            c9005l.remoteconfig.add(c9005lMopub);
                                        }
                                    } catch (C8995l e) {
                                        AbstractC6427l.metrica("TtmlParser", "Suppressing parser error", e);
                                        i3++;
                                    }
                                }
                                c9754lFirebase = c9754l;
                                iCrashlytics = i4;
                                c13307lPurchase = c13307l;
                            } else {
                                AbstractC6427l.firebase("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i3++;
                            c9754lFirebase = c9754l;
                            iCrashlytics = i4;
                            c13307lPurchase = c13307l;
                        } catch (IOException e2) {
                            e = e2;
                            C4875l.remoteconfig("Unexpected error when reading input.", e);
                            return interfaceC2743l;
                        } catch (XmlPullParserException e3) {
                            e = e3;
                            C4875l.remoteconfig("Unable to decode source", e);
                            return interfaceC2743l;
                        }
                    } else if (eventType == 4) {
                        c9005l.getClass();
                        C9005l c9005lYandex = C9005l.yandex(xmlPullParserNewPullParser.getText());
                        if (c9005l.remoteconfig == null) {
                            c9005l.remoteconfig = new ArrayList();
                        }
                        c9005l.remoteconfig.add(c9005lYandex);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C9005l c9005l2 = (C9005l) arrayDeque.peek();
                            c9005l2.getClass();
                            c3557l = new C3557l(c9005l2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    interfaceC2743l = interfaceC2743l2;
                    if (eventType == 2) {
                        i3++;
                    } else if (eventType == 3) {
                        i3--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                interfaceC2743l2 = interfaceC2743l;
            }
            interfaceC2743l = interfaceC2743l2;
            c3557l.getClass();
            return c3557l;
        } catch (IOException e4) {
            e = e4;
            interfaceC2743l = interfaceC2743l2;
        } catch (XmlPullParserException e5) {
            e = e5;
            interfaceC2743l = interfaceC2743l2;
        }
    }

    @Override // defpackage.InterfaceC17215l
    public final void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        AbstractC0140l.Signature(isPro(i, i2, bArr), c8807l, interfaceC18679l);
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ void reset() {
    }
}
