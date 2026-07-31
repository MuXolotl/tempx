package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* JADX INFO: renamed from: lًٝٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8151l {
    public static final ThreadLocal yandex = new ThreadLocal();

    public static boolean amazon(String str, boolean z) {
        try {
            String strLoadAd = loadAd(str);
            if (z) {
                return purchase(strLoadAd);
            }
            return strLoadAd != null && strLoadAd.length() == 5 && (strLoadAd.charAt(0) == 'f' || strLoadAd.charAt(0) == 'F') && ((strLoadAd.charAt(1) == 'a' || strLoadAd.charAt(1) == 'A') && ((strLoadAd.charAt(2) == 'l' || strLoadAd.charAt(2) == 'L') && ((strLoadAd.charAt(3) == 's' || strLoadAd.charAt(3) == 'S') && (strLoadAd.charAt(4) == 'e' || strLoadAd.charAt(4) == 'E'))));
        } catch (AccessControlException unused) {
        }
    }

    public static boolean crashlytics(String str) {
        try {
            return purchase(loadAd(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static String loadAd(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new C5975l(str, 0));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) yandex.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new C5975l(str, 1)) : str2;
    }

    public static boolean purchase(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        return (str.charAt(0) == 't' || str.charAt(0) == 'T') && (str.charAt(1) == 'r' || str.charAt(1) == 'R') && ((str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E'));
    }

    public static int yandex(int i, String str) {
        String strLoadAd = loadAd(str);
        return strLoadAd != null ? Integer.parseInt(strLoadAd) : i;
    }
}
