package defpackage;

/* JADX INFO: renamed from: lؚْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7231l extends C14809l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f15063l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f15064l;

    public C7231l(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC15257l.billing(i, i + i2, bArr.length);
        this.f15063l = i;
        this.f15064l = i2;
    }

    @Override // defpackage.C14809l, defpackage.AbstractC15257l
    public final void admob(int i, byte[] bArr) {
        System.arraycopy(this.f28972l, this.f15063l, bArr, 0, i);
    }

    @Override // defpackage.C14809l, defpackage.AbstractC15257l
    public final byte amazon(int i) {
        int i2 = this.f15064l;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f28972l[this.f15063l + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0653l.vip(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC12589l.premium(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.C14809l
    public final byte remoteconfig(int i) {
        return this.f28972l[this.f15063l + i];
    }

    @Override // defpackage.C14809l, defpackage.AbstractC15257l
    public final int size() {
        return this.f15064l;
    }

    @Override // defpackage.C14809l
    public final int smaato() {
        return this.f15063l;
    }
}
