package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdBufferDecompressingStream implements Closeable {
    private boolean finalize = true;
    private final ZstdBufferDecompressingStreamNoFinalizer inner;

    static {
        Native.load();
    }

    public ZstdBufferDecompressingStream(ByteBuffer byteBuffer) {
        this.inner = new ZstdBufferDecompressingStreamNoFinalizer(byteBuffer) { // from class: com.github.luben.zstd.ZstdBufferDecompressingStream.1
            @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
            public ByteBuffer refill(ByteBuffer byteBuffer2) {
                return ZstdBufferDecompressingStream.this.refill(byteBuffer2);
            }
        };
    }

    public static int recommendedTargetBufferSize() {
        return ZstdBufferDecompressingStreamNoFinalizer.recommendedTargetBufferSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.inner.close();
    }

    public void finalize() {
        if (this.finalize) {
            close();
        }
    }

    public synchronized boolean hasRemaining() {
        return this.inner.hasRemaining();
    }

    public synchronized int read(ByteBuffer byteBuffer) {
        return this.inner.read(byteBuffer);
    }

    public synchronized ZstdBufferDecompressingStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public void setFinalize(boolean z) {
        this.finalize = z;
    }

    public ZstdBufferDecompressingStream setLongMax(int i) throws ZstdIOException {
        this.inner.setLongMax(i);
        return this;
    }

    public synchronized ZstdBufferDecompressingStream setDict(ZstdDictDecompress zstdDictDecompress) {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    public ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}
