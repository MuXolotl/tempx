package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٌٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14774l implements InterfaceC17215l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Pattern f28859l = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5034l f28861l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f28862l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public LinkedHashMap f28864l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f28863l = -3.4028235E38f;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public float f28865l = -3.4028235E38f;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13143l f28860l = new C13143l();

    public C14774l(List list) {
        if (list == null || list.isEmpty()) {
            this.f28862l = false;
            this.f28861l = null;
            return;
        }
        this.f28862l = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        AbstractC12442l.admob(str.startsWith("Format:"));
        C5034l c5034lYandex = C5034l.yandex(str);
        c5034lYandex.getClass();
        this.f28861l = c5034lYandex;
        loadAd(new C13143l((byte[]) list.get(1)), charset);
    }

    public static long crashlytics(String str) {
        Matcher matcher = f28859l.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = AbstractC15323l.yandex;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    public static int yandex(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void loadAd(C13143l c13143l, Charset charset) {
        int i;
        C10057l c10057l;
        while (true) {
            String strVip = c13143l.vip(charset);
            if (strVip == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(strVip)) {
                while (true) {
                    String strVip2 = c13143l.vip(charset);
                    if (strVip2 == null) {
                        break;
                    }
                    if (c13143l.yandex() != 0) {
                        int iAdmob = c13143l.admob(charset);
                        if ((iAdmob != 0 ? AbstractC9966l.loadAd(iAdmob >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strVip2.split(":");
                    if (strArrSplit.length == 2) {
                        String strAdmob = AbstractC11452l.admob(strArrSplit[0].trim());
                        strAdmob.getClass();
                        if (strAdmob.equals("playresx")) {
                            this.f28863l = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strAdmob.equals("playresy")) {
                            try {
                                this.f28865l = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strVip)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C3140l c3140l = null;
                while (true) {
                    String strVip3 = c13143l.vip(charset);
                    if (strVip3 != null) {
                        if (c13143l.yandex() != 0) {
                            int iAdmob2 = c13143l.admob(charset);
                            if ((iAdmob2 != 0 ? AbstractC9966l.loadAd(iAdmob2 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (strVip3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strVip3.substring(7), ",");
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < strArrSplit2.length; i15++) {
                                String strAdmob2 = AbstractC11452l.admob(strArrSplit2[i15].trim());
                                strAdmob2.getClass();
                                switch (strAdmob2.hashCode()) {
                                    case -1178781136:
                                        i = strAdmob2.equals("italic") ? i2 : -1;
                                        break;
                                    case -1026963764:
                                        i = strAdmob2.equals("underline") ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i = strAdmob2.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i = strAdmob2.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i = strAdmob2.equals("bold") ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i = strAdmob2.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i = strAdmob2.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i = strAdmob2.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i = strAdmob2.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i = strAdmob2.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case 3:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case 5:
                                        i5 = i15;
                                        break;
                                    case 6:
                                        i9 = i15;
                                        break;
                                    case 7:
                                        i14 = i15;
                                        break;
                                    case 8:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            c3140l = i5 != -1 ? new C3140l(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length) : null;
                        } else {
                            if (strVip3.startsWith("Style:")) {
                                if (c3140l == null) {
                                    AbstractC6427l.vip("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strVip3));
                                } else {
                                    AbstractC12442l.admob(strVip3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strVip3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i16 = c3140l.firebase;
                                    if (length != i16) {
                                        int length2 = strArrSplit3.length;
                                        String str = AbstractC15323l.yandex;
                                        Locale locale = Locale.US;
                                        StringBuilder sbSubscription = AbstractC14814l.subscription(i16, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                        sbSubscription.append(strVip3);
                                        sbSubscription.append("'");
                                        AbstractC6427l.vip("SsaStyle", sbSubscription.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[c3140l.yandex].trim();
                                            int i17 = c3140l.loadAd;
                                            int iYandex = i17 != -1 ? C10057l.yandex(strArrSplit3[i17].trim()) : -1;
                                            int i18 = c3140l.crashlytics;
                                            Integer numCrashlytics = i18 != -1 ? C10057l.crashlytics(strArrSplit3[i18].trim()) : null;
                                            int i19 = c3140l.amazon;
                                            Integer numCrashlytics2 = i19 != -1 ? C10057l.crashlytics(strArrSplit3[i19].trim()) : null;
                                            int i20 = c3140l.purchase;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String strTrim2 = strArrSplit3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e) {
                                                    AbstractC6427l.metrica("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = c3140l.billing;
                                            boolean z = i21 != -1 && C10057l.loadAd(strArrSplit3[i21].trim());
                                            int i22 = c3140l.mopub;
                                            boolean z2 = i22 != -1 && C10057l.loadAd(strArrSplit3[i22].trim());
                                            int i23 = c3140l.admob;
                                            boolean z3 = i23 != -1 && C10057l.loadAd(strArrSplit3[i23].trim());
                                            int i24 = c3140l.subs;
                                            boolean z4 = i24 != -1 && C10057l.loadAd(strArrSplit3[i24].trim());
                                            int i25 = c3140l.isPro;
                                            if (i25 != -1) {
                                                String strTrim3 = strArrSplit3[i25].trim();
                                                try {
                                                    int i26 = Integer.parseInt(strTrim3.trim());
                                                    if (i26 == 1 || i26 == 3) {
                                                        i4 = i26;
                                                    } else {
                                                        AbstractC6427l.vip("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            c10057l = new C10057l(strTrim, iYandex, numCrashlytics, numCrashlytics2, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            AbstractC6427l.metrica("SsaStyle", "Skipping malformed 'Style:' line: '" + strVip3 + "'", e2);
                                            c10057l = null;
                                        }
                                        if (c10057l != null) {
                                            linkedHashMap.put(c10057l.yandex, c10057l);
                                        }
                                    }
                                    c10057l = null;
                                    if (c10057l != null) {
                                        linkedHashMap.put(c10057l.yandex, c10057l);
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.f28864l = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strVip)) {
                AbstractC6427l.firebase("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strVip)) {
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC17215l
    public final void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        Charset charset;
        C13143l c13143l;
        long j;
        int i3;
        int i4;
        float f;
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i6;
        int i7;
        int i8;
        float f2;
        float f3;
        float f4;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        float f6;
        int i13;
        int iYandex;
        int i14;
        C14774l c14774l = this;
        long j2 = c8807l.loadAd;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C13143l c13143l2 = c14774l.f28860l;
        c13143l2.m3565private(i + i2, bArr);
        c13143l2.m3562for(i);
        Charset charsetM3570volatile = c13143l2.m3570volatile();
        if (charsetM3570volatile == null) {
            charsetM3570volatile = StandardCharsets.UTF_8;
        }
        boolean z = c14774l.f28862l;
        if (!z) {
            c14774l.loadAd(c13143l2, charsetM3570volatile);
        }
        C5034l c5034lYandex = z ? c14774l.f28861l : null;
        while (true) {
            String strVip = c13143l2.vip(charsetM3570volatile);
            if (strVip == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !c8807l.yandex) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            C18073l.admob();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i15)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        C8755l c8755l = new C8755l(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            interfaceC18679l.accept(c8755l);
                        } else if (arrayList3 != null) {
                            arrayList3.add(c8755l);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC18679l.accept((C8755l) it.next());
                    }
                    return;
                }
                return;
            }
            if (strVip.startsWith("Format:")) {
                c5034lYandex = C5034l.yandex(strVip);
            } else {
                if (strVip.startsWith("Dialogue:")) {
                    if (c5034lYandex == null) {
                        AbstractC6427l.vip("SsaParser", "Skipping dialogue line before complete format: ".concat(strVip));
                    } else {
                        int i16 = c5034lYandex.billing;
                        AbstractC12442l.admob(strVip.startsWith("Dialogue:"));
                        String strSubstring = strVip.substring(9);
                        int i17 = c5034lYandex.yandex;
                        String[] strArrSplit = strSubstring.split(",", i16);
                        if (strArrSplit.length != i16) {
                            AbstractC6427l.vip("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strVip));
                        } else {
                            if (i17 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i17].trim());
                                } catch (RuntimeException unused) {
                                    AbstractC6427l.vip("SsaParser", "Fail to parse layer: " + strArrSplit[i17]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jCrashlytics = crashlytics(strArrSplit[c5034lYandex.loadAd]);
                            charset = charsetM3570volatile;
                            if (jCrashlytics == -9223372036854775807L) {
                                AbstractC6427l.vip("SsaParser", "Skipping invalid timing: ".concat(strVip));
                                j = j2;
                                c13143l = c13143l2;
                            } else {
                                j = j2;
                                long jCrashlytics2 = crashlytics(strArrSplit[c5034lYandex.crashlytics]);
                                if (jCrashlytics2 == -9223372036854775807L || jCrashlytics2 <= jCrashlytics) {
                                    c13143l = c13143l2;
                                    AbstractC6427l.vip("SsaParser", "Skipping invalid timing: ".concat(strVip));
                                } else {
                                    LinkedHashMap linkedHashMap = c14774l.f28864l;
                                    C10057l c10057l = (linkedHashMap == null || (i14 = c5034lYandex.amazon) == -1) ? null : (C10057l) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[c5034lYandex.purchase];
                                    Matcher matcher = C10991l.yandex.matcher(str);
                                    PointF pointF = null;
                                    int i18 = -1;
                                    while (matcher.find()) {
                                        C13143l c13143l3 = c13143l2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFYandex = C10991l.yandex(strGroup);
                                            if (pointFYandex != null) {
                                                pointF = pointFYandex;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = C10991l.amazon.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iYandex = C10057l.yandex(strGroup2);
                                            } else {
                                                iYandex = -1;
                                            }
                                            if (iYandex != -1) {
                                                i18 = iYandex;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        c13143l2 = c13143l3;
                                    }
                                    c13143l = c13143l2;
                                    String strReplace = C10991l.yandex.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = c14774l.f28863l;
                                    float f8 = c14774l.f28865l;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (c10057l != null) {
                                        boolean z2 = c10057l.mopub;
                                        Integer num = c10057l.amazon;
                                        Integer num2 = c10057l.crashlytics;
                                        if (num2 != null) {
                                            i9 = 33;
                                            i10 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i9 = 33;
                                            i10 = 0;
                                        }
                                        if (c10057l.isPro == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i10, spannableString.length(), i9);
                                        }
                                        float f9 = c10057l.purchase;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i11 = 1;
                                        }
                                        boolean z3 = c10057l.billing;
                                        if (z3 && z2) {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            if (z3) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c10057l.admob) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i13);
                                        }
                                        if (c10057l.subs) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i13);
                                        }
                                        i5 = i12;
                                        f = f6;
                                    } else {
                                        f7 = f7;
                                        f8 = f8;
                                        i4 = 0;
                                        f = -3.4028235E38f;
                                        i5 = Integer.MIN_VALUE;
                                    }
                                    if (i18 == -1) {
                                        i18 = c10057l != null ? c10057l.loadAd : -1;
                                    }
                                    switch (i18) {
                                        case 0:
                                        default:
                                            AbstractC12900l.subscription("Unknown alignment: ", i18, "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i19 = RecyclerView.UNDEFINED_DURATION;
                                    switch (i18) {
                                        case 0:
                                        default:
                                            AbstractC12900l.subscription("Unknown alignment: ", i18, "SsaParser");
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = i4;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    switch (i18) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AbstractC12900l.subscription("Unknown alignment: ", i18, "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i19 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i19 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i19 = i4;
                                            break;
                                    }
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        float f10 = 0.95f;
                                        if (i6 != 0) {
                                            i7 = 1;
                                            if (i6 != 1) {
                                                i8 = 2;
                                                f2 = i6 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i8 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i7 = 1;
                                            i8 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i19 == 0) {
                                            f10 = 0.05f;
                                        } else if (i19 == i7) {
                                            f10 = 0.5f;
                                        } else if (i19 != i8) {
                                            f10 = -3.4028235E38f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        f4 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                    }
                                    C17456l c17456l = new C17456l(spannableString, alignment2, null, null, f3, i4, i19, f4, i6, i5, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, i3);
                                    int iYandex2 = yandex(jCrashlytics2, arrayList2, arrayList);
                                    for (int iYandex3 = yandex(jCrashlytics, arrayList2, arrayList); iYandex3 < iYandex2; iYandex3++) {
                                        ((List) arrayList.get(iYandex3)).add(c17456l);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM3570volatile;
                    j = j2;
                    c13143l = c13143l2;
                } else {
                    charset = charsetM3570volatile;
                    j = j2;
                    c13143l = c13143l2;
                }
                c14774l = this;
                charsetM3570volatile = charset;
                j2 = j;
                c5034lYandex = c5034lYandex;
                c13143l2 = c13143l;
            }
        }
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ void reset() {
    }
}
