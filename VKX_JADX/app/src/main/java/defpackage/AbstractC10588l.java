package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lَۜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10588l {
    public static final List loadAd;
    public static final String[] yandex;

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        yandex = strArr;
        loadAd = Arrays.asList(strArr);
    }

    public static void loadAd(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC8576l.subs(cCharAt, 32) < 0 && cCharAt != '\t') {
                StringBuilder sbIsVip = AbstractC5020l.isVip("Header value '", str, "' contains illegal character '");
                sbIsVip.append(str.charAt(i2));
                sbIsVip.append("' (code ");
                throw new C14612l(AbstractC0653l.adcel(sbIsVip, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    public static void yandex(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC8576l.subs(cCharAt, 32) <= 0 || AbstractC12024l.inmobi("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbIsVip = AbstractC5020l.isVip("Header name '", str, "' contains illegal character '");
                sbIsVip.append(str.charAt(i2));
                sbIsVip.append("' (code ");
                throw new C14612l(AbstractC0653l.adcel(sbIsVip, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }
}
