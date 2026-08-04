package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lٓ۠ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14465l extends FilterInputStream {
    public C14465l(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = super.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
            }
            if (i4 == -1) {
                throw new IOException((i2 - i3) + " more bytes expected.");
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = 0;
        long j2 = 0;
        while (j2 < j) {
            long jSkip = super.skip(j - j2);
            if (jSkip == 0 && (i = i + 1) == 2) {
                break;
            }
            j2 += jSkip;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
