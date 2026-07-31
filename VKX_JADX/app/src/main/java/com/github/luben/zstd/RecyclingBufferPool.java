package com.github.luben.zstd;

import defpackage.AbstractC12589l;
import defpackage.C18073l;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class RecyclingBufferPool implements BufferPool {
    public static final BufferPool INSTANCE = new RecyclingBufferPool();
    private static final int buffSize = Math.max(Math.max((int) ZstdOutputStreamNoFinalizer.recommendedCOutSize(), (int) ZstdInputStreamNoFinalizer.recommendedDInSize()), (int) ZstdInputStreamNoFinalizer.recommendedDOutSize());
    private final ConcurrentLinkedQueue<SoftReference<ByteBuffer>> pool = new ConcurrentLinkedQueue<>();

    private RecyclingBufferPool() {
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i) {
        ByteBuffer byteBuffer;
        int i2 = buffSize;
        if (i > i2) {
            C18073l.license(AbstractC12589l.applovin(i, i2, "Unsupported buffer size: ", ". Supported buffer sizes: ", " or smaller."));
            return null;
        }
        do {
            SoftReference<ByteBuffer> softReferencePoll = this.pool.poll();
            if (softReferencePoll == null) {
                return ByteBuffer.allocate(buffSize);
            }
            byteBuffer = softReferencePoll.get();
        } while (byteBuffer == null);
        return byteBuffer;
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= buffSize) {
            byteBuffer.clear();
            this.pool.add(new SoftReference<>(byteBuffer));
        }
    }
}
