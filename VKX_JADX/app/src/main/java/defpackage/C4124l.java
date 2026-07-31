package defpackage;

/* JADX INFO: renamed from: lؖٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4124l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f8488l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f8489l;

    public C4124l(C13812l c13812l, byte[] bArr, byte[] bArr2) {
        super((Object) c13812l, false);
        if (bArr == null) {
            C6541l.subs("rho cannot be null");
            throw null;
        }
        if (bArr2 == null) {
            C6541l.subs("t1 cannot be null");
            throw null;
        }
        this.f8488l = AbstractC14024l.crashlytics(bArr);
        this.f8489l = AbstractC14024l.crashlytics(bArr2);
    }

    public final byte[] getEncoded() {
        return AbstractC14024l.mopub(this.f8488l, this.f8489l);
    }

    public C4124l(C13812l c13812l, byte[] bArr) {
        super((Object) c13812l, false);
        this.f8488l = AbstractC14024l.vip(0, 32, bArr);
        byte[] bArrVip = AbstractC14024l.vip(32, bArr.length, bArr);
        this.f8489l = bArrVip;
        if (bArrVip.length != 0) {
            return;
        }
        C8339l.metrica("encoding too short");
        throw null;
    }
}
