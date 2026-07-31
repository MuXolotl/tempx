package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lٗؓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16866l {
    public static final Set yandex = AbstractC8669l.m2407import(new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    public static final String loadAd(String str) {
        StringBuilder sb = new StringBuilder("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                sb.append("\\\\");
            }
        }
        sb.append("\"");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[LOOP:2: B:30:0x0056->B:34:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0068 A[SYNTHETIC] */
    public static final boolean yandex(String str) {
        int length;
        int i;
        if (str.length() != 0) {
            if (str.length() < 2) {
                length = str.length();
                for (i = 0; i < length; i++) {
                    if (!yandex.contains(Character.valueOf(str.charAt(i)))) {
                    }
                }
                break;
                break;
            }
            if (str.length() == 0) {
                C1759l.firebase("Char sequence is empty.");
                return false;
            }
            if (str.charAt(0) != '\"' || AbstractC12024l.m3320else(str) != '\"') {
                length = str.length();
                while (i < length) {
                    if (!yandex.contains(Character.valueOf(str.charAt(i)))) {
                    }
                }
                break;
            }
            int i2 = 1;
            do {
                int iM3321extends = AbstractC12024l.m3321extends(str, '\"', i2, 4);
                if (iM3321extends == AbstractC12024l.m3350volatile(str)) {
                    break;
                }
                int i3 = 0;
                for (int i4 = iM3321extends - 1; str.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    length = str.length();
                    while (i < length) {
                        if (!yandex.contains(Character.valueOf(str.charAt(i)))) {
                        }
                    }
                    break;
                    break;
                }
                i2 = iM3321extends + 1;
            } while (i2 < str.length());
            return false;
        }
        return true;
    }
}
