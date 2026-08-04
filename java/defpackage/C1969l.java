package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;

/* JADX INFO: renamed from: lٜؓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1969l {
    public static final Object yandex = new Object();

    public static boolean yandex(String str) {
        synchronized (yandex) {
            try {
                String strLoadAd = AbstractC4630l.loadAd(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(strLoadAd)) {
                        return false;
                    }
                    AbstractC17742l.loadAd(strLoadAd);
                    return true;
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C8904l loadAd(String str) {
        C8904l c8904l;
        try {
            synchronized (yandex) {
                try {
                    c8904l = new C8904l(AbstractC4630l.loadAd(str));
                    byte[] bArrYandex = AbstractC14640l.yandex(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrYandex, c8904l.loadAd(c8904l.yandex(bArrYandex, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c8904l;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
