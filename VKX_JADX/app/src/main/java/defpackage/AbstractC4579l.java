package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؗؑؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4579l {
    public static final byte[] loadAd;
    public static final Charset yandex = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        loadAd = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C13690l(bArr, 0, 0, false).purchase(0);
        } catch (C5957l e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int loadAd(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static void yandex(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C6541l.subs(str);
    }
}
