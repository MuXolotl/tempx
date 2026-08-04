package defpackage;

/* JADX INFO: renamed from: lؖۤٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4492l extends AbstractC13210l implements InterfaceC8635l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C15509l f9131l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f9132l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f9133l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f9134l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4492l(C1381l c1381l) {
        C15509l c15509l = (C15509l) c1381l.f3513l;
        C15980l c15980l = c15509l.loadAd;
        super(c15980l.purchase, false);
        this.f9131l = c15509l;
        int i = c15980l.billing;
        byte[] bArr = (byte[]) c1381l.f3514l;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.f9133l = 0;
                this.f9132l = AbstractC4047l.mopub(0, i, bArr);
                this.f9134l = AbstractC4047l.mopub(i, i, bArr);
                return;
            }
            int i2 = i + 4;
            if (bArr.length != i2 + i) {
                C8339l.metrica("public key has wrong size");
                throw null;
            }
            this.f9133l = AbstractC10000l.yandex(0, bArr);
            this.f9132l = AbstractC4047l.mopub(4, i, bArr);
            this.f9134l = AbstractC4047l.mopub(i2, i, bArr);
            return;
        }
        C15205l c15205l = c15509l.yandex;
        if (c15205l != null) {
            this.f9133l = c15205l.yandex;
        } else {
            this.f9133l = 0;
        }
        byte[] bArr2 = (byte[]) c1381l.f3512l;
        if (bArr2 == null) {
            this.f9132l = new byte[i];
        } else {
            if (bArr2.length != i) {
                C8339l.metrica("length of root must be equal to length of digest");
                throw null;
            }
            this.f9132l = bArr2;
        }
        byte[] bArr3 = (byte[]) c1381l.f3511l;
        if (bArr3 == null) {
            this.f9134l = new byte[i];
        } else if (bArr3.length == i) {
            this.f9134l = bArr3;
        } else {
            C8339l.metrica("length of publicSeed must be equal to length of digest");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        return yandex();
    }

    public final byte[] yandex() {
        byte[] bArr;
        int i = this.f9131l.loadAd.billing;
        int i2 = 0;
        int i3 = this.f9133l;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            AbstractC10000l.isPro(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        AbstractC4047l.purchase(bArr, i2, this.f9132l);
        AbstractC4047l.purchase(bArr, i2 + i, this.f9134l);
        return bArr;
    }
}
