package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11531l {
    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
    }

    public static ByteBuffer yandex(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining + 1];
        byteBuffer.get(bArr, 0, iRemaining);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < iRemaining) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
            }
            z = (b & 255) != 255;
            i = i3;
        }
        return ByteBuffer.wrap(bArr, 0, i2);
    }
}
