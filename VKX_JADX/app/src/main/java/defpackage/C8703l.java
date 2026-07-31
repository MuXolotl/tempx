package defpackage;

/* JADX INFO: renamed from: lٌُٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8703l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1561l f17904l;

    public C8703l(C7951l c7951l, byte[] bArr) {
        super((Object) c7951l, false);
        int iPro = c7951l.yandex.pro();
        int i = iPro * 2;
        if (bArr.length == i) {
            this.f17904l = new C1561l(AbstractC14024l.vip(0, iPro, bArr), AbstractC14024l.vip(iPro, i, bArr));
        } else {
            C8339l.metrica("public key encoding does not match parameters");
            throw null;
        }
    }
}
