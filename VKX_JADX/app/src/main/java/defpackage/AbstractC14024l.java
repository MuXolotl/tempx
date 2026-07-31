package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lًٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14024l {
    public static final C15578l yandex = new C15578l(-91331245, false, new C1659l(18));

    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    public static void Signature(InterfaceC14859l interfaceC14859l, C0327l c0327l) throws Throwable {
        InterfaceC14859l interfaceC14859l2;
        Throwable th;
        C6222l c6222l = c0327l.loadAd;
        boolean zAmazon = c0327l.amazon();
        C17555l c17555l = c0327l.yandex;
        boolean z = zAmazon && c17555l.billing != 3;
        if (z) {
            long j = c0327l.crashlytics;
            C8896l c8896lIsPro = AbstractC7470l.isPro(0L, (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            interfaceC14859l.mopub();
            interfaceC14859l.tapsense(c8896lIsPro);
        }
        C14264l c14264l = c17555l.loadAd.yandex;
        C9867l c9867l = c14264l.remoteconfig;
        InterfaceC12750l interfaceC12750l = c14264l.yandex;
        if (c9867l == null) {
            c9867l = C9867l.loadAd;
        }
        C9867l c9867l2 = c9867l;
        C0387l c0387l = c14264l.vip;
        if (c0387l == null) {
            c0387l = C0387l.amazon;
        }
        C0387l c0387l2 = c0387l;
        AbstractC3239l abstractC3239l = c14264l.startapp;
        if (abstractC3239l == null) {
            abstractC3239l = C5053l.yandex;
        }
        AbstractC3239l abstractC3239l2 = abstractC3239l;
        try {
            AbstractC9544l abstractC9544lPurchase = interfaceC12750l.purchase();
            C15368l c15368l = C15368l.yandex;
            try {
                if (abstractC9544lPurchase == null) {
                    long jLoadAd = interfaceC12750l != c15368l ? interfaceC12750l.loadAd() : C9735l.loadAd;
                    interfaceC14859l2 = interfaceC14859l;
                    try {
                        C6222l.subs(c6222l, interfaceC14859l2, jLoadAd, c0387l2, c9867l2, abstractC3239l2);
                        if (z) {
                            interfaceC14859l2.ads();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        interfaceC14859l2.ads();
                        throw th;
                    }
                }
                float fYandex = interfaceC12750l != c15368l ? interfaceC12750l.yandex() : 1.0f;
                interfaceC14859l2 = interfaceC14859l;
                try {
                    C6222l.isPro(c6222l, interfaceC14859l2, abstractC9544lPurchase, fYandex, c0387l2, c9867l2, abstractC3239l2);
                    interfaceC14859l2 = interfaceC14859l2;
                    if (z) {
                        interfaceC14859l2.ads();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    interfaceC14859l2.ads();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                interfaceC14859l2 = interfaceC14859l;
            }
        } catch (Throwable th5) {
            th = th5;
            interfaceC14859l2 = interfaceC14859l;
        }
        if (!z) {
            throw th;
        }
        interfaceC14859l2.ads();
        throw th;
    }

    public static boolean ad(int i, int i2, int i3, int i4) {
        return i2 > 0 && i4 > 0 && i - i3 < i4 && i3 - i < i2;
    }

    public static int adcel(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    public static byte[] admob(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return mopub(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return mopub(bArr, bArr3);
        }
        if (bArr3 == null) {
            return mopub(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static int ads(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static ArrayList advert(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = byteBufferAsReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b2 & 127) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new C6915l(i, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int[] amazon(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static short[] billing(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static byte[] crashlytics(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean firebase(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr == null) {
            C6541l.subs("'a' cannot be null");
            return false;
        }
        if (i < 0) {
            C8339l.metrica("'len' cannot be negative");
            return false;
        }
        if (i2 > bArr.length - i) {
            C18262l.adcel("'aOff' value invalid for specified length");
            return false;
        }
        if (i3 > bArr2.length - i) {
            C18262l.adcel("'bOff' value invalid for specified length");
            return false;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4 |= bArr[i2 + i5] ^ bArr2[i3 + i5];
        }
        return i4 == 0;
    }

    public static byte[] isPro(byte[][] bArr) {
        int length = 0;
        for (int i = 0; i != bArr.length; i++) {
            length += bArr[i].length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr[i2].length;
        }
        return bArr2;
    }

    public static byte[] license(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i];
            i++;
        }
    }

    public static void loadAd(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static int[] metrica(int i, int i2, int[] iArr) {
        int iAdcel = adcel(i, i2);
        int[] iArr2 = new int[iAdcel];
        System.arraycopy(iArr, i, iArr2, 0, Math.min(iArr.length - i, iAdcel));
        return iArr2;
    }

    public static byte[] mopub(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return crashlytics(bArr2);
        }
        if (bArr2 == null) {
            return crashlytics(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static void pro(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
            length--;
        }
    }

    public static long[] purchase(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return (long[]) jArr.clone();
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static byte[] remoteconfig(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    public static boolean smaato(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i = 0; i != length; i++) {
                length2 |= bArr[i] ^ bArr2[i];
            }
            while (length < bArr2.length) {
                byte b = bArr2[length];
                length2 |= b ^ (~b);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static final C4394l startapp(InterfaceC6942l interfaceC6942l, AbstractC6475l abstractC6475l, EnumC8981l enumC8981l) {
        return AbstractC0622l.amazon(new C0384l(abstractC6475l, enumC8981l, interfaceC6942l, null, 17));
    }

    public static byte[] subs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return admob(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return admob(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return admob(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return admob(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static int subscription(int[] iArr, int i) {
        if (iArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ iArr[i];
        }
    }

    public static int tapsense(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            long j = jArr[i];
            i2 = (((i2 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static byte[] vip(int i, int i2, byte[] bArr) {
        int iAdcel = adcel(i, i2);
        byte[] bArr2 = new byte[iAdcel];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, iAdcel));
        return bArr2;
    }

    public static byte[] yandex(byte b, byte[] bArr) {
        if (bArr == null) {
            return new byte[]{b};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b;
        return bArr2;
    }
}
