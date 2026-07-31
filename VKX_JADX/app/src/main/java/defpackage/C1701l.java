package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: lًؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1701l {
    public static final String[] crashlytics = {"*", "FCM", "GCM", ""};
    public final String loadAd;
    public final SharedPreferences yandex;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public C1701l(C14184l c14184l) {
        c14184l.yandex();
        this.yandex = c14184l.yandex.getSharedPreferences("com.google.android.gms.appid", 0);
        c14184l.yandex();
        C1042l c1042l = c14184l.crashlytics;
        String str = c1042l.purchase;
        if (str == null) {
            c14184l.yandex();
            str = c1042l.loadAd;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.loadAd = str;
    }

    public final String loadAd() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.yandex) {
            String strEncodeToString = null;
            String string = this.yandex.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }

    public final String yandex() {
        String string;
        synchronized (this.yandex) {
            string = this.yandex.getString("|S|id", null);
        }
        return string;
    }
}
