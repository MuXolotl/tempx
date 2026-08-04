package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lٍٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9610l implements InterfaceC13883l {
    public final byte[] amazon;
    public final int crashlytics;
    public final C18313l loadAd;
    public final C0638l yandex;

    public C9610l(C0638l c0638l, C18313l c18313l, int i, byte[] bArr) {
        this.yandex = c0638l;
        this.loadAd = c18313l;
        this.crashlytics = i;
        this.amazon = bArr;
    }

    public static C9610l crashlytics(C1778l c1778l) {
        byte[] bArrLoadAd = ((C0346l) c1778l.subs.f16631l).loadAd();
        C8378l c8378l = c1778l.admob;
        C0638l c0638l = new C0638l(bArrLoadAd, c8378l.crashlytics);
        C17219l c17219l = new C17219l("HMAC".concat(String.valueOf(c8378l.billing)), new SecretKeySpec(((C0346l) c1778l.isPro.f16631l).loadAd(), "HMAC"));
        int i = c8378l.amazon;
        return new C9610l(c0638l, new C18313l(i, c17219l), i, c1778l.firebase.loadAd());
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.amazon;
        int length2 = bArr3.length;
        int i = this.crashlytics;
        if (length < length2 + i) {
            C18262l.ads("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!AbstractC0647l.yandex(bArr3, bArr)) {
            C18262l.ads("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(this.loadAd.yandex(AbstractC17265l.amazon(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            C18262l.ads("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        C0638l c0638l = this.yandex;
        int i2 = c0638l.loadAd;
        if (length3 < i2) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 0, i2);
        int length4 = bArrCopyOfRange.length;
        int i3 = c0638l.loadAd;
        byte[] bArr5 = new byte[length4 - i3];
        c0638l.yandex(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr5, 0, bArr4, false);
        return bArr5;
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        C0638l c0638l = this.yandex;
        int i = c0638l.loadAd;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY - i;
        if (length > i2) {
            throw new GeneralSecurityException(AbstractC0653l.vip(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrYandex = AbstractC14640l.yandex(i);
        System.arraycopy(bArrYandex, 0, bArr3, 0, i);
        c0638l.yandex(bArr, 0, bArr.length, bArr3, c0638l.loadAd, bArrYandex, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC17265l.amazon(this.amazon, bArr3, this.loadAd.yandex(AbstractC17265l.amazon(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }
}
