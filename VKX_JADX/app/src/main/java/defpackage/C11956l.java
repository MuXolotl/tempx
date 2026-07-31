package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lِٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11956l {
    public static final C13975l amazon;
    public int crashlytics;
    public final String loadAd;
    public final FileChannel yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        amazon = new C13975l(4);
    }

    public C11956l(FileChannel fileChannel, String str) {
        this.yandex = fileChannel;
        this.loadAd = str;
    }

    public final void yandex() {
        FileChannel fileChannel = this.yandex;
        long size = fileChannel.size();
        String str = this.loadAd;
        if (size == 0) {
            throw new C13768l("Error: File empty ".concat(str));
        }
        fileChannel.position(0L);
        C13975l c13975l = AbstractC14375l.yandex;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4);
        fileChannel.read(byteBufferAllocateDirect);
        byteBufferAllocateDirect.position(0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBufferAllocateDirect.order(byteOrder);
        if (AbstractC14375l.isPro(byteBufferAllocateDirect).equals("fLaC")) {
            this.crashlytics = 0;
            return;
        }
        fileChannel.position(0L);
        byte[] bArr = AbstractC3348l.f7141l;
        long jPosition = fileChannel.position();
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(3);
        fileChannel.read(byteBufferAllocateDirect2);
        byteBufferAllocateDirect2.position(0);
        byteBufferAllocateDirect2.order(byteOrder);
        fileChannel.position(jPosition);
        byte[] bArr2 = new byte[3];
        byteBufferAllocateDirect2.get(bArr2);
        if (new String(bArr2, AbstractC12379l.loadAd).equals("ID3")) {
            ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(4);
            fileChannel.position(fileChannel.position() + 6);
            fileChannel.read(byteBufferAllocateDirect3);
            byteBufferAllocateDirect3.flip();
            fileChannel.position(AbstractC17265l.crashlytics(byteBufferAllocateDirect3) + 10);
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            fileChannel.position();
            amazon.getClass();
            int i = C17500l.yandex;
            ByteBuffer byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(4);
            fileChannel.read(byteBufferAllocateDirect4);
            byteBufferAllocateDirect4.position(0);
            byteBufferAllocateDirect4.order(byteOrder);
            if (AbstractC14375l.isPro(byteBufferAllocateDirect4).equals("fLaC")) {
                this.crashlytics = (int) (fileChannel.position() - 4);
                return;
            }
        }
        throw new C13768l(str.concat("Flac Header not found, not a flac file"));
    }
}
