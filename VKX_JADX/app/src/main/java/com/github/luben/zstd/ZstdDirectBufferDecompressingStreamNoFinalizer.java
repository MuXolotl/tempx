package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import defpackage.C8339l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdDirectBufferDecompressingStreamNoFinalizer extends BaseZstdBufferDecompressingStreamNoFinalizer {
    static {
        Native.load();
    }

    public ZstdDirectBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (!byteBuffer.isDirect()) {
            C8339l.metrica("Source buffer should be a direct buffer");
            throw null;
        }
        this.source = byteBuffer;
        long jCreateDStream = createDStream();
        this.stream = jCreateDStream;
        initDStream(jCreateDStream);
    }

    private static native long createDStreamNative();

    private native long decompressStreamNative(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private static native long freeDStreamNative(long j);

    private native long initDStreamNative(long j);

    private static native long recommendedDOutSizeNative();

    public static int recommendedTargetBufferSize() {
        return (int) recommendedDOutSizeNative();
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long createDStream() {
        return createDStreamNative();
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long decompressStream(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        return decompressStreamNative(j, byteBuffer, i, i2, byteBuffer2, i3, i4);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long freeDStream(long j) {
        return freeDStreamNative(j);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long initDStream(long j) {
        return initDStreamNative(j);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public int read(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return readInternal(byteBuffer, true);
        }
        C8339l.metrica("Target buffer should be a direct buffer");
        return 0;
    }
}
