package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؙؚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6320l {
    public static final byte[] loadAd;
    public static final Charset yandex;

    static {
        Charset.forName("US-ASCII");
        yandex = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        loadAd = bArr;
        ByteBuffer.wrap(bArr);
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
