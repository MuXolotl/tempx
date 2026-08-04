package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lْۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4859l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f9912l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ByteBuffer f9913l;

    public C4859l(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f9913l = byteBufferSlice;
        this.f9912l = byteBufferSlice.capacity();
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        ByteBuffer byteBuffer = this.f9913l;
        int iPosition = byteBuffer.position();
        int i = this.f9912l;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return c0869l.write(byteBuffer);
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return C3446l.amazon;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
