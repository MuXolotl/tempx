package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import defpackage.C8339l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdDictDecompress extends SharedDictBase {
    private long nativePtr;
    private ByteBuffer sharedDict;

    static {
        Native.load();
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer, boolean z) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            C8339l.metrica("dict must be a direct buffer");
            throw null;
        }
        if (iLimit < 0) {
            C8339l.metrica("dict cannot be empty.");
            throw null;
        }
        initDirect(byteBuffer, byteBuffer.position(), iLimit, z ? 1 : 0);
        if (this.nativePtr == 0) {
            C8339l.smaato("ZSTD_createDDict failed");
            throw null;
        }
        if (z) {
            this.sharedDict = byteBuffer;
        }
        storeFence();
    }

    private native void free();

    private native void init(byte[] bArr, int i, int i2);

    private native void initDirect(ByteBuffer byteBuffer, int i, int i2, int i3);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.github.luben.zstd.AutoCloseBase
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
            this.sharedDict = null;
        }
    }

    public ByteBuffer getByReferenceBuffer() {
        return this.sharedDict;
    }

    public ZstdDictDecompress(byte[] bArr, int i, int i2) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        init(bArr, i, i2);
        if (this.nativePtr != 0) {
            storeFence();
        } else {
            C8339l.smaato("ZSTD_createDDict failed");
            throw null;
        }
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer) {
        this(byteBuffer, false);
    }

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
