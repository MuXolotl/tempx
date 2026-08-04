package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lٖۛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16638l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f32614l;

    public C16638l(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.f32614l = bArr;
        if (bArr.length != 56) {
            C8339l.metrica("k");
            throw null;
        }
        secureRandom.nextBytes(bArr);
        if (bArr.length != 56) {
            C8339l.metrica("k");
            throw null;
        }
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public final C14685l yandex() {
        byte[] bArr = new byte[56];
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        byte[] bArr2 = new byte[57];
        AbstractC15960l.subscription(this.f32614l, bArr2);
        C10111l c10111l = new C10111l(16);
        AbstractC15960l.tapsense(bArr2, c10111l);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        AbstractC6791l.ad((int[]) c10111l.f20587l, iArr4);
        AbstractC6791l.ad((int[]) c10111l.f20586l, iArr5);
        AbstractC6791l.ad((int[]) c10111l.f20589l, iArr6);
        AbstractC6791l.tapsense(iArr4, iArr5, iArr3);
        AbstractC6791l.crashlytics(iArr4, iArr5, iArr4);
        AbstractC6791l.tapsense(iArr4, iArr6, iArr4);
        AbstractC6791l.ad(iArr6, iArr6);
        AbstractC6791l.subscription(39081, iArr3, iArr3);
        AbstractC6791l.advert(iArr3, iArr6, iArr3);
        AbstractC6791l.crashlytics(iArr3, iArr4, iArr3);
        AbstractC6791l.license(iArr3, 1);
        AbstractC6791l.license(iArr3, -1);
        AbstractC6791l.license(iArr5, 1);
        AbstractC6791l.license(iArr5, -1);
        AbstractC6791l.license(iArr6, 1);
        AbstractC6791l.license(iArr6, -1);
        if (((~AbstractC6791l.ads(iArr6)) & AbstractC6791l.ads(iArr3) & (~AbstractC6791l.ads(iArr5))) == 0) {
            C18073l.admob();
            return null;
        }
        AbstractC6791l.billing(0, 0, (int[]) c10111l.f20587l, iArr);
        AbstractC6791l.billing(0, 0, (int[]) c10111l.f20586l, iArr2);
        AbstractC6791l.adcel(iArr, iArr);
        AbstractC6791l.tapsense(iArr, iArr2, iArr);
        AbstractC6791l.ad(iArr, iArr);
        AbstractC6791l.license(iArr, 1);
        AbstractC6791l.license(iArr, -1);
        AbstractC6791l.vip(0, bArr, iArr);
        return new C14685l(bArr, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16638l(byte[] bArr) {
        super(true);
        if (bArr.length == 56) {
            byte[] bArr2 = new byte[56];
            this.f32614l = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, 56);
            return;
        }
        C8339l.metrica("'buf' must have length 56");
        throw null;
    }
}
