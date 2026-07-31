package defpackage;

/* JADX INFO: renamed from: lَٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15819l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C8953l f31068l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cpackage f31069l;

    public static C15819l vip(Cnative cnative) {
        if (cnative instanceof C15819l) {
            return (C15819l) cnative;
        }
        if (cnative == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(cnative);
        C15819l c15819l = new C15819l();
        c15819l.f31069l = Cpackage.inmobi(cclassInmobi.mo173throws(0));
        if (cclassInmobi.size() > 1) {
            c15819l.f31068l = C8953l.vip((inmobi) inmobi.f835l.m222l((Cfinal) cclassInmobi.mo173throws(1), true));
        }
        return c15819l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(this.f31069l);
        C8953l c8953l = this.f31068l;
        if (c8953l != null) {
            appmetricaVar.purchase(new C9320l(true, 0, c8953l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
