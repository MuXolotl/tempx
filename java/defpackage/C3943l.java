package defpackage;

/* JADX INFO: renamed from: lؘٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3943l extends C1700l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f8121l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f8122l;

    public C3943l(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC1096l.ad(i, i + i2, bArr.length);
        this.f8122l = i;
        this.f8121l = i2;
    }

    @Override // defpackage.C1700l, defpackage.AbstractC1096l
    public final int admob() {
        return this.f8121l;
    }

    @Override // defpackage.C1700l, defpackage.AbstractC1096l
    public final byte amazon(int i) {
        AbstractC1096l.premium(i, this.f8121l);
        return this.f4089l[this.f8122l + i];
    }

    @Override // defpackage.C1700l
    public final int applovin() {
        return this.f8122l;
    }

    @Override // defpackage.C1700l, defpackage.AbstractC1096l
    public final byte billing(int i) {
        return this.f4089l[this.f8122l + i];
    }

    @Override // defpackage.C1700l, defpackage.AbstractC1096l
    public final void firebase(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f4089l, this.f8122l + i, bArr, i2, i3);
    }
}
