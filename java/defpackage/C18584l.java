package defpackage;

/* JADX INFO: renamed from: lۛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18584l extends Cnative implements premium {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cnative f36281l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f36282l;

    public C18584l(applovin applovinVar) {
        Cnative c7127l = null;
        if ((applovinVar instanceof Cclass) || (applovinVar instanceof C7127l)) {
            this.f36282l = 0;
            if (applovinVar instanceof C7127l) {
                c7127l = (C7127l) applovinVar;
            } else if (applovinVar != null) {
                c7127l = new C7127l(Cclass.inmobi(applovinVar));
            }
            this.f36281l = c7127l;
            return;
        }
        if (!(applovinVar instanceof Cfinal)) {
            C8339l.metrica("Unknown check object in integrity check.");
            throw null;
        }
        this.f36282l = 1;
        Cnative cnativeAppmetrica = ((Cfinal) applovinVar).appmetrica();
        if (cnativeAppmetrica instanceof C12692l) {
            c7127l = (C12692l) cnativeAppmetrica;
        } else if (cnativeAppmetrica != null) {
            c7127l = new C12692l(Cclass.inmobi(cnativeAppmetrica));
        }
        this.f36281l = c7127l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        Cnative cnative = this.f36281l;
        return cnative instanceof C12692l ? new C9320l(true, 0, cnative) : cnative.billing();
    }
}
