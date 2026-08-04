package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lؚؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6976l implements InterfaceC10135l {
    public final byte[] crashlytics;
    public final byte[] loadAd;
    public final InterfaceC13504l yandex;
    public static final byte[] amazon = new byte[16];
    public static final byte[] purchase = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final C17548l billing = new C17548l(4);

    public C6976l(byte[] bArr, C0346l c0346l) throws GeneralSecurityException {
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(AbstractC15560l.tapsense("invalid key size: ", bArr.length, " bytes; key must have 32 or 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.loadAd = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.yandex = C12371l.amazon(C0347l.subs(C9852l.loadAd(bArrCopyOfRange.length), new C7972l(24, C0346l.yandex(bArrCopyOfRange))));
        this.crashlytics = c0346l.loadAd();
    }

    public static void amazon(int i) throws GeneralSecurityException {
        if (i > 126) {
            throw new GeneralSecurityException(AbstractC15560l.tapsense("Too many associated datas: ", i, " > 126"));
        }
    }

    public final byte[] crashlytics(byte[]... bArr) {
        byte[] bArrFirebase;
        int length = bArr.length;
        InterfaceC13504l interfaceC13504l = this.yandex;
        if (length == 0) {
            return interfaceC13504l.mo1221throws(16, purchase);
        }
        byte[] bArrMo1221throws = interfaceC13504l.mo1221throws(16, amazon);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrMo1221throws = AbstractC17265l.firebase(AbstractC18323l.amazon(bArrMo1221throws), interfaceC13504l.mo1221throws(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrMo1221throws.length) {
                C8339l.metrica("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - bArrMo1221throws.length;
            bArrFirebase = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrMo1221throws.length; i2++) {
                int i3 = length2 + i2;
                bArrFirebase[i3] = (byte) (bArrFirebase[i3] ^ bArrMo1221throws[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                C8339l.metrica("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrFirebase = AbstractC17265l.firebase(bArrCopyOf, AbstractC18323l.amazon(bArrMo1221throws));
        }
        return interfaceC13504l.mo1221throws(16, bArrFirebase);
    }

    @Override // defpackage.InterfaceC10135l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        amazon(1);
        int length = bArr.length;
        byte[] bArr4 = this.crashlytics;
        if (length < bArr4.length + 16) {
            C18262l.ads("Ciphertext too short.");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr4, bArr)) {
            C18262l.ads("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        Cipher cipher = (Cipher) billing.get();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipher.init(2, new SecretKeySpec(this.loadAd, "AES"), new IvParameterSpec(bArr5));
        int length2 = bArr4.length + 16;
        int length3 = bArr.length - length2;
        byte[] bArrDoFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr6[1] = bArrDoFinal;
        if (MessageDigest.isEqual(bArrCopyOfRange, crashlytics(bArr6))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // defpackage.InterfaceC10135l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        amazon(1);
        int length = bArr.length;
        byte[] bArr4 = this.crashlytics;
        if (length > 2147483631 - bArr4.length) {
            C18262l.ads("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) billing.get();
        byte[][] bArr5 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr5[1] = bArr;
        byte[] bArrCrashlytics = crashlytics(bArr5);
        byte[] bArr6 = (byte[]) bArrCrashlytics.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipher.init(1, new SecretKeySpec(this.loadAd, "AES"), new IvParameterSpec(bArr6));
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + bArrCrashlytics.length + bArr.length);
        System.arraycopy(bArrCrashlytics, 0, bArrCopyOf, bArr4.length, bArrCrashlytics.length);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr4.length + bArrCrashlytics.length) == bArr.length) {
            return bArrCopyOf;
        }
        C18262l.ads("not enough data written");
        return null;
    }
}
