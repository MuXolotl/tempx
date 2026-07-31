package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: renamed from: lٌٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14032l extends UploadDataProvider {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f27336l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1003l f27337l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile FileChannel f27338l;

    public C14032l(InterfaceC1003l interfaceC1003l) {
        this.f27337l = interfaceC1003l;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f27338l;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return yandex().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            C8339l.smaato("Cronet passed a buffer with no bytes remaining");
            return;
        }
        FileChannel fileChannelYandex = yandex();
        int i = 0;
        while (i == 0) {
            int i2 = fileChannelYandex.read(byteBuffer);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        yandex().position(0L);
        uploadDataSink.onRewindSucceeded();
    }

    public final FileChannel yandex() {
        if (this.f27338l == null) {
            synchronized (this.f27336l) {
                try {
                    if (this.f27338l == null) {
                        this.f27338l = this.f27337l.subs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f27338l;
    }
}
