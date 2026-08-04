package defpackage;

/* JADX INFO: renamed from: lٌٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8816l implements InterfaceC16922l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f18098l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC17898l f18099l;

    public C8816l(InterfaceC17898l interfaceC17898l, int i) {
        this.f18099l = interfaceC17898l;
        this.f18098l = i;
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        InterfaceC17898l interfaceC17898l = this.f18099l;
        byte[] bArr2 = new byte[interfaceC17898l.getDigestSize()];
        interfaceC17898l.doFinal(bArr2, 0);
        int i2 = this.f18098l;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return this.f18099l.getAlgorithmName() + "/" + (this.f18098l * 8);
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f18098l;
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f18099l.reset();
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        this.f18099l.update(b);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        this.f18099l.update(bArr, i, i2);
    }
}
