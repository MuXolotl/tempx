package org.conscrypt;

import defpackage.C18262l;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
class OpenSSLBIOInputStream extends FilterInputStream {
    private long ctx;

    public OpenSSLBIOInputStream(InputStream inputStream, boolean z) {
        super(inputStream);
        this.ctx = NativeCrypto.create_BIO_InputStream(this, z);
    }

    public long getBioContext() {
        return this.ctx;
    }

    public int gets(byte[] bArr) {
        int i;
        int i2 = 0;
        if (bArr != null && bArr.length != 0) {
            while (i2 < bArr.length && (i = read()) != -1) {
                if (i != 10) {
                    bArr[i2] = (byte) i;
                    i2++;
                } else if (i2 != 0) {
                    break;
                }
            }
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            C18262l.adcel("Invalid bounds");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i4 = super.read(bArr, i + i3, (i2 - i3) - i);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        } while (i + i3 < i2);
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    public void release() {
        NativeCrypto.BIO_free_all(this.ctx);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
