package com.github.luben.zstd;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdOutputStream extends FilterOutputStream {
    private ZstdOutputStreamNoFinalizer inner;

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i, boolean z, boolean z2) {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z);
        this.inner.setChecksum(z2);
    }

    public static long recommendedCOutSize() {
        return ZstdOutputStreamNoFinalizer.recommendedCOutSize();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    public void finalize() {
        close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.inner.flush();
    }

    public ZstdOutputStream setChainLog(int i) {
        this.inner.setChainLog(i);
        return this;
    }

    public ZstdOutputStream setChecksum(boolean z) {
        this.inner.setChecksum(z);
        return this;
    }

    public ZstdOutputStream setCloseFrameOnFlush(boolean z) {
        this.inner.setCloseFrameOnFlush(z);
        return this;
    }

    public ZstdOutputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public ZstdOutputStream setHashLog(int i) {
        this.inner.setHashLog(i);
        return this;
    }

    public ZstdOutputStream setJobSize(int i) {
        this.inner.setJobSize(i);
        return this;
    }

    public ZstdOutputStream setLevel(int i) {
        this.inner.setLevel(i);
        return this;
    }

    public ZstdOutputStream setLong(int i) {
        this.inner.setLong(i);
        return this;
    }

    public ZstdOutputStream setMinMatch(int i) {
        this.inner.setMinMatch(i);
        return this;
    }

    public ZstdOutputStream setOverlapLog(int i) {
        this.inner.setOverlapLog(i);
        return this;
    }

    public ZstdOutputStream setSearchLog(int i) {
        this.inner.setSearchLog(i);
        return this;
    }

    public ZstdOutputStream setStrategy(int i) {
        this.inner.setStrategy(i);
        return this;
    }

    public ZstdOutputStream setTargetLength(int i) {
        this.inner.setTargetLength(i);
        return this;
    }

    public ZstdOutputStream setWindowLog(int i) {
        this.inner.setWindowLog(i);
        return this;
    }

    public ZstdOutputStream setWorkers(int i) {
        this.inner.setWorkers(i);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws Throwable {
        this.inner.write(bArr, i, i2);
    }

    public ZstdOutputStream setDict(ZstdDictCompress zstdDictCompress) {
        this.inner.setDict(zstdDictCompress);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws Throwable {
        this.inner.write(i);
    }

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z);
    }

    public ZstdOutputStream(OutputStream outputStream, int i) {
        this(outputStream, NoPool.INSTANCE);
        this.inner.setLevel(i);
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, NoPool.INSTANCE);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool, int i) {
        this(outputStream, bufferPool);
        this.inner.setLevel(i);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool) {
        super(outputStream);
        this.inner = new ZstdOutputStreamNoFinalizer(outputStream, bufferPool);
    }

    @Deprecated
    public void setFinalize(boolean z) {
    }
}
