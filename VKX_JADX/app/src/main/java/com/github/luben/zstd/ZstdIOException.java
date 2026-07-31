package com.github.luben.zstd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ZstdIOException extends IOException {
    private long code;

    public ZstdIOException(long j) {
        this(Zstd.getErrorCode(j), Zstd.getErrorName(j));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdIOException(long j, String str) {
        super(str);
        this.code = j;
    }
}
