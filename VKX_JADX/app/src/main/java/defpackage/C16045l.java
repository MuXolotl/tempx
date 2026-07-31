package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٕۥٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16045l extends FilterInputStream {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f31436l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f31437l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31438l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16045l(InputStream inputStream, int i) {
        super(inputStream);
        this.f31438l = i;
        switch (i) {
            case 1:
                super(inputStream);
                this.f31437l = 0L;
                this.f31436l = 0L;
                break;
            default:
                this.f31436l = -1L;
                this.f31437l = 1048577L;
                break;
        }
    }

    private final synchronized void adcel() {
        super.reset();
        synchronized (this) {
            this.f31436l = this.f31437l;
        }
    }

    private final synchronized void billing(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f31436l = this.f31437l;
    }

    private final synchronized void mopub(int i) {
        super.mark(i);
        this.f31437l = this.f31436l;
    }

    private final synchronized void vip() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f31436l == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f31437l = this.f31436l;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f31438l) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f31437l);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        switch (this.f31438l) {
            case 0:
                billing(i);
                break;
            default:
                mopub(i);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f31438l) {
            case 0:
                long j = this.f31437l;
                if (j == 0) {
                    return -1;
                }
                int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (i3 != -1) {
                    this.f31437l -= (long) i3;
                }
                return i3;
            default:
                int i4 = super.read(bArr, i, i2);
                yandex(i4);
                return i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        switch (this.f31438l) {
            case 0:
                vip();
                break;
            default:
                adcel();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.f31438l) {
            case 0:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f31437l));
                this.f31437l -= jSkip;
                return jSkip;
            default:
                long jSkip2 = super.skip(j);
                yandex(jSkip2);
                return jSkip2;
        }
    }

    public synchronized void yandex(long j) {
        if (j >= 0) {
            this.f31436l += j;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f31438l) {
            case 0:
                if (this.f31437l == 0) {
                    return -1;
                }
                int i = ((FilterInputStream) this).in.read();
                if (i != -1) {
                    this.f31437l--;
                }
                return i;
            default:
                int i2 = super.read();
                yandex(1L);
                return i2;
        }
    }
}
