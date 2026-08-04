package defpackage;

import java.io.InputStream;

/* JADX INFO: renamed from: lًٞٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8162l extends InputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2432l f17044l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14090l f17045l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f17047l = false;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f17046l = false;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f17043l = new byte[1];

    public C8162l(InterfaceC14090l interfaceC14090l, C2432l c2432l) {
        this.f17045l = interfaceC14090l;
        this.f17044l = c2432l;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17046l) {
            return;
        }
        this.f17045l.close();
        this.f17046l = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        AbstractC12442l.subscription(!this.f17046l);
        yandex();
        int i3 = this.f17045l.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    public final void yandex() {
        if (this.f17047l) {
            return;
        }
        this.f17045l.crashlytics(this.f17044l);
        this.f17047l = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f17043l;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
