package defpackage;

/* JADX INFO: renamed from: lٌؙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8621l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cthrow f17769l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10198l f17770l;

    public C8621l(Cclass cclass) {
        this.f17770l = C10198l.vip(cclass.mo173throws(0));
        this.f17769l = Cthrow.premium(cclass.mo173throws(1));
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f17770l, this.f17769l);
    }

    public C8621l(C10198l c10198l, byte[] bArr) {
        this.f17770l = c10198l;
        this.f17769l = new C11327l(AbstractC14024l.crashlytics(bArr));
    }
}
