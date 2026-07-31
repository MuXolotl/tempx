package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdDirectBufferCompressingStream implements Closeable, Flushable {
    private boolean finalize;
    ZstdDirectBufferCompressingStreamNoFinalizer inner;

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStream(ByteBuffer byteBuffer, int i) {
        this.inner = new ZstdDirectBufferCompressingStreamNoFinalizer(byteBuffer, i) { // from class: com.github.luben.zstd.ZstdDirectBufferCompressingStream.1
            @Override // com.github.luben.zstd.ZstdDirectBufferCompressingStreamNoFinalizer
            public ByteBuffer flushBuffer(ByteBuffer byteBuffer2) {
                return ZstdDirectBufferCompressingStream.this.flushBuffer(byteBuffer2);
            }
        };
    }

    public static int recommendedOutputBufferSize() {
        return ZstdDirectBufferCompressingStreamNoFinalizer.recommendedOutputBufferSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.inner.close();
    }

    public synchronized void compress(ByteBuffer byteBuffer) {
        this.inner.compress(byteBuffer);
    }

    public void finalize() {
        if (this.finalize) {
            close();
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        this.inner.flush();
    }

    public synchronized ZstdDirectBufferCompressingStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public void setFinalize(boolean z) {
        this.finalize = z;
    }

    public synchronized ZstdDirectBufferCompressingStream setDict(ZstdDictCompress zstdDictCompress) {
        this.inner.setDict(zstdDictCompress);
        return this;
    }

    public ByteBuffer flushBuffer(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}
