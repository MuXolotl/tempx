package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: renamed from: lٍٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1871l extends UploadDataProvider {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ByteBuffer f4293l;

    public C1871l(ByteBuffer byteBuffer) {
        this.f4293l = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f4293l.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            C8339l.smaato("Cronet passed a buffer with no bytes remaining");
            return;
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f4293l;
        if (iRemaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int iLimit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindSucceeded();
    }
}
