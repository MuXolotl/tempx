package defpackage;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9298l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C11104l f19107l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f19108l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9298l(byte[] bArr) {
        super(true);
        if (bArr.length != 57) {
            C8339l.metrica("'buf' must have length 57");
            throw null;
        }
        byte[] bArr2 = new byte[57];
        this.f19108l = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 57);
    }

    public final void loadAd(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[57];
        AbstractC15960l.billing(yandex().f22309l, bArr4, 0);
        if (bArr == null) {
            C6541l.subs("'ctx' cannot be null");
            return;
        }
        if (bArr.length > 255) {
            C8339l.metrica("ctx");
            return;
        }
        if (bArr == null || bArr.length >= 256) {
            C8339l.metrica("ctx");
            return;
        }
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        byte[] bArr5 = new byte[114];
        c17951l.billing(0, 57, this.f19108l);
        c17951l.crashlytics(0, 114, bArr5);
        byte[] bArr6 = new byte[57];
        AbstractC15960l.subscription(bArr5, bArr6);
        AbstractC15960l.purchase((byte) 0, c17951l, bArr);
        c17951l.billing(57, 57, bArr5);
        c17951l.billing(0, i, bArr2);
        c17951l.crashlytics(0, 114, bArr5);
        byte[] bArrBilling = AbstractC1896l.billing(bArr5);
        byte[] bArr7 = new byte[57];
        C10111l c10111l = new C10111l(16);
        AbstractC15960l.tapsense(bArrBilling, c10111l);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        AbstractC6791l.adcel((int[]) c10111l.f20589l, iArr2);
        AbstractC6791l.tapsense(iArr2, (int[]) c10111l.f20587l, iArr);
        AbstractC6791l.tapsense(iArr2, (int[]) c10111l.f20586l, iArr2);
        AbstractC6791l.license(iArr, 1);
        AbstractC6791l.license(iArr, -1);
        AbstractC6791l.license(iArr2, 1);
        AbstractC6791l.license(iArr2, -1);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        AbstractC6791l.ad(iArr, iArr4);
        AbstractC6791l.ad(iArr2, iArr5);
        AbstractC6791l.tapsense(iArr4, iArr5, iArr3);
        AbstractC6791l.crashlytics(iArr4, iArr5, iArr4);
        AbstractC6791l.subscription(39081, iArr3, iArr3);
        int[] iArr6 = new int[16];
        iArr6[0] = 1;
        AbstractC6791l.advert(iArr3, iArr6, iArr3);
        AbstractC6791l.crashlytics(iArr3, iArr4, iArr3);
        AbstractC6791l.license(iArr3, 1);
        AbstractC6791l.license(iArr3, -1);
        AbstractC6791l.license(iArr5, 1);
        AbstractC6791l.license(iArr5, -1);
        int iAds = (~AbstractC6791l.ads(iArr5)) & AbstractC6791l.ads(iArr3);
        AbstractC6791l.vip(0, bArr7, iArr2);
        bArr7[56] = (byte) ((iArr[0] & 1) << 7);
        if (iAds == 0) {
            C18073l.admob();
            return;
        }
        AbstractC15960l.purchase((byte) 0, c17951l, bArr);
        c17951l.billing(0, 57, bArr7);
        c17951l.billing(0, 57, bArr4);
        c17951l.billing(0, i, bArr2);
        c17951l.crashlytics(0, 114, bArr5);
        byte[] bArrBilling2 = AbstractC1896l.billing(bArr5);
        int[] iArr7 = new int[28];
        AbstractC1896l.purchase(bArrBilling, iArr7);
        int[] iArr8 = new int[14];
        AbstractC1896l.purchase(bArrBilling2, iArr8);
        int[] iArr9 = new int[14];
        AbstractC1896l.purchase(bArr6, iArr9);
        long j = 0;
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = i2 + 14;
            long jAdvert = j + (((long) AbstractC4952l.advert(14, iArr8[i2], iArr9, iArr7, i2)) & 4294967295L) + (((long) iArr7[i3]) & 4294967295L);
            iArr7[i3] = (int) jAdvert;
            j = jAdvert >>> 32;
        }
        byte[] bArr8 = new byte[114];
        AbstractC16655l.billing(28, bArr8, iArr7);
        byte[] bArrBilling3 = AbstractC1896l.billing(bArr8);
        System.arraycopy(bArr7, 0, bArr3, 0, 57);
        System.arraycopy(bArrBilling3, 0, bArr3, 57, 57);
    }

    public final C11104l yandex() {
        C11104l c11104l;
        synchronized (this.f19108l) {
            try {
                if (this.f19107l == null) {
                    this.f19107l = new C11104l(AbstractC15960l.mopub(this.f19108l));
                }
                c11104l = this.f19107l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11104l;
    }

    public C9298l(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.f19108l = bArr;
        if (bArr.length == 57) {
            secureRandom.nextBytes(bArr);
        } else {
            C8339l.metrica("k");
            throw null;
        }
    }
}
