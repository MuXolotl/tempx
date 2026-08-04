package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lٓؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13942l implements InterfaceC13883l {
    public static final C17548l purchase = new C17548l(1);
    public final int amazon;
    public final SecretKeySpec crashlytics;
    public final InterfaceC13504l loadAd;
    public final byte[] yandex;

    public C13942l(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!AbstractC12589l.pro(1)) {
            C18262l.ads("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            C8339l.metrica("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.amazon = i;
        AbstractC4630l.yandex(bArr.length);
        this.crashlytics = new SecretKeySpec(bArr, "AES");
        this.loadAd = C12371l.amazon(C0347l.subs(C9852l.loadAd(bArr.length), new C7972l(24, C0346l.yandex(bArr))));
        this.yandex = bArr2;
    }

    public final byte[] crashlytics(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.loadAd.mo1221throws(16, bArr2);
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.yandex;
        int length2 = length - bArr3.length;
        int i = this.amazon;
        int i2 = (length2 - i) - 16;
        if (i2 < 0) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr3, bArr)) {
            C18262l.ads("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrCrashlytics = crashlytics(bArr, 0, bArr3.length, i);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCrashlytics2 = crashlytics(bArr2, 1, 0, bArr2.length);
        byte[] bArrCrashlytics3 = crashlytics(bArr, 2, bArr3.length + i, i2);
        int length3 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length3 + i3] ^ bArrCrashlytics2[i3]) ^ bArrCrashlytics[i3]) ^ bArrCrashlytics3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) purchase.get();
        cipher.init(1, this.crashlytics, new IvParameterSpec(bArrCrashlytics));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.yandex;
        int length2 = Alert.DURATION_SHOW_INDEFINITELY - bArr3.length;
        int i = this.amazon;
        if (length > (length2 - i) - 16) {
            C18262l.ads("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
        byte[] bArrYandex = AbstractC14640l.yandex(i);
        System.arraycopy(bArrYandex, 0, bArrCopyOf, bArr3.length, i);
        byte[] bArrCrashlytics = crashlytics(bArrYandex, 0, 0, bArrYandex.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCrashlytics2 = crashlytics(bArr2, 1, 0, bArr2.length);
        Cipher cipher = (Cipher) purchase.get();
        cipher.init(1, this.crashlytics, new IvParameterSpec(bArrCrashlytics));
        cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + i);
        byte[] bArrCrashlytics3 = crashlytics(bArrCopyOf, 2, bArr3.length + i, bArr.length);
        int length3 = bArr3.length + bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArrCopyOf[length3 + i2] = (byte) ((bArrCrashlytics2[i2] ^ bArrCrashlytics[i2]) ^ bArrCrashlytics3[i2]);
        }
        return bArrCopyOf;
    }
}
