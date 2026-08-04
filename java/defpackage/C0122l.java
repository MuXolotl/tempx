package defpackage;

/* JADX INFO: renamed from: lِؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0122l extends C4966l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f1025l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f1026l;

    public C0122l(byte[] bArr, int i, int i2) {
        super(bArr);
        C4966l.billing(i, i + i2, bArr.length);
        this.f1025l = i;
        this.f1026l = i2;
    }

    @Override // defpackage.C4966l
    public final void admob(int i, byte[] bArr) {
        System.arraycopy(this.f10112l, this.f1025l, bArr, 0, i);
    }

    @Override // defpackage.C4966l
    public final byte amazon(int i) {
        int i2 = this.f1026l;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f10112l[this.f1025l + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0653l.vip(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC12589l.premium(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.C4966l
    public final int firebase() {
        return this.f1025l;
    }

    @Override // defpackage.C4966l
    public final int size() {
        return this.f1026l;
    }

    @Override // defpackage.C4966l
    public final byte smaato(int i) {
        return this.f10112l[this.f1025l + i];
    }
}
