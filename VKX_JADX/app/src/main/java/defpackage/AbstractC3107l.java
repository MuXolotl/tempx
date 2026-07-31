package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;

/* JADX INFO: renamed from: lؕؐۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3107l {
    static {
        new C0499l("encoder-deflate-writer");
        new C0499l("encoder-deflate-reader");
    }

    public static final void yandex(Checksum checksum, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            C8339l.metrica("buffer need to be array-backed");
            return;
        }
        checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }
}
