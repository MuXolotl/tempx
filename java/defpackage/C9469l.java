package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lٍُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9469l extends MediaDataSource {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13167l f19356l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f19357l;

    public C9469l(C13167l c13167l) {
        this.f19356l = c13167l;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        C13167l c13167l = this.f19356l;
        DataInputStream dataInputStream = c13167l.f18721l;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f19357l;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        c13167l.billing(j);
                        this.f19357l = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = c13167l.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f19357l += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f19357l = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
