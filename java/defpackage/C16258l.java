package defpackage;

/* JADX INFO: renamed from: lًَٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16258l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cinterface f31821l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cnative f31822l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cfor f31823l;

    public C16258l(Cfor cfor, C11138l c11138l, C2930l c2930l) {
        this.f31823l = cfor;
        this.f31822l = c11138l;
        this.f31821l = c2930l;
    }

    public static C16258l vip(applovin applovinVar) {
        if (applovinVar instanceof C16258l) {
            return (C16258l) applovinVar;
        }
        if (applovinVar == null) {
            return null;
        }
        Cclass cclassInmobi = Cclass.inmobi(applovinVar);
        C16258l c16258l = new C16258l();
        c16258l.f31823l = (Cfor) cclassInmobi.mo173throws(0);
        c16258l.f31822l = ((Cfinal) cclassInmobi.mo173throws(1)).appmetrica();
        if (cclassInmobi.size() == 3) {
            c16258l.f31821l = (Cinterface) cclassInmobi.mo173throws(2);
        }
        return c16258l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        appmetricaVar.purchase(this.f31823l);
        appmetricaVar.purchase(new C7332l(true, 0, this.f31822l));
        Cinterface cinterface = this.f31821l;
        if (cinterface != null) {
            appmetricaVar.purchase(cinterface);
        }
        C3884l c3884l = new C3884l(appmetricaVar);
        c3884l.f8024l = -1;
        return c3884l;
    }
}
