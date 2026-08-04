package defpackage;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lٜٓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14276l extends FilterInputStream {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f27959l;

    public C14276l(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.f27959l = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f27959l);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f27959l;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.f27959l -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(Math.min(j, this.f27959l));
        if (jSkip >= 0) {
            this.f27959l = (int) (((long) this.f27959l) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f27959l <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f27959l--;
        }
        return i;
    }
}
