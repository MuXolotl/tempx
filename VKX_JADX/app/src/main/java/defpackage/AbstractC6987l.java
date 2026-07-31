package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lُؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6987l {
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        map.put("0", "0000");
        map.put("1", "0001");
        map.put("2", "0010");
        map.put("3", "0011");
        map.put("4", "0100");
        map.put("5", "0101");
        map.put("6", "0110");
        map.put("7", "0111");
        map.put("8", "1000");
        map.put("9", "1001");
        map.put("a", "1010");
        map.put("b", "1011");
        map.put("c", "1100");
        map.put("d", "1101");
        map.put("e", "1110");
        map.put("f", "1111");
    }

    public static String yandex(byte b) {
        String str;
        String strSubstring;
        String strSubstring2;
        String hexString = Integer.toHexString(b);
        String str2 = "";
        try {
            if (hexString.length() == 8) {
                strSubstring = hexString.substring(6, 7);
                strSubstring2 = hexString.substring(7, 8);
            } else {
                if (hexString.length() != 2) {
                    if (hexString.length() == 1) {
                        strSubstring = "0";
                        strSubstring2 = hexString.substring(0, 1);
                    } else {
                        str = "";
                    }
                    StringBuilder sb = new StringBuilder();
                    HashMap map = yandex;
                    sb.append((String) map.get(str2));
                    sb.append((String) map.get(str));
                    return sb.toString();
                }
                strSubstring = hexString.substring(0, 1);
                strSubstring2 = hexString.substring(1, 2);
            }
            str = strSubstring2;
            str2 = strSubstring;
            StringBuilder sb2 = new StringBuilder();
            HashMap map2 = yandex;
            sb2.append((String) map2.get(str2));
            sb2.append((String) map2.get(str));
            return sb2.toString();
        } catch (StringIndexOutOfBoundsException unused) {
            return "";
        }
    }
}
