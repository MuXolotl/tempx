package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lٔۖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15088l implements InterfaceC13883l {
    public final Provider crashlytics;
    public final byte[] loadAd;
    public final byte[] yandex;

    public C15088l(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            C18073l.smaato("The key length in bytes must be 32.");
            throw null;
        }
        this.yandex = bArr;
        this.loadAd = bArr2;
        this.crashlytics = provider;
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            C6541l.subs("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.loadAd;
        if (length < bArr3.length + 40) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr3, bArr)) {
            C18262l.ads("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC0784l.yandex(this.yandex, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = C2254l.amazon;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.crashlytics);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            C6541l.subs("plaintext is null");
            return null;
        }
        byte[] bArrYandex = AbstractC14640l.yandex(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC0784l.yandex(this.yandex, bArrYandex), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArrYandex, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        byte[] bArr4 = C2254l.amazon;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.crashlytics);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr5 = this.loadAd;
        if (outputSize > 2147483623 - bArr5.length) {
            C18262l.ads("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + 24 + outputSize);
        System.arraycopy(bArrYandex, 0, bArrCopyOf, bArr5.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr5.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        C18262l.ads("not enough data written");
        return null;
    }
}
