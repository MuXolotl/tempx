package defpackage;

/* JADX INFO: renamed from: lٍؙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1671l extends AbstractC13210l implements InterfaceC8635l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C15980l f4032l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f4033l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f4034l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f4035l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1671l(C7502l c7502l) {
        C15980l c15980l = (C15980l) c7502l.f15511l;
        super(c15980l.purchase, false);
        this.f4032l = c15980l;
        int i = c15980l.billing;
        byte[] bArr = (byte[]) c7502l.f15512l;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.f4034l = 0;
                this.f4033l = AbstractC4047l.mopub(0, i, bArr);
                this.f4035l = AbstractC4047l.mopub(i, i, bArr);
                return;
            }
            int i2 = i + 4;
            if (bArr.length != i2 + i) {
                C8339l.metrica("public key has wrong size");
                throw null;
            }
            this.f4034l = AbstractC10000l.yandex(0, bArr);
            this.f4033l = AbstractC4047l.mopub(4, i, bArr);
            this.f4035l = AbstractC4047l.mopub(i2, i, bArr);
            return;
        }
        C11725l c11725l = c15980l.yandex;
        if (c11725l != null) {
            this.f4034l = c11725l.yandex;
        } else {
            this.f4034l = 0;
        }
        byte[] bArr2 = (byte[]) c7502l.f15510l;
        if (bArr2 == null) {
            this.f4033l = new byte[i];
        } else {
            if (bArr2.length != i) {
                C8339l.metrica("length of root must be equal to length of digest");
                throw null;
            }
            this.f4033l = bArr2;
        }
        byte[] bArr3 = (byte[]) c7502l.f15509l;
        if (bArr3 == null) {
            this.f4035l = new byte[i];
        } else if (bArr3.length == i) {
            this.f4035l = bArr3;
        } else {
            C8339l.metrica("length of publicSeed must be equal to length of digest");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        byte[] bArr;
        int i = this.f4032l.billing;
        int i2 = 0;
        int i3 = this.f4034l;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            AbstractC10000l.isPro(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        AbstractC4047l.purchase(bArr, i2, this.f4033l);
        AbstractC4047l.purchase(bArr, i2 + i, this.f4035l);
        return bArr;
    }
}
