package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lًٌّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7955l extends OutputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f16572l = false;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final FileOutputStream f16573l;

    public C7955l(File file) {
        this.f16573l = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f16573l;
        if (this.f16572l) {
            return;
        }
        this.f16572l = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            AbstractC6427l.metrica("AtomicFile", "Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f16573l.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f16573l.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f16573l.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f16573l.write(bArr, i, i2);
    }
}
