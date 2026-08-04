package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lؔۙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2875l extends SecureRandom {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f6243l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f6244l;

    public C2875l(byte[] bArr, AbstractC1821l abstractC1821l) {
        if (bArr.length >= 48) {
            byte[] bArr2 = new byte[48];
            System.arraycopy(bArr, 0, bArr2, 0, 48);
            byte[] bArr3 = new byte[32];
            this.f6244l = bArr3;
            byte[] bArr4 = new byte[16];
            this.f6243l = bArr4;
            yandex(bArr2, bArr3, bArr4);
            return;
        }
        int length = 48 - bArr.length;
        int digestSize = abstractC1821l.getDigestSize();
        abstractC1821l.update(bArr, 0, bArr.length);
        byte[] bArrRemoteconfig = new byte[digestSize];
        abstractC1821l.doFinal(bArrRemoteconfig, 0);
        if (length != digestSize) {
            if (length < digestSize) {
                bArrRemoteconfig = AbstractC14024l.remoteconfig(length, bArrRemoteconfig);
            } else {
                byte[] bArrRemoteconfig2 = AbstractC14024l.remoteconfig(digestSize, bArrRemoteconfig);
                while (true) {
                    length -= digestSize;
                    if (length < digestSize) {
                        break;
                    }
                    abstractC1821l.update(bArrRemoteconfig, 0, digestSize);
                    bArrRemoteconfig = new byte[digestSize];
                    abstractC1821l.doFinal(bArrRemoteconfig, 0);
                    bArrRemoteconfig2 = AbstractC14024l.mopub(bArrRemoteconfig2, bArrRemoteconfig);
                }
                if (length > 0) {
                    abstractC1821l.update(bArrRemoteconfig, 0, digestSize);
                    byte[] bArr5 = new byte[digestSize];
                    abstractC1821l.doFinal(bArr5, 0);
                    int length2 = bArrRemoteconfig2.length;
                    bArrRemoteconfig = AbstractC14024l.remoteconfig(length2 + length, bArrRemoteconfig2);
                    System.arraycopy(bArr5, 0, bArrRemoteconfig, length2, length);
                } else {
                    bArrRemoteconfig = bArrRemoteconfig2;
                }
            }
        }
        byte[] bArr6 = new byte[48];
        System.arraycopy(AbstractC14024l.mopub(bArr, bArrRemoteconfig), 0, bArr6, 0, 48);
        byte[] bArr7 = new byte[32];
        this.f6244l = bArr7;
        byte[] bArr8 = new byte[16];
        this.f6243l = bArr8;
        yandex(bArr6, bArr7, bArr8);
    }

    public static void loadAd(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        try {
            metrica metricaVarLoadAd = metrica.loadAd();
            metricaVarLoadAd.init(true, new C13886l(bArr));
            for (int i2 = 0; i2 != bArr2.length; i2 += 16) {
                metricaVarLoadAd.tapsense(i2, i + i2, bArr2, bArr3);
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: " + th.getMessage(), th);
        }
    }

    public static void yandex(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            for (int i2 = 15; i2 >= 0; i2--) {
                byte b = bArr3[i2];
                if ((b & 255) != 255) {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                }
                bArr3[i2] = 0;
            }
            loadAd(bArr2, i * 16, bArr3, bArr4);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (true) {
            byte[] bArr3 = this.f6244l;
            byte[] bArr4 = this.f6243l;
            if (length <= 0) {
                yandex(null, bArr3, bArr4);
                return;
            }
            for (int i2 = 15; i2 >= 0; i2--) {
                byte b = bArr4[i2];
                if ((b & 255) != 255) {
                    bArr4[i2] = (byte) (b + 1);
                    break;
                }
                bArr4[i2] = 0;
            }
            loadAd(bArr3, 0, bArr4, bArr2);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
    }
}
