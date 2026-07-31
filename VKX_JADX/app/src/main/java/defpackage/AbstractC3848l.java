package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؘؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3848l {
    public static final String yandex = System.getProperty("line.separator");

    public static void admob(long j, OutputStream outputStream) throws IOException {
        if (j < 0) {
            C8339l.metrica("positive value expected.");
            return;
        }
        byte[] bArr = new byte[4];
        for (int i = 0; i <= 24; i += 8) {
            bArr[i / 8] = (byte) ((j >> i) & 255);
        }
        outputStream.write(bArr);
    }

    public static C4421l amazon(InputStream inputStream) {
        if (inputStream == null) {
            C8339l.metrica("Argument must not be null");
            return null;
        }
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = inputStream.read();
        }
        return new C4421l(iArr);
    }

    public static long billing(InputStream inputStream) {
        long j = 0;
        for (int i = 0; i <= 56; i += 8) {
            j |= ((long) inputStream.read()) << i;
        }
        return j;
    }

    public static BigInteger crashlytics(InputStream inputStream) throws EOFException {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[8];
        if (inputStream.read(bArr) != 8) {
            C8339l.vip();
            return null;
        }
        for (int i = 0; i < 8; i++) {
            bArr2[7 - i] = bArr[i];
        }
        return new BigInteger(bArr2);
    }

    public static byte[] loadAd(String str, Charset charset) {
        ByteBuffer byteBufferEncode = charset.encode(str);
        byte[] bArr = new byte[byteBufferEncode.limit()];
        byteBufferEncode.rewind();
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static void mopub(int i, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (i < 0) {
            C8339l.metrica("positive value expected.");
            return;
        }
        byte[] bArr = new byte[2];
        for (int i2 = 0; i2 <= 8; i2 += 8) {
            bArr[i2 / 8] = (byte) ((i >> i2) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static long purchase(InputStream inputStream) {
        long j = 0;
        for (int i = 0; i <= 24; i += 8) {
            j |= ((long) inputStream.read()) << i;
        }
        return j;
    }

    public static void subs(long j, OutputStream outputStream) throws IOException {
        if (j < 0) {
            C8339l.metrica("positive value expected.");
            return;
        }
        byte[] bArr = new byte[8];
        for (int i = 0; i <= 56; i += 8) {
            bArr[i / 8] = (byte) ((j >> i) & 255);
        }
        outputStream.write(bArr);
    }

    public static void yandex(InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            int i = inputStream.read(bArr, 0, j3 < 8192 ? (int) j3 : 8192);
            if (i == -1) {
                C18262l.metrica(AbstractC2812l.subscription(j3, "Inputstream has to continue for another ", " bytes."));
                return;
            } else {
                outputStream.write(bArr, 0, i);
                j2 += (long) i;
            }
        }
    }
}
