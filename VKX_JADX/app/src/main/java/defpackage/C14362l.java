package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lٓۘؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14362l extends InputStream {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15770l f28107l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f28108l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f28109l;

    public C14362l(C15770l c15770l, C9754l c9754l) {
        this.f28107l = c15770l;
        this.f28109l = c15770l.m4112private(c9754l.f19893l + 4);
        this.f28108l = c9754l.f19892l;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            C6541l.subs("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f28108l;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f28109l;
        C15770l c15770l = this.f28107l;
        c15770l.inmobi(bArr, i4, i, i2);
        this.f28109l = c15770l.m4112private(this.f28109l + i2);
        this.f28108l -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C15770l c15770l = this.f28107l;
        RandomAccessFile randomAccessFile = c15770l.f30962l;
        if (this.f28108l == 0) {
            return -1;
        }
        randomAccessFile.seek(this.f28109l);
        int i = randomAccessFile.read();
        this.f28109l = c15770l.m4112private(this.f28109l + 1);
        this.f28108l--;
        return i;
    }
}
