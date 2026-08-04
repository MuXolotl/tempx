package defpackage;

/* JADX INFO: renamed from: lؚٝٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7400l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10758l f15330l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10237l f15331l;

    public C7400l(C18535l c18535l, byte[] bArr) {
        super((Object) c18535l, true);
        int iPro = c18535l.crashlytics.pro();
        int i = iPro * 4;
        if (bArr.length != i) {
            C8339l.metrica("private key encoding does not match parameters");
            throw null;
        }
        int i2 = iPro * 2;
        this.f15330l = new C10758l(AbstractC14024l.vip(0, iPro, bArr), AbstractC14024l.vip(iPro, i2, bArr));
        int i3 = iPro * 3;
        this.f15331l = new C10237l(AbstractC14024l.vip(i2, i3, bArr), AbstractC14024l.vip(i3, i, bArr));
    }

    public final byte[] getEncoded() {
        C10758l c10758l = this.f15330l;
        byte[] bArr = c10758l.yandex;
        byte[] bArr2 = c10758l.loadAd;
        C10237l c10237l = this.f15331l;
        return AbstractC14024l.isPro(new byte[][]{bArr, bArr2, c10237l.yandex, c10237l.loadAd});
    }

    public C7400l(C18535l c18535l, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super((Object) c18535l, true);
        this.f15330l = new C10758l(bArr, bArr2);
        this.f15331l = new C10237l(bArr3, bArr4);
    }
}
