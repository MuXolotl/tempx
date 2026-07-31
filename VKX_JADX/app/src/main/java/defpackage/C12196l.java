package defpackage;

/* JADX INFO: renamed from: lِۢٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12196l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f24238l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f24239l;

    public C12196l(byte[] bArr, int i) {
        this.f24239l = AbstractC14024l.crashlytics(bArr);
        this.f24238l = i;
    }

    public static C12196l vip(Object obj) {
        if (obj instanceof C12196l) {
            return (C12196l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C12196l c12196l = new C12196l();
        c12196l.f24239l = Cthrow.premium(cclassInmobi.mo173throws(0)).f36593l;
        c12196l.f24238l = cclassInmobi.size() == 2 ? Cstrictfp.premium(cclassInmobi.mo173throws(1)).m4585strictfp() : 12;
        return c12196l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(new C11327l(this.f24239l));
        int i = this.f24238l;
        if (i != 12) {
            appmetricaVar.purchase(Cstrictfp.m4580private(i));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
