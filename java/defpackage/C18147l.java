package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lِ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18147l extends AbstractC10410l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f35512l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f35513l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f35514l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f35515l;

    public C18147l(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f35513l = false;
        this.f35515l = true;
        this.f35512l = inputStream.read();
        int i2 = inputStream.read();
        this.f35514l = i2;
        if (i2 >= 0) {
            billing();
        } else {
            C8339l.vip();
            throw null;
        }
    }

    public final boolean billing() {
        if (!this.f35513l && this.f35515l && this.f35512l == 0 && this.f35514l == 0) {
            this.f35513l = true;
            yandex();
        }
        return this.f35513l;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f35515l || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f35513l) {
            return -1;
        }
        InputStream inputStream = this.f21227l;
        int i3 = inputStream.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            C8339l.vip();
            return 0;
        }
        bArr[i] = (byte) this.f35512l;
        bArr[i + 1] = (byte) this.f35514l;
        this.f35512l = inputStream.read();
        int i4 = inputStream.read();
        this.f35514l = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        C8339l.vip();
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (billing()) {
            return -1;
        }
        int i = this.f21227l.read();
        if (i < 0) {
            C8339l.vip();
            return 0;
        }
        int i2 = this.f35512l;
        this.f35512l = this.f35514l;
        this.f35514l = i;
        return i2;
    }
}
