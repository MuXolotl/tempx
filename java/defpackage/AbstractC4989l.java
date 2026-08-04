package defpackage;

/* JADX INFO: renamed from: lؗٚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4989l {
    public static final String[] yandex = new String[93];

    static {
        char c = 0;
        while (true) {
            String[] strArr = yandex;
            if (c >= strArr.length) {
                strArr[42] = "\\2a";
                strArr[40] = "\\28";
                strArr[41] = "\\29";
                strArr[92] = "\\5c";
                strArr[0] = "\\00";
                return;
            }
            strArr[c] = String.valueOf(c);
            c = (char) (c + 1);
        }
    }

    public static String yandex(String str, String str2) {
        int iIndexOf = AbstractC9008l.amazon(str).indexOf(AbstractC9008l.amazon(str2));
        if (iIndexOf == -1) {
            return "";
        }
        String strSubstring = str.substring(str2.length() + iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(44);
        if (iIndexOf2 == -1) {
            iIndexOf2 = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf2 - 1) == '\\') {
            iIndexOf2 = strSubstring.indexOf(44, iIndexOf2 + 1);
            if (iIndexOf2 == -1) {
                iIndexOf2 = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf2);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith("\"")) {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.endsWith("\"")) {
            strSubstring3 = AbstractC1757l.m1035native(1, 0, strSubstring3);
        }
        StringBuilder sb = new StringBuilder(strSubstring3.length() * 2);
        int length = strSubstring3.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strSubstring3.charAt(i);
            if (cCharAt < ']') {
                sb.append(yandex[cCharAt]);
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
