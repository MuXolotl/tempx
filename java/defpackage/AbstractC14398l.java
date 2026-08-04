package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٌٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14398l {
    public static final Map amazon;
    public static final Map crashlytics;
    public static final Pattern yandex = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern loadAd = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        crashlytics = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        amazon = DesugarCollections.unmodifiableMap(map2);
    }

    public static C10619l amazon(String str, Matcher matcher, C13143l c13143l, ArrayList arrayList) {
        C1291l c1291l = new C1291l();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c1291l.yandex = AbstractC4904l.crashlytics(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c1291l.loadAd = AbstractC4904l.crashlytics(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            purchase(strGroup3, c1291l);
            StringBuilder sb = new StringBuilder();
            c13143l.getClass();
            String strVip = c13143l.vip(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strVip)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strVip.trim());
                strVip = c13143l.vip(StandardCharsets.UTF_8);
            }
            c1291l.crashlytics = billing(str, sb.toString(), arrayList);
            return new C10619l(c1291l.yandex().yandex(), c1291l.yandex, c1291l.loadAd);
        } catch (IllegalArgumentException unused) {
            AbstractC6427l.vip("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static SpannedString billing(String str, String str2, List list) {
        char c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    yandex(str, (C10982l) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                yandex(str, new C10982l("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC6427l.vip("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        AbstractC12442l.admob(!strTrim2.isEmpty());
                        String str3 = AbstractC15323l.yandex;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        AbstractC12442l.admob(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new C10982l(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        C10982l c10982l = (C10982l) arrayDeque.pop();
                                        yandex(str, c10982l, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C10864l(c10982l, spannableStringBuilder.length()));
                                        }
                                        if (c10982l.yandex.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static int crashlytics(List list, String str, C10982l c10982l) {
        ArrayList arrayListLoadAd = loadAd(list, str, c10982l);
        for (int i = 0; i < arrayListLoadAd.size(); i++) {
            int i2 = ((C10735l) arrayListLoadAd.get(i)).f21733l.startapp;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList loadAd(List list, String str, C10982l c10982l) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C0670l c0670l = (C0670l) list.get(i);
            String str2 = c10982l.yandex;
            Set set = c10982l.amazon;
            String str3 = c10982l.crashlytics;
            if (c0670l.yandex.isEmpty() && c0670l.loadAd.isEmpty() && c0670l.crashlytics.isEmpty() && c0670l.amazon.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iYandex = C0670l.yandex(C0670l.yandex(C0670l.yandex(0, 1073741824, c0670l.yandex, str), 2, c0670l.loadAd, str2), 4, c0670l.amazon, str3);
                if (iYandex == -1 || !set.containsAll(c0670l.crashlytics)) {
                    r4 = 0;
                } else {
                    size = iYandex + (c0670l.crashlytics.size() * 4);
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new C10735l(r4, c0670l));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void mopub(String str, C1291l c1291l) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    AbstractC6427l.vip("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = RecyclerView.UNDEFINED_DURATION;
                    break;
            }
            c1291l.mopub = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c1291l.purchase = AbstractC4904l.loadAd(str);
            c1291l.billing = 0;
        } else {
            c1291l.purchase = Integer.parseInt(str);
            c1291l.billing = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void purchase(String str, C1291l c1291l) {
        int i;
        int i2;
        int i3;
        Matcher matcher = loadAd.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    mopub(strGroup2, c1291l);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                AbstractC6427l.vip("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        c1291l.amazon = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    AbstractC6427l.vip("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            c1291l.subs = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        c1291l.admob = AbstractC4904l.loadAd(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        c1291l.isPro = AbstractC4904l.loadAd(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            AbstractC6427l.vip("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        c1291l.firebase = i3;
                    } else {
                        AbstractC6427l.vip("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                AbstractC6427l.vip("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static void yandex(String str, C10982l c10982l, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i2;
        int i3;
        int i4 = c10982l.loadAd;
        int length = spannableStringBuilder.length();
        String str2 = c10982l.yandex;
        str2.getClass();
        int i5 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case "c":
                for (String str3 : c10982l.amazon) {
                    Map map = crashlytics;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = amazon;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new C7148l(c10982l.crashlytics), i4, length, 33);
                break;
            case "ruby":
                int iCrashlytics = crashlytics(list2, str, c10982l);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C10864l.crashlytics);
                int i6 = c10982l.loadAd;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((C10864l) arrayList.get(i7)).yandex.yandex)) {
                        C10864l c10864l = (C10864l) arrayList.get(i7);
                        int iCrashlytics2 = crashlytics(list2, str, c10864l.yandex);
                        if (iCrashlytics2 == i5) {
                            iCrashlytics2 = iCrashlytics != i5 ? iCrashlytics : 1;
                        }
                        int i8 = c10864l.yandex.loadAd - length2;
                        int i9 = c10864l.loadAd - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new C14711l(charSequenceSubSequence.toString(), iCrashlytics2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListLoadAd = loadAd(list2, str, c10982l);
        for (int i10 = 0; i10 < arrayListLoadAd.size(); i10++) {
            C0670l c0670l = ((C10735l) arrayListLoadAd.get(i10)).f21733l;
            int i11 = c0670l.smaato;
            if (i11 == -1 && c0670l.remoteconfig == -1) {
                i = -1;
            } else {
                i = (c0670l.remoteconfig == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i12 = c0670l.smaato;
                if (i12 == -1 && c0670l.remoteconfig == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i12 == 1 ? 1 : 0) | (c0670l.remoteconfig == 1 ? 2 : 0);
                }
                AbstractC5006l.loadAd(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (c0670l.isPro == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (c0670l.firebase == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (c0670l.mopub) {
                if (!c0670l.mopub) {
                    C8339l.smaato("Font color not defined");
                    return;
                }
                AbstractC5006l.loadAd(spannableStringBuilder, new ForegroundColorSpan(c0670l.billing), i4, length);
            }
            if (c0670l.subs) {
                if (!c0670l.subs) {
                    C8339l.smaato("Background color not defined.");
                    return;
                }
                AbstractC5006l.loadAd(spannableStringBuilder, new BackgroundColorSpan(c0670l.admob), i4, length);
            }
            if (c0670l.purchase != null) {
                AbstractC5006l.loadAd(spannableStringBuilder, new TypefaceSpan(c0670l.purchase), i4, length);
            }
            int i13 = c0670l.vip;
            if (i13 == 1) {
                AbstractC5006l.loadAd(spannableStringBuilder, new AbsoluteSizeSpan((int) c0670l.metrica, true), i4, length);
            } else if (i13 == 2) {
                AbstractC5006l.loadAd(spannableStringBuilder, new RelativeSizeSpan(c0670l.metrica), i4, length);
            } else if (i13 == 3) {
                AbstractC5006l.loadAd(spannableStringBuilder, new RelativeSizeSpan(c0670l.metrica / 100.0f), i4, length);
            }
            if (c0670l.adcel) {
                spannableStringBuilder.setSpan(new C3146l(), i4, length, 33);
            }
        }
    }
}
