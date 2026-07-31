package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: lؚْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13211l implements ByteChannel, Channel, Closeable, ReadableByteChannel, WritableByteChannel {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f25991l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f25992l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ByteBuffer f25993l;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25992l = false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f25992l;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f25993l;
        if (!byteBuffer2.hasRemaining() || this.f25991l <= 0) {
            return -1;
        }
        int iMin = Math.min(Math.min(byteBuffer2.remaining(), byteBuffer.remaining()), this.f25991l);
        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
        int iPosition = byteBuffer2.position() + iMin;
        byteBufferDuplicate.limit(iPosition);
        byteBuffer2.position(iPosition);
        byteBuffer.put(byteBufferDuplicate);
        this.f25991l = Math.max(this.f25991l, byteBuffer2.position());
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f25993l;
        int iMin = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        int iPosition = byteBuffer.position() + iMin;
        byteBufferDuplicate.limit(iPosition);
        byteBuffer.position(iPosition);
        byteBuffer2.put(byteBufferDuplicate);
        this.f25991l = Math.max(this.f25991l, byteBuffer2.position());
        return iMin;
    }
}
