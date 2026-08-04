package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lٓ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14448l implements ReadableByteChannel {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f28305l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f28306l = new ArrayList();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13645l f28307l;

    public C14448l(C13645l c13645l) {
        this.f28307l = c13645l;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28305l = true;
        this.f28306l.clear();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f28305l && ((C13211l) this.f28307l.f26671l).f25992l;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ArrayList arrayList;
        int i = 0;
        loop0: while (byteBuffer.hasRemaining()) {
            while (true) {
                arrayList = this.f28306l;
                if (arrayList.size() == 0) {
                    C13645l c13645l = this.f28307l;
                    C0883l c0883lSignatures = C13645l.signatures((C13211l) c13645l.f26671l);
                    if (c0883lSignatures == null) {
                        if (i > 0) {
                            break loop0;
                        }
                        return -1;
                    }
                    C14448l c14448l = (C14448l) ((HashMap) c13645l.f26670l).get(Integer.valueOf(c0883lSignatures.f2533l));
                    if (c14448l != null && !c14448l.f28305l) {
                        c14448l.f28306l.add(c0883lSignatures.f2534l);
                    }
                }
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
            int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            int iPosition = byteBuffer2.position() + iMin;
            byteBufferDuplicate.limit(iPosition);
            byteBuffer2.position(iPosition);
            byteBuffer.put(byteBufferDuplicate);
            if (!byteBuffer2.hasRemaining()) {
                arrayList.remove(0);
            }
            i += iMin;
        }
        return i;
    }
}
