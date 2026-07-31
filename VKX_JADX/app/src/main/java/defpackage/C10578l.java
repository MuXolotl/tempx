package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lَۛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10578l implements InterfaceC13883l {
    public final byte[] crashlytics;
    public final SecretKeySpec loadAd;
    public final C14377l yandex;
    public static final byte[] amazon = AbstractC1315l.crashlytics("7a806c");
    public static final byte[] purchase = AbstractC1315l.crashlytics("46bb91c3c5");
    public static final byte[] billing = AbstractC1315l.crashlytics("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] mopub = AbstractC1315l.crashlytics("bae8e37fc83441b16034566b");
    public static final byte[] admob = AbstractC1315l.crashlytics("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    public C10578l(byte[] bArr, byte[] bArr2, C14377l c14377l) throws InvalidAlgorithmParameterException {
        this.crashlytics = bArr2;
        AbstractC4630l.yandex(bArr.length);
        this.loadAd = new SecretKeySpec(bArr, "AES");
        this.yandex = c14377l;
    }

    public static boolean crashlytics(Cipher cipher) {
        try {
            byte[] bArr = mopub;
            cipher.init(2, new SecretKeySpec(billing, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(purchase);
            byte[] bArr2 = admob;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), amazon);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.crashlytics;
        if (length < bArr3.length + 28) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr3, bArr)) {
            C18262l.ads("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        Cipher cipherYandex = this.yandex.yandex();
        cipherYandex.init(2, this.loadAd, new GCMParameterSpec(128, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherYandex.updateAAD(bArr2);
        }
        return cipherYandex.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherYandex = this.yandex.yandex();
        int length = bArr.length;
        byte[] bArr3 = this.crashlytics;
        if (length > 2147483619 - bArr3.length) {
            C18262l.ads("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrYandex = AbstractC14640l.yandex(12);
        System.arraycopy(bArrYandex, 0, bArrCopyOf, bArr3.length, 12);
        cipherYandex.init(1, this.loadAd, new GCMParameterSpec(128, bArrYandex, 0, bArrYandex.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherYandex.updateAAD(bArr2);
        }
        int iDoFinal = cipherYandex.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(AbstractC15560l.tapsense("encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
    }
}
