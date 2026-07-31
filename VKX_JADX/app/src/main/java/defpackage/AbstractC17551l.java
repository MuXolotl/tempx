package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٗۦٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17551l {
    public static C1461l crashlytics;
    public static final C15578l yandex = new C15578l(1361481567, false, new C0263l(14));
    public static final C15578l loadAd = new C15578l(-2102976832, false, new C0263l(15));

    public static int admob(String str, String str2) throws C2584l {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw C2584l.yandex(str2, 31, str);
        }
    }

    public static boolean amazon(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static C8379l billing(Matcher matcher) {
        return new C8379l(Long.parseLong(matcher.group(1)), matcher.group(2) != null ? Long.valueOf(Long.parseLong(matcher.group(2))) : null);
    }

    public static String crashlytics(String str, EnumC6690l enumC6690l) throws C2584l {
        try {
            return URLDecoder.decode(str.replace("+", "%2B"), enumC6690l.f14040l);
        } catch (UnsupportedEncodingException unused) {
            throw new C2584l(8, null);
        }
    }

    public static final Object firebase(AbstractC8237l abstractC8237l, String str, C18010l c18010l, InterfaceC16588l interfaceC16588l) {
        return new C0065l(abstractC8237l, c18010l, str, interfaceC16588l.purchase()).mopub(interfaceC16588l);
    }

    public static boolean isPro(C12398l c12398l, String str) throws C2584l {
        String str2 = c12398l.loadAd;
        if (str2.equals("YES")) {
            return true;
        }
        if (str2.equals("NO")) {
            return false;
        }
        throw C2584l.yandex(str, 34, c12398l.toString());
    }

    public static final InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, float f, long j, InterfaceC6347l interfaceC6347l) {
        return interfaceC17242l.premium(new C14895l(f, new C8990l(j), interfaceC6347l));
    }

    public static void mopub(String str, Object obj, C6344l c6344l, HashMap map, String str2) throws C2584l {
        ArrayList<C12398l> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList<Integer> arrayList2 = new ArrayList();
        ArrayList<String> arrayList3 = new ArrayList();
        int iIndexOf = str.indexOf(":") + 1;
        boolean z = false;
        boolean z2 = false;
        for (int i = iIndexOf; i < str.length(); i++) {
            if (!z) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ',') {
                    arrayList2.add(Integer.valueOf(i));
                } else if (cCharAt == '\"') {
                    z = true;
                }
            } else if (z2) {
                z2 = false;
            } else {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == '\\') {
                    z2 = true;
                } else if (cCharAt2 == '\"') {
                    z = false;
                }
            }
        }
        if (z) {
            throw new C2584l(35, str2);
        }
        for (Integer num : arrayList2) {
            arrayList3.add(str.substring(iIndexOf, num.intValue()));
            iIndexOf = num.intValue() + 1;
        }
        arrayList3.add(str.substring(iIndexOf));
        for (String str3 : arrayList3) {
            int iIndexOf2 = str3.indexOf("=");
            int iIndexOf3 = str3.indexOf("\"");
            if (iIndexOf2 == -1 || (iIndexOf3 != -1 && iIndexOf3 < iIndexOf2)) {
                throw C2584l.yandex(str2, 25, arrayList.toString());
            }
            String strTrim = str3.substring(0, iIndexOf2).trim();
            String strSubstring = str3.substring(iIndexOf2 + 1);
            if (strTrim.isEmpty()) {
                throw C2584l.yandex(str2, 23, arrayList.toString());
            }
            if (strSubstring.isEmpty()) {
                throw C2584l.yandex(str2, 24, arrayList.toString());
            }
            if (!hashSet.add(strTrim)) {
                throw C2584l.yandex(str2, 29, arrayList.toString());
            }
            arrayList.add(new C12398l(strTrim, strSubstring));
        }
        for (C12398l c12398l : arrayList) {
            if (map.containsKey(c12398l.yandex)) {
                ((InterfaceC14046l) map.get(c12398l.yandex)).yandex(c12398l, obj, c6344l);
            } else if (crashlytics != null) {
                throw C2584l.yandex(str2, 9, str);
            }
        }
    }

    public static Matcher purchase(Pattern pattern, String str, String str2) throws C2584l {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return matcher;
        }
        throw C2584l.yandex(str2, 2, str);
    }

    public static final long smaato(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static String subs(String str, String str2) throws C2584l {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (i2 == 0 && cCharAt != '\"') {
                if (amazon(cCharAt)) {
                    throw new C2584l(7, str2);
                }
                throw new C2584l(18, str2);
            }
            if (i == 2) {
                if (amazon(cCharAt)) {
                    throw new C2584l(7, str2);
                }
                throw new C2584l(18, str2);
            }
            if (i2 == str.length() - 1) {
                if (cCharAt != '\"' || z) {
                    throw new C2584l(35, str2);
                }
            } else if (z) {
                sb.append(cCharAt);
                z = false;
            } else if (cCharAt == '\\') {
                z = true;
            } else if (cCharAt == '\"') {
                i++;
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static C6906l yandex(C10417l c10417l) {
        if (!(c10417l instanceof C10417l)) {
            C18725l.billing();
            return null;
        }
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(new C9735l(C9735l.loadAd(AbstractC14231l.purchase(1.0f, 0.0f, c10417l.yandex.yandex((i * 1.0f) / 19.0f)), C9735l.subs)));
        }
        return new C6906l(arrayList, null, c10417l.loadAd, c10417l.crashlytics);
    }
}
