package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class NoPool implements BufferPool {
    public static final BufferPool INSTANCE = new NoPool();

    private NoPool() {
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i) {
        return ByteBuffer.allocate(i);
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
    }
}
