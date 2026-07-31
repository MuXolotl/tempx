package com.github.luben.zstd;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdInputStream extends FilterInputStream {
    private ZstdInputStreamNoFinalizer inner;

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream);
    }

    public static long recommendedDInSize() {
        return ZstdInputStreamNoFinalizer.recommendedDInSize();
    }

    public static long recommendedDOutSize() {
        return ZstdInputStreamNoFinalizer.recommendedDOutSize();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.inner.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    public void finalize() {
        close();
    }

    public boolean getContinuous() {
        return this.inner.getContinuous();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return this.inner.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.inner.read(bArr, i, i2);
    }

    public ZstdInputStream setContinuous(boolean z) {
        this.inner.setContinuous(z);
        return this;
    }

    public ZstdInputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public ZstdInputStream setLongMax(int i) {
        this.inner.setLongMax(i);
        return this;
    }

    public ZstdInputStream setRefMultipleDDicts(boolean z) {
        this.inner.setRefMultipleDDicts(z);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return this.inner.skip(j);
    }

    public ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return this.inner.read();
    }

    public ZstdInputStream(InputStream inputStream, BufferPool bufferPool) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream, bufferPool);
    }

    @Deprecated
    public void setFinalize(boolean z) {
    }
}
