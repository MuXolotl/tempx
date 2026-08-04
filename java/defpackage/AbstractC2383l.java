package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lُؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2383l {
    public static final byte[] admob;
    public static final byte[] amazon;
    public static final byte[] billing;
    public static final byte[] crashlytics;
    public static final byte[] firebase;
    public static final byte[] isPro;
    public static final byte[] loadAd;
    public static final byte[] metrica;
    public static final byte[] mopub;
    public static final byte[] purchase;
    public static final byte[] remoteconfig;
    public static final byte[] smaato;
    public static final byte[] subs;
    public static final byte[] vip;
    public static final byte[] yandex = loadAd(1, 0);

    static {
        loadAd(1, 2);
        loadAd = loadAd(2, 32);
        crashlytics = loadAd(2, 16);
        amazon = loadAd(2, 17);
        purchase = loadAd(2, 18);
        loadAd(2, 25722);
        billing = loadAd(2, 1);
        mopub = loadAd(2, 2);
        admob = loadAd(2, 3);
        subs = loadAd(2, 1);
        isPro = loadAd(2, 2);
        firebase = loadAd(2, 3);
        smaato = new byte[0];
        Charset charset = AbstractC0647l.yandex;
        remoteconfig = "KEM".getBytes(charset);
        vip = "HPKE".getBytes(charset);
        metrica = "HPKE-v1".getBytes(charset);
    }

    public static byte[] loadAd(int i, int i2) {
        if (i > 4 || i < 0) {
            C8339l.metrica("capacity must be between 0 and 4");
            return null;
        }
        if (i2 < 0 || (i < 4 && i2 >= (1 << (i * 8)))) {
            C8339l.metrica("value too large");
            return null;
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static int yandex(C15026l c15026l) throws GeneralSecurityException {
        if (c15026l == C15026l.mopub || c15026l == C15026l.amazon) {
            return 32;
        }
        if (c15026l == C15026l.purchase) {
            return 48;
        }
        if (c15026l == C15026l.billing) {
            return 66;
        }
        if (c15026l == C15026l.admob) {
            return 32;
        }
        C18262l.ads("Unrecognized HPKE KEM identifier");
        return 0;
    }
}
