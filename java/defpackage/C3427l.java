package defpackage;

/* JADX INFO: renamed from: lٖؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3427l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f7284l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f7285l;

    public C3427l(C11196l c11196l, byte[] bArr, byte[] bArr2) {
        super((Object) c11196l, false);
        if (bArr == null) {
            C6541l.subs("rho cannot be null");
            throw null;
        }
        if (bArr2 == null) {
            C6541l.subs("t1 cannot be null");
            throw null;
        }
        this.f7284l = AbstractC14024l.crashlytics(bArr);
        this.f7285l = AbstractC14024l.crashlytics(bArr2);
    }

    public C3427l(C11196l c11196l, byte[] bArr) {
        super((Object) c11196l, false);
        this.f7284l = AbstractC14024l.vip(0, 32, bArr);
        byte[] bArrVip = AbstractC14024l.vip(32, bArr.length, bArr);
        this.f7285l = bArrVip;
        if (bArrVip.length != 0) {
            return;
        }
        C8339l.metrica("encoding too short");
        throw null;
    }
}
