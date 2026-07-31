package defpackage;

/* JADX INFO: renamed from: lِٖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16340l extends C15379l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f31954l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f31955l;

    public C16340l(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC16071l.billing(i, i + i2, bArr.length);
        this.f31954l = i;
        this.f31955l = i2;
    }

    @Override // defpackage.C15379l, defpackage.AbstractC16071l
    public final void admob(int i, byte[] bArr) {
        System.arraycopy(this.f30044l, this.f31954l, bArr, 0, i);
    }

    @Override // defpackage.C15379l, defpackage.AbstractC16071l
    public final byte amazon(int i) {
        int i2 = this.f31955l;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f30044l[this.f31954l + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0653l.vip(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC12589l.premium(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.C15379l
    public final int firebase() {
        return this.f31954l;
    }

    @Override // defpackage.C15379l, defpackage.AbstractC16071l
    public final int size() {
        return this.f31955l;
    }

    @Override // defpackage.C15379l
    public final byte smaato(int i) {
        return this.f30044l[this.f31954l + i];
    }
}
