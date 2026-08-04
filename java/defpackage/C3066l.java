package defpackage;

/* JADX INFO: renamed from: lِؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3066l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6595l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f6596l;

    public C3066l(byte[] bArr, int i) {
        this.f6596l = AbstractC14024l.crashlytics(bArr);
        this.f6595l = i;
    }

    public static C3066l vip(Object obj) {
        if (obj instanceof C3066l) {
            return (C3066l) obj;
        }
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C3066l c3066l = new C3066l();
        c3066l.f6596l = Cthrow.premium(cclassInmobi.mo173throws(0)).f36593l;
        c3066l.f6595l = cclassInmobi.size() == 2 ? Cstrictfp.premium(cclassInmobi.mo173throws(1)).m4585strictfp() : 12;
        return c3066l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(new C11327l(this.f6596l));
        int i = this.f6595l;
        if (i != 12) {
            appmetricaVar.purchase(Cstrictfp.m4580private(i));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
