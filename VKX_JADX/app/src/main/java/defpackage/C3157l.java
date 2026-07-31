package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٌؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3157l extends InputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6785l = 1073741824;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InputStream f6786l;

    public C3157l(InputStream inputStream) {
        this.f6786l = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f6785l;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6786l.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f6786l.read();
        if (i == -1) {
            this.f6785l = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f6786l.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f6786l.read(bArr);
        if (i == -1) {
            this.f6785l = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f6786l.read(bArr, i, i2);
        if (i3 == -1) {
            this.f6785l = 0;
        }
        return i3;
    }
}
