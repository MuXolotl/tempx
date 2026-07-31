package org.chromium.net;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}
