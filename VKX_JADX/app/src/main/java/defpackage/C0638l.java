package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lؑۡؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0638l {
    public static final C17548l amazon = new C17548l(0);
    public final int crashlytics;
    public final int loadAd;
    public final SecretKeySpec yandex;

    public C0638l(byte[] bArr, int i) throws GeneralSecurityException {
        if (!AbstractC12589l.ad(2)) {
            C18262l.ads("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        AbstractC4630l.yandex(bArr.length);
        this.yandex = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) amazon.get()).getBlockSize();
        this.crashlytics = blockSize;
        if (i < 12 || i > blockSize) {
            C18262l.ads("invalid IV size");
            throw null;
        }
        this.loadAd = i;
    }

    public final void yandex(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) amazon.get();
        byte[] bArr4 = new byte[this.crashlytics];
        System.arraycopy(bArr3, 0, bArr4, 0, this.loadAd);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.yandex;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        C18262l.ads("stored output's length does not match input's length");
    }
}
