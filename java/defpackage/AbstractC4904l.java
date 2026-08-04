package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٕؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4904l {
    public static final Pattern yandex = Pattern.compile("^NOTE([ \t].*)?$");

    public static void amazon(C13143l c13143l) {
        int i = c13143l.loadAd;
        if (yandex(c13143l)) {
            return;
        }
        c13143l.m3562for(i);
        throw C17655l.yandex(null, "Expected WEBVTT. Got " + c13143l.vip(StandardCharsets.UTF_8));
    }

    public static long crashlytics(String str) {
        String str2 = AbstractC15323l.yandex;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                C8339l.metrica("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static float loadAd(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static boolean yandex(C13143l c13143l) {
        c13143l.getClass();
        String strVip = c13143l.vip(StandardCharsets.UTF_8);
        return strVip != null && strVip.startsWith("WEBVTT");
    }
}
