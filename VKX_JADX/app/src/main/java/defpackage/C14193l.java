package defpackage;

/* JADX INFO: renamed from: lٌٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14193l extends C1998l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f27785l;

    public C14193l(byte[] bArr) {
        super(bArr);
        C1998l.admob(bArr.length);
        this.f27785l = 47;
    }

    @Override // defpackage.C1998l
    public final byte amazon(int i) {
        int i2 = this.f27785l;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f4518l[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC9361l.Signature(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // defpackage.C1998l
    public final byte billing(int i) {
        return this.f4518l[i];
    }

    @Override // defpackage.C1998l
    public final int mopub() {
        return this.f27785l;
    }
}
