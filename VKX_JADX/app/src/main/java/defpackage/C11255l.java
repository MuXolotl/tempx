package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: lٍُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11255l extends BufferedOutputStream {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f22681l;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f22681l = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        String str = AbstractC15323l.yandex;
        throw th;
    }

    public final void yandex(OutputStream outputStream) {
        AbstractC12442l.subscription(this.f22681l);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f22681l = false;
    }
}
