package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.KeyGenerator;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17742l {
    public static final C15578l yandex = new C15578l(-2034349453, false, new C5142l(9));
    public static final C15578l loadAd = new C15578l(1602071985, false, new C2464l(19));

    public static boolean amazon(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static C0672l crashlytics(String str, Exception exc) {
        return new C0672l(AbstractC12900l.admob(exc, AbstractC5020l.advert(str, "-")), exc);
    }

    public static void loadAd(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
    }

    public static void yandex(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
        jArr2[i + 5] = jArr[5];
        jArr2[i + 6] = jArr[6];
        jArr2[i + 7] = jArr[7];
        jArr2[i + 8] = jArr[8];
    }
}
