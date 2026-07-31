package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: lِۡٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12180l {
    public static final int amazon = AbstractC11306l.loadAd + 24;
    public long crashlytics;
    public long loadAd;
    public long yandex;

    public static C12180l yandex(ByteBuffer byteBuffer) {
        String strIsPro = AbstractC14375l.isPro(byteBuffer);
        EnumC15153l[] enumC15153lArr = EnumC15153l.f29739l;
        if (!"DSD ".equals(strIsPro)) {
            return null;
        }
        C12180l c12180l = new C12180l();
        c12180l.yandex = byteBuffer.getLong();
        c12180l.loadAd = byteBuffer.getLong();
        c12180l.crashlytics = byteBuffer.getLong();
        return c12180l;
    }

    public final ByteBuffer loadAd() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(amazon);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        EnumC15153l[] enumC15153lArr = EnumC15153l.f29739l;
        byteBufferAllocateDirect.put("DSD ".getBytes(AbstractC12379l.yandex));
        byteBufferAllocateDirect.putLong(this.yandex);
        byteBufferAllocateDirect.putLong(this.loadAd);
        byteBufferAllocateDirect.putLong(this.crashlytics);
        byteBufferAllocateDirect.flip();
        return byteBufferAllocateDirect;
    }

    public final String toString() {
        return "ChunkSize:" + this.yandex + ":fileLength:" + this.loadAd + ":metadata:" + this.crashlytics;
    }
}
