package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lؙِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6401l extends OutputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final OutputStream f13389l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final FilterOutputStream f13390l;

    public C6401l(FilterOutputStream filterOutputStream, OutputStream outputStream) {
        this.f13390l = filterOutputStream;
        this.f13389l = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13390l.close();
        this.f13389l.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f13390l.flush();
        this.f13389l.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f13390l.write(i);
        this.f13389l.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f13390l.write(bArr);
        this.f13389l.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f13390l.write(bArr, i, i2);
        this.f13389l.write(bArr, i, i2);
    }
}
