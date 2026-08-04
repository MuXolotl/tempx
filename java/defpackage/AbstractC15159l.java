package defpackage;

/* JADX INFO: renamed from: lٌٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15159l {
    public static final byte[] loadAd;
    public static final short[] yandex = new short[128];

    static {
        byte[] bArr = new byte[112];
        loadAd = bArr;
        byte[] bArr2 = new byte[128];
        yandex(bArr2, 0, 15, (byte) 1);
        yandex(bArr2, 16, 31, (byte) 2);
        yandex(bArr2, 32, 63, (byte) 3);
        yandex(bArr2, 64, 65, (byte) 0);
        yandex(bArr2, 66, 95, (byte) 4);
        yandex(bArr2, 96, 96, (byte) 5);
        yandex(bArr2, 97, 108, (byte) 6);
        yandex(bArr2, 109, 109, (byte) 7);
        yandex(bArr2, 110, 111, (byte) 6);
        yandex(bArr2, 112, 112, (byte) 8);
        yandex(bArr2, 113, 115, (byte) 9);
        yandex(bArr2, 116, 116, (byte) 10);
        yandex(bArr2, 117, 127, (byte) 0);
        yandex(bArr, 0, bArr.length - 1, (byte) -2);
        yandex(bArr, 8, 11, (byte) -1);
        yandex(bArr, 24, 27, (byte) 0);
        yandex(bArr, 40, 43, (byte) 16);
        yandex(bArr, 58, 59, (byte) 0);
        yandex(bArr, 72, 73, (byte) 0);
        yandex(bArr, 89, 91, (byte) 16);
        yandex(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            yandex[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    public static void yandex(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
