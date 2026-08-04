package defpackage;

/* JADX INFO: renamed from: lؓۦْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2250l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11547l f4937l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1561l f4938l;

    public C2250l(C7951l c7951l, byte[] bArr) {
        super((Object) c7951l, true);
        int iPro = c7951l.yandex.pro();
        int i = iPro * 4;
        if (bArr.length != i) {
            C8339l.metrica("private key encoding does not match parameters");
            throw null;
        }
        int i2 = iPro * 2;
        this.f4937l = new C11547l(AbstractC14024l.vip(0, iPro, bArr), AbstractC14024l.vip(iPro, i2, bArr));
        int i3 = iPro * 3;
        this.f4938l = new C1561l(AbstractC14024l.vip(i2, i3, bArr), AbstractC14024l.vip(i3, i, bArr));
    }
}
