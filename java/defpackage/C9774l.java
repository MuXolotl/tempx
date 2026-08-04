package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٍۘٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9774l extends AbstractC10410l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final byte[] f19916l = new byte[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f19917l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f19918l;

    public C9774l(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                C8339l.metrica("negative lengths not allowed");
                throw null;
            }
            yandex();
        }
        this.f19917l = i;
        this.f19918l = i;
    }

    public final byte[] billing() {
        int i = this.f19918l;
        if (i == 0) {
            return f19916l;
        }
        int i2 = this.f21226l;
        if (i >= i2) {
            C3010l.isPro(this.f19918l, i2, " >= ", "corrupted stream - out of bounds length found: ");
            return null;
        }
        byte[] bArr = new byte[i];
        int iAmazon = i - AbstractC7016l.amazon(this.f21227l, bArr, 0, i);
        this.f19918l = iAmazon;
        if (iAmazon == 0) {
            yandex();
            return bArr;
        }
        C3010l.subs(this.f19917l, this.f19918l);
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f19918l;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f21227l.read(bArr, i, Math.min(i2, i3));
        if (i4 < 0) {
            C3010l.subs(this.f19917l, this.f19918l);
            return 0;
        }
        int i5 = this.f19918l - i4;
        this.f19918l = i5;
        if (i5 == 0) {
            yandex();
        }
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f19918l == 0) {
            return -1;
        }
        int i = this.f21227l.read();
        if (i < 0) {
            C3010l.subs(this.f19917l, this.f19918l);
            return 0;
        }
        int i2 = this.f19918l - 1;
        this.f19918l = i2;
        if (i2 == 0) {
            yandex();
        }
        return i;
    }
}
