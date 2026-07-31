package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: lؔ۠۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2959l extends Writer {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final StringBuilder f6443l = new StringBuilder(128);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f6444l = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yandex();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        yandex();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                yandex();
            } else {
                this.f6443l.append(c);
            }
        }
    }

    public final void yandex() {
        StringBuilder sb = this.f6443l;
        if (sb.length() > 0) {
            Log.d(this.f6444l, sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
