package defpackage;

/* JADX INFO: renamed from: lٍٍِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9484l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f19372l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f19373l;

    public C9484l(byte[] bArr, int i) {
        if (bArr.length > 255) {
            C8339l.metrica("RC5 key length can be no greater than 255");
            throw null;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f19373l = bArr2;
        this.f19372l = i;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
