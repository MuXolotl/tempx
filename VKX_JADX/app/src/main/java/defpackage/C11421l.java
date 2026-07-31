package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُٜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C11421l {
    public final boolean amazon;
    public final boolean crashlytics;
    public final Class loadAd;
    public final long purchase;
    public final String yandex;

    public C11421l(String str, Class cls, boolean z, boolean z2) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            C8339l.metrica("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                C8339l.metrica("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.yandex = str;
        this.loadAd = cls;
        this.crashlytics = z;
        this.amazon = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.purchase = j;
    }

    public void loadAd(Object obj, C16979l c16979l) {
        c16979l.yandex(obj, this.yandex);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.loadAd.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.yandex;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        AbstractC9361l.appmetrica(sb, name, "/", str, "[");
        return AbstractC0653l.ads(sb, name2, "]");
    }

    public void yandex(Iterator it, C16979l c16979l) {
        while (it.hasNext()) {
            loadAd(it.next(), c16979l);
        }
    }
}
