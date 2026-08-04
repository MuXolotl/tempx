package defpackage;

/* JADX INFO: renamed from: lٍؙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6355l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f13318l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f13319l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f13320l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C14178l f13321l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f13322l;

    public static C6355l vip(Ccase ccase) {
        C14178l c14178l = null;
        if (ccase != null) {
            Cclass cclassInmobi = Cclass.inmobi(ccase);
            C6355l c6355l = new C6355l();
            int iM4585strictfp = Cstrictfp.premium(cclassInmobi.mo173throws(0)).m4585strictfp();
            c6355l.f13320l = iM4585strictfp;
            if (iM4585strictfp == 0) {
                c6355l.f13319l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
                c6355l.f13318l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(2)).f36593l);
                c6355l.f13322l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(3)).f36593l);
                if (cclassInmobi.size() == 5) {
                    applovin applovinVarMo173throws = cclassInmobi.mo173throws(4);
                    if (applovinVarMo173throws instanceof C14178l) {
                        c14178l = (C14178l) applovinVarMo173throws;
                    } else if (applovinVarMo173throws != null) {
                        Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                        c14178l = new C14178l();
                        c14178l.f27763l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi2.mo173throws(0)).f36593l);
                    }
                    c6355l.f13321l = c14178l;
                }
                return c6355l;
            }
            C8339l.metrica("unrecognized version");
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        appmetricaVar.purchase(Cstrictfp.m4580private(this.f13320l));
        appmetricaVar.purchase(new C11327l(this.f13319l));
        appmetricaVar.purchase(new C11327l(this.f13318l));
        appmetricaVar.purchase(new C11327l(this.f13322l));
        C14178l c14178l = this.f13321l;
        if (c14178l != null) {
            appmetricaVar.purchase(new C14178l(c14178l.f27763l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
