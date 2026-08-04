package defpackage;

/* JADX INFO: renamed from: lٗۙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17364l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C8843l f33831l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C15856l f33832l;

    public static C17364l vip(Object obj) {
        if (obj instanceof C17364l) {
            return (C17364l) obj;
        }
        C15856l c15856l = null;
        if (obj == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(obj);
        C17364l c17364l = new C17364l();
        applovin applovinVarMo173throws = cclassInmobi.mo173throws(0);
        if (applovinVarMo173throws instanceof C15856l) {
            c15856l = (C15856l) applovinVarMo173throws;
        } else if (applovinVarMo173throws != null) {
            inmobi inmobiVarApplovin = inmobi.applovin(applovinVarMo173throws);
            c15856l = new C15856l();
            c15856l.f31115l = inmobiVarApplovin;
        }
        c17364l.f33832l = c15856l;
        if (cclassInmobi.size() == 2) {
            c17364l.f33831l = C8843l.vip(Cclass.appmetrica((Cfinal) cclassInmobi.mo173throws(1), true));
        }
        return c17364l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(this.f33832l);
        C8843l c8843l = this.f33831l;
        if (c8843l != null) {
            appmetricaVar.purchase(new C9320l(true, 0, c8843l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }
}
