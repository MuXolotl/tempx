package defpackage;

/* JADX INFO: renamed from: lٍَٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10198l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final applovin f20786l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cfor f20787l;

    public C10198l(Cclass cclass) {
        if (cclass.size() < 1 || cclass.size() > 2) {
            C8339l.metrica(AbstractC4338l.ad(cclass, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        this.f20787l = Cfor.m192throws(cclass.mo173throws(0));
        if (cclass.size() == 2) {
            this.f20786l = cclass.mo173throws(1);
        } else {
            this.f20786l = null;
        }
    }

    public static C10198l vip(Object obj) {
        if (obj instanceof C10198l) {
            return (C10198l) obj;
        }
        if (obj != null) {
            return new C10198l(Cclass.inmobi(obj));
        }
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(2, 0);
        appmetricaVar.purchase(this.f20787l);
        applovin applovinVar = this.f20786l;
        if (applovinVar != null) {
            appmetricaVar.purchase(applovinVar);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public C10198l(Cfor cfor, applovin applovinVar) {
        this.f20787l = cfor;
        this.f20786l = applovinVar;
    }

    public C10198l(Cfor cfor) {
        this.f20787l = cfor;
    }
}
