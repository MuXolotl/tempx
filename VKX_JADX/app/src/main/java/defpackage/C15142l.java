package defpackage;

/* JADX INFO: renamed from: lٔۙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15142l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f29694l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f29695l;

    public C15142l(Cclass cclass) {
        if (!Cstrictfp.premium(cclass.mo173throws(0)).inmobi(0)) {
            C8339l.metrica("unknown version of sequence");
            throw null;
        }
        this.f29695l = AbstractC14024l.crashlytics(Cthrow.premium(cclass.mo173throws(1)).f36593l);
        this.f29694l = AbstractC14024l.crashlytics(Cthrow.premium(cclass.mo173throws(2)).f36593l);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(Cstrictfp.f36573l);
        appmetricaVar.purchase(new C11327l(this.f29695l));
        appmetricaVar.purchase(new C11327l(this.f29694l));
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C15142l(byte[] bArr, byte[] bArr2) {
        this.f29695l = AbstractC14024l.crashlytics(bArr);
        this.f29694l = AbstractC14024l.crashlytics(bArr2);
    }
}
