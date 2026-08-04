package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lؓۦٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2254l implements InterfaceC13883l {
    public final Provider crashlytics;
    public final byte[] loadAd;
    public final SecretKeySpec yandex;
    public static final byte[] amazon = AbstractC1315l.crashlytics("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] purchase = AbstractC1315l.crashlytics("070000004041424344454647");
    public static final byte[] billing = AbstractC1315l.crashlytics("a0784d7a4716f3feb4f64e7f4b39bf04");

    public C2254l(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            C18073l.smaato("The key length in bytes must be 32.");
            throw null;
        }
        this.yandex = new SecretKeySpec(bArr, "ChaCha20");
        this.loadAd = bArr2;
        this.crashlytics = provider;
    }

    public static Cipher crashlytics() {
        Cipher cipher = (Cipher) C12437l.loadAd.yandex.appmetrica("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(purchase);
            byte[] bArr = amazon;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = billing;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        C18262l.ads("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            C6541l.subs("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.loadAd;
        if (length < bArr3.length + 28) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr3, bArr)) {
            C18262l.ads("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.crashlytics);
        cipher.init(2, this.yandex, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            C6541l.subs("plaintext is null");
            return null;
        }
        byte[] bArrYandex = AbstractC14640l.yandex(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrYandex);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.crashlytics);
        cipher.init(1, this.yandex, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.loadAd;
        if (outputSize > 2147483635 - bArr3.length) {
            C18262l.ads("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrYandex, 0, bArrCopyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        C18262l.ads("not enough data written");
        return null;
    }
}
