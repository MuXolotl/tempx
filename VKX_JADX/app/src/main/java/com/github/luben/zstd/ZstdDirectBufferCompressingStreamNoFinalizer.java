package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import defpackage.C18262l;
import defpackage.C8339l;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdDirectBufferCompressingStreamNoFinalizer implements Closeable, Flushable {
    private int level;
    private final long stream;
    private ByteBuffer target;
    private int consumed = 0;
    private int produced = 0;
    private boolean closed = false;
    private boolean initialized = false;
    private byte[] dict = null;
    private ZstdDictCompress fastDict = null;

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer(ByteBuffer byteBuffer, int i) {
        this.level = Zstd.defaultCompressionLevel();
        if (!byteBuffer.isDirect()) {
            C8339l.metrica("Target buffer should be a direct buffer");
            throw null;
        }
        this.target = byteBuffer;
        this.level = i;
        this.stream = createCStream();
    }

    private native long compressDirectByteBuffer(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private static native long createCStream();

    private native long endStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long flushStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private static native long freeCStream(long j);

    private native long initCStream(long j, int i);

    private native long initCStreamWithDict(long j, byte[] bArr, int i, int i2);

    private native long initCStreamWithFastDict(long j, ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        if (this.closed) {
            return;
        }
        try {
            if (this.initialized) {
                while (true) {
                    long j = this.stream;
                    ByteBuffer byteBuffer = this.target;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    try {
                        long jEndStream = zstdDirectBufferCompressingStreamNoFinalizer.endStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
                        if (Zstd.isError(jEndStream)) {
                            throw new ZstdIOException(jEndStream);
                        }
                        ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.target;
                        byteBuffer2.position(byteBuffer2.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
                        ByteBuffer byteBufferFlushBuffer = zstdDirectBufferCompressingStreamNoFinalizer.flushBuffer(zstdDirectBufferCompressingStreamNoFinalizer.target);
                        zstdDirectBufferCompressingStreamNoFinalizer.target = byteBufferFlushBuffer;
                        if (!byteBufferFlushBuffer.isDirect()) {
                            throw new IllegalArgumentException("Target buffer should be a direct buffer");
                        }
                        if (jEndStream > 0 && !zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                            throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                        }
                        if (jEndStream > 0) {
                            this = zstdDirectBufferCompressingStreamNoFinalizer;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
                        zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
                        zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
                        zstdDirectBufferCompressingStreamNoFinalizer.target = null;
                        throw th2;
                    }
                }
            } else {
                zstdDirectBufferCompressingStreamNoFinalizer = this;
            }
            freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
            zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
            zstdDirectBufferCompressingStreamNoFinalizer.target = null;
        } catch (Throwable th3) {
            th = th3;
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        }
    }

    public void compress(ByteBuffer byteBuffer) throws IOException {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        long jInitCStream;
        if (!byteBuffer.isDirect()) {
            C8339l.metrica("Source buffer should be a direct buffer");
            return;
        }
        if (this.closed) {
            C18262l.metrica("Stream closed");
            return;
        }
        if (this.initialized) {
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        } else {
            ZstdDictCompress zstdDictCompress = this.fastDict;
            if (zstdDictCompress != null) {
                zstdDictCompress.acquireSharedLock();
                try {
                    long jInitCStreamWithFastDict = initCStreamWithFastDict(this.stream, zstdDictCompress);
                    zstdDictCompress.releaseSharedLock();
                    jInitCStream = jInitCStreamWithFastDict;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                } catch (Throwable th) {
                    zstdDictCompress.releaseSharedLock();
                    throw th;
                }
            } else {
                byte[] bArr = this.dict;
                long j = this.stream;
                if (bArr != null) {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    jInitCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStreamWithDict(j, bArr, bArr.length, this.level);
                } else {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    jInitCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStream(j, zstdDirectBufferCompressingStreamNoFinalizer.level);
                }
            }
            if (Zstd.isError(jInitCStream)) {
                throw new ZstdIOException(jInitCStream);
            }
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                ByteBuffer byteBufferFlushBuffer = zstdDirectBufferCompressingStreamNoFinalizer.flushBuffer(zstdDirectBufferCompressingStreamNoFinalizer.target);
                zstdDirectBufferCompressingStreamNoFinalizer.target = byteBufferFlushBuffer;
                if (!byteBufferFlushBuffer.isDirect()) {
                    C8339l.metrica("Target buffer should be a direct buffer");
                    return;
                } else if (!zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                    C18262l.metrica("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                    return;
                }
            }
            long j2 = zstdDirectBufferCompressingStreamNoFinalizer.stream;
            ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.target;
            ByteBuffer byteBuffer3 = byteBuffer;
            long jCompressDirectByteBuffer = zstdDirectBufferCompressingStreamNoFinalizer.compressDirectByteBuffer(j2, byteBuffer2, byteBuffer2.position(), zstdDirectBufferCompressingStreamNoFinalizer.target.remaining(), byteBuffer3, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(jCompressDirectByteBuffer)) {
                throw new ZstdIOException(jCompressDirectByteBuffer);
            }
            ByteBuffer byteBuffer4 = zstdDirectBufferCompressingStreamNoFinalizer.target;
            byteBuffer4.position(byteBuffer4.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
            byteBuffer3.position(byteBuffer3.position() + zstdDirectBufferCompressingStreamNoFinalizer.consumed);
            byteBuffer = byteBuffer3;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.closed) {
            C18262l.metrica("Already closed");
            return;
        }
        if (!this.initialized) {
            return;
        }
        while (true) {
            long j = this.stream;
            ByteBuffer byteBuffer = this.target;
            ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer = this;
            long jFlushStream = zstdDirectBufferCompressingStreamNoFinalizer.flushStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
            if (Zstd.isError(jFlushStream)) {
                throw new ZstdIOException(jFlushStream);
            }
            ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.target;
            byteBuffer2.position(byteBuffer2.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
            ByteBuffer byteBufferFlushBuffer = zstdDirectBufferCompressingStreamNoFinalizer.flushBuffer(zstdDirectBufferCompressingStreamNoFinalizer.target);
            zstdDirectBufferCompressingStreamNoFinalizer.target = byteBufferFlushBuffer;
            if (!byteBufferFlushBuffer.isDirect()) {
                C8339l.metrica("Target buffer should be a direct buffer");
                return;
            } else if (jFlushStream > 0 && !zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                C18262l.metrica("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                return;
            } else if (jFlushStream <= 0) {
                return;
            } else {
                this = zstdDirectBufferCompressingStreamNoFinalizer;
            }
        }
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(byte[] bArr) {
        if (this.initialized) {
            C8339l.smaato("Change of parameter on initialized stream");
            return null;
        }
        this.dict = bArr;
        this.fastDict = null;
        return this;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (!this.initialized) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        C8339l.smaato("Change of parameter on initialized stream");
        return null;
    }

    public ByteBuffer flushBuffer(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}
