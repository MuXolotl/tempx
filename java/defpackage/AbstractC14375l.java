package defpackage;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٓۘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14375l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public static boolean admob(long j) {
        return (j & 1) != 0;
    }

    public static long amazon(ByteBuffer byteBuffer, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < (i2 - i) + 1; i3++) {
            j += (long) ((byteBuffer.get(i + i3) & 255) << (i3 * 8));
        }
        return j;
    }

    public static byte[] billing(int i) {
        return new byte[]{(byte) (i & 255), (byte) (((long) (i >>> 8)) & 255), (byte) (((long) (i >>> 16)) & 255), (byte) (255 & ((long) (i >>> 24)))};
    }

    public static int crashlytics(ByteBuffer byteBuffer, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < (i2 - i) + 1; i3++) {
            j += ((long) (byteBuffer.get(i2 - i3) & 255)) << (i3 * 8);
        }
        return (int) j;
    }

    public static String firebase(DataInput dataInput, int i) {
        byte[] bArr = new byte[i];
        dataInput.readFully(bArr);
        return new String(bArr, AbstractC12379l.yandex);
    }

    public static String isPro(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return new String(bArr, AbstractC12379l.loadAd);
    }

    public static String loadAd(File file) {
        String strBilling = AbstractC5578l.billing(file.getPath());
        if (strBilling.length() < 3) {
            if (strBilling.length() == 1) {
                strBilling = strBilling.concat("000");
            } else if (strBilling.length() == 1) {
                strBilling = strBilling.concat("00");
            } else if (strBilling.length() == 2) {
                strBilling = strBilling.concat("0");
            }
        }
        return strBilling.length() <= 20 ? strBilling : strBilling.substring(0, 20);
    }

    public static String mopub(ByteBuffer byteBuffer, int i, int i2, Charset charset) {
        byte[] bArr = new byte[i2];
        byteBuffer.position(byteBuffer.position() + i);
        byteBuffer.get(bArr);
        return new String(bArr, 0, i2, charset);
    }

    public static byte[] purchase(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static long remoteconfig(DataInput dataInput) throws IOException {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        dataInput.readFully(bArr, 4, 4);
        return ByteBuffer.wrap(bArr).getLong();
    }

    public static int smaato(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = {0, 0, 0, 0};
        dataInputStream.readFully(bArr, 2, 2);
        return ByteBuffer.wrap(bArr).getInt();
    }

    public static ByteBuffer subs(FileChannel fileChannel, int i) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        fileChannel.read(byteBufferAllocateDirect);
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferAllocateDirect;
    }

    public static boolean vip(File file, File file2) {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        file.getAbsolutePath();
        file2.getAbsolutePath();
        C13975l c13975l = yandex;
        c13975l.getClass();
        int i = C17500l.yandex;
        if (file2.exists()) {
            c13975l.getClass();
            return false;
        }
        if (file.renameTo(file2)) {
            return true;
        }
        try {
            yandex(file, file2);
            if (file.delete()) {
                return true;
            }
            c13975l.getClass();
            file2.delete();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void yandex(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                FileChannel channel = fileInputStream.getChannel();
                FileChannel channel2 = fileOutputStream.getChannel();
                long size = channel.size();
                for (long jTransferTo = 0; jTransferTo < size; jTransferTo += channel.transferTo(jTransferTo, 1048576L, channel2)) {
                }
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                    throw th5;
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                    throw th5;
                }
            }
        }
    }
}
