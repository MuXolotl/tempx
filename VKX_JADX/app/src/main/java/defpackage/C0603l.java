package defpackage;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: lؑۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0603l extends FilterInputStream {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f2040l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f2041l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f2042l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cipher f2043l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f2044l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f2045l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f2046l;

    public C0603l(DataInputStream dataInputStream, Cipher cipher) {
        super(dataInputStream);
        this.f2042l = new byte[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
        this.f2040l = false;
        this.f2045l = false;
        this.f2043l = cipher;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.f2046l - this.f2041l;
    }

    public final int billing() throws IOException {
        if (!this.f2040l) {
            this.f2045l = true;
            this.f2041l = 0;
            this.f2046l = 0;
            while (true) {
                int i = this.f2046l;
                if (i != 0) {
                    return i;
                }
                int i2 = ((FilterInputStream) this).in.read(this.f2042l);
                if (i2 == -1) {
                    byte[] bArrYandex = yandex();
                    this.f2044l = bArrYandex;
                    if (bArrYandex != null && bArrYandex.length != 0) {
                        int length = bArrYandex.length;
                        this.f2046l = length;
                        return length;
                    }
                } else {
                    byte[] bArrUpdate = this.f2043l.update(this.f2042l, 0, i2);
                    this.f2044l = bArrUpdate;
                    if (bArrUpdate != null) {
                        this.f2046l = bArrUpdate.length;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            if (!this.f2040l) {
                yandex();
            }
            this.f2041l = 0;
            this.f2046l = 0;
        } catch (Throwable th) {
            if (!this.f2040l) {
                yandex();
            }
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f2041l >= this.f2046l && billing() < 0) {
            return -1;
        }
        int iMin = Math.min(i2, available());
        System.arraycopy(this.f2044l, this.f2041l, bArr, i, iMin);
        this.f2041l += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j, available());
        this.f2041l += iMin;
        return iMin;
    }

    public final byte[] yandex() throws IOException {
        try {
            if (!this.f2045l) {
                billing();
            }
            if (this.f2040l) {
                return null;
            }
            this.f2040l = true;
            return this.f2043l.doFinal();
        } catch (GeneralSecurityException e) {
            throw new Cthrows("Error finalising cipher", e, 2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f2041l >= this.f2046l && billing() < 0) {
            return -1;
        }
        byte[] bArr = this.f2044l;
        int i = this.f2041l;
        this.f2041l = i + 1;
        return bArr[i] & 255;
    }
}
