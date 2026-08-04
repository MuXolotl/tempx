package defpackage;

/* JADX INFO: renamed from: lٔؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14685l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f28737l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14685l(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length == 56) {
        } else {
            C8339l.metrica("'buf' must have length 56");
            throw null;
        }
    }

    public C14685l(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.f28737l = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 56);
    }
}
