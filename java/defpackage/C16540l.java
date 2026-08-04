package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٖٞۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16540l {
    public static final Pattern crashlytics = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern amazon = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final C13143l yandex = new C13143l();
    public final StringBuilder loadAd = new StringBuilder();

    public static void crashlytics(C13143l c13143l) {
        while (true) {
            for (boolean z = true; c13143l.yandex() > 0 && z; z = false) {
                int i = c13143l.loadAd;
                byte[] bArr = c13143l.yandex;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    c13143l.m3568throw(1);
                } else {
                    int i2 = c13143l.crashlytics;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            c13143l.m3568throw(i2 - c13143l.loadAd);
                        }
                    }
                }
            }
            return;
        }
    }

    public static String loadAd(C13143l c13143l, StringBuilder sb) {
        crashlytics(c13143l);
        if (c13143l.yandex() == 0) {
            return null;
        }
        String strYandex = yandex(c13143l, sb);
        if (!strYandex.isEmpty()) {
            return strYandex;
        }
        return "" + ((char) c13143l.signatures());
    }

    public static String yandex(C13143l c13143l, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c13143l.loadAd;
        int i2 = c13143l.crashlytics;
        while (i < i2 && !z) {
            char c = (char) c13143l.yandex[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        c13143l.m3568throw(i - c13143l.loadAd);
        return sb.toString();
    }
}
