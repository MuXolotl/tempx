package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lؚّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7216l implements InterfaceC13883l {
    public final InterfaceC13504l crashlytics;
    public final int loadAd;
    public final byte[] yandex;

    public C7216l(byte[] bArr, C0346l c0346l, int i) {
        this.crashlytics = C12371l.amazon(C0347l.subs(C9852l.loadAd(bArr.length), new C7972l(24, C0346l.yandex(bArr))));
        this.yandex = c0346l.loadAd();
        this.loadAd = i;
    }

    public final byte[] crashlytics(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            C18262l.ads("invalid salt size");
            return null;
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        InterfaceC13504l interfaceC13504l = this.crashlytics;
        System.arraycopy(interfaceC13504l.mo1221throws(16, bArr2), 0, bArr4, 0, 16);
        System.arraycopy(interfaceC13504l.mo1221throws(16, bArr3), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            C6541l.subs("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.yandex;
        int length2 = bArr3.length;
        int i = this.loadAd;
        if (length < length2 + i + 28) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr3, bArr)) {
            C18262l.ads("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        int length3 = bArr3.length + i;
        byte[] bArrCrashlytics = crashlytics(Arrays.copyOfRange(bArr, bArr3.length, length3));
        if (!AbstractC12589l.ad(2)) {
            C18262l.ads("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecLoadAd = AbstractC1606l.loadAd(bArrCrashlytics);
        int i2 = length3 + 12;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, i2);
        if (bArrCopyOfRange.length != 12) {
            C18262l.ads("iv is wrong size");
            return null;
        }
        if (bArr.length < length3 + 28) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecYandex = AbstractC1606l.yandex(0, bArrCopyOfRange.length, bArrCopyOfRange);
        Cipher cipherCrashlytics = AbstractC1606l.crashlytics();
        cipherCrashlytics.init(2, secretKeySpecLoadAd, algorithmParameterSpecYandex);
        if (bArr2 != null && bArr2.length != 0) {
            cipherCrashlytics.updateAAD(bArr2);
        }
        return cipherCrashlytics.doFinal(bArr, i2, bArr.length - i2);
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            C6541l.subs("plaintext is null");
            return null;
        }
        int i = this.loadAd;
        int i2 = i + 12;
        byte[] bArrYandex = AbstractC14640l.yandex(i2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrYandex, i);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrYandex, i, i2);
        C7972l c7972l = new C7972l(crashlytics(bArrCopyOf));
        byte[] bArr3 = this.yandex;
        byte[] bArrM2237package = c7972l.m2237package(bArrCopyOfRange, bArr, bArr3.length + i + bArrCopyOfRange.length, bArr2);
        System.arraycopy(bArr3, 0, bArrM2237package, 0, bArr3.length);
        System.arraycopy(bArrYandex, 0, bArrM2237package, bArr3.length, bArrYandex.length);
        return bArrM2237package;
    }
}
