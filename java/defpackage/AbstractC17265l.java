package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٜٗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17265l {
    public static final C15578l yandex = new C15578l(-361328572, false, new C7614l(19));
    public static final C15578l loadAd = new C15578l(1231257479, false, new C10721l(10));
    public static final C15578l crashlytics = new C15578l(-1200006547, false, new C7614l(20));
    public static final C15578l amazon = new C15578l(1197487432, false, new C7614l(21));
    public static final C15578l purchase = new C15578l(266831088, false, new C10721l(11));
    public static final C15578l billing = new C15578l(-145004178, false, new C7614l(22));
    public static final C15578l mopub = new C15578l(701669733, false, new C10721l(12));

    public static byte[] admob(int i) {
        return new byte[]{(byte) ((266338304 & i) >> 21), (byte) ((2080768 & i) >> 14), (byte) ((i & 16256) >> 7), (byte) (i & 127)};
    }

    public static byte[] amazon(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Alert.DURATION_SHOW_INDEFINITELY - bArr2.length) {
                C18262l.ads("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean billing(byte[] bArr) {
        for (byte b : bArr) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }

    public static int crashlytics(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr, 0, 4);
        return ((bArr[0] & 255) << 21) + ((bArr[1] & 255) << 14) + ((bArr[2] & 255) << 7) + (bArr[3] & 255);
    }

    public static final byte[] firebase(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return isPro(0, bArr.length, bArr, bArr2);
        }
        C8339l.metrica("The lengths of x and y should match.");
        return null;
    }

    public static final byte[] isPro(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (i2 < 0 || bArr.length - i2 < i || bArr2.length - i2 < 0) {
            C8339l.metrica("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public static int loadAd(C0869l c0869l) {
        return ((c0869l.readByte() & 255) << 21) + ((c0869l.readByte() & 255) << 14) + ((c0869l.readByte() & 255) << 7) + (c0869l.readByte() & 255);
    }

    public static String mopub(long j) {
        return AbstractC2812l.subscription(j, "PointerId(value=", ")");
    }

    public static final boolean purchase(long j, long j2) {
        return j == j2;
    }

    public static final void subs(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            C8339l.metrica("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final String yandex(Object obj) {
        Class<?> cls = obj.getClass();
        String simpleName = cls.getSimpleName();
        return simpleName.length() == 0 ? (String) AbstractC16901l.m4214continue(AbstractC12024l.m3323finally(cls.getName(), new char[]{'.'})) : simpleName;
    }
}
