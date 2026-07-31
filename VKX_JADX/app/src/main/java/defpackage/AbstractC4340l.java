package defpackage;

import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: lؖۗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4340l {
    public static boolean loadAd;
    public static SharedPreferences yandex;

    public static String crashlytics(TreeMap treeMap) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append(str);
            sb.append(str2);
        }
        sb.append("c6fd658cbb3e890ad61f1c3f809cb14d");
        try {
            return AbstractC12024l.m3340static(32, new BigInteger(1, MessageDigest.getInstance("MD5").digest(sb.toString().getBytes(AbstractC9050l.yandex))).toString(16));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String loadAd(TreeMap treeMap) {
        TreeMap treeMap2 = new TreeMap((Map) treeMap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (sb.length() > 0) {
                sb.append("&");
            }
            try {
                sb.append(URLEncoder.encode(str, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void yandex() {
        if (loadAd) {
            return;
        }
        C18073l.license("Scrobbler not initialized!");
    }
}
