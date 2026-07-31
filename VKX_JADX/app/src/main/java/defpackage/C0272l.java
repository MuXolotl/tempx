package defpackage;

/* JADX INFO: renamed from: lٍّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0272l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC9719l f1272l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f1273l;

    public C0272l(InterfaceC9719l interfaceC9719l, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f1273l = bArr2;
        this.f1272l = interfaceC9719l;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public C0272l(InterfaceC9719l interfaceC9719l, byte[] bArr) {
        this(interfaceC9719l, bArr, 0, bArr.length);
    }
}
