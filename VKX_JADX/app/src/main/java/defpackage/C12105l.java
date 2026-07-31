package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lِۚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12105l {
    public static final C11155l amazon = new C11155l("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final C11155l purchase = new C11155l(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String[] crashlytics;
    public final String loadAd;
    public final String yandex;

    public C12105l(String str, String str2, String[] strArr) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = strArr;
    }

    public static Charset yandex(C12105l c12105l) {
        String str;
        String[] strArr = c12105l.crashlytics;
        int i = 0;
        int iAmazon = AbstractC17764l.amazon(0, strArr.length - 1, 2);
        if (iAmazon < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!AbstractC16648l.license(strArr[i], "charset", true)) {
                if (i == iAmazon) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C12105l) && AbstractC8576l.yandex(((C12105l) obj).yandex, this.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex;
    }
}
