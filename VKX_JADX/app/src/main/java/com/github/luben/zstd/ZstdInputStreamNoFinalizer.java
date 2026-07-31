package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import defpackage.AbstractC14814l;
import defpackage.C11983l;
import defpackage.C18262l;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdInputStreamNoFinalizer extends FilterInputStream {
    private static final int srcBuffSize;
    private ZstdDictDecompress active_dict;
    private final BufferPool bufferPool;
    private long dstPos;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead;
    private final byte[] src;
    private final ByteBuffer srcByteBuffer;
    private long srcPos;
    private long srcSize;
    private final long stream;

    static {
        Native.load();
        srcBuffSize = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, BufferPool bufferPool) throws ZstdIOException {
        super(inputStream);
        this.dstPos = 0L;
        this.srcPos = 0L;
        this.srcSize = 0L;
        this.needRead = true;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, srcBuffSize);
        this.srcByteBuffer = arrayBackedBuffer;
        this.src = arrayBackedBuffer.array();
        synchronized (this) {
            long jCreateDStream = createDStream();
            this.stream = jCreateDStream;
            initDStream(jCreateDStream);
        }
    }

    private static native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native int freeDStream(long j);

    private native int initDStream(long j);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.needRead) {
            return 1;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.bufferPool.release(this.srcByteBuffer);
        freeDStream(this.stream);
        ((FilterInputStream) this).in.close();
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        if (i >= 0) {
            if (i2 <= bArr.length - i) {
                int internal = 0;
                if (i2 == 0) {
                    return 0;
                }
                while (internal == 0) {
                    internal = readInternal(bArr, i, i2);
                }
                return internal;
            }
        }
        throw new IndexOutOfBoundsException("Requested length " + i2 + " from offset " + i + " in buffer of size " + bArr.length);
    }

    public int readInternal(byte[] bArr, int i, int i2) throws IOException {
        long j;
        if (this.isClosed) {
            C18262l.metrica("Stream closed");
            return 0;
        }
        if (i < 0 || i2 > bArr.length - i) {
            C11983l.mopub(bArr.length, AbstractC14814l.subscription(i2, i, "Requested length ", " from offset ", " in buffer of size "));
            return 0;
        }
        int i3 = i + i2;
        long j2 = i;
        this.dstPos = j2;
        long j3 = -1;
        while (true) {
            j = this.dstPos;
            long j4 = i3;
            if (j >= j4 || j3 >= j) {
                break;
            }
            if (this.needRead && (((FilterInputStream) this).in.available() > 0 || this.dstPos == j2)) {
                long j5 = ((FilterInputStream) this).in.read(this.src, 0, srcBuffSize);
                this.srcSize = j5;
                this.srcPos = 0L;
                if (j5 < 0) {
                    this.srcSize = 0L;
                    if (this.frameFinished) {
                        return -1;
                    }
                    if (!this.isContinuous) {
                        throw new ZstdIOException(Zstd.errCorruptionDetected(), "Truncated source");
                    }
                    long j6 = (int) (this.dstPos - j2);
                    this.srcSize = j6;
                    if (j6 > 0) {
                        return (int) j6;
                    }
                    return -1;
                }
                if (j5 == 0) {
                    continue;
                } else {
                    this.frameFinished = false;
                }
            }
            long j7 = this.dstPos;
            int iDecompressStream = decompressStream(this.stream, bArr, i3, this.src, (int) this.srcSize);
            long j8 = iDecompressStream;
            if (Zstd.isError(j8)) {
                throw new ZstdIOException(j8);
            }
            if (iDecompressStream == 0) {
                this.frameFinished = true;
                this.needRead = this.srcPos == this.srcSize;
                return (int) (this.dstPos - j2);
            }
            this.needRead = this.dstPos < j4;
            j3 = j7;
        }
        return (int) (j - j2);
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z) {
        this.isContinuous = z;
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(jLoadFastDictDecompress)) {
                throw new ZstdIOException(jLoadFastDictDecompress);
            }
            this.active_dict = zstdDictDecompress;
            zstdDictDecompress.releaseSharedLock();
        } catch (Throwable th) {
            zstdDictDecompress.releaseSharedLock();
            throw th;
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setLongMax(int i) {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setRefMultipleDDicts(boolean z) {
        long refMultipleDDicts = Zstd.setRefMultipleDDicts(this.stream, z);
        if (Zstd.isError(refMultipleDDicts)) {
            throw new ZstdIOException(refMultipleDDicts);
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        int i;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (j <= 0) {
            return 0L;
        }
        int iRecommendedDOutSize = (int) recommendedDOutSize();
        if (iRecommendedDOutSize > j) {
            iRecommendedDOutSize = (int) j;
        }
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(this.bufferPool, iRecommendedDOutSize);
        try {
            byte[] bArrArray = arrayBackedBuffer.array();
            long j2 = j;
            while (j2 > 0 && (i = read(bArrArray, 0, (int) Math.min(iRecommendedDOutSize, j2))) >= 0) {
                j2 -= (long) i;
            }
            this.bufferPool.release(arrayBackedBuffer);
            return j - j2;
        } catch (Throwable th) {
            this.bufferPool.release(arrayBackedBuffer);
            throw th;
        }
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new ZstdIOException(jLoadDictDecompress);
        }
        return this;
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) {
        this(inputStream, NoPool.INSTANCE);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = new byte[1];
            int internal = 0;
            while (internal == 0) {
                internal = readInternal(bArr, 0, 1);
            }
            if (internal != 1) {
                return -1;
            }
            return bArr[0] & 255;
        } catch (Throwable th) {
            throw th;
        }
    }
}
