package defpackage;

/* JADX INFO: renamed from: lْٕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15654l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f30601l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15654l(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length == 32) {
        } else {
            C8339l.metrica("'buf' must have length 32");
            throw null;
        }
    }

    public C15654l(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f30601l = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }
}
