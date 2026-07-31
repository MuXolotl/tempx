package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lؓؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1561l {
    public final byte[] loadAd;
    public final byte[] yandex;

    public C1561l() {
        this.yandex = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        byte[] bArr = new byte[128];
        this.loadAd = bArr;
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.yandex;
            if (i >= bArr2.length) {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public static boolean crashlytics(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public byte[] loadAd(int i, int i2, String str) throws IOException {
        if (str == null) {
            C6541l.subs("'str' cannot be null");
            return null;
        }
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            C18262l.adcel("invalid offset and/or length specified");
            return null;
        }
        if ((i2 & 1) != 0) {
            C18262l.metrica("a hexadecimal encoding must have an even number of characters");
            return null;
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            char cCharAt = str.charAt(i);
            byte[] bArr2 = this.loadAd;
            i += 2;
            int i5 = bArr2[str.charAt(i + 1)] | (bArr2[cCharAt] << 4);
            if (i5 < 0) {
                C18262l.metrica("invalid characters encountered in Hex string");
                return null;
            }
            bArr[i4] = (byte) i5;
        }
        return bArr;
    }

    public int yandex(String str, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && crashlytics(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length && crashlytics(str.charAt(i))) {
                i++;
            }
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            byte[] bArr2 = this.loadAd;
            byte b = bArr2[cCharAt];
            while (i4 < length && crashlytics(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = bArr2[str.charAt(i4)];
            if ((b | b2) < 0) {
                C18262l.metrica("invalid characters encountered in Hex string");
                return 0;
            }
            int i6 = i2 + 1;
            bArr[i2] = (byte) ((b << 4) | b2);
            if (i6 == 36) {
                byteArrayOutputStream.write(bArr);
                i2 = 0;
            } else {
                i2 = i6;
            }
            i3++;
            i = i5;
        }
        if (i2 > 0) {
            byteArrayOutputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    public /* synthetic */ C1561l(byte[] bArr, byte[] bArr2) {
        this.yandex = bArr;
        this.loadAd = bArr2;
    }
}
