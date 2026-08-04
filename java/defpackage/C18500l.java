package defpackage;

import java.io.OutputStream;

/* JADX INFO: renamed from: lَۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18500l extends OutputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f36126l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36127l;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        int length2;
        int i5;
        switch (this.f36127l) {
            case 0:
                if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.f36126l += (long) i2;
                return;
            case 1:
                if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i4 = i + i2) > length || i4 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.f36126l += (long) i2;
                return;
            default:
                if (i < 0 || i > (length2 = bArr.length) || i2 < 0 || (i5 = i + i2) > length2 || i5 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.f36126l += (long) i2;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f36127l) {
            case 0:
                this.f36126l += (long) bArr.length;
                break;
            case 1:
                this.f36126l += (long) bArr.length;
                break;
            default:
                this.f36126l += (long) bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f36127l) {
            case 0:
                this.f36126l++;
                break;
            case 1:
                this.f36126l++;
                break;
            default:
                this.f36126l++;
                break;
        }
    }
}
