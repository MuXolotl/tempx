package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٜ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18319l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f35823l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f35824l;

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m4522l(int i) {
        ((ByteBuffer) this.f33214l).rewind();
        ByteBuffer byteBuffer = (ByteBuffer) this.f33214l;
        byteBuffer.position(byteBuffer.position() + 8);
        for (int i2 = 0; i2 < this.f35824l; i2++) {
            int i3 = ((ByteBuffer) this.f33214l).getInt() + i;
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f33214l;
            byteBuffer2.position(byteBuffer2.position() - 4);
            ((ByteBuffer) this.f33214l).putInt(i3);
        }
    }
}
