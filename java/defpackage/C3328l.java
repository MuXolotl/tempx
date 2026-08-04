package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3328l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public static void yandex(FileChannel fileChannel, C16410l c16410l, String str) throws C13768l, IOException {
        int i = AbstractC11306l.purchase;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        byteBufferAllocateDirect.order(ByteOrder.BIG_ENDIAN);
        int i2 = fileChannel.read(byteBufferAllocateDirect);
        byteBufferAllocateDirect.position(0);
        if (i2 < i) {
            throw new IOException(str + " AIFF:Unable to read required number of databytes read:" + i2 + ":required:" + i);
        }
        String strIsPro = AbstractC14375l.isPro(byteBufferAllocateDirect);
        if (!"FORM".equals(strIsPro)) {
            throw new C13768l(AbstractC9361l.pro(str, "Not an AIFF file: incorrect signature ", strIsPro));
        }
        byteBufferAllocateDirect.getInt();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        yandex.getClass();
        int i3 = C17500l.yandex;
        String strIsPro2 = AbstractC14375l.isPro(byteBufferAllocateDirect);
        if ("AIFF".equals(strIsPro2)) {
            c16410l.vip = EnumC7121l.f14928l;
        } else {
            if (!"AIFC".equals(strIsPro2)) {
                throw new C13768l("Invalid AIFF file: Incorrect file type info ".concat(strIsPro2));
            }
            c16410l.vip = EnumC7121l.f14927l;
        }
        C13975l c13975l = AbstractC11306l.yandex;
    }
}
