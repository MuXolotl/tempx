package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: lؙؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15518l {
    public final ByteBuffer yandex = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    public final int loadAd = 16;
    public final int crashlytics = 16;
    public long amazon = 0;
    public long purchase = 0;
    public int billing = 0;

    public final C15518l crashlytics(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.yandex;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                yandex();
            }
            return this;
        }
        int iPosition = this.loadAd - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        yandex();
        while (byteBufferOrder.remaining() >= this.crashlytics) {
            loadAd(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    public final void loadAd(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.amazon;
        this.amazon = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.purchase;
        this.amazon = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.purchase = jRotateLeft3;
        this.purchase = ((Long.rotateLeft(jRotateLeft3, 31) + this.amazon) * 5) + 944331445;
        this.billing += 16;
    }

    public final void yandex() {
        ByteBuffer byteBuffer = this.yandex;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.crashlytics) {
            loadAd(byteBuffer);
        }
        byteBuffer.compact();
    }
}
