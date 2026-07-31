package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdDirectBufferDecompressingStream implements Closeable {
    private boolean finalize = true;
    private ZstdDirectBufferDecompressingStreamNoFinalizer inner;

    static {
        Native.load();
    }

    public ZstdDirectBufferDecompressingStream(ByteBuffer byteBuffer) {
        this.inner = new ZstdDirectBufferDecompressingStreamNoFinalizer(byteBuffer) { // from class: com.github.luben.zstd.ZstdDirectBufferDecompressingStream.1
            @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
            public ByteBuffer refill(ByteBuffer byteBuffer2) {
                return ZstdDirectBufferDecompressingStream.this.refill(byteBuffer2);
            }
        };
    }

    public static int recommendedTargetBufferSize() {
        return ZstdDirectBufferDecompressingStreamNoFinalizer.recommendedTargetBufferSize();
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

    public synchronized ZstdDirectBufferDecompressingStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public void setFinalize(boolean z) {
        this.finalize = z;
    }

    public ZstdDirectBufferDecompressingStream setLongMax(int i) throws ZstdIOException {
        this.inner.setLongMax(i);
        return this;
    }

    public synchronized ZstdDirectBufferDecompressingStream setDict(ZstdDictDecompress zstdDictDecompress) {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    public ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}
